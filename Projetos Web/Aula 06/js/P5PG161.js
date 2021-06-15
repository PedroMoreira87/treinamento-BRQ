document.addEventListener('DOMContentLoaded', function() {
    tble();
    flight();
    button();
    rst();
});

function tble() {
    for (var i = 1; i <= 37; i++ ) {
        var child = document.createElement('tr');
        var html = '';
        html += '<td>'+i+'</td>';
        html += '<td class="tds"></td>';
        child.innerHTML = html;
        document.getElementById('table').appendChild(child);
    }
}

function flight() {
    var tds = document.getElementsByClassName('tds');
    for (var i = 0; i < 37; i++) {
        tds[i].innerHTML = Math.floor(Math.random() * 61);
    }
}

function button() {
    btn.addEventListener('click', function(){
        var id = document.getElementById('id').value;
        var tds = document.getElementsByClassName('tds');
        var flightNumber = document.getElementById('flightNumber').value;
        if (tds[flightNumber-1].innerHTML > 0) {
            tds[flightNumber-1].innerHTML = tds[flightNumber-1].innerHTML-1;
            document.getElementById('output').innerHTML = 'Sua passagem foi reservada com sucesso!<br>Seu Id é: '+id+'<br>E o número do voo é: '+flightNumber;
        }else {
            document.getElementById('output').innerHTML = 'Não foi possível reservar a passagem.<br>Lugares esgotados.';
        }
    });
}

function rst(){
    reset.addEventListener('click', function(){
        document.getElementById('id').value = '';
        document.getElementById('flightNumber').value = '';
    }); 
}