package lista;

public class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public void inserirInicio(String info) {
        No no = new No();
        no.info = info;
        no.anterior = null;
        no.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = no;
        }
        inicio = no;
        if (tamanho == 0) {
            fim = inicio;
        }
        tamanho++;
    }

    public void inserirFim(String info) {
        No no = new No();
        no.info = info;
        no.proximo = null;
        no.anterior = fim;
        if (fim != null) {
            fim.proximo = no;
        }
        fim = no;
        if (tamanho == 0) {
            inicio = fim;
        }
        tamanho++;

    }

    public String retirarInicio() {

        if (inicio == null) {
            return null;
        }
        String out = inicio.info;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null;
        }
        tamanho--;

        return out;
    }


    public String retirarFim() {
        if (fim == null) {
            return null;
        }
        String out = fim.info;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null;
        }
        tamanho--;

        return out;
    }

    public void inserirMeio(int posicao, String info) {
        if (posicao <= 0) {
            inserirInicio(info);
        } else if (posicao >= tamanho) {
            inserirFim(info);
        } else {
            No local = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                local = local.proximo;
            }
            No no = new No();
            no.info = info;
            no.anterior = local;
            no.proximo = local.proximo;
            local.proximo = no;
            no.proximo.anterior = no;
            tamanho++;
        }
    }

    public String retirar(int posicao) {
        if (posicao < 0 || posicao >= tamanho || inicio == null) {
            return null;
        } else if (posicao == 0) {
            return retirarInicio();
        } else if (posicao == tamanho - 1) {
            return retirarFim();
        }

        No local = inicio;
        for (int i = 0; i < posicao; i++) {
            local = local.proximo;
        }
        if (local.anterior != null) {
            local.anterior.proximo = local.proximo;
        }
        if (local.proximo != null) {
            local.proximo.anterior = local.anterior;
        }
        tamanho--;
        return local.info;
    }

    public String retirarPorvalor(String valor) {
        No local = inicio;

        for (int i = 0; i < tamanho; i++) {
            local = local.proximo;
            if (valor == local.info) {
                if (local.anterior != null) {
                    local.anterior.proximo = local.proximo;
                }
                if (local.proximo != null) {
                    local.proximo.anterior = local.anterior;
                } else {
                    return "0";
                }
            }
        }
        tamanho--;
        return local.info;
}

    public String toString() {
        String str = "(" + tamanho + ")";
        No local = inicio;
        while (local != null) {
            str += local.info + " ";
            local = local.proximo;
        }
        return str;
    }
}
