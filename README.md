# Opencast interview pairing #

The second half of an OC interview consists of the pairing exercise using a language the candidate is unfamiliar with.
To make keeping track of which candidate used which language, we have created this repo to store the solutions for all the jvm based pairing exercises.


## Using the repo ##
Create a branch off master using the name of the candidate

`git checkout -b <firstname-surname>`

Following the interview, commit the changes and push the branch to the GitHub repo.
You don't need to raise a PR to get the changes merged into master, we want them kept separate.

`git push origin <firstname-surname>`


## Languages ##
Currently, we have projects define for:

### Scala ###
The build.sbt file defined at the project root overrides the default 'target' directory name with 'scala_target' directory

### Clojure ###
The project.clj file defined at the project root overrides the default source and test directories to fit the `src/main/<language>` and `src/test/<language>` project structures of maven and sbt.
The target directory is also overriden with the name 'clj_target'

### Rust ###
The .cargo/config file overrides the default target directory with the 'rust_target' directory

### Katas ###
A markdown versions of the kata descriptions are in the docs directory.