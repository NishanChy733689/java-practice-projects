import java.util.Scanner;
public class taking_input {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter some text");
        String text=inp.nextLine();
        System.out.println("You wrote :\n"+text);
    }
}
