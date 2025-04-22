import prompt from "prompt";

prompt.start();

  //
  // Get two properties from the user: username and email
  //
  prompt.get(['username', 'email'], function (err, result) {
    //
    // Log the results.

    if(result.username==='admin'  && result.email==='plpatil1151@gmail.com'){
        console.log("Login Successfully");
        console.log(`Welcome You: ${result.username}`);
    } else {
        console.log("Invalid Credentials");
    }


    //
    // console.log('Command-line input received:');
    // console.log('  username: ' + result.username);
    // console.log('  email: ' + result.email);
  });
