package com.example.jamie.interactivestory.model;

/**
 * Created by Jamie on 26/03/2018.
 */

public class Page {
    private int imageId;
    private int textId;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinalPage = false;


    public Page(int imageId, int textId, Choice choice1, Choice choice2) {
        this.imageId = imageId;
        this.textId = textId;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.isFinalPage = false;
    }

    public Page(int page5, int page51) {
    }

    public boolean isFinalPage() {
        return isFinalPage;
    }

    public void setFinalPage(boolean finalPage) {
        isFinalPage = finalPage;
    }

    public void setImageId(int page0) {
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public int getImageId() {
        return imageId;
    }

    public int getTextId() {
        return textId;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }
}
