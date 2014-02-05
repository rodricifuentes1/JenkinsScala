case object DivisionPorCero

object Calculadora {

  def sumar(x: Int, y: Int) = {
    x + y
  }

  def multiplicar(x: Int, y: Int) = {
    x * y
  }

  def restar(x: Int, y: Int) = {
    x - y
  }

  def dividir(x: Int, y: Int) = {
    y match {
      case 0 => DivisionPorCero
      case _ => x/y
    }
  }

  override def toString() = {
    "Hola" + sumar(2,2)
  }

}

object Main extends App {

  import Calculadora._

    println("La suma de 2+2 es: "+sumar(2,2))
    println("La resta de 2-2 es: "+restar(2,2))
    println("La miltiplicacion de 2*2 es: "+multiplicar(2,2))
    println("La division de 2/2 es: "+dividir(2,2))

}
