import org.junit.runner.RunWith
import org.junit.Test
import org.scalatest.junit.JUnitRunner
import org.scalatest.Suite

@RunWith(classOf[JUnitRunner])
class CalculadoraTest extends Suite
{
  @Test def testSuma = {
    assert(Calculadora.sumar(2,2)==4)
  }

  @Test def testResta = {
    assert(Calculadora.restar(2,2)==0)
  }

  @Test def testMultiplicacion = {
    assert(Calculadora.multiplicar(2,2)==4)
  }
  @Test def testDivision = {
    assert(Calculadora.dividir(2,2)==1)
    assert(Calculadora.dividir(2,0) == DivisionPorCero)
  }

}
