# java-rpc-eap
JBoss and Web Logic applications communicate with each other using various forms of remote procedure calls

## Project Structure
1. There are two main directories `/ejb` and `/java-rmi`
2. Inside of each directory, there are another two directories that represent the scenarios `/jboss-to-jboss` and `jboss-to-weblogic` communication.
3. After selecting the scenario, the use-cases will be presented as directories as well. In this case, there will be a use-case for `basic-call` and `login-module`
4. `basic-call` represents a simple remote procedure call between two applications
5. `login-module` represents a remote procedure call between two applications with a layer of security on top of that, provided by the login module (using username/password credentials)

## Downloads
1. This project uses Red Hat JBoss 7.4.X and can be downloaded at https://developers.redhat.com/products/eap/download
2. For Web Logic, please download the version 14.1.1 at https://www.oracle.com/middleware/technologies/fusionmiddleware-downloads.html

## Java RMI
> Run `rmiregistry` locally before running the server/client programs. Just run on your terminal `$ rmiregistry` inside your server `target/classes` and it will run the registry daemon on port `1099`

### JBoss to JBoss
#### Run `basic-call`
1. Run the server
```bash
$ java-rmi-server % java -cp target/java-rmi-server-1.0-SNAPSHOT.jar com.alizardo.RMIServer
Server ready
```

2. Run the client
```bash
$ java -cp target/java-rmi-client-1.0-SNAPSHOT.jar com.alizardo.RMIClient
response: Hello!
```
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
