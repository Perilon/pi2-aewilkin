
/* First created by JCasGen Mon Sep 14 14:52:18 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Contains feature PrecisionValue that represents precision at N
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class PrecisionCalculator_Type extends Sorter_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PrecisionCalculator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PrecisionCalculator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PrecisionCalculator(addr, PrecisionCalculator_Type.this);
  			   PrecisionCalculator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PrecisionCalculator(addr, PrecisionCalculator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = PrecisionCalculator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("PrecisionCalculator");
 
  /** @generated */
  final Feature casFeat_Precision;
  /** @generated */
  final int     casFeatCode_Precision;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getPrecision(int addr) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "PrecisionCalculator");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Precision);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecision(int addr, float v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "PrecisionCalculator");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Precision, v);}
    
  
 
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
      jcas.throwFeatMissing("ComponentName", "PrecisionCalculator");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ComponentName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComponentName(int addr, String v) {
        if (featOkTst && casFeat_ComponentName == null)
      jcas.throwFeatMissing("ComponentName", "PrecisionCalculator");
    ll_cas.ll_setStringValue(addr, casFeatCode_ComponentName, v);}
    
  
 
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
      jcas.throwFeatMissing("Confidence", "PrecisionCalculator");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_Confidence);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setConfidence(int addr, float v) {
        if (featOkTst && casFeat_Confidence == null)
      jcas.throwFeatMissing("Confidence", "PrecisionCalculator");
    ll_cas.ll_setFloatValue(addr, casFeatCode_Confidence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public PrecisionCalculator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Precision = jcas.getRequiredFeatureDE(casType, "Precision", "uima.cas.Float", featOkTst);
    casFeatCode_Precision  = (null == casFeat_Precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Precision).getCode();

 
    casFeat_ComponentName = jcas.getRequiredFeatureDE(casType, "ComponentName", "uima.cas.String", featOkTst);
    casFeatCode_ComponentName  = (null == casFeat_ComponentName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ComponentName).getCode();

 
    casFeat_Confidence = jcas.getRequiredFeatureDE(casType, "Confidence", "uima.cas.Float", featOkTst);
    casFeatCode_Confidence  = (null == casFeat_Confidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Confidence).getCode();

  }
}



    