(ns getting-started-clojure-sample.def-sample)

;;Assign a Function to a Variable

(def say-hello (fn [name] (str "Hello " name)))

(say-hello "World")
;;"Hello World"

;;the same but using an anonymous function
(def say-hello #(str "Hello " %))

(say-hello "World")
;;"Hello World"

;;anonymous function using two arguments
(def hello-doc #(str "Hello " %1 %2))

(hello-doc "Dr." "House")
;;"Hello Dr.House"