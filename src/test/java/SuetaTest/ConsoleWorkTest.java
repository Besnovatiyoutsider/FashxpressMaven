package SuetaTest;

import Sueta.ConsoleWork;
import Sueta.LogicOfDialogue;
import java.util.Scanner;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class ConsoleWorkTest {
    private ConsoleWork consoleWork;

    @Before
    public void setUp(){
        consoleWork = new ConsoleWork();
    }
    @Test
    public void testStartDialogHelp(){

    }
    public void TeststartDialog(){
        Scanner scanner = new Scanner(System.in);
        String answer;
        //printHelp();

        while (true){
            answer = scanner.next();

            if (answer.equals("\\help")) {
               // printHelp();
            } else {
                //String userResponse = logicOfDialogue.getResponse(answer);
                //System.out.println(userResponse);
            }
        }

    }
}
