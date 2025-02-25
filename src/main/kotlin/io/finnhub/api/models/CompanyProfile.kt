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
 * @param address Address of company's headquarter.
 * @param city City of company's headquarter.
 * @param country Country of company's headquarter.
 * @param currency Currency used in company filings and financials.
 * @param estimateCurrency Currency used in Estimates data.
 * @param marketCapCurrency Currency used in market capitalization.
 * @param cusip CUSIP number.
 * @param sedol Sedol number.
 * @param description Company business summary.
 * @param exchange Listed exchange.
 * @param ggroup Industry group.
 * @param gind Industry.
 * @param gsector Sector.
 * @param gsubind Sub-industry.
 * @param isin ISIN number.
 * @param naicsNationalIndustry NAICS national industry.
 * @param naics NAICS industry.
 * @param naicsSector NAICS sector.
 * @param naicsSubsector NAICS subsector.
 * @param name Company name.
 * @param phone Company phone number.
 * @param state State of company's headquarter.
 * @param ticker Company symbol/ticker as used on the listed exchange.
 * @param weburl Company website.
 * @param ipo IPO date.
 * @param marketCapitalization Market Capitalization.
 * @param shareOutstanding Number of oustanding shares.
 * @param employeeTotal Number of employee.
 * @param logo Logo image.
 * @param finnhubIndustry Finnhub industry classification.
 */

data class CompanyProfile (

    /* Address of company's headquarter. */
    @Json(name = "address")
    val address: kotlin.String? = null,

    /* City of company's headquarter. */
    @Json(name = "city")
    val city: kotlin.String? = null,

    /* Country of company's headquarter. */
    @Json(name = "country")
    val country: kotlin.String? = null,

    /* Currency used in company filings and financials. */
    @Json(name = "currency")
    val currency: kotlin.String? = null,

    /* Currency used in Estimates data. */
    @Json(name = "estimateCurrency")
    val estimateCurrency: kotlin.String? = null,

    /* Currency used in market capitalization. */
    @Json(name = "marketCapCurrency")
    val marketCapCurrency: kotlin.String? = null,

    /* CUSIP number. */
    @Json(name = "cusip")
    val cusip: kotlin.String? = null,

    /* Sedol number. */
    @Json(name = "sedol")
    val sedol: kotlin.String? = null,

    /* Company business summary. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Listed exchange. */
    @Json(name = "exchange")
    val exchange: kotlin.String? = null,

    /* Industry group. */
    @Json(name = "ggroup")
    val ggroup: kotlin.String? = null,

    /* Industry. */
    @Json(name = "gind")
    val gind: kotlin.String? = null,

    /* Sector. */
    @Json(name = "gsector")
    val gsector: kotlin.String? = null,

    /* Sub-industry. */
    @Json(name = "gsubind")
    val gsubind: kotlin.String? = null,

    /* ISIN number. */
    @Json(name = "isin")
    val isin: kotlin.String? = null,

    /* NAICS national industry. */
    @Json(name = "naicsNationalIndustry")
    val naicsNationalIndustry: kotlin.String? = null,

    /* NAICS industry. */
    @Json(name = "naics")
    val naics: kotlin.String? = null,

    /* NAICS sector. */
    @Json(name = "naicsSector")
    val naicsSector: kotlin.String? = null,

    /* NAICS subsector. */
    @Json(name = "naicsSubsector")
    val naicsSubsector: kotlin.String? = null,

    /* Company name. */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* Company phone number. */
    @Json(name = "phone")
    val phone: kotlin.String? = null,

    /* State of company's headquarter. */
    @Json(name = "state")
    val state: kotlin.String? = null,

    /* Company symbol/ticker as used on the listed exchange. */
    @Json(name = "ticker")
    val ticker: kotlin.String? = null,

    /* Company website. */
    @Json(name = "weburl")
    val weburl: kotlin.String? = null,

    /* IPO date. */
    @Json(name = "ipo")
    val ipo: kotlin.String? = null,

    /* Market Capitalization. */
    @Json(name = "marketCapitalization")
    val marketCapitalization: kotlin.Float? = null,

    /* Number of oustanding shares. */
    @Json(name = "shareOutstanding")
    val shareOutstanding: kotlin.Float? = null,

    /* Number of employee. */
    @Json(name = "employeeTotal")
    val employeeTotal: kotlin.Float? = null,

    /* Logo image. */
    @Json(name = "logo")
    val logo: kotlin.String? = null,

    /* Finnhub industry classification. */
    @Json(name = "finnhubIndustry")
    val finnhubIndustry: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

