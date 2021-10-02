package numberoftest;

public class FindPhoneNumber {
    public static void main(String[]args){
        numberFormat(8324567893l);
    }
    public static void numberFormat(long phone){
        String phoneNumber =String.valueOf(phone);
        if(phoneNumber.length()==10){
            System.out.println(phoneNumber.substring(0,3)+" -"+phoneNumber.substring(3,6)+"- "+phoneNumber.substring(6));
            System.out.print("thank you!\n this is my favority phoneNumber.");
        }
        else{
            System.out.println("please use the correct phoneNumber.");
            System.out.println("I am sorry for that!");
        }
    }
}
