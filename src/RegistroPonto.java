import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    private LocalDateTime horaSaida;



    public void apresentarRegistroPonto() throws InterruptedException {
        System.out.println(" Nome do Funcionário: " + getFunc().getNome());
        System.out.println(" Data de Registro:  " + getDataRegistro());
        System.out.println(" Horário de Entrada: "+ getHoraEntrada());
        System.out.println(" Horário de Saida: " + getHoraSaida());
        System.out.println("=========================================");
        Thread.sleep(1000);

        }
    }

