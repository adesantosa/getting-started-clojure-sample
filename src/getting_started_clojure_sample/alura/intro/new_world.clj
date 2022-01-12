(ns getting-started-clojure-sample.alura.intro.new-world)

(def motivation #(println "Go Clojure!!") )

(defn desconto?
  [valor-bruto]
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


(motivation)
(defn valor-descontado-v2
  "new function"
  [valor-bruto]
  (if (desconto? valor-bruto)
    (let [taxa-desconto 0.9
          desconto (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(motivation)
(println (map valor-descontado-v2 (filter even? [140 101 150])))