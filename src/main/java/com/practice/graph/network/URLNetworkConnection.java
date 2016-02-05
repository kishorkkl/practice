package com.practice.graph.network;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by sandeep on 31/01/2016.
 */
public class URLNetworkConnection {
    public static void main(String[] args)
    {
        try {
            URL myURL = new URL("http://webrates.truefx.com/rates/connect.html?c=EUR/USD&f=html");
            StringBuffer strBuf = new StringBuffer();

            try(InputStream response = myURL.openConnection().getInputStream()) {
                InputStreamReader reader = new InputStreamReader(new BufferedInputStream(response));
                int inChar;
                while ((inChar=reader.read())!=-1) {
                    strBuf.append((char)inChar);
                }
            }

            String[] resultFormat = strBuf.toString().replace("</tr>","<td>").replace("</td>","<tr>").split("<tr><td>");

            for (int i=0;i<resultFormat.length;i++)
            {
                System.out.println("Response is ->" + resultFormat[i]+"\n");
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
