import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = s.nextLine();
        Scanner sc = new Scanner(System.in);
        Questions newQ = new Questions();

        Monsters elephants = new Monsters("Elephant", "Mammal");
        Monsters turtles = new Monsters("Turtle", "reptile");
        Monsters dog = new Monsters("Dog", "Canine");
        Monsters tigers = new Monsters("Tigers", "Cat");
        ArrayList<Monsters> total = new ArrayList<Monsters>();
        total.add(elephants);
        total.add(turtles);
        total.add(dog);
        total.add(tigers);


        Player p1 = new Player(name);

        System.out.println("Hello " + p1.getName() + "! Welcome to Trivia Monsters");


        String[][] board = Algorithm2DArrays.gridOfXandO(12);

        Algorithm2DArrays.printGrid(board);

        System.out.println("You begin on the 0 part and your job is to reach *, you can only move unit space at a time and you will need to find animals as well");
        boolean finishedGoal = true;
        int row = 11;
        int colm = 5;
        int num = 0;
        int qNumbers = 0;
        while(colm != 0){

            System.out.println("Reply with which direction you want to go, you cant go on the X spots");
            System.out.println("If you want info on your player Reply with 'info' ");
            String choice = sc.nextLine();

            if(choice.contains("info")){
                System.out.println("Do you have any animals in your inventory");
                String reply = sc.nextLine();
                if(reply.equals("yes")){
                    p1.info();
                    p1.getInvent();
                }
                else{
                    p1.info();
                }
            }
            else if(choice.contains("left")){
                if(board[row][colm-1].equals("X")){
                    System.out.println("Invalid choice");
                }
                else{
                    board[row][colm] = " ";
                    if(board[row][colm-1].equals("?")){
                        System.out.println("You have found a wild animal: ");
                        total.get(num).getInfo();
                        int f = 0;
                        for(int i = 0; i < 2; i++) {
                            if(newQ.isCorrect(qNumbers)){
                                p1.addScore();
                                f++;
                            }
                            qNumbers++;
                        }
                        if(f == 2) {
                            System.out.println("You have successfully claimed the animal");
                            p1.addInventory(total.get(num));
                            System.out.println(total.get(num).getName());
                        }
                        else{
                            System.out.println("You have not recieved enough points to claim the animal");
                        }
                        num++;
                        p1.info();
                    }
                    colm--;
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }

            }
            else if(choice.contains("right")){
                if(board[row][colm+1].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";
                    if(board[row][colm+1].equals("?")){
                        System.out.println("You have found a wild animal: ");
                        total.get(num).getInfo();
                        int f = 0;
                        for(int i = 0; i < 2; i++) {
                            if(newQ.isCorrect(qNumbers)){
                                p1.addScore();
                                f++;
                            }
                            qNumbers++;
                        }
                        if(f == 2) {
                            System.out.println("You have successfully claimed the animal");
                            p1.addInventory(total.get(num));
                            System.out.println(total.get(num).getName());
                        }
                        else{
                            System.out.println("You have not recieved enough points to claim the animal");
                        }
                        num++;
                        p1.info();
                    }
                    colm++;
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }

            }
            else if(choice.contains("up")){
                if(row - 1 == -1 ){
                    System.out.println("Invalid not in input range");
                }
                else if(board[row-1][colm].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";

                    if(board[row-1][colm].equals("?")){
                        System.out.println("You have found a wild animal: ");
                        total.get(num).getInfo();
                        int f = 0;
                        for(int i = 0; i < 2; i++) {
                            if(newQ.isCorrect(qNumbers)){
                                p1.addScore();
                                f++;
                            }
                            qNumbers++;
                        }
                        if(f == 2) {
                            System.out.println("You have successfully claimed the animal");
                            p1.addInventory(total.get(num));
                            System.out.println(total.get(num).getName());
                        }
                        else{
                            System.out.println("You have not received enough points to claim the animal");
                        }
                        num++;
                        p1.info();

                    }
                    row--;
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }

            }
            else if(choice.contains("down")){
                if(row + 1 == 12 ){
                    System.out.println("Not in input range");
                }
                else if(board[row+1][colm].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";
                    if(board[row+1][colm].equals("?")){
                        System.out.println("You have found a wild animal: ");
                        total.get(num).getInfo();
                        int f = 0;
                        for(int i = 0; i < 2; i++) {
                            if(newQ.isCorrect(qNumbers)){
                                p1.addScore();
                                f++;
                            }
                            qNumbers++;
                        }
                        if(f == 2) {
                            System.out.println("You have successfully claimed the animal:");
                            p1.addInventory(total.get(num));
                            System.out.println(total.get(num).getName());
                        }
                        else{
                            System.out.println("You have not received enough points to claim the animal");
                        }
                        num++;
                        p1.info();

                    }
                    row++;
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }
            }
            else{
                System.out.println("Invalid direction");
                finishedGoal = false;
            }
        }
        System.out.println("Congrats on finishing the game! Hopefully your awareness of the mistreatment of animals allowed you recieved some have you?");
        String res = sc.nextLine();
        if(res.equals("yes")){
            p1.getScore();
            p1.getInvent();
        }
        else{
            p1.getScore();
        }

    }

}
