(defproject elastic-beanstalk-guestbook "0.1.0-SNAPSHOT"
  :description "A simple guestbook for running on Elastic Beanstalk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [liberator "0.9.0"]
                 [ring "1.2.0"]
                 [clojurewerkz/route-one "1.0.0-rc3"]
                 [compojure "1.1.5"]])
