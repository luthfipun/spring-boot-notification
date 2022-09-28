package github.luthfipun.springbootnotification.controller

import github.luthfipun.springbootnotification.domain.model.WebResponse
import github.luthfipun.springbootnotification.service.NotificationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
@RestController
@RequestMapping("/api/notification/")
class NotificationController(
    val notificationService: NotificationService
) {

    @GetMapping(
        value = ["basic"],
        produces = ["application/json"]
    )
    fun basicNotification(): WebResponse {
        val time = measureTime {
            notificationService.sendEventBasic()
        }
        return WebResponse(
            message = "Waiting send notification event data with ${time.inWholeSeconds}s"
        )
    }

    @GetMapping(
        value = ["async"],
        produces = ["application/json"]
    )
    fun asyncNotification(): WebResponse {
        val time = measureTime {
            notificationService.sendEventAsync()
        }
        return WebResponse(
            message = "Waiting send notification event data with ${time.inWholeSeconds}s"
        )
    }

    @GetMapping(
        value = ["coroutine"],
        produces = ["application/json"]
    )
    fun coroutineNotification(): WebResponse {
        val time = measureTime {
            notificationService.sendEventCoroutine()
        }
        return WebResponse(
            message = "Waiting send notification event data with ${time.inWholeSeconds}s"
        )
    }
}