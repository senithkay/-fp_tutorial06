import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object q1 extends App {
     def encrypt(l:String, shift:Int):String=l.map((x:Char)=>{(x+shift).toChar})
     def decrypt(l:String, shift:Int):String=l.map((x:Char)=>{(x-shift).toChar})
     def cipher(func:(String,Int)=>String, str:String,shift:Int):String = func(str,shift)
     def drive():Unit={
          println("Insert a key: ");
          val key = readInt()
          println("Enter a string: ");
          val str = readLine()
          val b = cipher(encrypt,str,key)
          val d = cipher(decrypt,b,key)
          println("Not encrypt: "+ str);
          println("Encypt: "+ b);
          println("Decrypted: "+ d);
     }
     drive();
}
