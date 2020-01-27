package com.automationpractice.www.models;

public enum  Url {


    GMAIL_URL("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    private String url;

    private Url(String url){
        this.url = url;
    }

    public String getName(){
        return url;
    }
}
