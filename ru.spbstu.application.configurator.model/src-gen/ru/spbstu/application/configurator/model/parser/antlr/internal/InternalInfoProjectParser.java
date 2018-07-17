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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_VERSION_NUMBER", "RULE_ID", "RULE_EXCEPTION", "RULE_ADDITION", "RULE_WS", "RULE_ML_COMMENT", "RULE_MY_INT", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'version:'", "'namespace:'", "'prefix: '", "'uri:'", "'-'", "'$'", "'{'", "'}'", "'^'", "':'", "'.'", "'name:'", "'application:'", "'tenant:'", "'hold:'", "'archiveType: '", "'category:'", "'description:'", "'metadataCacheSize: '", "'type:'", "'holdType:'", "'includes:'", "'/'", "'../'", "'ingestNode:'", "'enumerationCutoffDays:'", "'enumerationMinusRunning:'", "'logLevel:'", "'sip'", "'table'", "'active archiving'", "'app decomm'"
    };
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=4;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_EXCEPTION=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_VERSION_NUMBER=5;
    public static final int RULE_STRING=13;
    public static final int RULE_ADDITION=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_MY_INT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalInfoProject.g:67:2: (iv_ruleModel= ruleModel EOF )
            // InternalInfoProject.g:68:2: iv_ruleModel= ruleModel EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInfoProject.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleNamespace ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleApplication ) ) ( (lv_element_4_0= ruleHold ) ) ( (lv_element_5_0= ruleIngestNode ) ) ( (lv_element_6_0= ruleInclude ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;

        EObject lv_element_1_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_element_3_0 = null;

        EObject lv_element_4_0 = null;

        EObject lv_element_5_0 = null;

        EObject lv_element_6_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalInfoProject.g:84:2: ( ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleNamespace ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleApplication ) ) ( (lv_element_4_0= ruleHold ) ) ( (lv_element_5_0= ruleIngestNode ) ) ( (lv_element_6_0= ruleInclude ) ) ) )
            // InternalInfoProject.g:85:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleNamespace ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleApplication ) ) ( (lv_element_4_0= ruleHold ) ) ( (lv_element_5_0= ruleIngestNode ) ) ( (lv_element_6_0= ruleInclude ) ) )
            {
            // InternalInfoProject.g:85:2: ( ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleNamespace ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleApplication ) ) ( (lv_element_4_0= ruleHold ) ) ( (lv_element_5_0= ruleIngestNode ) ) ( (lv_element_6_0= ruleInclude ) ) )
            // InternalInfoProject.g:86:3: ( (lv_element_0_0= ruleVersion ) ) ( (lv_element_1_0= ruleNamespace ) ) ( (lv_element_2_0= ruleTenant ) ) ( (lv_element_3_0= ruleApplication ) ) ( (lv_element_4_0= ruleHold ) ) ( (lv_element_5_0= ruleIngestNode ) ) ( (lv_element_6_0= ruleInclude ) )
            {
            // InternalInfoProject.g:86:3: ( (lv_element_0_0= ruleVersion ) )
            // InternalInfoProject.g:87:4: (lv_element_0_0= ruleVersion )
            {
            // InternalInfoProject.g:87:4: (lv_element_0_0= ruleVersion )
            // InternalInfoProject.g:88:5: lv_element_0_0= ruleVersion
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

            // InternalInfoProject.g:105:3: ( (lv_element_1_0= ruleNamespace ) )
            // InternalInfoProject.g:106:4: (lv_element_1_0= ruleNamespace )
            {
            // InternalInfoProject.g:106:4: (lv_element_1_0= ruleNamespace )
            // InternalInfoProject.g:107:5: lv_element_1_0= ruleNamespace
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementNamespaceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_element_1_0=ruleNamespace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_1_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Namespace");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:124:3: ( (lv_element_2_0= ruleTenant ) )
            // InternalInfoProject.g:125:4: (lv_element_2_0= ruleTenant )
            {
            // InternalInfoProject.g:125:4: (lv_element_2_0= ruleTenant )
            // InternalInfoProject.g:126:5: lv_element_2_0= ruleTenant
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

            // InternalInfoProject.g:143:3: ( (lv_element_3_0= ruleApplication ) )
            // InternalInfoProject.g:144:4: (lv_element_3_0= ruleApplication )
            {
            // InternalInfoProject.g:144:4: (lv_element_3_0= ruleApplication )
            // InternalInfoProject.g:145:5: lv_element_3_0= ruleApplication
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_element_3_0=ruleApplication();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_3_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Application");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:162:3: ( (lv_element_4_0= ruleHold ) )
            // InternalInfoProject.g:163:4: (lv_element_4_0= ruleHold )
            {
            // InternalInfoProject.g:163:4: (lv_element_4_0= ruleHold )
            // InternalInfoProject.g:164:5: lv_element_4_0= ruleHold
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementHoldParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_element_4_0=ruleHold();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_4_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Hold");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:181:3: ( (lv_element_5_0= ruleIngestNode ) )
            // InternalInfoProject.g:182:4: (lv_element_5_0= ruleIngestNode )
            {
            // InternalInfoProject.g:182:4: (lv_element_5_0= ruleIngestNode )
            // InternalInfoProject.g:183:5: lv_element_5_0= ruleIngestNode
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementIngestNodeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_element_5_0=ruleIngestNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_5_0,
            						"ru.spbstu.application.configurator.model.InfoProject.IngestNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:200:3: ( (lv_element_6_0= ruleInclude ) )
            // InternalInfoProject.g:201:4: (lv_element_6_0= ruleInclude )
            {
            // InternalInfoProject.g:201:4: (lv_element_6_0= ruleInclude )
            // InternalInfoProject.g:202:5: lv_element_6_0= ruleInclude
            {

            					newCompositeNode(grammarAccess.getModelAccess().getElementIncludeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_element_6_0=ruleInclude();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"element",
            						lv_element_6_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Include");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVersion"
    // InternalInfoProject.g:226:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalInfoProject.g:226:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalInfoProject.g:227:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalInfoProject.g:233:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'version:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:239:2: ( (otherlv_0= 'version:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) ) )
            // InternalInfoProject.g:240:2: (otherlv_0= 'version:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) )
            {
            // InternalInfoProject.g:240:2: (otherlv_0= 'version:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) )
            // InternalInfoProject.g:241:3: otherlv_0= 'version:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_10); 

            			newLeafNode(this_SPACE_1, grammarAccess.getVersionAccess().getSPACETerminalRuleCall_1());
            		
            // InternalInfoProject.g:249:3: ( (lv_name_2_0= RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:250:4: (lv_name_2_0= RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:250:4: (lv_name_2_0= RULE_VERSION_NUMBER )
            // InternalInfoProject.g:251:5: lv_name_2_0= RULE_VERSION_NUMBER
            {
            lv_name_2_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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


    // $ANTLR start "entryRuleNamespace"
    // InternalInfoProject.g:271:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalInfoProject.g:271:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalInfoProject.g:272:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalInfoProject.g:278:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace:' ( (lv_feature_1_0= rulePrefix ) ) ( (lv_feature_2_0= ruleUri ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_feature_1_0 = null;

        EObject lv_feature_2_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:284:2: ( (otherlv_0= 'namespace:' ( (lv_feature_1_0= rulePrefix ) ) ( (lv_feature_2_0= ruleUri ) ) ) )
            // InternalInfoProject.g:285:2: (otherlv_0= 'namespace:' ( (lv_feature_1_0= rulePrefix ) ) ( (lv_feature_2_0= ruleUri ) ) )
            {
            // InternalInfoProject.g:285:2: (otherlv_0= 'namespace:' ( (lv_feature_1_0= rulePrefix ) ) ( (lv_feature_2_0= ruleUri ) ) )
            // InternalInfoProject.g:286:3: otherlv_0= 'namespace:' ( (lv_feature_1_0= rulePrefix ) ) ( (lv_feature_2_0= ruleUri ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
            		
            // InternalInfoProject.g:290:3: ( (lv_feature_1_0= rulePrefix ) )
            // InternalInfoProject.g:291:4: (lv_feature_1_0= rulePrefix )
            {
            // InternalInfoProject.g:291:4: (lv_feature_1_0= rulePrefix )
            // InternalInfoProject.g:292:5: lv_feature_1_0= rulePrefix
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getFeaturePrefixParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_feature_1_0=rulePrefix();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_1_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Prefix");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:309:3: ( (lv_feature_2_0= ruleUri ) )
            // InternalInfoProject.g:310:4: (lv_feature_2_0= ruleUri )
            {
            // InternalInfoProject.g:310:4: (lv_feature_2_0= ruleUri )
            // InternalInfoProject.g:311:5: lv_feature_2_0= ruleUri
            {

            					newCompositeNode(grammarAccess.getNamespaceAccess().getFeatureUriParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_feature_2_0=ruleUri();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamespaceRule());
            					}
            					add(
            						current,
            						"feature",
            						lv_feature_2_0,
            						"ru.spbstu.application.configurator.model.InfoProject.Uri");
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
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRulePrefix"
    // InternalInfoProject.g:332:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalInfoProject.g:332:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalInfoProject.g:333:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix; 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalInfoProject.g:339:1: rulePrefix returns [EObject current=null] : (otherlv_0= 'prefix: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:345:2: ( (otherlv_0= 'prefix: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:346:2: (otherlv_0= 'prefix: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:346:2: (otherlv_0= 'prefix: ' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:347:3: otherlv_0= 'prefix: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPrefixAccess().getPrefixKeyword_0());
            		
            // InternalInfoProject.g:351:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:352:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:352:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:353:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrefixRule());
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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // InternalInfoProject.g:373:1: entryRuleUri returns [EObject current=null] : iv_ruleUri= ruleUri EOF ;
    public final EObject entryRuleUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUri = null;


        try {
            // InternalInfoProject.g:373:44: (iv_ruleUri= ruleUri EOF )
            // InternalInfoProject.g:374:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri; 
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
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // InternalInfoProject.g:380:1: ruleUri returns [EObject current=null] : ( () otherlv_1= 'uri:' this_SPACE_2= RULE_SPACE ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )* ) ;
    public final EObject ruleUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SPACE_2=null;
        Token lv_name_3_1=null;
        Token lv_name_3_2=null;
        Token lv_name_3_3=null;
        Token lv_name_3_4=null;
        Token lv_name_3_5=null;
        Token lv_name_3_6=null;
        Token lv_name_3_7=null;
        Token lv_name_3_8=null;
        Token lv_name_3_9=null;


        	enterRule();

        try {
            // InternalInfoProject.g:386:2: ( ( () otherlv_1= 'uri:' this_SPACE_2= RULE_SPACE ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )* ) )
            // InternalInfoProject.g:387:2: ( () otherlv_1= 'uri:' this_SPACE_2= RULE_SPACE ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )* )
            {
            // InternalInfoProject.g:387:2: ( () otherlv_1= 'uri:' this_SPACE_2= RULE_SPACE ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )* )
            // InternalInfoProject.g:388:3: () otherlv_1= 'uri:' this_SPACE_2= RULE_SPACE ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )*
            {
            // InternalInfoProject.g:388:3: ()
            // InternalInfoProject.g:389:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUriAccess().getUriAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getUriAccess().getUriKeyword_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_14); 

            			newLeafNode(this_SPACE_2, grammarAccess.getUriAccess().getSPACETerminalRuleCall_2());
            		
            // InternalInfoProject.g:403:3: ( ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_VERSION_NUMBER && LA2_0<=RULE_ID)||(LA2_0>=20 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInfoProject.g:404:4: ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) )
            	    {
            	    // InternalInfoProject.g:404:4: ( (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER ) )
            	    // InternalInfoProject.g:405:5: (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER )
            	    {
            	    // InternalInfoProject.g:405:5: (lv_name_3_1= RULE_ID | lv_name_3_2= '-' | lv_name_3_3= '$' | lv_name_3_4= '{' | lv_name_3_5= '}' | lv_name_3_6= '^' | lv_name_3_7= ':' | lv_name_3_8= '.' | lv_name_3_9= RULE_VERSION_NUMBER )
            	    int alt1=9;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt1=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt1=6;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=7;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt1=8;
            	        }
            	        break;
            	    case RULE_VERSION_NUMBER:
            	        {
            	        alt1=9;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalInfoProject.g:406:6: lv_name_3_1= RULE_ID
            	            {
            	            lv_name_3_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_1, grammarAccess.getUriAccess().getNameIDTerminalRuleCall_3_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_3_1,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalInfoProject.g:421:6: lv_name_3_2= '-'
            	            {
            	            lv_name_3_2=(Token)match(input,20,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_2, grammarAccess.getUriAccess().getNameHyphenMinusKeyword_3_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_2, null);
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalInfoProject.g:432:6: lv_name_3_3= '$'
            	            {
            	            lv_name_3_3=(Token)match(input,21,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_3, grammarAccess.getUriAccess().getNameDollarSignKeyword_3_0_2());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_3, null);
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalInfoProject.g:443:6: lv_name_3_4= '{'
            	            {
            	            lv_name_3_4=(Token)match(input,22,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_4, grammarAccess.getUriAccess().getNameLeftCurlyBracketKeyword_3_0_3());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_4, null);
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalInfoProject.g:454:6: lv_name_3_5= '}'
            	            {
            	            lv_name_3_5=(Token)match(input,23,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_5, grammarAccess.getUriAccess().getNameRightCurlyBracketKeyword_3_0_4());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_5, null);
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalInfoProject.g:465:6: lv_name_3_6= '^'
            	            {
            	            lv_name_3_6=(Token)match(input,24,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_6, grammarAccess.getUriAccess().getNameCircumflexAccentKeyword_3_0_5());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_6, null);
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalInfoProject.g:476:6: lv_name_3_7= ':'
            	            {
            	            lv_name_3_7=(Token)match(input,25,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_7, grammarAccess.getUriAccess().getNameColonKeyword_3_0_6());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_7, null);
            	            					

            	            }
            	            break;
            	        case 8 :
            	            // InternalInfoProject.g:487:6: lv_name_3_8= '.'
            	            {
            	            lv_name_3_8=(Token)match(input,26,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_8, grammarAccess.getUriAccess().getNameFullStopKeyword_3_0_7());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_3_8, null);
            	            					

            	            }
            	            break;
            	        case 9 :
            	            // InternalInfoProject.g:498:6: lv_name_3_9= RULE_VERSION_NUMBER
            	            {
            	            lv_name_3_9=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_14); 

            	            						newLeafNode(lv_name_3_9, grammarAccess.getUriAccess().getNameVERSION_NUMBERTerminalRuleCall_3_0_8());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getUriRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_3_9,
            	            							"ru.spbstu.application.configurator.model.InfoProject.VERSION_NUMBER");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleFeatureName"
    // InternalInfoProject.g:519:1: entryRuleFeatureName returns [EObject current=null] : iv_ruleFeatureName= ruleFeatureName EOF ;
    public final EObject entryRuleFeatureName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:521:2: (iv_ruleFeatureName= ruleFeatureName EOF )
            // InternalInfoProject.g:522:2: iv_ruleFeatureName= ruleFeatureName EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureName"


    // $ANTLR start "ruleFeatureName"
    // InternalInfoProject.g:531:1: ruleFeatureName returns [EObject current=null] : ( () otherlv_1= 'name:' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )* ) ;
    public final EObject ruleFeatureName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token lv_name_2_4=null;
        Token lv_name_2_5=null;
        Token lv_name_2_6=null;
        Token lv_name_2_7=null;
        Token lv_name_2_8=null;
        Token lv_name_2_9=null;
        Token lv_name_2_10=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:538:2: ( ( () otherlv_1= 'name:' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )* ) )
            // InternalInfoProject.g:539:2: ( () otherlv_1= 'name:' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )* )
            {
            // InternalInfoProject.g:539:2: ( () otherlv_1= 'name:' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )* )
            // InternalInfoProject.g:540:3: () otherlv_1= 'name:' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )*
            {
            // InternalInfoProject.g:540:3: ()
            // InternalInfoProject.g:541:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureNameAccess().getFeatureNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureNameAccess().getNameKeyword_1());
            		
            // InternalInfoProject.g:551:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_VERSION_NUMBER && LA4_0<=RULE_EXCEPTION)||(LA4_0>=20 && LA4_0<=26)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalInfoProject.g:552:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) )
            	    {
            	    // InternalInfoProject.g:552:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION ) )
            	    // InternalInfoProject.g:553:5: (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION )
            	    {
            	    // InternalInfoProject.g:553:5: (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_VERSION_NUMBER | lv_name_2_10= RULE_EXCEPTION )
            	    int alt3=10;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt3=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt3=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt3=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt3=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt3=5;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt3=6;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt3=7;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt3=8;
            	        }
            	        break;
            	    case RULE_VERSION_NUMBER:
            	        {
            	        alt3=9;
            	        }
            	        break;
            	    case RULE_EXCEPTION:
            	        {
            	        alt3=10;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt3) {
            	        case 1 :
            	            // InternalInfoProject.g:554:6: lv_name_2_1= RULE_ID
            	            {
            	            lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_1, grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_2_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_1,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalInfoProject.g:569:6: lv_name_2_2= '-'
            	            {
            	            lv_name_2_2=(Token)match(input,20,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_2, grammarAccess.getFeatureNameAccess().getNameHyphenMinusKeyword_2_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_2, null);
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalInfoProject.g:580:6: lv_name_2_3= '$'
            	            {
            	            lv_name_2_3=(Token)match(input,21,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_3, grammarAccess.getFeatureNameAccess().getNameDollarSignKeyword_2_0_2());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_3, null);
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalInfoProject.g:591:6: lv_name_2_4= '{'
            	            {
            	            lv_name_2_4=(Token)match(input,22,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_4, grammarAccess.getFeatureNameAccess().getNameLeftCurlyBracketKeyword_2_0_3());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_4, null);
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalInfoProject.g:602:6: lv_name_2_5= '}'
            	            {
            	            lv_name_2_5=(Token)match(input,23,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_5, grammarAccess.getFeatureNameAccess().getNameRightCurlyBracketKeyword_2_0_4());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_5, null);
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalInfoProject.g:613:6: lv_name_2_6= '^'
            	            {
            	            lv_name_2_6=(Token)match(input,24,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_6, grammarAccess.getFeatureNameAccess().getNameCircumflexAccentKeyword_2_0_5());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_6, null);
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalInfoProject.g:624:6: lv_name_2_7= ':'
            	            {
            	            lv_name_2_7=(Token)match(input,25,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_7, grammarAccess.getFeatureNameAccess().getNameColonKeyword_2_0_6());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_7, null);
            	            					

            	            }
            	            break;
            	        case 8 :
            	            // InternalInfoProject.g:635:6: lv_name_2_8= '.'
            	            {
            	            lv_name_2_8=(Token)match(input,26,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_8, grammarAccess.getFeatureNameAccess().getNameFullStopKeyword_2_0_7());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_8, null);
            	            					

            	            }
            	            break;
            	        case 9 :
            	            // InternalInfoProject.g:646:6: lv_name_2_9= RULE_VERSION_NUMBER
            	            {
            	            lv_name_2_9=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_9, grammarAccess.getFeatureNameAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_8());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_9,
            	            							"ru.spbstu.application.configurator.model.InfoProject.VERSION_NUMBER");
            	            					

            	            }
            	            break;
            	        case 10 :
            	            // InternalInfoProject.g:661:6: lv_name_2_10= RULE_EXCEPTION
            	            {
            	            lv_name_2_10=(Token)match(input,RULE_EXCEPTION,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_10, grammarAccess.getFeatureNameAccess().getNameEXCEPTIONTerminalRuleCall_2_0_9());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getFeatureNameRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_10,
            	            							"ru.spbstu.application.configurator.model.InfoProject.EXCEPTION");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFeatureName"


    // $ANTLR start "entryRuleApplication"
    // InternalInfoProject.g:685:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalInfoProject.g:685:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalInfoProject.g:686:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalInfoProject.g:692:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) ;
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
            // InternalInfoProject.g:698:2: ( (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) ) )
            // InternalInfoProject.g:699:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            {
            // InternalInfoProject.g:699:2: (otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) ) )
            // InternalInfoProject.g:700:3: otherlv_0= 'application:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleArchiveType ) ) ( (lv_feature_3_0= ruleCategory ) ) ( (lv_feature_4_0= ruleDescription ) )? ( (lv_feature_5_0= ruleMCS ) ) ( (lv_feature_6_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalInfoProject.g:704:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:705:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:705:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:706:5: lv_features1_1_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatures1FeatureNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalInfoProject.g:723:3: ( (lv_features_2_0= ruleArchiveType ) )
            // InternalInfoProject.g:724:4: (lv_features_2_0= ruleArchiveType )
            {
            // InternalInfoProject.g:724:4: (lv_features_2_0= ruleArchiveType )
            // InternalInfoProject.g:725:5: lv_features_2_0= ruleArchiveType
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeaturesArchiveTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalInfoProject.g:742:3: ( (lv_feature_3_0= ruleCategory ) )
            // InternalInfoProject.g:743:4: (lv_feature_3_0= ruleCategory )
            {
            // InternalInfoProject.g:743:4: (lv_feature_3_0= ruleCategory )
            // InternalInfoProject.g:744:5: lv_feature_3_0= ruleCategory
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureCategoryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalInfoProject.g:761:3: ( (lv_feature_4_0= ruleDescription ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalInfoProject.g:762:4: (lv_feature_4_0= ruleDescription )
                    {
                    // InternalInfoProject.g:762:4: (lv_feature_4_0= ruleDescription )
                    // InternalInfoProject.g:763:5: lv_feature_4_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureDescriptionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_18);
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

            // InternalInfoProject.g:780:3: ( (lv_feature_5_0= ruleMCS ) )
            // InternalInfoProject.g:781:4: (lv_feature_5_0= ruleMCS )
            {
            // InternalInfoProject.g:781:4: (lv_feature_5_0= ruleMCS )
            // InternalInfoProject.g:782:5: lv_feature_5_0= ruleMCS
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getFeatureMCSParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalInfoProject.g:799:3: ( (lv_feature_6_0= ruleType ) )
            // InternalInfoProject.g:800:4: (lv_feature_6_0= ruleType )
            {
            // InternalInfoProject.g:800:4: (lv_feature_6_0= ruleType )
            // InternalInfoProject.g:801:5: lv_feature_6_0= ruleType
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
    // InternalInfoProject.g:822:1: entryRuleTenant returns [EObject current=null] : iv_ruleTenant= ruleTenant EOF ;
    public final EObject entryRuleTenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTenant = null;


        try {
            // InternalInfoProject.g:822:47: (iv_ruleTenant= ruleTenant EOF )
            // InternalInfoProject.g:823:2: iv_ruleTenant= ruleTenant EOF
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
    // InternalInfoProject.g:829:1: ruleTenant returns [EObject current=null] : (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) ;
    public final EObject ruleTenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:835:2: ( (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) ) )
            // InternalInfoProject.g:836:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            {
            // InternalInfoProject.g:836:2: (otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) ) )
            // InternalInfoProject.g:837:3: otherlv_0= 'tenant:' ( (lv_features1_1_0= ruleFeatureName ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getTenantAccess().getTenantKeyword_0());
            		
            // InternalInfoProject.g:841:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:842:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:842:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:843:5: lv_features1_1_0= ruleFeatureName
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
    // InternalInfoProject.g:864:1: entryRuleHold returns [EObject current=null] : iv_ruleHold= ruleHold EOF ;
    public final EObject entryRuleHold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHold = null;


        try {
            // InternalInfoProject.g:864:45: (iv_ruleHold= ruleHold EOF )
            // InternalInfoProject.g:865:2: iv_ruleHold= ruleHold EOF
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
    // InternalInfoProject.g:871:1: ruleHold returns [EObject current=null] : (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) ;
    public final EObject ruleHold() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_features1_1_0 = null;

        EObject lv_features_2_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:877:2: ( (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) ) )
            // InternalInfoProject.g:878:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            {
            // InternalInfoProject.g:878:2: (otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) ) )
            // InternalInfoProject.g:879:3: otherlv_0= 'hold:' ( (lv_features1_1_0= ruleFeatureName ) ) ( (lv_features_2_0= ruleHoldType ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getHoldAccess().getHoldKeyword_0());
            		
            // InternalInfoProject.g:883:3: ( (lv_features1_1_0= ruleFeatureName ) )
            // InternalInfoProject.g:884:4: (lv_features1_1_0= ruleFeatureName )
            {
            // InternalInfoProject.g:884:4: (lv_features1_1_0= ruleFeatureName )
            // InternalInfoProject.g:885:5: lv_features1_1_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getHoldAccess().getFeatures1FeatureNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalInfoProject.g:902:3: ( (lv_features_2_0= ruleHoldType ) )
            // InternalInfoProject.g:903:4: (lv_features_2_0= ruleHoldType )
            {
            // InternalInfoProject.g:903:4: (lv_features_2_0= ruleHoldType )
            // InternalInfoProject.g:904:5: lv_features_2_0= ruleHoldType
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
    // InternalInfoProject.g:925:1: entryRuleArchiveType returns [EObject current=null] : iv_ruleArchiveType= ruleArchiveType EOF ;
    public final EObject entryRuleArchiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchiveType = null;


        try {
            // InternalInfoProject.g:925:52: (iv_ruleArchiveType= ruleArchiveType EOF )
            // InternalInfoProject.g:926:2: iv_ruleArchiveType= ruleArchiveType EOF
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
    // InternalInfoProject.g:932:1: ruleArchiveType returns [EObject current=null] : (otherlv_0= 'archiveType: ' ( (lv_value_1_0= ruleenumOfArchiveType ) ) ) ;
    public final EObject ruleArchiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:938:2: ( (otherlv_0= 'archiveType: ' ( (lv_value_1_0= ruleenumOfArchiveType ) ) ) )
            // InternalInfoProject.g:939:2: (otherlv_0= 'archiveType: ' ( (lv_value_1_0= ruleenumOfArchiveType ) ) )
            {
            // InternalInfoProject.g:939:2: (otherlv_0= 'archiveType: ' ( (lv_value_1_0= ruleenumOfArchiveType ) ) )
            // InternalInfoProject.g:940:3: otherlv_0= 'archiveType: ' ( (lv_value_1_0= ruleenumOfArchiveType ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getArchiveTypeAccess().getArchiveTypeKeyword_0());
            		
            // InternalInfoProject.g:944:3: ( (lv_value_1_0= ruleenumOfArchiveType ) )
            // InternalInfoProject.g:945:4: (lv_value_1_0= ruleenumOfArchiveType )
            {
            // InternalInfoProject.g:945:4: (lv_value_1_0= ruleenumOfArchiveType )
            // InternalInfoProject.g:946:5: lv_value_1_0= ruleenumOfArchiveType
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
    // InternalInfoProject.g:967:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalInfoProject.g:967:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalInfoProject.g:968:2: iv_ruleCategory= ruleCategory EOF
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
    // InternalInfoProject.g:974:1: ruleCategory returns [EObject current=null] : ( ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? ) | (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )* ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SPACE_2=null;
        Token lv_name_3_0=null;
        Token this_SPACE_4=null;
        Token this_ID_5=null;
        Token this_ID_6=null;
        Token this_ADDITION_7=null;
        Token this_VERSION_NUMBER_8=null;


        	enterRule();

        try {
            // InternalInfoProject.g:980:2: ( ( ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? ) | (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )* ) )
            // InternalInfoProject.g:981:2: ( ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? ) | (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )* )
            {
            // InternalInfoProject.g:981:2: ( ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? ) | (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||(LA9_0>=RULE_VERSION_NUMBER && LA9_0<=RULE_ID)||LA9_0==RULE_ADDITION||(LA9_0>=33 && LA9_0<=34)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalInfoProject.g:982:3: ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? )
                    {
                    // InternalInfoProject.g:982:3: ( () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )? )
                    // InternalInfoProject.g:983:4: () otherlv_1= 'category:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE )? (this_ID_5= RULE_ID )?
                    {
                    // InternalInfoProject.g:983:4: ()
                    // InternalInfoProject.g:984:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCategoryAccess().getCategoryAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getCategoryKeyword_0_1());
                    			
                    this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_13); 

                    				newLeafNode(this_SPACE_2, grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_2());
                    			
                    // InternalInfoProject.g:998:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalInfoProject.g:999:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalInfoProject.g:999:5: (lv_name_3_0= RULE_ID )
                    // InternalInfoProject.g:1000:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCategoryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalInfoProject.g:1016:4: (this_SPACE_4= RULE_SPACE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_SPACE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalInfoProject.g:1017:5: this_SPACE_4= RULE_SPACE
                            {
                            this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_23); 

                            					newLeafNode(this_SPACE_4, grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_4());
                            				

                            }
                            break;

                    }

                    // InternalInfoProject.g:1022:4: (this_ID_5= RULE_ID )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalInfoProject.g:1023:5: this_ID_5= RULE_ID
                            {
                            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                            					newLeafNode(this_ID_5, grammarAccess.getCategoryAccess().getIDTerminalRuleCall_0_5());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:1030:3: (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )*
                    {
                    // InternalInfoProject.g:1030:3: (this_ID_6= RULE_ID | this_ADDITION_7= RULE_ADDITION | this_VERSION_NUMBER_8= RULE_VERSION_NUMBER )*
                    loop8:
                    do {
                        int alt8=4;
                        switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            alt8=1;
                            }
                            break;
                        case RULE_ADDITION:
                            {
                            alt8=2;
                            }
                            break;
                        case RULE_VERSION_NUMBER:
                            {
                            alt8=3;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // InternalInfoProject.g:1031:4: this_ID_6= RULE_ID
                    	    {
                    	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_24); 

                    	    				newLeafNode(this_ID_6, grammarAccess.getCategoryAccess().getIDTerminalRuleCall_1_0());
                    	    			

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalInfoProject.g:1036:4: this_ADDITION_7= RULE_ADDITION
                    	    {
                    	    this_ADDITION_7=(Token)match(input,RULE_ADDITION,FOLLOW_24); 

                    	    				newLeafNode(this_ADDITION_7, grammarAccess.getCategoryAccess().getADDITIONTerminalRuleCall_1_1());
                    	    			

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalInfoProject.g:1041:4: this_VERSION_NUMBER_8= RULE_VERSION_NUMBER
                    	    {
                    	    this_VERSION_NUMBER_8=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_24); 

                    	    				newLeafNode(this_VERSION_NUMBER_8, grammarAccess.getCategoryAccess().getVERSION_NUMBERTerminalRuleCall_1_2());
                    	    			

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


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
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleDescription"
    // InternalInfoProject.g:1050:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalInfoProject.g:1050:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalInfoProject.g:1051:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalInfoProject.g:1057:1: ruleDescription returns [EObject current=null] : ( () otherlv_1= 'description:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )* ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SPACE_2=null;
        Token lv_name_3_0=null;
        Token this_SPACE_4=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1063:2: ( ( () otherlv_1= 'description:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )* ) )
            // InternalInfoProject.g:1064:2: ( () otherlv_1= 'description:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )* )
            {
            // InternalInfoProject.g:1064:2: ( () otherlv_1= 'description:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )* )
            // InternalInfoProject.g:1065:3: () otherlv_1= 'description:' this_SPACE_2= RULE_SPACE ( (lv_name_3_0= RULE_ID ) ) (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )*
            {
            // InternalInfoProject.g:1065:3: ()
            // InternalInfoProject.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionAccess().getDescriptionKeyword_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_13); 

            			newLeafNode(this_SPACE_2, grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_2());
            		
            // InternalInfoProject.g:1080:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalInfoProject.g:1081:4: (lv_name_3_0= RULE_ID )
            {
            // InternalInfoProject.g:1081:4: (lv_name_3_0= RULE_ID )
            // InternalInfoProject.g:1082:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalInfoProject.g:1098:3: (this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SPACE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalInfoProject.g:1099:4: this_SPACE_4= RULE_SPACE this_ID_5= RULE_ID
            	    {
            	    this_SPACE_4=(Token)match(input,RULE_SPACE,FOLLOW_13); 

            	    				newLeafNode(this_SPACE_4, grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_4_0());
            	    			
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    				newLeafNode(this_ID_5, grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // InternalInfoProject.g:1112:1: entryRuleMCS returns [EObject current=null] : iv_ruleMCS= ruleMCS EOF ;
    public final EObject entryRuleMCS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMCS = null;


        try {
            // InternalInfoProject.g:1112:44: (iv_ruleMCS= ruleMCS EOF )
            // InternalInfoProject.g:1113:2: iv_ruleMCS= ruleMCS EOF
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
    // InternalInfoProject.g:1119:1: ruleMCS returns [EObject current=null] : ( () otherlv_1= 'metadataCacheSize: ' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )* ) ;
    public final EObject ruleMCS() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token lv_name_2_4=null;
        Token lv_name_2_5=null;
        Token lv_name_2_6=null;
        Token lv_name_2_7=null;
        Token lv_name_2_8=null;
        Token lv_name_2_9=null;
        Token lv_name_2_10=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1125:2: ( ( () otherlv_1= 'metadataCacheSize: ' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )* ) )
            // InternalInfoProject.g:1126:2: ( () otherlv_1= 'metadataCacheSize: ' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )* )
            {
            // InternalInfoProject.g:1126:2: ( () otherlv_1= 'metadataCacheSize: ' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )* )
            // InternalInfoProject.g:1127:3: () otherlv_1= 'metadataCacheSize: ' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )*
            {
            // InternalInfoProject.g:1127:3: ()
            // InternalInfoProject.g:1128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMCSAccess().getMCSAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_1());
            		
            // InternalInfoProject.g:1138:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_VERSION_NUMBER && LA12_0<=RULE_EXCEPTION)||(LA12_0>=20 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfoProject.g:1139:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) )
            	    {
            	    // InternalInfoProject.g:1139:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER ) )
            	    // InternalInfoProject.g:1140:5: (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER )
            	    {
            	    // InternalInfoProject.g:1140:5: (lv_name_2_1= RULE_ID | lv_name_2_2= '-' | lv_name_2_3= '$' | lv_name_2_4= '{' | lv_name_2_5= '}' | lv_name_2_6= '^' | lv_name_2_7= ':' | lv_name_2_8= '.' | lv_name_2_9= RULE_EXCEPTION | lv_name_2_10= RULE_VERSION_NUMBER )
            	    int alt11=10;
            	    switch ( input.LA(1) ) {
            	    case RULE_ID:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt11=6;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt11=7;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=8;
            	        }
            	        break;
            	    case RULE_EXCEPTION:
            	        {
            	        alt11=9;
            	        }
            	        break;
            	    case RULE_VERSION_NUMBER:
            	        {
            	        alt11=10;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // InternalInfoProject.g:1141:6: lv_name_2_1= RULE_ID
            	            {
            	            lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_1, grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_2_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_1,
            	            							"org.eclipse.xtext.common.Terminals.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalInfoProject.g:1156:6: lv_name_2_2= '-'
            	            {
            	            lv_name_2_2=(Token)match(input,20,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_2, grammarAccess.getMCSAccess().getNameHyphenMinusKeyword_2_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_2, null);
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalInfoProject.g:1167:6: lv_name_2_3= '$'
            	            {
            	            lv_name_2_3=(Token)match(input,21,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_3, grammarAccess.getMCSAccess().getNameDollarSignKeyword_2_0_2());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_3, null);
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalInfoProject.g:1178:6: lv_name_2_4= '{'
            	            {
            	            lv_name_2_4=(Token)match(input,22,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_4, grammarAccess.getMCSAccess().getNameLeftCurlyBracketKeyword_2_0_3());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_4, null);
            	            					

            	            }
            	            break;
            	        case 5 :
            	            // InternalInfoProject.g:1189:6: lv_name_2_5= '}'
            	            {
            	            lv_name_2_5=(Token)match(input,23,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_5, grammarAccess.getMCSAccess().getNameRightCurlyBracketKeyword_2_0_4());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_5, null);
            	            					

            	            }
            	            break;
            	        case 6 :
            	            // InternalInfoProject.g:1200:6: lv_name_2_6= '^'
            	            {
            	            lv_name_2_6=(Token)match(input,24,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_6, grammarAccess.getMCSAccess().getNameCircumflexAccentKeyword_2_0_5());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_6, null);
            	            					

            	            }
            	            break;
            	        case 7 :
            	            // InternalInfoProject.g:1211:6: lv_name_2_7= ':'
            	            {
            	            lv_name_2_7=(Token)match(input,25,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_7, grammarAccess.getMCSAccess().getNameColonKeyword_2_0_6());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_7, null);
            	            					

            	            }
            	            break;
            	        case 8 :
            	            // InternalInfoProject.g:1222:6: lv_name_2_8= '.'
            	            {
            	            lv_name_2_8=(Token)match(input,26,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_8, grammarAccess.getMCSAccess().getNameFullStopKeyword_2_0_7());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(current, "name", lv_name_2_8, null);
            	            					

            	            }
            	            break;
            	        case 9 :
            	            // InternalInfoProject.g:1233:6: lv_name_2_9= RULE_EXCEPTION
            	            {
            	            lv_name_2_9=(Token)match(input,RULE_EXCEPTION,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_9, grammarAccess.getMCSAccess().getNameEXCEPTIONTerminalRuleCall_2_0_8());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_9,
            	            							"ru.spbstu.application.configurator.model.InfoProject.EXCEPTION");
            	            					

            	            }
            	            break;
            	        case 10 :
            	            // InternalInfoProject.g:1248:6: lv_name_2_10= RULE_VERSION_NUMBER
            	            {
            	            lv_name_2_10=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_15); 

            	            						newLeafNode(lv_name_2_10, grammarAccess.getMCSAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_9());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMCSRule());
            	            						}
            	            						setWithLastConsumed(
            	            							current,
            	            							"name",
            	            							lv_name_2_10,
            	            							"ru.spbstu.application.configurator.model.InfoProject.VERSION_NUMBER");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // InternalInfoProject.g:1269:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalInfoProject.g:1269:45: (iv_ruleType= ruleType EOF )
            // InternalInfoProject.g:1270:2: iv_ruleType= ruleType EOF
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
    // InternalInfoProject.g:1276:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'type:' this_SPACE_2= RULE_SPACE ( (lv_value_3_0= ruleenumOfTypes ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SPACE_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:1282:2: ( ( () otherlv_1= 'type:' this_SPACE_2= RULE_SPACE ( (lv_value_3_0= ruleenumOfTypes ) ) ) )
            // InternalInfoProject.g:1283:2: ( () otherlv_1= 'type:' this_SPACE_2= RULE_SPACE ( (lv_value_3_0= ruleenumOfTypes ) ) )
            {
            // InternalInfoProject.g:1283:2: ( () otherlv_1= 'type:' this_SPACE_2= RULE_SPACE ( (lv_value_3_0= ruleenumOfTypes ) ) )
            // InternalInfoProject.g:1284:3: () otherlv_1= 'type:' this_SPACE_2= RULE_SPACE ( (lv_value_3_0= ruleenumOfTypes ) )
            {
            // InternalInfoProject.g:1284:3: ()
            // InternalInfoProject.g:1285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            this_SPACE_2=(Token)match(input,RULE_SPACE,FOLLOW_26); 

            			newLeafNode(this_SPACE_2, grammarAccess.getTypeAccess().getSPACETerminalRuleCall_2());
            		
            // InternalInfoProject.g:1299:3: ( (lv_value_3_0= ruleenumOfTypes ) )
            // InternalInfoProject.g:1300:4: (lv_value_3_0= ruleenumOfTypes )
            {
            // InternalInfoProject.g:1300:4: (lv_value_3_0= ruleenumOfTypes )
            // InternalInfoProject.g:1301:5: lv_value_3_0= ruleenumOfTypes
            {

            					newCompositeNode(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleenumOfTypes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // InternalInfoProject.g:1322:1: entryRuleHoldType returns [EObject current=null] : iv_ruleHoldType= ruleHoldType EOF ;
    public final EObject entryRuleHoldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHoldType = null;


        try {
            // InternalInfoProject.g:1322:49: (iv_ruleHoldType= ruleHoldType EOF )
            // InternalInfoProject.g:1323:2: iv_ruleHoldType= ruleHoldType EOF
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
    // InternalInfoProject.g:1329:1: ruleHoldType returns [EObject current=null] : ( (otherlv_0= 'holdType:' )+ this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) )? ( (lv_features_3_0= ruleTypeAttribute ) ) ) ;
    public final EObject ruleHoldType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        EObject lv_features_2_0 = null;

        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:1335:2: ( ( (otherlv_0= 'holdType:' )+ this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) )? ( (lv_features_3_0= ruleTypeAttribute ) ) ) )
            // InternalInfoProject.g:1336:2: ( (otherlv_0= 'holdType:' )+ this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) )? ( (lv_features_3_0= ruleTypeAttribute ) ) )
            {
            // InternalInfoProject.g:1336:2: ( (otherlv_0= 'holdType:' )+ this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) )? ( (lv_features_3_0= ruleTypeAttribute ) ) )
            // InternalInfoProject.g:1337:3: (otherlv_0= 'holdType:' )+ this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) )? ( (lv_features_3_0= ruleTypeAttribute ) )
            {
            // InternalInfoProject.g:1337:3: (otherlv_0= 'holdType:' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalInfoProject.g:1338:4: otherlv_0= 'holdType:'
            	    {
            	    otherlv_0=(Token)match(input,36,FOLLOW_27); 

            	    				newLeafNode(otherlv_0, grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_28); 

            			newLeafNode(this_WS_1, grammarAccess.getHoldTypeAccess().getWSTerminalRuleCall_1());
            		
            // InternalInfoProject.g:1347:3: ( (lv_features_2_0= ruleFeatureName ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfoProject.g:1348:4: (lv_features_2_0= ruleFeatureName )
                    {
                    // InternalInfoProject.g:1348:4: (lv_features_2_0= ruleFeatureName )
                    // InternalInfoProject.g:1349:5: lv_features_2_0= ruleFeatureName
                    {

                    					newCompositeNode(grammarAccess.getHoldTypeAccess().getFeaturesFeatureNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_features_2_0=ruleFeatureName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHoldTypeRule());
                    					}
                    					add(
                    						current,
                    						"features",
                    						lv_features_2_0,
                    						"ru.spbstu.application.configurator.model.InfoProject.FeatureName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalInfoProject.g:1366:3: ( (lv_features_3_0= ruleTypeAttribute ) )
            // InternalInfoProject.g:1367:4: (lv_features_3_0= ruleTypeAttribute )
            {
            // InternalInfoProject.g:1367:4: (lv_features_3_0= ruleTypeAttribute )
            // InternalInfoProject.g:1368:5: lv_features_3_0= ruleTypeAttribute
            {

            					newCompositeNode(grammarAccess.getHoldTypeAccess().getFeaturesTypeAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_features_3_0=ruleTypeAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHoldTypeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_3_0,
            						"ru.spbstu.application.configurator.model.InfoProject.TypeAttribute");
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


    // $ANTLR start "entryRuleTypeAttribute"
    // InternalInfoProject.g:1389:1: entryRuleTypeAttribute returns [EObject current=null] : iv_ruleTypeAttribute= ruleTypeAttribute EOF ;
    public final EObject entryRuleTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAttribute = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:1391:2: (iv_ruleTypeAttribute= ruleTypeAttribute EOF )
            // InternalInfoProject.g:1392:2: iv_ruleTypeAttribute= ruleTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeAttribute=ruleTypeAttribute();

            state._fsp--;

             current =iv_ruleTypeAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTypeAttribute"


    // $ANTLR start "ruleTypeAttribute"
    // InternalInfoProject.g:1401:1: ruleTypeAttribute returns [EObject current=null] : (otherlv_0= 'type:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:1408:2: ( (otherlv_0= 'type:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:1409:2: (otherlv_0= 'type:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:1409:2: (otherlv_0= 'type:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalInfoProject.g:1410:3: otherlv_0= 'type:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAttributeAccess().getTypeKeyword_0());
            		
            // InternalInfoProject.g:1414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInfoProject.g:1415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInfoProject.g:1415:4: (lv_name_1_0= RULE_ID )
            // InternalInfoProject.g:1416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeAttributeRule());
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTypeAttribute"


    // $ANTLR start "entryRuleInclude"
    // InternalInfoProject.g:1439:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalInfoProject.g:1439:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalInfoProject.g:1440:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalInfoProject.g:1446:1: ruleInclude returns [EObject current=null] : ( () (otherlv_1= 'includes:' )+ this_WS_2= RULE_WS ( (lv_files_3_0= ruleFileDeclaration ) )* ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_WS_2=null;
        AntlrDatatypeRuleToken lv_files_3_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:1452:2: ( ( () (otherlv_1= 'includes:' )+ this_WS_2= RULE_WS ( (lv_files_3_0= ruleFileDeclaration ) )* ) )
            // InternalInfoProject.g:1453:2: ( () (otherlv_1= 'includes:' )+ this_WS_2= RULE_WS ( (lv_files_3_0= ruleFileDeclaration ) )* )
            {
            // InternalInfoProject.g:1453:2: ( () (otherlv_1= 'includes:' )+ this_WS_2= RULE_WS ( (lv_files_3_0= ruleFileDeclaration ) )* )
            // InternalInfoProject.g:1454:3: () (otherlv_1= 'includes:' )+ this_WS_2= RULE_WS ( (lv_files_3_0= ruleFileDeclaration ) )*
            {
            // InternalInfoProject.g:1454:3: ()
            // InternalInfoProject.g:1455:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludeAccess().getIncludeAction_0(),
            					current);
            			

            }

            // InternalInfoProject.g:1461:3: (otherlv_1= 'includes:' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalInfoProject.g:1462:4: otherlv_1= 'includes:'
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getIncludesKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            this_WS_2=(Token)match(input,RULE_WS,FOLLOW_30); 

            			newLeafNode(this_WS_2, grammarAccess.getIncludeAccess().getWSTerminalRuleCall_2());
            		
            // InternalInfoProject.g:1471:3: ( (lv_files_3_0= ruleFileDeclaration ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfoProject.g:1472:4: (lv_files_3_0= ruleFileDeclaration )
            	    {
            	    // InternalInfoProject.g:1472:4: (lv_files_3_0= ruleFileDeclaration )
            	    // InternalInfoProject.g:1473:5: lv_files_3_0= ruleFileDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getIncludeAccess().getFilesFileDeclarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_files_3_0=ruleFileDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIncludeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"files",
            	    						lv_files_3_0,
            	    						"ru.spbstu.application.configurator.model.InfoProject.FileDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleFileDeclaration"
    // InternalInfoProject.g:1494:1: entryRuleFileDeclaration returns [String current=null] : iv_ruleFileDeclaration= ruleFileDeclaration EOF ;
    public final String entryRuleFileDeclaration() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileDeclaration = null;


        try {
            // InternalInfoProject.g:1494:55: (iv_ruleFileDeclaration= ruleFileDeclaration EOF )
            // InternalInfoProject.g:1495:2: iv_ruleFileDeclaration= ruleFileDeclaration EOF
            {
             newCompositeNode(grammarAccess.getFileDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileDeclaration=ruleFileDeclaration();

            state._fsp--;

             current =iv_ruleFileDeclaration.getText(); 
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
    // $ANTLR end "entryRuleFileDeclaration"


    // $ANTLR start "ruleFileDeclaration"
    // InternalInfoProject.g:1501:1: ruleFileDeclaration returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_SPACE_1= RULE_SPACE ) ( (kw= '/' )? kw= '../' )* ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )* ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFileDeclaration() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_SPACE_1=null;
        Token this_ID_4=null;
        Token this_ID_10=null;
        Token this_ID_16=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1507:2: ( ( (kw= '-' this_SPACE_1= RULE_SPACE ) ( (kw= '/' )? kw= '../' )* ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )* ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? ) ) )
            // InternalInfoProject.g:1508:2: ( (kw= '-' this_SPACE_1= RULE_SPACE ) ( (kw= '/' )? kw= '../' )* ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )* ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? ) )
            {
            // InternalInfoProject.g:1508:2: ( (kw= '-' this_SPACE_1= RULE_SPACE ) ( (kw= '/' )? kw= '../' )* ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )* ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? ) )
            // InternalInfoProject.g:1509:3: (kw= '-' this_SPACE_1= RULE_SPACE ) ( (kw= '/' )? kw= '../' )* ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )* ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? )
            {
            // InternalInfoProject.g:1509:3: (kw= '-' this_SPACE_1= RULE_SPACE )
            // InternalInfoProject.g:1510:4: kw= '-' this_SPACE_1= RULE_SPACE
            {
            kw=(Token)match(input,20,FOLLOW_9); 

            				current.merge(kw);
            				newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_0_0());
            			
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_31); 

            				current.merge(this_SPACE_1);
            			

            				newLeafNode(this_SPACE_1, grammarAccess.getFileDeclarationAccess().getSPACETerminalRuleCall_0_1());
            			

            }

            // InternalInfoProject.g:1523:3: ( (kw= '/' )? kw= '../' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==39) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfoProject.g:1524:4: (kw= '/' )? kw= '../'
            	    {
            	    // InternalInfoProject.g:1524:4: (kw= '/' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==38) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalInfoProject.g:1525:5: kw= '/'
            	            {
            	            kw=(Token)match(input,38,FOLLOW_32); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getSolidusKeyword_1_0());
            	            				

            	            }
            	            break;

            	    }

            	    kw=(Token)match(input,39,FOLLOW_31); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getFullStopFullStopSolidusKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalInfoProject.g:1537:3: ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalInfoProject.g:1538:4: (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/'
            	    {
            	    // InternalInfoProject.g:1538:4: (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )*
            	    loop19:
            	    do {
            	        int alt19=6;
            	        switch ( input.LA(1) ) {
            	        case RULE_ID:
            	            {
            	            alt19=1;
            	            }
            	            break;
            	        case 20:
            	            {
            	            alt19=2;
            	            }
            	            break;
            	        case 21:
            	            {
            	            alt19=3;
            	            }
            	            break;
            	        case 22:
            	            {
            	            alt19=4;
            	            }
            	            break;
            	        case 23:
            	            {
            	            alt19=5;
            	            }
            	            break;

            	        }

            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalInfoProject.g:1539:5: this_ID_4= RULE_ID
            	    	    {
            	    	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    	    					current.merge(this_ID_4);
            	    	    				

            	    	    					newLeafNode(this_ID_4, grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_2_0_0());
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalInfoProject.g:1547:5: kw= '-'
            	    	    {
            	    	    kw=(Token)match(input,20,FOLLOW_33); 

            	    	    					current.merge(kw);
            	    	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_2_0_1());
            	    	    				

            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalInfoProject.g:1553:5: kw= '$'
            	    	    {
            	    	    kw=(Token)match(input,21,FOLLOW_33); 

            	    	    					current.merge(kw);
            	    	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_2_0_2());
            	    	    				

            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalInfoProject.g:1559:5: kw= '{'
            	    	    {
            	    	    kw=(Token)match(input,22,FOLLOW_33); 

            	    	    					current.merge(kw);
            	    	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_2_0_3());
            	    	    				

            	    	    }
            	    	    break;
            	    	case 5 :
            	    	    // InternalInfoProject.g:1565:5: kw= '}'
            	    	    {
            	    	    kw=(Token)match(input,23,FOLLOW_33); 

            	    	    					current.merge(kw);
            	    	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_2_0_4());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    kw=(Token)match(input,38,FOLLOW_34); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getSolidusKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalInfoProject.g:1577:3: ( (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )? )
            // InternalInfoProject.g:1578:4: (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* (kw= '.' )? (this_ID_16= RULE_ID )?
            {
            // InternalInfoProject.g:1578:4: (this_ID_10= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )*
            loop21:
            do {
                int alt21=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt21=1;
                    }
                    break;
                case 20:
                    {
                    int LA21_3 = input.LA(2);

                    if ( (LA21_3==EOF||LA21_3==RULE_ID||(LA21_3>=20 && LA21_3<=23)||LA21_3==26) ) {
                        alt21=2;
                    }


                    }
                    break;
                case 21:
                    {
                    alt21=3;
                    }
                    break;
                case 22:
                    {
                    alt21=4;
                    }
                    break;
                case 23:
                    {
                    alt21=5;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalInfoProject.g:1579:5: this_ID_10= RULE_ID
            	    {
            	    this_ID_10=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					current.merge(this_ID_10);
            	    				

            	    					newLeafNode(this_ID_10, grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_0_0());
            	    				

            	    }
            	    break;
            	case 2 :
            	    // InternalInfoProject.g:1587:5: kw= '-'
            	    {
            	    kw=(Token)match(input,20,FOLLOW_35); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_3_0_1());
            	    				

            	    }
            	    break;
            	case 3 :
            	    // InternalInfoProject.g:1593:5: kw= '$'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_35); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_3_0_2());
            	    				

            	    }
            	    break;
            	case 4 :
            	    // InternalInfoProject.g:1599:5: kw= '{'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_35); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_3_0_3());
            	    				

            	    }
            	    break;
            	case 5 :
            	    // InternalInfoProject.g:1605:5: kw= '}'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_35); 

            	    					current.merge(kw);
            	    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_3_0_4());
            	    				

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalInfoProject.g:1611:4: (kw= '.' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalInfoProject.g:1612:5: kw= '.'
                    {
                    kw=(Token)match(input,26,FOLLOW_23); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getFileDeclarationAccess().getFullStopKeyword_3_1());
                    				

                    }
                    break;

            }

            // InternalInfoProject.g:1618:4: (this_ID_16= RULE_ID )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalInfoProject.g:1619:5: this_ID_16= RULE_ID
                    {
                    this_ID_16=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					current.merge(this_ID_16);
                    				

                    					newLeafNode(this_ID_16, grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_2());
                    				

                    }
                    break;

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
    // $ANTLR end "ruleFileDeclaration"


    // $ANTLR start "entryRuleIngestNode"
    // InternalInfoProject.g:1632:1: entryRuleIngestNode returns [EObject current=null] : iv_ruleIngestNode= ruleIngestNode EOF ;
    public final EObject entryRuleIngestNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngestNode = null;


        try {
            // InternalInfoProject.g:1632:51: (iv_ruleIngestNode= ruleIngestNode EOF )
            // InternalInfoProject.g:1633:2: iv_ruleIngestNode= ruleIngestNode EOF
            {
             newCompositeNode(grammarAccess.getIngestNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngestNode=ruleIngestNode();

            state._fsp--;

             current =iv_ruleIngestNode; 
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
    // $ANTLR end "entryRuleIngestNode"


    // $ANTLR start "ruleIngestNode"
    // InternalInfoProject.g:1639:1: ruleIngestNode returns [EObject current=null] : (otherlv_0= 'ingestNode:' this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) ) ( (lv_features_3_0= ruleEnumCOD ) ) ( (lv_features_4_0= ruleEnumMR ) ) ( (lv_features_5_0= ruleLogLevel ) ) ) ;
    public final EObject ruleIngestNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_WS_1=null;
        EObject lv_features_2_0 = null;

        EObject lv_features_3_0 = null;

        EObject lv_features_4_0 = null;

        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalInfoProject.g:1645:2: ( (otherlv_0= 'ingestNode:' this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) ) ( (lv_features_3_0= ruleEnumCOD ) ) ( (lv_features_4_0= ruleEnumMR ) ) ( (lv_features_5_0= ruleLogLevel ) ) ) )
            // InternalInfoProject.g:1646:2: (otherlv_0= 'ingestNode:' this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) ) ( (lv_features_3_0= ruleEnumCOD ) ) ( (lv_features_4_0= ruleEnumMR ) ) ( (lv_features_5_0= ruleLogLevel ) ) )
            {
            // InternalInfoProject.g:1646:2: (otherlv_0= 'ingestNode:' this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) ) ( (lv_features_3_0= ruleEnumCOD ) ) ( (lv_features_4_0= ruleEnumMR ) ) ( (lv_features_5_0= ruleLogLevel ) ) )
            // InternalInfoProject.g:1647:3: otherlv_0= 'ingestNode:' this_WS_1= RULE_WS ( (lv_features_2_0= ruleFeatureName ) ) ( (lv_features_3_0= ruleEnumCOD ) ) ( (lv_features_4_0= ruleEnumMR ) ) ( (lv_features_5_0= ruleLogLevel ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getIngestNodeAccess().getIngestNodeKeyword_0());
            		
            this_WS_1=(Token)match(input,RULE_WS,FOLLOW_16); 

            			newLeafNode(this_WS_1, grammarAccess.getIngestNodeAccess().getWSTerminalRuleCall_1());
            		
            // InternalInfoProject.g:1655:3: ( (lv_features_2_0= ruleFeatureName ) )
            // InternalInfoProject.g:1656:4: (lv_features_2_0= ruleFeatureName )
            {
            // InternalInfoProject.g:1656:4: (lv_features_2_0= ruleFeatureName )
            // InternalInfoProject.g:1657:5: lv_features_2_0= ruleFeatureName
            {

            					newCompositeNode(grammarAccess.getIngestNodeAccess().getFeaturesFeatureNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_features_2_0=ruleFeatureName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestNodeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_2_0,
            						"ru.spbstu.application.configurator.model.InfoProject.FeatureName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:1674:3: ( (lv_features_3_0= ruleEnumCOD ) )
            // InternalInfoProject.g:1675:4: (lv_features_3_0= ruleEnumCOD )
            {
            // InternalInfoProject.g:1675:4: (lv_features_3_0= ruleEnumCOD )
            // InternalInfoProject.g:1676:5: lv_features_3_0= ruleEnumCOD
            {

            					newCompositeNode(grammarAccess.getIngestNodeAccess().getFeaturesEnumCODParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_38);
            lv_features_3_0=ruleEnumCOD();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestNodeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_3_0,
            						"ru.spbstu.application.configurator.model.InfoProject.EnumCOD");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:1693:3: ( (lv_features_4_0= ruleEnumMR ) )
            // InternalInfoProject.g:1694:4: (lv_features_4_0= ruleEnumMR )
            {
            // InternalInfoProject.g:1694:4: (lv_features_4_0= ruleEnumMR )
            // InternalInfoProject.g:1695:5: lv_features_4_0= ruleEnumMR
            {

            					newCompositeNode(grammarAccess.getIngestNodeAccess().getFeaturesEnumMRParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
            lv_features_4_0=ruleEnumMR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestNodeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_4_0,
            						"ru.spbstu.application.configurator.model.InfoProject.EnumMR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInfoProject.g:1712:3: ( (lv_features_5_0= ruleLogLevel ) )
            // InternalInfoProject.g:1713:4: (lv_features_5_0= ruleLogLevel )
            {
            // InternalInfoProject.g:1713:4: (lv_features_5_0= ruleLogLevel )
            // InternalInfoProject.g:1714:5: lv_features_5_0= ruleLogLevel
            {

            					newCompositeNode(grammarAccess.getIngestNodeAccess().getFeaturesLogLevelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_features_5_0=ruleLogLevel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIngestNodeRule());
            					}
            					add(
            						current,
            						"features",
            						lv_features_5_0,
            						"ru.spbstu.application.configurator.model.InfoProject.LogLevel");
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
    // $ANTLR end "ruleIngestNode"


    // $ANTLR start "entryRuleEnumCOD"
    // InternalInfoProject.g:1735:1: entryRuleEnumCOD returns [EObject current=null] : iv_ruleEnumCOD= ruleEnumCOD EOF ;
    public final EObject entryRuleEnumCOD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumCOD = null;


        try {
            // InternalInfoProject.g:1735:48: (iv_ruleEnumCOD= ruleEnumCOD EOF )
            // InternalInfoProject.g:1736:2: iv_ruleEnumCOD= ruleEnumCOD EOF
            {
             newCompositeNode(grammarAccess.getEnumCODRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumCOD=ruleEnumCOD();

            state._fsp--;

             current =iv_ruleEnumCOD; 
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
    // $ANTLR end "entryRuleEnumCOD"


    // $ANTLR start "ruleEnumCOD"
    // InternalInfoProject.g:1742:1: ruleEnumCOD returns [EObject current=null] : (otherlv_0= 'enumerationCutoffDays:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) ) ;
    public final EObject ruleEnumCOD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1748:2: ( (otherlv_0= 'enumerationCutoffDays:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) ) )
            // InternalInfoProject.g:1749:2: (otherlv_0= 'enumerationCutoffDays:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) )
            {
            // InternalInfoProject.g:1749:2: (otherlv_0= 'enumerationCutoffDays:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) ) )
            // InternalInfoProject.g:1750:3: otherlv_0= 'enumerationCutoffDays:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_VERSION_NUMBER ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumCODAccess().getEnumerationCutoffDaysKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_10); 

            			newLeafNode(this_SPACE_1, grammarAccess.getEnumCODAccess().getSPACETerminalRuleCall_1());
            		
            // InternalInfoProject.g:1758:3: ( (lv_name_2_0= RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:1759:4: (lv_name_2_0= RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:1759:4: (lv_name_2_0= RULE_VERSION_NUMBER )
            // InternalInfoProject.g:1760:5: lv_name_2_0= RULE_VERSION_NUMBER
            {
            lv_name_2_0=(Token)match(input,RULE_VERSION_NUMBER,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumCODAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumCODRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleEnumCOD"


    // $ANTLR start "entryRuleEnumMR"
    // InternalInfoProject.g:1780:1: entryRuleEnumMR returns [EObject current=null] : iv_ruleEnumMR= ruleEnumMR EOF ;
    public final EObject entryRuleEnumMR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMR = null;


        try {
            // InternalInfoProject.g:1780:47: (iv_ruleEnumMR= ruleEnumMR EOF )
            // InternalInfoProject.g:1781:2: iv_ruleEnumMR= ruleEnumMR EOF
            {
             newCompositeNode(grammarAccess.getEnumMRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumMR=ruleEnumMR();

            state._fsp--;

             current =iv_ruleEnumMR; 
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
    // $ANTLR end "entryRuleEnumMR"


    // $ANTLR start "ruleEnumMR"
    // InternalInfoProject.g:1787:1: ruleEnumMR returns [EObject current=null] : (otherlv_0= 'enumerationMinusRunning:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumMR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1793:2: ( (otherlv_0= 'enumerationMinusRunning:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:1794:2: (otherlv_0= 'enumerationMinusRunning:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:1794:2: (otherlv_0= 'enumerationMinusRunning:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) )
            // InternalInfoProject.g:1795:3: otherlv_0= 'enumerationMinusRunning:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumMRAccess().getEnumerationMinusRunningKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); 

            			newLeafNode(this_SPACE_1, grammarAccess.getEnumMRAccess().getSPACETerminalRuleCall_1());
            		
            // InternalInfoProject.g:1803:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInfoProject.g:1804:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInfoProject.g:1804:4: (lv_name_2_0= RULE_ID )
            // InternalInfoProject.g:1805:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumMRAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumMRRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleEnumMR"


    // $ANTLR start "entryRuleLogLevel"
    // InternalInfoProject.g:1825:1: entryRuleLogLevel returns [EObject current=null] : iv_ruleLogLevel= ruleLogLevel EOF ;
    public final EObject entryRuleLogLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogLevel = null;


        try {
            // InternalInfoProject.g:1825:49: (iv_ruleLogLevel= ruleLogLevel EOF )
            // InternalInfoProject.g:1826:2: iv_ruleLogLevel= ruleLogLevel EOF
            {
             newCompositeNode(grammarAccess.getLogLevelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogLevel=ruleLogLevel();

            state._fsp--;

             current =iv_ruleLogLevel; 
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
    // $ANTLR end "entryRuleLogLevel"


    // $ANTLR start "ruleLogLevel"
    // InternalInfoProject.g:1832:1: ruleLogLevel returns [EObject current=null] : (otherlv_0= 'logLevel:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleLogLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1838:2: ( (otherlv_0= 'logLevel:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalInfoProject.g:1839:2: (otherlv_0= 'logLevel:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalInfoProject.g:1839:2: (otherlv_0= 'logLevel:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) )
            // InternalInfoProject.g:1840:3: otherlv_0= 'logLevel:' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getLogLevelAccess().getLogLevelKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_13); 

            			newLeafNode(this_SPACE_1, grammarAccess.getLogLevelAccess().getSPACETerminalRuleCall_1());
            		
            // InternalInfoProject.g:1848:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalInfoProject.g:1849:4: (lv_name_2_0= RULE_ID )
            {
            // InternalInfoProject.g:1849:4: (lv_name_2_0= RULE_ID )
            // InternalInfoProject.g:1850:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLogLevelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogLevelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "ruleenumOfArchiveType"
    // InternalInfoProject.g:1870:1: ruleenumOfArchiveType returns [Enumerator current=null] : ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) ) ;
    public final Enumerator ruleenumOfArchiveType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1876:2: ( ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) ) )
            // InternalInfoProject.g:1877:2: ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) )
            {
            // InternalInfoProject.g:1877:2: ( (enumLiteral_0= 'sip' ) | (enumLiteral_1= 'table' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            else if ( (LA24_0==45) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalInfoProject.g:1878:3: (enumLiteral_0= 'sip' )
                    {
                    // InternalInfoProject.g:1878:3: (enumLiteral_0= 'sip' )
                    // InternalInfoProject.g:1879:4: enumLiteral_0= 'sip'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:1886:3: (enumLiteral_1= 'table' )
                    {
                    // InternalInfoProject.g:1886:3: (enumLiteral_1= 'table' )
                    // InternalInfoProject.g:1887:4: enumLiteral_1= 'table'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalInfoProject.g:1897:1: ruleenumOfTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) ) ;
    public final Enumerator ruleenumOfTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalInfoProject.g:1903:2: ( ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) ) )
            // InternalInfoProject.g:1904:2: ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) )
            {
            // InternalInfoProject.g:1904:2: ( (enumLiteral_0= 'active archiving' ) | (enumLiteral_1= 'app decomm' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            else if ( (LA25_0==47) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalInfoProject.g:1905:3: (enumLiteral_0= 'active archiving' )
                    {
                    // InternalInfoProject.g:1905:3: (enumLiteral_0= 'active archiving' )
                    // InternalInfoProject.g:1906:4: enumLiteral_0= 'active archiving'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:1913:3: (enumLiteral_1= 'app decomm' )
                    {
                    // InternalInfoProject.g:1913:3: (enumLiteral_1= 'app decomm' )
                    // InternalInfoProject.g:1914:4: enumLiteral_1= 'app decomm'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\6\6\2\uffff";
    static final String dfa_3s = "\2\6\1\4\3\6\2\uffff";
    static final String dfa_4s = "\6\46\2\uffff";
    static final String dfa_5s = "\6\uffff\1\2\1\1";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "\1\6\1\uffff\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "\1\1\15\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\13\uffff\1\7",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1537:3: ( (this_ID_4= RULE_ID | kw= '-' | kw= '$' | kw= '{' | kw= '}' )* kw= '/' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007F00062L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007F000E2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000700000160L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000052L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000162L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001000000200L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000808000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000200L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C004F00042L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000F00040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004004F00042L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000004F00042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});

}