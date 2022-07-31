import React from 'react';
import { NativeModules, Button,StyleSheet,View, SafeAreaView, Platform } from 'react-native';
const { CustomNativeModule } = NativeModules;

const NewModuleButton = () => {

  const onPress = async () => {
    try {
      const e = await CustomNativeModule.createCustomEvent(
        'Party',
        'My House'
      );
      console.log("eventId",e)
      console.warn(`Created a new event with param ${e}`);
    } catch (e) {
      console.error(e);
    }
  };

  return (
    <SafeAreaView style={styles.mainContainer}>
      <View style={styles.container}>
        <Button
          title="Click to invoke your native module!"
          color="#841584"
          onPress={onPress}
        />
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container : {
    flex : 1,
    alignItems : "center",
    justifyContent : "center",
    backgroundColor : 'white'
  },
  mainContainer : {
    flex : 1
  }
})

export default NewModuleButton;