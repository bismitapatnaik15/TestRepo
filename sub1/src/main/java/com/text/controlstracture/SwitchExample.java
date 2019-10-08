package com.text.controlstracture;

public class SwitchExample {
    public String whatdayistoday(int day) {
        String msg = " invalid entry";

        switch (day) {
            case 1:
                msg = "monday";
                break;
            case 2:
                msg = "Tuesday";
                break;
            case 3:
                msg = "Wedenesday";
                break;

            default:
                msg = "invalid";
                break;


        }
        return msg;
    }

    public static void main(String[] args)
    {
        SwitchExample obj1=new SwitchExample();

        String x = obj1.whatdayistoday(1);
        System.out.println(x);

        x = obj1.whatdayistoday(0);
        System.out.println(x);


        x = obj1.whatdayistoday(2);
        System.out.println(x);


       // int day;
        //System.out.println(2);
    }
}





