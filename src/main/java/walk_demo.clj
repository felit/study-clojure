; (walk inner outer form)
; Traverses form, an arbitrary data structure. inner and outer are functions. Applies inner to each element of form,
; building up a data structure of the same type, then applies outer to the result.
; Recognizes all Clojure data structures. Consumes seqs as with doall.\
(use 'clojure.walk)
(walk #(* 2 %) #(apply + %) [1 2 3 4 5])

(walk (fn [[k v]] [k (* 10 v)]) identity {:a 1 :b 2 :c 3})