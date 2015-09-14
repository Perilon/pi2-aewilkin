
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

/** Has the feature StringArray, which contains the tokens of the question in question
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class QuestionAnnoTokenized_Type extends QuestionAnno_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuestionAnnoTokenized_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuestionAnnoTokenized_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuestionAnnoTokenized(addr, QuestionAnnoTokenized_Type.this);
  			   QuestionAnnoTokenized_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuestionAnnoTokenized(addr, QuestionAnnoTokenized_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuestionAnnoTokenized.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("QuestionAnnoTokenized");
 
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
      jcas.throwFeatMissing("StringArray", "QuestionAnnoTokenized");
    return ll_cas.ll_getRefValue(addr, casFeatCode_StringArray);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStringArray(int addr, int v) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionAnnoTokenized");
    ll_cas.ll_setRefValue(addr, casFeatCode_StringArray, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public String getStringArray(int addr, int i) {
        if (featOkTst && casFeat_StringArray == null)
      jcas.throwFeatMissing("StringArray", "QuestionAnnoTokenized");
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
      jcas.throwFeatMissing("StringArray", "QuestionAnnoTokenized");
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
  public QuestionAnnoTokenized_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_StringArray = jcas.getRequiredFeatureDE(casType, "StringArray", "uima.cas.StringArray", featOkTst);
    casFeatCode_StringArray  = (null == casFeat_StringArray) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_StringArray).getCode();

  }
}



    