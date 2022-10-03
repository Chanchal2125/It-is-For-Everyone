
// Language: javascript

fetch('https://images-api.nasa.gov/search?q=mars')
    .then(response => {
        if(response.status == 200){
            return response.json();
        }else{
            console.log('error ${request.status} ${request.statusText}');
        }
    })
    .then(data => {
        var photoLinks = data.collection.items;
        try{
            photoLinks.forEach(photoLinks => {
                console.log(photoLinks.links[0].href);
            });
        }
        catch{
            console.log("End of search results");
        }
    });
