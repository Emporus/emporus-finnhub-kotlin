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


import com.squareup.moshi.Json
import java.io.Serializable

/**
 * 
 *
 * @param amountFrom Transaction amount from.
 * @param amountTo Transaction amount to.
 * @param assetName Asset name.
 * @param filingDate Filing date.
 * @param name Name of the representative.
 * @param ownerType Owner Type.
 * @param position Position.
 * @param symbol Symbol.
 * @param transactionDate Transaction date.
 * @param transactionType Transaction type <code>Sale</code> or <code>Purchase</code>.
 */

data class CongressionalTransaction (

    /* Transaction amount from. */
    @Json(name = "amountFrom")
    val amountFrom: kotlin.Float? = null,

    /* Transaction amount to. */
    @Json(name = "amountTo")
    val amountTo: kotlin.Float? = null,

    /* Asset name. */
    @Json(name = "assetName")
    val assetName: kotlin.String? = null,

    /* Filing date. */
    @Json(name = "filingDate")
    val filingDate: kotlin.String? = null,

    /* Name of the representative. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Owner Type. */
    @Json(name = "ownerType")
    val ownerType: kotlin.String? = null,

    /* Position. */
    @Json(name = "position")
    val position: kotlin.String? = null,

    /* Symbol. */
    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    /* Transaction date. */
    @Json(name = "transactionDate")
    val transactionDate: kotlin.String? = null,

    /* Transaction type <code>Sale</code> or <code>Purchase</code>. */
    @Json(name = "transactionType")
    val transactionType: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

