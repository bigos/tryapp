(ns user
  (:require [mount.core :as mount]
            [tryapp.figwheel :refer [start-fw stop-fw cljs]]
            tryapp.core))

(defn start []
  (mount/start-without #'tryapp.core/http-server
                       #'tryapp.core/repl-server))

(defn stop []
  (mount/stop-except #'tryapp.core/http-server
                     #'tryapp.core/repl-server))

(defn restart []
  (stop)
  (start))


