

/* First created by JCasGen Sun Sep 13 21:12:15 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** A structure for each line that is an answer to a question
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class AnswerAnno extends LineAnno {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerAnno.class);
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
  protected AnswerAnno() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerAnno(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerAnno(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerAnno(JCas jcas, int begin, int end) {
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
  //* Feature: AnswerNumber

  /** getter for AnswerNumber - gets Indicates which number answer a particular AnswerAnno is
   * @generated
   * @return value of the feature 
   */
  public int getAnswerNumber() {
    if (AnswerAnno_Type.featOkTst && ((AnswerAnno_Type)jcasType).casFeat_AnswerNumber == null)
      jcasType.jcas.throwFeatMissing("AnswerNumber", "AnswerAnno");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerAnno_Type)jcasType).casFeatCode_AnswerNumber);}
    
  /** setter for AnswerNumber - sets Indicates which number answer a particular AnswerAnno is 
   * @generated
   * @param v value to set into the feature 
   */
  public void setAnswerNumber(int v) {
    if (AnswerAnno_Type.featOkTst && ((AnswerAnno_Type)jcasType).casFeat_AnswerNumber == null)
      jcasType.jcas.throwFeatMissing("AnswerNumber", "AnswerAnno");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerAnno_Type)jcasType).casFeatCode_AnswerNumber, v);}    
   
    
  //*--------------*
  //* Feature: IsCorrectAnswer

  /** getter for IsCorrectAnswer - gets Indicates whether a particular AnswerAnno is a correct (True) or incorrect (False) answer
   * @generated
   * @return value of the feature 
   */
  public boolean getIsCorrectAnswer() {
    if (AnswerAnno_Type.featOkTst && ((AnswerAnno_Type)jcasType).casFeat_IsCorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("IsCorrectAnswer", "AnswerAnno");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((AnswerAnno_Type)jcasType).casFeatCode_IsCorrectAnswer);}
    
  /** setter for IsCorrectAnswer - sets Indicates whether a particular AnswerAnno is a correct (True) or incorrect (False) answer 
   * @generated
   * @param v value to set into the feature 
   */
  public void setIsCorrectAnswer(boolean v) {
    if (AnswerAnno_Type.featOkTst && ((AnswerAnno_Type)jcasType).casFeat_IsCorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("IsCorrectAnswer", "AnswerAnno");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((AnswerAnno_Type)jcasType).casFeatCode_IsCorrectAnswer, v);}    
  }

    