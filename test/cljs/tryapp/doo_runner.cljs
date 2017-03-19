(ns tryapp.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [tryapp.core-test]))

(doo-tests 'tryapp.core-test)

