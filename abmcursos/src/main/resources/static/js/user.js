class User{
    ClearMessages(event, input){
        let value = input.name.toLowerCase();
        switch(value){
            case"email":
                document.getElementById(value).innerHTML = "";
                break;
            case"password":
                document.getElementById(value).innerHTML = "";
                break;
        }
    }
}