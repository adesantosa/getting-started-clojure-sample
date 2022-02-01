(ns getting-started-clojure-sample.brave-and-true.exercises)


(def asym-aliens-body-parts [{:name "head" :size 3}
                             {:name "first-left-eye" :size 1}
                             {:name "second-left-eye" :size 1}
                             {:name "third-left-eye" :size 1}
                             {:name "four-left-eye" :size 1}
                             {:name "five-left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "first-shoulder" :size 3}
                             {:name "second-shoulder" :size 3}
                             {:name "third-shoulder" :size 3}
                             {:name "four-shoulder" :size 3}
                             {:name "five-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])



;Create a function that’s similar to symmetrize-body-parts except that it has to work with weird space aliens
;with radial symmetry. Instead of two eyes, arms, legs, and so on, they have five.

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"-left-" "-right-")
   :size (:size part)})

(defn better-symmetrize-body-parts-with-aliens
  "Exercise"
  [asym-body-parts]
  (reduce (body-parts )
          []
          asym-body-parts
          ))

(println (better-symmetrize-body-parts-with-aliens asym-aliens-body-parts))

;Create a function that generalizes symmetrize-body-parts and the function you created in Exercise 5.
;The new function should take a collection of body parts and the number of matching body parts to add.
;If you’re completely new to Lisp languages and functional programming, it probably won’t be obvious how to do this.
;If you get stuck, just move on to the next chapter and revisit the problem later.


(defn body-parts
  [final-body-parts part]
  (into final-body-parts (set [part (matching-part part)])))
