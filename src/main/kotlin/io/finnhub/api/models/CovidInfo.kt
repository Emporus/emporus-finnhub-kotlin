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
 * @param state State.
 * @param case Number of confirmed cases.
 * @param death Number of confirmed deaths.
 * @param updated Updated time.
 */

data class CovidInfo (
    /* State. */
    @Json(name = "state")
    val state: kotlin.String? = null,
    /* Number of confirmed cases. */
    @Json(name = "case")
    val case: kotlin.Float? = null,
    /* Number of confirmed deaths. */
    @Json(name = "death")
    val death: kotlin.Float? = null,
    /* Updated time. */
    @Json(name = "updated")
    val updated: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

