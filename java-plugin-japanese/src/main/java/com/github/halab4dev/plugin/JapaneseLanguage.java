package com.github.halab4dev.plugin;

/*
 *
 * @author halab
 */
public class JapaneseLanguage implements Language {

    @Override
    public String name() {
        return "Japanese";
    }

    @Override
    public String sayHello(String name) {
        return "Konichiwa, " + name;
    }
}
