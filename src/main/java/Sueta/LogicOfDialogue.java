package Sueta;

import java.util.Scanner;

public class LogicOfDialogue {
    private QuestionRepository questionRepository;
    public LogicOfDialogue() {

        questionRepository = new QuestionRepository();
    }
    public String getResponse(String message) {
        String response = questionRepository.getQuestion(message.toLowerCase());
        if (response != null) {
            return response;
        } else {
            return "нет такой комманды";
        }
    }

}