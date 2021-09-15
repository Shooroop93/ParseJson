package main.logic;

import com.google.gson.Gson;
import main.classes.Root;

import java.io.FileReader;
import java.io.IOException;

public class GsonParse {

    public Root parse() {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader("src/main/java/main/weatherJson.json")) {

            Root root = gson.fromJson(reader, Root.class);

            return root;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
