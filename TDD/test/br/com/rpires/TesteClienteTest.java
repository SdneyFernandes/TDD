package br.com.rpires;



import br.com.rpires.TesteCliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteClienteTest {

	private Assertions Assert;

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Rodrigo");
		cli.adicionarNome1("Rodrigo");

		Assert.assertEquals("Rodrigo", cli.getNome());
	}
}
