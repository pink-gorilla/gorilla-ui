(ns pinkgorilla.ui.ui.player
  (:require
   [reagent.core :as r]
   ["react-player" :as rp :refer [ReactPlayer]]
   [pinkie.pinkie :refer-macros [register-component]]))

(defn ^{:category :ui}
  player
  "plays Youtube videos
   usage:
   [:p/player {:url url}]
   "
  [url]
  [:div-player
   [:> rp/default {:url url :playing true}]])

(register-component :p/player player)