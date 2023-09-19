package io.finnhub.api.models

import com.squareup.moshi.Json
import java.io.Serializable

data class MarketCapResult(
    @Json(name = "currency") val currency: String,
    @Json(name = "data") val data: List<MarketCap>,
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}