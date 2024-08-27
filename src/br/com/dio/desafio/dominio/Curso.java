package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Métodos

    @Override
    public String toString() {
        return String.format("{Curso} Título: %s | Descrição: %s | Carga Horária: %d", getTitulo(), getDescricao(), getCargaHoraria());
    }
}
