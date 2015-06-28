(with-open [r (clojure.java.io/input-stream "/home/congsl/site.retry")]
  (loop [c (.read r)]
    (if (not= c -1)
      (do
        (print (char c))
        (recur (.read r))))))
; (spit f content & options)
; Opposite of slurp.  Opens f with writer, writes content, then closes f. Options passed to clojure.java.io/writer.

(spit "/home/congsl/hello.world" "hello" :append true)

(def *map* (zipmap
             [:a :b :c :d :e]
             (repeat
               (zipmap [:a :b :c :d :e]
                 (take 5 (range))))))
(prn *map*)
;(use '(clojure.pprint))
;(clojure.pprint/cl-format nil "~5d\n" 3)

;(do (print "What is your name? ") (flush) (read-line))
