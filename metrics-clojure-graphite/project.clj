(defproject wagjo/metrics-clojure-graphite "3.0.0-dre-SNAPSHOT"
  :description "Graphite reporter integration for metrics-clojure"
  :url "https://github.com/sjl/metrics-clojure"
  :license {:name "MIT"}
  :profiles {:dev {:global-vars {*warn-on-reflection* true}}}
  :dependencies [[metrics-clojure "2.10.0"]
                 [io.dropwizard.metrics/metrics-graphite "4.0.5"]])
