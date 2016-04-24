# sonarqube-example
An example project for SonarQube

To run sonarqube and get code coverage, use this maven command:

mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install sonar:sonar -Pcoverage-per-test
