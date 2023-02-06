package com.seroja.persistence;

import com.seroja.broadcast.Broadcast;

import java.io.*;

public class File {

    public void WriteToFile(Broadcast broadcast) {
        try (FileOutputStream fos = new FileOutputStream("Broadcasts.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(broadcast);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void ReadFromFile(Broadcast broadcast) {
        try (FileInputStream fis = new FileInputStream("Broadcasts.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            broadcast = (Broadcast) ois.readObject();

            System.out.println(broadcast);

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
