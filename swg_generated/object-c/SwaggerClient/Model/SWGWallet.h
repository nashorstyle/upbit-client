#import <Foundation/Foundation.h>
#import "SWGObject.h"

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





@protocol SWGWallet
@end

@interface SWGWallet : SWGObject

/* 화폐를 의미하는 영문 대문자 코드 [optional]
 */
@property(nonatomic) NSString* currency;
/* 입출금 상태 - working : 입출금 가능 - withdraw_only : 출금만 가능 - deposit_only : 입금만 가능 - paused : 입출금 중단 - unsupported : 입출금 미지원  [optional]
 */
@property(nonatomic) NSString* walletState;
/* 블록 상태 - normal : 정상 - delayed : 지연 - inactive : 비활성 (점검 등)  [optional]
 */
@property(nonatomic) NSString* blockState;
/* 블록 높이 [optional]
 */
@property(nonatomic) NSNumber* blockHeight;
/* 블록 갱신 시각 [optional]
 */
@property(nonatomic) NSString* blockUpdatedAt;

@end