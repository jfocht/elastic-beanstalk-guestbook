(ns elastic-beanstalk-guestbook.core
  (:require [compojure.route :as route])
  (:use [compojure.core]))

(defn hello-handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World, V3!"})

(defroutes handler
  (HEAD "/" [] "")
  (GET "/" [] hello-handler)
  (route/not-found "<h1>Page not found</h1>"))
