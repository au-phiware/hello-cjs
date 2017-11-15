(set-env!
  :dependencies '[[org.clojure/clojure "1.8.0"]
                  [org.clojure/clojurescript "1.9.946"]
                  [adzerk/boot-cljs "2.1.4"]]
  :source-paths #{"src"})

(require
  '[adzerk.boot-cljs :refer [cljs]])

(deftask dev
  "Build"
  [o optimizations VAL kw "cljs optimizations"]
  (comp
    (cljs :optimizations (or optimizations :none)
          :compiler-options
          {:target       :nodejs
           :install-deps true
           :npm-deps     {:react "15.6.2"
                          :react-dom "15.6.2"}
           :closure-warnings
           {:non-standard-jsdoc :off
            :global-this        :off}})
    (target)))
