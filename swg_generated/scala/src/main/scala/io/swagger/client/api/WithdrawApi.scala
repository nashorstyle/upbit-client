/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Error
import io.swagger.client.model.Number
import io.swagger.client.model.Withdraw
import io.swagger.client.model.WithdrawChance
import io.swagger.client.model.WithdrawCoin
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class WithdrawApi(
  val defBasePath: String = "https://api.upbit.com/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new WithdrawApiAsyncHelper(client, config)

  /**
   * 출금 가능 정보
   * ## 해당 통화의 가능한 출금 정보를 확인한다. 
   *
   * @param currency Currency Symbol  
   * @return WithdrawChance
   */
  def withdrawChance(currency: String): Option[WithdrawChance] = {
    val await = Try(Await.result(withdrawChanceAsync(currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 출금 가능 정보 asynchronously
   * ## 해당 통화의 가능한 출금 정보를 확인한다. 
   *
   * @param currency Currency Symbol  
   * @return Future(WithdrawChance)
   */
  def withdrawChanceAsync(currency: String): Future[WithdrawChance] = {
      helper.withdrawChance(currency)
  }

  /**
   * 코인 출금하기
   * ## 코인 출금을 요청한다. **NOTE**: 바로출금 이용 시 유의사항 업비트 회원의 주소가 아닌 주소로 바로출금을 요청하는 경우, 출금이 정상적으로 수행되지 않습니다. 반드시 주소를 확인 후 출금을 진행하시기 바랍니다. 
   *
   * @param currency Currency 코드  
   * @param amount 출금 수량  
   * @param address 출금 가능 주소에 등록된 출금 주소  
   * @param secondaryAddress 2차 출금 주소 (필요한 코인에 한해서)  (optional)
   * @param transactionType 출금 유형 - default : 일반출금 - internal : 바로출금  (optional)
   * @return WithdrawCoin
   */
  def withdrawCoin(currency: String, amount: String, address: String, secondaryAddress: Option[String] = None, transactionType: Option[String] = None): Option[WithdrawCoin] = {
    val await = Try(Await.result(withdrawCoinAsync(currency, amount, address, secondaryAddress, transactionType), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 코인 출금하기 asynchronously
   * ## 코인 출금을 요청한다. **NOTE**: 바로출금 이용 시 유의사항 업비트 회원의 주소가 아닌 주소로 바로출금을 요청하는 경우, 출금이 정상적으로 수행되지 않습니다. 반드시 주소를 확인 후 출금을 진행하시기 바랍니다. 
   *
   * @param currency Currency 코드  
   * @param amount 출금 수량  
   * @param address 출금 가능 주소에 등록된 출금 주소  
   * @param secondaryAddress 2차 출금 주소 (필요한 코인에 한해서)  (optional)
   * @param transactionType 출금 유형 - default : 일반출금 - internal : 바로출금  (optional)
   * @return Future(WithdrawCoin)
   */
  def withdrawCoinAsync(currency: String, amount: String, address: String, secondaryAddress: Option[String] = None, transactionType: Option[String] = None): Future[WithdrawCoin] = {
      helper.withdrawCoin(currency, amount, address, secondaryAddress, transactionType)
  }

  /**
   * 개별 출금 조회
   * ## 출금 UUID를 통해 개별 출금 정보를 조회한다. 
   *
   * @param uuid 출금 UUID  (optional)
   * @param txid 출금 TXID  (optional)
   * @param currency Currency 코드  (optional)
   * @return Withdraw
   */
  def withdrawInfo(uuid: Option[String] = None, txid: Option[String] = None, currency: Option[String] = None): Option[Withdraw] = {
    val await = Try(Await.result(withdrawInfoAsync(uuid, txid, currency), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 개별 출금 조회 asynchronously
   * ## 출금 UUID를 통해 개별 출금 정보를 조회한다. 
   *
   * @param uuid 출금 UUID  (optional)
   * @param txid 출금 TXID  (optional)
   * @param currency Currency 코드  (optional)
   * @return Future(Withdraw)
   */
  def withdrawInfoAsync(uuid: Option[String] = None, txid: Option[String] = None, currency: Option[String] = None): Future[Withdraw] = {
      helper.withdrawInfo(uuid, txid, currency)
  }

  /**
   * 출금 리스트 조회
   * ## 출금 리스트를 조회한다. 
   *
   * @param currency Currency 코드  (optional)
   * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리 완료 - almost_accepted : 출금대기중 - rejected : 거부 - accepted : 승인됨 - processing : 처리 중 - done : 완료 - canceled : 취소됨  (optional)
   * @param uuids 출금 UUID의 목록  (optional)
   * @param txids 출금 TXID의 목록  (optional)
   * @param limit 개수 제한 (default: 100, max: 100)  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return List[Withdraw]
   */
  def withdrawInfoAll(currency: Option[String] = None, state: Option[String] = None, uuids: Option[List[String]] = None, txids: Option[List[String]] = None, limit: Option[Number] = None, page: Option[Number] = None, orderBy: Option[String] = None): Option[List[Withdraw]] = {
    val await = Try(Await.result(withdrawInfoAllAsync(currency, state, uuids, txids, limit, page, orderBy), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 출금 리스트 조회 asynchronously
   * ## 출금 리스트를 조회한다. 
   *
   * @param currency Currency 코드  (optional)
   * @param state 출금 상태 - submitting : 처리 중 - submitted : 처리 완료 - almost_accepted : 출금대기중 - rejected : 거부 - accepted : 승인됨 - processing : 처리 중 - done : 완료 - canceled : 취소됨  (optional)
   * @param uuids 출금 UUID의 목록  (optional)
   * @param txids 출금 TXID의 목록  (optional)
   * @param limit 개수 제한 (default: 100, max: 100)  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return Future(List[Withdraw])
   */
  def withdrawInfoAllAsync(currency: Option[String] = None, state: Option[String] = None, uuids: Option[List[String]] = None, txids: Option[List[String]] = None, limit: Option[Number] = None, page: Option[Number] = None, orderBy: Option[String] = None): Future[List[Withdraw]] = {
      helper.withdrawInfoAll(currency, state, uuids, txids, limit, page, orderBy)
  }

  /**
   * 원화 출금하기
   * ## 원화 출금을 요청한다. 등록된 출금 계좌로 출금된다. 
   *
   * @param amount 출금 원화 수량  
   * @return Withdraw
   */
  def withdrawKrw(amount: String): Option[Withdraw] = {
    val await = Try(Await.result(withdrawKrwAsync(amount), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 원화 출금하기 asynchronously
   * ## 원화 출금을 요청한다. 등록된 출금 계좌로 출금된다. 
   *
   * @param amount 출금 원화 수량  
   * @return Future(Withdraw)
   */
  def withdrawKrwAsync(amount: String): Future[Withdraw] = {
      helper.withdrawKrw(amount)
  }

}

class WithdrawApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def withdrawChance(currency: String)(implicit reader: ClientResponseReader[WithdrawChance]): Future[WithdrawChance] = {
    // create path and map variables
    val path = (addFmt("/withdraws/chance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency == null) throw new Exception("Missing required parameter 'currency' when calling WithdrawApi->withdrawChance")

    queryParams += "currency" -> currency.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def withdrawCoin(currency: String,
    amount: String,
    address: String,
    secondaryAddress: Option[String] = None,
    transactionType: Option[String] = None
    )(implicit reader: ClientResponseReader[WithdrawCoin]): Future[WithdrawCoin] = {
    // create path and map variables
    val path = (addFmt("/withdraws/coin"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (currency == null) throw new Exception("Missing required parameter 'currency' when calling WithdrawApi->withdrawCoin")

    if (amount == null) throw new Exception("Missing required parameter 'amount' when calling WithdrawApi->withdrawCoin")

    if (address == null) throw new Exception("Missing required parameter 'address' when calling WithdrawApi->withdrawCoin")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def withdrawInfo(uuid: Option[String] = None,
    txid: Option[String] = None,
    currency: Option[String] = None
    )(implicit reader: ClientResponseReader[Withdraw]): Future[Withdraw] = {
    // create path and map variables
    val path = (addFmt("/withdraw"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    uuid match {
      case Some(param) => queryParams += "uuid" -> param.toString
      case _ => queryParams
    }
    txid match {
      case Some(param) => queryParams += "txid" -> param.toString
      case _ => queryParams
    }
    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def withdrawInfoAll(currency: Option[String] = None,
    state: Option[String] = None,
    uuids: Option[List[String]] = None,
    txids: Option[List[String]] = None,
    limit: Option[Number] = None,
    page: Option[Number] = None,
    orderBy: Option[String] = None
    )(implicit reader: ClientResponseReader[List[Withdraw]]): Future[List[Withdraw]] = {
    // create path and map variables
    val path = (addFmt("/withdraws"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    currency match {
      case Some(param) => queryParams += "currency" -> param.toString
      case _ => queryParams
    }
    state match {
      case Some(param) => queryParams += "state" -> param.toString
      case _ => queryParams
    }
    uuids match {
      case Some(param) => queryParams += "uuids" -> param.toString
      case _ => queryParams
    }
    txids match {
      case Some(param) => queryParams += "txids" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    orderBy match {
      case Some(param) => queryParams += "order_by" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def withdrawKrw(amount: String)(implicit reader: ClientResponseReader[Withdraw]): Future[Withdraw] = {
    // create path and map variables
    val path = (addFmt("/withdraws/krw"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (amount == null) throw new Exception("Missing required parameter 'amount' when calling WithdrawApi->withdrawKrw")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}