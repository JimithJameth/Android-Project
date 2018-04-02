package com.example.jamie.interactivestory.model;

/**
 * Created by Jamie on 26/03/2018.
 */

public class Choice {
    private int nextPage;
    private int textId;



    public Choice(int imageId, int textId) {
        this.nextPage = nextPage;
        this.textId = textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }
}








