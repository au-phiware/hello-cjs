(ns hello-cjs.core
  (:require [libs.npm-stuff :as npm-stuff]))

(enable-console-print!)

(println (npm-stuff/renderSomething))
