package cof.JSONData;

import cof.survivor.Survivor;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Load {

    public static void loadJSONData() throws IOException {
        File f = new File("plugins/Survivor/database/data.json");
        if (!f.exists())
            f.createNewFile();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String text = br.readLine();
        if (text == null) return;
        Survivor.gameData = new JSONObject(text);

    }

}
