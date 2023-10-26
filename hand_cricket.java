import java.util.*;

class parth_n_rutuexception extends Exception {
    public String toString() {
        return "Yaha par kuch Doglapan hua hai...Yeh Doglapan meri expertise ke bahar hai isliye I am OUT!!!!";
    }

    public String getMessage() {
        return "Invalid input\nYou can enter only 1 or 2";
    }
}

interface TOSS {
    public void toss();
}

interface firstbatting {
    public void BAT();

    public void BowL();
}

interface firstbowling {
    public void BOWL();

    public void BaT();
}

class Innings implements firstbatting, firstbowling {
    int rand;
    int player;
    int player1;
    int player2;
    int rand2;
    int player3;
    int rand3;
    int sum = 0;
    int sum2 = 0;
    int count = 0;
    int count1 = 0;
    int sum1;
    int sum3;
    int rand1;
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    public void BAT() {

        do {
            rand = 1 + r.nextInt(10);
            System.out.print("Enter your number: ");
            player = s.nextInt();
            while (player < 0 || player > 10) {
                System.out.println("Enter a valid number ");
                System.out.println("Enter a number between 0 to 10 omly");
                System.out.print("Enter your number: ");
                player = s.nextInt();
            }

            System.out.println("Your number: " + player);
            System.out.println("Computer's number: " + rand);
            System.out.println();
            if (player != rand) {
                sum = sum + player;
            }
        } while (player != rand);
        System.out.println("Opps!!!! You are out....");
        System.out.println();
        System.out.println("Your score: " + sum);
        if (sum == 0) {
            System.out.println("****  You receieved a Golden Duck  ****");
            System.out.println();
        }
        System.out.println("Now get ready to bowl.....");
        System.out.println();
        sum1 = sum;
    }

    public void BowL() {
        System.out.println("    **2nd Inning**     ");
        System.out.println();
        do {
            rand1 = 1 + r.nextInt(10);
            System.out.print("Enter your number: ");
            player1 = s.nextInt();
            while (player1 < 0 || player1 > 10) {
                System.out.println("Enter a valid number ");
                System.out.println("Enter a number between 0 to 10 omly");
                System.out.print("Enter your number: ");
                player1 = s.nextInt();
            }
            System.out.println("Your number: " + player1);
            System.out.println("Computer's number: " + rand1);
            System.out.println();
            if (player1 != rand1) {
                count = count + rand1;
            }
            if (count >= sum1) {
                break;
            }

        } while (player1 != rand1);
        if (player1 == rand1) {
            System.out.println("YAY!!!! You took the wicket");
            System.out.println();
        }
        if (count >= sum1) {
            System.out.println("Opps!!!! You lose");
            System.out.println();
            System.out.println("        ***Computer wins the match***       ");

        } else {
            System.out.println("        ***Congratulations***       ");
            System.out.println();
            System.out.println("        YOU WON THE MATCH       ");

        }
    }

    public void BOWL() {
        do {
            rand2 = 1 + r.nextInt(10);
            System.out.print("Enter your number: ");
            player2 = s.nextInt();
            while (player2 < 0 || player2 > 10) {
                System.out.println("Enter a valid number ");
                System.out.println("Enter a number between 0 to 10 omly");
                System.out.print("Enter your number: ");
                player2 = s.nextInt();
            }
            System.out.println("Your number: " + player2);
            System.out.println("Computer's number: " + rand2);
            System.out.println();
            if (player2 != rand2) {
                sum2 = sum2 + rand2;
            }
        } while (player2 != rand2);
        if (player2 == rand2) {
            System.out.println("YAY!!!! You took the wicket");
            System.out.println();
        }
        if (rand2 == 0) {
            System.out.println("    Computer received a Golden Duck!!!!!    ");
        }
        sum3 = sum2;
    }

    public void BaT() {
        System.out.println("    **2nd Inning**     ");
        System.out.println("Target : " + sum3);
        System.out.println("Score " + sum3 + " or above to win the match");
        do {
            rand3 = 1 + r.nextInt(10);
            System.out.print("Enter your number: ");
            player3 = s.nextInt();
            while (player3 < 0 || player3 > 10) {
                System.out.println("Enter a valid number ");
                System.out.println("Enter a number between 0 to 10 omly");
                System.out.print("Enter your number: ");
                player3 = s.nextInt();
            }
            System.out.println("Your number: " + player3);
            System.out.println("Computer's number: " + rand3);
            System.out.println();
            if (player3 != rand3) {
                count1 = count1 + player3;
            }
            if (count1 >= sum3) {
                break;
            }
        } while (player3 != rand3);
        if (player3 == rand3) {
            System.out.println("Opps!!!! You are out....");
            System.out.println();
        }
        if (count1 >= sum3) {
            System.out.println("        ***Congratulations***       ");
            System.out.println();
            System.out.println("        YOU WON THE MATCH       ");
        } else {
            System.out.println("Opps!!!! You lose");
            System.out.println();
            System.out.println("        ***Computer wins the match***       ");
        }
    }
}

