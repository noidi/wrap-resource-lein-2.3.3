(ns wrap-resource-bug.core
  (:gen-class)
  (:require [ring.adapter.jetty :as j]
            [ring.middleware.resource :refer [wrap-resource]]))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World!\n"})

(defn -main []
  (j/run-jetty (wrap-resource handler "public") {:port 3000}))
