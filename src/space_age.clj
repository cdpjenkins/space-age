(ns space-age)

(defn- seconds-to-earth-years [seconds]
  (/ seconds 31557600.0))

(def earth-years {:mercury 0.2408467
                  :venus   0.61519726
                  :earth   1.0
                  :mars    1.8808158
                  :jupiter 11.862615
                  :saturn  29.447498
                  :uranus  84.016846
                  :neptune 164.79132})

(defn- age-fn [planet]
  (let [year-ratio (earth-years planet)]
    (fn [seconds]
      (/ (seconds-to-earth-years seconds) year-ratio))))

(def on-mercury (age-fn :mercury))
(def on-venus   (age-fn :venus))
(def on-earth   (age-fn :earth))
(def on-mars    (age-fn :mars))
(def on-jupiter (age-fn :jupiter))
(def on-saturn  (age-fn :saturn))
(def on-neptune (age-fn :neptune))
(def on-uranus  (age-fn :uranus))
