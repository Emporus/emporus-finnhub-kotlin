/**
 * Finnhub API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.finnhub.api.models


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param ebitdaAvg Average EBITDA estimates including Finnhub's proprietary estimates.
 * @param ebitdaHigh Highest estimate.
 * @param ebitdaLow Lowest estimate.
 * @param numberAnalysts Number of Analysts.
 * @param period Period.
 */

data class EbitdaEstimatesInfo (

    /* Average EBITDA estimates including Finnhub's proprietary estimates. */
    @Json(name = "ebitdaAvg")
    val ebitdaAvg: kotlin.Float? = null,

    /* Highest estimate. */
    @Json(name = "ebitdaHigh")
    val ebitdaHigh: kotlin.Float? = null,

    /* Lowest estimate. */
    @Json(name = "ebitdaLow")
    val ebitdaLow: kotlin.Float? = null,

    /* Number of Analysts. */
    @Json(name = "numberAnalysts")
    val numberAnalysts: kotlin.Long? = null,

    /* Period. */
    @Json(name = "period")
    val period: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

