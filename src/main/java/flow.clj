(defn is-small [number] (if (< number 100) "yes" "no"))
(if true "true")
(if 0 "true")
(if "" "true")
(if nil "true")
(if false "true")
(if true "true" "false")

(if-not (zero? 0) "no" "yes")
(if (not (zero? 0)) "no" "yes")
(if-let [x 0] "true" "false")

(when true (println "this is true") "return true")
(when false (println "is true") "return true")

(cond (< 1 2) "small" (= 1 1) "equal" (> 1 0) "big")
(case 1 0 "zero" 1 "one")
(case 2 0 "zero" 1 "one" "default")

(def v (do (println 123) (println 321) -1))

(is-small 50)
(is-small 20)

