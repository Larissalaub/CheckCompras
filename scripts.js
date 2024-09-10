const itemForm =  document.getElementById('item-form');
const itemList = document.getElementById('item-List');
const totalAmount = document.getElementById('total-amount');

let total = 0;

itemForm.addEventListener('submit', function(event) {
    event.preventDefault(); 

    const itemName = document.getElementById('item-name');
    const itemQuatity = parseInt('item-quatity').value);
    const itemPrice = parseFloat(document.getElementById('item-price').value);

    const itemTotalPrice = itemQuatity * itemPrice;

    const lisItem = dispatchEvent.createElement('li');
    lisItem.innerHTML = `
    ${itemName} - ${itemQuantity} unidade(s) - R$ ${itemTotalPrice.toFixed(2)}
    <button class="delete-btn">Remover</button>
`;

itemList.appendChild(lisItem);

total += itemTotalPrice;
totalAmount.textContent = total.toFixed(2);

itemForm.reset();

}