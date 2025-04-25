import react from 'react';
import './external.css';
import mycss   from './mycss.module.css';

const CssComp = () =>{
    
    let cssobj = {
        color:"blue",
        backgroundColor:"hotpink",
        fontFamily: "cursive"
    }

    return (
        <div>
            {/* this is internal css  */}
            <h2 style={{color:"red", backgroundColor:"wheat"}}>This is Css Components</h2>
            <h2 style={cssobj}>We are Cdac Students</h2>
            <p className='txtPrimary'>Sagar Lekurwale</p>
            <p className='txtSuccess'>At Globle Logic</p>

            <div className={mycss.box}>Hello</div>
        </div>
    )
}

export default CssComp;