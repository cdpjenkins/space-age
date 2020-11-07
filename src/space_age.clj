(ns space-age)

(defn- seconds-to-earth-years [seconds]
  (/ seconds 31557600.0))

(defn- age-fn [year-ratio]
  (fn [seconds]
    (let [earth-years (seconds-to-earth-years seconds)]
      (/ earth-years year-ratio))))

(def on-mercury (age-fn 0.240846))
(def on-venus   (age-fn 0.6151972))
(def on-earth   (age-fn 1))
(def on-mars    (age-fn 1.8808158))
(def on-jupiter (age-fn 11.862615))
(def on-saturn  (age-fn 29.447498))
(def on-neptune (age-fn 164.79132))
(def on-uranus  (age-fn 84.016846))
