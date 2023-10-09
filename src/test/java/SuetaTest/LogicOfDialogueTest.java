package SuetaTest;

import Sueta.LogicOfDialogue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class LogicOfDialogueTest {
    private LogicOfDialogue logicOfDialogue;
    @Before
    public void setUp(){
        logicOfDialogue= new LogicOfDialogue();
    }
    @Test
    public void testGetResponseValid(){
        String response = logicOfDialogue.getResponse("ахматова");
        Assert.assertEquals("Двадцать первое. Ночь. Понедельник.\n" +
                "Очертанья столицы во мгле.\n" +
                "Сочинил же какой-то бездельник,\n" +
                "Что бывает любовь на земле.\n" +
                "И от лености или со скуки\n" +
                "Все поверили, так и живут:\n" +
                "Ждут свиданий, боятся разлуки\n" +
                "И любовные песни поют.\n" +
                "Но иным открывается тайна,\n" +
                "И почиет на них тишина…\n" +
                "Я на это наткнулась случайно\n" +
                "И с тех пор всё как будто больна.",response);
    }
    @Test
    public void testGetResponseInvalid(){
        String response = logicOfDialogue.getResponse("netu");
        Assert.assertEquals("нет такой комманды",response);

    }

}