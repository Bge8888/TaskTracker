import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        int idIncrease = 1;
        while(true) {

            System.out.println("=== TASK TRACKER ===");
            System.out.println("1. Add task");
            System.out.println("2. List tasks");
            System.out.println("3. Update task");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");

            choice = Integer.valueOf(scan.nextLine());
            System.out.println("You chose: " + choice);
            System.out.println(" ");
            if (choice == 4){
                break;
            }
            if (choice == 1){
                System.out.println("What should we name the task?");
                String taskName = scan.nextLine();
                tasks.add(new Task(idIncrease, taskName, "Ongoing"));
                System.out.println("Task " + taskName + " created successfully!");
                System.out.println(" ");
                idIncrease++;
            }
            if (choice == 2){
                System.out.println("=== TASK LIST ===");
                for (Task t : tasks){

                    System.out.println(t.getId() + ".  |  " + t.getName() + "   |   Status: " + t.getStatus());
                }
            }


            if (choice == 3){
                System.out.println("What task do you want to change?");;
                System.out.println();
                for (Task t : tasks){

                    System.out.println(t.getId() + ".  |  " + t.getName() + "   |   Status: " + t.getStatus());
                }
                int choiceTwo = Integer.valueOf(scan.nextLine());

                System.out.println("What's the task status now?");
                System.out.println("1. Ongoing");
                System.out.println("2. Finished");


                int setStatus = Integer.valueOf(scan.nextLine());
                    for (Task y : tasks){
                        if (y.getId() == choiceTwo){
                            if (setStatus == 1){
                                y.setStatus("Ongoing");
                            }else{
                                y.setStatus("Finished");
                            }
                        }
                    }
                System.out.println("Status changed successfully!");



            }








        }
        scan.close();
    }
}