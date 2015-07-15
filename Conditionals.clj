"7.Conditionals"


(= :a (if (false? (= 4 5)) :a :b))

(= [] (if (> 4 3) []))
(= nil (if (> 3 4) []))

(= :glory (if (not (empty? ())) :doom :glory))

(let [x 5] (= :your-road (cond (= x 1) :road-not-taken (= x 2) :another-road-not-taken :else :your-road)))

(= 'doom (if-not (zero? 1) 'doom 'more-doom))

(defn srinivas [vasu] (case vasu :bat :cricket :book :read :water :drink :food :eat :say-what?))
(= :cricket (srinivas :bat))
(= :eat (srinivas :food))
(= :say-what? (srinivas :dance))
