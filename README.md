Simple [Bootique](http://bootique.io) demo app. To build do something like this:

```
git clone git@github.com:bootique-examples/bootique-rest-demo.git
cd bootique-rest-demo

mvn clean package
```
To print supported options:
```
java -jar target/bootique-rest-demo-2.0.jar 
```
To run with **default** config:
```
java -jar target/bootique-rest-demo-2.0.jar --server
```
Then open [http://127.0.0.1:8080/](http://127.0.0.1:8080/). 

To run with **custom** config:
```
java -jar target/bootique-rest-demo-2.0.jar --server --config=test.yml
```
Then open [http://127.0.0.1:9000/bq](http://127.0.0.1:9000/bq).
