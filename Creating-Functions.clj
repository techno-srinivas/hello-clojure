"12.Creating Functions"


(= [true false true] (let [not-symbol? (complement symbol?)] (map not-symbol? [:a 'b "c"])))

(= [:wheat "wheat" 'wheat] (let [not-symbol? (complement nil?)] (filter not-symbol? [nil :wheat nil "wheat" nil 'wheat ])))

(= 20 (let [multiply5 (partial * 5)] (multiply5 4)))

(= [:a :b :c :d] (let [some (partial concat [:a :b])] (some [:c :d])))

(= 25 (let [inc-and-square (comp square inc)] (inc-and-square 4)))

(= 8 (let [double-dec (comp dec dec)] (double-dec 10)))

(= 99 (let [square-and-dec (comp dec square)] (square-and-dec 10)))
