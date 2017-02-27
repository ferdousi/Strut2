package com.simpleProgrammar.actions;

/**
 * Created by saraferdousi on 2/23/17.
 */

import com.opensymphony.xwork2.ActionSupport;

public class EnterProtein extends ActionSupport {

    private int enteredProtein;

    @Override
    public String execute() throws Exception {

        ProteinTrackingService proteinTrackingService = new ProteinTrackingService();
        proteinTrackingService.AddProtein(enteredProtein);


        return SUCCESS;
    }

    public int getEnteredProtein() {
        return enteredProtein;
    }

    public void setEnteredProtein(int enteredProtein) {
        this.enteredProtein = enteredProtein;
    }

    public String getGoalText(){
        return getText("goal.text");
    }
}
