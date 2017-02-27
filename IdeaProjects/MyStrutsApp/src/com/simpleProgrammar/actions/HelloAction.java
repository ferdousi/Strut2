/**
 * Created by saraferdousi on 2/23/17.
 */
package com.simpleProgrammar.actions;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {

    private String greeting;

    @Override
    public String execute() throws Exception {
        greeting = "Hello Struts 2 !!!";
        return "success";
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
