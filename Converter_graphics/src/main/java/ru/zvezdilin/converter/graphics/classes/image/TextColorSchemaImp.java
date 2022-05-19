package ru.zvezdilin.converter.graphics.classes.image;

import ru.zvezdilin.converter.graphics.classes.image.interfaces.TextColorSchema;

public class TextColorSchemaImp implements TextColorSchema {
    char[] symbols = {'#', '$', '@', '%', '*', '+', '-'};

    public TextColorSchemaImp() {

    }

    public TextColorSchemaImp(char[] symbols) {
        this.symbols = symbols;
    }

    @Override
    public char convert(int color) {
        return symbols[(int) Math.floor(color / 256. * symbols.length)]; //Math.floor округление
    }
}