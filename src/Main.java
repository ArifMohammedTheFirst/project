import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name?: ");
        String name = s.nextLine();
        Scanner sc = new Scanner(System.in);

        Monsters Elephants = new Monsters("Pikman", "Mammals");
        Monsters dog = new Monsters("Dog", "Canine");
        Monsters penguins = new Monsters("Penguin", "Bird");
        Monsters Bulls = new Monsters("Bull", "Mammal Cow");
        ArrayList<Monsters> total = new ArrayList<Monsters>();
        total.add(Elephants);
        total.add(dog);
        total.add(penguins);
        total.add(Bulls);


        Player p1 = new Player(name);

        System.out.println("Hello " + p1.getName() + "! Welcome to Trivia Monsters");


        String[][] board = Algorithm2DArrays.gridOfXandO(12);

        Algorithm2DArrays.printGrid(board);

        System.out.println("You begin on the 0 part and your job is to reach *, you can only move unit space at a time and you will need to find animals as well");
        boolean finishedGoal = true;
        int row = 11;
        int colm = 5;
        int num = 0;
        while(finishedGoal){
            System.out.println("Reply with which direction you want to go, you cant go on the X spots");
            String choice = sc.nextLine();

            System.out.println(choice);

            if(choice.contains("left")){
                if(board[row][colm-1].equals("X")){
                    System.out.println("Invalid choice");
                }
                else{
                    board[row][colm] = " ";
                    if(board[row][colm-1].equals("?")){
                        System.out.println("You have found a wild animal: ");
                        total.get(num).getInfo();

                    }
                    colm--;
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }
                finishedGoal = false;
            }
            else if(choice.contains("right")){
                if(board[row][colm+1].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";
                    colm++;
                    //if(board[row][colm-1].equals("?")){
                    //    System.out.println("You have found a wild animal");

                    //}
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }
                finishedGoal = false;
            }
            else if(choice.contains("up")){
                if(board[row+1][colm].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";
                    row++;
                    //if(board[row][colm-1].equals("?")){
                    //    System.out.println("You have found a wild animal");

                    //}
                    board[row][colm] = "O";
                    Algorithm2DArrays.printGrid(board);
                }
                finishedGoal = false;
            }
            else if(choice.contains("down")){
                if(board[row][colm-1].equals("X")){
                    System.out.println("Invalid choice b/c X");
                }
                else{
                    board[row][colm] = " ";
                    row--;
                    //if(board[row][colm-1].equals("?")){
                    //    System.out.println("You have found a wild animal");

                    //}
                    board[row][colm-1] = "O";
                    Algorithm2DArrays.printGrid(board);
                }
                finishedGoal = false;
            }
            else{
                System.out.println("Invalid direction");
                finishedGoal = false;
            }
        }






    }

}
