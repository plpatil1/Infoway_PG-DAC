import react, { Component } from "react";

class ClassComp extends Component{
    render(){
        return (
            <div>
                <h1>This is Class Comp</h1>
                <p>My Friend is : <ins>{this.props.name}</ins>, He is: <ins>{this.props.post}</ins></p>

            </div>
        )
    }
}
export default ClassComp;
