import java.util.*;
import java.security.SecureRandom;
import java.text.DecimalFormat;


class CAI {

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] arg) {
        while (true) {
            execute();
        }
    }

    static void execute() {

        System.out.println("Choose the difficulty level");
        System.out.println("Level: 1");
        System.out.println("Level: 2");
        System.out.println("Level: 3");
        System.out.println("Level: 4");
        Scanner scnr = new Scanner(System.in);
        int level = scnr.nextInt();
        System.out.println("Please select the type of arithmetic you would like to practice.");
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Multiply");
        System.out.println("3. Subtract");
        System.out.println("4. Divide");
        System.out.println("5. A combination of all four");
        System.out.println();
        int typeOfArithmetic = scnr.nextInt();

        arithmeticSelection(level, typeOfArithmetic);
    }

    static void arithmeticSelection(int level, int arithmeticChoice) {
        int counter = 0;

        switch (arithmeticChoice) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    counter += addition(level);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    counter += multiplication(level);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    counter += substraction(level);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    counter += division(level);
                }

                break;
            case 5:
                for (int i = 1; i <= 10; i++) {
                    int ran = Random(1, 4);
                    if (ran == 1) {
                        counter += addition(level);
                    }
                    if (ran == 2) {
                        counter += multiplication(level);
                    }
                    if (ran == 3) {
                        counter += substraction(level);
                    }
                    if (ran == 4) {
                        counter += division(level);
                    }
                }
                break;

            default:
                System.out.println("Invalid Number");
                return;

        }


        if (((double) counter) >= (double) 7.5) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else {
            System.out.println("Please ask your teacher for extra help");
            System.out.println();
        }

        System.out.println("Would you like to practice some more?");

    }

    static int addition(int level) {
        int A = 0;
        int B = 0;
        if (level == 1) {
            A = Random(0, 9);
            B = Random(0, 9);
        }
        if (level == 2) {
            A = Random(10, 99);
            B = Random(10, 99);
        }
        if (level == 3) {
            A = Random(100, 999);
            B = Random(100, 999);
        }
        if (level == 4) {
            A = Random(1000, 9999);
            B = Random(1000, 9999);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(A + " + " + B + " = ");
        int answer = sc.nextInt();
        if (answer == A + B) {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("Very good!");
            }
            if (choice == 2) {
                System.out.println("Excellent!");
            }
            if (choice == 3) {
                System.out.println("Nice work!");
            }
            if (choice == 4) {
                System.out.println("Keep up the good work!");
            }
            return 0;
        } else {


            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("No. Please try again.");
            }
            if (choice == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (choice == 3) {
                System.out.println("Don't give up!");
            }
            if (choice == 4) {
                System.out.println("No. Keep trying");
            }

            return 0;
        }

    }

    static int substraction(int level) {
        int A = 0;
        int B = 0;
        if (level == 1) {
            A = Random(0, 9);
            B = Random(0, 9);
        }
        if (level == 2) {
            A = Random(10, 99);
            B = Random(10, 99);
        }
        if (level == 3) {
            A = Random(100, 999);
            B = Random(100, 999);
        }
        if (level == 4) {
            A = Random(1000, 9999);
            B = Random(1000, 9999);
        }
        Scanner scnr = new Scanner(System.in);
        System.out.println(A + " - " + B + " = ");
        int answer = scnr.nextInt();
        if (answer == A - B) {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("Very good!");
            }
            if (choice == 2) {
                System.out.println("Excellent!");
            }
            if (choice == 3) {
                System.out.println("Nice work!");
            }
            if (choice == 4) {
                System.out.println("Keep up the good work!");
            }
            return 0;
        } else {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("No. Please try again.");
            }
            if (choice == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (choice == 3) {
                System.out.println("Don't give up!");
            }
            if (choice == 4) {
                System.out.println("No. Keep trying");
            }
            return 0;
        }
    }

    static int multiplication(int level) {
        double A = 0;
        double B = 0;
        if (level == 1) {
            A = Random(0, 9);
            B = Random(0, 9);
        }
        if (level == 2) {
            A = Random(10, 99);
            B = Random(10, 99);
        }
        if (level == 3) {
            A = Random(100, 999);
            B = Random(100, 999);
        }
        if (level == 4) {
            A = Random(1000, 9999);
            B = Random(1000, 9999);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(A + " x " + B + " = ");
        double answer = sc.nextInt();
        if (answer == B * A) {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("Very good!");
            }
            if (choice == 2) {
                System.out.println("Excellent!");
            }
            if (choice == 3) {
                System.out.println("Nice work!");
            }
            if (choice == 4) {
                System.out.println("Keep up the good work!");
            }
            return 0;
        } else {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("No. Please try again.");
            }
            if (choice == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (choice == 3) {
                System.out.println("Don't give up!");
            }
            if (choice == 4) {
                System.out.println("No. Keep trying");
            }
            return 0;
        }
    }

    static int division(int level) {
        double A = 0;
        double B = 0;
        if (level == 1) {
            A = Random(1, 9);
            B = Random(1, 9);
        }
        if (level == 2) {
            A = Random(10, 99);
            B = Random(10, 99);
        }
        if (level == 3) {
            A = Random(100, 999);
            B = Random(100, 999);
        }
        if (level == 4) {
            A = Random(1000, 999);
            B = Random(1000, 999);
        }
        Scanner scnr = new Scanner(System.in);


        System.out.println(A + " / " + B + " = ");
        String answer = scnr.nextLine();
        System.out.println(df2.format(A / B));
        if (answer.equals(df2.format(A / B))) {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("Very good!");
            }
            if (choice == 2) {
                System.out.println("Excellent!");
            }
            if (choice == 3) {
                System.out.println("Nice work!");
            }
            if (choice == 4) {
                System.out.println("Keep up the good work!");
            }
            return 0;
        } else {
            int choice = Random(1, 4);
            if (choice == 1) {
                System.out.println("No. Please try again.");
            }
            if (choice == 2) {
                System.out.println("Wrong. Try once more.");
            }
            if (choice == 3) {
                System.out.println("Don't give up!");
            }
            if (choice == 4) {
                System.out.println("No. Keep trying");
                return 0;
            }
            return 0;
        }
    }


    public static int Random(int min, int max) {
        SecureRandom rand = new SecureRandom();
        int x = (int) (rand.nextDouble() * ((max - min) + 1)) + min;
        return x;
    }
}

