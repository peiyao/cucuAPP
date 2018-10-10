pipeline(){
  agent any
  stages {
    
          stage ('Maven') {
                  steps {
                      sh 'mvn package -DskipTests' 
                  }

          }
          
          stage('TestDF') {
             steps {
          devicefarm appArtifact: 'sampleApp.apk', appiumJavaJUnitTest: '', appiumJavaTestNGTest: 'target/zip-with-dependencies.zip', appiumPythonTest: '', appiumVersionJunit: '1.4.16', appiumVersionPython: '1.4.16', appiumVersionTestng: '1.7.2', calabashFeatures: '', calabashProfile: '', calabashTags: '', deviceLatitude: 47.6204, deviceLocation: false, deviceLongitude: -122.3941, devicePoolName: 'Top Devices', environmentToRun: 'StandardEnvironment', eventCount: '', eventThrottle: '', extraData: false, extraDataArtifact: '', ifAppPerformanceMonitoring: true, ifBluetooth: true, ifGPS: true, ifNfc: true, ifVideoRecording: true, ifVpce: false, ifWebApp: false, ifWifi: true, ignoreRunError: false, isRunUnmetered: false, jobTimeoutMinutes: 60, junitArtifact: '', junitFilter: '', password: '', projectName: 'AppMaven', radioDetails: false, runName: '${BUILD_TAG}', seed: '', storeResults: false, testSpecName: 'Default TestSpec for Android Appium Java Junit', testToRun: 'APPIUM_JAVA_TESTNG', uiautomationArtifact: '', uiautomatorArtifact: '', uiautomatorFilter: '', username: '', vpceServiceName: '', xctestArtifact: '', xctestFilter: '', xctestUiArtifact: '', xctestUiFilter: ''
             }
          }
  }
}
