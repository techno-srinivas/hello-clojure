"3.Vectors"

(= 1 (count [999]))

(= [1] (vec '(1)))
(= [nil] (vec '(nil)))

(= [nil nil] (vector nil nil))
(= ['(nil)] (vector '(nil)))

(= [1 2] (vec '(1 2)))

(= [111 222 333] (conj [111 222] 333))

(= :bread (first [:bread :butter :and :milk]))

(= :milk (last [:bread :butter :and :milk]))

(= :jelly (nth [:peanut :butter :and :jelly] 3))

(= [:butter :and] (subvec [:bread :butter :and :milk] 1 3))

(= (list 1 2 3) (vector 1 2 3))
