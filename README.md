# Install Graalvm
    export GRAALVM_HOME=~/.sdkman/candidates/java/19.3.0.r11-grl

# Install native-image
in $GRAALVM_HOME/bin, 
    
    gu install native-image 

# Install some c++ lib
    sudo apt-get install zlib1g-dev libgtk-3-dev

# Compile
    mvn compile client:compile client:link
 
# Run Native 
    mvn client:run
 
See https://github.com/gluonhq/client-samples/tree/master/Maven/HelloFX


TODO test jpackage from jdk 14

