package ru.netology.graphics;

import ru.netology.graphics.image.*;
import ru.netology.graphics.image.interfaces.TextGraphicsConverter;
import ru.netology.graphics.server.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImp(); // Создайте тут объект вашего класса конвертера
        char[] symbols = {'#', '$', '@', '%', '*', '+', '-'};
        TextColorSchemaImp schema = new TextColorSchemaImp(symbols);
        converter.setTextColorSchema(schema);

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        //TODO второй варивант - ручной запуск

//        //  Или то же, но с выводом на экран:
//        // String url = "https://ibb.co/Lh9BSqY"; // не работает
//        String url = "https://i.ibb.co/6DYM05G/edu0.jpg";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}