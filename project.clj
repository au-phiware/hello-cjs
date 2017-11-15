(defproject hello-cjs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [org.clojure/clojurescript "1.9.854"]
                 [cljsjs/react "15.4.2-2"]
                 [cljsjs/react-dom "15.4.2-2"]
                 [cljsjs/react-dom-server "15.4.2-2"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"])
