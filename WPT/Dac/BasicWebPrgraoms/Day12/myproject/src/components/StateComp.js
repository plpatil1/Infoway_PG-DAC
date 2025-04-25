import React, { Component } from "react";

class StateComp extends Component{

   constructor(){
    super();
    this.state={
        name:"Pawan",
        salary:63563,
        post:"NTG"
    }
   }
   changeState(){
    // this.setState({name:"Pawan Lekurwale"});
    // this.setState({salary:99999});
    this.setState((prevState)=>({name:"Pawan Lekurwale", salary:prevState.salary+6000}));
   }
    
    render() {
        return (

            <div>
        <h2>This is StateComp</h2>
        <p>My Name is: <b>{this.state.name}</b> <br />
        <p>My Salary is: <b>{this.state.salary}</b></p>
        </p>
        <button type="button" onClick={()=>this.changeState()}>ChangeData</button>
   <br />
        <b onMouseOver={()=>this.setState({name:"Pawan Lekurwale", salary:this.state.salary+6000})}>Hover on Me</b>
        </div>

        )
        
    
}
}
export default StateComp;