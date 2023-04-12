package ru.itmo.projects.project01;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

abstract public class Subscription {
    protected int number;
    protected LocalDate registrationDate = LocalDate.now();;
    protected String expirationDate;
    protected Person person;

    protected boolean swimmingPool = true;
    protected boolean gym = true;
    protected boolean groupClasses = true;
    protected final String acceptedTimePeriodStart = "08:00:00";
    protected String acceptedTimePeriodEnd = "22:00:00";
}
