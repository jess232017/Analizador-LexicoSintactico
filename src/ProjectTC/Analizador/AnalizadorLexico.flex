package ProjectTC.Analizador;
import static ProjectTC.Analizador.Tokens.*;
%%
%class AnalizadorLexico
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
Texto= [\']([^\'\n]+)[\'|\n|\'\n]

%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double | boolean | String) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Return*/
( return ) {lexeme=yytext(); return Return;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/*switch case*/
( "switch" | "case"  | "break" | "default" ) {lexeme = yytext(); return casos;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Arreglo de String*/
( "String[]" ) {lexeme = yytext(); return Arreglo_String;}

/* Arreglo de Int*/
( "int[]" ) {lexeme = yytext(); return Arreglo_Int;}

/* Arreglo de Float*/
( "float[]" ) {lexeme = yytext(); return Arreglo_Float;}

/* public*/
( "public" ) {lexeme = yytext(); return Public;}

/* private*/
( "private" ) {lexeme = yytext(); return Private;}

/*void*/
( "void" ) {lexeme = yytext(); return Void;}

/* new*/
( new ) {lexeme = yytext(); return New;}

/* Marcador de inicio de algoritmo */
( "main" ) {lexeme=yytext(); return Main;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/*Matriz de enteros*/
(" int[][]") {lexeme=yytext(); return Matriz_e;}

/*Matriz de string*/
(" String[][]") {lexeme=yytext(); return Matriz_s;}

/*Matriz de caracteres  */
("char[][]") {lexeme=yytext(); return Matriz_c;}

/*punto*/
(".") {lexeme=yytext(); return Punto;}

/* dos puntos */
(":") {lexeme=yytext(); return Dos_puntos;}

/* paquete*/
("package") {lexeme=yytext(); return paquete;}

/* importancion de libreria */
("import") {lexeme=yytext(); return Importacion;}

/* impresion de pantalla*/
("System.out.println") {lexeme=yytext(); return Impresion_p;}

/* clase*/
("public class") {lexeme=yytext(); return Clase_p;}

/*clase statica*/
("public static") {lexeme=yytext(); return Clase_s;}

/*captura de texto*/
("next") {lexeme=yytext(); return Captura_t;}

/*captura de dooble*/
("nextDouble()") {lexeme=yytext(); return Captura_do;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* funcion de una clase */
funcClase {lexeme=yytext(); return funcClase;}

/* funcion MATCH*/
("Math") {lexeme=yytext(); return Ath;}

/* Reservada assert*/
("assert") {lexeme=yytext(); return V_f;}

/*enum metodo*/
("enum") {lexeme=yytext(); return Num;}

/*funcion abstrac*/
("abstract") {lexeme=yytext(); return Abstracto;}

/* exportar*/
("exports") {lexeme=yytext(); return Exportar;}

/* superclase*/
("extends") {lexeme=yytext(); return Extender;}

/* final*/
("final") {lexeme=yytext(); return Fnl;}

/* implementacion*/
("implements") {lexeme=yytext(); return Impleme;}

/* instancia this*/
("this") {lexeme=yytext(); return Inta;}

/* constate*/
("const") {lexeme=yytext(); return Const;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Texto */
( Texto ) {lexeme=yytext(); return Texto;}

/* Error de analisis */
 . {return ERROR;}
