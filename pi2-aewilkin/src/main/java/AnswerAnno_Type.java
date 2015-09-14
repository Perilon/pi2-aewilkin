
/* First created by JCasGen Sun Sep 13 21:12:15 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** A structure for each line that is an answer to a question
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class AnswerAnno_Type extends LineAnno_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerAnno_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerAnno_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerAnno(addr, AnswerAnno_Type.this);
  			   AnswerAnno_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerAnno(addr, AnswerAnno_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerAnno.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerAnno");
 
  /** @generated */
  final Feature casFeat_AnswerNumber;
  /** @generated */
  final int     casFeatCode_AnswerNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnswerNumber(int addr) {
        if (featOkTst && casFeat_AnswerNumber == null)
      jcas.throwFeatMissing("AnswerNumber", "AnswerAnno");
    return ll_cas.ll_getIntValue(addr, casFeatCode_AnswerNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnswerNumber(int addr, int v) {
        if (featOkTst && casFeat_AnswerNumber == null)
      jcas.throwFeatMissing("AnswerNumber", "AnswerAnno");
    ll_cas.ll_setIntValue(addr, casFeatCode_AnswerNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_IsCorrectAnswer;
  /** @generated */
  final int     casFeatCode_IsCorrectAnswer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public boolean getIsCorrectAnswer(int addr) {
        if (featOkTst && casFeat_IsCorrectAnswer == null)
      jcas.throwFeatMissing("IsCorrectAnswer", "AnswerAnno");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_IsCorrectAnswer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setIsCorrectAnswer(int addr, boolean v) {
        if (featOkTst && casFeat_IsCorrectAnswer == null)
      jcas.throwFeatMissing("IsCorrectAnswer", "AnswerAnno");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_IsCorrectAnswer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnswerAnno_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerNumber = jcas.getRequiredFeatureDE(casType, "AnswerNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_AnswerNumber  = (null == casFeat_AnswerNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerNumber).getCode();

 
    casFeat_IsCorrectAnswer = jcas.getRequiredFeatureDE(casType, "IsCorrectAnswer", "uima.cas.Boolean", featOkTst);
    casFeatCode_IsCorrectAnswer  = (null == casFeat_IsCorrectAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_IsCorrectAnswer).getCode();

  }
}



    