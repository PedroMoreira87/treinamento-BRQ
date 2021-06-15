document.addEventListener('DOMContentLoaded', function() {
    button();
    rst();
});

function calc() {
    var ano = document.getElementById('year').value;

    var a = ano%19;
    var b = Math.floor(ano/100);
    var c = ano%100;
    var d = Math.floor(b/4);
    var e = b%4;
    var f = Math.floor((b+8)/25);
    var g = Math.floor((b-f+1)/3);
    var h = (19*a+b-d-g+15)%30;
    var i = Math.floor(c/4);
    var j = c%4;
    var k = (32+2*e+2*i-h-j)%7;
    var L = Math.floor((a+11*h+22*k)/451);
    var MES = Math.floor((h+k-7*L+114)/31);
    var DIA = ((h+k-7*L+114)%31)+1;

    document.getElementById('title').innerHTML="Em " + ano;
    document.getElementById('day').innerHTML="A páscoa cai no dia: " + DIA;
    document.getElementById('month').innerHTML="No mês: " + MES;
};

function button() {
    btn.addEventListener('click', function(){
        calc();
    });
}

function rst() {
    reset.addEventListener('click', function(){
        document.getElementById('title').innerHTML = '';
        document.getElementById('day').innerHTML= '';
        document.getElementById('month').innerHTML= '';
    });
}