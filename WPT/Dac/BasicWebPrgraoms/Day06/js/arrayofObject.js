
let emp = [
    { id: 1101, name: "Himanshu", post: "dsp", salary: 251201, address: "Nagpur" },
    { id: 1102, name: "Pawan", post: "developer", salary: 50000, address: "Pune" },
    { id: 1103, name: "Yogesh", post: "manager", salary: 60000, address: "Mumbai" },
    { id: 1104, name: "Yahs", post: "designer", salary: 45000, address: "Hyderabad" },
    { id: 1105, name: "Prasad", post: "analyst", salary: 55000, address: "Chennai" },
    { id: 1106, name: "Harsh", post: "intern", salary: 30000, address: "Bangalore" },
    { id: 1107, name: "Sagar", post: "HR", salary: 48000, address: "Delhi" },
    { id: 1108, name: "Ravi", post: "support", salary: 40000, address: "Kolkata" },
    { id: 1109, name: "Tejas", post: "engineer", salary: 70000, address: "Ahmedabad" },
    { id: 1110, name: "Viraj", post: "consultant", salary: 65000, address: "Surat" }
];



let parentEle=document.getElementById("parent");

for(let i=0; i<emp.length; i++){
    let newchildId = document.createAttribute('td');
    let newchildName = document.createAttribute('td');
    let newchildPost = document.createAttribute('td');
    let newchilSal = document.createAttribute('td');
    let newchilAddre = document.createAttribute("td");

    let b=emp[i];

    newchildId.innerText = b.id;
    newchildName.innerText = b.name;
    newchildPost.innerText = b.post;
    newchilSal.innerText = b.salary;
    newchilAddre.innerText = b.address;

    parentEle.appendChild(newchildId);
    parentEle.appendChild(newchildName);
    parentEle.appendChild(newchildPost);
    parentEle.appendChild(newchildSal);
    parentEle.appendChild(newchildAddre);
};
