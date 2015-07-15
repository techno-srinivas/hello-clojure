"8.Higher order Functions"

(= [4 8 12] (map (fn [x] (* 4 x)) [1 2 3]))

(= [1 4 9 16 25] (map (fn [x] (* x x)) [1 2 3 4 5]))

(= [false false true false false] (map nil? [:a :b nil :c :d]))

(= '() (filter (fn [x] false) '(:anything :goes :here)))

(= '(:anything :goes :here) (filter (fn [x] true) '(:anything :goes :here)))

(= [10 20 30] (filter (fn [x] (< x 40)) [10 20 30 40 50 60 70 80]))

(= [10 20 30] (map (fn [x] (* x 10)) (filter (fn [x] (< x 4)) [1 2 3 4 5 6 7 8])))

(= 24 (reduce (fn [a b] (* a b)) [1 2 3 4]))

(= 2400 (reduce (fn [a b] (* a b)) 100 [1 2 3 4]))

(= "longest" (reduce (fn [a b] (if (< (count a) (count b)) b a)) ["which" "word" "is" "longest"]))
