

/* First created by JCasGen Mon Sep 14 00:34:00 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.StringList;


/** Sorts AnswerAnnos according to their scores, and calculates precision
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class Sorter extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sorter.class);
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
  protected Sorter() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Sorter(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Sorter(JCas jcas) {
    super(jcas);
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
  //* Feature: SortedAnswers

  /** getter for SortedAnswers - gets A list of the SentenceAnnos, sorted by score
   * @generated
   * @return value of the feature 
   */
  public StringList getSortedAnswers() {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Sorter");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sorter_Type)jcasType).casFeatCode_SortedAnswers)));}
    
  /** setter for SortedAnswers - sets A list of the SentenceAnnos, sorted by score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSortedAnswers(StringList v) {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_SortedAnswers == null)
      jcasType.jcas.throwFeatMissing("SortedAnswers", "Sorter");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sorter_Type)jcasType).casFeatCode_SortedAnswers, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets The confidence of the sorted string list
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Sorter");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((Sorter_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets The confidence of the sorted string list 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "Sorter");
    jcasType.ll_cas.ll_setFloatValue(addr, ((Sorter_Type)jcasType).casFeatCode_Confidence, v);}    
   
    
  //*--------------*
  //* Feature: ComponentName

  /** getter for ComponentName - gets The name of a component that produces the sorted string list
   * @generated
   * @return value of the feature 
   */
  public String getComponentName() {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "Sorter");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Sorter_Type)jcasType).casFeatCode_ComponentName);}
    
  /** setter for ComponentName - sets The name of a component that produces the sorted string list 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentName(String v) {
    if (Sorter_Type.featOkTst && ((Sorter_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "Sorter");
    jcasType.ll_cas.ll_setStringValue(addr, ((Sorter_Type)jcasType).casFeatCode_ComponentName, v);}    
  }

    