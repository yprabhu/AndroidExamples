package com.yprabhu.recyclerviewexample;

public class ViewModel {

    private long id;
    private String text;
    private String url;

    public ViewModel(long id, String text, String url) {
        this.id = id;
        this.text = text;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
