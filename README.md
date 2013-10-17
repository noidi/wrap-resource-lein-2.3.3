# Correct behavior of wrap-resource with Leiningen 2.3.2

    $ lein upgrade 2.3.2
    $ lein do clean, uberjar
    $ java -jar target/wrap-resource-bug-0.1.0-SNAPSHOT-standalone.jar
    $ curl -D - http://localhost:3000
    HTTP/1.1 200 OK
    Date: Thu, 17 Oct 2013 11:03:54 GMT
    Content-Type: text/html;charset=ISO-8859-1
    Content-Length: 13
    Server: Jetty(7.x.y-SNAPSHOT)
    
    Hello World!

# Incorrect behavior of wrap-resource with Leiningen 2.3.3

    $ lein upgrade 2.3.3
    $ lein do clean, uberjar
    $ java -jar target/wrap-resource-bug-0.1.0-SNAPSHOT-standalone.jar
    $ curl -D - http://localhost:3000
    HTTP/1.1 200 OK
    Date: Thu, 17 Oct 2013 11:13:46 GMT
    Last-Modified: Thu, 17 Oct 2013 11:05:21 GMT
    Content-Length: 0
    Server: Jetty(7.x.y-SNAPSHOT)
    
