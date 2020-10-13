package jp.mincra.mincramagicrod2.Sys;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.ResourceBundle;

public class Property {

//    ResourceBundle bundle = ResourceBundle.getBundle("MincraMagicRod2.config");
    private static final String INIT_FILE_PATH = "MincraMagicRod2/config.properties";
    private static final Properties properties;

    private Property() throws Exception {
    }

    static {
        properties = new Properties();
        try {
            properties.load(Files.newBufferedReader(Paths.get(INIT_FILE_PATH), StandardCharsets.UTF_8));
        } catch (IOException e) {
            System.out.println(String.format("ファイルの読み込みに失敗しました。ファイル名:%s", INIT_FILE_PATH));
        }
    }

    //プロパティを取得
    //@param key キー
    //@return 値
    public static String getProperty(final String key){
        return getProperty(key,"");
    }

    //上のgetPropertyから下のgetPropertyを呼び出す

    public static String getProperty(final String key, final String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}
