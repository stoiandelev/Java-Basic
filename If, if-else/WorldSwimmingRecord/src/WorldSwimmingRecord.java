import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double recordSeconds=Double.parseDouble(scanner.nextLine());
        double meters=Double.parseDouble(scanner.nextLine());
        double timeForoneMeter=Double.parseDouble(scanner.nextLine());

        double totalSeconds=meters*timeForoneMeter;
        double timePlus=Math.floor(meters/15)*12.5;

        double totalTimewithDelay=timePlus+totalSeconds;
        double timeForwinWorldrecord=totalTimewithDelay-recordSeconds;

        if(recordSeconds<=totalTimewithDelay) {
            System.out.printf("No, he failed! He was " + "%.2f",timeForwinWorldrecord);
            System.out.print(" seconds slower.");
        }
        if (recordSeconds > totalTimewithDelay) {
            System.out.printf("Yes, he succeeded! The new world record is " + "%.2f",totalTimewithDelay);
            System.out.print(" seconds.");
        }






    }
}
