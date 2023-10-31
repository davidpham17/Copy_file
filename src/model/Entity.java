package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entity {
    private Entity path, word;

    public Entity() {
    }

    public Entity(Entity path, Entity word) {
        this.path = path;
        this.word = word;
    }

    public Entity getPath() {
        return path;
    }

    public void setPath(Entity path) {
        this.path = path;
    }

    public Entity getWord() {
        return word;
    }

    public void setWord(Entity word) {
        this.word = word;
    }
    
    
}
