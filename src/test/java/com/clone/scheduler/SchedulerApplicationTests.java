package com.clone.scheduler;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@SpringBootTest
class SchedulerApplicationTests {

	@SpyBean
	ScheduledTasks scheduledTasks; //spy on real class

	@Test
	void reportCurrentTime() {
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
			verify(scheduledTasks, atLeast(2)).reportCurrentTime();
		});
	}

}
