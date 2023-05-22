
        
          function search_cinema() {
            let input = document.getElementById('barre-recherche').value
            input=input.toLowerCase();
            let x = document.getElementsByClassName('cinema');
              
            for (i = 0; i < x.length; i++) { 
                if (!x[i].innerHTML.toLowerCase().includes(input)) {
                    x[i].style.display="none";
                }
                else {
                    x[i].style.display="*cinemas";                 
                }
            }
        }
          

        
       

        function ouvrirPage(){

        }