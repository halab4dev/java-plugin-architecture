package com.github.halab4dev.plugin;

/*
 *
 * @author halab
 */
public class EnglishLanguage implements Language {

    @Override
    public String name() {
        return "English";
    }

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
