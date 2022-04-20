package jedi.project.enums;

public enum EspecialidadeEnum {

    CARDIOLOGISTA("Cardiologista"),
    CLINICO_GERAL("Clínico Geral");

    private final String especialidade;

    EspecialidadeEnum(String especialidade) {
        this.especialidade = especialidade;
    }

    public static EspecialidadeEnum forValue(String especialidade){

        for(EspecialidadeEnum value : EspecialidadeEnum.values()){
            if(value.especialidade.equals(especialidade)){
                return value;
            }
        }
        return null;
    }



}
