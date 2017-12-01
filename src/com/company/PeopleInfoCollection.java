package com.company;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PeopleInfoCollection {
    private PeopleInfo[] peopleInfos;
    List<PeopleInfo> peopleInfosList = new ArrayList<>();

    // default constructor
    public PeopleInfoCollection() {
        initializeData();
    }

    // initialize data method
    private void initializeData () {
        String jsonString = getFileContentsAsString("people.json");
        Gson gson = new Gson();
        peopleInfos = gson.fromJson(jsonString, PeopleInfo[].class);
        for (int i = 0; i < peopleInfos.length; i++) {
            peopleInfosList.add(peopleInfos[i]);
        }
    }

    // read file method
    public static String getFileContentsAsString(String filename) {
        final Path path = FileSystems.getDefault().getPath("data", filename);
        try {
            return new String(Files.readAllBytes(path));
        } catch (IOException e) {
            System.out.println("Couldn't find file: " + filename);
            System.exit(-1);
            return null;
        }
    }
    public List<PeopleInfo> getPeopleInfosList() {
        return peopleInfosList;
    }
}
