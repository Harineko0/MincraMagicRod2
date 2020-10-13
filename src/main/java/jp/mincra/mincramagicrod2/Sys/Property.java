package jp.mincra.mincramagicrod2.Sys;


import java.io.*;
import java.util.Properties;

public class Property {
    public static void main(String[] args) throws IOException {
        // Properties読み込み
        Properties properties = new Properties();

        //カレントディレクトリ取得+/config.properties
        String path = new File(".").getAbsoluteFile().getParent()+"\\config.properties";
        InputStream stream = new FileInputStream(path);
        properties.load(stream);
        String value = properties.getProperty("prefix");

        System.out.println(value);
    }
}