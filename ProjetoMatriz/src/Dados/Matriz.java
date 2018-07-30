
package Dados;

/**
 *
 * @author Leticia
 */
public class Matriz {

    //atributos
    private int quantidadeLinhas = 0;
    private int quantidadeColunas = 0;
    private int[][] objetoMatriz = null;

    //metodos
    public Matriz(int qLinhas, int qColunas) throws Exception {
        if (qLinhas <= 0 || qColunas <= 0) {
            throw new Exception("Quantidade de Linha ou colunas não pode ser <0");
        }
        objetoMatriz = new int[qLinhas][qColunas];
        this.quantidadeLinhas = qLinhas;
        this.quantidadeColunas = qColunas;
    }

    public int getQuantidadeLinhas() {
        return quantidadeLinhas;
    }

    public int getQuantidadeColunas() {
        return quantidadeColunas;
    }

    public int getElemento(int linha, int coluna) throws Exception {
        if (linha < 0 || linha >= quantidadeLinhas) {
            throw new Exception("Linha fora do intervalo válido");
        }
        if (coluna < 0 || coluna >= quantidadeColunas) {
            throw new Exception("Coluna fora do intervalo válido");
        }
        return objetoMatriz[linha][coluna];
    }

    public void setElemento(int linha, int coluna, int elemento) throws Exception {
        if (linha < 0 || linha >= quantidadeLinhas) {
            throw new Exception("Linha fora do intervalo válido");
        }
        if (coluna < 0 || coluna >= quantidadeColunas) {
            throw new Exception("Coluna fora do intervalo válido");
        }
        objetoMatriz[linha][coluna] = elemento;
    }

    public String getMatriz() {
        String saida = "";
        for (int l = 0; l < quantidadeLinhas; l++) {
            for (int c = 0; c < quantidadeColunas; c++) {
                saida += objetoMatriz[l][c] + "  ";
            }
            saida += "\n";
        }
        return saida;
    }

    public Matriz adicionar(Matriz objetoMatriz) throws Exception {
        if (this.quantidadeLinhas != objetoMatriz.quantidadeLinhas || this.quantidadeColunas != objetoMatriz.quantidadeColunas) {
            throw new Exception("As matrizes não são de mesma Ordem");
        }
        Matriz aux = new Matriz(this.quantidadeLinhas, this.quantidadeColunas);
        for (int l = 0; l < this.quantidadeLinhas; l++) {
            for (int c = 0; c < this.quantidadeColunas; c++) {
                int valor = this.getElemento(l, c) + objetoMatriz.getElemento(l, c);
                aux.setElemento(l, c, valor);
            }
        }
        return aux;
    } //ok

    public Matriz subtrair(Matriz objetoMatriz) throws Exception {
        if (this.quantidadeLinhas != objetoMatriz.quantidadeLinhas || this.quantidadeColunas != objetoMatriz.quantidadeColunas) {
            throw new Exception("As matrizes não são de mesma Ordem");
        }
        Matriz aux = new Matriz(this.quantidadeLinhas, this.quantidadeColunas);
        for (int l = 0; l < this.quantidadeLinhas; l++) {
            for (int c = 0; c < this.quantidadeColunas; c++) {
                int valor = this.getElemento(l, c) - objetoMatriz.getElemento(l, c);
                aux.setElemento(l, c, valor);
            }
        }
        return aux;
    } //ok

    public Matriz Multiplicar(Matriz objetoMatriz) throws Exception {
        if (this.quantidadeColunas != objetoMatriz.quantidadeLinhas) {
            throw new Exception("o número de colunas da matriz A deve ser igual ao número de linhas da matriz B");
        }
        //linhas da primeira matriz são multiplicados por colunas da matriz segunda
        Matriz aux = new Matriz(this.quantidadeLinhas, objetoMatriz.quantidadeColunas);
        for (int l = 0; l < quantidadeLinhas; l++) {
            for (int c = 0; c < objetoMatriz.quantidadeColunas; c++) {
                int valor = 0;
                for (int k = 0; k < quantidadeLinhas; k++) {
                    valor += (this.getElemento(l, k) * objetoMatriz.getElemento(k, c));
                }
                aux.objetoMatriz[l][c]=valor;
            }
        }
        return aux;
    } //ok

    public Matriz Transposta() throws Exception {
        if (quantidadeLinhas != quantidadeColunas) {
            throw new Exception("A matrize não é quadrada");
        }
        Matriz aux = new Matriz(quantidadeLinhas, quantidadeColunas);
        for (int l = 0; l < quantidadeLinhas; l++) {
            for (int c = 0; c < quantidadeColunas; c++) {
                int valor = getElemento(l, c);
                aux.setElemento(c, l, valor);
            }
        }
        return aux;

    } //não da certo

