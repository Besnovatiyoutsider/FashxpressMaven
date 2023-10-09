package Sueta;

import java.util.HashMap;

public class QuestionRepository {
    private HashMap<String,String> mapQustions;

    public QuestionRepository() {
        mapQustions = new HashMap<>();
        mapQustions.put("ахматова", "Двадц.");
        mapQustions.put("цветаева", "Легк!");
        mapQustions.put("есенин", "Ах, к.");
        mapQustions.put("саша черный", "Кто лю");
    }
    public String getQuestion(String key) {

        return mapQustions.get(key);
    }

}
