

/* First created by JCasGen Mon Sep 14 14:52:18 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Contains feature PrecisionValue that represents precision at N
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class PrecisionCalculator extends Sorter {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(PrecisionCalculator.class);
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
  protected PrecisionCalculator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public PrecisionCalculator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public PrecisionCalculator(JCas jcas) {
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
  //* Feature: Precision

  /** getter for Precision - gets The value for precision over the AnswerAnnos—out of all the answer sentences receiving a score (which should be all of them, right?), how many of the N correct answers (as obtained from the gold standard data given) are in the top N results after sorting?
   * @generated
   * @return value of the feature 
   */
  public float getPrecision() {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "PrecisionCalculator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets The value for precision over the AnswerAnnos—out of all the answer sentences receiving a score (which should be all of them, right?), how many of the N correct answers (as obtained from the gold standard data given) are in the top N results after sorting? 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(float v) {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "PrecisionCalculator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: ComponentName

  /** getter for ComponentName - gets The name of a component that produces the precision score
   * @generated
   * @return value of the feature 
   */
  public String getComponentName() {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "PrecisionCalculator");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_ComponentName);}
    
  /** setter for ComponentName - sets The name of a component that produces the precision score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentName(String v) {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "PrecisionCalculator");
    jcasType.ll_cas.ll_setStringValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_ComponentName, v);}    
   
    
  //*--------------*
  //* Feature: Confidence

  /** getter for Confidence - gets The confidence of the precision score
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "PrecisionCalculator");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets The confidence of the precision score 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (PrecisionCalculator_Type.featOkTst && ((PrecisionCalculator_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "PrecisionCalculator");
    jcasType.ll_cas.ll_setFloatValue(addr, ((PrecisionCalculator_Type)jcasType).casFeatCode_Confidence, v);}    
  }

    