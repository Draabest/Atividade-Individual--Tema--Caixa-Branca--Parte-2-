package pasta;
/**
 * Classe de teste para a classe {@link Calculadora}.
 *
 * <p>Esta classe demonstra o uso dos métodos da classe Calculadora,
 * realizando chamadas válidas e também chamadas que geram exceções.
 * O objetivo é mostrar o comportamento dos operadores e o tratamento
 * adequado de erros (como divisão por zero e operador inválido).</p>
 *
 * <p>Operações demonstradas:</p>
 * <ul>
 *     <li>Soma</li>
 *     <li>Subtração</li>
 *     <li>Multiplicação</li>
 *     <li>Divisão</li>
 *     <li>Exceção por divisão por zero</li>
 *     <li>Exceção por operador inválido</li>
 * </ul>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class CalculadoraTeste {

    /**
     * Método principal que executa diversos testes com a classe {@link Calculadora}.
     *
     * <p>Este método cria uma instância de Calculadora e realiza chamadas ao método
     * {@code calcular()}, exibindo os resultados no console.</p>
     *
     * <p>Também são feitos testes com exceções para verificar:</p>
     * <ul>
     *     <li>Divisão por zero</li>
     *     <li>Uso de operador inválido</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não são utilizados)
     */

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
       
        System.out.println(calc.calcular( 2,  3,  "+"));
        System.out.println(calc.calcular( 10,  4,  "-"));
        System.out.println(calc.calcular( 3,  5,  "*"));
        System.out.println(calc.calcular( 8,  2,  "/"));

        try {
            System.out.println(calc.calcular( 8,  0,  "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular( 5,  5,  "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}