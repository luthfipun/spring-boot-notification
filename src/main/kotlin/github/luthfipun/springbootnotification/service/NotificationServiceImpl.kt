package github.luthfipun.springbootnotification.service

import github.luthfipun.springbootnotification.domain.entity.Notification
import github.luthfipun.springbootnotification.repository.NotificationRepository
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Service
import java.util.*

@Service
class NotificationServiceImpl(
    val notificationRepository: NotificationRepository
) : NotificationService {

    private fun addedFakeData() {
        val messages = "Added data on ${Date()}"
        notificationRepository.save(Notification(message = messages))
    }

    override fun sendEventBasic() {
        // sample complex logic or need take time connect to another 3rd party library like firebase, sendgrid etc
        Thread.sleep(5000)
        addedFakeData()
    }

    @Async
    override fun sendEventAsync() {
        // sample complex logic or need take time connect to another 3rd party library like firebase, sendgrid etc
        Thread.sleep(5000)
        addedFakeData()
    }
}