package org.example;

public class GetWelcomeMessageService {

    private String state = "Online";


    public String getWelcomeMessage() {

        if (this.state.equals("Offline")) {
            return "Offline. See you tomorrow.";
        }

        return "Hi. What can I do for you?";
    }

    public void nestState() {

        this.state = "Offline";

    }

}
