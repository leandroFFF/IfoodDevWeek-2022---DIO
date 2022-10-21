package logicaCondicionalControleFluxos.operadoresRelacionais;

public class ControleDeFluxo {
    public static void main(String[] args) {
        /*
        * DECISÃO       -> para expressoes booleanas
        * ------------------------
        * if(condicao) {}
        * ------------------------
        * if(condicao) {}
        * else {}
        * ------------------------
        * if(condicao) {}
        * else if(condicao2) {}
        * else {}
        * ------------------------
        *
        * OPERADOR TERNARIO - Evitar ao maximo seu uso
        *
        * condicao ? verdadeiro : falso;
        *
        * SWITCH CASE       -> para valores exatos
        *
        * switch (variavel) {
        *   case valor1:
        *       instrucao1;
        *       break;
        *   case valor2:
        *       instrucao2;
        *       break;
        *   default:
        *       instrucaoCasoNenhumaDasAnteriores;
        *       break;
        * }
        *
        * EXERCICIO
        *
        * */

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();


    }
    public static void ifFlecha() {
        int mes = 9;
        if(mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            }else {
                if(mes == 3) {
                    System.out.println("Março");
                }else {
                    if(mes == 4) {
                        System.out.println("Abril");
                    }else {
                        if(mes == 5) {
                            System.out.println("Maio");
                        }else {
                            if(mes == 6) {
                                System.out.println("Junho");
                            }else {
                                if(mes == 7) {
                                    System.out.println("Julho");
                                }else {
                                    if(mes == 8) {
                                        System.out.println("Agosto");
                                    }else {
                                        if(mes == 9) {
                                            System.out.println("Setembro");
                                        }else {
                                            if(mes == 10) {
                                                System.out.println("Outubro");
                                            }else {
                                                if(mes == 11) {
                                                    System.out.println("Novembro");
                                                }else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    }else {
                                                        System.out.println("Dezembro");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ifSemFlecha() {
        int mes = 3;
        if(mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if(mes == 3) {
            System.out.println("Março");
        }else if(mes == 4) {
            System.out.println("Abril");
        }else if(mes == 5) {
            System.out.println("Maio");
        }else if(mes == 6) {
            System.out.println("Junho");
        }else if(mes == 7) {
            System.out.println("Julho");
        }else if(mes == 8) {
            System.out.println("Agosto");
        }else if(mes == 9) {
            System.out.println("Setembro");
        }else if(mes == 10) {
            System.out.println("Outubro");
        }else if(mes == 11) {
            System.out.println("Novembro");
        }else if(mes == 12) {
            System.out.println("Dezembro");
        }
    }

    public static void ifFerias() {     //era melhor ter utilizado o switch por estar avaliando um unico elemento
        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    public static void ifMenor() {      //dar preferencia por variaveis menores
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;


    }

    public static void switchSemana() {
        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println(1);
                System.out.println("Dia inválido");
                break;
        }
    }

    public static void  switchNumero() {
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    public static void switchFerias() {
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }

}
