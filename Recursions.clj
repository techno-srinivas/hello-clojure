"13.Recursion"

(defn even? [n] (if (= n 0) true (not (even? (dec n)))))

(= true (even? 0))

(= false (even? 9))

(defn even-bigint? [n] (loop [n n acc true] (if (= n 0) acc (recur (dec n) (not acc)))))

(= false (even-bigint? 100003N))
(= true (even-bigint? 100000N))

(defn rr [coll] (loop [coll coll reversed ()] (if (= () coll) reversed (recur (rest coll) (cons (first coll) reversed)))))

(= '() (rr '()))

(= '(5 4 3 2 1) (rr '(1 2 3 4 5)))

(defn factorial [n] (loop [n n acc 1] (if (= 0 n) acc (recur (dec n) (* n acc)))))

(= 362880 (factorial 9))

(= 1 (factorial 1))

(= 2 (factorial 2))

;(< 1000000000000000000000000N (factorial 1000N))

;(< 1000000000000000000000000N (factorial 100003N))
