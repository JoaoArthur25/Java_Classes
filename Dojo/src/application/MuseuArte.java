package application;

public class MuseuArte {
	
	String nomeQuadro; 
	String nomeEscultura;
	String autorQuadro;
	String autorEscultura;
	int quantidadeQuadro;
	int quantidadeEscultura;
	int precoQuadro = 1000;
	int precoEscultura = 1000;
	
	public void quadro(int quantidadeQuadro, String nomeQuadro, String autorQuadro) {
    	this.nomeQuadro = nomeQuadro;
    	this.autorQuadro = autorQuadro;
        if (quantidadeQuadro >= 0) {
            this.quantidadeQuadro = quantidadeQuadro;
        } else {
            throw new IllegalArgumentException();
        }
    }
	
	public void Escultura(int quantideEscultura, String nomeEscultura, String autorEscultura) {
    	this.nomeEscultura = nomeEscultura;
    	this.autorEscultura = autorEscultura;
        if (quantidadeQuadro >= 0) {
            this.quantidadeEscultura = quantideEscultura;
        } else {
            throw new IllegalArgumentException();
        }
    }
	
	public String mostrarQuadroName() {
		return nomeQuadro;
	}
	
	public String mostrarEsculturaName() {
		return nomeEscultura;
}
	public int mostrarPrecoQuadro() {
		return precoQuadro;
	}
	
	public int mostrarPrecoEscultura() {
		return precoEscultura;
	}
	
	public String mostrarAutorQuadro() {
		return autorQuadro;
	}
	public String mostrarAutorEscultura() {
		return autorEscultura;
	}
	@Override
    public String toString() {
        return nomeQuadro
                + ", $"
                + String.format("%.2f", precoQuadro)
                + ",     Total de quadros: "
                + ",      Nome: "
                + nomeQuadro
                + quantidadeQuadro
                + ",     Autor: "
                + autorQuadro
                + " ,    Preco escultura: $"
                + String.format("%.2f", precoEscultura)
                + " ,    Total de esculturas: "
                + ",      Nome: "
                + nomeEscultura
                + quantidadeEscultura
                + " ,     Autor: "
                + autorEscultura;
    }
}
