(ns map.test
  (:import [java.lang.management ManagementFactory]))
(let [ m {"storm.cluster.mode" "distributed"}
       STORM-CLUSTER-MODE "storm.cluster.mode"
       ]
  (println (= (keyword (m STORM-CLUSTER-MODE)) :distributed)))
(println (.getName (ManagementFactory/getRuntimeMXBean)))