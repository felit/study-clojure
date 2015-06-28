;` ' ~ ~@
(defmacro foreach [[sym coll] & body]
  `(loop [coll# ~coll]
     (when-let [[~sym & xs#] (seq coll#)]
       ~@body
       (recur xs#))))
(foreach [x [1 2 3]]
  (println x))

(print (macroexpand '(foreach [x [1 2 3]]
                       (println x))))


(defmacro k [args & body]
  `(do
     (println ~args)
     ~@body))


(print (macroexpand '(k [[1 2 3]]
                       (print "hello"))))
(k [1 2 3]
   (print "hello word"))