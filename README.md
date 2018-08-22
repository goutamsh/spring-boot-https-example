# Example of using HTTPS using self signed SSL certificates

Command to generate JKS file

keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks


Open URL with https as below

https://localhost:8080/rest/hello?name=GitHub