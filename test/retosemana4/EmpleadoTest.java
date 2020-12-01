/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retosemana4;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JFORERO
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Empleado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Empleado instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Empleado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Empleado instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellido method, of class Empleado.
     */
    @Test
    public void testGetApellido() {
        System.out.println("getApellido");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getApellido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellido method, of class Empleado.
     */
    @Test
    public void testSetApellido() {
        System.out.println("setApellido");
        String apellido = "";
        Empleado instance = null;
        instance.setApellido(apellido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Empleado.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Empleado.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Empleado instance = null;
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCelular method, of class Empleado.
     */
    @Test
    public void testGetCelular() {
        System.out.println("getCelular");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getCelular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCelular method, of class Empleado.
     */
    @Test
    public void testSetCelular() {
        System.out.println("setCelular");
        String celular = "";
        Empleado instance = null;
        instance.setCelular(celular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEsProveedor method, of class Empleado.
     */
    @Test
    public void testGetEsProveedor() {
        System.out.println("getEsProveedor");
        Empleado instance = null;
        boolean expResult = false;
        boolean result = instance.getEsProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEsProveedor method, of class Empleado.
     */
    @Test
    public void testSetEsProveedor() {
        System.out.println("setEsProveedor");
        boolean esProveedor = false;
        Empleado instance = null;
        instance.setEsProveedor(esProveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Empleado.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getSalario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Empleado.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        String salario = "";
        Empleado instance = null;
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Empleado.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Empleado instance = null;
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Empleado.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Empleado instance = null;
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of leer method, of class Empleado.
     */
    @Test
    public void testLeer() {
        System.out.println("leer");
        ArrayList<Empleado> expResult = null;
        ArrayList<Empleado> result = Empleado.leer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class Empleado.
     */
    @Test
    public void testCrear() {
        System.out.println("crear");
        Empleado instance = null;
        instance.crear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrar method, of class Empleado.
     */
    @Test
    public void testBorrar() {
        System.out.println("borrar");
        long id = 0L;
        Empleado.borrar(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class Empleado.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        long id = 0L;
        String nombre = "";
        String apellido = "";
        String correo = "";
        String celular = "";
        boolean esProveedor = false;
        String salario = "";
        String cargo = "";
        Empleado.actualizar(id, nombre, apellido, correo, celular, esProveedor, salario, cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
