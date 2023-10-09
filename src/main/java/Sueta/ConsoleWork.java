package Sueta;

import java.util.Scanner;

public class ConsoleWork {
    private LogicOfDialogue logicOfDialogue;

    public ConsoleWork() {
        logicOfDialogue = new LogicOfDialogue();
    }
    private void printHelp() {
        System.out.format("Привет я бот который ничего не умеет также как и его создатель.%n" +
                "Но он любит поэзию поэтому могу показать пару стихов которые ему нравятся.%n" +
                "Выбери автора который тебя интересует:%n" +
                "Ахматова%n" +
                "Цветаева%n" +
                "Есенин%n" +
                "Саша Черный%n"+
                "P.S мой создатель прогуливал уроки русского языка поэтому тут нет запятых%n");
    }

    public void startDialog(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        printHelp();

        while (true){
            answer = scanner.next();

            if (answer.equals("\\help")) {
                printHelp();
            } else {
                String userResponse = logicOfDialogue.getResponse(answer);
                System.out.println(userResponse);
            }
        }

    }
}
