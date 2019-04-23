(defproject wagjo/metrics-clojure-jvm "3.0.0-dre-SNAPSHOT"
  :description "Gluing together metrics-clojure and jvm instrumentation."
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[metrics-clojure "2.10.0"]
                 [io.dropwizard.metrics/metrics-jvm "4.0.5"]])
