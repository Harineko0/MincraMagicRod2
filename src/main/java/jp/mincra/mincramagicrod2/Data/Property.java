package jp.mincra.mincramagicrod2.Data;


import java.io.*;
import java.util.Properties;

public class Property {
    public static String[] main(String[] args) throws IOException {

        // Properties読み込み
        Properties properties = new Properties();

        //カレントディレクトリ取得+\config.properties
        String path = new File(".").getAbsoluteFile().getParent()+"\\plugins\\MincraMagicRod2\\config.properties";
        InputStream stream = new FileInputStream(path);
        properties.load(stream);

        //返り値作成
        int length = args.length;
        String[] value = new String[length];
        for (int i = 0; i < length; i++){
            value[i] = properties.getProperty(args[i]);
        }

        return value;
    }

    public static void make() throws IOException {
        File dir = new File(".\\plugins\\MincraMagicRod2");
        File file = new File(".\\plugins\\MincraMagicRod2\\config.properties");

        if (dir.exists()){
        } else {
            dir.mkdir();
        }

        if (file.exists()){
        } else {
            FileWriter fileWriter = new FileWriter(file);

            file.createNewFile();
            fileWriter.write("prefix=MincraMagicRod2\ntest=ABC");
            fileWriter.close();
        }
    }
}