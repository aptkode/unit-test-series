package com.aptkode.notification;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ReminderServiceTest {

    @Mock
    Notifier notifier;

    @Test
    void remindAtTest() {
        // arrange
        try (ReminderService reminderService = new ReminderService(notifier)) {
            // act
            reminderService.remindAt("o23034902", "this is a test message", LocalDateTime.now().plusSeconds(5));
            // assert
            verify(notifier, timeout(Duration.ofSeconds(6)).atLeastOnce())
                    .notify(eq("o23034902"), eq("this is a test message"));
        }
    }

}
