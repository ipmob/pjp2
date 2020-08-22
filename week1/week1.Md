  GNU nano 4.4                                                             GitHubmkdir week1
cd week1
git init


#### initial commits


* vim week1.Md  //this file 
* git add .
* git commit -m "assignment"
* git remote add origin https://github.com/ipmob/pjp2.git
* git push -u origin master



#### add branches
* git branch feature
* git branch dev
* git branch QA
* git branch delivery

* mkdir sample_feature
* cd sample_feature
* vim sample.txt
* cd ..
* git add sample_feature/*
* git commit -m "folder"
* git push origin master:feature

####  REMOVING FILES:
* git checkout  -b feature 
* git branch --set-upstream-to=origin/feature feature
* git rm --cached sample.txt
* git push origin master

#### REMOVING Folder:
git rm -r sample_feature
git commit -m "folder deleted"
git push origin feature

### Checkout from remote to local:
* git checkout feature
* git pull origin feature

* git checkout master
* git merge feature
* git merge dev
* git merge QA
* git merge delivery
