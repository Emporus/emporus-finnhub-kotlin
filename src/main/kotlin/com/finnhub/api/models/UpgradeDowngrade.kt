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
package com.finnhub.api.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 
 * @param symbol Company symbol.
 * @param gradeTime Upgrade/downgrade time in UNIX timestamp.
 * @param fromGrade From grade.
 * @param toGrade To grade.
 * @param company Company/analyst who did the upgrade/downgrade.
 * @param action Action can take any of the following values: <code>up(upgrade), down(downgrade), main(maintains), init(initiate), reit(reiterate)</code>.
 */

@Serializable
data class UpgradeDowngrade (
    /* Company symbol. */
    @SerialName("symbol")
    val symbol: String? = null,
    /* Upgrade/downgrade time in UNIX timestamp. */
    @SerialName("gradeTime")
    val gradeTime: Long? = null,
    /* From grade. */
    @SerialName("fromGrade")
    val fromGrade: String? = null,
    /* To grade. */
    @SerialName("toGrade")
    val toGrade: String? = null,
    /* Company/analyst who did the upgrade/downgrade. */
    @SerialName("company")
    val company: String? = null,
    /* Action can take any of the following values: <code>up(upgrade), down(downgrade), main(maintains), init(initiate), reit(reiterate)</code>. */
    @SerialName("action")
    val action: String? = null
) {
	companion object {
    }

}

