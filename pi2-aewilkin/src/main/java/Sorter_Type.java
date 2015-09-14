
/* First created by JCasGen Mon Sep 14 00:34:00 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

import org.apache.uima.jcas.cas.TOP_Type;

/** Sorts AnswerAnnos according to their scores, and calculates precision
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class Sorter_Type extends TOP_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Sorter_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Sorter_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Sorter(addr, Sorter_Type.this);
  			   Sorter_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Sorter(addr, Sorter_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Sorter.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Sorter");
 
  /** @generated */
  final Feature casFeat_SortedAnswers;
  /** @generated */
  final int     casFeatCode_SortedAnswers;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSortedAnswers(int addr) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "Sorter");
    return ll_cas.ll_getRefValue(addr, casFeatCode_SortedAnswers);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSortedAnswers(int addr, int v) {
        if (featOkTst && casFeat_SortedAnswers == null)
      jcas.throwFeatMissing("SortedAnswers", "Sorter");
    ll_cas.ll_setRefValue(addr, casFeatCode_SortedAnswers, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Confidence;
  /** @generated */
  final int     casFeatCode_Confidence;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getConfidence(int addr) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Sorter");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "Sorter");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Confidence, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ComponentName;
  /** @generated */
  final int     casFeatCode_ComponentName;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComponentName(int addr) {
        if (featOkTst && casFeat_ComponentName == null)
      jcas.throwFeatMissing("ComponentName", "Sorter");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ComponentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentName(int addr, String v) {
        if (featOkTst && casFeat_ComponentName == null)
      jcas.throwFeatMissing("ComponentName", "Sorter");
    ll_cas.ll_setStringValue(addr, casFeatCode_ComponentName, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Sorter_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SortedAnswers = jcas.getRequiredFeatureDE(casType, "SortedAnswers", "uima.cas.StringList", featOkTst);
    casFeatCode_SortedAnswers  = (null == casFeat_SortedAnswers) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SortedAnswers).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Float", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

 
    casFeat_ComponentName = jcas.getRequiredFeatureDE(casType, "ComponentName", "uima.cas.String", featOkTst);
    casFeatCode_ComponentName  = (null == casFeat_ComponentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ComponentName).getCode();

  }
}



    