package view;

import java.util.Scanner;

public class ViewforClients {
    Scanner in = new Scanner(System.in);

//    private String promptRequest(String message) {
//        Scanner input = new Scanner(System.in);
//        System.out.println(message);
//        return input.nextLine();
//    }
    public int runMenu(){
        System.out.println("\n~~~~~~COMPLEX CALCULATOR~~~~~~~");
        System.out.println("\n Select and enter a number from the MENU\n");
        System.out.println("1: Summation");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Quit\n");
        return in.nextInt();
    }
}
//            String startMenu = promptRequest("Enter list: ").toLowerCase();
////            commands = Commands.valueOf(startMenu);
////            if (commands == Commands.exit) return;
////            switch (commands) {
////                case summ:
//
////                    break;
////            case multi: ->
////
////                break;
////            case subtract: ->
////
////                break;
////            case divide: ->
////
////                break;
////                default:
//                    throw new UnsupportedOperationException("Not supported");
//            }
//        }
//    }
//}





