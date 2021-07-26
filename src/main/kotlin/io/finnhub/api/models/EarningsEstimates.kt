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

import io.finnhub.api.models.EarningEstimate

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param data List of estimates
 * @param freq Frequency: annual or quarterly.
 * @param symbol Company symbol.
 */

data class EarningsEstimates (
    /* List of estimates */
    @Json(name = "data")
    val data: kotlin.collections.List<EarningEstimate>? = null,
    /* Frequency: annual or quarterly. */
    @Json(name = "freq")
    val freq: kotlin.String? = null,
    /* Company symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

