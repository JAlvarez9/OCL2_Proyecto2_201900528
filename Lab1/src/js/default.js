
//Code Mirror-----------------------------------------

var editor = CodeMirror.fromTextArea(document.getElementById('editor'),{
    mode: "xml",
    lineNumbers: true,
    theme: "blackboard"
    
})
editor.setSize(600,700)

var editor2 = CodeMirror.fromTextArea(document.getElementById('editor2'),{
    mode: "xml",
    lineNumbers: true,
    theme: "blackboard"
    
})
editor2.setSize(600,700)

//Https Requests

function Enviar_Conetndi(){
    var consolita = editor.getValue();

    //console.log(consolita)

    const back_URL = "http://localhost:3000/Consola_Back"

    const Data = {
        Consola: consolita
    }

    console.log(Data)

    Send_Data(back_URL, Data)
    

}

async function Send_Data(back_URL, Data){
    editor2.setValue("")
    await axios.post(back_URL, Data)
    .then(data => {
        console.log("Se recibio la info:", data)
        editor2.setValue(data.data.Consola)
    })
    .then(res => {console.log("Respuesta Recibida", res)})
    .catch(err => console.log("Error es este:", err));
}



