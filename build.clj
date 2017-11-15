(require '[cljs.build.api :as b])

(b/build "src"
  {:main       'example.core
   :target     :nodejs
   :output-to  "out/main.js"
   :output-dir "out"
   :verbose    true
   :optimizations :none
   :install-deps true
   :npm-deps {:react "15.6.2"
              :react-dom "15.6.2"}
   :foreign-libs [{:file "src"
                   :module-type :es6}]
   :closure-warnings {:non-standard-jsdoc :off
                      :global-this :off}})
