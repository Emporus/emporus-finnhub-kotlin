/**
* Finnhub API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package io.finnhub.api.models

import io.finnhub.api.models.ETFSectorExposureData

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param symbol ETF symbol.
 * @param sectorExposure Array of industries and exposure levels.
 */

data class ETFsSectorExposure (
    /* ETF symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,
    /* Array of industries and exposure levels. */
    @Json(name = "sectorExposure")
    val sectorExposure: kotlin.collections.List<ETFSectorExposureData>? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

