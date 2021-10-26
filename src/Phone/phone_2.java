package Phone;

public class phone_2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("4334343" ,"iphone" , 121);
        Phone phone2 = new Phone("44343343", "samsung", 142);
        Phone phone3 = new Phone("4334343", "siemens", 131);

        System.out.println(phone1.number);
        System.out.println(phone1.model);
        System.out.println(phone1.weight);



        System.out.println(phone2.number);
        System.out.println(phone2.model);
        System.out.println(phone2.weight);



        System.out.println(phone3.number);
        System.out.println(phone3.model);
        System.out.println(phone3.weight);


        phone1.receiveCall("Друг1");
        phone2.receiveCall("Друг2");
        phone2.receiveCall("Дружище ", "32332523");


    }
}
