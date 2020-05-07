package com.svoemesto.howtojava.strings;

public class Strings {
    public static void main(String[] args) {

        // String <-> bytes[]
        byte[] bytes = convertStringToByteArray("Это массив из байт");
        System.out.println(convertByteArrayToString(bytes));

        // String <-> chars[]
        char[] chars = convertStringToCharArray("Это массив из чаров");
        System.out.println(convertCharArrayToString(chars));

        System.out.println(convertStringToInteger("1245"));



    }

    // TODO Как получить Integer из строки
    public static int convertStringToInteger(String str) {
        return Integer.parseInt(str);
    }

    // TODO Как получить строку из массива байт
    public static String convertByteArrayToString(byte[] bytes) {
        return new String(bytes);
    }

    // TODO Как получить массив байт из строки
    public static byte[] convertStringToByteArray(String str) {
        return str.getBytes();
    }

    // TODO Как получить строку из массива чаров
    public static String convertCharArrayToString(char[] chars) {
        return new String(chars);
    }

    // TODO Как получить массив чаров из строки
    public static char[] convertStringToCharArray(String str) {
        return str.toCharArray();
    }

}
