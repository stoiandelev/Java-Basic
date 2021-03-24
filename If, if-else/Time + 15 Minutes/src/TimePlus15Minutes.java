import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        int minute1 = minute + 15;

        if (minute1 >= 60) {
            minute1 = minute1 - 60;
            hour = hour + 1;
        }

        if(hour>23){
            hour=hour-24;
        }

        if(minute1<10){
            System.out.println(hour+":"+"0"+minute1);
        }else{
            System.out.println(hour + ":" + minute1);
        }




    }
}


