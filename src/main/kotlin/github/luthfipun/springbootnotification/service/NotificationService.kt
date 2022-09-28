package github.luthfipun.springbootnotification.service

interface NotificationService {
    fun sendEventBasic()
    fun sendEventAsync()
    fun sendEventCoroutine()
}