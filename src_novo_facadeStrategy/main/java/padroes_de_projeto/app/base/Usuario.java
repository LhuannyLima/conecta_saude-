package base;
public abstract class Usuario {
    private long id;
    private String nome;
    private String telefone;  
    
    public Usuario(){}

    public Usuario(long id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;      
    }

    public String getNome(){
        return nome;
    }public void setNome(String nome){
        this.nome = nome;
    }

    public Long getId(){
        return id;
    }public void setId(Long id){
        this.id =id;
    }

    public String getTelefone(){
        return telefone;
    }public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
    