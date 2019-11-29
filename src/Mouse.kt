data class Mouse( var tipo: String = "usb") {

    init{

        tipo = tipo + "!"
        tipo = tipo + "Por cable"

    }

}