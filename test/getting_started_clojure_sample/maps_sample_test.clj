(ns getting-started-clojure-sample.maps-sample-test
  (:require [clojure.test :refer :all]
            [getting-started-clojure-sample.maps-sample :as maps-sample]))

(deftest maps_sample_test
  (is
    (= (assoc family :husband "André" (maps-sample/family)))))
