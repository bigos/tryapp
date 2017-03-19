(ns tryapp.app
  (:require [tryapp.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
