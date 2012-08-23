(defproject skipping-stones-editor "0.1.0-SNAPSHOT"
            :description "FIXME: write this!"
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [noir "1.3.0-beta3"]
                           [jayq "0.1.0-SNAPSHOT"]
                           [fetch "0.1.0-alpha2"]
                           [overtone/osc-clj "0.7.1-bzgeb"]]
            :plugins [[lein-cljsbuild "0.2.4"]]
            :cljsbuild
            {:builds
              [{:builds nil,
                   :source-path "src",
                   :compiler
                   {:pretty-print true,
                        :output-dir "resources/public/cljs",
                        :output-to "resources/public/cljs/bootstrap.js",
                        :optimizations :simple}}]}
            :main skipping-stones-editor.server)
