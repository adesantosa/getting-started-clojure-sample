(ns getting-started-clojure-sample.alura.intro.defn-sample)

(defn bar [a b & [c]]
  (if c
    (* a b c)
    (* a b 100)))

(defn baz [a b & {:keys [c d] :or {c 10 d 20}}]
  (* a b c d))

;===============================

;variable-arity functions

(defn motivation
  [phrase]
  (str "I am " phrase "!!"))

(defn mix
  [& phrase]
  (map motivation phrase))

(println (mix "André" "Father" "Husband" "Son"))


;=================================

;Destructuring

;In general, you can think of destructuring as instructing Clojure on how to associate names with values in a list, map, set, or vector.
(def hey {:name "André" :last_name "Santos"})

(defn testing
  [[val1 val2]]
  (let [hey (assoc hey :address "Antonio Pincinato")] hey))