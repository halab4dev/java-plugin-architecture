package com.github.halab4dev;


import com.github.halab4dev.plugin.PluginManager;
import com.github.halab4dev.plugin.Language;

public class App {

    public static final String DEFAULT_LANGUAGE_PLUGIN_FILE_PATH = "java-plugin-english/target/java-plugin-english-1.0-SNAPSHOT.jar";
    public static final String JAPANESE_LANGUAGE_PLUGIN_FILE_PATH = "java-plugin-japanese/target/java-plugin-japanese-1.0-SNAPSHOT.jar";

    public static void main(String[] args) {
        PluginManager.loadPlugin(DEFAULT_LANGUAGE_PLUGIN_FILE_PATH);
        sayHello("halab");

        PluginManager.loadPlugin(JAPANESE_LANGUAGE_PLUGIN_FILE_PATH);
        sayHello("halab");
    }

    private static void sayHello(String name) {
        System.out.println(PluginManager.get(Language.class).sayHello(name));
    }
}
