// RCTCustomNativeModule.m
#import "RCTCustomNativeModule.h"
#import <React/RCTLog.h>

@implementation RCTCustomNativeModule

// To export a module named RCTCustomNativeModule
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(createCustomEvent:(NSString *)name location:(NSString *)location)
{
 RCTLogInfo(@"Pretending to create an event %@ at %@", name, location);
}


@end
