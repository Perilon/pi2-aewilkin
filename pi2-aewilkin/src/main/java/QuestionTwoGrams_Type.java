
/* First created by JCasGen Sun Sep 13 22:08:32 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Contains in the feature StringArray the 2-grams of a given question sentence
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class QuestionTwoGrams_Type extends QuestionAnnoTokenized_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionTwoGrams_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionTwoGrams_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionTwoGrams(addr, QuestionTwoGrams_Type.this);
  			   QuestionTwoGrams_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionTwoGrams(addr, QuestionTwoGrams_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionTwoGrams.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QuestionTwoGrams");
 
  /** @generated */
  final Feature casFeat_StringArray;
  /** @generated */
  final int     casFeatCode_StringArray;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getStringArray(int addr) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionTwoGrams");
    return ll_cas.ll_getRefValue(addr, casFeatCode_StringArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStringArray(int addr, int v) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionTwoGrams");
    ll_cas.ll_setRefValue(addr, casFeatCode_StringArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getStringArray(int addr, int i) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionTwoGrams");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setStringArray(int addr, int i, String v) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionTwoGrams");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_StringArray), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuestionTwoGrams_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_StringArray = jcas.getRequiredFeatureDE(casType, "StringArray", "uima.cas.StringArray", featOkTst);
    casFeatCode_StringArray  = (null == casFeat_StringArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StringArray).getCode();

  }
}



    