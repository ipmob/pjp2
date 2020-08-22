  GNU nano 4.4                                                             GitHub commands.txt
mkdir week1
cd week1
git init


#### initial commits
vim week1.Md  //this file 
git add .
git commit -m "assignment"
git remote add origin https://github.com/ipmob/pjp2.git
git push -u origin master



#### add branches
git branch feature
git branch dev
git branch QA
git branch delivery

mkdir sample_feature
cd sample_feature
gedit sample.txt
git status
cd ..
git add feature/*
git commit -m "Folder created"
git push origin master:feature

REMOVING FILES:
git rm --cached sample1.txt
git rm -f sample1.txt
git push origin master

REMOVING FILES:
git rm -r feature1
git commit -m "folder deleted"
git push origin feature1

Checkout from remote to local:
git checkout feature
git pull origin feature

 git checkout master
 git merge feature
 git merge dev
 git merge QA
 git merge delivery
