(ns getting-started-clojure-sample.alura.collection.recursion)

; There are a lot of ways to define a sequence in clojure like:

(defn my-map-def
  [symbol]
  (str symbol " My map"))

(defn my-map
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do
        (funcao primeiro)
        (recur funcao (rest sequencia))))))

(map #(my-map-def (second %)) {:hey "ow"})

; loop
(defn conta
  [elementos]
  (loop [total 0
         elementos-restantes elementos]
    (if (seq elementos-restantes)
      (recur (inc total) (next elementos-restantes))
      total)))


(println "PEDIDOS")

(defn total-do-item
  [[item-id detalhes]]
  (* (get detalhes :quantidade 0)  (get detalhes :preco-unitario 0)))

(defn total-do-pedido
  [pedido]
  (reduce + (map total-do-item pedido)))

(defn total-dos-pedidos
  [pedidos]
  (->> pedidos
       (map :itens)
       (map total-do-pedido)
       (reduce +)))

(defn quantia-de-pedidos-e-gasto-total-por-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-de-pedidos (count pedidos)
   :preco-total (total-dos-pedidos pedidos)})

(->> (l.db/todos-os-pedidos)
     (group-by :usuario)
     (map quantia-de-pedidos-e-gasto-total-por-usuario)
     println)