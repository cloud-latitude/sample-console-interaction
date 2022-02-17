package org.example;

public class GetWelcomeMessageService {

    private String state = "Online";

    public String getWelcomeMessage() {

        if (this.state.equals("Offline")) {
            return "Offline. See you tomorrow.";
        } else {
            return "Hi. What can I do for you?";
        }
    }

    public void nextState() {

        if (this.state.equals("Offline")) {
            this.state = "Online";
        } else {
            this.state = "Offline";
        }
    }

}
