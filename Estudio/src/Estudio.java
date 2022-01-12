import java.util.Scanner;

public class Estudio{
    public static void main(String args[]){
        //declaracion de variables
        //usuario de ingreso: usuario1
        //contraseña de ingreso: 1234
        int pass=1234,contra=0,opcion=0,materia=0,tipo=0,aciertos=0,falladas=0,total=0,e_materia=0;
        char respuesta=' ';
        String user="usuario1",usuario=" ",nombre=" ",salida="hasta pronto",materias="\n1)español \n2)matematicas \n3)fisica \n4)quimica \n5)literatura \n6)historia universal \n7)historia de mexico \n8)biologia \n9)geografia";
        //crear scanner para el ingreso de usuario
        Scanner ingreso=new Scanner(System.in);
        //ingreso al programa
        System.out.println("¡BIENVENIDO!");
        System.out.println("por favor ingresa tu nombre: ");
        nombre=ingreso.nextLine();
        System.out.println(nombre+" por favor ingresa tu usuario: ");
        usuario=ingreso.nextLine();
        System.out.println(nombre+" por favor ingresa tu contraseña: ");
        contra=ingreso.nextInt();
        //condicion para ingresar
        if(usuario.equals(user)&&contra==pass){
            System.out.println("acceso autorizado para : "+nombre);
            //menu de opciones del programa
            System.out.println("selecciona una accion: \n1)estudiar \n2)realizar examen \n3)salir");
            opcion=ingreso.nextInt();
            switch(opcion){
                case 1:
                    /*apartado para estudiar los temas de las materias (como poner los temas desglosados iba tardar mas,
                    opte por solamente poner "desarrollo del tema" la cual seria la zona donde deberian exponerse los temas
                    que se estudian en cada materia)*/
                    System.out.println("escoge materia: "+materias);
                    materia=ingreso.nextInt();
                    switch(materia){
                        case 1:
                            System.out.println("español");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 2:
                            System.out.println("matematicas");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 3:
                            System.out.println("fisica");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 4:
                            System.out.println("quimica");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 5:
                            System.out.println("literatura");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 6:
                            System.out.println("historia universal");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 7:
                            System.out.println("historia de mexico");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 8:
                            System.out.println("biologia");
                            System.out.println("desarrollo del tema...");
                        break;
                        case 9:
                            System.out.println("geografia");
                            System.out.println("desarrollo del tema...");
                        break;
                        default:
                            System.out.println("opcion invalida");
                        break;
                    }
                break;

                case 2:
                    //apartado para realizar preguntas de prueba (al estilo de examen)
                    System.out.println("escoge tipo de examen: \n1)por materia \n2)examen general");
                    tipo=ingreso.nextInt();
                    switch(tipo){
                        case 1:
                            //examen enfocado por materia
                            System.out.println("examen por materia");
                            total=3;
                            System.out.println("seleccione materia a probar: "+materias);
                            e_materia=ingreso.nextInt();
                            switch(e_materia){
                                case 1:
                                    System.out.println("español");
                                    //preguntas
                                    System.out.println("1.- enunciado que ejemplifica la funcion referencial de la lengua \na)¡que lata con esta lluvia! \nb)seguiran las lluvias en el noroeste del pais \nc)hoy llueve mucho, y pareciera que estan lavando el mundo \nd)los maleantes fueron repelidos por otra lluvia de piedras");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='b'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- selecciona la opcion que contenga sujeto \na)no hay posibilidades de cambio \nb)un rincon cerca del cielo \nc)asi es todos los dias \nd)cada noche camina dormida");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- selecciona la opcion que contiene solo palabras homofonas \na)ay-hay-ahì \nb)este-estè \nc)hacìa-asia \nd)a-ha-ah");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }
                                break;
                                case 2:
                                    System.out.println("matematicas");
                                    //preguntas
                                    System.out.println("1.- la expresion 2x+3=7 es una \na)inecuacion \nb)desigualdad \nc)ecuacion \nd)identidad");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- ¿cual es el intervalo que representa el conjunto solucion de -x>=5? \na)[-5,∞) \nb)(-∞,-5) \nc)(-∞,-5] \nd)(-5,∞)");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- cuantos conejos C y gallinas G hay en un corral si en su conjunto hacen un total de 61 cabezas y 196 patas? \na)c=47, g=14 \nb)c=40, g=21 \nc)c=37, g=24 \nd)c=35, g=26");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }
                                break;
                                case 3:
                                    System.out.println("fisica");
                                    //preguntas
                                    System.out.println("1.- un termometro marca 102ºF, ¿cual es la temperatura en ºC? \na)312ºC \nb)74.4ºC \nc)38.8ºC \nd)347ºC");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- al poner un termometro debajo de la lengua, tanto el vidrio como el mercurio alcanzan la misma temperatura del cuerpo humano. Este fenomeno comprueba la ley _______ de la termodinamica \na)primera \nb)tercera \nc)segunda \nd)cero");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- la presion atmosferica en la cima del everest disminuye comparada con la del nivel del mar porque la \na)cima esta sujeta a una presion manometrica menor por los vientos ascendentes \nb)altura de la capa de aire que soporta la cima es menor \nc)presion hidrostatica del mar influye \nd)densidad del aire soportada es mayor");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='b'){
                                        aciertos++;
                                    }
                                break;
                                case 4:
                                    System.out.println("quimica");
                                    //preguntas
                                    System.out.println("1.- de las siguientes combinaciones, el ____ es un compuesto y el ____ es un elemento \na)platino-azucar \nb)azucar-acero \nc)acero-azucar \nd)azucar-platino");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- el atomo de oxigeno tiene___protones, ____electrones y ____ neutrones \na)16,16,8 \nb)8,8,8 \nc)16,8,16 \nd)8,16,16");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='b'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- ¿cual fue el concepto quimico que utilizo el ruso dimitri mendeleiev para organizar los elementos conocidos en su tiempo? \na)punto de ebullicion \nb)masa atomica \nc)numero atomico \nd)punto de fusion");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='b'){
                                        aciertos++;
                                    }
                                break;
                                case 5:
                                    System.out.println("literatura");
                                    //preguntas
                                    System.out.println("1.- el autor del texto ___ lo escribe para su representacion \na)periodistico \nb)poetico \nc)dramatico \nd)narrativo");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- texto que hace una critica social y se auxilia de personajes arquetipicos como el avaro, el astuto, el adulador o el hipocrita \na)pastorela \nb)melodrama \nc)drama \nd)comedia");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- son autores del realismo mexicano \na)benito perez galdos y leopoldo alas 'clarin' \nb)guillermo prieto y manuel m. flores \nc)federico gamboa y angel de campo \nd)ignacio ramirez y juan valera");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }
                                break;
                                case 6:
                                    System.out.println("historia universal");
                                    //preguntas
                                    System.out.println("1.- ciencia que se encarga de investigar y sistematizar los acontecimientos mas relevantes de la humanidad para comprender los fenomenos sociales del presente \na)historia \nb)antropologia \nc)sociologia \nd)filosofia");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='a'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- etapa del capitalismo caracterizada por el surgimiento de nuevas potencias en europa, su expansion a otros territorios y el advenimiento de una fase monopolitica \na)nacionalismo \nb)liberalismo \nc)imperialismo \nd)socialismo");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- la triple entente fue una alianza militar integrada por \na)italia, alemania y belgica \nb)francia, italia y alemania \nc)belgica, inglaterra y rusia \nd)inglaterra, rusia y francia");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }
                                break;
                                case 7:
                                    System.out.println("historia de mexico");
                                    //preguntas
                                    System.out.println("1.- son instituciones cientificas y culturales del siglo XVIII \na)bellas artes y museo de historia natural \nb)colegio de san ildefonso y hospital de jesus \nc)academia de san carlos y colegio de mineria \nd)san jose de los naturales y universidad de mexico");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- presidente que formo su gabinete con militares destacados y restituyo a jose vasconcelos en 1921 en la secretaria de educacion publica \na)adolfo de la huerta \nb)abelardo l. rodriguez \nc)venustiano carranza \nd)alvaro obregon");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- el surgimiento del EZLN al sur de nuestro pais, el primero de enero de 1994 dejo en entredicho la efectividad del proyecto economico del \na)desarrollo estabilizador \nb)populismo \nc)mexico revolucionario \nd)neoliberalismo");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='d'){
                                        aciertos++;
                                    }
                                break;
                                case 8:
                                    System.out.println("biologia");
                                    //preguntas
                                    System.out.println("1.- son estructuras presentes en los cloroplastos \na)estroma, membrana interna y crestas \nb)matriz, membrana externa y granos de almidon \nc)estroma, grana y tilacoides \nd)matriz, membrana externa y membrana interna");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- monosacarido que se obtiene al final de la fase oscura de la fotosintesis \na)celulosa \nb)glucosa \nc)xilobiosa \nd)almidon");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='b'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- en la respiracion anaerobia se obtienen ___ moleculas de ATP y ___ de NADH \na)4-3 \nb)2-4 \nc)4-2 \nd)3-2");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='c'){
                                        aciertos++;
                                    }
                                break;
                                case 9:
                                    System.out.println("geografia");
                                    //preguntas
                                    System.out.println("1.- coordenada geografica que permite ubicar un lugar al norte y sur del ecuador \na)latitud \nb)altitud \nc)longitud \nd)nutacion");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='a'){
                                        aciertos++;
                                    }

                                    System.out.println("2.- se conoce como ___ a la separacion de las placas tectonicas impulsadas por las corrientes convectivas \na)divergencia \nb)convergencia \nc)transformacion \nd)subduccion");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='a'){
                                        aciertos++;
                                    }

                                    System.out.println("3.- al viajar de chihuahua a sinaloa, la cadena montañosa que se recorre, es la sierra \na)madre occidental \nb)de la breña \nc)madre oriental \nd)volcanica transversal");
                                    respuesta=ingreso.next().charAt(0);
                                    if(respuesta=='a'){
                                        aciertos++;
                                    }
                                break;
                                default:
                                    System.out.println("opcion invalida");
                                break;
                            }
                            //resultados
                            falladas=total-aciertos;
                            System.out.println("aciertos obtenidos: "+aciertos+"\npreguntas falladas: "+falladas);
                        break;
                        case 2:
                            //examen que recopila preguntas de varias materias
                            System.out.println("examen general");
                            total=5;
                            //preguntas
                            System.out.println("1.- se conoce como ___ a la separacion de las placas tectonicas impulsadas por las corrientes convectivas \na)divergencia \nb)convergencia \nc)transformacion \nd)subduccion");
                            respuesta=ingreso.next().charAt(0);
                            if(respuesta=='a'){
                                aciertos++;
                            }

                            System.out.println("2.- monosacarido que se obtiene al final de la fase oscura de la fotosintesis \na)celulosa \nb)glucosa \nc)xilobiosa \nd)almidon");
                            respuesta=ingreso.next().charAt(0);
                            if(respuesta=='b'){
                                aciertos++;
                            }

                            System.out.println("3.- el surgimiento del EZLN al sur de nuestro pais, el primero de enero de 1994 dejo en entredicho la efectividad del proyecto economico del \na)desarrollo estabilizador \nb)populismo \nc)mexico revolucionario \nd)neoliberalismo");
                            respuesta=ingreso.next().charAt(0);
                            if(respuesta=='d'){
                                aciertos++;
                            }

                            System.out.println("4.- son autores del realismo mexicano \na)benito perez galdos y leopoldo alas 'clarin' \nb)guillermo prieto y manuel m. flores \nc)federico gamboa y angel de campo \nd)ignacio ramirez y juan valera");
                            respuesta=ingreso.next().charAt(0);
                            if(respuesta=='c'){
                                aciertos++;
                            }

                            System.out.println("5.- ¿cual es el intervalo que representa el conjunto solucion de -x>=5? \na)[-5,∞) \nb)(-∞,-5) \nc)(-∞,-5] \nd)(-5,∞)");
                            respuesta=ingreso.next().charAt(0);
                            if(respuesta=='c'){
                                aciertos++;
                            }
                            //resultados
                            falladas=total-aciertos;
                            System.out.println("aciertos obtenidos: "+aciertos+"\npreguntas falladas: "+falladas);
                        break;
                        default:
                            System.out.println("opcion invalida");
                        break;
                    }
                break;

                case 3:
                    //opcion para salir del programa
                    System.out.println(salida);
                break;

                default:
                    //opcion por default
                    System.out.println("opcion invalida");
                break;
            }
        }else{
            System.out.println("acceso denegado \nusuario o contraseña erroneos favor de intentar nuevamente");
        }
        System.out.println(salida);
    }
}