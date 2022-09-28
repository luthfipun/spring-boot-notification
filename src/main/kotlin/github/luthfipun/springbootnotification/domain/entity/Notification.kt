package github.luthfipun.springbootnotification.domain.entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "notification")
data class Notification(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,

    @Column(name = "message")
    val message: String,

    @Column(name = "created_at")
    val createdAt: Date = Date(),

    @Column(name = "updated_at", nullable = true)
    val updatedAt: Date? = null
)
