(ns tryapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[tryapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[tryapp has shut down successfully]=-"))
   :middleware identity})
