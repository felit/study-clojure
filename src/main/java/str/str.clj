;(format fmt &args)
;Formats a string using java.lang.String.format,see java.util.Formatter for format string syntax
(format "Hello there, %s" "bob")
(format "%5d" 3)
(format "Pad with leading zeros %07d" 5432)
(format "decimal %d octal %o hex %x upper-case hex %X" 63 63 63 63)
(format "%2$d %1$s" "Positional arguments" 23)
(format "%5d" (biginteger 12345678901234567890))
; (str) (str x) (str x & ys)
; (count coll)
; Returns the number of items in the collection. (count nil) returns 0.  Also works on strings, arrays, and Java Collections and Maps
(count nil)
(count [])
(count [1 2 3]) ; vector
(count {:one 1 :two 2}) ; map

; (get map key) (get map key not-found)
; Returns the value mapped to key, not-found or nil if key not present.


; (subs s start) (subs s start end)
; (Returns the substring of s beginning at start inclusive, and ending at end (defaults to length of string), exclusive)

(require 'clojure.string)
; (join coll) (join separator coll)
(clojure.string/join ", " [1 2 3 4])
(clojure.string/join ", " {:a 1 :b 2 })

(clojure.string/escape "I want 1 < 2 as HTML, & other good things." {\< "&lt;", \> "&gt;", \& "&amp;"})

; (split s re) (split s re limit)
(clojure.string/split "Hello world!" #" ")
(clojure.string/split "root::0:0:admin:/var/root:" #":" 2)
(clojure.string/split "root::0:0:admin:/var/root:" #":" 3)
(clojure.string/split-lines "test \n string")
;(replace s match replacement)

(clojure.string/replace "The color is red" #"red" "blue")
; clojure.string/re-quote-replacement
(clojure.string/re-quote-replacement " ")


