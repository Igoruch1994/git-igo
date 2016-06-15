package Biluch.lab3;

import lab3.Official;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Igoruch on 24.03.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Frame> frames = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть ім*я кадру");
        String name = reader.readLine();
        char[] chur = name.toCharArray();
        System.out.println("Введіть номер підрозділу кадру");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Введіть розряд кадру");
        int lev = Integer.parseInt(reader.readLine());
        Frame frame = new Frame(lev, number, chur);
        frames.add(frame);
        System.out.println("Кадр занесений у базу даних!");
        System.out.println("Ім*я: " + name + " | Номер_підрозділу: " + number + " | Розряд:" + lev);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Звільнити кадра?(Y/N)");
        String perevirka = reader.readLine();
        if (perevirka.equals("Y")) {
            for (   int i = 0; i < 7; i++) {
                System.out.print(".");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            frames.remove(frames.size() - 1);
            System.out.println("\nУспішно звільнено!!!");
        }
        else {
            System.out.println("Удачі!");
        }
        }
    }
