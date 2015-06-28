(ns com.livedrof.reify-demo
  (:import [com.livedrof IHello]))

(defn -main []
  (reify IHello
    (sayHello [this username]
      (print username))))
(print (-main))
(.sayHello (-main) "\ncongsl")

(let [_ "hello" - "world"]
  (print _ -))