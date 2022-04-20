package jedi.project.model;

import jedi.project.enums.EspecialidadeEnum;

public class Medico extends Pessoa{

        private String crm;
        private EspecialidadeEnum especialidade;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public EspecialidadeEnum getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(EspecialidadeEnum especialidade) {
        this.especialidade = especialidade;
    }
}
