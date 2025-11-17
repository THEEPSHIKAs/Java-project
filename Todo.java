import java.util.*;

public class Todo
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("1-Add  2-View  3-Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter task: ");
                list.add(sc.nextLine());
            } else if (ch == 2) {
                System.out.println("Your Tasks:");
                for (int i = 0; i < list.size(); i++)
                    System.out.println((i + 1) + ". " + list.get(i));
            } else
                break;
        }
    }
}
