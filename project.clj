(defproject lifeboat "0.1.0-SNAPSHOT"
  :description "An implementation of the raft protocol using core.async"
  :url "http://github.com/robashton/lifeboat"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [org.clojure/core.async "0.1.256.0-1bf8cf-alpha"] 
                 ]
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}
            )
