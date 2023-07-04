  
//  let arr = JSON.parse(localStorage.getItem("community"))||[] ;
function handleSignup(communityId) {
    // Make API call to signup with the community name
    console.log(communityId);
    localStorage.setItem("community", JSON.stringify(communityId));
    window.location.href = 'login.html';

}


fetch("http://localhost:8888/chat/communities")
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
        handleSignup(ele);
    });
    document.querySelector("tbody").append(tr);
});
})
.catch((error) => console.log(error));  




