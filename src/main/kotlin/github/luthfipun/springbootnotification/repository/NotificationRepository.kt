package github.luthfipun.springbootnotification.repository

import github.luthfipun.springbootnotification.domain.entity.Notification
import org.springframework.data.jpa.repository.JpaRepository

interface NotificationRepository: JpaRepository<Notification, Long>