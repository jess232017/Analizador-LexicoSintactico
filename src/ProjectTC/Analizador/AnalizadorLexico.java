/* The following code was generated by JFlex 1.4.3 on 28/08/20 15:53 */

package ProjectTC.Analizador;
import static ProjectTC.Analizador.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 28/08/20 15:53 from the specification file
 * <tt>src/ProjectTC/Analizador/AnalizadorLexico.flex</tt>
 */
class AnalizadorLexico {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\2\0\1\3\22\0\1\57\1\40\1\7\2\0"+
    "\1\43\1\37\1\0\1\45\1\46\1\36\1\34\1\3\1\35\1\60"+
    "\1\6\12\2\1\61\1\56\1\42\1\33\1\41\2\0\2\1\1\1"+
    "\1\63\10\1\1\1\5\1\1\30\1\1\6\1\1\51\1\0\1\52"+
    "\1\0\1\1\1\0\1\20\1\10\1\16\1\26\1\13\1\25\1\24"+
    "\1\17\1\14\1\1\1\44\1\22\1\55\1\15\1\23\1\53\1\1"+
    "\1\21\1\31\1\12\1\27\1\54\1\32\1\62\1\11\1\1\1\47"+
    "\1\5\1\50\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\15\2\1\11\1\12\1\13\1\14\2\6\2\15"+
    "\1\1\1\16\1\17\1\20\1\21\1\22\1\23\3\2"+
    "\1\24\1\4\1\25\1\26\1\6\1\4\1\27\6\2"+
    "\1\30\12\2\1\31\4\2\1\15\1\32\1\0\5\2"+
    "\2\0\5\2\1\33\1\2\1\34\7\2\1\35\6\2"+
    "\1\0\5\2\2\0\1\33\2\2\1\36\1\37\1\0"+
    "\1\2\1\40\1\33\1\41\10\2\1\3\3\2\1\42"+
    "\1\43\2\0\1\2\1\44\2\2\1\0\1\2\1\33"+
    "\4\2\1\45\3\2\2\0\1\2\1\46\1\2\1\0"+
    "\1\47\1\0\2\2\1\33\2\2\1\50\2\0\1\2"+
    "\1\0\1\51\2\0\1\52\1\53\3\0\1\2\1\54"+
    "\1\0\1\55\2\0\1\56\1\0\1\2\4\0\1\2"+
    "\10\0\1\57\1\60\1\0\1\61\2\0\1\62\4\0"+
    "\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[210];
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
    "\0\0\0\64\0\150\0\234\0\320\0\64\0\u0104\0\u0138"+
    "\0\64\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4"+
    "\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444"+
    "\0\u0478\0\u04ac\0\u04e0\0\u0410\0\u0514\0\u0548\0\u04ac\0\u057c"+
    "\0\64\0\64\0\64\0\64\0\64\0\u05b0\0\u05e4\0\u0618"+
    "\0\64\0\u064c\0\64\0\64\0\64\0\u0680\0\64\0\u06b4"+
    "\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8\0\150\0\u07ec\0\u0820"+
    "\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0"+
    "\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\64\0\64\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98"+
    "\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\150\0\u0e04"+
    "\0\u0e38\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\150\0\u0f70"+
    "\0\u0fa4\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110"+
    "\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\150\0\u1248\0\u127c"+
    "\0\150\0\150\0\u12b0\0\u12e4\0\u1318\0\u134c\0\150\0\u1380"+
    "\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\64"+
    "\0\u1520\0\u1554\0\u1588\0\150\0\150\0\u15bc\0\u15f0\0\u1624"+
    "\0\64\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728\0\u175c\0\u1790"+
    "\0\u17c4\0\u17f8\0\150\0\u182c\0\u1860\0\u1894\0\u18c8\0\u18fc"+
    "\0\u1930\0\150\0\u1964\0\u1998\0\150\0\u19cc\0\u1a00\0\u1a34"+
    "\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4"+
    "\0\64\0\u1c08\0\u1c3c\0\150\0\150\0\u1c70\0\u1ca4\0\u1cd8"+
    "\0\u1d0c\0\64\0\u1d40\0\64\0\u1d74\0\u1da8\0\64\0\u1ddc"+
    "\0\u1e10\0\u1e44\0\u1e78\0\u1eac\0\u1ee0\0\u1f14\0\u1f48\0\u1f7c"+
    "\0\u1fb0\0\u1fe4\0\u2018\0\u204c\0\u2080\0\u20b4\0\64\0\64"+
    "\0\u20e8\0\64\0\u211c\0\u2150\0\64\0\u2184\0\u21b8\0\u21ec"+
    "\0\u2220\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[210];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\16\1\17\2\3"+
    "\1\20\1\21\2\3\1\22\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\3\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\2\3\65\0\2\3\5\0\23\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\2\0\1\4\64\0\1\5\53\0"+
    "\1\5\11\0\1\55\64\0\1\56\24\0\1\57\31\0"+
    "\2\3\5\0\1\3\1\60\7\3\1\61\1\3\1\62"+
    "\7\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\11\3\1\63\11\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\12\3\1\64"+
    "\10\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\5\3\1\65\7\3\1\66\5\3\11\0"+
    "\1\3\6\0\2\3\1\67\4\0\2\3\1\0\2\3"+
    "\5\0\3\3\1\70\17\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\7\3\1\71\1\72"+
    "\12\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\3\3\1\73\17\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\13\3\1\74"+
    "\7\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\10\3\1\75\1\3\1\76\1\77\7\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\3\3\1\100\7\3\1\101\7\3\11\0\1\3"+
    "\6\0\3\3\4\0\2\3\1\0\2\3\5\0\1\3"+
    "\1\102\1\103\20\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\22\3\1\104\11\0\1\3"+
    "\6\0\3\3\4\0\2\3\1\0\2\3\5\0\7\3"+
    "\1\105\13\3\11\0\1\3\6\0\3\3\4\0\2\3"+
    "\33\0\1\106\63\0\1\57\1\107\62\0\1\57\1\0"+
    "\1\107\61\0\1\57\67\0\1\55\57\0\1\106\5\0"+
    "\1\106\55\0\1\106\6\0\1\106\56\0\1\110\27\0"+
    "\2\3\5\0\10\3\1\111\1\112\5\3\1\113\3\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\13\3\1\114\7\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\10\3\1\115\12\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\3\0\1\5"+
    "\10\0\1\116\13\0\1\117\26\0\1\5\4\0\4\56"+
    "\1\0\57\56\1\0\2\3\5\0\2\3\1\120\20\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\3\3\1\121\17\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\13\3\1\122\7\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\17\3\1\123\3\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\21\3\1\124\1\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\2\3\1\125\20\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\23\3\11\0\1\3"+
    "\6\0\1\126\2\3\4\0\2\3\1\0\2\3\5\0"+
    "\22\3\1\127\11\0\1\3\6\0\3\3\4\0\1\130"+
    "\1\3\1\0\2\3\5\0\10\3\1\131\12\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\21\3\1\132\1\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\2\3\1\133\20\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\5\3\1\134\15\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\12\3\1\135\10\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\13\3\1\136\7\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\11\3\1\137\11\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\15\3\1\140\5\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\17\3\1\141\3\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\21\3\1\142\1\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\11\3\1\143\11\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\4\3\1\144\16\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\4\3\1\145\16\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\2\0\1\146\62\0"+
    "\2\3\5\0\6\3\1\147\14\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\4\3\1\150"+
    "\16\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\1\151\22\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\4\3\1\152\16\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\4\3\1\153\16\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\15\0\1\154\60\0\1\155\52\0\2\3"+
    "\5\0\3\3\1\156\17\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\10\3\1\157\12\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\12\3\1\160\10\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\3\3\1\161\17\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\3\3\1\162\17\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\23\3\11\0\1\3"+
    "\4\0\1\163\1\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\13\3\1\164\7\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\2\3\1\165\20\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\11\3\1\166\11\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\3\3\1\167\17\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\17\3\1\170\3\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\14\3\1\156\6\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\21\3\1\123\1\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\10\3\1\171\12\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\10\3\1\172\12\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\1\173\22\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\174\20\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\4\3\1\175\16\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\1\0\2\3\5\0"+
    "\2\3\1\176\20\3\11\0\1\3\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\12\3\1\177\10\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\2\0\1\146\43\0"+
    "\1\200\16\0\2\3\5\0\23\3\11\0\1\201\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\23\3\11\0"+
    "\1\3\6\0\1\3\1\202\1\3\4\0\2\3\1\0"+
    "\2\3\5\0\12\3\1\203\10\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\16\3\1\204"+
    "\4\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\5\3\1\205\15\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\12\0\1\206\72\0\1\207\43\0"+
    "\2\3\5\0\23\3\11\0\1\167\6\0\3\3\4\0"+
    "\2\3\1\0\2\3\5\0\3\3\1\210\17\3\11\0"+
    "\1\3\6\0\3\3\4\0\2\3\52\0\1\211\12\0"+
    "\2\3\5\0\11\3\1\212\11\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\23\3\11\0"+
    "\1\3\6\0\3\3\4\0\1\3\1\213\1\0\2\3"+
    "\5\0\23\3\11\0\1\3\4\0\1\214\1\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\11\3\1\215\11\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\2\3\1\216\20\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\17\3\1\217\3\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\12\3\1\120\10\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\3\3\1\220\17\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\5\3\1\221\15\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\6\3\1\222\14\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\3\3\1\223\17\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\10\3\1\224\12\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\10\3\1\225\12\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\4\3\1\226\16\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\51\0\1\227"+
    "\26\0\1\230\50\0\2\3\5\0\10\3\1\231\12\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\1\0\2\3"+
    "\5\0\2\3\1\232\20\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\1\0\2\3\5\0\13\3\1\233\7\3"+
    "\11\0\1\3\6\0\3\3\4\0\2\3\52\0\1\234"+
    "\12\0\2\3\5\0\5\3\1\235\15\3\11\0\1\3"+
    "\6\0\3\3\4\0\2\3\1\0\2\3\5\0\23\3"+
    "\11\0\1\3\4\0\1\236\1\0\3\3\4\0\2\3"+
    "\1\0\2\3\5\0\12\3\1\237\10\3\11\0\1\3"+
    "\6\0\3\3\4\0\2\3\1\0\2\3\5\0\23\3"+
    "\11\0\1\3\6\0\2\3\1\240\4\0\2\3\1\0"+
    "\2\3\5\0\14\3\1\241\6\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\7\3\1\167"+
    "\13\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\14\3\1\242\6\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\2\3\1\243"+
    "\20\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\6\3\1\244\14\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\52\0\1\245\26\0\1\246\47\0"+
    "\2\3\5\0\5\3\1\156\15\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\17\3\1\247"+
    "\3\3\11\0\1\3\6\0\3\3\4\0\2\3\51\0"+
    "\1\250\64\0\1\251\12\0\2\3\5\0\2\3\1\167"+
    "\20\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\23\3\11\0\1\3\6\0\3\3\2\0"+
    "\1\252\1\0\2\3\1\0\2\3\5\0\23\3\11\0"+
    "\1\3\4\0\1\253\1\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\3\3\1\254\17\3\11\0\1\3\6\0"+
    "\3\3\4\0\2\3\1\0\2\3\5\0\3\3\1\255"+
    "\17\3\11\0\1\3\6\0\3\3\4\0\2\3\1\0"+
    "\2\3\5\0\23\3\11\0\1\3\6\0\3\3\1\0"+
    "\1\256\2\0\2\3\51\0\1\257\36\0\1\260\40\0"+
    "\2\3\5\0\1\261\22\3\11\0\1\3\6\0\3\3"+
    "\4\0\2\3\52\0\1\262\34\0\1\263\112\0\1\264"+
    "\27\0\1\265\12\0\1\266\104\0\1\267\62\0\1\270"+
    "\13\0\2\3\5\0\12\3\1\271\10\3\11\0\1\3"+
    "\6\0\3\3\4\0\2\3\27\0\1\272\56\0\1\273"+
    "\53\0\1\274\123\0\1\275\12\0\2\3\5\0\3\3"+
    "\1\276\17\3\11\0\1\3\6\0\3\3\4\0\2\3"+
    "\12\0\1\277\71\0\1\300\63\0\1\301\114\0\1\302"+
    "\13\0\2\3\5\0\23\3\11\0\1\3\1\303\5\0"+
    "\3\3\4\0\2\3\60\0\1\304\34\0\1\305\44\0"+
    "\1\306\123\0\1\307\57\0\1\310\70\0\1\311\41\0"+
    "\1\312\46\0\1\313\70\0\1\314\60\0\1\315\61\0"+
    "\1\316\64\0\1\317\60\0\1\320\73\0\1\321\56\0"+
    "\1\322\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8788];
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
    "\1\0\1\11\3\1\1\11\2\1\1\11\27\1\5\11"+
    "\3\1\1\11\1\1\3\11\1\1\1\11\26\1\2\11"+
    "\1\0\5\1\2\0\26\1\1\0\5\1\2\0\5\1"+
    "\1\0\14\1\1\11\5\1\2\0\1\1\1\11\2\1"+
    "\1\0\12\1\2\0\3\1\1\0\1\1\1\0\6\1"+
    "\2\0\1\1\1\0\1\11\2\0\2\1\3\0\1\1"+
    "\1\11\1\0\1\11\2\0\1\11\1\0\1\1\4\0"+
    "\1\1\10\0\2\11\1\0\1\11\2\0\1\11\4\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[210];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 52: break;
        case 20: 
          { lexeme=yytext(); return P_coma;
          }
        case 53: break;
        case 40: 
          { lexeme = yytext(); return Public;
          }
        case 54: break;
        case 16: 
          { lexeme=yytext(); return Llave_a;
          }
        case 55: break;
        case 47: 
          { lexeme=yytext(); return Matriz_s;
          }
        case 56: break;
        case 31: 
          { lexeme=yytext(); return Else;
          }
        case 57: break;
        case 41: 
          { lexeme = yytext(); return Arreglo_Float;
          }
        case 58: break;
        case 39: 
          { lexeme=yytext(); return Return;
          }
        case 59: break;
        case 5: 
          { return Linea;
          }
        case 60: break;
        case 29: 
          { lexeme=yytext(); return For;
          }
        case 61: break;
        case 49: 
          { lexeme=yytext(); return Clase_p;
          }
        case 62: break;
        case 50: 
          { lexeme=yytext(); return Clase_s;
          }
        case 63: break;
        case 44: 
          { lexeme=yytext(); return Matriz_c;
          }
        case 64: break;
        case 7: 
          { lexeme=yytext(); return Division;
          }
        case 65: break;
        case 13: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 66: break;
        case 45: 
          { lexeme = yytext(); return Arreglo_String;
          }
        case 67: break;
        case 6: 
          { lexeme=yytext(); return Op_logico;
          }
        case 68: break;
        case 23: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 69: break;
        case 33: 
          { lexeme = yytext(); return casos;
          }
        case 70: break;
        case 26: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 71: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 72: break;
        case 17: 
          { lexeme=yytext(); return Llave_c;
          }
        case 73: break;
        case 14: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 74: break;
        case 32: 
          { lexeme=yytext(); return Captura_t;
          }
        case 75: break;
        case 8: 
          { lexeme=yytext(); return Comillas;
          }
        case 76: break;
        case 18: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 77: break;
        case 34: 
          { lexeme = yytext(); return Void;
          }
        case 78: break;
        case 36: 
          { lexeme = yytext(); return Arreglo_Int;
          }
        case 79: break;
        case 38: 
          { lexeme=yytext(); return Importacion;
          }
        case 80: break;
        case 28: 
          { lexeme = yytext(); return New;
          }
        case 81: break;
        case 25: 
          { lexeme=yytext(); return Do;
          }
        case 82: break;
        case 21: 
          { lexeme=yytext(); return Punto;
          }
        case 83: break;
        case 43: 
          { lexeme = yytext(); return Private;
          }
        case 84: break;
        case 35: 
          { lexeme=yytext(); return Main;
          }
        case 85: break;
        case 42: 
          { lexeme=yytext(); return paquete;
          }
        case 86: break;
        case 11: 
          { lexeme=yytext(); return Resta;
          }
        case 87: break;
        case 27: 
          { lexeme=yytext(); return T_dato;
          }
        case 88: break;
        case 46: 
          { lexeme=yytext(); return Matriz_e;
          }
        case 89: break;
        case 22: 
          { lexeme=yytext(); return Dos_puntos;
          }
        case 90: break;
        case 48: 
          { lexeme=yytext(); return Captura_do;
          }
        case 91: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 92: break;
        case 12: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 93: break;
        case 19: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 94: break;
        case 1: 
          { return ERROR;
          }
        case 95: break;
        case 9: 
          { lexeme=yytext(); return Igual;
          }
        case 96: break;
        case 51: 
          { lexeme=yytext(); return Impresion_p;
          }
        case 97: break;
        case 37: 
          { lexeme=yytext(); return While;
          }
        case 98: break;
        case 4: 
          { /*Ignore*/
          }
        case 99: break;
        case 30: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 100: break;
        case 24: 
          { lexeme=yytext(); return If;
          }
        case 101: break;
        case 10: 
          { lexeme=yytext(); return Suma;
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}