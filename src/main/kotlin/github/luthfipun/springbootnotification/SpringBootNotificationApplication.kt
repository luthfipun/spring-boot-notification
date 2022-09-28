package github.luthfipun.springbootnotification

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SpringBootNotificationApplication

fun main(args: Array<String>) {
    runApplication<SpringBootNotificationApplication>(*args)
}
