package com.aptkode.notification;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReminderService implements AutoCloseable {

    private final Notifier notifier;
    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    public ReminderService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void remindAt(String userId, String message, LocalDateTime time) {
        scheduledExecutorService.schedule(() -> notifier.notify(userId, message), Duration.between(LocalDateTime.now(),
                time).toSeconds(),
                TimeUnit.SECONDS);
    }

    @Override
    public void close() {
        scheduledExecutorService.shutdown();
    }
}
