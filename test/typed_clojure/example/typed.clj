(ns typed-clojure.example.typed
  (:require [typed-clojure.attempt2 :refer [+T require-typed]]
            [typed-clojure.example.typed2 :refer [add-twice]]))

(require-typed typed-clojure.example.typed2)

(+T double-num [Number -> Number])
(defn double-num [n]
  (add-twice n))