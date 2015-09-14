

/* First created by JCasGen Sun Sep 13 22:08:32 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;


/** Contains in the feature StringArray the 1-grams of a given answer sentence
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class AnswerOneGrams extends AnswerAnnoTokenized {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerOneGrams.class);
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
  protected AnswerOneGrams() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerOneGrams(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerOneGrams(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerOneGrams(JCas jcas, int begin, int end) {
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
  //* Feature: StringArray

  /** getter for StringArray - gets Contains the 1-grams of a given answer sentence
   * @generated
   * @return value of the feature 
   */
  public StringArray getStringArray() {
    if (AnswerOneGrams_Type.featOkTst && ((AnswerOneGrams_Type)jcasType).casFeat_StringArray == null)
      jcasType.jcas.throwFeatMissing("StringArray", "AnswerOneGrams");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray)));}
    
  /** setter for StringArray - sets Contains the 1-grams of a given answer sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setStringArray(StringArray v) {
    if (AnswerOneGrams_Type.featOkTst && ((AnswerOneGrams_Type)jcasType).casFeat_StringArray == null)
      jcasType.jcas.throwFeatMissing("StringArray", "AnswerOneGrams");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for StringArray - gets an indexed value - Contains the 1-grams of a given answer sentence
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public String getStringArray(int i) {
    if (AnswerOneGrams_Type.featOkTst && ((AnswerOneGrams_Type)jcasType).casFeat_StringArray == null)
      jcasType.jcas.throwFeatMissing("StringArray", "AnswerOneGrams");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray), i);}

  /** indexed setter for StringArray - sets an indexed value - Contains the 1-grams of a given answer sentence
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setStringArray(int i, String v) { 
    if (AnswerOneGrams_Type.featOkTst && ((AnswerOneGrams_Type)jcasType).casFeat_StringArray == null)
      jcasType.jcas.throwFeatMissing("StringArray", "AnswerOneGrams");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerOneGrams_Type)jcasType).casFeatCode_StringArray), i, v);}
  }

    