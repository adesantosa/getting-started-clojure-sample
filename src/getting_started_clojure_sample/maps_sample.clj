(ns getting-started-clojure-sample.maps-sample)


(def family {:wife     {:name "Anne" :age 31}
             :daughter {:name "Sarah" :age 3}
             :son      {:name "Henry" :age 0}
             :pet      {:name "Dory" :age 4}})

(println (assoc family :husband "André"))

(println family)

(println (dissoc family :husband "André"))

(println (:daughter family))

;(println (update family :wife "t"))

(println (update-in family [:wife :age] inc))

; thread first
;(println (-> family :wife :name count))

; ===========================

(defn who-are-you? [[key value]] (println key "is" value))

(println (map who-are-you? family))

(defn family-total-age [family] (+ (:age family)))

;thread last
(defn total
  [family]
  (->> family
       vals
       (map family-total-age)
       (reduce +)))

(println (total family))



;==========================

;first variation

(defn young? [[key1 key2]] (<= (key2 :age) 5))

(println (filter young? family))

;second variation

(defn young? [members] (<= (members :age) 2))

(filter #(young? (second %)) family)


;==========================

;(def old? (comp not young?))
(defn old? [members] (not (young? members)))

(println (old? {:age 15}))
(println (old? {:age 1}))


(println ((comp not young?) {:age 1}))



(def clientes
  [{:nome         "Guilherme"
    :certificados ["Clojure" "Java" "Machine Learning"]}
   {:nome         "Paulo"
    :certificados ["Java" "Ciência da Computação"]}
   {:nome         "Daniela"
    :certificados ["Arquitetura" "Gastronomia"]}])

(println
  (->>
    clientes
    (map :certificados)
    (map count)
    (reduce +)))

(println
  (->>
    clientes
    (map :nome)
    (map count)))


; ===============================


(println (hash-map :a 1 :b 2))

(println (:wife family "I'm there!! ohhhh nooo"))

(contains? #{:a :b } :a)