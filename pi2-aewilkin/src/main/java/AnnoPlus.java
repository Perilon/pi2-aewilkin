

/* First created by JCasGen Mon Sep 14 18:04:19 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Contains features for "Confidence" and "ComponentName," which are features that the homework assignment informs us every annotation should have.  So all annotation types in my structure inherit from this type.
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class AnnoPlus extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnoPlus.class);
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
  protected AnnoPlus() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnnoPlus(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnnoPlus(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnnoPlus(JCas jcas, int begin, int end) {
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
  //* Feature: Confidence

  /** getter for Confidence - gets The component's confidence score assigned to the annotation
   * @generated
   * @return value of the feature 
   */
  public float getConfidence() {
    if (AnnoPlus_Type.featOkTst && ((AnnoPlus_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "AnnoPlus");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnnoPlus_Type)jcasType).casFeatCode_Confidence);}
    
  /** setter for Confidence - sets The component's confidence score assigned to the annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidence(float v) {
    if (AnnoPlus_Type.featOkTst && ((AnnoPlus_Type)jcasType).casFeat_Confidence == null)
      jcasType.jcas.throwFeatMissing("Confidence", "AnnoPlus");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnnoPlus_Type)jcasType).casFeatCode_Confidence, v);}    
   
    
  //*--------------*
  //* Feature: ComponentName

  /** getter for ComponentName - gets The name of a component that produces the annotation
   * @generated
   * @return value of the feature 
   */
  public String getComponentName() {
    if (AnnoPlus_Type.featOkTst && ((AnnoPlus_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "AnnoPlus");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AnnoPlus_Type)jcasType).casFeatCode_ComponentName);}
    
  /** setter for ComponentName - sets The name of a component that produces the annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setComponentName(String v) {
    if (AnnoPlus_Type.featOkTst && ((AnnoPlus_Type)jcasType).casFeat_ComponentName == null)
      jcasType.jcas.throwFeatMissing("ComponentName", "AnnoPlus");
    jcasType.ll_cas.ll_setStringValue(addr, ((AnnoPlus_Type)jcasType).casFeatCode_ComponentName, v);}    
  }

    