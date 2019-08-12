package main;

public class FactoryFuncionario {

    private static String name;
    private static String adress;
    private static int ID;
    private static int metodo_de_pagamento;
    private static int type;
    private static boolean existe = false;
    private static int tipo_receber;
    private static int dias_sem_receber = 0 ;
    /*tipo_receber
    1 -> semanalmente
    2 -> mensalmente
    3 -> semanas determinadas
     */

    /*metodo de pagamento
    1 -> Cheque pelos correios
    2 -> Em Mãos
    3 -> Depósito em conta bancária
     */
    //Agenda de pagamento
    private static int tipo_da_agenda;


    //sindicato
    private static boolean sindicato;
    private static double taxa_sindical;
    private static int id_sindicato;
    private static double taxa_servico;

    //ponto
    private static int hora_entrada;
    private static int hora_saida;


    private static boolean in_work;


    /* 1 --> horista
       2 --> salaried
       3 --> commisioned
    */

    public static FactoryFuncionario addFuncionario(int type)
    {
        if(type==1) {
            FactoryFuncionario.setTipo_da_agenda(1);
            return new Horista();
        }
        else if (type==2) {
            FactoryFuncionario.setTipo_da_agenda(2);
            return new Salariado();
        }
        else {
            FactoryFuncionario.setTipo_da_agenda(3);
            return new Comissionado();
        }
    }

    public static int getDias_sem_receber() {
        return dias_sem_receber;
    }

    public static void setDias_sem_receber(int dias_sem_receber) {
        FactoryFuncionario.dias_sem_receber += dias_sem_receber;
    }
    public static void zerarDias_sem_receber() {
        FactoryFuncionario.dias_sem_receber = 0;
    }

    public static double getTaxa_servico() {
        return taxa_servico;
    }

    public static void setTaxa_servico(double taxa_servico) {
        FactoryFuncionario.taxa_servico += taxa_servico;
    }

    public static int getMetodo_de_pagamento() {
        return metodo_de_pagamento;
    }

    public static void setMetodo_de_pagamento(int metodo_de_pagamento) {
        FactoryFuncionario.metodo_de_pagamento = metodo_de_pagamento;
    }

    public static int getHora_entrada() {
        return hora_entrada;
    }

    public static int getHora_saida() {
        return hora_saida;
    }


    public static boolean isIn_work() {
        return in_work;
    }

    public static void setIn_work(boolean in_work) {
        FactoryFuncionario.in_work = in_work;
    }

    public static void setHora_entrada(int hora_entrada) {
        FactoryFuncionario.hora_entrada = hora_entrada;
    }

    public static void setHora_saida(int hora_saida) {
        FactoryFuncionario.hora_saida = hora_saida;
    }

    public static double getTaxa_sindical() {
        return taxa_sindical;
    }

    public static void setTaxa_sindical(double taxa_sindical) {
        FactoryFuncionario.taxa_sindical = taxa_sindical;
    }

    public static int getId_sindicato() {
        return id_sindicato;
    }

    public static void setId_sindicato(int id_sindicato) {
        FactoryFuncionario.id_sindicato = id_sindicato;
    }

    public static boolean isSindicato() {
        return sindicato;
    }

    public static void setSindicato(boolean sindicato) {
        FactoryFuncionario.sindicato = sindicato;
    }

    public static int getTipo_da_agenda() {
        return tipo_da_agenda;
    }

    public static void setTipo_da_agenda(int tipo_da_agenda) {
        FactoryFuncionario.tipo_da_agenda = tipo_da_agenda;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        FactoryFuncionario.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public static void setAdress(String adress) {
        FactoryFuncionario.adress = adress;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        FactoryFuncionario.ID = ID;
    }

    public static int getType() {
        return type;
    }

    public static void setType(int type) {
        FactoryFuncionario.type = type;
    }

    public static boolean isExiste() {
        return existe;
    }

    public static void setExiste(boolean existe) {
        FactoryFuncionario.existe = existe;
    }

}