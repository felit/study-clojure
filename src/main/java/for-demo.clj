; (for seq-exprs body-expr)
(print
  (for [x [1 2 3 4 5] y [4 6]
        :let [z (+ x y)]
        :when (> z 2)]
    z))

(print (for [x [0 1 2 3 4 5]
             :let [y (* x 3)]
             :when (even? y)]
         y))

(def digits (seq [1 2 3]))
(print (for [x1 digits x2 digits] (* x1 x2)))

(print (for [x ['a 'b 'c]
             y [1 2 3]]
         [x y]))

(print (for [x (range 1 6)
             :let [y (* x x)
                   z (* x x x)]]
         [x y z]))
(print (for [x (range 3 7)]
         (* x x)))

(print (for [[x y] '([:a 1] [:b 2] [:c 0])
             :when (= y 0)]
         x))

; (doseq seq-exprs & body)
(prn "\n")
(print (doseq [x [-1 0 1]
               y [1 2 3]]
         (prn (* x y))))

(dotimes [n 10]
  (println (map #(* % (inc n)) (range 1 11))))

(print (take 40 (repeat "x")))