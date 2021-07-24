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
 * @param name Participant's name
 * @param description Participant's description
 * @param role Whether the speak is a company's executive or an analyst
 */

data class TranscriptParticipant (
    /* Participant's name */
    @Json(name = "name")
    val name: kotlin.String? = null,
    /* Participant's description */
    @Json(name = "description")
    val description: kotlin.String? = null,
    /* Whether the speak is a company's executive or an analyst */
    @Json(name = "role")
    val role: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

