import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class cgpa_calculator {
    public static void main(String[] args) throws InterruptedException {
        Scanner inp=new Scanner(System.in);
        System.out.println("enter subject 1 name: ");
        String sub1name=inp.nextLine();
        System.out.println("enter your marks on Subject");
        Integer sub1marks=inp.nextInt();
        TimeUnit.SECONDS.sleep(1);

        System.out.println("enter your marks on Subject2");
        TimeUnit.SECONDS.sleep(1);
        Integer sub2marks=inp.nextInt();
        System.out.println("enter your marks on Subject3");
        TimeUnit.SECONDS.sleep(1);
        Integer sub3marks=inp.nextInt();
        int total=sub1marks+sub2marks+sub3marks;
        float average=total/3F;
        System.out.println("The average of all of your subjects is "+average);

    }
}
