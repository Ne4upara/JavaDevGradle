package goit.sergey;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Sergey", "Tomachenko");

        Gson g = new Gson();
        System.out.println(g.toJson(fullName));


    }
}