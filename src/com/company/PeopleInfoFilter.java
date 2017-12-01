package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PeopleInfoFilter {
    private PeopleInfoCollection peopleInfoCollection = new PeopleInfoCollection();

    //method for the same name
    public List<PeopleInfo> sameName (String name) {
        List<PeopleInfo> result = new ArrayList<>();
        for (int i = 0; i < peopleInfoCollection.getPeopleInfosList().size(); i++) {
            if (name.equals(peopleInfoCollection.getPeopleInfosList().get(i).getName())) {
                result.add(peopleInfoCollection.getPeopleInfosList().get(i));
            }
        }
        return result;
        }

}
