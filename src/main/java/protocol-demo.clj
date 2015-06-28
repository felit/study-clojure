(defprotocol AProtocol
  "A doc string for AProtocol abstraction"
  (bar [a b] "bar docs")
  (baz [a] [a b] [a b c] "baz docs"))

(defprotocol P
  (foo [this])
  (bar-me [this] [this y]))
(deftype Foo [a b c]
  P
  (foo [this] a)
  (bar-me [this] b)
  (bar-me [this y] (+ c y)))
(deftype PrintProtocol [a b c]
  P
  (foo [this]
    (print a))
  (bar-me [this]
    (print b))
  (bar-me [this y]
    (print (+ c y))))

(print (bar-me (Foo. 1 2 3) 42))
(print "\n")
(foo (PrintProtocol. 2 3 4))
(print "\n")
(print
  (foo
    (let [x 42]
      (reify P
        (foo [this] 17)
        (bar-me [this] x)
        (bar-me [this y] x)))))

; defprotocol & defrecord
(defprotocol Player
  (choose [p])
  (update-strategy [p me you]))
(extend-protocol Player2)
(defrecord Stubborn [choice]
  Player
  (choose [_] choice)
  (update-strategy [this _ _] this))

(print (extenders P))