(ns pinkgorilla.ui.sparklines
  (:require
   [reagent.core :as r]
   ["react-sparklines" :as rs :refer [Sparklines SparklinesLine SparklinesBars SparklinesSpots]]
   [pinkgorilla.ui.pinkie :refer [register-tag]]))

(defn sparkline [data]
  [:> Sparklines data
   [:> SparklinesLine {:color "blue"}]])

(defn sparkline-bar [data]
  [:> Sparklines data
   [:> SparklinesBars {:color "blue"}]])

(defn sparkline-spot [data]
  [:> Sparklines data
   [:> SparklinesLine {:color "blue"}]
   [:> SparklinesSpots {:color "blue"}]])

(register-tag :sparkline sparkline)
(register-tag :sparkline-bar sparkline-bar)
(register-tag :sparkline-spot sparkline-spot)