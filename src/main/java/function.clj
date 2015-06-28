(+ 1 2 3)
(map (fn [x] (x * x)) (range 1 10))

(defn printname
  ([] (str "helle world"))
  ([name] (str "my name is " name)))
(defn varprint [& a] (str a))
(defn m [& arg] (str arg ", size=" (count arg)))
(defn exp "将函数作为参数" [a f1 b f2 c] (f2 (f1 a b) c))
(defn f "将函数作为返回值" [a] (fn [b] (a - b)))


(println (printname 300))
(println (printname))
(println (varprint "hello" "world"))
(println (m "hello" "world"))
(println (exp 3 - 5 + 2))
;类型转换
;(println (toString. ((f 2) 300)))

; 命名空间
(ns ns1)

(defn- ns-fn [name] (println name " from ns1"))
(ns-fn "hello")
(ns ns2)

(defn- ns-fn [name] (println name " from ns2"))
(ns-fn "hello")

;组合函数
(defn compfn [x y] (- (x * y)))
(def pfn (comp - *))

;偏函数
(defn f [n] (* n 10))
(partial * 10)

;constantly函数
(def consf (constantly "a"))


;函数调用
(println (first (.split (.replace (.toUpperCase "a b c d") "A" "X") " ")))
(println (-> "a b c d" .toUpperCase (.replace "A","X") (.split " ") first))
(->> 10 (/ 3))
(apply + [1 2 3 4])



