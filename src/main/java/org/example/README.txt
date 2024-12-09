..//. Add to GITHUB and create branches
git init - initializes the repo for the following file
git add . - stages all the files to the repo
git commit -m "message" - commit the files and add a message
// HAVE TO LINK THE REPO
git remote add origin https://github.com/LeoCodeAk/JavaMasterClass.git
git push -u origin master

//FOR FUTURE UPDATES
git add .
git commit -m "second commit"
git push

//CREATE NEW BRANCH
git checkout -b new-branch-name
git add . -- to stage and add the change
git - commit -m "created new branch"
git push -u origin new-branch-name

//MERGE THE BRANCH INTO MAIN
git checkout main -- go back to main branch
git merge new-branch-name
git push
git branch -d new-branch-name -- **This will delete it locally but not in github**
git push origin --delete branch-name-to-delete