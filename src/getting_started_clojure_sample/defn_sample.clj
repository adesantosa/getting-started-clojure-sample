(ns getting-started-clojure-sample.defn-sample)

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

(def hey {:name :last_name})

(defn testing
  [[key1 key2]]
  (println "First name" key1)
  (println "Second name" key2 ))

(println (map testing hey))
