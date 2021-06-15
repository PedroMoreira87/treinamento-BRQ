document.addEventListener('DOMContentLoaded', function() {
    button();
    rst();
});

function calc() {
    var age = document.getElementById('age').value;
    var image = document.getElementById('img');

    if (age >= 0 && age <= 4) {
        document.getElementById('output').innerHTML= "Sua categoria é: Baby";
        image.src = "./images/P3PG94_01.jpg";
    }else if (age <= 7) {
        document.getElementById('output').innerHTML= "Sua categoria é: Infantil A"
        image.src = "./images/P3PG94_02.jpg";
    }else if (age <= 11) {
        document.getElementById('output').innerHTML= "Sua categoria é: Infantil B"
        image.src = "./images/P3PG94_03.jpg";
    }else if (age <= 13) {
        document.getElementById('output').innerHTML= "Sua categoria é: Juvenil A"
        image.src = "./images/P3PG94_04.jpg";
    }else if (age <= 17) {
        document.getElementById('output').innerHTML= "Sua categoria é: Juvenil B"
        image.src = "./images/P3PG94_05.jpg";
    }else if (age >= 18) {
        document.getElementById('output').innerHTML= "Sua categoria é: Adulto"
        image.src = "./images/P3PG94_06.jpg";
    }else {
        document.getElementById('output').innerHTML= "Idade incorreta!"
    }
};

function button() {
    btn.addEventListener('click', function(){
        calc();
    });
}

function rst() {
    reset.addEventListener('click', function(){
        document.getElementById('age').value = '';
        document.getElementById('output').innerHTML= '';
        document.getElementById('img').src= '';
    });
}