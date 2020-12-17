# Make angular project
    ng new shraddha-kapur
    ng build

# Make firebase project
	open browser and visit this site: https://console.firebase.google.com/
    create new project.

# Make hosting folder
	open cmd and type: 
		npm install -g firebase-tools
    	firebase init hosting
    paste dist folder content of angular project in public folder of hosting folder.
    open cmd and type: 
    	firebase deploy.
