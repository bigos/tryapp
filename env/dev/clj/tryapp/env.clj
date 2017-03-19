(ns tryapp.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [tryapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[tryapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[tryapp has shut down successfully]=-"))
   :middleware wrap-dev})
