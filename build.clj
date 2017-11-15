(require '[clojure.java.io :as io]
         '[cljs.build.api :as b])

(b/build (b/inputs "src")
  {:main       'hello-cjs.core
   :target     :nodejs
   :output-to  "main.js"
   :output-dir "out"
   :verbose    true
   :externs    ["process.js"]
   :foreign-libs (let [entry {:file (.getAbsolutePath (io/file "src/libs/npm_stuff.js"))
                              :provides ["libs.npm-stuff"]
                              :module-type :commonjs}]
                   (into [entry] (b/node-inputs [entry])))
   :optimizations :advanced
   :closure-warnings {:non-standard-jsdoc :off
                      :global-this :off}})

(System/exit 0)
