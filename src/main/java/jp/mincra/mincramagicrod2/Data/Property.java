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
}