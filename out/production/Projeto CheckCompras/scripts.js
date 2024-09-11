const itemForm = document.getElementById('item-form');
const itemList = document.getElementById('item-list');
const totalAmount = document.getElementById('total-amount');

let total = 0;

itemForm.addEventListener('submit', function(event) {
    event.preventDefault();

    const itemName = document.getElementById('item-name').value;
    const itemQuantity = parseInt(document.getElementById('item-quantity').value);
    const itemPrice = parseFloat(document.getElementById('item-price').value);

    const itemTotalPrice = itemQuantity * itemPrice;

    const listItem = document.createElement('li');
    listItem.innerHTML = `
        ${itemName} - ${itemQuantity} unidade(s) - R$ ${itemTotalPrice.toFixed(2)}
        <button class="delete-btn">Remover</button>
    `;

    itemList.appendChild(listItem);

    total += itemTotalPrice;
    totalAmount.textContent = total.toFixed(2);

    itemForm.reset();

    listItem.querySelector('.delete-btn').addEventListener('click', function() {
        itemList.removeChild(listItem);
        total -= itemTotalPrice;
        totalAmount.textContent = total.toFixed(2);
    });
});
