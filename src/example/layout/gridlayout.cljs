(ns example.layout.gridlayout
  (:require
   [example.example :as example]))

(def layout [{:i "a" :x 0 :y 0 :w 1 :h 2 :static true}
             {:i "b" :x 1 :y 0 :w 3 :h 2 :minW 2 :maxW 4}
             {:i "c" :x 4 :y 0 :w 1 :h 2}])

(example/add
 :layout/grid
 [:div.bg-green-300 {:style {:width 1000
                             :height 600}}

  [:p/gridlayout {:className "layout"
                  :layout layout
                  :cols 5
                  :rowHeight 30
                  :width 300}
   [:div.bg-blue-700 {:key "a"} "a"]
   [:div.bg-yellow-300 {:key "b"} "b"]
   [:div.bg-green-600 {:key "c"} "c"]]])



