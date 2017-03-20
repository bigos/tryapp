(ns tryapp.core
  (:use [jayq.core :only [$ css html]]))

(defn mount-components []
  (let [content (js/document.getElementById "app")]
    (while (.hasChildNodes content)
      (.removeChild content (.-lastChild content)))
    (.appendChild content (js/document.createTextNode "Welcome to tryapp"))))

(defn init! []
  (mount-components))

(def $app ($ :#app))

(-> $app
    (css {:background "#aaddff"}))

(-> ($ :body)
    (css {:background "yellow"}))

;;; jQuery in REPL
;;; also following works in REPL
;; (.toggle (js/jQuery "#app"))
