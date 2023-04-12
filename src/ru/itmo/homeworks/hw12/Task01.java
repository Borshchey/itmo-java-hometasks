package ru.itmo.homeworks.hw12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Task01 {


    public static void main(String[] args) {


        try {
            Exception.throwException(Status.FILE_NOT_FOUND);
        } catch (JarException | FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (AccessDeniedException exception){
            System.out.println(exception.getMessage());
            throw new RuntimeException();
        }

    }

}
