; (count coll) Returns the number of items in the collection. (count nil) returns 0
; Also works on strings, arrays, and Java Collections and Maps
(count nil)
(count [])
(count [1 2 3])
(count {:one 1 :two 2})
(count [1 \a "string" [1 2] {:foo :bar}])
(count "string")
(count '(1 2 3 3 1))
(= (count '(1 2 3 3 1)) 5)

(print (type '()))
(print (type []))
(print (type {}))
(print (type #{}))

; (empty coll) Returns an empty collection of the same category as coll, or nil
(empty '(1 2))


