
package retosemana4;

///valueof
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Empleado {
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String celular;
    private boolean esProveedor;
    private String salario;
    private String cargo;
    
//constructor con los atributis: nombre, correo,celular, salario.

    public Empleado(long id, String nombre, String apellido, String correo, String celular, boolean esProveedor, String salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
        this.esProveedor = esProveedor;
        this.salario = salario;
        this.cargo = cargo;
    }
  
    
    public Empleado(String nombre, String correo, String celular, String salario) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
        this.salario = salario;
      
    }
//Métodos get and set de todos sus atributos
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean getEsProveedor() {
        return esProveedor;
    }

    public void setEsProveedor(boolean esProveedor) {
        this.esProveedor = esProveedor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   //metodos CRUD(Create,Read,Update,Delete)
    public static ArrayList<Empleado> leer(){
        ArrayList<Empleado> emp = new ArrayList<>();
        Conexion con = new Conexion("mybd.db");
        con.conectar();
        
        try {
            Statement st = con.getConexion().createStatement();
            ResultSet rs = st.executeQuery("select * from empleados");
            while(rs.next()){
                long id = rs.getLong("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String celular = rs.getString("celular");
               // boolean esProveedor =rs.getBoolean("esProveedor");
               boolean esProveedor =Boolean.valueOf(rs.getString("esProveedor")); 
                String salario = rs.getString("salario");
                String cargo = rs.getString("cargo");
                
                emp.add(new Empleado( id, nombre, apellido, correo, celular, esProveedor, salario, cargo));
            }
            rs.close();
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }
  
    public void crear(){
        try {          
            Conexion con = new Conexion("mybd.db");
            con.conectar();

            try (Statement st = con.getConexion().createStatement()){
               String sql="insert into empleados (nombre, apellido, correo, celular, esProveedor, salario, cargo)"+
                    "values('"+this.nombre+"','"+this.apellido+"','"+this.correo+"','"+this.celular+"','"+String.valueOf(this.esProveedor)+"','"+this.salario+"','"+this.cargo+"');";          
//                st.executeQuery(sql);
                  st.execute(sql);
            } 
                      

            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void borrar(long id){
        try {
            Conexion con = new Conexion("mybd.db");
            con.conectar();
            
            Statement st = con.getConexion().createStatement();
            st.execute("delete from empleados where id="+ id +";");
            st.close();
            con.cerrarConexion();
        } catch (Exception e) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     
     public static void actualizar(long id, String nombre, String apellido, String correo, String celular, boolean esProveedor, String salario, String cargo){

        try {
            Conexion con = new Conexion("mybd.db");
            con.conectar();
            Statement st = con.getConexion().createStatement();
            st.execute("update empleados set nombre='"+ nombre +"', apellido='"+ apellido +"', correo='"+ correo +"', celular='"+ celular +"', esProveedor='"+String.valueOf(esProveedor)+"', salario='"+ salario +"',cargo='"+ cargo +"' where id="+ id +";");
            st.close();
            con.cerrarConexion();
            
        } catch (SQLException e) {
             Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     
}
