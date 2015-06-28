; the ns form names the lib's namespace
; the :import clause declares this lib's use of java.util.Date
; the :use clause declares a depenedency on the clojure.contrib.def for its defvar- function only.defvar- may be used in this lib's code using its unqualified name.
; The :require clause declare's a dependency on the clojure.contrib.shell-out lib and enables using ite memebers using the shorter namespace alias shell.
(ns com.livedrof.first-demo
  (:import java.util.Date)
;  (:use [clojure.contrib.def :only (defvar-)])
;  (:require [clojure.contrib.shell-out :as shell])
  )
;(defvar- greetings
;  {:english "Hello"
;   :german "Guten Tag"
;   :french "Bonjour"}
;  "Map from language to greeting")
;(defn- user-prop
;  "Returns the system property for user.<key>"
;  [key]
;  (System/getProperty (str "user." key)))
;(defn greeting
;  "Returns a greeting for the current user. The greeting is in English by default, or optionally in another language: :german or :french"
;  ([]
;    (greeting :english))
;  ([language] (str (greetings language)) " " (user-prop "name")))
;(defn user-files
;  "Returns a seq of the file names in the current user's home directory"
;  []
;  (seq (.split (shell/sh "ls" (user-prop "home")) "\n")))
(defn say-hello
  [](do
      (println "say hello!")
      (str "hello")))