package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GetWelcomeMessageServiceTest {

    @Test
    void normal_state() {

        GetWelcomeMessageService service = new GetWelcomeMessageService();

        String welcomeMessage = service.getWelcomeMessage();

        Assertions.assertThat(welcomeMessage)
                .isEqualTo("Hi. What can I do for you?");

    }
    @Test
    void offline() {

        GetWelcomeMessageService service = new GetWelcomeMessageService();

        service.nestState();

        String welcomeMessage = service.getWelcomeMessage();

        Assertions.assertThat(welcomeMessage)
                .isEqualTo("Offline. See you tomorrow.");

    }
}