public class Cofre implements Guardador {

    private Caixa caixa;

    public Cofre(float precoPorArmazenamentoEmReais) {
        // composição
//        caixa = new Caixa(precoPorArmazenamentoEmReais, 1) {
//            @Override
//            public void esvaziar() {
//                objetoGuardado = null;
//            }
//
//            @Override
//            protected boolean tratarOverflow() {
//                return false;
//            }
//        };  // classe anônima

        // composição
        caixa = new CaixaDeCofre(precoPorArmazenamentoEmReais);
    }

    @Override
    public void guardar(Guardavel item) {
        caixa.guardar(item);
    }

    @Override
    public void esvaziar() {
        caixa.esvaziar();
    }

    @Override
    public Guardavel recuperar() {
        return caixa.recuperar();
    }


    private class CaixaDeCofre extends Caixa {

        CaixaDeCofre(float precoPorArmazenamentoEmReais) {
            super(precoPorArmazenamentoEmReais, 1);
        }

        @Override
        public void esvaziar() {
            objetoGuardado = null;
        }

        @Override
        protected boolean tratarOverflow() {
            return false;
        }
    }


}
