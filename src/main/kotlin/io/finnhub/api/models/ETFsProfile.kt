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

import io.finnhub.api.models.ETFProfileData

import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param symbol Symbol.
 * @param profile 
 */

data class ETFsProfile (
    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,
    @Json(name = "profile")
    val profile: ETFProfileData? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

