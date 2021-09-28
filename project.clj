(defproject clojure_interview_pairing "0.1.0-SNAPSHOT"
  :description "Interview pairing exercises written using the clojure language"

  :url "https://github.com/opencastsoftware/interview_pairing"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/test.check "0.9.0"]]


  :source-paths ["src/main/clojure"]
  :test-paths ["src/test/clojure"]

  :target-path "clj_target/%s"
)
