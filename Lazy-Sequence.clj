"10.Lazy Sequence"


(= '(1 2 3 4) (range 1 5))

(= '(0 1 2 3 4) (range 5))

(= [0 1 2 3 4] (take 5 (range 100)))

(= [45 46 47 48 49] (drop 45 (range 50)))

(= (range 10) (take 10 (iterate inc 0)))
(= '(0 1 2 3 4 5 6 7 8 9) (take 10 (iterate inc 0)))

(= [:a :a :a :a :a] (repeat 5 :a))

(= (repeat 100 :foo) (take 100 (iterate identity :foo)))
