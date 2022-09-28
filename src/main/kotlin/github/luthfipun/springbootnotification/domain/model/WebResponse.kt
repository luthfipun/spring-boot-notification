package github.luthfipun.springbootnotification.domain.model

import org.springframework.http.HttpStatus

data class WebResponse(
    val status: Boolean = true,
    val code: Int = HttpStatus.OK.value(),
    val message: String = HttpStatus.OK.name
)
