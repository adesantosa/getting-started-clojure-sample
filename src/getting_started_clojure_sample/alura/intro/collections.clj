(ns getting-started-clojure-sample.alura.intro.collections)

(def price [10 20 30])

(println (price 2))
(println (get price 2))

;get already has try catch
(println (get price 3))

; Let's update same value into the vector
(print (update price 0 dec))
(print (update price 2 (partial str "Just add new value")))
(print (update price 0 #(str "Just add new value" %)))

;using map
(println (map + price [10 10 11]))

(println (map inc price))

(println (map #(vector (first %)) ["Sarah" "Anne" "Dory" "Henry"]))

(println (map #(str "I you so much " % "!") ["Sarah" "Anne" "Dory" "Henry"]))

(map + [1 2 3] (iterate inc 1))

;using filter
(println map( #(vector (second %)) (filter even? price)))


;using reduce
(println (reduce + price))

(println (reduce #(+ %1 %2) (range 10)))
