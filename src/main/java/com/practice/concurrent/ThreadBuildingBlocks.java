package com.practice.concurrent;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by sandeep on 06/02/2016.
 */



public class ThreadBuildingBlocks {


}


class FileCrawler implements Runnable
{
    private final BlockingQueue<File> fileQueue;
    private final FileFilter fileFilter;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, FileFilter fileFilter, File root) {
        this.fileQueue = fileQueue;
        this.fileFilter = fileFilter;
        this.root = root;
    }

    public void run()
    {
        try
        {
            crawl(root);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private void crawl(File root) throws InterruptedException
    {
        File[] entries = root.listFiles(fileFilter);

        if(entries != null)
        {
            for(File entry:entries)
            {
                if(entry.isDirectory())
                    crawl(entry);
                else if(!alreadyIndexed(entry))
                    fileQueue.put(entry);
            }

        }
    }

    private boolean alreadyIndexed(File entry)
    {
        return fileQueue.contains(entry);
    }

}

class Indexer implements Runnable{
    private final BlockingQueue<File> queue;
    private static final int N_CONSUMERS=10;
    private static final int BOUND=1;

    public Indexer(BlockingQueue<File> queue){
        this .queue=queue;
    }
    public void run(){
        try
        {
            while(true)
            {
                indexFile(queue.take());
            }
        }catch(InterruptedException e)
        {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    private void indexFile(File file)
    {
        //TODO
    }

    public static void startIndexing(File[] roots){
        BlockingQueue<File> queue = new LinkedBlockingQueue<File>(BOUND);

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        };

        for(File root:roots)
        {
            new Thread(new FileCrawler(queue,filter,root)).start();
        }

        for(int i=0;i<N_CONSUMERS;i++)
        {
            new Thread(new Indexer(queue)).start();
        }
    }
}