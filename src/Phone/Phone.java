package Phone;

public class Phone {
    String  number;
    String model;
    double weight;

    Phone(String n, String m, double w){
        String number = n;
        String model = m;
        double weight = w;

    }

    void  receiveCall(String name   ){

        System.out.println("Звонит " + name);
    }
    void  receiveCall(String name, String number   ){

        System.out.println("Звонит " + name + "номер "+ number);
    }
    String getNumber(){

        return number;
    }
}

