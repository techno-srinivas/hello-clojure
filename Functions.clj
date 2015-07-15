"6.Functions"

(defn multiply-by-ten [n] (* 10 n))

(defn square [n] (* n n))

(= 81 (square 9))

(= 20 (multiply-by-ten 2))
(= (* 10 2) (multiply-by-ten 2))

(= 10 ((fn [n] (* 5 n)) 2))

(= 60 (#(* 15 %) 4))

(= 15 (#(+ %1 %2 %3) 4 5 6))

(= 30 (#(* 15 %2) 1 2))

(= 9 (((fn [] (fn [a b] (+ a b)))) 4 5))

(= 20 ((fn [f] (f 4 5)) (fn [a b] (* 5 4))))
"I don't know what Narendra Modi eats."
(= 25 ((fn [f] (f 5)) (fn [n] (* n n))))

(= 25 ((fn [f] (f 5)) square))
