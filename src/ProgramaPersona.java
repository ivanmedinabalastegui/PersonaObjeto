import java.util.Objects;
import java.util.Scanner;

public class ProgramaPersona {
    public static void main (String[] args){
        Persona persona1 = new Persona("123456789P", "Pepito", "Pérez", "Ruiz", "Urb. Parqueflores, Fase 3", 648539851, "pepitoperezruiz@gmail.com", "Restauración");
        Persona persona2 = new Persona("987654321J", "Martina", "Pérez", "Ruiz", "Urb. Parqueflores, Fase 6", 674983875, "martinaperezruiz@gmail.com", "Atracciones");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMenú Persona");
        int opcion = 0;
        while(opcion!=3){
            System.out.println("\n1. Ver trabajadores\n2. Modificar un trabajador\n3. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("\nTrabajador 1\n" + persona1);
                    System.out.println("\nTrabajador 2\n" + persona2);
                    break;

                case 2:
                    int opcion2 = 0;
                    System.out.println("\nIntroduzca el DNI del trabajador");
                    String error = sc.nextLine();
                    String dni = sc.nextLine();
                    if(Objects.equals(dni, persona1.getDni())){
                        while(opcion2!=9){
                            System.out.println("\n1. DNI\n2. Nombre\n3. Primer apellido\n4. Segundo apellido\n5. Dirección\n6. Teléfono\n7. Email\n8. Departamento\n9. Salir");
                            System.out.println("¿Qué desea modificar?");
                            opcion2 = sc.nextInt();
                            switch(opcion2){
                                case 1:
                                    System.out.println("\nDNI actual= " + persona1.getDni());
                                    System.out.println("Introduzca nuevo DNI");
                                    error = sc.nextLine();
                                    String Ndni = sc.nextLine();
                                    persona1.setDni(Ndni);
                                    break;

                                case 2:
                                    System.out.println("\nNombre actual= " + persona1.getNombre());
                                    System.out.println("Introduzca nuevo nombre");
                                    error = sc.nextLine();
                                    String Nnombre = sc.nextLine();
                                    persona1.setNombre(Nnombre);
                                    break;

                                case 3:
                                    System.out.println("\nPrimer apellido actual= " + persona1.getApellido1());
                                    System.out.println("Introduzca nuevo primer apellido");
                                    error = sc.nextLine();
                                    String Napellido1 = sc.nextLine();
                                    persona1.setApellido1(Napellido1);
                                    break;

                                case 4:
                                    System.out.println("\nSegundo apellido actual= " + persona1.getApellido2());
                                    System.out.println("Introduzca nuevo segundo apellido");
                                    error = sc.nextLine();
                                    String Napellido2 = sc.nextLine();
                                    persona1.setApellido2(Napellido2);
                                    break;

                                case 5:
                                    System.out.println("\nDirección actual= " + persona1.getDireccion());
                                    System.out.println("Introduzca nueva dirección");
                                    error = sc.nextLine();
                                    String Ndireccion = sc.nextLine();
                                    persona1.setDireccion(Ndireccion);
                                    break;

                                case 6:
                                    System.out.println("\nTeléfono actual= " + persona1.getTelefono());
                                    System.out.println("Introduzca nuevo teléfono");
                                    error = sc.nextLine();
                                    int Ntelefono = sc.nextInt();
                                    persona1.setTelefono(Ntelefono);
                                    break;

                                case 7:
                                    System.out.println("\nEmail actual= " + persona1.getEmail());
                                    System.out.println("Introduzca nuevo email");
                                    error = sc.nextLine();
                                    String Nemail = sc.nextLine();
                                    persona1.setEmail(Nemail);
                                    break;

                                case 8:
                                    System.out.println("\nDepartamento actual= " + persona1.getDepartamento());
                                    System.out.println("Introduzca nuevo departamento");
                                    error = sc.nextLine();
                                    String Ndepartamento = sc.nextLine();
                                    persona1.setDepartamento(Ndepartamento);
                                    break;
                            }
                            System.out.println("¿Desea modificar algo más?(s/n)");
                            String opcion3 = sc.next();
                            if(opcion3.equals("n")){
                                opcion2 = 9;
                            }
                        }
                        break;
                    } else if(Objects.equals(dni, persona2.getDni())){
                        while(opcion2!=9){
                            System.out.println("\n1. DNI\n2. Nombre\n3. Primer apellido\n4. Segundo apellido\n5. Dirección\n6. Teléfono\n7. Email\n8. Departamento\n9. Salir");
                            System.out.println("¿Qué desea modificar?");
                            opcion2 = sc.nextInt();
                            switch(opcion2){
                                case 1:
                                    System.out.println("\nDNI actual= " + persona2.getDni());
                                    System.out.println("Introduzca nuevo DNI");
                                    error = sc.nextLine();
                                    String Ndni = sc.nextLine();
                                    persona2.setDni(Ndni);
                                    break;

                                case 2:
                                    System.out.println("\nNombre actual= " + persona2.getNombre());
                                    System.out.println("Introduzca nuevo nombre");
                                    error = sc.nextLine();
                                    String Nnombre = sc.nextLine();
                                    persona2.setNombre(Nnombre);
                                    break;

                                case 3:
                                    System.out.println("\nPrimer apellido actual= " + persona2.getApellido1());
                                    System.out.println("Introduzca nuevo primer apellido");
                                    error = sc.nextLine();
                                    String Napellido1 = sc.nextLine();
                                    persona2.setApellido1(Napellido1);
                                    break;

                                case 4:
                                    System.out.println("\nSegundo apellido actual= " + persona2.getApellido2());
                                    System.out.println("Introduzca nuevo segundo apellido");
                                    error = sc.nextLine();
                                    String Napellido2 = sc.nextLine();
                                    persona2.setApellido2(Napellido2);
                                    break;

                                case 5:
                                    System.out.println("\nDirección actual= " + persona2.getDireccion());
                                    System.out.println("Introduzca nueva dirección");
                                    error = sc.nextLine();
                                    String Ndireccion = sc.nextLine();
                                    persona2.setDireccion(Ndireccion);
                                    break;

                                case 6:
                                    System.out.println("\nTeléfono actual= " + persona2.getTelefono());
                                    System.out.println("Introduzca nuevo teléfono");
                                    error = sc.nextLine();
                                    int Ntelefono = sc.nextInt();
                                    persona2.setTelefono(Ntelefono);
                                    break;

                                case 7:
                                    System.out.println("\nEmail actual= " + persona2.getEmail());
                                    System.out.println("Introduzca nuevo email");
                                    error = sc.nextLine();
                                    String Nemail = sc.nextLine();
                                    persona2.setEmail(Nemail);
                                    break;

                                case 8:
                                    System.out.println("\nDepartamento actual= " + persona2.getDepartamento());
                                    System.out.println("Introduzca nuevo departamento");
                                    error = sc.nextLine();
                                    String Ndepartamento = sc.nextLine();
                                    persona2.setDepartamento(Ndepartamento);
                                    break;
                            }
                            System.out.println("¿Desea modificar algo más?(s/n)");
                            String opcion3 = sc.next();
                            if(opcion3.equals("n")){
                                opcion2 = 9;
                            }
                        }
                        break;
                    } else {
                        System.out.println("No existe ningún trabajador con ese DNI");
                    }
            }
        }
    }
}
