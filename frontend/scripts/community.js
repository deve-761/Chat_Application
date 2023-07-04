  
//  let arr = JSON.parse(localStorage.getItem("community"))||[] ;
function openchannel(channel) {
    // Make API call to signup with the community name
    console.log(channel);
    localStorage.setItem("community", JSON.stringify(channel));
    window.location.href = 'channel.html';

}


fetch("http://localhost:8888/chat/channels")
.then((response) => response.json())
.then((data) => {
  // Update community name in HTML
  
  let arr = data;
  console.log(arr);
  arr.forEach(ele => {
    let tr = document.createElement("tr");
    let td = document.createElement("td");
    td.innerText = ele.name;
    tr.append(td);
    tr.addEventListener('click', () => {
        openchannel(ele);
    });
    document.querySelector("tbody").append(tr);
});
})
.catch((error) => console.log(error));  




