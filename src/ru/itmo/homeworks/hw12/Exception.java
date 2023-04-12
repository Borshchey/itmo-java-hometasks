package ru.itmo.homeworks.hw12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

public class Exception {
    private Status status;


    public static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status == Status.FILE_NOT_FOUND) {
            throw new FileNotFoundException();
        }
        if (status == Status.ACCESS_DENIED) {
            throw new AccessDeniedException("AccessDeniedException: ");
        }
        if (status == Status.ACCESS_DENIED) {
            throw new JarException();
        }



    }
}
