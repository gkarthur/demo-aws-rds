# demo-aws-rds
web application to demonstrate aws rds service

## build
mvn clean install

## run application (jar mode)
java -jar target/demo-aws-rds

## test application via browser

http://localhost:8080/catoloni/brazoloni/22

Result:
{"id":22,"name":"brazoloni22"}

## deploy application (EE server mode)
copy demo-aws-rds.war in folder server dedicated, and restart server if needed

## test application via browser

http://localhost:8080/demo-aws-rds/brazoloni/22