class TS extends Innings implements TOSS {
    public void toss() {
        int num;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int computer_num;
        computer_num = 1 + r.nextInt(10);
        int odd;
        int even;
        int choice;
        int tosschoice;
        System.out.println("Enter your choice\n1.Even\n2.Odd");
        choice = s.nextInt();
        System.out.println();
        try {
            if (choice > 2 || choice < 1) {
                throw new parth_n_rutuexception();
            }
        } catch (Exception p) {
            System.out.println(p.getMessage());
            System.out.println("Enter your choice\n1.Even\n2.Odd");
            choice = s.nextInt();
            System.out.println();
        }
        switch (choice) {
            case 1: {
                System.out.println("****Enter numbers between 0 to 10****");
                System.out.println("Enter a number for toss");
                num = s.nextInt();
                while (num < 0 || num > 10) {
                    System.out.println("Enter a valid number ");
                    System.out.println("Enter a number between 0 to 10 omly");
                    System.out.println("Enter a number for toss");
                    num = s.nextInt();
                }
                System.out.println("Your number: " + num);
                System.out.println("Computer's number: " + computer_num);
                even = computer_num + num;
                if (even % 2 == 0) {
                    System.out.println("Congratulations you won the toss!!!!!");
                    System.out.println("What do you want to do?");
                    System.out.println("1.Batting\n2.Bowling");
                    tosschoice = s.nextInt();
                    try {
                        if (tosschoice > 2 || tosschoice < 1) {
                            throw new parth_n_rutuexception();
                        }
                    } catch (Exception p) {
                        System.out.println(p.getMessage());
                        System.out.println("1.Batting\n2.Bowling");
                        tosschoice = s.nextInt();
                        System.out.println();
                    }
                    switch (tosschoice) {
                        case 1: {
                            System.out.println("    Get ready for batting........");
                            BAT();
                            BowL();
                            break;
                        }
                        case 2: {
                            System.out.println("    Get ready for bowling........");
                            BOWL();
                            BaT();
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Computer won the toss!!!!!!");
                    if (computer_num <= 5) {
                        System.out.println("Computer chooses to Bat first");
                        System.out.println("Get ready for bowling..........");
                        BOWL();
                        BaT();
                        break;
                    } else if (computer_num > 5) {
                        System.out.println("Computer chooses to Bowl first");
                        System.out.println("Get ready for batting..........");
                        BAT();
                        BowL();
                        break;
                    }
                    break;
                }
            }
            case 2: {
                System.out.println("****Enter numbers between 0 to 10****");
                System.out.println("Enter a number for toss");
                num = s.nextInt();
                while (num < 0 || num > 10) {
                    System.out.println("Enter a valid number ");
                    System.out.println("Enter a number between 0 to 10 omly");
                    System.out.println("Enter a number for toss");
                    num = s.nextInt();
                }
                System.out.println("Your number: " + num);
                System.out.println("Computer's number: " + computer_num);
                odd = computer_num + num;
                if (odd % 2 != 0) {
                    System.out.println("Congratulations you won the toss");
                    System.out.println("What do you want to do?");
                    System.out.println("1.Batting\n2.Bowling");
                    tosschoice = s.nextInt();
                    try {
                        if (tosschoice > 2 || tosschoice < 1) {
                            throw new parth_n_rutuexception();
                        }
                    } catch (Exception p) {
                        System.out.println(p.getMessage());
                        System.out.println("1.Batting\n2.Bowling");
                        tosschoice = s.nextInt();
                        System.out.println();
                    }
                    switch (tosschoice) {
                        case 1: {
                            System.out.println("    Get ready for batting........");
                            BAT();
                            BowL();
                            break;
                        }
                        case 2: {
                            System.out.println("    Get ready for bowling........");
                            BOWL();
                            BaT();
                            break;
                        }
                    }
                    break;
                } else {
                    System.out.println("Computer won the toss");
                    if (computer_num <= 5) {
                        System.out.println("Computer chooses to Bowl first");
                        System.out.println("Get ready for batting");
                        BAT();
                        BowL();
                        break;
                    } else if (computer_num > 5) {
                        System.out.println("Computer chooses to Bat first");
                        System.out.println("Get ready for bowling");
                        BOWL();
                        BaT();
                        break;
                    }
                    break;
                }
            }
        }
    }
}

class hand_cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        try {

            TS t = new TS();
            System.out.println();
            System.out.println();
            System.out.println("        Welcome to Hand Cricket Game        ");
            System.out.println();
            t.toss();
            System.out.println();

        } catch (Exception p) {
            System.out.println(p);
        } finally {
            System.out.println("        ***** Made by Parth Rajput and Rutu Patel *****     ");
        }
        System.out.println();
    }
}