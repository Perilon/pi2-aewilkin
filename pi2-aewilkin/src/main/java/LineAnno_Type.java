
/* First created by JCasGen Sun Sep 13 21:31:05 EDT 2015 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** A structure for each line in an input .txt file, to be delineated by newline characters, of which subtypes are either QuestionAnno or AnswerAnno
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * @generated */
public class LineAnno_Type extends DocumentAnno_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LineAnno_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LineAnno_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LineAnno(addr, LineAnno_Type.this);
  			   LineAnno_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LineAnno(addr, LineAnno_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = LineAnno.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("LineAnno");
 
  /** @generated */
  final Feature casFeat_LineNumber;
  /** @generated */
  final int     casFeatCode_LineNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLineNumber(int addr) {
        if (featOkTst && casFeat_LineNumber == null)
      jcas.throwFeatMissing("LineNumber", "LineAnno");
    return ll_cas.ll_getIntValue(addr, casFeatCode_LineNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLineNumber(int addr, int v) {
        if (featOkTst && casFeat_LineNumber == null)
      jcas.throwFeatMissing("LineNumber", "LineAnno");
    ll_cas.ll_setIntValue(addr, casFeatCode_LineNumber, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public LineAnno_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_LineNumber = jcas.getRequiredFeatureDE(casType, "LineNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_LineNumber  = (null == casFeat_LineNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_LineNumber).getCode();

  }
}



    