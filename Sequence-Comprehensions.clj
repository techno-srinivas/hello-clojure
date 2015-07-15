"11.Sequence Comprehensions"


(= (range 6) (for [index (range 6)] index))

(= '(0 1 4 9 16 25) (map (fn [index] (* index index)) (range 6)) (for [index (range 6)] (* index index)))

(= '(1 3 5 7 9) (filter odd? (range 10)))

(= '(1 3 5 7 9) (for [index (range 10) :when (odd? index)] index))

(= '(1 3 5 7 9) (filter odd? (range 10)) (for [index (range 10) :when (odd? index)] index))

(= '(1 9 25 49 81) (map (fn [index] (* index index)) (filter odd? (range 10))) (for [index (range 10) :when (odd? index)] (* index index)))

(= [[:top :left] [:top :middle] [:top :right] [:middle :left] [:middle :middle] [:middle :right] [:bottom :left] [:bottom :middle] [:bottom :right]] (for [row [:top :middle :bottom] column [:left :middle :right]] [row column]))
