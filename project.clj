(defproject elastic-beanstalk-guestbook "0.1.0-SNAPSHOT"
  :description "A simple guestbook for running on Elastic Beanstalk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-beanstalk "0.2.7"]
            [lein-ring "0.8.10"]]
  :ring {:handler elastic-beanstalk-guestbook.core/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.2.2"]
                 [ring/ring-jetty-adapter "1.2.2"]
                 [compojure "1.1.6"]])