    //+ calcularPotencia(expoente >=0 : int) : Matriz
    public Matriz Potencia(int expoente) throws Exception {
        //Valida se o expoente é negativo
        if (expoente < 0) {
            throw new Exception("Expoente não é maior ou igual a zero!");
        }
        // valida se a matriz é qudarada
        if (quantidadeLinhas != quantidadeColunas) {
            throw new Exception("A matriz não é quadrada");
        }
        //cria o objeto
        Matriz aux = new Matriz(quantidadeLinhas, quantidadeColunas);
        //se o expoente for = zero o resultado é 1
        if (expoente == 0) {
            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    if (l == c) {
                        aux.objetoMatriz[l][c] = 1;
                    } else {
                        aux.objetoMatriz[l][c] = 0;
                    }
                }
            }
            return aux;
        } //se o expoente for 1 o resultado é a base
        else if (expoente == 1) {
            return this;

        } else {
            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    aux.objetoMatriz[l][c] = this.objetoMatriz[l][c];
                }
            }
            for (int l = 0; l < expoente - 1; l++) {
                aux = aux.Multiplicar(this);
            }
            return aux;
        }
    }

    public Matriz multiplicarK(int constante) throws Exception {
        Matriz aux = new Matriz(this.quantidadeLinhas, this.quantidadeColunas);
        for (int l = 0; l < this.quantidadeLinhas; l++) {
            for (int c = 0; c < quantidadeColunas; c++) {
                aux.objetoMatriz[l][c] = this.objetoMatriz[l][c] * constante;
            }
        }
        return aux;
    }

    public boolean eTriangularSuperior() {
        //abaixo da diagonal principal forem nulos, teremos uma matriz triangular superior,
        if (quantidadeLinhas != quantidadeColunas) {
            return false;
        } else {

            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    if (l > c && objetoMatriz[l][c] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public boolean eTriangularInferior() {
        //acima da diagonal principal forem nulos, teremos uma matriz triangular superior,
        if (quantidadeLinhas != quantidadeColunas) {
            return false;
        } else {

            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    if (l < c && objetoMatriz[l][c] != 0) {
                        return false;
                    }

                }
            }
            return true;
        }

    }

    public boolean eSimetrica() {
        //a transposta é igual a original
        if (quantidadeColunas != quantidadeLinhas) {
            return false;
        } else {
            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    if (objetoMatriz[l][c] != objetoMatriz[c][l]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public boolean eIdentidade() {
        //
        if (quantidadeColunas != quantidadeLinhas) {
            return false;
        } else {
            for (int l = 0; l < quantidadeLinhas; l++) {
                for (int c = 0; c < quantidadeColunas; c++) {
                    if (l == c && objetoMatriz[l][c] != 1) {
                        return false;
                    } else if (l != c && objetoMatriz[l][c] != 0) {
                        return false;
                    }
                }
            }

        }

        return true;

    }

    public boolean eIgual(Matriz objeto) throws Exception {
        if(this.quantidadeLinhas != objeto.quantidadeLinhas||
                this.quantidadeColunas != objeto.quantidadeColunas) return false;
        for (int l = 0; l < quantidadeLinhas; l++) {
            for (int c = 0; c < quantidadeColunas; c++) {
                if (this.getElemento(l, c) != objeto.getElemento(l, c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean eDiferente(Matriz objeto) throws Exception {
        if(this.quantidadeLinhas != objeto.quantidadeLinhas||
                this.quantidadeColunas != objeto.quantidadeColunas) return true;
        for (int l = 0; l < quantidadeLinhas; l++) {
            for (int c = 0; c < quantidadeColunas; c++) {
                if (this.getElemento(l, c) != objeto.getElemento(l, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean eOrtogonal() throws Exception {
        //matriz ortogonal é uma matrizl em que a inversa é igual a transposta
        if (this.quantidadeLinhas != this.quantidadeColunas) {return false;}
        if(this.Multiplicar(this.Transposta()).eIdentidade()){
            return true;
        }else{
            return false;
        }
        
    }

    public boolean ePermutacao() throws Exception {
        
        if (this.quantidadeLinhas != this.quantidadeColunas) {
            return false;
        }
        int soma = 0;
        int soma2 = 0;
        for (int l = 0; l < quantidadeLinhas; l++) {
            soma = 0;
            soma2 = 0;
            for (int c = 0; c < quantidadeColunas; c++) {
                if (this.objetoMatriz[l][c] != 0 && this.objetoMatriz[l][c] != 1) {
                    return false;
                }
                soma += this.objetoMatriz[l][c];
                soma2 += this.objetoMatriz[c][l];
                if (soma > 1) {
                    return false;
                }
                if (soma2 > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
