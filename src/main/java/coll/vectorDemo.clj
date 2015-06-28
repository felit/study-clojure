; (vector)
; (vector a)
; (vector a b)
; (vector a b c)
; (vector a b c d)
; (vector a b c d & args)
; Creates a new vector containing the args
; clojure.lang.PersistentVector
(vector)
(vector nil)
(vector 1 2 3)
[1 2 3]

(vec '(1 2 3)); [1 2 3]
(vec [1 2 3]); [1 2 3]
(vec #{ 1 2 3}); [1 3 2]
