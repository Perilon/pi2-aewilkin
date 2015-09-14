

/* First created by JCasGen Sun Sep 13 21:31:05 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A structure for each line in an input .txt file, to be delineated by newline characters, of which subtypes are either QuestionAnno or AnswerAnno
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class LineAnno extends DocumentAnno {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LineAnno.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected LineAnno() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LineAnno(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LineAnno(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LineAnno(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: LineNumber

  /** getter for LineNumber - gets Indicates which line number of the input .txt document a particular LineAnno is
   * @generated
   * @return value of the feature 
   */
  public int getLineNumber() {
    if (LineAnno_Type.featOkTst && ((LineAnno_Type)jcasType).casFeat_LineNumber == null)
      jcasType.jcas.throwFeatMissing("LineNumber", "LineAnno");
    return jcasType.ll_cas.ll_getIntValue(addr, ((LineAnno_Type)jcasType).casFeatCode_LineNumber);}
    
  /** setter for LineNumber - sets Indicates which line number of the input .txt document a particular LineAnno is 
   * @generated
   * @param v value to set into the feature 
   */
  public void setLineNumber(int v) {
    if (LineAnno_Type.featOkTst && ((LineAnno_Type)jcasType).casFeat_LineNumber == null)
      jcasType.jcas.throwFeatMissing("LineNumber", "LineAnno");
    jcasType.ll_cas.ll_setIntValue(addr, ((LineAnno_Type)jcasType).casFeatCode_LineNumber, v);}    
  }

    