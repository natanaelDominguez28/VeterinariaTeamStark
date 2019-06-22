package aplicacion.modelo.dominio;
// Generated 21/06/2019 23:33:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String nombreUsuario;
     private String password;
     private Boolean estado;
     private String nombre;
     private String apellido;
     private Integer dni;
     private Date fechaNacimiento;
     private String tipoUsuario;
     private String correo;
     private Set facturas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public Usuario(String nombreUsuario, String password, Boolean estado, String nombre, String apellido, Integer dni, Date fechaNacimiento, String tipoUsuario, String correo, Set facturas) {
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
    public Integer getDni() {
        return this.dni;
    }
    
    public void setDni(Integer dni) {
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


