

/* First created by JCasGen Mon Sep 14 00:16:25 EDT 2015 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Scores an answer using n-gram string arrays
 * Updated by JCasGen Mon Sep 14 19:56:19 EDT 2015
 * XML source: /home/perilon/git/pi2-aewilkin/pi2-aewilkin/src/main/resources/pi2-aewilkin-typesystem.xml
 * @generated */
public class AnswerScorer extends AnswerAnno {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerScorer.class);
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
  protected AnswerScorer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerScorer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerScorer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public AnswerScorer(JCas jcas, int begin, int end) {
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
  //* Feature: Score

  /** getter for Score - gets The score for a given answer sentence, output by the scorer type that assigns a score based on n-gram similarity between a question sentence and an answer sentence
   * @generated
   * @return value of the feature 
   */
  public float getScore() {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "AnswerScorer");
    return jcasType.ll_cas.ll_getFloatValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_Score);}
    
  /** setter for Score - sets The score for a given answer sentence, output by the scorer type that assigns a score based on n-gram similarity between a question sentence and an answer sentence 
   * @generated
   * @param v value to set into the feature 
   */
  public void setScore(float v) {
    if (AnswerScorer_Type.featOkTst && ((AnswerScorer_Type)jcasType).casFeat_Score == null)
      jcasType.jcas.throwFeatMissing("Score", "AnswerScorer");
    jcasType.ll_cas.ll_setFloatValue(addr, ((AnswerScorer_Type)jcasType).casFeatCode_Score, v);}    
  }

    