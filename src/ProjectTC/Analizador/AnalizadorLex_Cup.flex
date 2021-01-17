package ProjectTC.Analizador;
import java_cup.runtime.Symbol;

%%
%class AnalizadorLex_Cup
%type java_cup.runtime.Symbol
%cup
%public
%unicode
%full
%line
%column
%char

L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
Texto= "\"" ([^(\"|\n)]|#\"|##|#t|#n)* "\""
Importe= "import" ([^(\"|\n)]|#\"|##|#t|#n)* ";"

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Texto */
{Texto} {return new Symbol(sym.Texto, yychar, yyline, yytext());}

/* Importe */
{Importe} {return new Symbol(sym.Importe, yychar, yyline, yytext());}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | int | char | long | float | double | boolean | String) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

/* Tipo de dato String */
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Operador Multiplicacion */
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* mod */
( "%" ) {return new Symbol(sym.Mod, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/*switch case*/
( "switch" | "case"  | "break" | "default" ) {return new Symbol(sym.casos, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Arreglo de String*/
( "String[]" | "String[ ]" ) {return new Symbol(sym.Arreglo_String, yychar, yyline, yytext());}

/* Arreglo de Int*/
( "int[]" ) {return new Symbol(sym.Arreglo_Int, yychar, yyline, yytext());}

/* Arreglo de Float*/
( "float[]" ) {return new Symbol(sym.Arreglo_Float, yychar, yyline, yytext());}

/* public*/
( "public" ) {return new Symbol(sym.Public, yychar, yyline, yytext());}

/* private*/
( "private" ) {return new Symbol(sym.Private, yychar, yyline, yytext());}

/*void*/
( "void" ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* new*/
( new ) {return new Symbol(sym.New, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/*Matriz de enteros*/
(" int[][]") {return new Symbol(sym.Matriz_e, yychar, yyline, yytext());}

/*Matriz de string*/
(" String[][]") {return new Symbol(sym.Matriz_s, yychar, yyline, yytext());}

/*Matriz de caracteres  */
("char[][]") {return new Symbol(sym.Matriz_c, yychar, yyline, yytext());}

/*punto*/
(".") {return new Symbol(sym.Punto, yychar, yyline, yytext());}

/* dos puntos */
(":") {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* paquete*/
("package") {return new Symbol(sym.paquete, yychar, yyline, yytext());}

/* importancion de libreria */
("import") {return new Symbol(sym.Importacion, yychar, yyline, yytext());}

/* clase*/
("public class") {return new Symbol(sym.Clase_p, yychar, yyline, yytext());}

/*clase statica*/
("public static") {return new Symbol(sym.Clase_s, yychar, yyline, yytext());}

/*captura de texto*/
("next") {return new Symbol(sym.Captura_t, yychar, yyline, yytext());}

/*captura de dooble*/
("nextDouble()") {return new Symbol(sym.Captura_do, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* funcion de una clase */
funcClase {return new Symbol(sym.funcClase, yychar, yyline, yytext());}

/* funcion MATCH*/
("Math") {return new Symbol(sym.Ath, yychar, yyline, yytext());}

/* Reservada assert*/
("assert") {return new Symbol(sym.V_f, yychar, yyline, yytext());}

/*enum metodo*/
("enum") {return new Symbol(sym.Num, yychar, yyline, yytext());}

/*funcion abstrac*/
("abstract") {return new Symbol(sym.Abstracto, yychar, yyline, yytext());}

/* exportar*/
("exports") {return new Symbol(sym.Exportar, yychar, yyline, yytext());}

/* superclase*/
("extends") {return new Symbol(sym.Extender, yychar, yyline, yytext());}

/* final*/
("final") {return new Symbol(sym.Fnl, yychar, yyline, yytext());}

/* implementacion*/
("implements") {return new Symbol(sym.Impleme, yychar, yyline, yytext());}

/* instancia this*/
("this") {return new Symbol(sym.Inta yychar, yyline, yytext());}

/* constate*/
("const") {return new Symbol(sym.Const, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Error de analisis */
 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
