package ru.itmo.projects.project01;

import java.sql.Time;
import java.time.LocalDate;

public class DisposableSubscription extends Subscription{
    private final boolean groupClasses = false;


    public DisposableSubscription(){
        this.expirationDate = String.valueOf(registrationDate.plusDays(1));
    }

}
