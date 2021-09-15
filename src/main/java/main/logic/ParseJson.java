package main.logic;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ParseJson {

    public static void get(String urlString) {
        URL url = null;
        try {
            url = new URL(urlString);
            URLConnection conn = url.openConnection();
            InputStream is = conn.getInputStream();

            File file = new File("src/main/java/main/weatherJson.json");
            file.getParentFile().mkdirs();

            PrintWriter printWriter = new PrintWriter(file);
            Scanner scanner = new Scanner(is);

            while (scanner.hasNextLine()) {

                printWriter.print(scanner.nextLine());

            }

            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
