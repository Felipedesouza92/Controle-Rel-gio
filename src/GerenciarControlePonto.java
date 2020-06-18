import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args)throws InterruptedException {


        Gerente gerente1 = new Gerente();

        gerente1.setLogin(" gerente1");

        gerente1.setNome(" Antonio");

        gerente1.setSenha("Felipe");



        Secretaria secretaria1 = new Secretaria();

        secretaria1.setRamal("5555");

        secretaria1.setTelefone("4444-3333");

        secretaria1.setNome("Jheniffer");



        Operador operador1 = new Operador();

        operador1.setValorHora(7.00);

        operador1.setNome(" Jose");



        RegistroPonto registro1 = new RegistroPonto();

        registro1.setFunc(gerente1);

        registro1.setDataRegistro(LocalDate.of(2020,06 ,18));

        registro1.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,20));

        registro1.apresentarRegistroPonto();





        RegistroPonto registro2 = new RegistroPonto();

        registro2.setFunc(secretaria1);

        registro2.setDataRegistro(LocalDate.of(2020,06,18));

        registro2.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,21));

        registro2.apresentarRegistroPonto();



        RegistroPonto registro3 = new RegistroPonto();

        registro3.setFunc(operador1);

        registro3.setDataRegistro(LocalDate.of(2020,06,18));

        registro3.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,22));

        registro3.apresentarRegistroPonto();



        RegistroPonto registro4 = new RegistroPonto();

        registro4.setFunc(gerente1);

        registro4.setDataRegistro(LocalDate.of(2020,06,18));

        registro4.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,20));

        registro4.setHoraSaida(LocalDateTime.of(2020,06,18,07,40,01));

        registro4.apresentarRegistroPonto();



        RegistroPonto registro5 = new RegistroPonto();

        registro5.setFunc(secretaria1);

        registro5.setDataRegistro(LocalDate.of(2020,06,18));

        registro5.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,21));

        registro5.setHoraSaida(LocalDateTime.of(2020,06,18,07,40,02));

        registro5.apresentarRegistroPonto();



        RegistroPonto registro6 = new RegistroPonto();

        registro6.setFunc(operador1);

        registro6.setDataRegistro(LocalDate.of(2020,06,18));

        registro6.setHoraEntrada(LocalDateTime.of(2020,06,18,07,34,22));

        registro6.setHoraSaida(LocalDateTime.of(2020,06,18,07,40,03));

        registro6.apresentarRegistroPonto();

    }

}
