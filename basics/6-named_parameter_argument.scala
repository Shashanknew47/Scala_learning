object DefaultArgs extends App {
    def savePicture(format:String = "jpg", width:Float = 13.2f, heigth:Float = 10.3f):Unit = {

        println(f"forma is $format, height is $heigth, and width is $width ")
    }

    savePicture(format="png",width=15.0f,heigth=12.3f)

}
