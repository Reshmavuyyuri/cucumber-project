# cucumber-project

The current problem we can solve like this 

If the problem is "main and master are entirely different commit histories.", the following will work

git checkout master   
git branch main master -f    
git checkout main  
git push origin main -f 
