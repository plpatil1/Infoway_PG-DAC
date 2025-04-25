import react, { Component, props} from 'react';

class ConditionRenComp extends Component{

    constructor(){
        super(props);

        this.state={
            isCod:true
        }

    }


    render(){
//         let msg = "";
//         if(this.state.isCod){
          
//             msg="Admin Login SucessFully";
//         } else {
            
//             msg="User Login SucessFully";
//         }
//         return <h3>{msg}</h3>
              
            //   return (!this.state.isCod) ? <h2>Admin Login SucessFully</h2>  : <h2>User Login SuccessFully</h2>

            // return this.state.isCod 
            return (
                <div>
                    <h3>Conditional Compnonents</h3>
                </div>
            )


 }
}
export default ConditionRenComp