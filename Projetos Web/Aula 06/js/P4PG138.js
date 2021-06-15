document.addEventListener('DOMContentLoaded', function() {
    button();
    rst();
});

function calc() {
    var id = document.getElementById('id').value;
    var workTime = document.getElementById('workTime').value;
    var salaryHour = document.getElementById('salaryHour').value;

    var cont1 = 0;
    var cont2 = 0;
    var cont5 = 0;
    var cont10 = 0;
    var cont20 = 0;
    var cont50 = 0;
    var cont100 = 0;
    var cont200 = 0;
    var totsalary = 0;

    if (id > 0) {
        totsalary = workTime * salaryHour;
        document.getElementById('outputTotSal').innerHTML= "Salário total de R$" + totsalary + ",00";

        cont200 += Math.floor(totsalary/200);
        totsalary %= 200;

        cont100 += Math.floor(totsalary/100);
        totsalary %= 100;

        cont50 += Math.floor(totsalary/50);
        totsalary %= 50;

        cont20 += Math.floor(totsalary/20);
        totsalary %= 20;

        cont10 += Math.floor(totsalary/10);
        totsalary %= 10; 

        cont5 += Math.floor(totsalary/5);
        totsalary %= 5;

        cont2 += Math.floor(totsalary/2);
        totsalary %= 2;

        cont1 += Math.floor(totsalary/1);
        totsalary %= 1;
    }else {
        alert("Favor digitar seu número de identificação");
    }
    document.getElementById('output200').innerHTML= "Notas de R$200,00: " + cont200;
    document.getElementById('output100').innerHTML= "Notas de R$100,00: " + cont100;
    document.getElementById('output50').innerHTML= "Notas de R$50,00: " + cont50;
    document.getElementById('output20').innerHTML= "Notas de R$20,00: " + cont20;
    document.getElementById('output10').innerHTML= "Notas de R$10,00: " + cont10;
    document.getElementById('output5').innerHTML= "Notas de R$5,00: " + cont5;
    document.getElementById('output2').innerHTML= "Notas de R$2,00: " + cont2;
    document.getElementById('output1').innerHTML= "Notas de R$1,00: " + cont1;
};

function button() {
    btn.addEventListener('click', function(){
        calc();
    });
}

function rst() {
    reset.addEventListener('click', function(){
        document.getElementById('id').value = '';
        document.getElementById('workTime').value = '';
        document.getElementById('salaryHour').value = '';
        document.getElementById('outputTotSal').innerHTML= '';
        document.getElementById('output200').innerHTML= '';
        document.getElementById('output100').innerHTML= '';
        document.getElementById('output50').innerHTML= '';
        document.getElementById('output20').innerHTML= '';
        document.getElementById('output10').innerHTML= '';
        document.getElementById('output5').innerHTML= '';
        document.getElementById('output2').innerHTML= '';
        document.getElementById('output1').innerHTML= '';
    });
}