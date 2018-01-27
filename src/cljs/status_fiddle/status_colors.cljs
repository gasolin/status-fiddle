(ns status-fiddle.status-colors
  (:require [status-fiddle.react-native-web :as react]
            [status-im.ui.components.styles :as styles]
            [re-frame.core :as re-frame]))

(defn color-panel [color label]
  [react/touchable-highlight {:on-press #(re-frame/dispatch [:show-color color label])}
   [react/view {:style {:width 20 :height 20 :background-color color}}]])

(defn color-label []
  (let [{:keys [color label]} @(re-frame/subscribe [:color])]
    [react/view {:style {:flex-direction :row}}
     [react/view {:style {:width 20 :height 20 :background-color color}}]
     [react/text {:style {:margin-left 20}} color]
     [react/text {:style {:margin-left 20}} label]]))

(defn colors-panel []
  [react/view {:style {:margin-bottom 10}}
   [react/view {:style {:flex-direction :row :flex-wrap :wrap}}
    [color-panel styles/color-blue "styles/color-blue"]
    [color-panel styles/color-blue2 "styles/color-blue2"]
    [color-panel styles/color-blue3 "styles/color-blue3"]
    [color-panel styles/color-blue4 "styles/color-blue4"]
    [color-panel styles/color-blue4-faded "styles/color-blue4-faded"]
    [color-panel styles/color-blue4-transparent "styles/color-blue4-transparent"]
    [color-panel styles/color-blue5 "styles/color-blue5"]
    [color-panel styles/color-blue6 "styles/color-blue6"]
    [color-panel styles/color-blue-transparent "styles/color-blue-transparent"]
    [color-panel styles/color-black "styles/color-black"]
    [color-panel styles/color-purple "styles/color-purple"]
    [color-panel styles/color-gray-transparent-light "styles/color-gray-transparent-light"]
    [color-panel styles/color-gray-transparent-medium-light "styles/color-gray-transparent-medium-light"]
    [color-panel styles/color-gray-transparent "styles/color-gray-transparent"]
    [color-panel styles/color-gray4-transparent "styles/color-gray4-transparent"]
    [color-panel styles/color-gray10-transparent "styles/color-gray10-transparent"]
    [color-panel styles/color-gray "styles/color-gray"]
    [color-panel styles/color-gray2 "styles/color-gray2"]
    [color-panel styles/color-gray3 "styles/color-gray3"]
    [color-panel styles/color-gray4 "styles/color-gray4"]
    [color-panel styles/color-gray5 "styles/color-gray5"]
    [color-panel styles/color-gray6 "styles/color-gray6"]
    [color-panel styles/color-gray7 "styles/color-gray7"]
    [color-panel styles/color-gray8 "styles/color-gray8"]
    [color-panel styles/color-gray9 "styles/color-gray9"]
    [color-panel styles/color-gray10 "styles/color-gray10"]
    [color-panel styles/color-gray11 "styles/color-gray11"]
    [color-panel styles/color-dark "styles/color-dark"]
    [color-panel styles/color-steel "styles/color-steel"]
    [color-panel styles/color-white "styles/color-white"]
    [color-panel styles/color-white-transparent "styles/color-white-transparent"]
    [color-panel styles/color-white-transparent-1 "styles/color-white-transparent-1"]
    [color-panel styles/color-white-transparent-2 "styles/color-white-transparent-2"]
    [color-panel styles/color-white-transparent-3 "styles/color-white-transparent-3"]
    [color-panel styles/color-white-transparent-4 "styles/color-white-transparent-4"]
    [color-panel styles/color-white-transparent-5 "styles/color-white-transparent-5"]
    [color-panel styles/color-white-transparent-6 "styles/color-white-transparent-6"]
    [color-panel styles/color-light-blue "styles/color-light-blue"]
    [color-panel styles/color-light-blue-transparent "styles/color-light-blue-transparent"]
    [color-panel styles/color-light-blue2 "styles/color-light-blue2"]
    [color-panel styles/color-light-blue3 "styles/color-light-blue3"]
    [color-panel styles/color-light-blue4 "styles/color-light-blue4"]
    [color-panel styles/color-light-blue5 "styles/color-light-blue5"]
    [color-panel styles/color-light-blue6 "styles/color-light-blue6"]
    [color-panel styles/color-light-blue7 "styles/color-light-blue7"]
    [color-panel styles/color-dark-blue-1 "styles/color-dark-blue-1"]
    [color-panel styles/color-dark-blue-2 "styles/color-dark-blue-2"]
    [color-panel styles/color-dark-blue-3 "styles/color-dark-blue-3"]
    [color-panel styles/color-dark-blue-4 "styles/color-dark-blue-4"]
    [color-panel styles/color-light-gray "styles/color-light-gray"]
    [color-panel styles/color-light-gray2 "styles/color-light-gray2"]
    [color-panel styles/color-light-gray3 "styles/color-light-gray3"]
    [color-panel styles/color-light-gray4 "styles/color-light-gray4"]
    [color-panel styles/color-light-gray5 "styles/color-light-gray5"]
    [color-panel styles/color-red "styles/color-red"]
    [color-panel styles/color-red-2 "styles/color-red-2"]
    [color-panel styles/color-red-3 "styles/color-red-3"]
    [color-panel styles/color-red-4 "styles/color-red-4"]
    [color-panel styles/color-light-red "styles/color-light-red"]
    [color-panel styles/color-light-red2 "styles/color-light-red2"]
    [color-panel styles/color-green-1 "styles/color-green-1"]
    [color-panel styles/color-green-2 "styles/color-green-2"]
    [color-panel styles/color-green-3 "styles/color-green-3"]
    [color-panel styles/color-green-3-light "styles/color-green-3-light"]
    [color-panel styles/color-green-4 "styles/color-green-4"]
    [color-panel styles/color-cyan "styles/color-cyan"]
    [color-panel styles/color-separator "styles/color-separator"]
    [color-panel styles/text1-disabled-color "styles/text1-disabled-color"]
    [color-panel styles/selected-message-color "styles/selected-message-color"]
    [color-panel styles/separator-color "styles/separator-color"]]
   [color-label]])