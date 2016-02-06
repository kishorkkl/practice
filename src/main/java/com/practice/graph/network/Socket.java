package com.practice.graph.network;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sandeep on 30/01/2016.
 */
public class Socket
{

    public static void main(String[] args)
    {
        /*try {
            Daytime dt = new Daytime();
//            System.out.println(dt.getDateFromNetwork());
        }catch(IOException|ParseException e)
        {
            e.printStackTrace();
        }*/
    }
}


class Daytime {
    /*public Date getDateFromNetwork() throws IOException, ParseException {
        try (Socket socket = new Socket("time.nist.gov", 13)) {
            socket.setSoTimeout(15000);
            InputStream in = socket.getInputStream();
            StringBuilder time = new StringBuilder();

            InputStreamReader reader = new InputStreamReader(in, "ASCII");
            for (int c = reader.read(); c != -1; c = reader.read()) {
                time.append((char) c);
            }
            return parseDate(time.toString());
        }
    }*/
    Date parseDate(String s) throws ParseException {
        String[] pieces = s.split(" ");
        String dateTime = pieces[1] + " " + pieces[2] + " UTC";
        DateFormat format = new SimpleDateFormat("yy-MM-dd hh:mm:ss z");
        return format.parse(dateTime);
    }
}