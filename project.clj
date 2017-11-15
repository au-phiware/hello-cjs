(defproject hello-cjs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-RC1"]
                 [org.clojure/clojurescript "1.9.946"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"])
