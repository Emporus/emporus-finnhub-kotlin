package io.finnhub.api.models

import com.squareup.moshi.Json
import java.io.Serializable
import java.time.LocalDate

data class MarketCap(
    @Json(name = "atDate") val atDate: LocalDate,
    @Json(name = "marketCapitalization") val marketCapitalization: Float,

    ) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }
}

