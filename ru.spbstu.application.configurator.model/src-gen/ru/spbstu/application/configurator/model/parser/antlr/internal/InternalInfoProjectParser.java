package ru.spbstu.application.configurator.model.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ru.spbstu.application.configurator.model.services.InfoProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInfoProjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'version:'", "'name: '", "'application:'", "'tenant:'", "'hold:'", "'archiveType:'", "'category:'", "'description:'", "'metadataCacheSize:'", "'type:'", "'holdType:'", "'sip'", "'table'", "'active archiving'", "'app decomm'"
    };
    public static final int RULE_VERSION_NUMBER=4;
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalInfoProjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInfoProjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInfoProjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInfoProject.g"; }



     	private InfoProjectGrammarAccess grammarAccess;

        public InternalInfoProjectParser(TokenStream input, InfoProjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected InfoProjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalInfoProject.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalInfoProject.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalInfoProject.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalInfoProject.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:78:2: ( ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) ) )
            // InternalInfoProject.g:79:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) )
            {
            // InternalInfoProject.g:79:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) ) )
            // InternalInfoProject.g:80:3: ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleApplication ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleHold ) )
            {
            // InternalInfoProject.g:80:3: ( (lv_element_0_0= ruleVersion ) )
            // InternalInfoProject.g:81:4: (lv_element_0_0= ruleVersion )
            {
            // InternalInfoProject.g:81:4: (lv_element_0_0= ruleVersion )
            // InternalInfoProject.g:82:5: lv_element_0_0= ruleVersion
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
            						"ru.spbstu.application.configurator.model.InfoProject.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:99:3: ( (lv_element_1_0= ruleApplication ) )
            // InternalInfoProject.g:100:4: (lv_element_1_0= ruleApplication )
            {
            // InternalInfoProject.g:100:4: (lv_element_1_0= ruleApplication )
            // InternalInfoProject.g:101:5: lv_element_1_0= ruleApplication
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
            						"ru.spbstu.application.configurator.model.InfoProject.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:118:3: ( (lv_element_2_0= ruleTenant ) )
            // InternalInfoProject.g:119:4: (lv_element_2_0= ruleTenant )
            {
            // InternalInfoProject.g:119:4: (lv_element_2_0= ruleTenant )
            // InternalInfoProject.g:120:5: lv_element_2_0= ruleTenant
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
            						"ru.spbstu.application.configurator.model.InfoProject.Tenant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:137:3: ( (lv_element_3_0= ruleHold ) )
            // InternalInfoProject.g:138:4: (lv_element_3_0= ruleHold )
            {
            // InternalInfoProject.g:138:4: (lv_element_3_0= ruleHold )
            // InternalInfoProject.g:139:5: lv_element_3_0= ruleHold
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
            						"ru.spbstu.application.configurator.model.InfoProject.Hold");
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
    // InternalInfoProject.g:160:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalInfoProject.g:160:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalInfoProject.g:161:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalInfoProject.g:167:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version:' ( (lv_name_1_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:173:2: ( (otherlv_0= 'version:' ( (lv_name_1_0= RULE_VERSION_NUMBER ) ) ) )
            // InternalInfoProject.g:174:2: (otherlv_0= 'version:' ( (lv_name_1_0= RULE_VERSION_NUMBER ) ) )
            {
            // InternalInfoProject.g:174:2: (otherlv_0= 'version:' ( (lv_name_1_0= RULE_VERSION_NUMBER ) ) )
            // InternalInfoProject.g:175:3: otherlv_0= 'version:' ( (lv_name_1_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            // InternalInfoProject.g:179:3: ( (lv_name_1_0= RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:180:4: (lv_name_1_0= RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:180:4: (lv_name_1_0= RULE_VERSION_NUMBER )
            // InternalInfoProject.g:181:5: lv_name_1_0= RULE_VERSION_NUMBER
            {
            lv_name_1_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"ru.spbstu.application.configurator.model.InfoProject.VERSION_NUMBER");
            				

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
    // InternalInfoProject.g:201:1: entryRuleFeatureName returns [EObject current=null] : iv_ruleFeatureName= ruleFeatureName EOF ;
    public final EObject entryRuleFeatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureName = null;


        try {
            // InternalInfoProject.g:201:52: (iv_ruleFeatureName= ruleFeatureName EOF )
            // InternalInfoProject.g:202:2: iv_ruleFeatureName= ruleFeatureName EOF
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
    // InternalInfoProject.g:208:1: ruleFeatureName returns [EObject current=null] : (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFeatureName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:214:2: ( (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:215:2: (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:215:2: (otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:216:3: otherlv_0= 'name: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureNameAccess().getNameKeyword_0());
            		
            // InternalInfoProject.g:220:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:221:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:221:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:222:5: lv_name_1_0= RULE_ID
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
    // InternalInfoProject.g:242:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalInfoProject.g:242:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalInfoProject.g:243:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalInfoProject.g:249:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) ;
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
            // InternalInfoProject.g:255:2: ( (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) )
            // InternalInfoProject.g:256:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            {
            // InternalInfoProject.g:256:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            // InternalInfoProject.g:257:3: otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalInfoProject.g:261:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:262:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:262:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:263:5: lv_features1_1_0= ruleFeatureName
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
            						"ru.spbstu.application.configurator.model.InfoProject.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:280:3: ( (lv_features_2_0= ruleArchiveType ) )
            // InternalInfoProject.g:281:4: (lv_features_2_0= ruleArchiveType )
            {
            // InternalInfoProject.g:281:4: (lv_features_2_0= ruleArchiveType )
            // InternalInfoProject.g:282:5: lv_features_2_0= ruleArchiveType
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeaturesArchiveTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_features_2_0=ruleArchiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_2_0,
            						"ru.spbstu.application.configurator.model.InfoProject.ArchiveType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:299:3: ( (lv_feature_3_0= ruleCategory ) )
            // InternalInfoProject.g:300:4: (lv_feature_3_0= ruleCategory )
            {
            // InternalInfoProject.g:300:4: (lv_feature_3_0= ruleCategory )
            // InternalInfoProject.g:301:5: lv_feature_3_0= ruleCategory
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
            						"ru.spbstu.application.configurator.model.InfoProject.Category");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:318:3: ( (lv_feature_4_0= ruleDescription ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalInfoProject.g:319:4: (lv_feature_4_0= ruleDescription )
                    {
                    // InternalInfoProject.g:319:4: (lv_feature_4_0= ruleDescription )
                    // InternalInfoProject.g:320:5: lv_feature_4_0= ruleDescription
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
                    						"ru.spbstu.application.configurator.model.InfoProject.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalInfoProject.g:337:3: ( (lv_feature_5_0= ruleMCS ) )
            // InternalInfoProject.g:338:4: (lv_feature_5_0= ruleMCS )
            {
            // InternalInfoProject.g:338:4: (lv_feature_5_0= ruleMCS )
            // InternalInfoProject.g:339:5: lv_feature_5_0= ruleMCS
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
            						"ru.spbstu.application.configurator.model.InfoProject.MCS");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:356:3: ( (lv_feature_6_0= ruleType ) )
            // InternalInfoProject.g:357:4: (lv_feature_6_0= ruleType )
            {
            // InternalInfoProject.g:357:4: (lv_feature_6_0= ruleType )
            // InternalInfoProject.g:358:5: lv_feature_6_0= ruleType
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
            						"ru.spbstu.application.configurator.model.InfoProject.Type");
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
    // InternalInfoProject.g:379:1: entryRuleTenant returns [EObject current=null] : iv_ruleTenant= ruleTenant EOF ;
    public final EObject entryRuleTenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTenant = null;


        try {
            // InternalInfoProject.g:379:47: (iv_ruleTenant= ruleTenant EOF )
            // InternalInfoProject.g:380:2: iv_ruleTenant= ruleTenant EOF
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
    // InternalInfoProject.g:386:1: ruleTenant returns [EObject current=null] : (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) ;
    public final EObject ruleTenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:392:2: ( (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) )
            // InternalInfoProject.g:393:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            {
            // InternalInfoProject.g:393:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            // InternalInfoProject.g:394:3: otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTenantAccess().getTenantKeyword_0());
            		
            // InternalInfoProject.g:398:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:399:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:399:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:400:5: lv_features1_1_0= ruleFeatureName
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
            						"ru.spbstu.application.configurator.model.InfoProject.FeatureName");
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
    // InternalInfoProject.g:421:1: entryRuleHold returns [EObject current=null] : iv_ruleHold= ruleHold EOF ;
    public final EObject entryRuleHold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHold = null;


        try {
            // InternalInfoProject.g:421:45: (iv_ruleHold= ruleHold EOF )
            // InternalInfoProject.g:422:2: iv_ruleHold= ruleHold EOF
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
    // InternalInfoProject.g:428:1: ruleHold returns [EObject current=null] : (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) ;
    public final EObject ruleHold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;

        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:434:2: ( (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) )
            // InternalInfoProject.g:435:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            {
            // InternalInfoProject.g:435:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            // InternalInfoProject.g:436:3: otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldAccess().getHoldKeyword_0());
            		
            // InternalInfoProject.g:440:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:441:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:441:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:442:5: lv_features1_1_0= ruleFeatureName
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
            						"ru.spbstu.application.configurator.model.InfoProject.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:459:3: ( (lv_features_2_0= ruleHoldType ) )
            // InternalInfoProject.g:460:4: (lv_features_2_0= ruleHoldType )
            {
            // InternalInfoProject.g:460:4: (lv_features_2_0= ruleHoldType )
            // InternalInfoProject.g:461:5: lv_features_2_0= ruleHoldType
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
            						"ru.spbstu.application.configurator.model.InfoProject.HoldType");
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


    // $ANTLR start "entryRuleArchiveType"
    // InternalInfoProject.g:482:1: entryRuleArchiveType returns [EObject current=null] : iv_ruleArchiveType= ruleArchiveType EOF ;
    public final EObject entryRuleArchiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchiveType = null;


        try {
            // InternalInfoProject.g:482:52: (iv_ruleArchiveType= ruleArchiveType EOF )
            // InternalInfoProject.g:483:2: iv_ruleArchiveType= ruleArchiveType EOF
            {
             newCompositeNode(grammarAccess.getArchiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArchiveType=ruleArchiveType();

            state._fsp--;

             current =iv_ruleArchiveType; 
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
    // $ANTLR end "entryRuleArchiveType"


    // $ANTLR start "ruleArchiveType"
    // InternalInfoProject.g:489:1: ruleArchiveType returns [EObject current=null] : (otherlv_0= 'archiveType:' ( (lv_value_1_0= ruleenumOfArchiveType ) ) ) ;
    public final EObject ruleArchiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:495:2: ( (otherlv_0= 'archiveType:' ( (lv_value_1_0= ruleenumOfArchiveType ) ) ) )
            // InternalInfoProject.g:496:2: (otherlv_0= 'archiveType:' ( (lv_value_1_0= ruleenumOfArchiveType ) ) )
            {
            // InternalInfoProject.g:496:2: (otherlv_0= 'archiveType:' ( (lv_value_1_0= ruleenumOfArchiveType ) ) )
            // InternalInfoProject.g:497:3: otherlv_0= 'archiveType:' ( (lv_value_1_0= ruleenumOfArchiveType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getArchiveTypeAccess().getArchiveTypeKeyword_0());
            		
            // InternalInfoProject.g:501:3: ( (lv_value_1_0= ruleenumOfArchiveType ) )
            // InternalInfoProject.g:502:4: (lv_value_1_0= ruleenumOfArchiveType )
            {
            // InternalInfoProject.g:502:4: (lv_value_1_0= ruleenumOfArchiveType )
            // InternalInfoProject.g:503:5: lv_value_1_0= ruleenumOfArchiveType
            {

            					newCompositeNode(grammarAccess.getArchiveTypeAccess().getValueEnumOfArchiveTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleenumOfArchiveType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArchiveTypeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"ru.spbstu.application.configurator.model.InfoProject.enumOfArchiveType");
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
    // $ANTLR end "ruleArchiveType"


    // $ANTLR start "entryRuleCategory"
    // InternalInfoProject.g:524:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalInfoProject.g:524:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalInfoProject.g:525:2: iv_ruleCategory= ruleCategory EOF
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
    // InternalInfoProject.g:531:1: ruleCategory returns [EObject current=null] : (otherlv_0= 'category:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:537:2: ( (otherlv_0= 'category:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:538:2: (otherlv_0= 'category:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:538:2: (otherlv_0= 'category:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:539:3: otherlv_0= 'category:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
            		
            // InternalInfoProject.g:543:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:544:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:544:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:545:5: lv_name_1_0= RULE_ID
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
    // InternalInfoProject.g:565:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalInfoProject.g:565:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalInfoProject.g:566:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalInfoProject.g:572:1: ruleDescription returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:578:2: ( (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:579:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:579:2: (otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:580:3: otherlv_0= 'description:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalInfoProject.g:584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:585:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:586:5: lv_name_1_0= RULE_ID
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
    // InternalInfoProject.g:606:1: entryRuleMCS returns [EObject current=null] : iv_ruleMCS= ruleMCS EOF ;
    public final EObject entryRuleMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCS = null;


        try {
            // InternalInfoProject.g:606:44: (iv_ruleMCS= ruleMCS EOF )
            // InternalInfoProject.g:607:2: iv_ruleMCS= ruleMCS EOF
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
    // InternalInfoProject.g:613:1: ruleMCS returns [EObject current=null] : (otherlv_0= 'metadataCacheSize:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:619:2: ( (otherlv_0= 'metadataCacheSize:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:620:2: (otherlv_0= 'metadataCacheSize:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:620:2: (otherlv_0= 'metadataCacheSize:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:621:3: otherlv_0= 'metadataCacheSize:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_0());
            		
            // InternalInfoProject.g:625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:626:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:627:5: lv_name_1_0= RULE_ID
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
    // InternalInfoProject.g:647:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalInfoProject.g:647:45: (iv_ruleType= ruleType EOF )
            // InternalInfoProject.g:648:2: iv_ruleType= ruleType EOF
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
    // InternalInfoProject.g:654:1: ruleType returns [EObject current=null] : (otherlv_0= 'type:' ( (lv_value_1_0= ruleenumOfTypes ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:660:2: ( (otherlv_0= 'type:' ( (lv_value_1_0= ruleenumOfTypes ) ) ) )
            // InternalInfoProject.g:661:2: (otherlv_0= 'type:' ( (lv_value_1_0= ruleenumOfTypes ) ) )
            {
            // InternalInfoProject.g:661:2: (otherlv_0= 'type:' ( (lv_value_1_0= ruleenumOfTypes ) ) )
            // InternalInfoProject.g:662:3: otherlv_0= 'type:' ( (lv_value_1_0= ruleenumOfTypes ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalInfoProject.g:666:3: ( (lv_value_1_0= ruleenumOfTypes ) )
            // InternalInfoProject.g:667:4: (lv_value_1_0= ruleenumOfTypes )
            {
            // InternalInfoProject.g:667:4: (lv_value_1_0= ruleenumOfTypes )
            // InternalInfoProject.g:668:5: lv_value_1_0= ruleenumOfTypes
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleenumOfTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"ru.spbstu.application.configurator.model.InfoProject.enumOfTypes");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleHoldType"
    // InternalInfoProject.g:689:1: entryRuleHoldType returns [EObject current=null] : iv_ruleHoldType= ruleHoldType EOF ;
    public final EObject entryRuleHoldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldType = null;


        try {
            // InternalInfoProject.g:689:49: (iv_ruleHoldType= ruleHoldType EOF )
            // InternalInfoProject.g:690:2: iv_ruleHoldType= ruleHoldType EOF
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
    // InternalInfoProject.g:696:1: ruleHoldType returns [EObject current=null] : (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) ) ;
    public final EObject ruleHoldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:702:2: ( (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) ) )
            // InternalInfoProject.g:703:2: (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) )
            {
            // InternalInfoProject.g:703:2: (otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) ) )
            // InternalInfoProject.g:704:3: otherlv_0= 'holdType:' ( (lv_features_1_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0());
            		
            // InternalInfoProject.g:708:3: ( (lv_features_1_0= ruleType ) )
            // InternalInfoProject.g:709:4: (lv_features_1_0= ruleType )
            {
            // InternalInfoProject.g:709:4: (lv_features_1_0= ruleType )
            // InternalInfoProject.g:710:5: lv_features_1_0= ruleType
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
            						"ru.spbstu.application.configurator.model.InfoProject.Type");
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


    // $ANTLR start "ruleenumOfArchiveType"
    // InternalInfoProject.g:731:1: ruleenumOfArchiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) ) ;
    public final Enumerator ruleenumOfArchiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfoProject.g:737:2: ( ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) ) )
            // InternalInfoProject.g:738:2: ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) )
            {
            // InternalInfoProject.g:738:2: ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfoProject.g:739:3: (enumLiteral_0= 'sip' )
                    {
                    // InternalInfoProject.g:739:3: (enumLiteral_0= 'sip' )
                    // InternalInfoProject.g:740:4: enumLiteral_0= 'sip'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:747:3: (enumLiteral_1= 'table' )
                    {
                    // InternalInfoProject.g:747:3: (enumLiteral_1= 'table' )
                    // InternalInfoProject.g:748:4: enumLiteral_1= 'table'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfArchiveTypeAccess().getTABLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumOfArchiveTypeAccess().getTABLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleenumOfArchiveType"


    // $ANTLR start "ruleenumOfTypes"
    // InternalInfoProject.g:758:1: ruleenumOfTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) ) ;
    public final Enumerator ruleenumOfTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfoProject.g:764:2: ( ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) ) )
            // InternalInfoProject.g:765:2: ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) )
            {
            // InternalInfoProject.g:765:2: ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalInfoProject.g:766:3: (enumLiteral_0= 'active archiving' )
                    {
                    // InternalInfoProject.g:766:3: (enumLiteral_0= 'active archiving' )
                    // InternalInfoProject.g:767:4: enumLiteral_0= 'active archiving'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:774:3: (enumLiteral_1= 'app decomm' )
                    {
                    // InternalInfoProject.g:774:3: (enumLiteral_1= 'app decomm' )
                    // InternalInfoProject.g:775:4: enumLiteral_1= 'app decomm'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfTypesAccess().getAPP_DECOMMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumOfTypesAccess().getAPP_DECOMMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleenumOfTypes"

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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006000000L});

}