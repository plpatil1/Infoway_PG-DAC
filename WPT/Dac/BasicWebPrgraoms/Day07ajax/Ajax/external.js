// step:1 create XMLHttpRequest object 
let parentElement = document.getElementById("d1");
let xmlObj = new XMLHttpRequest();
//    step: 2 write callback method to handle Response


xmlObj.onload = function () {
  //  console.log(this.responseText);
  let data = JSON.parse(this.responseText);

  for (let d of data) {
    let newRow = document.createElement("tr");
    newRow.innerHTML = `<td>${d.id}</td> <td>${d.name}</td> <td>${d.price}</td> <td>${d.company}</td> <td>${d.quantity}</td>`;
    parentElement.appendChild(newRow);

  }
}
// create the requst by using open method 
xmlObj.open("GET", "http://localhost:8888/products");

// step: send request to server  
xmlObj.send();


// ******************************************** Delete Data **************************************************************


function deleteData() {

  let id = document.getElementById("pid").value;
  if (window.confirm(`Are You Sure to Delete to Product with id: ${pid}`)) {
    let objd = new XMLHttpRequest();
    objd.onload = function () {
      window.alert("Product Deleted SucessFully..");
    }
    objd.open("DELETE", `http://localhost:8888/products/${id}`);
    objd.send();

  }
}


// ********************************* Add data *******************************************************

function myAdd() {
  // window.alert("YE");
  let productObj = {
    name: document.getElementById("ptname").value,
    price: document.getElementById("ptprice").value,
    company: document.getElementById("ptcompany").value,
    quantity: document.getElementById("ptquantity").value


  };
  let data = JSON.stringify(productObj);

  let myad = new XMLHttpRequest();

  myad.onload = function () {
    window.alert("Product Added SucessFully...");
  }
  myad.open("POST", `http://localhost:8888/products`);
  myad.send(data);
 
  // console.log(data);   
}

// ******************************** Update Products *************************************************
let id;
function getSinglProduct() {
  // console.log("id");
  
  let upobj = new XMLHttpRequest();
  id = document.getElementById("utid").value;
  
  upobj.onload = function () {
    window.alert(`Data Founded..`);
    // console.log(this.responseText);
    // console.log(data);
    let data  = JSON.parse(this.responseText);

    document.getElementById("utname").value = data.name;
    document.getElementById("utprice").value = data.price;
    document.getElementById("utcompany").value = data.company;
    document.getElementById("utcompany").value = data.quantity;

    // console.log(data);
  }
  upobj.open("GET", `http://localhost:8888/products/${id}`);
  upobj.send();

}

function updateProduct () {



  let productObj = {
    name: document.getElementById("utname").value,
    price: document.getElementById("utprice").value,
    company: document.getElementById("utcompany").value,
    quantity: document.getElementById("utquantity").value
  }
let Updata = JSON.stringify(productObj);

  let upObj = new XMLHttpRequest();

  upObj.onload = function () {
    window.alert("Product Updated!");
  }
  upObj.open("PUT", `http://localhost:8888/products`);
  upObj.send(Updata);
}