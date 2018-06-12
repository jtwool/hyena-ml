(defproject hyena-ml "0.1.0-SNAPSHOT"
  :description "Demonstration of Smile in Clojure "
  :url "jtwolohan.com"
  :license {:name "Mozilla Public License v.2.0"
              :url "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.github.haifengl/smile-netlib "1.5.1"]]
  :main ^:skip-aot hyena-ml.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
