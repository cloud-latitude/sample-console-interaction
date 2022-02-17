package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GetWelcomeMessageServiceTest {


    @Test
    void online() {

        GetWelcomeMessageService service = new GetWelcomeMessageService();

        Assertions.assertThat(service.getWelcomeMessage())
                .isEqualTo("Hi. What can I do for you?");

    }
    @Test
    void back_to_online() {

        GetWelcomeMessageService service = new GetWelcomeMessageService();

        service.nextState();
        service.nextState();

        Assertions.assertThat(service.getWelcomeMessage())
                .isEqualTo("Hi. What can I do for you?");

    }
    @Test
    void offline() {

        GetWelcomeMessageService service = new GetWelcomeMessageService();

        service.nextState();

        Assertions.assertThat(service.getWelcomeMessage())
                .isEqualTo("Offline. See you tomorrow.");

    }
}