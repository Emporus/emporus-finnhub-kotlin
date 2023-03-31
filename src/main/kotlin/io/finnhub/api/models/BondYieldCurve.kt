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

import io.finnhub.api.models.BondYieldCurveInfo

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param `data` Array of data.
 * @param code Bond's code
 */

data class BondYieldCurve (

    /* Array of data. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<BondYieldCurveInfo>? = null,

    /* Bond's code */
    @Json(name = "code")
    val code: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

