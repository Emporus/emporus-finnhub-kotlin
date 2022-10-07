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

import io.finnhub.api.models.InstitutionalPortfolioInfo

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param reportDate Report date.
 * @param filingDate Filing date.
 * @param portfolio Array of positions.
 */

data class InstitutionalPortfolioGroup (

    /* Report date. */
    @Json(name = "reportDate")
    val reportDate: kotlin.String? = null,

    /* Filing date. */
    @Json(name = "filingDate")
    val filingDate: kotlin.String? = null,

    /* Array of positions. */
    @Json(name = "portfolio")
    val portfolio: kotlin.collections.List<InstitutionalPortfolioInfo>? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

