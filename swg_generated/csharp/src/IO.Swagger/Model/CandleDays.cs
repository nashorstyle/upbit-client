/* 
 * Upbit Open API
 *
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.1.6
 * Contact: ujhin942@gmail.com
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = IO.Swagger.Client.SwaggerDateConverter;

namespace IO.Swagger.Model
{
    /// <summary>
    /// CandleDays
    /// </summary>
    [DataContract]
    public partial class CandleDays :  IEquatable<CandleDays>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CandleDays" /> class.
        /// </summary>
        /// <param name="market">마켓명.</param>
        /// <param name="candleDateTimeUtc">캔들 기준 시각 (UTC 기준).</param>
        /// <param name="candleDateTimeKst">캔들 기준 시각 (KST 기준).</param>
        /// <param name="openingPrice">시가.</param>
        /// <param name="highPrice">고가.</param>
        /// <param name="lowPrice">저가.</param>
        /// <param name="tradePrice">종가.</param>
        /// <param name="timestamp">해당 캔들에서 마지막 틱이 저장된 시각.</param>
        /// <param name="candleAccTradePrice">누적 거래 금액.</param>
        /// <param name="candleAccTradeVolume">누적 거래량.</param>
        /// <param name="prevClosingPrice">전일 종가 (UTC 0시 기준).</param>
        /// <param name="changePrice">전일 종가 대비 변화 금액.</param>
        /// <param name="changeRate">전일 종가 대비 변화량.</param>
        /// <param name="convertedTradePrice">종가 환산 화폐 단위로 환산된 가격 (요청에 convertingPriceUnit 파라미터 없을 시 해당 필드 포함되지 않음.) .</param>
        public CandleDays(string market = default(string), string candleDateTimeUtc = default(string), string candleDateTimeKst = default(string), double? openingPrice = default(double?), double? highPrice = default(double?), double? lowPrice = default(double?), double? tradePrice = default(double?), decimal? timestamp = default(decimal?), double? candleAccTradePrice = default(double?), double? candleAccTradeVolume = default(double?), double? prevClosingPrice = default(double?), double? changePrice = default(double?), double? changeRate = default(double?), double? convertedTradePrice = default(double?))
        {
            this.Market = market;
            this.CandleDateTimeUtc = candleDateTimeUtc;
            this.CandleDateTimeKst = candleDateTimeKst;
            this.OpeningPrice = openingPrice;
            this.HighPrice = highPrice;
            this.LowPrice = lowPrice;
            this.TradePrice = tradePrice;
            this.Timestamp = timestamp;
            this.CandleAccTradePrice = candleAccTradePrice;
            this.CandleAccTradeVolume = candleAccTradeVolume;
            this.PrevClosingPrice = prevClosingPrice;
            this.ChangePrice = changePrice;
            this.ChangeRate = changeRate;
            this.ConvertedTradePrice = convertedTradePrice;
        }
        
        /// <summary>
        /// 마켓명
        /// </summary>
        /// <value>마켓명</value>
        [DataMember(Name="market", EmitDefaultValue=false)]
        public string Market { get; set; }

        /// <summary>
        /// 캔들 기준 시각 (UTC 기준)
        /// </summary>
        /// <value>캔들 기준 시각 (UTC 기준)</value>
        [DataMember(Name="candle_date_time_utc", EmitDefaultValue=false)]
        public string CandleDateTimeUtc { get; set; }

        /// <summary>
        /// 캔들 기준 시각 (KST 기준)
        /// </summary>
        /// <value>캔들 기준 시각 (KST 기준)</value>
        [DataMember(Name="candle_date_time_kst", EmitDefaultValue=false)]
        public string CandleDateTimeKst { get; set; }

        /// <summary>
        /// 시가
        /// </summary>
        /// <value>시가</value>
        [DataMember(Name="opening_price", EmitDefaultValue=false)]
        public double? OpeningPrice { get; set; }

        /// <summary>
        /// 고가
        /// </summary>
        /// <value>고가</value>
        [DataMember(Name="high_price", EmitDefaultValue=false)]
        public double? HighPrice { get; set; }

        /// <summary>
        /// 저가
        /// </summary>
        /// <value>저가</value>
        [DataMember(Name="low_price", EmitDefaultValue=false)]
        public double? LowPrice { get; set; }

        /// <summary>
        /// 종가
        /// </summary>
        /// <value>종가</value>
        [DataMember(Name="trade_price", EmitDefaultValue=false)]
        public double? TradePrice { get; set; }

        /// <summary>
        /// 해당 캔들에서 마지막 틱이 저장된 시각
        /// </summary>
        /// <value>해당 캔들에서 마지막 틱이 저장된 시각</value>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public decimal? Timestamp { get; set; }

        /// <summary>
        /// 누적 거래 금액
        /// </summary>
        /// <value>누적 거래 금액</value>
        [DataMember(Name="candle_acc_trade_price", EmitDefaultValue=false)]
        public double? CandleAccTradePrice { get; set; }

        /// <summary>
        /// 누적 거래량
        /// </summary>
        /// <value>누적 거래량</value>
        [DataMember(Name="candle_acc_trade_volume", EmitDefaultValue=false)]
        public double? CandleAccTradeVolume { get; set; }

        /// <summary>
        /// 전일 종가 (UTC 0시 기준)
        /// </summary>
        /// <value>전일 종가 (UTC 0시 기준)</value>
        [DataMember(Name="prev_closing_price", EmitDefaultValue=false)]
        public double? PrevClosingPrice { get; set; }

        /// <summary>
        /// 전일 종가 대비 변화 금액
        /// </summary>
        /// <value>전일 종가 대비 변화 금액</value>
        [DataMember(Name="change_price", EmitDefaultValue=false)]
        public double? ChangePrice { get; set; }

        /// <summary>
        /// 전일 종가 대비 변화량
        /// </summary>
        /// <value>전일 종가 대비 변화량</value>
        [DataMember(Name="change_rate", EmitDefaultValue=false)]
        public double? ChangeRate { get; set; }

        /// <summary>
        /// 종가 환산 화폐 단위로 환산된 가격 (요청에 convertingPriceUnit 파라미터 없을 시 해당 필드 포함되지 않음.) 
        /// </summary>
        /// <value>종가 환산 화폐 단위로 환산된 가격 (요청에 convertingPriceUnit 파라미터 없을 시 해당 필드 포함되지 않음.) </value>
        [DataMember(Name="converted_trade_price", EmitDefaultValue=false)]
        public double? ConvertedTradePrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CandleDays {\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  CandleDateTimeUtc: ").Append(CandleDateTimeUtc).Append("\n");
            sb.Append("  CandleDateTimeKst: ").Append(CandleDateTimeKst).Append("\n");
            sb.Append("  OpeningPrice: ").Append(OpeningPrice).Append("\n");
            sb.Append("  HighPrice: ").Append(HighPrice).Append("\n");
            sb.Append("  LowPrice: ").Append(LowPrice).Append("\n");
            sb.Append("  TradePrice: ").Append(TradePrice).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  CandleAccTradePrice: ").Append(CandleAccTradePrice).Append("\n");
            sb.Append("  CandleAccTradeVolume: ").Append(CandleAccTradeVolume).Append("\n");
            sb.Append("  PrevClosingPrice: ").Append(PrevClosingPrice).Append("\n");
            sb.Append("  ChangePrice: ").Append(ChangePrice).Append("\n");
            sb.Append("  ChangeRate: ").Append(ChangeRate).Append("\n");
            sb.Append("  ConvertedTradePrice: ").Append(ConvertedTradePrice).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CandleDays);
        }

        /// <summary>
        /// Returns true if CandleDays instances are equal
        /// </summary>
        /// <param name="input">Instance of CandleDays to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CandleDays input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.CandleDateTimeUtc == input.CandleDateTimeUtc ||
                    (this.CandleDateTimeUtc != null &&
                    this.CandleDateTimeUtc.Equals(input.CandleDateTimeUtc))
                ) && 
                (
                    this.CandleDateTimeKst == input.CandleDateTimeKst ||
                    (this.CandleDateTimeKst != null &&
                    this.CandleDateTimeKst.Equals(input.CandleDateTimeKst))
                ) && 
                (
                    this.OpeningPrice == input.OpeningPrice ||
                    (this.OpeningPrice != null &&
                    this.OpeningPrice.Equals(input.OpeningPrice))
                ) && 
                (
                    this.HighPrice == input.HighPrice ||
                    (this.HighPrice != null &&
                    this.HighPrice.Equals(input.HighPrice))
                ) && 
                (
                    this.LowPrice == input.LowPrice ||
                    (this.LowPrice != null &&
                    this.LowPrice.Equals(input.LowPrice))
                ) && 
                (
                    this.TradePrice == input.TradePrice ||
                    (this.TradePrice != null &&
                    this.TradePrice.Equals(input.TradePrice))
                ) && 
                (
                    this.Timestamp == input.Timestamp ||
                    (this.Timestamp != null &&
                    this.Timestamp.Equals(input.Timestamp))
                ) && 
                (
                    this.CandleAccTradePrice == input.CandleAccTradePrice ||
                    (this.CandleAccTradePrice != null &&
                    this.CandleAccTradePrice.Equals(input.CandleAccTradePrice))
                ) && 
                (
                    this.CandleAccTradeVolume == input.CandleAccTradeVolume ||
                    (this.CandleAccTradeVolume != null &&
                    this.CandleAccTradeVolume.Equals(input.CandleAccTradeVolume))
                ) && 
                (
                    this.PrevClosingPrice == input.PrevClosingPrice ||
                    (this.PrevClosingPrice != null &&
                    this.PrevClosingPrice.Equals(input.PrevClosingPrice))
                ) && 
                (
                    this.ChangePrice == input.ChangePrice ||
                    (this.ChangePrice != null &&
                    this.ChangePrice.Equals(input.ChangePrice))
                ) && 
                (
                    this.ChangeRate == input.ChangeRate ||
                    (this.ChangeRate != null &&
                    this.ChangeRate.Equals(input.ChangeRate))
                ) && 
                (
                    this.ConvertedTradePrice == input.ConvertedTradePrice ||
                    (this.ConvertedTradePrice != null &&
                    this.ConvertedTradePrice.Equals(input.ConvertedTradePrice))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
                if (this.CandleDateTimeUtc != null)
                    hashCode = hashCode * 59 + this.CandleDateTimeUtc.GetHashCode();
                if (this.CandleDateTimeKst != null)
                    hashCode = hashCode * 59 + this.CandleDateTimeKst.GetHashCode();
                if (this.OpeningPrice != null)
                    hashCode = hashCode * 59 + this.OpeningPrice.GetHashCode();
                if (this.HighPrice != null)
                    hashCode = hashCode * 59 + this.HighPrice.GetHashCode();
                if (this.LowPrice != null)
                    hashCode = hashCode * 59 + this.LowPrice.GetHashCode();
                if (this.TradePrice != null)
                    hashCode = hashCode * 59 + this.TradePrice.GetHashCode();
                if (this.Timestamp != null)
                    hashCode = hashCode * 59 + this.Timestamp.GetHashCode();
                if (this.CandleAccTradePrice != null)
                    hashCode = hashCode * 59 + this.CandleAccTradePrice.GetHashCode();
                if (this.CandleAccTradeVolume != null)
                    hashCode = hashCode * 59 + this.CandleAccTradeVolume.GetHashCode();
                if (this.PrevClosingPrice != null)
                    hashCode = hashCode * 59 + this.PrevClosingPrice.GetHashCode();
                if (this.ChangePrice != null)
                    hashCode = hashCode * 59 + this.ChangePrice.GetHashCode();
                if (this.ChangeRate != null)
                    hashCode = hashCode * 59 + this.ChangeRate.GetHashCode();
                if (this.ConvertedTradePrice != null)
                    hashCode = hashCode * 59 + this.ConvertedTradePrice.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}