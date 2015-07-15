"2.Lists"

(= '(1 2 3 4 5) (list 1 2 3 4 5))

(= 1 (first '(1 2 3 4 5)))

(= '(2 3 4 5) (rest '(1 2 3 4 5)))

(= 3 (count '(vas nivas srinivas)))

(= 0 (count '()))

(= '() (rest '(100)))

(= '(:a :b :c :d :e) (cons :a '(:b :c :d :e)))

(= '(:e :a :b :c :d) (conj '(:a :b :c :d) :e))

(= :a (peek '(:a :b :c :d :e)))

(= '(:b :c :d :e) (pop '(:a :b :c :d :e)))

(= "No dice!" (try (pop '()) (catch IllegalStateException e "No dice!")))

(= '() (try (rest '()) (catch IllegalStateException e "No dice!")))
