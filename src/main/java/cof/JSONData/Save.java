package cof.JSONData;

import cof.survivor.Survivor;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Save {

    public static void saveJSONData() throws IOException {
        File f = new File("plugins/Survivor/database/data.json");
        if (f.exists())
            f.delete();
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("plugins/Survivor/database/data.json"), StandardCharsets.UTF_8))) {
            writer.write(String.valueOf(Survivor.gameData));
        }
    }

}
