(def mem (atom {}))
(println @mem)
(println (deref mem))
(reset! mem {:a 1})
(println @mem)