let xhr = new XMLHttpRequest();

window.onload = function () {
	document.getElementById("btnSalary").addEventListener("click", CalculateSalary);
	document.getElementById("btnSalary2").addEventListener("click", CalculateSalary2);
}

function  CalculateSalary () {
	xhr.onload = funcionCallBack;
	let name = document.getElementById("txtName").value;
	let salary = document.querySelector("#txtSalary").value;
	console.log(salary);
	xhr.open("GET", "CalculateSalaryServlet?txtName=" + name + "&txtSalary=" + salary);
	xhr.send(null);
}

function funcionCallBack () {
	document.getElementById("SalaryCalculated").innerHTML = xhr.responseText;
}

function CalculateSalary2(){
	xhr.onload = funcionCallBack2;
	let name2 = document.getElementById("txtName2").value;
	let salary2 = document.querySelector("#txtSalary2").value;
	console.log(salary2);
	// Create form
	let myForm = new FormData();
	// Create txtName y txtSalary parameter
	myForm.append("txtName2",name2);
	myForm.append("txtSalary2",salary2);
	xhr.open("POST", "CalculateSalaryServlet2");
	xhr.send(myForm);
}

function funcionCallBack2 () {
	document.getElementById("SalaryCalculated2").innerHTML = xhr.responseText;
}