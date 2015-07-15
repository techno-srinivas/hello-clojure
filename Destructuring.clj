"14.Destructuring"


(= ":boo:foo" ((fn [[a b]] (str b a)) [:foo :boo]))

(= (str "First comes love, " "then comes marriage, " "then comes Clojure with the baby carriage") ((fn [[a b c]] (str "First comes " a ", " "then comes " b ", " "then comes " c " with the baby carriage")) ["love" "marriage" "Clojure"]))

(= "Sri Nivas aka The Clojurer aka Go Time aka Macro Killah" (let [[first-name last-name & aliases] (list "Sri" "Nivas" "The Clojurer" "Go Time" "Macro Killah")] (str first-name " " last-name (apply str (map #(str " aka " %) aliases)))))

(= {:original-parts ["vasu" "nivas"] :named-parts {:first "vasu" :last "nivas"}} (let [[first-name last-name :as full-name] ["vasu" "nivas"]] {:original-parts full-name :named-parts {:first first-name :last last-name}}))

(def address {:street-address "123 lane" :city "vizag" :state "AP"})

(= "123 lane, vizag, AP" (let [{street-address :street-address, city :city, state :state} address] (str street-address ", " city ", " state)))

(= "123 lane, vizag, AP" (let [{:keys [street-address city state]} address] (str street-address ", " city ", " state)))

(= "Test Testerson, 123 lane, vizag, AP" ((fn [[first-name last-name] {:keys [street-address city state]}] (str first-name " " last-name ", " street-address ", " city ", " state)) ["Test" "Testerson"] address))
