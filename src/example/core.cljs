(ns example.core
  (:require [react :refer [createElement]]
            ["react-dom/server" :as ReactDOMServer :refer [renderToString]]))

(js/console.log (renderToString (createElement "div" nil "Hello World!")))
