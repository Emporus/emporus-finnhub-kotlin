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
 * @param symbol Symbol.
 * @param date Ex-Dividend date.
 * @param amount Amount in local currency.
 * @param adjustedAmount Adjusted dividend.
 * @param payDate Pay date.
 * @param recordDate Record date.
 * @param declarationDate Declaration date.
 * @param currency Currency.
 */

data class Dividends (
    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,
    /* Ex-Dividend date. */
    @Json(name = "date")
    val date: kotlin.String? = null,
    /* Amount in local currency. */
    @Json(name = "amount")
    val amount: kotlin.Float? = null,
    /* Adjusted dividend. */
    @Json(name = "adjustedAmount")
    val adjustedAmount: kotlin.Float? = null,
    /* Pay date. */
    @Json(name = "payDate")
    val payDate: kotlin.String? = null,
    /* Record date. */
    @Json(name = "recordDate")
    val recordDate: kotlin.String? = null,
    /* Declaration date. */
    @Json(name = "declarationDate")
    val declarationDate: kotlin.String? = null,
    /* Currency. */
    @Json(name = "currency")
    val currency: kotlin.String? = null
) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

