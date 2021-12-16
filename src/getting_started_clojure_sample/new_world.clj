(ns getting-started-clojure-sample.new-world)

(def motivation #(println "Go Clojure!!") )

(defn desconto?
  [valor-bruto]
  (println "oi?")
  (> valor-bruto 100))

(defn valor-descontado
  "new function"
  [desconto? valor-bruto]
  (if (desconto? valor-bruto)
    (let [taxa-desconto 0.9
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(motivation)
(println (valor-descontado desconto? 100))
(println (valor-descontado desconto? 10))