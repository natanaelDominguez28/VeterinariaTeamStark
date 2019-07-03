package aplicacion.modelo.dominio;
// Generated 03/07/2019 16:32:16 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private long codigo;
     private String nombreUsuario;
     private String password;
     private Boolean estado;
     private String nombre;
     private String apellido;
     private String dni;
     private Date fechaNacimiento;
     private String tipoUsuario;
     private String correo;
     private Set facturas = new HashSet(0);

    public Usuario() {
    }

    public Usuario(long codigo, String nombreUsuario, String password, String tipoUsuario, Boolean estado) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.estado = estado;
    }

    
	
    public Usuario(long codigo, String nombreUsuario, String password) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Usuario(long codigo, String nombreUsuario, String password, Boolean estado, String nombre, String apellido, String dni, Date fechaNacimiento, String tipoUsuario, String correo, Set facturas) {
       this.codigo = codigo;
       this.nombreUsuario = nombreUsuario;
       this.password = password;
       this.estado = estado;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.fechaNacimiento = fechaNacimiento;
       this.tipoUsuario = tipoUsuario;
       this.correo = correo;
       this.facturas = facturas;
    }
   
    public long getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


