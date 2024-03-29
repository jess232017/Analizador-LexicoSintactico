/* The following code was generated by JFlex 1.4.3 on 28/08/20 15:53 */

package ProjectTC.Analizador;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 28/08/20 15:53 from the specification file
 * <tt>src/ProjectTC/Analizador/AnalizadorLex_Cup.flex</tt>
 */
public class AnalizadorLex_Cup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  6,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    47, 38,  4,  7,  0, 35, 36,  0, 42,  5, 34, 32,  3, 33, 49, 16, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 50, 15, 40, 31, 39,  0, 
     0,  1,  1,  1, 52,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1, 28,  1,  1,  1,  1,  1,  1,  1, 45,  0, 46,  0,  1, 
     0, 22, 17, 20, 26, 19, 25, 24, 21, 10,  1, 41, 23, 11,  9, 13, 
    12,  1, 14, 29,  8, 27, 48, 30, 51, 18,  1, 43, 37, 44,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\5\2"+
    "\1\7\1\10\11\2\1\11\1\12\1\13\1\14\1\15"+
    "\3\16\2\17\1\20\1\21\1\22\1\23\1\24\1\4"+
    "\1\2\1\25\1\26\1\0\1\27\1\0\4\2\1\30"+
    "\4\2\1\4\1\31\12\2\1\32\4\2\1\17\1\33"+
    "\1\16\3\0\1\2\1\27\1\2\1\34\1\2\1\35"+
    "\14\2\1\36\7\2\3\0\1\2\1\37\1\40\1\0"+
    "\1\2\1\41\5\2\1\35\1\42\1\35\1\43\6\2"+
    "\1\3\2\0\1\44\1\2\1\45\5\2\1\0\1\35"+
    "\3\2\1\46\2\0\1\2\1\47\2\2\1\50\1\2"+
    "\2\0\1\2\1\35\2\0\1\2\1\0\1\2\1\0"+
    "\1\51\1\52\1\53\2\0\1\54\3\0\1\2\2\0"+
    "\1\55\1\56\1\0\1\57\1\0\1\2\3\0\1\2"+
    "\6\0\1\60\1\61\1\62\1\0\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\65\0\u013e"+
    "\0\u0173\0\u01a8\0\u01dd\0\u0212\0\65\0\u0247\0\u027c\0\u02b1"+
    "\0\u02e6\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459"+
    "\0\u048e\0\u04c3\0\u04f8\0\u04f8\0\u052d\0\u0562\0\u0459\0\u0597"+
    "\0\u05cc\0\u0601\0\65\0\65\0\65\0\65\0\u0636\0\u066b"+
    "\0\65\0\65\0\u0109\0\65\0\u06a0\0\u06d5\0\u070a\0\u073f"+
    "\0\u0774\0\152\0\u07a9\0\u07de\0\u0813\0\u0848\0\u087d\0\65"+
    "\0\u08b2\0\u08e7\0\u091c\0\u0951\0\u0986\0\u09bb\0\u09f0\0\u0a25"+
    "\0\u0a5a\0\u0a8f\0\u0ac4\0\u0af9\0\u0b2e\0\u0b63\0\u0b98\0\65"+
    "\0\65\0\65\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0109\0\u0ca1"+
    "\0\152\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14"+
    "\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52\0\u0f87\0\152"+
    "\0\u0fbc\0\u0ff1\0\u1026\0\u105b\0\u1090\0\u10c5\0\u10fa\0\u112f"+
    "\0\u1164\0\u1199\0\u11ce\0\152\0\u1203\0\u1238\0\u126d\0\152"+
    "\0\u12a2\0\u12d7\0\u130c\0\u1341\0\u1376\0\152\0\152\0\u13ab"+
    "\0\152\0\u13e0\0\u1415\0\u144a\0\u147f\0\u14b4\0\u14e9\0\65"+
    "\0\u151e\0\u1553\0\152\0\u1588\0\65\0\u15bd\0\u15f2\0\u1627"+
    "\0\u165c\0\u1691\0\u16c6\0\u16fb\0\u1730\0\u1765\0\u179a\0\152"+
    "\0\u17cf\0\u1804\0\u1839\0\u186e\0\u18a3\0\u18d8\0\u190d\0\u1942"+
    "\0\u1977\0\u19ac\0\u19e1\0\u1a16\0\u1a4b\0\u1a80\0\u1ab5\0\u1aea"+
    "\0\u186e\0\u1b1f\0\u1aea\0\152\0\152\0\u1b54\0\u1b89\0\65"+
    "\0\u1bbe\0\u1bf3\0\u1c28\0\u1c5d\0\u1c92\0\u1cc7\0\65\0\65"+
    "\0\u1cfc\0\65\0\u1d31\0\u1d66\0\u1d9b\0\u1dd0\0\u1e05\0\u1e3a"+
    "\0\u1e6f\0\u1ea4\0\u1ed9\0\u1f0e\0\u1f43\0\u1f78\0\65\0\65"+
    "\0\65\0\u1fad\0\65";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\5\1\2"+
    "\1\10\1\11\1\12\1\13\1\14\2\3\1\15\1\16"+
    "\1\17\1\3\1\20\1\21\2\3\1\22\1\3\1\23"+
    "\1\24\1\3\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\3"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\2\3\66\0\2\3\5\0\7\3\2\0\16\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\2\0\1\4"+
    "\65\0\1\5\2\0\1\5\50\0\1\5\5\0\4\53"+
    "\1\54\2\0\1\55\35\53\1\0\4\53\1\0\12\53"+
    "\1\0\2\3\5\0\6\3\1\56\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\2\3\1\57\13\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\1\3\1\60"+
    "\1\3\1\61\3\3\2\0\10\3\1\62\5\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\5\3\1\63\10\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\6\3\1\64"+
    "\2\0\5\3\1\65\4\3\1\66\3\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\20\0\1\67\16\0\1\70"+
    "\26\0\2\3\5\0\5\3\1\71\1\72\2\0\1\3"+
    "\1\73\14\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\6\3\1\74\7\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\1\0\2\3"+
    "\5\0\7\3\2\0\4\3\1\75\1\76\10\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\5\3\1\77\1\3\2\0\16\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\5\3\1\100"+
    "\1\3\2\0\5\3\1\101\1\102\7\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\5\3"+
    "\1\103\1\3\2\0\2\3\1\104\13\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\1\105"+
    "\6\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\15\3\1\106"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\1\0\2\3"+
    "\5\0\7\3\2\0\4\3\1\107\11\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\37\0\1\110\64\0\1\70"+
    "\1\111\63\0\1\70\1\0\1\111\62\0\1\70\71\0"+
    "\1\112\65\0\1\112\56\0\1\110\7\0\1\110\54\0"+
    "\1\110\10\0\1\110\55\0\1\113\26\0\1\5\2\0"+
    "\1\5\3\0\1\114\21\0\1\115\22\0\1\5\6\0"+
    "\2\3\5\0\5\3\1\116\1\3\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\4\53\1\117\2\0"+
    "\1\55\35\53\1\0\4\53\1\0\12\53\1\0\2\3"+
    "\5\0\7\3\2\0\12\3\1\120\3\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\7\3"+
    "\2\0\15\3\1\121\12\0\1\3\6\0\1\3\2\0"+
    "\1\122\1\3\1\0\2\3\5\0\1\123\6\3\2\0"+
    "\16\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\4\3\1\124\2\3\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\125\4\3\2\0\16\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\2\3\1\126"+
    "\4\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\3\3\1\127"+
    "\12\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\1\130\15\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\6\67\1\0\56\67\1\0"+
    "\2\3\5\0\5\3\1\131\1\3\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\2\3\1\132\13\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\1\133\6\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\14\3\1\134\1\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\1\0\2\3"+
    "\5\0\7\3\2\0\5\3\1\135\10\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\7\3"+
    "\2\0\14\3\1\136\1\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\1\3\1\137\5\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\6\3\1\140\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\6\3\1\141\7\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\5\3\1\142"+
    "\1\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\12\3\1\143"+
    "\3\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\10\3\1\144\5\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\6\3\1\145\2\0\16\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\2\3\1\146\4\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\2\3\1\147\4\3\2\0\16\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\2\0\1\150"+
    "\73\0\1\151\63\0\1\152\55\0\2\3\5\0\2\3"+
    "\1\153\4\3\2\0\16\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\7\3\2\0\2\3"+
    "\1\154\13\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\1\155\6\3\2\0\16\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\16\3\12\0\1\3\3\0\1\156\2\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\5\3\1\157"+
    "\1\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\1\3\1\160\5\3\2\0"+
    "\16\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\16\3\12\0\1\3\6\0"+
    "\1\161\2\0\2\3\1\0\2\3\5\0\7\3\2\0"+
    "\16\3\12\0\1\162\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\6\3\1\163\7\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\6\3\1\164\7\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\7\3\2\0"+
    "\5\3\1\165\10\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\2\3\1\166"+
    "\13\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\2\3\1\167\13\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\6\3\1\170\2\0\16\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\7\3\2\0\2\3"+
    "\1\171\13\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\7\3\1\166\6\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\1\0\2\3"+
    "\5\0\7\3\2\0\14\3\1\120\1\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\7\3"+
    "\2\0\5\3\1\172\10\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\7\3\2\0\1\173"+
    "\15\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\5\3\1\174\10\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\175\4\3\2\0\16\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\1\176\6\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\6\3\1\177\7\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\2\0\1\150"+
    "\2\0\1\200\67\0\1\201\72\0\1\202\47\0\2\3"+
    "\5\0\7\3\2\0\11\3\1\203\4\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\7\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\1\3"+
    "\1\204\56\0\1\205\7\0\2\3\5\0\6\3\1\206"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\5\3\1\207\10\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\1\0\2\3"+
    "\5\0\7\3\2\0\5\3\1\210\10\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\2\3"+
    "\1\211\4\3\2\0\16\3\12\0\1\3\6\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\7\3\2\0\2\3"+
    "\1\212\13\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\1\0\2\3\5\0\7\3\2\0\16\3\12\0\1\171"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\7\3"+
    "\2\0\16\3\12\0\1\3\3\0\1\213\2\0\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\1\214\6\3\2\0"+
    "\16\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\6\3\1\133\7\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\12\3\1\215\3\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\1\3\1\216"+
    "\5\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\3\3\1\217"+
    "\12\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\2\3\1\220\13\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\55\0\1\221\21\0"+
    "\1\222\53\0\2\3\5\0\5\3\1\223\1\3\2\0"+
    "\16\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\1\224\6\3\2\0\16\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\1\0\2\3\5\0\1\225"+
    "\6\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\7\3\1\226"+
    "\6\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\3\3\1\227\12\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\5\3\1\230\10\3\12\0\1\3\6\0"+
    "\1\3\2\0\2\3\56\0\1\231\7\0\2\3\5\0"+
    "\7\3\2\0\16\3\12\0\1\3\3\0\1\232\2\0"+
    "\1\3\2\0\2\3\1\0\2\3\5\0\7\3\2\0"+
    "\6\3\1\233\7\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\7\3\1\234"+
    "\6\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\4\3\1\171\11\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\56\0\1\235\17\0"+
    "\1\236\54\0\2\3\5\0\7\3\2\0\12\3\1\237"+
    "\3\3\12\0\1\3\6\0\1\3\2\0\2\3\1\240"+
    "\2\241\1\240\3\0\1\242\7\241\1\243\1\240\16\241"+
    "\6\240\1\0\3\240\1\241\1\0\5\240\1\241\2\240"+
    "\2\241\1\0\2\3\5\0\7\3\2\0\2\3\1\244"+
    "\13\3\12\0\1\3\6\0\1\3\2\0\2\3\1\0"+
    "\2\3\5\0\7\3\2\0\2\3\1\245\13\3\12\0"+
    "\1\3\6\0\1\3\2\0\2\3\1\0\2\3\5\0"+
    "\7\3\2\0\16\3\12\0\1\3\5\0\1\246\1\3"+
    "\2\0\2\3\1\0\2\3\5\0\1\3\1\166\5\3"+
    "\2\0\16\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\55\0\1\247\65\0\1\250\7\0\2\3\5\0\1\171"+
    "\6\3\2\0\16\3\12\0\1\3\6\0\1\3\2\0"+
    "\2\3\1\0\2\3\5\0\7\3\2\0\16\3\12\0"+
    "\1\3\3\0\1\251\2\0\1\3\2\0\2\3\55\0"+
    "\1\252\37\0\1\253\35\0\2\3\5\0\7\3\2\0"+
    "\1\254\15\3\12\0\1\3\6\0\1\3\2\0\2\3"+
    "\4\240\3\0\1\242\7\240\1\243\25\240\1\0\4\240"+
    "\1\0\17\240\2\0\1\242\7\240\1\243\25\240\1\0"+
    "\4\240\1\0\12\240\24\0\1\255\10\0\1\256\105\0"+
    "\1\257\64\0\1\260\1\261\63\0\1\262\63\0\1\263"+
    "\10\0\2\3\5\0\7\3\2\0\6\3\1\264\7\3"+
    "\12\0\1\3\6\0\1\3\2\0\2\3\27\0\1\265"+
    "\45\0\1\266\132\0\1\260\64\0\1\267\7\0\2\3"+
    "\5\0\7\3\2\0\2\3\1\270\13\3\12\0\1\3"+
    "\6\0\1\3\2\0\2\3\26\0\1\271\64\0\1\272"+
    "\113\0\1\273\10\0\2\3\5\0\7\3\2\0\16\3"+
    "\12\0\1\3\1\274\5\0\1\3\2\0\2\3\35\0"+
    "\1\275\37\0\1\276\132\0\1\277\13\0\1\300\114\0"+
    "\1\301\41\0\1\302\76\0\1\303\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8162];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\5\1\1\11\25\1\4\11"+
    "\2\1\2\11\1\0\1\11\1\0\12\1\1\11\17\1"+
    "\3\11\3\0\32\1\3\0\3\1\1\0\21\1\1\11"+
    "\2\0\2\1\1\11\5\1\1\0\5\1\2\0\6\1"+
    "\2\0\2\1\2\0\1\1\1\0\1\1\1\0\3\1"+
    "\2\0\1\11\3\0\1\1\2\0\2\11\1\0\1\11"+
    "\1\0\1\1\3\0\1\1\6\0\3\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLex_Cup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLex_Cup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 45: 
          { return new Symbol(sym.Matriz_c, yychar, yyline, yytext());
          }
        case 52: break;
        case 35: 
          { return new Symbol(sym.casos, yychar, yyline, yytext());
          }
        case 53: break;
        case 42: 
          { return new Symbol(sym.Private, yychar, yyline, yytext());
          }
        case 54: break;
        case 17: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 55: break;
        case 36: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 56: break;
        case 46: 
          { return new Symbol(sym.Arreglo_String, yychar, yyline, yytext());
          }
        case 57: break;
        case 25: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 58: break;
        case 34: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 59: break;
        case 14: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 60: break;
        case 19: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 61: break;
        case 49: 
          { return new Symbol(sym.Captura_do, yychar, yyline, yytext());
          }
        case 62: break;
        case 8: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 63: break;
        case 26: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 64: break;
        case 44: 
          { return new Symbol(sym.Arreglo_Float, yychar, yyline, yytext());
          }
        case 65: break;
        case 5: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 66: break;
        case 30: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 67: break;
        case 29: 
          { return new Symbol(sym.T_dato, yychar, yyline, yytext());
          }
        case 68: break;
        case 16: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 69: break;
        case 11: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 70: break;
        case 47: 
          { return new Symbol(sym.Matriz_e, yychar, yyline, yytext());
          }
        case 71: break;
        case 32: 
          { return new Symbol(sym.Captura_t, yychar, yyline, yytext());
          }
        case 72: break;
        case 18: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 73: break;
        case 13: 
          { return new Symbol(sym.Mod, yychar, yyline, yytext());
          }
        case 74: break;
        case 20: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 75: break;
        case 24: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 76: break;
        case 27: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 77: break;
        case 22: 
          { return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());
          }
        case 78: break;
        case 33: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 79: break;
        case 6: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 80: break;
        case 28: 
          { return new Symbol(sym.New, yychar, yyline, yytext());
          }
        case 81: break;
        case 37: 
          { return new Symbol(sym.Arreglo_Int, yychar, yyline, yytext());
          }
        case 82: break;
        case 7: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 83: break;
        case 12: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 84: break;
        case 39: 
          { return new Symbol(sym.Importacion, yychar, yyline, yytext());
          }
        case 85: break;
        case 10: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 86: break;
        case 48: 
          { return new Symbol(sym.Matriz_s, yychar, yyline, yytext());
          }
        case 87: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 88: break;
        case 38: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 89: break;
        case 21: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 90: break;
        case 43: 
          { return new Symbol(sym.paquete, yychar, yyline, yytext());
          }
        case 91: break;
        case 41: 
          { return new Symbol(sym.Importe, yychar, yyline, yytext());
          }
        case 92: break;
        case 50: 
          { return new Symbol(sym.Clase_p, yychar, yyline, yytext());
          }
        case 93: break;
        case 4: 
          { /*Ignore*/
          }
        case 94: break;
        case 40: 
          { return new Symbol(sym.Public, yychar, yyline, yytext());
          }
        case 95: break;
        case 9: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 96: break;
        case 51: 
          { return new Symbol(sym.Clase_s, yychar, yyline, yytext());
          }
        case 97: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 98: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 99: break;
        case 15: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 100: break;
        case 23: 
          { return new Symbol(sym.Texto, yychar, yyline, yytext());
          }
        case 101: break;
        case 31: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
