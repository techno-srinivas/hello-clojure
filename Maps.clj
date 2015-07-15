"5.Maps"

(= {} (hash-map))

(= 0 (count (hash-map)))

(= {:a 1} (hash-map :a 1))
(= {:a 1 :b 2} (hash-map :a 1 :b 2))

(= 2 (count {:a 1 :b 2}))

(= 2 (get {:a 1 :b 2} :b))

(= 1 ({:a 1 :b 2} :a))

(= 1 (:a {:a 1 :b 2}))

(= "vasu" ({2010 "Vancouver" 2014 "vasu" 2018 "PyeongChang"} 2014))

(= nil (get {:a 1 :b 2} :c))

(= :key-not-found (get {:a 1 :b 2} :c :key-not-found))

(= true (contains? {:a nil :b nil} :b))

(= false (contains? {:a nil :b nil} :c))

(= {1 "January" 2 "February"} (assoc {1 "January"} 2 "February"))

(= {1 "January"} (dissoc {1 "January" 2 "February"} 2))

(= (list 2010 2014 2018) (sort (keys {2014 "vasu" 2018 "nivas" 2010 "srinivas"})))

(= (list "nivas" "srinivas" "vasu") (sort (vals {2014 "vasu" 2018 "nivas" 2010 "srinivas"})))
