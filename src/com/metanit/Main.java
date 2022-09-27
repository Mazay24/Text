package com.metanit;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try {
           Scanner in = new Scanner(System.in);
           String line;
           String readText = "";
           System.out.print("Введите путь к файлу: ");
           String place = in.nextLine();

           BufferedReader docx = new BufferedReader(new InputStreamReader(new FileInputStream(place)));
           while ((line = docx.readLine()) != null) {
               readText += line;
           }
           String symbols = "Всего символов в тексте " + readText.length();
           String space = "Всего символов в тексте без пробелов " + readText.replaceAll(" ", "").length();
           String words = "Всего слов в тексте " + readText.split(" ").length;
           System.out.println(symbols);
           System.out.println(space);
           System.out.println(words);
           FileWriter fileWriter = new FileWriter("Safe.txt");
           fileWriter.write(symbols + "\n");
           fileWriter.write(space + "\n");
           fileWriter.write(words + "\n");
           fileWriter.flush();
           fileWriter.close();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }}