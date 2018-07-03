package ru.spbstu.application.configurator.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ru.spbstu.application.configurator.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID1", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version '", "'name: '", "'application:'", "'tenant:'", "'hold:'", "'archiveType: '", "'category: '", "'description: '", "'metadataCacheSize: '", "'type: '", "'holdType:'"
    };
    public static final int RULE_ID1=4;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) )
            // InternalMyDsl.g:79:3: ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_element_0_0= ruleVersion ) )
            // InternalMyDsl.g:80:4: (lv_element_0_0= ruleVersion )
            {
            // InternalMyDsl.g:80:4: (lv_element_0_0= ruleVersion )
            // InternalMyDsl.g:81:5: lv_element_0_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementVersionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_element_0_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_0_0,
            						"ru.spbstu.application.configurator.MyDsl.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:98:3: ( (lv_element_1_0= ruleApplication ) )
            // InternalMyDsl.g:99:4: (lv_element_1_0= ruleApplication )
            {
            // InternalMyDsl.g:99:4: (lv_element_1_0= ruleApplication )
            // InternalMyDsl.g:100:5: lv_element_1_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_element_1_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_1_0,
            						"ru.spbstu.application.configurator.MyDsl.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:117:3: ( (lv_element_2_0= ruleTenant ) )
            // InternalMyDsl.g:118:4: (lv_element_2_0= ruleTenant )
            {
            // InternalMyDsl.g:118:4: (lv_element_2_0= ruleTenant )
            // InternalMyDsl.g:119:5: lv_element_2_0= ruleTenant
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementTenantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_element_2_0=ruleTenant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_2_0,
            						"ru.spbstu.application.configurator.MyDsl.Tenant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:136:3: ( (lv_element_3_0= ruleHold ) )
            // InternalMyDsl.g:137:4: (lv_element_3_0= ruleHold )
            {
            // InternalMyDsl.g:137:4: (lv_element_3_0= ruleHold )
            // InternalMyDsl.g:138:5: lv_element_3_0= ruleHold
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementHoldParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_3_0=ruleHold();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_3_0,
            						"ru.spbstu.application.configurator.MyDsl.Hold");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVersion"
    // InternalMyDsl.g:159:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalMyDsl.g:159:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalMyDsl.g:160:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalMyDsl.g:166:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version ' ( (lv_name_1_0= RULE_ID1 ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:172:2: ( (otherlv_0= 'version ' ( (lv_name_1_0= RULE_ID1 ) ) ) )
            // InternalMyDsl.g:173:2: (otherlv_0= 'version ' ( (lv_name_1_0= RULE_ID1 ) ) )
            {
            // InternalMyDsl.g:173:2: (otherlv_0= 'version ' ( (lv_name_1_0= RULE_ID1 ) ) )
            // InternalMyDsl.g:174:3: otherlv_0= 'version ' ( (lv_name_1_0= RULE_ID1 ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            // InternalMyDsl.g:178:3: ( (lv_name_1_0= RULE_ID1 ) )
            // InternalMyDsl.g:179:4: (lv_name_1_0= RULE_ID1 )
            {
            // InternalMyDsl.g:179:4: (lv_name_1_0= RULE_ID1 )
            // InternalMyDsl.g:180:5: lv_name_1_0= RULE_ID1
            {
            lv_name_1_0=(Token)match(input,RULE_ID1,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVersionAccess().getNameID1TerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ru.spbstu.application.configurator.MyDsl.ID1");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleFeatureName"
    // InternalMyDsl.g:200:1: entryRuleFeatureName returns [EObject current=null] : iv_ruleFeatureName= ruleFeatureName EOF ;
    public final EObject entryRuleFeatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureName = null;


        try {
            // InternalMyDsl.g:200:52: (iv_ruleFeatureName= ruleFeatureName EOF )
            // InternalMyDsl.g:201:2: iv_ruleFeatureName= ruleFeatureName EOF
            {
             newCompositeNode(grammarAccess.getFeatureNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeatureName=ruleFeatureName();

            state._fsp--;

             current =iv_ruleFeatureName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureName"


    // $ANTLR start "ruleFeatureName"
    // InternalMyDsl.g:207:1: ruleFeatureName returns [EObject current=null] : (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFeatureName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:214:2: (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:214:2: (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:215:3: otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureNameAccess().getNameKeyword_0());
            		
            // InternalMyDsl.g:219:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:220:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:220:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:221:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFeatureNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureName"


    // $ANTLR start "entryRuleApplication"
    // InternalMyDsl.g:241:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMyDsl.g:241:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMyDsl.g:242:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMyDsl.g:248:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveTipe ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;

        EObject lv_features_2_0 = null;

        EObject lv_feature_3_0 = null;

        EObject lv_feature_4_0 = null;

        EObject lv_feature_5_0 = null;

        EObject lv_feature_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:254:2: ( (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveTipe ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) )
            // InternalMyDsl.g:255:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveTipe ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            {
            // InternalMyDsl.g:255:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveTipe ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            // InternalMyDsl.g:256:3: otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveTipe ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMyDsl.g:260:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalMyDsl.g:261:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalMyDsl.g:261:4: (lv_features1_1_0= ruleFeatureName )
            // InternalMyDsl.g:262:5: lv_features1_1_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatures1FeatureNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_features1_1_0=ruleFeatureName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"features1",
            						lv_features1_1_0,
            						"ru.spbstu.application.configurator.MyDsl.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:279:3: ( (lv_features_2_0= ruleArchiveTipe ) )
            // InternalMyDsl.g:280:4: (lv_features_2_0= ruleArchiveTipe )
            {
            // InternalMyDsl.g:280:4: (lv_features_2_0= ruleArchiveTipe )
            // InternalMyDsl.g:281:5: lv_features_2_0= ruleArchiveTipe
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeaturesArchiveTipeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_features_2_0=ruleArchiveTipe();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_2_0,
            						"ru.spbstu.application.configurator.MyDsl.ArchiveTipe");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:298:3: ( (lv_feature_3_0= ruleCategory ) )
            // InternalMyDsl.g:299:4: (lv_feature_3_0= ruleCategory )
            {
            // InternalMyDsl.g:299:4: (lv_feature_3_0= ruleCategory )
            // InternalMyDsl.g:300:5: lv_feature_3_0= ruleCategory
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureCategoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_feature_3_0=ruleCategory();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_3_0,
            						"ru.spbstu.application.configurator.MyDsl.Category");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:317:3: ( (lv_feature_4_0= ruleDescription ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:318:4: (lv_feature_4_0= ruleDescription )
                    {
                    // InternalMyDsl.g:318:4: (lv_feature_4_0= ruleDescription )
                    // InternalMyDsl.g:319:5: lv_feature_4_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureDescriptionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_feature_4_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationRule());
                    					}
                    					add(
                    						current,
                    						"feature",
                    						lv_feature_4_0,
                    						"ru.spbstu.application.configurator.MyDsl.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:336:3: ( (lv_feature_5_0= ruleMCS ) )
            // InternalMyDsl.g:337:4: (lv_feature_5_0= ruleMCS )
            {
            // InternalMyDsl.g:337:4: (lv_feature_5_0= ruleMCS )
            // InternalMyDsl.g:338:5: lv_feature_5_0= ruleMCS
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureMCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_feature_5_0=ruleMCS();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_5_0,
            						"ru.spbstu.application.configurator.MyDsl.MCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:355:3: ( (lv_feature_6_0= ruleType ) )
            // InternalMyDsl.g:356:4: (lv_feature_6_0= ruleType )
            {
            // InternalMyDsl.g:356:4: (lv_feature_6_0= ruleType )
            // InternalMyDsl.g:357:5: lv_feature_6_0= ruleType
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_feature_6_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_6_0,
            						"ru.spbstu.application.configurator.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleTenant"
    // InternalMyDsl.g:378:1: entryRuleTenant returns [EObject current=null] : iv_ruleTenant= ruleTenant EOF ;
    public final EObject entryRuleTenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTenant = null;


        try {
            // InternalMyDsl.g:378:47: (iv_ruleTenant= ruleTenant EOF )
            // InternalMyDsl.g:379:2: iv_ruleTenant= ruleTenant EOF
            {
             newCompositeNode(grammarAccess.getTenantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTenant=ruleTenant();

            state._fsp--;

             current =iv_ruleTenant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTenant"


    // $ANTLR start "ruleTenant"
    // InternalMyDsl.g:385:1: ruleTenant returns [EObject current=null] : (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) ;
    public final EObject ruleTenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:391:2: ( (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) )
            // InternalMyDsl.g:392:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            {
            // InternalMyDsl.g:392:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            // InternalMyDsl.g:393:3: otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTenantAccess().getTenantKeyword_0());
            		
            // InternalMyDsl.g:397:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalMyDsl.g:398:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalMyDsl.g:398:4: (lv_features1_1_0= ruleFeatureName )
            // InternalMyDsl.g:399:5: lv_features1_1_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getTenantAccess().getFeatures1FeatureNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_features1_1_0=ruleFeatureName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTenantRule());
            					}
            					add(
            						current,
            						"features1",
            						lv_features1_1_0,
            						"ru.spbstu.application.configurator.MyDsl.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTenant"


    // $ANTLR start "entryRuleHold"
    // InternalMyDsl.g:420:1: entryRuleHold returns [EObject current=null] : iv_ruleHold= ruleHold EOF ;
    public final EObject entryRuleHold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHold = null;


        try {
            // InternalMyDsl.g:420:45: (iv_ruleHold= ruleHold EOF )
            // InternalMyDsl.g:421:2: iv_ruleHold= ruleHold EOF
            {
             newCompositeNode(grammarAccess.getHoldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHold=ruleHold();

            state._fsp--;

             current =iv_ruleHold; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHold"


    // $ANTLR start "ruleHold"
    // InternalMyDsl.g:427:1: ruleHold returns [EObject current=null] : (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) ;
    public final EObject ruleHold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;

        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:433:2: ( (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) )
            // InternalMyDsl.g:434:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            {
            // InternalMyDsl.g:434:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            // InternalMyDsl.g:435:3: otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldAccess().getHoldKeyword_0());
            		
            // InternalMyDsl.g:439:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalMyDsl.g:440:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalMyDsl.g:440:4: (lv_features1_1_0= ruleFeatureName )
            // InternalMyDsl.g:441:5: lv_features1_1_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getHoldAccess().getFeatures1FeatureNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_features1_1_0=ruleFeatureName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHoldRule());
            					}
            					add(
            						current,
            						"features1",
            						lv_features1_1_0,
            						"ru.spbstu.application.configurator.MyDsl.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:458:3: ( (lv_features_2_0= ruleHoldType ) )
            // InternalMyDsl.g:459:4: (lv_features_2_0= ruleHoldType )
            {
            // InternalMyDsl.g:459:4: (lv_features_2_0= ruleHoldType )
            // InternalMyDsl.g:460:5: lv_features_2_0= ruleHoldType
            {

            					newCompositeNode(grammarAccess.getHoldAccess().getFeaturesHoldTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_features_2_0=ruleHoldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHoldRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_2_0,
            						"ru.spbstu.application.configurator.MyDsl.HoldType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHold"


    // $ANTLR start "entryRuleArchiveTipe"
    // InternalMyDsl.g:481:1: entryRuleArchiveTipe returns [EObject current=null] : iv_ruleArchiveTipe= ruleArchiveTipe EOF ;
    public final EObject entryRuleArchiveTipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchiveTipe = null;


        try {
            // InternalMyDsl.g:481:52: (iv_ruleArchiveTipe= ruleArchiveTipe EOF )
            // InternalMyDsl.g:482:2: iv_ruleArchiveTipe= ruleArchiveTipe EOF
            {
             newCompositeNode(grammarAccess.getArchiveTipeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchiveTipe=ruleArchiveTipe();

            state._fsp--;

             current =iv_ruleArchiveTipe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchiveTipe"


    // $ANTLR start "ruleArchiveTipe"
    // InternalMyDsl.g:488:1: ruleArchiveTipe returns [EObject current=null] : (otherlv_0= 'archiveType: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleArchiveTipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:494:2: ( (otherlv_0= 'archiveType: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:495:2: (otherlv_0= 'archiveType: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:495:2: (otherlv_0= 'archiveType: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:496:3: otherlv_0= 'archiveType: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getArchiveTipeAccess().getArchiveTypeKeyword_0());
            		
            // InternalMyDsl.g:500:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:501:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:501:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:502:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArchiveTipeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArchiveTipeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchiveTipe"


    // $ANTLR start "entryRuleCategory"
    // InternalMyDsl.g:522:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalMyDsl.g:522:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalMyDsl.g:523:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalMyDsl.g:529:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:535:2: ( (otherlv_0= 'category: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:536:2: (otherlv_0= 'category: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:536:2: (otherlv_0= 'category: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:537:3: otherlv_0= 'category: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalMyDsl.g:541:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:542:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:542:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:543:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleDescription"
    // InternalMyDsl.g:563:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalMyDsl.g:563:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalMyDsl.g:564:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalMyDsl.g:570:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:576:2: ( (otherlv_0= 'description: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:577:2: (otherlv_0= 'description: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:577:2: (otherlv_0= 'description: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:578:3: otherlv_0= 'description: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalMyDsl.g:582:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:583:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:583:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:584:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleMCS"
    // InternalMyDsl.g:604:1: entryRuleMCS returns [EObject current=null] : iv_ruleMCS= ruleMCS EOF ;
    public final EObject entryRuleMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCS = null;


        try {
            // InternalMyDsl.g:604:44: (iv_ruleMCS= ruleMCS EOF )
            // InternalMyDsl.g:605:2: iv_ruleMCS= ruleMCS EOF
            {
             newCompositeNode(grammarAccess.getMCSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMCS=ruleMCS();

            state._fsp--;

             current =iv_ruleMCS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMCS"


    // $ANTLR start "ruleMCS"
    // InternalMyDsl.g:611:1: ruleMCS returns [EObject current=null] : (otherlv_0= 'metadataCacheSize: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:617:2: ( (otherlv_0= 'metadataCacheSize: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:618:2: (otherlv_0= 'metadataCacheSize: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:618:2: (otherlv_0= 'metadataCacheSize: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:619:3: otherlv_0= 'metadataCacheSize: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_0());
            		
            // InternalMyDsl.g:623:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:624:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:624:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:625:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMCSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMCS"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:645:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:645:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:646:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:652:1: ruleType returns [EObject current=null] : (otherlv_0= 'type: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:658:2: ( (otherlv_0= 'type: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:659:2: (otherlv_0= 'type: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:659:2: (otherlv_0= 'type: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:660:3: otherlv_0= 'type: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalMyDsl.g:664:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:665:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:665:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:666:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleHoldType"
    // InternalMyDsl.g:686:1: entryRuleHoldType returns [EObject current=null] : iv_ruleHoldType= ruleHoldType EOF ;
    public final EObject entryRuleHoldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldType = null;


        try {
            // InternalMyDsl.g:686:49: (iv_ruleHoldType= ruleHoldType EOF )
            // InternalMyDsl.g:687:2: iv_ruleHoldType= ruleHoldType EOF
            {
             newCompositeNode(grammarAccess.getHoldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHoldType=ruleHoldType();

            state._fsp--;

             current =iv_ruleHoldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHoldType"


    // $ANTLR start "ruleHoldType"
    // InternalMyDsl.g:693:1: ruleHoldType returns [EObject current=null] : (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) ) ;
    public final EObject ruleHoldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:699:2: ( (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) ) )
            // InternalMyDsl.g:700:2: (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) )
            {
            // InternalMyDsl.g:700:2: (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) )
            // InternalMyDsl.g:701:3: otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0());
            		
            // InternalMyDsl.g:705:3: ( (lv_features_1_0= ruleType ) )
            // InternalMyDsl.g:706:4: (lv_features_1_0= ruleType )
            {
            // InternalMyDsl.g:706:4: (lv_features_1_0= ruleType )
            // InternalMyDsl.g:707:5: lv_features_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getHoldTypeAccess().getFeaturesTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_features_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHoldTypeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_1_0,
            						"ru.spbstu.application.configurator.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHoldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}