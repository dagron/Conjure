(ns flows.test-flow
  (:use conjure.flow.base)
  (:require [conjure.view.util :as view-util]))

(def-action show
  (view-util/render-view))