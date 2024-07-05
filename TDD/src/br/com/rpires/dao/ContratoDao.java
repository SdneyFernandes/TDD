package br.com.rpires.dao;

/**
 * @author rodrigo.pires
 */
public class ContratoDao implements IContratoDao {

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar() {
        return "Contrato encontrado";
    }

    @Override
    public void excluir() {

    }

    @Override
    public void atualizar() {

    }
}
