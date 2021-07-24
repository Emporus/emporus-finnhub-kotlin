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


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 * @param accessNumber Access number of the report from which the data is sourced.
 * @param breakdown 
 */

data class BreakdownItem (
    /* Access number of the report from which the data is sourced. */
    @Json(name = "accessNumber")
    val accessNumber: kotlin.String? = null,
    @Json(name = "breakdown")
    val breakdown: kotlin.Any? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

