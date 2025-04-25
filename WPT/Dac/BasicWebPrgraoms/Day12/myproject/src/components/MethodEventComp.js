import react, { Component } from "react"; 

class MethodEventComp extends Component {

   greet(){
    window.alert("Good Morning Everyone");
   }

   welcome(...std){
    window.alert(`Welcome You ${std} in Cdac`);
   }

    render() {
        return (
            <div>
              <h1>  This is MethodEventComp  </h1>
              <button type="button" onClick={()=>this.greet() }>Greet</button>
              {/* <h2 onMouseOver={()=>this.welcome("Himanshu", "Yash", "Harsh", "Pawan")}>Hover on Me</h2> */}
            </div>
        )
    }
}
export default MethodEventComp;