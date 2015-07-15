"9.Runtime Polymorphism"

(defn hello ([] "Techno-identity!") ([a] (str "hello, you silly " a ".")) ([a & more] (str "hello buddies: " (apply str (interpose ", " (concat (list a) more))) "!")))

(= "Techno-identity!" (hello))

(= "hello, you silly Srinivas!." (hello "Srinivas!"))

(= "hello buddies: Vasu, Nivas, Srinivas!" (hello "Vasu" "Nivas" "Srinivas"))

(defmulti diet (fn [x] (:eater x)))
(defmethod diet :herbivore [a] (str (:name a) " eats veggies."))
(defmethod diet :carnivore [a] (str (:name a) " eats animals."))
(defmethod diet :default [a] (str "I don't know what " (:name a) " eats."))

(= "cow eats veggies." (diet {:species "deer" :name "cow" :age 1 :eater :herbivore}))

(= "cheetah eats animals." (diet {:species "lion" :name "cheetah" :age 1 :eater :carnivore}))

(= "I don't know what Narendra Modi eats." (diet {:name "Narendra Modi"}))
