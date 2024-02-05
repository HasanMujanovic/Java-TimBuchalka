package dev.lpa.util;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends QueryItem> {
    private List<T> itemes;
    public QueryList(List<T> items){
        this.itemes = items;
    }
    public List<T> getMatches(String field, String value){
        List<T> matches = new ArrayList<>();
        for (var item: itemes){
            if (item.matchFieldValue(field,value)){
                matches.add(item);
            }
        }
        return matches;
    }

    public boolean matchFieldValue(String fieldName,String value) {
        String fName = fieldName.toUpperCase();
        return switch (fName){
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted.equalsIgnoreCase(value);
            default -> false;
        };
    }
}
