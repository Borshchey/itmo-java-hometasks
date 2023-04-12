package ru.itmo.projects.project01;

public class DaySubscription extends Subscription{

    private boolean swimmingPool = false;
    private String acceptedTimePeriodEnd = "16:00:00";


    public DaySubscription(String expirationDate){
        this.expirationDate = expirationDate;
    }
}
