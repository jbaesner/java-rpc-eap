# java-rpc-eap
JBoss and Web Logic applications communicate with each other using various forms of remote procedure calls

## Project Structure
1. There are two main directories `/ejb` and `/java-rmi`
2. Inside of each directory, there are another two directories that represent the scenarios `/jboss-to-jboss` and `jboss-to-weblogic` communication.
3. After selecting the scenario, the use-cases will be presented as directories as well. In this case, there will be a use-case for `basic-call` and `login-module`
4. `basic-call` represents a simple remote procedure call between two applications
5. `login-module` represents a remote procedure call between two applications with a layer of security on top of that, provided by the login module (using username/password credentials)

## Java RMI
### JBoss to JBoss
#### Run `basic-call`
#### Run `login-module`
### JBoss to WebLogic
#### Run `basic-call`
#### Run `login-module`

## EJB
### JBoss to JBoss
#### Run `basic-call`
#### Run `login-module`
### JBoss to WebLogic
#### Run `basic-call`
#### Run `login-module`
