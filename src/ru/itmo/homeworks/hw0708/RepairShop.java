package ru.itmo.homeworks.hw0708;


public class RepairShop {

    private Transport[] transports = new Transport[10];
    private String[] colours = new String[100];

    private int i = 0; //счетчик транспорта

    public void addTransport(Transport transport){
        if (i < transports.length) {
            transports[i] = transport;
            i++;
        } else {
            System.out.println("В массиве нет места");
        }
    }

    private String randomColor(){
        int n = (int)Math. floor(Math. random() * colours. length);
        return colours[n];
    }

    public void repair(){
        for (Transport t: transports) {
                t.repair();
            if (t instanceof Car)  {
                String random = randomColor();
                t.setColor(random);
            }
        }
    }
}
