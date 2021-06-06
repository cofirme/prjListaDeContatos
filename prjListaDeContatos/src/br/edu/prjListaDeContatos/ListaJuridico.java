package br.edu.prjListaDeContatos;

public class ListaJuridico extends ListaContatos {
    private String site;
    private String funcionário;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getFuncionário() {
        return funcionário;
    }

    public void setFuncionário(String funcionário) {
        this.funcionário = funcionário;
    }

    @Override
    public String toString() {
        return super.toString()+
                "" +
                "Site='" + site + '\'' +
                ", funcionário='" + funcionário + '\'' +
                '}' + '\n';
    }
}
