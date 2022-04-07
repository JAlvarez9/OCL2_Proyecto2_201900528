
const bt_acercaDe = document.querySelector('#acerca_de')
const modalBg = document.querySelector('.modal-background');
const modal = document.querySelector('.modal')



bt_acercaDe.addEventListener('click', ()=>{
    modal.classList.add('is-active');
    var paragraph = document.getElementById('dentro_Modal');
    paragraph.textContent = 'Nombre: Jose Fernando Alvarez Morales \n'
    paragraph.textContent += 'Carne: 201900528 \n'
    paragraph.textContent += 'Sección:D'
})

modalBg.addEventListener('click', () => {
    modal.classList.remove('is-active');
});