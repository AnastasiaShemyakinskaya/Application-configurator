package ru.spbstu.application.configurator.model.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ru.spbstu.application.configurator.model.services.InfoProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInfoProjectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION_NUMBER", "RULE_EXCEPTION", "RULE_ADDITION", "RULE_SPACE", "RULE_WS", "RULE_ML_COMMENT", "RULE_MY_INT", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'-'", "'$'", "'{'", "'}'", "'^'", "':'", "'.'", "'sip'", "'table'", "'active archiving'", "'app decomm'", "'version:'", "'namespace:'", "'prefix: '", "'uri:'", "'name:'", "'application:'", "'tenant:'", "'hold:'", "'archiveType: '", "'category:'", "'description:'", "'metadataCacheSize: '", "'type:'", "'holdType:'", "'includes:'", "'/'", "'../'", "'ingestNode:'", "'enumerationCutoffDays:'", "'enumerationMinusRunning:'", "'logLevel:'"
    };
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=8;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int RULE_EXCEPTION=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_VERSION_NUMBER=5;
    public static final int RULE_STRING=13;
    public static final int RULE_ADDITION=7;
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

    	public void setGrammarAccess(InfoProjectGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalInfoProject.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalInfoProject.g:57:1: ( ruleModel EOF )
            // InternalInfoProject.g:58:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInfoProject.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalInfoProject.g:74:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalInfoProject.g:74:2: ( ( rule__Model__Group__0 ) )
            // InternalInfoProject.g:75:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalInfoProject.g:76:3: ( rule__Model__Group__0 )
            // InternalInfoProject.g:76:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVersion"
    // InternalInfoProject.g:86:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalInfoProject.g:87:1: ( ruleVersion EOF )
            // InternalInfoProject.g:88:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalInfoProject.g:95:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:99:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalInfoProject.g:100:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalInfoProject.g:100:2: ( ( rule__Version__Group__0 ) )
            // InternalInfoProject.g:101:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalInfoProject.g:102:3: ( rule__Version__Group__0 )
            // InternalInfoProject.g:102:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleNamespace"
    // InternalInfoProject.g:111:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalInfoProject.g:112:1: ( ruleNamespace EOF )
            // InternalInfoProject.g:113:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalInfoProject.g:120:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:124:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // InternalInfoProject.g:125:2: ( ( rule__Namespace__Group__0 ) )
            {
            // InternalInfoProject.g:125:2: ( ( rule__Namespace__Group__0 ) )
            // InternalInfoProject.g:126:3: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // InternalInfoProject.g:127:3: ( rule__Namespace__Group__0 )
            // InternalInfoProject.g:127:4: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRulePrefix"
    // InternalInfoProject.g:136:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalInfoProject.g:137:1: ( rulePrefix EOF )
            // InternalInfoProject.g:138:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalInfoProject.g:145:1: rulePrefix : ( ( rule__Prefix__Group__0 ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:149:2: ( ( ( rule__Prefix__Group__0 ) ) )
            // InternalInfoProject.g:150:2: ( ( rule__Prefix__Group__0 ) )
            {
            // InternalInfoProject.g:150:2: ( ( rule__Prefix__Group__0 ) )
            // InternalInfoProject.g:151:3: ( rule__Prefix__Group__0 )
            {
             before(grammarAccess.getPrefixAccess().getGroup()); 
            // InternalInfoProject.g:152:3: ( rule__Prefix__Group__0 )
            // InternalInfoProject.g:152:4: rule__Prefix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // InternalInfoProject.g:161:1: entryRuleUri : ruleUri EOF ;
    public final void entryRuleUri() throws RecognitionException {
        try {
            // InternalInfoProject.g:162:1: ( ruleUri EOF )
            // InternalInfoProject.g:163:1: ruleUri EOF
            {
             before(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_1);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getUriRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // InternalInfoProject.g:170:1: ruleUri : ( ( rule__Uri__Group__0 ) ) ;
    public final void ruleUri() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:174:2: ( ( ( rule__Uri__Group__0 ) ) )
            // InternalInfoProject.g:175:2: ( ( rule__Uri__Group__0 ) )
            {
            // InternalInfoProject.g:175:2: ( ( rule__Uri__Group__0 ) )
            // InternalInfoProject.g:176:3: ( rule__Uri__Group__0 )
            {
             before(grammarAccess.getUriAccess().getGroup()); 
            // InternalInfoProject.g:177:3: ( rule__Uri__Group__0 )
            // InternalInfoProject.g:177:4: rule__Uri__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Uri__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUriAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleFeatureName"
    // InternalInfoProject.g:186:1: entryRuleFeatureName : ruleFeatureName EOF ;
    public final void entryRuleFeatureName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:190:1: ( ruleFeatureName EOF )
            // InternalInfoProject.g:191:1: ruleFeatureName EOF
            {
             before(grammarAccess.getFeatureNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getFeatureNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureName"


    // $ANTLR start "ruleFeatureName"
    // InternalInfoProject.g:201:1: ruleFeatureName : ( ( rule__FeatureName__Group__0 ) ) ;
    public final void ruleFeatureName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:206:2: ( ( ( rule__FeatureName__Group__0 ) ) )
            // InternalInfoProject.g:207:2: ( ( rule__FeatureName__Group__0 ) )
            {
            // InternalInfoProject.g:207:2: ( ( rule__FeatureName__Group__0 ) )
            // InternalInfoProject.g:208:3: ( rule__FeatureName__Group__0 )
            {
             before(grammarAccess.getFeatureNameAccess().getGroup()); 
            // InternalInfoProject.g:209:3: ( rule__FeatureName__Group__0 )
            // InternalInfoProject.g:209:4: rule__FeatureName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleFeatureName"


    // $ANTLR start "entryRuleApplication"
    // InternalInfoProject.g:219:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalInfoProject.g:220:1: ( ruleApplication EOF )
            // InternalInfoProject.g:221:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalInfoProject.g:228:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:232:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalInfoProject.g:233:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalInfoProject.g:233:2: ( ( rule__Application__Group__0 ) )
            // InternalInfoProject.g:234:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalInfoProject.g:235:3: ( rule__Application__Group__0 )
            // InternalInfoProject.g:235:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleTenant"
    // InternalInfoProject.g:244:1: entryRuleTenant : ruleTenant EOF ;
    public final void entryRuleTenant() throws RecognitionException {
        try {
            // InternalInfoProject.g:245:1: ( ruleTenant EOF )
            // InternalInfoProject.g:246:1: ruleTenant EOF
            {
             before(grammarAccess.getTenantRule()); 
            pushFollow(FOLLOW_1);
            ruleTenant();

            state._fsp--;

             after(grammarAccess.getTenantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTenant"


    // $ANTLR start "ruleTenant"
    // InternalInfoProject.g:253:1: ruleTenant : ( ( rule__Tenant__Group__0 ) ) ;
    public final void ruleTenant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:257:2: ( ( ( rule__Tenant__Group__0 ) ) )
            // InternalInfoProject.g:258:2: ( ( rule__Tenant__Group__0 ) )
            {
            // InternalInfoProject.g:258:2: ( ( rule__Tenant__Group__0 ) )
            // InternalInfoProject.g:259:3: ( rule__Tenant__Group__0 )
            {
             before(grammarAccess.getTenantAccess().getGroup()); 
            // InternalInfoProject.g:260:3: ( rule__Tenant__Group__0 )
            // InternalInfoProject.g:260:4: rule__Tenant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tenant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTenantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTenant"


    // $ANTLR start "entryRuleHold"
    // InternalInfoProject.g:269:1: entryRuleHold : ruleHold EOF ;
    public final void entryRuleHold() throws RecognitionException {
        try {
            // InternalInfoProject.g:270:1: ( ruleHold EOF )
            // InternalInfoProject.g:271:1: ruleHold EOF
            {
             before(grammarAccess.getHoldRule()); 
            pushFollow(FOLLOW_1);
            ruleHold();

            state._fsp--;

             after(grammarAccess.getHoldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHold"


    // $ANTLR start "ruleHold"
    // InternalInfoProject.g:278:1: ruleHold : ( ( rule__Hold__Group__0 ) ) ;
    public final void ruleHold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:282:2: ( ( ( rule__Hold__Group__0 ) ) )
            // InternalInfoProject.g:283:2: ( ( rule__Hold__Group__0 ) )
            {
            // InternalInfoProject.g:283:2: ( ( rule__Hold__Group__0 ) )
            // InternalInfoProject.g:284:3: ( rule__Hold__Group__0 )
            {
             before(grammarAccess.getHoldAccess().getGroup()); 
            // InternalInfoProject.g:285:3: ( rule__Hold__Group__0 )
            // InternalInfoProject.g:285:4: rule__Hold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hold__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHold"


    // $ANTLR start "entryRuleArchiveType"
    // InternalInfoProject.g:294:1: entryRuleArchiveType : ruleArchiveType EOF ;
    public final void entryRuleArchiveType() throws RecognitionException {
        try {
            // InternalInfoProject.g:295:1: ( ruleArchiveType EOF )
            // InternalInfoProject.g:296:1: ruleArchiveType EOF
            {
             before(grammarAccess.getArchiveTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArchiveType();

            state._fsp--;

             after(grammarAccess.getArchiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchiveType"


    // $ANTLR start "ruleArchiveType"
    // InternalInfoProject.g:303:1: ruleArchiveType : ( ( rule__ArchiveType__Group__0 ) ) ;
    public final void ruleArchiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:307:2: ( ( ( rule__ArchiveType__Group__0 ) ) )
            // InternalInfoProject.g:308:2: ( ( rule__ArchiveType__Group__0 ) )
            {
            // InternalInfoProject.g:308:2: ( ( rule__ArchiveType__Group__0 ) )
            // InternalInfoProject.g:309:3: ( rule__ArchiveType__Group__0 )
            {
             before(grammarAccess.getArchiveTypeAccess().getGroup()); 
            // InternalInfoProject.g:310:3: ( rule__ArchiveType__Group__0 )
            // InternalInfoProject.g:310:4: rule__ArchiveType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchiveType"


    // $ANTLR start "entryRuleCategory"
    // InternalInfoProject.g:319:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalInfoProject.g:320:1: ( ruleCategory EOF )
            // InternalInfoProject.g:321:1: ruleCategory EOF
            {
             before(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getCategoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalInfoProject.g:328:1: ruleCategory : ( ( rule__Category__Alternatives ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:332:2: ( ( ( rule__Category__Alternatives ) ) )
            // InternalInfoProject.g:333:2: ( ( rule__Category__Alternatives ) )
            {
            // InternalInfoProject.g:333:2: ( ( rule__Category__Alternatives ) )
            // InternalInfoProject.g:334:3: ( rule__Category__Alternatives )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives()); 
            // InternalInfoProject.g:335:3: ( rule__Category__Alternatives )
            // InternalInfoProject.g:335:4: rule__Category__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Category__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleDescription"
    // InternalInfoProject.g:344:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalInfoProject.g:345:1: ( ruleDescription EOF )
            // InternalInfoProject.g:346:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalInfoProject.g:353:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:357:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalInfoProject.g:358:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalInfoProject.g:358:2: ( ( rule__Description__Group__0 ) )
            // InternalInfoProject.g:359:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalInfoProject.g:360:3: ( rule__Description__Group__0 )
            // InternalInfoProject.g:360:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleMCS"
    // InternalInfoProject.g:369:1: entryRuleMCS : ruleMCS EOF ;
    public final void entryRuleMCS() throws RecognitionException {
        try {
            // InternalInfoProject.g:370:1: ( ruleMCS EOF )
            // InternalInfoProject.g:371:1: ruleMCS EOF
            {
             before(grammarAccess.getMCSRule()); 
            pushFollow(FOLLOW_1);
            ruleMCS();

            state._fsp--;

             after(grammarAccess.getMCSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMCS"


    // $ANTLR start "ruleMCS"
    // InternalInfoProject.g:378:1: ruleMCS : ( ( rule__MCS__Group__0 ) ) ;
    public final void ruleMCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:382:2: ( ( ( rule__MCS__Group__0 ) ) )
            // InternalInfoProject.g:383:2: ( ( rule__MCS__Group__0 ) )
            {
            // InternalInfoProject.g:383:2: ( ( rule__MCS__Group__0 ) )
            // InternalInfoProject.g:384:3: ( rule__MCS__Group__0 )
            {
             before(grammarAccess.getMCSAccess().getGroup()); 
            // InternalInfoProject.g:385:3: ( rule__MCS__Group__0 )
            // InternalInfoProject.g:385:4: rule__MCS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MCS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMCSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMCS"


    // $ANTLR start "entryRuleType"
    // InternalInfoProject.g:394:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalInfoProject.g:395:1: ( ruleType EOF )
            // InternalInfoProject.g:396:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalInfoProject.g:403:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:407:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalInfoProject.g:408:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalInfoProject.g:408:2: ( ( rule__Type__Group__0 ) )
            // InternalInfoProject.g:409:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalInfoProject.g:410:3: ( rule__Type__Group__0 )
            // InternalInfoProject.g:410:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleHoldType"
    // InternalInfoProject.g:419:1: entryRuleHoldType : ruleHoldType EOF ;
    public final void entryRuleHoldType() throws RecognitionException {
        try {
            // InternalInfoProject.g:420:1: ( ruleHoldType EOF )
            // InternalInfoProject.g:421:1: ruleHoldType EOF
            {
             before(grammarAccess.getHoldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleHoldType();

            state._fsp--;

             after(grammarAccess.getHoldTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHoldType"


    // $ANTLR start "ruleHoldType"
    // InternalInfoProject.g:428:1: ruleHoldType : ( ( rule__HoldType__Group__0 ) ) ;
    public final void ruleHoldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:432:2: ( ( ( rule__HoldType__Group__0 ) ) )
            // InternalInfoProject.g:433:2: ( ( rule__HoldType__Group__0 ) )
            {
            // InternalInfoProject.g:433:2: ( ( rule__HoldType__Group__0 ) )
            // InternalInfoProject.g:434:3: ( rule__HoldType__Group__0 )
            {
             before(grammarAccess.getHoldTypeAccess().getGroup()); 
            // InternalInfoProject.g:435:3: ( rule__HoldType__Group__0 )
            // InternalInfoProject.g:435:4: rule__HoldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HoldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoldTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHoldType"


    // $ANTLR start "entryRuleTypeAttribute"
    // InternalInfoProject.g:444:1: entryRuleTypeAttribute : ruleTypeAttribute EOF ;
    public final void entryRuleTypeAttribute() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");

        try {
            // InternalInfoProject.g:448:1: ( ruleTypeAttribute EOF )
            // InternalInfoProject.g:449:1: ruleTypeAttribute EOF
            {
             before(grammarAccess.getTypeAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeAttribute();

            state._fsp--;

             after(grammarAccess.getTypeAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleTypeAttribute"


    // $ANTLR start "ruleTypeAttribute"
    // InternalInfoProject.g:459:1: ruleTypeAttribute : ( ( rule__TypeAttribute__Group__0 ) ) ;
    public final void ruleTypeAttribute() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SPACE");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:464:2: ( ( ( rule__TypeAttribute__Group__0 ) ) )
            // InternalInfoProject.g:465:2: ( ( rule__TypeAttribute__Group__0 ) )
            {
            // InternalInfoProject.g:465:2: ( ( rule__TypeAttribute__Group__0 ) )
            // InternalInfoProject.g:466:3: ( rule__TypeAttribute__Group__0 )
            {
             before(grammarAccess.getTypeAttributeAccess().getGroup()); 
            // InternalInfoProject.g:467:3: ( rule__TypeAttribute__Group__0 )
            // InternalInfoProject.g:467:4: rule__TypeAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleTypeAttribute"


    // $ANTLR start "entryRuleInclude"
    // InternalInfoProject.g:477:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // InternalInfoProject.g:478:1: ( ruleInclude EOF )
            // InternalInfoProject.g:479:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalInfoProject.g:486:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:490:2: ( ( ( rule__Include__Group__0 ) ) )
            // InternalInfoProject.g:491:2: ( ( rule__Include__Group__0 ) )
            {
            // InternalInfoProject.g:491:2: ( ( rule__Include__Group__0 ) )
            // InternalInfoProject.g:492:3: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // InternalInfoProject.g:493:3: ( rule__Include__Group__0 )
            // InternalInfoProject.g:493:4: rule__Include__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleFileDeclaration"
    // InternalInfoProject.g:502:1: entryRuleFileDeclaration : ruleFileDeclaration EOF ;
    public final void entryRuleFileDeclaration() throws RecognitionException {
        try {
            // InternalInfoProject.g:503:1: ( ruleFileDeclaration EOF )
            // InternalInfoProject.g:504:1: ruleFileDeclaration EOF
            {
             before(grammarAccess.getFileDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleFileDeclaration();

            state._fsp--;

             after(grammarAccess.getFileDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileDeclaration"


    // $ANTLR start "ruleFileDeclaration"
    // InternalInfoProject.g:511:1: ruleFileDeclaration : ( ( rule__FileDeclaration__Group__0 ) ) ;
    public final void ruleFileDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:515:2: ( ( ( rule__FileDeclaration__Group__0 ) ) )
            // InternalInfoProject.g:516:2: ( ( rule__FileDeclaration__Group__0 ) )
            {
            // InternalInfoProject.g:516:2: ( ( rule__FileDeclaration__Group__0 ) )
            // InternalInfoProject.g:517:3: ( rule__FileDeclaration__Group__0 )
            {
             before(grammarAccess.getFileDeclarationAccess().getGroup()); 
            // InternalInfoProject.g:518:3: ( rule__FileDeclaration__Group__0 )
            // InternalInfoProject.g:518:4: rule__FileDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileDeclaration"


    // $ANTLR start "entryRuleIngestNode"
    // InternalInfoProject.g:527:1: entryRuleIngestNode : ruleIngestNode EOF ;
    public final void entryRuleIngestNode() throws RecognitionException {
        try {
            // InternalInfoProject.g:528:1: ( ruleIngestNode EOF )
            // InternalInfoProject.g:529:1: ruleIngestNode EOF
            {
             before(grammarAccess.getIngestNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleIngestNode();

            state._fsp--;

             after(grammarAccess.getIngestNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngestNode"


    // $ANTLR start "ruleIngestNode"
    // InternalInfoProject.g:536:1: ruleIngestNode : ( ( rule__IngestNode__Group__0 ) ) ;
    public final void ruleIngestNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:540:2: ( ( ( rule__IngestNode__Group__0 ) ) )
            // InternalInfoProject.g:541:2: ( ( rule__IngestNode__Group__0 ) )
            {
            // InternalInfoProject.g:541:2: ( ( rule__IngestNode__Group__0 ) )
            // InternalInfoProject.g:542:3: ( rule__IngestNode__Group__0 )
            {
             before(grammarAccess.getIngestNodeAccess().getGroup()); 
            // InternalInfoProject.g:543:3: ( rule__IngestNode__Group__0 )
            // InternalInfoProject.g:543:4: rule__IngestNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngestNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngestNode"


    // $ANTLR start "entryRuleEnumCOD"
    // InternalInfoProject.g:552:1: entryRuleEnumCOD : ruleEnumCOD EOF ;
    public final void entryRuleEnumCOD() throws RecognitionException {
        try {
            // InternalInfoProject.g:553:1: ( ruleEnumCOD EOF )
            // InternalInfoProject.g:554:1: ruleEnumCOD EOF
            {
             before(grammarAccess.getEnumCODRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumCOD();

            state._fsp--;

             after(grammarAccess.getEnumCODRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumCOD"


    // $ANTLR start "ruleEnumCOD"
    // InternalInfoProject.g:561:1: ruleEnumCOD : ( ( rule__EnumCOD__Group__0 ) ) ;
    public final void ruleEnumCOD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:565:2: ( ( ( rule__EnumCOD__Group__0 ) ) )
            // InternalInfoProject.g:566:2: ( ( rule__EnumCOD__Group__0 ) )
            {
            // InternalInfoProject.g:566:2: ( ( rule__EnumCOD__Group__0 ) )
            // InternalInfoProject.g:567:3: ( rule__EnumCOD__Group__0 )
            {
             before(grammarAccess.getEnumCODAccess().getGroup()); 
            // InternalInfoProject.g:568:3: ( rule__EnumCOD__Group__0 )
            // InternalInfoProject.g:568:4: rule__EnumCOD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumCOD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumCODAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumCOD"


    // $ANTLR start "entryRuleEnumMR"
    // InternalInfoProject.g:577:1: entryRuleEnumMR : ruleEnumMR EOF ;
    public final void entryRuleEnumMR() throws RecognitionException {
        try {
            // InternalInfoProject.g:578:1: ( ruleEnumMR EOF )
            // InternalInfoProject.g:579:1: ruleEnumMR EOF
            {
             before(grammarAccess.getEnumMRRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumMR();

            state._fsp--;

             after(grammarAccess.getEnumMRRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumMR"


    // $ANTLR start "ruleEnumMR"
    // InternalInfoProject.g:586:1: ruleEnumMR : ( ( rule__EnumMR__Group__0 ) ) ;
    public final void ruleEnumMR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:590:2: ( ( ( rule__EnumMR__Group__0 ) ) )
            // InternalInfoProject.g:591:2: ( ( rule__EnumMR__Group__0 ) )
            {
            // InternalInfoProject.g:591:2: ( ( rule__EnumMR__Group__0 ) )
            // InternalInfoProject.g:592:3: ( rule__EnumMR__Group__0 )
            {
             before(grammarAccess.getEnumMRAccess().getGroup()); 
            // InternalInfoProject.g:593:3: ( rule__EnumMR__Group__0 )
            // InternalInfoProject.g:593:4: rule__EnumMR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumMR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumMRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumMR"


    // $ANTLR start "entryRuleLogLevel"
    // InternalInfoProject.g:602:1: entryRuleLogLevel : ruleLogLevel EOF ;
    public final void entryRuleLogLevel() throws RecognitionException {
        try {
            // InternalInfoProject.g:603:1: ( ruleLogLevel EOF )
            // InternalInfoProject.g:604:1: ruleLogLevel EOF
            {
             before(grammarAccess.getLogLevelRule()); 
            pushFollow(FOLLOW_1);
            ruleLogLevel();

            state._fsp--;

             after(grammarAccess.getLogLevelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogLevel"


    // $ANTLR start "ruleLogLevel"
    // InternalInfoProject.g:611:1: ruleLogLevel : ( ( rule__LogLevel__Group__0 ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:615:2: ( ( ( rule__LogLevel__Group__0 ) ) )
            // InternalInfoProject.g:616:2: ( ( rule__LogLevel__Group__0 ) )
            {
            // InternalInfoProject.g:616:2: ( ( rule__LogLevel__Group__0 ) )
            // InternalInfoProject.g:617:3: ( rule__LogLevel__Group__0 )
            {
             before(grammarAccess.getLogLevelAccess().getGroup()); 
            // InternalInfoProject.g:618:3: ( rule__LogLevel__Group__0 )
            // InternalInfoProject.g:618:4: rule__LogLevel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogLevelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "ruleenumOfArchiveType"
    // InternalInfoProject.g:627:1: ruleenumOfArchiveType : ( ( rule__EnumOfArchiveType__Alternatives ) ) ;
    public final void ruleenumOfArchiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:631:1: ( ( ( rule__EnumOfArchiveType__Alternatives ) ) )
            // InternalInfoProject.g:632:2: ( ( rule__EnumOfArchiveType__Alternatives ) )
            {
            // InternalInfoProject.g:632:2: ( ( rule__EnumOfArchiveType__Alternatives ) )
            // InternalInfoProject.g:633:3: ( rule__EnumOfArchiveType__Alternatives )
            {
             before(grammarAccess.getEnumOfArchiveTypeAccess().getAlternatives()); 
            // InternalInfoProject.g:634:3: ( rule__EnumOfArchiveType__Alternatives )
            // InternalInfoProject.g:634:4: rule__EnumOfArchiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumOfArchiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumOfArchiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleenumOfArchiveType"


    // $ANTLR start "ruleenumOfTypes"
    // InternalInfoProject.g:643:1: ruleenumOfTypes : ( ( rule__EnumOfTypes__Alternatives ) ) ;
    public final void ruleenumOfTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:647:1: ( ( ( rule__EnumOfTypes__Alternatives ) ) )
            // InternalInfoProject.g:648:2: ( ( rule__EnumOfTypes__Alternatives ) )
            {
            // InternalInfoProject.g:648:2: ( ( rule__EnumOfTypes__Alternatives ) )
            // InternalInfoProject.g:649:3: ( rule__EnumOfTypes__Alternatives )
            {
             before(grammarAccess.getEnumOfTypesAccess().getAlternatives()); 
            // InternalInfoProject.g:650:3: ( rule__EnumOfTypes__Alternatives )
            // InternalInfoProject.g:650:4: rule__EnumOfTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EnumOfTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEnumOfTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleenumOfTypes"


    // $ANTLR start "rule__Uri__NameAlternatives_3_0"
    // InternalInfoProject.g:658:1: rule__Uri__NameAlternatives_3_0 : ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_VERSION_NUMBER ) );
    public final void rule__Uri__NameAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:662:1: ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_VERSION_NUMBER ) )
            int alt1=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 20:
                {
                alt1=6;
                }
                break;
            case 21:
                {
                alt1=7;
                }
                break;
            case 22:
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
                    // InternalInfoProject.g:663:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:663:2: ( RULE_ID )
                    // InternalInfoProject.g:664:3: RULE_ID
                    {
                     before(grammarAccess.getUriAccess().getNameIDTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameIDTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:669:2: ( '-' )
                    {
                    // InternalInfoProject.g:669:2: ( '-' )
                    // InternalInfoProject.g:670:3: '-'
                    {
                     before(grammarAccess.getUriAccess().getNameHyphenMinusKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameHyphenMinusKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:675:2: ( '$' )
                    {
                    // InternalInfoProject.g:675:2: ( '$' )
                    // InternalInfoProject.g:676:3: '$'
                    {
                     before(grammarAccess.getUriAccess().getNameDollarSignKeyword_3_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameDollarSignKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfoProject.g:681:2: ( '{' )
                    {
                    // InternalInfoProject.g:681:2: ( '{' )
                    // InternalInfoProject.g:682:3: '{'
                    {
                     before(grammarAccess.getUriAccess().getNameLeftCurlyBracketKeyword_3_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameLeftCurlyBracketKeyword_3_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInfoProject.g:687:2: ( '}' )
                    {
                    // InternalInfoProject.g:687:2: ( '}' )
                    // InternalInfoProject.g:688:3: '}'
                    {
                     before(grammarAccess.getUriAccess().getNameRightCurlyBracketKeyword_3_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameRightCurlyBracketKeyword_3_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalInfoProject.g:693:2: ( '^' )
                    {
                    // InternalInfoProject.g:693:2: ( '^' )
                    // InternalInfoProject.g:694:3: '^'
                    {
                     before(grammarAccess.getUriAccess().getNameCircumflexAccentKeyword_3_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameCircumflexAccentKeyword_3_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalInfoProject.g:699:2: ( ':' )
                    {
                    // InternalInfoProject.g:699:2: ( ':' )
                    // InternalInfoProject.g:700:3: ':'
                    {
                     before(grammarAccess.getUriAccess().getNameColonKeyword_3_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameColonKeyword_3_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalInfoProject.g:705:2: ( '.' )
                    {
                    // InternalInfoProject.g:705:2: ( '.' )
                    // InternalInfoProject.g:706:3: '.'
                    {
                     before(grammarAccess.getUriAccess().getNameFullStopKeyword_3_0_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameFullStopKeyword_3_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalInfoProject.g:711:2: ( RULE_VERSION_NUMBER )
                    {
                    // InternalInfoProject.g:711:2: ( RULE_VERSION_NUMBER )
                    // InternalInfoProject.g:712:3: RULE_VERSION_NUMBER
                    {
                     before(grammarAccess.getUriAccess().getNameVERSION_NUMBERTerminalRuleCall_3_0_8()); 
                    match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getUriAccess().getNameVERSION_NUMBERTerminalRuleCall_3_0_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__NameAlternatives_3_0"


    // $ANTLR start "rule__FeatureName__NameAlternatives_2_0"
    // InternalInfoProject.g:721:1: rule__FeatureName__NameAlternatives_2_0 : ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_VERSION_NUMBER ) | ( RULE_EXCEPTION ) );
    public final void rule__FeatureName__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:725:1: ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_VERSION_NUMBER ) | ( RULE_EXCEPTION ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 19:
                {
                alt2=5;
                }
                break;
            case 20:
                {
                alt2=6;
                }
                break;
            case 21:
                {
                alt2=7;
                }
                break;
            case 22:
                {
                alt2=8;
                }
                break;
            case RULE_VERSION_NUMBER:
                {
                alt2=9;
                }
                break;
            case RULE_EXCEPTION:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalInfoProject.g:726:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:726:2: ( RULE_ID )
                    // InternalInfoProject.g:727:3: RULE_ID
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:732:2: ( '-' )
                    {
                    // InternalInfoProject.g:732:2: ( '-' )
                    // InternalInfoProject.g:733:3: '-'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameHyphenMinusKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameHyphenMinusKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:738:2: ( '$' )
                    {
                    // InternalInfoProject.g:738:2: ( '$' )
                    // InternalInfoProject.g:739:3: '$'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameDollarSignKeyword_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameDollarSignKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfoProject.g:744:2: ( '{' )
                    {
                    // InternalInfoProject.g:744:2: ( '{' )
                    // InternalInfoProject.g:745:3: '{'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameLeftCurlyBracketKeyword_2_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameLeftCurlyBracketKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInfoProject.g:750:2: ( '}' )
                    {
                    // InternalInfoProject.g:750:2: ( '}' )
                    // InternalInfoProject.g:751:3: '}'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameRightCurlyBracketKeyword_2_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameRightCurlyBracketKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalInfoProject.g:756:2: ( '^' )
                    {
                    // InternalInfoProject.g:756:2: ( '^' )
                    // InternalInfoProject.g:757:3: '^'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameCircumflexAccentKeyword_2_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameCircumflexAccentKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalInfoProject.g:762:2: ( ':' )
                    {
                    // InternalInfoProject.g:762:2: ( ':' )
                    // InternalInfoProject.g:763:3: ':'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameColonKeyword_2_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameColonKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalInfoProject.g:768:2: ( '.' )
                    {
                    // InternalInfoProject.g:768:2: ( '.' )
                    // InternalInfoProject.g:769:3: '.'
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameFullStopKeyword_2_0_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameFullStopKeyword_2_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalInfoProject.g:774:2: ( RULE_VERSION_NUMBER )
                    {
                    // InternalInfoProject.g:774:2: ( RULE_VERSION_NUMBER )
                    // InternalInfoProject.g:775:3: RULE_VERSION_NUMBER
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_8()); 
                    match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalInfoProject.g:780:2: ( RULE_EXCEPTION )
                    {
                    // InternalInfoProject.g:780:2: ( RULE_EXCEPTION )
                    // InternalInfoProject.g:781:3: RULE_EXCEPTION
                    {
                     before(grammarAccess.getFeatureNameAccess().getNameEXCEPTIONTerminalRuleCall_2_0_9()); 
                    match(input,RULE_EXCEPTION,FOLLOW_2); 
                     after(grammarAccess.getFeatureNameAccess().getNameEXCEPTIONTerminalRuleCall_2_0_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__NameAlternatives_2_0"


    // $ANTLR start "rule__Category__Alternatives"
    // InternalInfoProject.g:790:1: rule__Category__Alternatives : ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Alternatives_1 )* ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:794:1: ( ( ( rule__Category__Group_0__0 ) ) | ( ( rule__Category__Alternatives_1 )* ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==EOF||(LA4_0>=RULE_ID && LA4_0<=RULE_VERSION_NUMBER)||LA4_0==RULE_ADDITION||(LA4_0>=37 && LA4_0<=38)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalInfoProject.g:795:2: ( ( rule__Category__Group_0__0 ) )
                    {
                    // InternalInfoProject.g:795:2: ( ( rule__Category__Group_0__0 ) )
                    // InternalInfoProject.g:796:3: ( rule__Category__Group_0__0 )
                    {
                     before(grammarAccess.getCategoryAccess().getGroup_0()); 
                    // InternalInfoProject.g:797:3: ( rule__Category__Group_0__0 )
                    // InternalInfoProject.g:797:4: rule__Category__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Category__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCategoryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:801:2: ( ( rule__Category__Alternatives_1 )* )
                    {
                    // InternalInfoProject.g:801:2: ( ( rule__Category__Alternatives_1 )* )
                    // InternalInfoProject.g:802:3: ( rule__Category__Alternatives_1 )*
                    {
                     before(grammarAccess.getCategoryAccess().getAlternatives_1()); 
                    // InternalInfoProject.g:803:3: ( rule__Category__Alternatives_1 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_VERSION_NUMBER)||LA3_0==RULE_ADDITION) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalInfoProject.g:803:4: rule__Category__Alternatives_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Category__Alternatives_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getCategoryAccess().getAlternatives_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Alternatives"


    // $ANTLR start "rule__Category__Alternatives_1"
    // InternalInfoProject.g:811:1: rule__Category__Alternatives_1 : ( ( RULE_ID ) | ( RULE_ADDITION ) | ( RULE_VERSION_NUMBER ) );
    public final void rule__Category__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:815:1: ( ( RULE_ID ) | ( RULE_ADDITION ) | ( RULE_VERSION_NUMBER ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_ADDITION:
                {
                alt5=2;
                }
                break;
            case RULE_VERSION_NUMBER:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalInfoProject.g:816:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:816:2: ( RULE_ID )
                    // InternalInfoProject.g:817:3: RULE_ID
                    {
                     before(grammarAccess.getCategoryAccess().getIDTerminalRuleCall_1_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCategoryAccess().getIDTerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:822:2: ( RULE_ADDITION )
                    {
                    // InternalInfoProject.g:822:2: ( RULE_ADDITION )
                    // InternalInfoProject.g:823:3: RULE_ADDITION
                    {
                     before(grammarAccess.getCategoryAccess().getADDITIONTerminalRuleCall_1_1()); 
                    match(input,RULE_ADDITION,FOLLOW_2); 
                     after(grammarAccess.getCategoryAccess().getADDITIONTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:828:2: ( RULE_VERSION_NUMBER )
                    {
                    // InternalInfoProject.g:828:2: ( RULE_VERSION_NUMBER )
                    // InternalInfoProject.g:829:3: RULE_VERSION_NUMBER
                    {
                     before(grammarAccess.getCategoryAccess().getVERSION_NUMBERTerminalRuleCall_1_2()); 
                    match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getCategoryAccess().getVERSION_NUMBERTerminalRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Alternatives_1"


    // $ANTLR start "rule__MCS__NameAlternatives_2_0"
    // InternalInfoProject.g:838:1: rule__MCS__NameAlternatives_2_0 : ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_EXCEPTION ) | ( RULE_VERSION_NUMBER ) );
    public final void rule__MCS__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:842:1: ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) | ( '^' ) | ( ':' ) | ( '.' ) | ( RULE_EXCEPTION ) | ( RULE_VERSION_NUMBER ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case RULE_EXCEPTION:
                {
                alt6=9;
                }
                break;
            case RULE_VERSION_NUMBER:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalInfoProject.g:843:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:843:2: ( RULE_ID )
                    // InternalInfoProject.g:844:3: RULE_ID
                    {
                     before(grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:849:2: ( '-' )
                    {
                    // InternalInfoProject.g:849:2: ( '-' )
                    // InternalInfoProject.g:850:3: '-'
                    {
                     before(grammarAccess.getMCSAccess().getNameHyphenMinusKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameHyphenMinusKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:855:2: ( '$' )
                    {
                    // InternalInfoProject.g:855:2: ( '$' )
                    // InternalInfoProject.g:856:3: '$'
                    {
                     before(grammarAccess.getMCSAccess().getNameDollarSignKeyword_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameDollarSignKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfoProject.g:861:2: ( '{' )
                    {
                    // InternalInfoProject.g:861:2: ( '{' )
                    // InternalInfoProject.g:862:3: '{'
                    {
                     before(grammarAccess.getMCSAccess().getNameLeftCurlyBracketKeyword_2_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameLeftCurlyBracketKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInfoProject.g:867:2: ( '}' )
                    {
                    // InternalInfoProject.g:867:2: ( '}' )
                    // InternalInfoProject.g:868:3: '}'
                    {
                     before(grammarAccess.getMCSAccess().getNameRightCurlyBracketKeyword_2_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameRightCurlyBracketKeyword_2_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalInfoProject.g:873:2: ( '^' )
                    {
                    // InternalInfoProject.g:873:2: ( '^' )
                    // InternalInfoProject.g:874:3: '^'
                    {
                     before(grammarAccess.getMCSAccess().getNameCircumflexAccentKeyword_2_0_5()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameCircumflexAccentKeyword_2_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalInfoProject.g:879:2: ( ':' )
                    {
                    // InternalInfoProject.g:879:2: ( ':' )
                    // InternalInfoProject.g:880:3: ':'
                    {
                     before(grammarAccess.getMCSAccess().getNameColonKeyword_2_0_6()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameColonKeyword_2_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalInfoProject.g:885:2: ( '.' )
                    {
                    // InternalInfoProject.g:885:2: ( '.' )
                    // InternalInfoProject.g:886:3: '.'
                    {
                     before(grammarAccess.getMCSAccess().getNameFullStopKeyword_2_0_7()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameFullStopKeyword_2_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalInfoProject.g:891:2: ( RULE_EXCEPTION )
                    {
                    // InternalInfoProject.g:891:2: ( RULE_EXCEPTION )
                    // InternalInfoProject.g:892:3: RULE_EXCEPTION
                    {
                     before(grammarAccess.getMCSAccess().getNameEXCEPTIONTerminalRuleCall_2_0_8()); 
                    match(input,RULE_EXCEPTION,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameEXCEPTIONTerminalRuleCall_2_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalInfoProject.g:897:2: ( RULE_VERSION_NUMBER )
                    {
                    // InternalInfoProject.g:897:2: ( RULE_VERSION_NUMBER )
                    // InternalInfoProject.g:898:3: RULE_VERSION_NUMBER
                    {
                     before(grammarAccess.getMCSAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_9()); 
                    match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
                     after(grammarAccess.getMCSAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__NameAlternatives_2_0"


    // $ANTLR start "rule__FileDeclaration__Alternatives_2_0"
    // InternalInfoProject.g:907:1: rule__FileDeclaration__Alternatives_2_0 : ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) );
    public final void rule__FileDeclaration__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:911:1: ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            case 18:
                {
                alt7=4;
                }
                break;
            case 19:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalInfoProject.g:912:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:912:2: ( RULE_ID )
                    // InternalInfoProject.g:913:3: RULE_ID
                    {
                     before(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:918:2: ( '-' )
                    {
                    // InternalInfoProject.g:918:2: ( '-' )
                    // InternalInfoProject.g:919:3: '-'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_2_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:924:2: ( '$' )
                    {
                    // InternalInfoProject.g:924:2: ( '$' )
                    // InternalInfoProject.g:925:3: '$'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_2_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfoProject.g:930:2: ( '{' )
                    {
                    // InternalInfoProject.g:930:2: ( '{' )
                    // InternalInfoProject.g:931:3: '{'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_2_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_2_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInfoProject.g:936:2: ( '}' )
                    {
                    // InternalInfoProject.g:936:2: ( '}' )
                    // InternalInfoProject.g:937:3: '}'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_2_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_2_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Alternatives_2_0"


    // $ANTLR start "rule__FileDeclaration__Alternatives_3_0"
    // InternalInfoProject.g:946:1: rule__FileDeclaration__Alternatives_3_0 : ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) );
    public final void rule__FileDeclaration__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:950:1: ( ( RULE_ID ) | ( '-' ) | ( '$' ) | ( '{' ) | ( '}' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalInfoProject.g:951:2: ( RULE_ID )
                    {
                    // InternalInfoProject.g:951:2: ( RULE_ID )
                    // InternalInfoProject.g:952:3: RULE_ID
                    {
                     before(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:957:2: ( '-' )
                    {
                    // InternalInfoProject.g:957:2: ( '-' )
                    // InternalInfoProject.g:958:3: '-'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_3_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalInfoProject.g:963:2: ( '$' )
                    {
                    // InternalInfoProject.g:963:2: ( '$' )
                    // InternalInfoProject.g:964:3: '$'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_3_0_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getDollarSignKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalInfoProject.g:969:2: ( '{' )
                    {
                    // InternalInfoProject.g:969:2: ( '{' )
                    // InternalInfoProject.g:970:3: '{'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_3_0_3()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getLeftCurlyBracketKeyword_3_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalInfoProject.g:975:2: ( '}' )
                    {
                    // InternalInfoProject.g:975:2: ( '}' )
                    // InternalInfoProject.g:976:3: '}'
                    {
                     before(grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_3_0_4()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFileDeclarationAccess().getRightCurlyBracketKeyword_3_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Alternatives_3_0"


    // $ANTLR start "rule__EnumOfArchiveType__Alternatives"
    // InternalInfoProject.g:985:1: rule__EnumOfArchiveType__Alternatives : ( ( ( 'sip' ) ) | ( ( 'table' ) ) );
    public final void rule__EnumOfArchiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:989:1: ( ( ( 'sip' ) ) | ( ( 'table' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalInfoProject.g:990:2: ( ( 'sip' ) )
                    {
                    // InternalInfoProject.g:990:2: ( ( 'sip' ) )
                    // InternalInfoProject.g:991:3: ( 'sip' )
                    {
                     before(grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0()); 
                    // InternalInfoProject.g:992:3: ( 'sip' )
                    // InternalInfoProject.g:992:4: 'sip'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:996:2: ( ( 'table' ) )
                    {
                    // InternalInfoProject.g:996:2: ( ( 'table' ) )
                    // InternalInfoProject.g:997:3: ( 'table' )
                    {
                     before(grammarAccess.getEnumOfArchiveTypeAccess().getTABLEEnumLiteralDeclaration_1()); 
                    // InternalInfoProject.g:998:3: ( 'table' )
                    // InternalInfoProject.g:998:4: 'table'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfArchiveTypeAccess().getTABLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOfArchiveType__Alternatives"


    // $ANTLR start "rule__EnumOfTypes__Alternatives"
    // InternalInfoProject.g:1006:1: rule__EnumOfTypes__Alternatives : ( ( ( 'active archiving' ) ) | ( ( 'app decomm' ) ) );
    public final void rule__EnumOfTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1010:1: ( ( ( 'active archiving' ) ) | ( ( 'app decomm' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalInfoProject.g:1011:2: ( ( 'active archiving' ) )
                    {
                    // InternalInfoProject.g:1011:2: ( ( 'active archiving' ) )
                    // InternalInfoProject.g:1012:3: ( 'active archiving' )
                    {
                     before(grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0()); 
                    // InternalInfoProject.g:1013:3: ( 'active archiving' )
                    // InternalInfoProject.g:1013:4: 'active archiving'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:1017:2: ( ( 'app decomm' ) )
                    {
                    // InternalInfoProject.g:1017:2: ( ( 'app decomm' ) )
                    // InternalInfoProject.g:1018:3: ( 'app decomm' )
                    {
                     before(grammarAccess.getEnumOfTypesAccess().getAPP_DECOMMEnumLiteralDeclaration_1()); 
                    // InternalInfoProject.g:1019:3: ( 'app decomm' )
                    // InternalInfoProject.g:1019:4: 'app decomm'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfTypesAccess().getAPP_DECOMMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOfTypes__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalInfoProject.g:1027:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1031:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalInfoProject.g:1032:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalInfoProject.g:1039:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1043:1: ( ( ( rule__Model__ElementAssignment_0 ) ) )
            // InternalInfoProject.g:1044:1: ( ( rule__Model__ElementAssignment_0 ) )
            {
            // InternalInfoProject.g:1044:1: ( ( rule__Model__ElementAssignment_0 ) )
            // InternalInfoProject.g:1045:2: ( rule__Model__ElementAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_0()); 
            // InternalInfoProject.g:1046:2: ( rule__Model__ElementAssignment_0 )
            // InternalInfoProject.g:1046:3: rule__Model__ElementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalInfoProject.g:1054:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1058:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalInfoProject.g:1059:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalInfoProject.g:1066:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1070:1: ( ( ( rule__Model__ElementAssignment_1 ) ) )
            // InternalInfoProject.g:1071:1: ( ( rule__Model__ElementAssignment_1 ) )
            {
            // InternalInfoProject.g:1071:1: ( ( rule__Model__ElementAssignment_1 ) )
            // InternalInfoProject.g:1072:2: ( rule__Model__ElementAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_1()); 
            // InternalInfoProject.g:1073:2: ( rule__Model__ElementAssignment_1 )
            // InternalInfoProject.g:1073:3: rule__Model__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalInfoProject.g:1081:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1085:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalInfoProject.g:1086:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalInfoProject.g:1093:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1097:1: ( ( ( rule__Model__ElementAssignment_2 ) ) )
            // InternalInfoProject.g:1098:1: ( ( rule__Model__ElementAssignment_2 ) )
            {
            // InternalInfoProject.g:1098:1: ( ( rule__Model__ElementAssignment_2 ) )
            // InternalInfoProject.g:1099:2: ( rule__Model__ElementAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_2()); 
            // InternalInfoProject.g:1100:2: ( rule__Model__ElementAssignment_2 )
            // InternalInfoProject.g:1100:3: rule__Model__ElementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalInfoProject.g:1108:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1112:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalInfoProject.g:1113:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalInfoProject.g:1120:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1124:1: ( ( ( rule__Model__ElementAssignment_3 ) ) )
            // InternalInfoProject.g:1125:1: ( ( rule__Model__ElementAssignment_3 ) )
            {
            // InternalInfoProject.g:1125:1: ( ( rule__Model__ElementAssignment_3 ) )
            // InternalInfoProject.g:1126:2: ( rule__Model__ElementAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_3()); 
            // InternalInfoProject.g:1127:2: ( rule__Model__ElementAssignment_3 )
            // InternalInfoProject.g:1127:3: rule__Model__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalInfoProject.g:1135:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1139:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalInfoProject.g:1140:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalInfoProject.g:1147:1: rule__Model__Group__4__Impl : ( ( rule__Model__ElementAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1151:1: ( ( ( rule__Model__ElementAssignment_4 ) ) )
            // InternalInfoProject.g:1152:1: ( ( rule__Model__ElementAssignment_4 ) )
            {
            // InternalInfoProject.g:1152:1: ( ( rule__Model__ElementAssignment_4 ) )
            // InternalInfoProject.g:1153:2: ( rule__Model__ElementAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_4()); 
            // InternalInfoProject.g:1154:2: ( rule__Model__ElementAssignment_4 )
            // InternalInfoProject.g:1154:3: rule__Model__ElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalInfoProject.g:1162:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1166:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalInfoProject.g:1167:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalInfoProject.g:1174:1: rule__Model__Group__5__Impl : ( ( rule__Model__ElementAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1178:1: ( ( ( rule__Model__ElementAssignment_5 ) ) )
            // InternalInfoProject.g:1179:1: ( ( rule__Model__ElementAssignment_5 ) )
            {
            // InternalInfoProject.g:1179:1: ( ( rule__Model__ElementAssignment_5 ) )
            // InternalInfoProject.g:1180:2: ( rule__Model__ElementAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_5()); 
            // InternalInfoProject.g:1181:2: ( rule__Model__ElementAssignment_5 )
            // InternalInfoProject.g:1181:3: rule__Model__ElementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalInfoProject.g:1189:1: rule__Model__Group__6 : rule__Model__Group__6__Impl ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1193:1: ( rule__Model__Group__6__Impl )
            // InternalInfoProject.g:1194:2: rule__Model__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalInfoProject.g:1200:1: rule__Model__Group__6__Impl : ( ( rule__Model__ElementAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1204:1: ( ( ( rule__Model__ElementAssignment_6 ) ) )
            // InternalInfoProject.g:1205:1: ( ( rule__Model__ElementAssignment_6 ) )
            {
            // InternalInfoProject.g:1205:1: ( ( rule__Model__ElementAssignment_6 ) )
            // InternalInfoProject.g:1206:2: ( rule__Model__ElementAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_6()); 
            // InternalInfoProject.g:1207:2: ( rule__Model__ElementAssignment_6 )
            // InternalInfoProject.g:1207:3: rule__Model__ElementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Model__ElementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalInfoProject.g:1216:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1220:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalInfoProject.g:1221:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalInfoProject.g:1228:1: rule__Version__Group__0__Impl : ( 'version:' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1232:1: ( ( 'version:' ) )
            // InternalInfoProject.g:1233:1: ( 'version:' )
            {
            // InternalInfoProject.g:1233:1: ( 'version:' )
            // InternalInfoProject.g:1234:2: 'version:'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalInfoProject.g:1243:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1247:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalInfoProject.g:1248:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalInfoProject.g:1255:1: rule__Version__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1259:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:1260:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:1260:1: ( RULE_SPACE )
            // InternalInfoProject.g:1261:2: RULE_SPACE
            {
             before(grammarAccess.getVersionAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalInfoProject.g:1270:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1274:1: ( rule__Version__Group__2__Impl )
            // InternalInfoProject.g:1275:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalInfoProject.g:1281:1: rule__Version__Group__2__Impl : ( ( rule__Version__NameAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1285:1: ( ( ( rule__Version__NameAssignment_2 ) ) )
            // InternalInfoProject.g:1286:1: ( ( rule__Version__NameAssignment_2 ) )
            {
            // InternalInfoProject.g:1286:1: ( ( rule__Version__NameAssignment_2 ) )
            // InternalInfoProject.g:1287:2: ( rule__Version__NameAssignment_2 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:1288:2: ( rule__Version__NameAssignment_2 )
            // InternalInfoProject.g:1288:3: rule__Version__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Version__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // InternalInfoProject.g:1297:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1301:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // InternalInfoProject.g:1302:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // InternalInfoProject.g:1309:1: rule__Namespace__Group__0__Impl : ( 'namespace:' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1313:1: ( ( 'namespace:' ) )
            // InternalInfoProject.g:1314:1: ( 'namespace:' )
            {
            // InternalInfoProject.g:1314:1: ( 'namespace:' )
            // InternalInfoProject.g:1315:2: 'namespace:'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // InternalInfoProject.g:1324:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1328:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // InternalInfoProject.g:1329:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // InternalInfoProject.g:1336:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__FeatureAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1340:1: ( ( ( rule__Namespace__FeatureAssignment_1 ) ) )
            // InternalInfoProject.g:1341:1: ( ( rule__Namespace__FeatureAssignment_1 ) )
            {
            // InternalInfoProject.g:1341:1: ( ( rule__Namespace__FeatureAssignment_1 ) )
            // InternalInfoProject.g:1342:2: ( rule__Namespace__FeatureAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getFeatureAssignment_1()); 
            // InternalInfoProject.g:1343:2: ( rule__Namespace__FeatureAssignment_1 )
            // InternalInfoProject.g:1343:3: rule__Namespace__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // InternalInfoProject.g:1351:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1355:1: ( rule__Namespace__Group__2__Impl )
            // InternalInfoProject.g:1356:2: rule__Namespace__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // InternalInfoProject.g:1362:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__FeatureAssignment_2 ) ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1366:1: ( ( ( rule__Namespace__FeatureAssignment_2 ) ) )
            // InternalInfoProject.g:1367:1: ( ( rule__Namespace__FeatureAssignment_2 ) )
            {
            // InternalInfoProject.g:1367:1: ( ( rule__Namespace__FeatureAssignment_2 ) )
            // InternalInfoProject.g:1368:2: ( rule__Namespace__FeatureAssignment_2 )
            {
             before(grammarAccess.getNamespaceAccess().getFeatureAssignment_2()); 
            // InternalInfoProject.g:1369:2: ( rule__Namespace__FeatureAssignment_2 )
            // InternalInfoProject.g:1369:3: rule__Namespace__FeatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Namespace__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__Prefix__Group__0"
    // InternalInfoProject.g:1378:1: rule__Prefix__Group__0 : rule__Prefix__Group__0__Impl rule__Prefix__Group__1 ;
    public final void rule__Prefix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1382:1: ( rule__Prefix__Group__0__Impl rule__Prefix__Group__1 )
            // InternalInfoProject.g:1383:2: rule__Prefix__Group__0__Impl rule__Prefix__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Prefix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0"


    // $ANTLR start "rule__Prefix__Group__0__Impl"
    // InternalInfoProject.g:1390:1: rule__Prefix__Group__0__Impl : ( 'prefix: ' ) ;
    public final void rule__Prefix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1394:1: ( ( 'prefix: ' ) )
            // InternalInfoProject.g:1395:1: ( 'prefix: ' )
            {
            // InternalInfoProject.g:1395:1: ( 'prefix: ' )
            // InternalInfoProject.g:1396:2: 'prefix: '
            {
             before(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getPrefixKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__0__Impl"


    // $ANTLR start "rule__Prefix__Group__1"
    // InternalInfoProject.g:1405:1: rule__Prefix__Group__1 : rule__Prefix__Group__1__Impl ;
    public final void rule__Prefix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1409:1: ( rule__Prefix__Group__1__Impl )
            // InternalInfoProject.g:1410:2: rule__Prefix__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1"


    // $ANTLR start "rule__Prefix__Group__1__Impl"
    // InternalInfoProject.g:1416:1: rule__Prefix__Group__1__Impl : ( ( rule__Prefix__NameAssignment_1 ) ) ;
    public final void rule__Prefix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1420:1: ( ( ( rule__Prefix__NameAssignment_1 ) ) )
            // InternalInfoProject.g:1421:1: ( ( rule__Prefix__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:1421:1: ( ( rule__Prefix__NameAssignment_1 ) )
            // InternalInfoProject.g:1422:2: ( rule__Prefix__NameAssignment_1 )
            {
             before(grammarAccess.getPrefixAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:1423:2: ( rule__Prefix__NameAssignment_1 )
            // InternalInfoProject.g:1423:3: rule__Prefix__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrefixAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Group__1__Impl"


    // $ANTLR start "rule__Uri__Group__0"
    // InternalInfoProject.g:1432:1: rule__Uri__Group__0 : rule__Uri__Group__0__Impl rule__Uri__Group__1 ;
    public final void rule__Uri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1436:1: ( rule__Uri__Group__0__Impl rule__Uri__Group__1 )
            // InternalInfoProject.g:1437:2: rule__Uri__Group__0__Impl rule__Uri__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Uri__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uri__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__0"


    // $ANTLR start "rule__Uri__Group__0__Impl"
    // InternalInfoProject.g:1444:1: rule__Uri__Group__0__Impl : ( () ) ;
    public final void rule__Uri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1448:1: ( ( () ) )
            // InternalInfoProject.g:1449:1: ( () )
            {
            // InternalInfoProject.g:1449:1: ( () )
            // InternalInfoProject.g:1450:2: ()
            {
             before(grammarAccess.getUriAccess().getUriAction_0()); 
            // InternalInfoProject.g:1451:2: ()
            // InternalInfoProject.g:1451:3: 
            {
            }

             after(grammarAccess.getUriAccess().getUriAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__0__Impl"


    // $ANTLR start "rule__Uri__Group__1"
    // InternalInfoProject.g:1459:1: rule__Uri__Group__1 : rule__Uri__Group__1__Impl rule__Uri__Group__2 ;
    public final void rule__Uri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1463:1: ( rule__Uri__Group__1__Impl rule__Uri__Group__2 )
            // InternalInfoProject.g:1464:2: rule__Uri__Group__1__Impl rule__Uri__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Uri__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uri__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__1"


    // $ANTLR start "rule__Uri__Group__1__Impl"
    // InternalInfoProject.g:1471:1: rule__Uri__Group__1__Impl : ( 'uri:' ) ;
    public final void rule__Uri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1475:1: ( ( 'uri:' ) )
            // InternalInfoProject.g:1476:1: ( 'uri:' )
            {
            // InternalInfoProject.g:1476:1: ( 'uri:' )
            // InternalInfoProject.g:1477:2: 'uri:'
            {
             before(grammarAccess.getUriAccess().getUriKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getUriAccess().getUriKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__1__Impl"


    // $ANTLR start "rule__Uri__Group__2"
    // InternalInfoProject.g:1486:1: rule__Uri__Group__2 : rule__Uri__Group__2__Impl rule__Uri__Group__3 ;
    public final void rule__Uri__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1490:1: ( rule__Uri__Group__2__Impl rule__Uri__Group__3 )
            // InternalInfoProject.g:1491:2: rule__Uri__Group__2__Impl rule__Uri__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Uri__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Uri__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__2"


    // $ANTLR start "rule__Uri__Group__2__Impl"
    // InternalInfoProject.g:1498:1: rule__Uri__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Uri__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1502:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:1503:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:1503:1: ( RULE_SPACE )
            // InternalInfoProject.g:1504:2: RULE_SPACE
            {
             before(grammarAccess.getUriAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getUriAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__2__Impl"


    // $ANTLR start "rule__Uri__Group__3"
    // InternalInfoProject.g:1513:1: rule__Uri__Group__3 : rule__Uri__Group__3__Impl ;
    public final void rule__Uri__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1517:1: ( rule__Uri__Group__3__Impl )
            // InternalInfoProject.g:1518:2: rule__Uri__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Uri__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__3"


    // $ANTLR start "rule__Uri__Group__3__Impl"
    // InternalInfoProject.g:1524:1: rule__Uri__Group__3__Impl : ( ( rule__Uri__NameAssignment_3 )* ) ;
    public final void rule__Uri__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1528:1: ( ( ( rule__Uri__NameAssignment_3 )* ) )
            // InternalInfoProject.g:1529:1: ( ( rule__Uri__NameAssignment_3 )* )
            {
            // InternalInfoProject.g:1529:1: ( ( rule__Uri__NameAssignment_3 )* )
            // InternalInfoProject.g:1530:2: ( rule__Uri__NameAssignment_3 )*
            {
             before(grammarAccess.getUriAccess().getNameAssignment_3()); 
            // InternalInfoProject.g:1531:2: ( rule__Uri__NameAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_VERSION_NUMBER)||(LA11_0>=16 && LA11_0<=22)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalInfoProject.g:1531:3: rule__Uri__NameAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Uri__NameAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUriAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__Group__3__Impl"


    // $ANTLR start "rule__FeatureName__Group__0"
    // InternalInfoProject.g:1540:1: rule__FeatureName__Group__0 : rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 ;
    public final void rule__FeatureName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1544:1: ( rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 )
            // InternalInfoProject.g:1545:2: rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__FeatureName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__0"


    // $ANTLR start "rule__FeatureName__Group__0__Impl"
    // InternalInfoProject.g:1552:1: rule__FeatureName__Group__0__Impl : ( () ) ;
    public final void rule__FeatureName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1556:1: ( ( () ) )
            // InternalInfoProject.g:1557:1: ( () )
            {
            // InternalInfoProject.g:1557:1: ( () )
            // InternalInfoProject.g:1558:2: ()
            {
             before(grammarAccess.getFeatureNameAccess().getFeatureNameAction_0()); 
            // InternalInfoProject.g:1559:2: ()
            // InternalInfoProject.g:1559:3: 
            {
            }

             after(grammarAccess.getFeatureNameAccess().getFeatureNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__0__Impl"


    // $ANTLR start "rule__FeatureName__Group__1"
    // InternalInfoProject.g:1567:1: rule__FeatureName__Group__1 : rule__FeatureName__Group__1__Impl rule__FeatureName__Group__2 ;
    public final void rule__FeatureName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1571:1: ( rule__FeatureName__Group__1__Impl rule__FeatureName__Group__2 )
            // InternalInfoProject.g:1572:2: rule__FeatureName__Group__1__Impl rule__FeatureName__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__FeatureName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__1"


    // $ANTLR start "rule__FeatureName__Group__1__Impl"
    // InternalInfoProject.g:1579:1: rule__FeatureName__Group__1__Impl : ( 'name:' ) ;
    public final void rule__FeatureName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1583:1: ( ( 'name:' ) )
            // InternalInfoProject.g:1584:1: ( 'name:' )
            {
            // InternalInfoProject.g:1584:1: ( 'name:' )
            // InternalInfoProject.g:1585:2: 'name:'
            {
             before(grammarAccess.getFeatureNameAccess().getNameKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureNameAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__1__Impl"


    // $ANTLR start "rule__FeatureName__Group__2"
    // InternalInfoProject.g:1594:1: rule__FeatureName__Group__2 : rule__FeatureName__Group__2__Impl ;
    public final void rule__FeatureName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1598:1: ( rule__FeatureName__Group__2__Impl )
            // InternalInfoProject.g:1599:2: rule__FeatureName__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__2"


    // $ANTLR start "rule__FeatureName__Group__2__Impl"
    // InternalInfoProject.g:1605:1: rule__FeatureName__Group__2__Impl : ( ( rule__FeatureName__NameAssignment_2 )* ) ;
    public final void rule__FeatureName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1609:1: ( ( ( rule__FeatureName__NameAssignment_2 )* ) )
            // InternalInfoProject.g:1610:1: ( ( rule__FeatureName__NameAssignment_2 )* )
            {
            // InternalInfoProject.g:1610:1: ( ( rule__FeatureName__NameAssignment_2 )* )
            // InternalInfoProject.g:1611:2: ( rule__FeatureName__NameAssignment_2 )*
            {
             before(grammarAccess.getFeatureNameAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:1612:2: ( rule__FeatureName__NameAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_EXCEPTION)||(LA12_0>=16 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalInfoProject.g:1612:3: rule__FeatureName__NameAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__FeatureName__NameAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getFeatureNameAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalInfoProject.g:1621:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1625:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalInfoProject.g:1626:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalInfoProject.g:1633:1: rule__Application__Group__0__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1637:1: ( ( 'application:' ) )
            // InternalInfoProject.g:1638:1: ( 'application:' )
            {
            // InternalInfoProject.g:1638:1: ( 'application:' )
            // InternalInfoProject.g:1639:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalInfoProject.g:1648:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1652:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalInfoProject.g:1653:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalInfoProject.g:1660:1: rule__Application__Group__1__Impl : ( ( rule__Application__Features1Assignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1664:1: ( ( ( rule__Application__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:1665:1: ( ( rule__Application__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:1665:1: ( ( rule__Application__Features1Assignment_1 ) )
            // InternalInfoProject.g:1666:2: ( rule__Application__Features1Assignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:1667:2: ( rule__Application__Features1Assignment_1 )
            // InternalInfoProject.g:1667:3: rule__Application__Features1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__Features1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFeatures1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalInfoProject.g:1675:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1679:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalInfoProject.g:1680:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalInfoProject.g:1687:1: rule__Application__Group__2__Impl : ( ( rule__Application__FeaturesAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1691:1: ( ( ( rule__Application__FeaturesAssignment_2 ) ) )
            // InternalInfoProject.g:1692:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            {
            // InternalInfoProject.g:1692:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            // InternalInfoProject.g:1693:2: ( rule__Application__FeaturesAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:1694:2: ( rule__Application__FeaturesAssignment_2 )
            // InternalInfoProject.g:1694:3: rule__Application__FeaturesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Application__FeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalInfoProject.g:1702:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1706:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalInfoProject.g:1707:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalInfoProject.g:1714:1: rule__Application__Group__3__Impl : ( ( rule__Application__FeatureAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1718:1: ( ( ( rule__Application__FeatureAssignment_3 ) ) )
            // InternalInfoProject.g:1719:1: ( ( rule__Application__FeatureAssignment_3 ) )
            {
            // InternalInfoProject.g:1719:1: ( ( rule__Application__FeatureAssignment_3 ) )
            // InternalInfoProject.g:1720:2: ( rule__Application__FeatureAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_3()); 
            // InternalInfoProject.g:1721:2: ( rule__Application__FeatureAssignment_3 )
            // InternalInfoProject.g:1721:3: rule__Application__FeatureAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Application__FeatureAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFeatureAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalInfoProject.g:1729:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1733:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalInfoProject.g:1734:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalInfoProject.g:1741:1: rule__Application__Group__4__Impl : ( ( rule__Application__FeatureAssignment_4 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1745:1: ( ( ( rule__Application__FeatureAssignment_4 )? ) )
            // InternalInfoProject.g:1746:1: ( ( rule__Application__FeatureAssignment_4 )? )
            {
            // InternalInfoProject.g:1746:1: ( ( rule__Application__FeatureAssignment_4 )? )
            // InternalInfoProject.g:1747:2: ( rule__Application__FeatureAssignment_4 )?
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_4()); 
            // InternalInfoProject.g:1748:2: ( rule__Application__FeatureAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalInfoProject.g:1748:3: rule__Application__FeatureAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__FeatureAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getFeatureAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalInfoProject.g:1756:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1760:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalInfoProject.g:1761:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Application__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalInfoProject.g:1768:1: rule__Application__Group__5__Impl : ( ( rule__Application__FeatureAssignment_5 ) ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1772:1: ( ( ( rule__Application__FeatureAssignment_5 ) ) )
            // InternalInfoProject.g:1773:1: ( ( rule__Application__FeatureAssignment_5 ) )
            {
            // InternalInfoProject.g:1773:1: ( ( rule__Application__FeatureAssignment_5 ) )
            // InternalInfoProject.g:1774:2: ( rule__Application__FeatureAssignment_5 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_5()); 
            // InternalInfoProject.g:1775:2: ( rule__Application__FeatureAssignment_5 )
            // InternalInfoProject.g:1775:3: rule__Application__FeatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Application__FeatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFeatureAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group__6"
    // InternalInfoProject.g:1783:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1787:1: ( rule__Application__Group__6__Impl )
            // InternalInfoProject.g:1788:2: rule__Application__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6"


    // $ANTLR start "rule__Application__Group__6__Impl"
    // InternalInfoProject.g:1794:1: rule__Application__Group__6__Impl : ( ( rule__Application__FeatureAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1798:1: ( ( ( rule__Application__FeatureAssignment_6 ) ) )
            // InternalInfoProject.g:1799:1: ( ( rule__Application__FeatureAssignment_6 ) )
            {
            // InternalInfoProject.g:1799:1: ( ( rule__Application__FeatureAssignment_6 ) )
            // InternalInfoProject.g:1800:2: ( rule__Application__FeatureAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_6()); 
            // InternalInfoProject.g:1801:2: ( rule__Application__FeatureAssignment_6 )
            // InternalInfoProject.g:1801:3: rule__Application__FeatureAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Application__FeatureAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getFeatureAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__6__Impl"


    // $ANTLR start "rule__Tenant__Group__0"
    // InternalInfoProject.g:1810:1: rule__Tenant__Group__0 : rule__Tenant__Group__0__Impl rule__Tenant__Group__1 ;
    public final void rule__Tenant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1814:1: ( rule__Tenant__Group__0__Impl rule__Tenant__Group__1 )
            // InternalInfoProject.g:1815:2: rule__Tenant__Group__0__Impl rule__Tenant__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Tenant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tenant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tenant__Group__0"


    // $ANTLR start "rule__Tenant__Group__0__Impl"
    // InternalInfoProject.g:1822:1: rule__Tenant__Group__0__Impl : ( 'tenant:' ) ;
    public final void rule__Tenant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1826:1: ( ( 'tenant:' ) )
            // InternalInfoProject.g:1827:1: ( 'tenant:' )
            {
            // InternalInfoProject.g:1827:1: ( 'tenant:' )
            // InternalInfoProject.g:1828:2: 'tenant:'
            {
             before(grammarAccess.getTenantAccess().getTenantKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTenantAccess().getTenantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tenant__Group__0__Impl"


    // $ANTLR start "rule__Tenant__Group__1"
    // InternalInfoProject.g:1837:1: rule__Tenant__Group__1 : rule__Tenant__Group__1__Impl ;
    public final void rule__Tenant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1841:1: ( rule__Tenant__Group__1__Impl )
            // InternalInfoProject.g:1842:2: rule__Tenant__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tenant__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tenant__Group__1"


    // $ANTLR start "rule__Tenant__Group__1__Impl"
    // InternalInfoProject.g:1848:1: rule__Tenant__Group__1__Impl : ( ( rule__Tenant__Features1Assignment_1 ) ) ;
    public final void rule__Tenant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1852:1: ( ( ( rule__Tenant__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:1853:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:1853:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            // InternalInfoProject.g:1854:2: ( rule__Tenant__Features1Assignment_1 )
            {
             before(grammarAccess.getTenantAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:1855:2: ( rule__Tenant__Features1Assignment_1 )
            // InternalInfoProject.g:1855:3: rule__Tenant__Features1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tenant__Features1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTenantAccess().getFeatures1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tenant__Group__1__Impl"


    // $ANTLR start "rule__Hold__Group__0"
    // InternalInfoProject.g:1864:1: rule__Hold__Group__0 : rule__Hold__Group__0__Impl rule__Hold__Group__1 ;
    public final void rule__Hold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1868:1: ( rule__Hold__Group__0__Impl rule__Hold__Group__1 )
            // InternalInfoProject.g:1869:2: rule__Hold__Group__0__Impl rule__Hold__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Hold__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hold__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__0"


    // $ANTLR start "rule__Hold__Group__0__Impl"
    // InternalInfoProject.g:1876:1: rule__Hold__Group__0__Impl : ( 'hold:' ) ;
    public final void rule__Hold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1880:1: ( ( 'hold:' ) )
            // InternalInfoProject.g:1881:1: ( 'hold:' )
            {
            // InternalInfoProject.g:1881:1: ( 'hold:' )
            // InternalInfoProject.g:1882:2: 'hold:'
            {
             before(grammarAccess.getHoldAccess().getHoldKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getHoldAccess().getHoldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__0__Impl"


    // $ANTLR start "rule__Hold__Group__1"
    // InternalInfoProject.g:1891:1: rule__Hold__Group__1 : rule__Hold__Group__1__Impl rule__Hold__Group__2 ;
    public final void rule__Hold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1895:1: ( rule__Hold__Group__1__Impl rule__Hold__Group__2 )
            // InternalInfoProject.g:1896:2: rule__Hold__Group__1__Impl rule__Hold__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Hold__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hold__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__1"


    // $ANTLR start "rule__Hold__Group__1__Impl"
    // InternalInfoProject.g:1903:1: rule__Hold__Group__1__Impl : ( ( rule__Hold__Features1Assignment_1 ) ) ;
    public final void rule__Hold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1907:1: ( ( ( rule__Hold__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:1908:1: ( ( rule__Hold__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:1908:1: ( ( rule__Hold__Features1Assignment_1 ) )
            // InternalInfoProject.g:1909:2: ( rule__Hold__Features1Assignment_1 )
            {
             before(grammarAccess.getHoldAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:1910:2: ( rule__Hold__Features1Assignment_1 )
            // InternalInfoProject.g:1910:3: rule__Hold__Features1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hold__Features1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHoldAccess().getFeatures1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__1__Impl"


    // $ANTLR start "rule__Hold__Group__2"
    // InternalInfoProject.g:1918:1: rule__Hold__Group__2 : rule__Hold__Group__2__Impl ;
    public final void rule__Hold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1922:1: ( rule__Hold__Group__2__Impl )
            // InternalInfoProject.g:1923:2: rule__Hold__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hold__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__2"


    // $ANTLR start "rule__Hold__Group__2__Impl"
    // InternalInfoProject.g:1929:1: rule__Hold__Group__2__Impl : ( ( rule__Hold__FeaturesAssignment_2 ) ) ;
    public final void rule__Hold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1933:1: ( ( ( rule__Hold__FeaturesAssignment_2 ) ) )
            // InternalInfoProject.g:1934:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            {
            // InternalInfoProject.g:1934:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            // InternalInfoProject.g:1935:2: ( rule__Hold__FeaturesAssignment_2 )
            {
             before(grammarAccess.getHoldAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:1936:2: ( rule__Hold__FeaturesAssignment_2 )
            // InternalInfoProject.g:1936:3: rule__Hold__FeaturesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Hold__FeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHoldAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Group__2__Impl"


    // $ANTLR start "rule__ArchiveType__Group__0"
    // InternalInfoProject.g:1945:1: rule__ArchiveType__Group__0 : rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1 ;
    public final void rule__ArchiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1949:1: ( rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1 )
            // InternalInfoProject.g:1950:2: rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ArchiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchiveType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiveType__Group__0"


    // $ANTLR start "rule__ArchiveType__Group__0__Impl"
    // InternalInfoProject.g:1957:1: rule__ArchiveType__Group__0__Impl : ( 'archiveType: ' ) ;
    public final void rule__ArchiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1961:1: ( ( 'archiveType: ' ) )
            // InternalInfoProject.g:1962:1: ( 'archiveType: ' )
            {
            // InternalInfoProject.g:1962:1: ( 'archiveType: ' )
            // InternalInfoProject.g:1963:2: 'archiveType: '
            {
             before(grammarAccess.getArchiveTypeAccess().getArchiveTypeKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getArchiveTypeAccess().getArchiveTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiveType__Group__0__Impl"


    // $ANTLR start "rule__ArchiveType__Group__1"
    // InternalInfoProject.g:1972:1: rule__ArchiveType__Group__1 : rule__ArchiveType__Group__1__Impl ;
    public final void rule__ArchiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1976:1: ( rule__ArchiveType__Group__1__Impl )
            // InternalInfoProject.g:1977:2: rule__ArchiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiveType__Group__1"


    // $ANTLR start "rule__ArchiveType__Group__1__Impl"
    // InternalInfoProject.g:1983:1: rule__ArchiveType__Group__1__Impl : ( ( rule__ArchiveType__ValueAssignment_1 ) ) ;
    public final void rule__ArchiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1987:1: ( ( ( rule__ArchiveType__ValueAssignment_1 ) ) )
            // InternalInfoProject.g:1988:1: ( ( rule__ArchiveType__ValueAssignment_1 ) )
            {
            // InternalInfoProject.g:1988:1: ( ( rule__ArchiveType__ValueAssignment_1 ) )
            // InternalInfoProject.g:1989:2: ( rule__ArchiveType__ValueAssignment_1 )
            {
             before(grammarAccess.getArchiveTypeAccess().getValueAssignment_1()); 
            // InternalInfoProject.g:1990:2: ( rule__ArchiveType__ValueAssignment_1 )
            // InternalInfoProject.g:1990:3: rule__ArchiveType__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveType__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchiveTypeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiveType__Group__1__Impl"


    // $ANTLR start "rule__Category__Group_0__0"
    // InternalInfoProject.g:1999:1: rule__Category__Group_0__0 : rule__Category__Group_0__0__Impl rule__Category__Group_0__1 ;
    public final void rule__Category__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2003:1: ( rule__Category__Group_0__0__Impl rule__Category__Group_0__1 )
            // InternalInfoProject.g:2004:2: rule__Category__Group_0__0__Impl rule__Category__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Category__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__0"


    // $ANTLR start "rule__Category__Group_0__0__Impl"
    // InternalInfoProject.g:2011:1: rule__Category__Group_0__0__Impl : ( () ) ;
    public final void rule__Category__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2015:1: ( ( () ) )
            // InternalInfoProject.g:2016:1: ( () )
            {
            // InternalInfoProject.g:2016:1: ( () )
            // InternalInfoProject.g:2017:2: ()
            {
             before(grammarAccess.getCategoryAccess().getCategoryAction_0_0()); 
            // InternalInfoProject.g:2018:2: ()
            // InternalInfoProject.g:2018:3: 
            {
            }

             after(grammarAccess.getCategoryAccess().getCategoryAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__0__Impl"


    // $ANTLR start "rule__Category__Group_0__1"
    // InternalInfoProject.g:2026:1: rule__Category__Group_0__1 : rule__Category__Group_0__1__Impl rule__Category__Group_0__2 ;
    public final void rule__Category__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2030:1: ( rule__Category__Group_0__1__Impl rule__Category__Group_0__2 )
            // InternalInfoProject.g:2031:2: rule__Category__Group_0__1__Impl rule__Category__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Category__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__1"


    // $ANTLR start "rule__Category__Group_0__1__Impl"
    // InternalInfoProject.g:2038:1: rule__Category__Group_0__1__Impl : ( 'category:' ) ;
    public final void rule__Category__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2042:1: ( ( 'category:' ) )
            // InternalInfoProject.g:2043:1: ( 'category:' )
            {
            // InternalInfoProject.g:2043:1: ( 'category:' )
            // InternalInfoProject.g:2044:2: 'category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__1__Impl"


    // $ANTLR start "rule__Category__Group_0__2"
    // InternalInfoProject.g:2053:1: rule__Category__Group_0__2 : rule__Category__Group_0__2__Impl rule__Category__Group_0__3 ;
    public final void rule__Category__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2057:1: ( rule__Category__Group_0__2__Impl rule__Category__Group_0__3 )
            // InternalInfoProject.g:2058:2: rule__Category__Group_0__2__Impl rule__Category__Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Category__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__2"


    // $ANTLR start "rule__Category__Group_0__2__Impl"
    // InternalInfoProject.g:2065:1: rule__Category__Group_0__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Category__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2069:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:2070:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:2070:1: ( RULE_SPACE )
            // InternalInfoProject.g:2071:2: RULE_SPACE
            {
             before(grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__2__Impl"


    // $ANTLR start "rule__Category__Group_0__3"
    // InternalInfoProject.g:2080:1: rule__Category__Group_0__3 : rule__Category__Group_0__3__Impl rule__Category__Group_0__4 ;
    public final void rule__Category__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2084:1: ( rule__Category__Group_0__3__Impl rule__Category__Group_0__4 )
            // InternalInfoProject.g:2085:2: rule__Category__Group_0__3__Impl rule__Category__Group_0__4
            {
            pushFollow(FOLLOW_27);
            rule__Category__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__3"


    // $ANTLR start "rule__Category__Group_0__3__Impl"
    // InternalInfoProject.g:2092:1: rule__Category__Group_0__3__Impl : ( ( rule__Category__NameAssignment_0_3 ) ) ;
    public final void rule__Category__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2096:1: ( ( ( rule__Category__NameAssignment_0_3 ) ) )
            // InternalInfoProject.g:2097:1: ( ( rule__Category__NameAssignment_0_3 ) )
            {
            // InternalInfoProject.g:2097:1: ( ( rule__Category__NameAssignment_0_3 ) )
            // InternalInfoProject.g:2098:2: ( rule__Category__NameAssignment_0_3 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_0_3()); 
            // InternalInfoProject.g:2099:2: ( rule__Category__NameAssignment_0_3 )
            // InternalInfoProject.g:2099:3: rule__Category__NameAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__3__Impl"


    // $ANTLR start "rule__Category__Group_0__4"
    // InternalInfoProject.g:2107:1: rule__Category__Group_0__4 : rule__Category__Group_0__4__Impl rule__Category__Group_0__5 ;
    public final void rule__Category__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2111:1: ( rule__Category__Group_0__4__Impl rule__Category__Group_0__5 )
            // InternalInfoProject.g:2112:2: rule__Category__Group_0__4__Impl rule__Category__Group_0__5
            {
            pushFollow(FOLLOW_27);
            rule__Category__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__4"


    // $ANTLR start "rule__Category__Group_0__4__Impl"
    // InternalInfoProject.g:2119:1: rule__Category__Group_0__4__Impl : ( ( RULE_SPACE )? ) ;
    public final void rule__Category__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2123:1: ( ( ( RULE_SPACE )? ) )
            // InternalInfoProject.g:2124:1: ( ( RULE_SPACE )? )
            {
            // InternalInfoProject.g:2124:1: ( ( RULE_SPACE )? )
            // InternalInfoProject.g:2125:2: ( RULE_SPACE )?
            {
             before(grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_4()); 
            // InternalInfoProject.g:2126:2: ( RULE_SPACE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SPACE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalInfoProject.g:2126:3: RULE_SPACE
                    {
                    match(input,RULE_SPACE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getSPACETerminalRuleCall_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__4__Impl"


    // $ANTLR start "rule__Category__Group_0__5"
    // InternalInfoProject.g:2134:1: rule__Category__Group_0__5 : rule__Category__Group_0__5__Impl ;
    public final void rule__Category__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2138:1: ( rule__Category__Group_0__5__Impl )
            // InternalInfoProject.g:2139:2: rule__Category__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__5"


    // $ANTLR start "rule__Category__Group_0__5__Impl"
    // InternalInfoProject.g:2145:1: rule__Category__Group_0__5__Impl : ( ( RULE_ID )? ) ;
    public final void rule__Category__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2149:1: ( ( ( RULE_ID )? ) )
            // InternalInfoProject.g:2150:1: ( ( RULE_ID )? )
            {
            // InternalInfoProject.g:2150:1: ( ( RULE_ID )? )
            // InternalInfoProject.g:2151:2: ( RULE_ID )?
            {
             before(grammarAccess.getCategoryAccess().getIDTerminalRuleCall_0_5()); 
            // InternalInfoProject.g:2152:2: ( RULE_ID )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalInfoProject.g:2152:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCategoryAccess().getIDTerminalRuleCall_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Group_0__5__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalInfoProject.g:2161:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2165:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalInfoProject.g:2166:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalInfoProject.g:2173:1: rule__Description__Group__0__Impl : ( () ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2177:1: ( ( () ) )
            // InternalInfoProject.g:2178:1: ( () )
            {
            // InternalInfoProject.g:2178:1: ( () )
            // InternalInfoProject.g:2179:2: ()
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 
            // InternalInfoProject.g:2180:2: ()
            // InternalInfoProject.g:2180:3: 
            {
            }

             after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalInfoProject.g:2188:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2192:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalInfoProject.g:2193:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalInfoProject.g:2200:1: rule__Description__Group__1__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2204:1: ( ( 'description:' ) )
            // InternalInfoProject.g:2205:1: ( 'description:' )
            {
            // InternalInfoProject.g:2205:1: ( 'description:' )
            // InternalInfoProject.g:2206:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalInfoProject.g:2215:1: rule__Description__Group__2 : rule__Description__Group__2__Impl rule__Description__Group__3 ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2219:1: ( rule__Description__Group__2__Impl rule__Description__Group__3 )
            // InternalInfoProject.g:2220:2: rule__Description__Group__2__Impl rule__Description__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Description__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalInfoProject.g:2227:1: rule__Description__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2231:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:2232:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:2232:1: ( RULE_SPACE )
            // InternalInfoProject.g:2233:2: RULE_SPACE
            {
             before(grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Description__Group__3"
    // InternalInfoProject.g:2242:1: rule__Description__Group__3 : rule__Description__Group__3__Impl rule__Description__Group__4 ;
    public final void rule__Description__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2246:1: ( rule__Description__Group__3__Impl rule__Description__Group__4 )
            // InternalInfoProject.g:2247:2: rule__Description__Group__3__Impl rule__Description__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Description__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3"


    // $ANTLR start "rule__Description__Group__3__Impl"
    // InternalInfoProject.g:2254:1: rule__Description__Group__3__Impl : ( ( rule__Description__NameAssignment_3 ) ) ;
    public final void rule__Description__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2258:1: ( ( ( rule__Description__NameAssignment_3 ) ) )
            // InternalInfoProject.g:2259:1: ( ( rule__Description__NameAssignment_3 ) )
            {
            // InternalInfoProject.g:2259:1: ( ( rule__Description__NameAssignment_3 ) )
            // InternalInfoProject.g:2260:2: ( rule__Description__NameAssignment_3 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_3()); 
            // InternalInfoProject.g:2261:2: ( rule__Description__NameAssignment_3 )
            // InternalInfoProject.g:2261:3: rule__Description__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__3__Impl"


    // $ANTLR start "rule__Description__Group__4"
    // InternalInfoProject.g:2269:1: rule__Description__Group__4 : rule__Description__Group__4__Impl ;
    public final void rule__Description__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2273:1: ( rule__Description__Group__4__Impl )
            // InternalInfoProject.g:2274:2: rule__Description__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__4"


    // $ANTLR start "rule__Description__Group__4__Impl"
    // InternalInfoProject.g:2280:1: rule__Description__Group__4__Impl : ( ( rule__Description__Group_4__0 )* ) ;
    public final void rule__Description__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2284:1: ( ( ( rule__Description__Group_4__0 )* ) )
            // InternalInfoProject.g:2285:1: ( ( rule__Description__Group_4__0 )* )
            {
            // InternalInfoProject.g:2285:1: ( ( rule__Description__Group_4__0 )* )
            // InternalInfoProject.g:2286:2: ( rule__Description__Group_4__0 )*
            {
             before(grammarAccess.getDescriptionAccess().getGroup_4()); 
            // InternalInfoProject.g:2287:2: ( rule__Description__Group_4__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SPACE) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalInfoProject.g:2287:3: rule__Description__Group_4__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Description__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDescriptionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__4__Impl"


    // $ANTLR start "rule__Description__Group_4__0"
    // InternalInfoProject.g:2296:1: rule__Description__Group_4__0 : rule__Description__Group_4__0__Impl rule__Description__Group_4__1 ;
    public final void rule__Description__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2300:1: ( rule__Description__Group_4__0__Impl rule__Description__Group_4__1 )
            // InternalInfoProject.g:2301:2: rule__Description__Group_4__0__Impl rule__Description__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Description__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_4__0"


    // $ANTLR start "rule__Description__Group_4__0__Impl"
    // InternalInfoProject.g:2308:1: rule__Description__Group_4__0__Impl : ( RULE_SPACE ) ;
    public final void rule__Description__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2312:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:2313:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:2313:1: ( RULE_SPACE )
            // InternalInfoProject.g:2314:2: RULE_SPACE
            {
             before(grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_4_0()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getSPACETerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_4__0__Impl"


    // $ANTLR start "rule__Description__Group_4__1"
    // InternalInfoProject.g:2323:1: rule__Description__Group_4__1 : rule__Description__Group_4__1__Impl ;
    public final void rule__Description__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2327:1: ( rule__Description__Group_4__1__Impl )
            // InternalInfoProject.g:2328:2: rule__Description__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_4__1"


    // $ANTLR start "rule__Description__Group_4__1__Impl"
    // InternalInfoProject.g:2334:1: rule__Description__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__Description__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2338:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:2339:1: ( RULE_ID )
            {
            // InternalInfoProject.g:2339:1: ( RULE_ID )
            // InternalInfoProject.g:2340:2: RULE_ID
            {
             before(grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getIDTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group_4__1__Impl"


    // $ANTLR start "rule__MCS__Group__0"
    // InternalInfoProject.g:2350:1: rule__MCS__Group__0 : rule__MCS__Group__0__Impl rule__MCS__Group__1 ;
    public final void rule__MCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2354:1: ( rule__MCS__Group__0__Impl rule__MCS__Group__1 )
            // InternalInfoProject.g:2355:2: rule__MCS__Group__0__Impl rule__MCS__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__MCS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__0"


    // $ANTLR start "rule__MCS__Group__0__Impl"
    // InternalInfoProject.g:2362:1: rule__MCS__Group__0__Impl : ( () ) ;
    public final void rule__MCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2366:1: ( ( () ) )
            // InternalInfoProject.g:2367:1: ( () )
            {
            // InternalInfoProject.g:2367:1: ( () )
            // InternalInfoProject.g:2368:2: ()
            {
             before(grammarAccess.getMCSAccess().getMCSAction_0()); 
            // InternalInfoProject.g:2369:2: ()
            // InternalInfoProject.g:2369:3: 
            {
            }

             after(grammarAccess.getMCSAccess().getMCSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__0__Impl"


    // $ANTLR start "rule__MCS__Group__1"
    // InternalInfoProject.g:2377:1: rule__MCS__Group__1 : rule__MCS__Group__1__Impl rule__MCS__Group__2 ;
    public final void rule__MCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2381:1: ( rule__MCS__Group__1__Impl rule__MCS__Group__2 )
            // InternalInfoProject.g:2382:2: rule__MCS__Group__1__Impl rule__MCS__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__MCS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MCS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__1"


    // $ANTLR start "rule__MCS__Group__1__Impl"
    // InternalInfoProject.g:2389:1: rule__MCS__Group__1__Impl : ( 'metadataCacheSize: ' ) ;
    public final void rule__MCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2393:1: ( ( 'metadataCacheSize: ' ) )
            // InternalInfoProject.g:2394:1: ( 'metadataCacheSize: ' )
            {
            // InternalInfoProject.g:2394:1: ( 'metadataCacheSize: ' )
            // InternalInfoProject.g:2395:2: 'metadataCacheSize: '
            {
             before(grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__1__Impl"


    // $ANTLR start "rule__MCS__Group__2"
    // InternalInfoProject.g:2404:1: rule__MCS__Group__2 : rule__MCS__Group__2__Impl ;
    public final void rule__MCS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2408:1: ( rule__MCS__Group__2__Impl )
            // InternalInfoProject.g:2409:2: rule__MCS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__2"


    // $ANTLR start "rule__MCS__Group__2__Impl"
    // InternalInfoProject.g:2415:1: rule__MCS__Group__2__Impl : ( ( rule__MCS__NameAssignment_2 )* ) ;
    public final void rule__MCS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2419:1: ( ( ( rule__MCS__NameAssignment_2 )* ) )
            // InternalInfoProject.g:2420:1: ( ( rule__MCS__NameAssignment_2 )* )
            {
            // InternalInfoProject.g:2420:1: ( ( rule__MCS__NameAssignment_2 )* )
            // InternalInfoProject.g:2421:2: ( rule__MCS__NameAssignment_2 )*
            {
             before(grammarAccess.getMCSAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:2422:2: ( rule__MCS__NameAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_EXCEPTION)||(LA17_0>=16 && LA17_0<=22)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalInfoProject.g:2422:3: rule__MCS__NameAssignment_2
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MCS__NameAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMCSAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalInfoProject.g:2431:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2435:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalInfoProject.g:2436:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalInfoProject.g:2443:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2447:1: ( ( () ) )
            // InternalInfoProject.g:2448:1: ( () )
            {
            // InternalInfoProject.g:2448:1: ( () )
            // InternalInfoProject.g:2449:2: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // InternalInfoProject.g:2450:2: ()
            // InternalInfoProject.g:2450:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalInfoProject.g:2458:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2462:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalInfoProject.g:2463:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalInfoProject.g:2470:1: rule__Type__Group__1__Impl : ( 'type:' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2474:1: ( ( 'type:' ) )
            // InternalInfoProject.g:2475:1: ( 'type:' )
            {
            // InternalInfoProject.g:2475:1: ( 'type:' )
            // InternalInfoProject.g:2476:2: 'type:'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalInfoProject.g:2485:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2489:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalInfoProject.g:2490:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalInfoProject.g:2497:1: rule__Type__Group__2__Impl : ( RULE_SPACE ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2501:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:2502:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:2502:1: ( RULE_SPACE )
            // InternalInfoProject.g:2503:2: RULE_SPACE
            {
             before(grammarAccess.getTypeAccess().getSPACETerminalRuleCall_2()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSPACETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalInfoProject.g:2512:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2516:1: ( rule__Type__Group__3__Impl )
            // InternalInfoProject.g:2517:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalInfoProject.g:2523:1: rule__Type__Group__3__Impl : ( ( rule__Type__ValueAssignment_3 ) ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2527:1: ( ( ( rule__Type__ValueAssignment_3 ) ) )
            // InternalInfoProject.g:2528:1: ( ( rule__Type__ValueAssignment_3 ) )
            {
            // InternalInfoProject.g:2528:1: ( ( rule__Type__ValueAssignment_3 ) )
            // InternalInfoProject.g:2529:2: ( rule__Type__ValueAssignment_3 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_3()); 
            // InternalInfoProject.g:2530:2: ( rule__Type__ValueAssignment_3 )
            // InternalInfoProject.g:2530:3: rule__Type__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Type__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__HoldType__Group__0"
    // InternalInfoProject.g:2539:1: rule__HoldType__Group__0 : rule__HoldType__Group__0__Impl rule__HoldType__Group__1 ;
    public final void rule__HoldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2543:1: ( rule__HoldType__Group__0__Impl rule__HoldType__Group__1 )
            // InternalInfoProject.g:2544:2: rule__HoldType__Group__0__Impl rule__HoldType__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__HoldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HoldType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__0"


    // $ANTLR start "rule__HoldType__Group__0__Impl"
    // InternalInfoProject.g:2551:1: rule__HoldType__Group__0__Impl : ( ( ( 'holdType:' ) ) ( ( 'holdType:' )* ) ) ;
    public final void rule__HoldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2555:1: ( ( ( ( 'holdType:' ) ) ( ( 'holdType:' )* ) ) )
            // InternalInfoProject.g:2556:1: ( ( ( 'holdType:' ) ) ( ( 'holdType:' )* ) )
            {
            // InternalInfoProject.g:2556:1: ( ( ( 'holdType:' ) ) ( ( 'holdType:' )* ) )
            // InternalInfoProject.g:2557:2: ( ( 'holdType:' ) ) ( ( 'holdType:' )* )
            {
            // InternalInfoProject.g:2557:2: ( ( 'holdType:' ) )
            // InternalInfoProject.g:2558:3: ( 'holdType:' )
            {
             before(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 
            // InternalInfoProject.g:2559:3: ( 'holdType:' )
            // InternalInfoProject.g:2559:4: 'holdType:'
            {
            match(input,40,FOLLOW_32); 

            }

             after(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 

            }

            // InternalInfoProject.g:2562:2: ( ( 'holdType:' )* )
            // InternalInfoProject.g:2563:3: ( 'holdType:' )*
            {
             before(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 
            // InternalInfoProject.g:2564:3: ( 'holdType:' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalInfoProject.g:2564:4: 'holdType:'
            	    {
            	    match(input,40,FOLLOW_32); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__0__Impl"


    // $ANTLR start "rule__HoldType__Group__1"
    // InternalInfoProject.g:2573:1: rule__HoldType__Group__1 : rule__HoldType__Group__1__Impl rule__HoldType__Group__2 ;
    public final void rule__HoldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2577:1: ( rule__HoldType__Group__1__Impl rule__HoldType__Group__2 )
            // InternalInfoProject.g:2578:2: rule__HoldType__Group__1__Impl rule__HoldType__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__HoldType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HoldType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__1"


    // $ANTLR start "rule__HoldType__Group__1__Impl"
    // InternalInfoProject.g:2585:1: rule__HoldType__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__HoldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2589:1: ( ( RULE_WS ) )
            // InternalInfoProject.g:2590:1: ( RULE_WS )
            {
            // InternalInfoProject.g:2590:1: ( RULE_WS )
            // InternalInfoProject.g:2591:2: RULE_WS
            {
             before(grammarAccess.getHoldTypeAccess().getWSTerminalRuleCall_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getHoldTypeAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__1__Impl"


    // $ANTLR start "rule__HoldType__Group__2"
    // InternalInfoProject.g:2600:1: rule__HoldType__Group__2 : rule__HoldType__Group__2__Impl rule__HoldType__Group__3 ;
    public final void rule__HoldType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2604:1: ( rule__HoldType__Group__2__Impl rule__HoldType__Group__3 )
            // InternalInfoProject.g:2605:2: rule__HoldType__Group__2__Impl rule__HoldType__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__HoldType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HoldType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__2"


    // $ANTLR start "rule__HoldType__Group__2__Impl"
    // InternalInfoProject.g:2612:1: rule__HoldType__Group__2__Impl : ( ( rule__HoldType__FeaturesAssignment_2 )? ) ;
    public final void rule__HoldType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2616:1: ( ( ( rule__HoldType__FeaturesAssignment_2 )? ) )
            // InternalInfoProject.g:2617:1: ( ( rule__HoldType__FeaturesAssignment_2 )? )
            {
            // InternalInfoProject.g:2617:1: ( ( rule__HoldType__FeaturesAssignment_2 )? )
            // InternalInfoProject.g:2618:2: ( rule__HoldType__FeaturesAssignment_2 )?
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:2619:2: ( rule__HoldType__FeaturesAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalInfoProject.g:2619:3: rule__HoldType__FeaturesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__HoldType__FeaturesAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__2__Impl"


    // $ANTLR start "rule__HoldType__Group__3"
    // InternalInfoProject.g:2627:1: rule__HoldType__Group__3 : rule__HoldType__Group__3__Impl ;
    public final void rule__HoldType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2631:1: ( rule__HoldType__Group__3__Impl )
            // InternalInfoProject.g:2632:2: rule__HoldType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HoldType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__3"


    // $ANTLR start "rule__HoldType__Group__3__Impl"
    // InternalInfoProject.g:2638:1: rule__HoldType__Group__3__Impl : ( ( rule__HoldType__FeaturesAssignment_3 ) ) ;
    public final void rule__HoldType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2642:1: ( ( ( rule__HoldType__FeaturesAssignment_3 ) ) )
            // InternalInfoProject.g:2643:1: ( ( rule__HoldType__FeaturesAssignment_3 ) )
            {
            // InternalInfoProject.g:2643:1: ( ( rule__HoldType__FeaturesAssignment_3 ) )
            // InternalInfoProject.g:2644:2: ( rule__HoldType__FeaturesAssignment_3 )
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_3()); 
            // InternalInfoProject.g:2645:2: ( rule__HoldType__FeaturesAssignment_3 )
            // InternalInfoProject.g:2645:3: rule__HoldType__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__HoldType__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__Group__3__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__0"
    // InternalInfoProject.g:2654:1: rule__TypeAttribute__Group__0 : rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1 ;
    public final void rule__TypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2658:1: ( rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1 )
            // InternalInfoProject.g:2659:2: rule__TypeAttribute__Group__0__Impl rule__TypeAttribute__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__0"


    // $ANTLR start "rule__TypeAttribute__Group__0__Impl"
    // InternalInfoProject.g:2666:1: rule__TypeAttribute__Group__0__Impl : ( 'type:' ) ;
    public final void rule__TypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2670:1: ( ( 'type:' ) )
            // InternalInfoProject.g:2671:1: ( 'type:' )
            {
            // InternalInfoProject.g:2671:1: ( 'type:' )
            // InternalInfoProject.g:2672:2: 'type:'
            {
             before(grammarAccess.getTypeAttributeAccess().getTypeKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTypeAttributeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__0__Impl"


    // $ANTLR start "rule__TypeAttribute__Group__1"
    // InternalInfoProject.g:2681:1: rule__TypeAttribute__Group__1 : rule__TypeAttribute__Group__1__Impl ;
    public final void rule__TypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2685:1: ( rule__TypeAttribute__Group__1__Impl )
            // InternalInfoProject.g:2686:2: rule__TypeAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__1"


    // $ANTLR start "rule__TypeAttribute__Group__1__Impl"
    // InternalInfoProject.g:2692:1: rule__TypeAttribute__Group__1__Impl : ( ( rule__TypeAttribute__NameAssignment_1 ) ) ;
    public final void rule__TypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2696:1: ( ( ( rule__TypeAttribute__NameAssignment_1 ) ) )
            // InternalInfoProject.g:2697:1: ( ( rule__TypeAttribute__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:2697:1: ( ( rule__TypeAttribute__NameAssignment_1 ) )
            // InternalInfoProject.g:2698:2: ( rule__TypeAttribute__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAttributeAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:2699:2: ( rule__TypeAttribute__NameAssignment_1 )
            // InternalInfoProject.g:2699:3: rule__TypeAttribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeAttribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // InternalInfoProject.g:2708:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2712:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // InternalInfoProject.g:2713:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // InternalInfoProject.g:2720:1: rule__Include__Group__0__Impl : ( () ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2724:1: ( ( () ) )
            // InternalInfoProject.g:2725:1: ( () )
            {
            // InternalInfoProject.g:2725:1: ( () )
            // InternalInfoProject.g:2726:2: ()
            {
             before(grammarAccess.getIncludeAccess().getIncludeAction_0()); 
            // InternalInfoProject.g:2727:2: ()
            // InternalInfoProject.g:2727:3: 
            {
            }

             after(grammarAccess.getIncludeAccess().getIncludeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // InternalInfoProject.g:2735:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2739:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // InternalInfoProject.g:2740:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // InternalInfoProject.g:2747:1: rule__Include__Group__1__Impl : ( ( ( 'includes:' ) ) ( ( 'includes:' )* ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2751:1: ( ( ( ( 'includes:' ) ) ( ( 'includes:' )* ) ) )
            // InternalInfoProject.g:2752:1: ( ( ( 'includes:' ) ) ( ( 'includes:' )* ) )
            {
            // InternalInfoProject.g:2752:1: ( ( ( 'includes:' ) ) ( ( 'includes:' )* ) )
            // InternalInfoProject.g:2753:2: ( ( 'includes:' ) ) ( ( 'includes:' )* )
            {
            // InternalInfoProject.g:2753:2: ( ( 'includes:' ) )
            // InternalInfoProject.g:2754:3: ( 'includes:' )
            {
             before(grammarAccess.getIncludeAccess().getIncludesKeyword_1()); 
            // InternalInfoProject.g:2755:3: ( 'includes:' )
            // InternalInfoProject.g:2755:4: 'includes:'
            {
            match(input,41,FOLLOW_34); 

            }

             after(grammarAccess.getIncludeAccess().getIncludesKeyword_1()); 

            }

            // InternalInfoProject.g:2758:2: ( ( 'includes:' )* )
            // InternalInfoProject.g:2759:3: ( 'includes:' )*
            {
             before(grammarAccess.getIncludeAccess().getIncludesKeyword_1()); 
            // InternalInfoProject.g:2760:3: ( 'includes:' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalInfoProject.g:2760:4: 'includes:'
            	    {
            	    match(input,41,FOLLOW_34); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getIncludesKeyword_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // InternalInfoProject.g:2769:1: rule__Include__Group__2 : rule__Include__Group__2__Impl rule__Include__Group__3 ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2773:1: ( rule__Include__Group__2__Impl rule__Include__Group__3 )
            // InternalInfoProject.g:2774:2: rule__Include__Group__2__Impl rule__Include__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Include__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Include__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // InternalInfoProject.g:2781:1: rule__Include__Group__2__Impl : ( RULE_WS ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2785:1: ( ( RULE_WS ) )
            // InternalInfoProject.g:2786:1: ( RULE_WS )
            {
            // InternalInfoProject.g:2786:1: ( RULE_WS )
            // InternalInfoProject.g:2787:2: RULE_WS
            {
             before(grammarAccess.getIncludeAccess().getWSTerminalRuleCall_2()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getIncludeAccess().getWSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group__3"
    // InternalInfoProject.g:2796:1: rule__Include__Group__3 : rule__Include__Group__3__Impl ;
    public final void rule__Include__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2800:1: ( rule__Include__Group__3__Impl )
            // InternalInfoProject.g:2801:2: rule__Include__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Include__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__3"


    // $ANTLR start "rule__Include__Group__3__Impl"
    // InternalInfoProject.g:2807:1: rule__Include__Group__3__Impl : ( ( rule__Include__FilesAssignment_3 )* ) ;
    public final void rule__Include__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2811:1: ( ( ( rule__Include__FilesAssignment_3 )* ) )
            // InternalInfoProject.g:2812:1: ( ( rule__Include__FilesAssignment_3 )* )
            {
            // InternalInfoProject.g:2812:1: ( ( rule__Include__FilesAssignment_3 )* )
            // InternalInfoProject.g:2813:2: ( rule__Include__FilesAssignment_3 )*
            {
             before(grammarAccess.getIncludeAccess().getFilesAssignment_3()); 
            // InternalInfoProject.g:2814:2: ( rule__Include__FilesAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalInfoProject.g:2814:3: rule__Include__FilesAssignment_3
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Include__FilesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getFilesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__3__Impl"


    // $ANTLR start "rule__FileDeclaration__Group__0"
    // InternalInfoProject.g:2823:1: rule__FileDeclaration__Group__0 : rule__FileDeclaration__Group__0__Impl rule__FileDeclaration__Group__1 ;
    public final void rule__FileDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2827:1: ( rule__FileDeclaration__Group__0__Impl rule__FileDeclaration__Group__1 )
            // InternalInfoProject.g:2828:2: rule__FileDeclaration__Group__0__Impl rule__FileDeclaration__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__FileDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__0"


    // $ANTLR start "rule__FileDeclaration__Group__0__Impl"
    // InternalInfoProject.g:2835:1: rule__FileDeclaration__Group__0__Impl : ( ( rule__FileDeclaration__Group_0__0 ) ) ;
    public final void rule__FileDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2839:1: ( ( ( rule__FileDeclaration__Group_0__0 ) ) )
            // InternalInfoProject.g:2840:1: ( ( rule__FileDeclaration__Group_0__0 ) )
            {
            // InternalInfoProject.g:2840:1: ( ( rule__FileDeclaration__Group_0__0 ) )
            // InternalInfoProject.g:2841:2: ( rule__FileDeclaration__Group_0__0 )
            {
             before(grammarAccess.getFileDeclarationAccess().getGroup_0()); 
            // InternalInfoProject.g:2842:2: ( rule__FileDeclaration__Group_0__0 )
            // InternalInfoProject.g:2842:3: rule__FileDeclaration__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclarationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__0__Impl"


    // $ANTLR start "rule__FileDeclaration__Group__1"
    // InternalInfoProject.g:2850:1: rule__FileDeclaration__Group__1 : rule__FileDeclaration__Group__1__Impl rule__FileDeclaration__Group__2 ;
    public final void rule__FileDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2854:1: ( rule__FileDeclaration__Group__1__Impl rule__FileDeclaration__Group__2 )
            // InternalInfoProject.g:2855:2: rule__FileDeclaration__Group__1__Impl rule__FileDeclaration__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__FileDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__1"


    // $ANTLR start "rule__FileDeclaration__Group__1__Impl"
    // InternalInfoProject.g:2862:1: rule__FileDeclaration__Group__1__Impl : ( ( rule__FileDeclaration__Group_1__0 )* ) ;
    public final void rule__FileDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2866:1: ( ( ( rule__FileDeclaration__Group_1__0 )* ) )
            // InternalInfoProject.g:2867:1: ( ( rule__FileDeclaration__Group_1__0 )* )
            {
            // InternalInfoProject.g:2867:1: ( ( rule__FileDeclaration__Group_1__0 )* )
            // InternalInfoProject.g:2868:2: ( rule__FileDeclaration__Group_1__0 )*
            {
             before(grammarAccess.getFileDeclarationAccess().getGroup_1()); 
            // InternalInfoProject.g:2869:2: ( rule__FileDeclaration__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==43) ) {
                        alt22=1;
                    }


                }
                else if ( (LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalInfoProject.g:2869:3: rule__FileDeclaration__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__FileDeclaration__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFileDeclarationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__1__Impl"


    // $ANTLR start "rule__FileDeclaration__Group__2"
    // InternalInfoProject.g:2877:1: rule__FileDeclaration__Group__2 : rule__FileDeclaration__Group__2__Impl rule__FileDeclaration__Group__3 ;
    public final void rule__FileDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2881:1: ( rule__FileDeclaration__Group__2__Impl rule__FileDeclaration__Group__3 )
            // InternalInfoProject.g:2882:2: rule__FileDeclaration__Group__2__Impl rule__FileDeclaration__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__FileDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__2"


    // $ANTLR start "rule__FileDeclaration__Group__2__Impl"
    // InternalInfoProject.g:2889:1: rule__FileDeclaration__Group__2__Impl : ( ( rule__FileDeclaration__Group_2__0 )* ) ;
    public final void rule__FileDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2893:1: ( ( ( rule__FileDeclaration__Group_2__0 )* ) )
            // InternalInfoProject.g:2894:1: ( ( rule__FileDeclaration__Group_2__0 )* )
            {
            // InternalInfoProject.g:2894:1: ( ( rule__FileDeclaration__Group_2__0 )* )
            // InternalInfoProject.g:2895:2: ( rule__FileDeclaration__Group_2__0 )*
            {
             before(grammarAccess.getFileDeclarationAccess().getGroup_2()); 
            // InternalInfoProject.g:2896:2: ( rule__FileDeclaration__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalInfoProject.g:2896:3: rule__FileDeclaration__Group_2__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__FileDeclaration__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFileDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FileDeclaration__Group__3"
    // InternalInfoProject.g:2904:1: rule__FileDeclaration__Group__3 : rule__FileDeclaration__Group__3__Impl ;
    public final void rule__FileDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2908:1: ( rule__FileDeclaration__Group__3__Impl )
            // InternalInfoProject.g:2909:2: rule__FileDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__3"


    // $ANTLR start "rule__FileDeclaration__Group__3__Impl"
    // InternalInfoProject.g:2915:1: rule__FileDeclaration__Group__3__Impl : ( ( rule__FileDeclaration__Group_3__0 ) ) ;
    public final void rule__FileDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2919:1: ( ( ( rule__FileDeclaration__Group_3__0 ) ) )
            // InternalInfoProject.g:2920:1: ( ( rule__FileDeclaration__Group_3__0 ) )
            {
            // InternalInfoProject.g:2920:1: ( ( rule__FileDeclaration__Group_3__0 ) )
            // InternalInfoProject.g:2921:2: ( rule__FileDeclaration__Group_3__0 )
            {
             before(grammarAccess.getFileDeclarationAccess().getGroup_3()); 
            // InternalInfoProject.g:2922:2: ( rule__FileDeclaration__Group_3__0 )
            // InternalInfoProject.g:2922:3: rule__FileDeclaration__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclarationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group__3__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_0__0"
    // InternalInfoProject.g:2931:1: rule__FileDeclaration__Group_0__0 : rule__FileDeclaration__Group_0__0__Impl rule__FileDeclaration__Group_0__1 ;
    public final void rule__FileDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2935:1: ( rule__FileDeclaration__Group_0__0__Impl rule__FileDeclaration__Group_0__1 )
            // InternalInfoProject.g:2936:2: rule__FileDeclaration__Group_0__0__Impl rule__FileDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__FileDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_0__0"


    // $ANTLR start "rule__FileDeclaration__Group_0__0__Impl"
    // InternalInfoProject.g:2943:1: rule__FileDeclaration__Group_0__0__Impl : ( '-' ) ;
    public final void rule__FileDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2947:1: ( ( '-' ) )
            // InternalInfoProject.g:2948:1: ( '-' )
            {
            // InternalInfoProject.g:2948:1: ( '-' )
            // InternalInfoProject.g:2949:2: '-'
            {
             before(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileDeclarationAccess().getHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_0__1"
    // InternalInfoProject.g:2958:1: rule__FileDeclaration__Group_0__1 : rule__FileDeclaration__Group_0__1__Impl ;
    public final void rule__FileDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2962:1: ( rule__FileDeclaration__Group_0__1__Impl )
            // InternalInfoProject.g:2963:2: rule__FileDeclaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_0__1"


    // $ANTLR start "rule__FileDeclaration__Group_0__1__Impl"
    // InternalInfoProject.g:2969:1: rule__FileDeclaration__Group_0__1__Impl : ( RULE_SPACE ) ;
    public final void rule__FileDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2973:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:2974:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:2974:1: ( RULE_SPACE )
            // InternalInfoProject.g:2975:2: RULE_SPACE
            {
             before(grammarAccess.getFileDeclarationAccess().getSPACETerminalRuleCall_0_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getFileDeclarationAccess().getSPACETerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_1__0"
    // InternalInfoProject.g:2985:1: rule__FileDeclaration__Group_1__0 : rule__FileDeclaration__Group_1__0__Impl rule__FileDeclaration__Group_1__1 ;
    public final void rule__FileDeclaration__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:2989:1: ( rule__FileDeclaration__Group_1__0__Impl rule__FileDeclaration__Group_1__1 )
            // InternalInfoProject.g:2990:2: rule__FileDeclaration__Group_1__0__Impl rule__FileDeclaration__Group_1__1
            {
            pushFollow(FOLLOW_40);
            rule__FileDeclaration__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_1__0"


    // $ANTLR start "rule__FileDeclaration__Group_1__0__Impl"
    // InternalInfoProject.g:2997:1: rule__FileDeclaration__Group_1__0__Impl : ( ( '/' )? ) ;
    public final void rule__FileDeclaration__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3001:1: ( ( ( '/' )? ) )
            // InternalInfoProject.g:3002:1: ( ( '/' )? )
            {
            // InternalInfoProject.g:3002:1: ( ( '/' )? )
            // InternalInfoProject.g:3003:2: ( '/' )?
            {
             before(grammarAccess.getFileDeclarationAccess().getSolidusKeyword_1_0()); 
            // InternalInfoProject.g:3004:2: ( '/' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalInfoProject.g:3004:3: '/'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFileDeclarationAccess().getSolidusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_1__0__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_1__1"
    // InternalInfoProject.g:3012:1: rule__FileDeclaration__Group_1__1 : rule__FileDeclaration__Group_1__1__Impl ;
    public final void rule__FileDeclaration__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3016:1: ( rule__FileDeclaration__Group_1__1__Impl )
            // InternalInfoProject.g:3017:2: rule__FileDeclaration__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_1__1"


    // $ANTLR start "rule__FileDeclaration__Group_1__1__Impl"
    // InternalInfoProject.g:3023:1: rule__FileDeclaration__Group_1__1__Impl : ( '../' ) ;
    public final void rule__FileDeclaration__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3027:1: ( ( '../' ) )
            // InternalInfoProject.g:3028:1: ( '../' )
            {
            // InternalInfoProject.g:3028:1: ( '../' )
            // InternalInfoProject.g:3029:2: '../'
            {
             before(grammarAccess.getFileDeclarationAccess().getFullStopFullStopSolidusKeyword_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getFileDeclarationAccess().getFullStopFullStopSolidusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_1__1__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_2__0"
    // InternalInfoProject.g:3039:1: rule__FileDeclaration__Group_2__0 : rule__FileDeclaration__Group_2__0__Impl rule__FileDeclaration__Group_2__1 ;
    public final void rule__FileDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3043:1: ( rule__FileDeclaration__Group_2__0__Impl rule__FileDeclaration__Group_2__1 )
            // InternalInfoProject.g:3044:2: rule__FileDeclaration__Group_2__0__Impl rule__FileDeclaration__Group_2__1
            {
            pushFollow(FOLLOW_41);
            rule__FileDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_2__0"


    // $ANTLR start "rule__FileDeclaration__Group_2__0__Impl"
    // InternalInfoProject.g:3051:1: rule__FileDeclaration__Group_2__0__Impl : ( ( rule__FileDeclaration__Alternatives_2_0 )* ) ;
    public final void rule__FileDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3055:1: ( ( ( rule__FileDeclaration__Alternatives_2_0 )* ) )
            // InternalInfoProject.g:3056:1: ( ( rule__FileDeclaration__Alternatives_2_0 )* )
            {
            // InternalInfoProject.g:3056:1: ( ( rule__FileDeclaration__Alternatives_2_0 )* )
            // InternalInfoProject.g:3057:2: ( rule__FileDeclaration__Alternatives_2_0 )*
            {
             before(grammarAccess.getFileDeclarationAccess().getAlternatives_2_0()); 
            // InternalInfoProject.g:3058:2: ( rule__FileDeclaration__Alternatives_2_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=16 && LA25_0<=19)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalInfoProject.g:3058:3: rule__FileDeclaration__Alternatives_2_0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__FileDeclaration__Alternatives_2_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFileDeclarationAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_2__1"
    // InternalInfoProject.g:3066:1: rule__FileDeclaration__Group_2__1 : rule__FileDeclaration__Group_2__1__Impl ;
    public final void rule__FileDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3070:1: ( rule__FileDeclaration__Group_2__1__Impl )
            // InternalInfoProject.g:3071:2: rule__FileDeclaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_2__1"


    // $ANTLR start "rule__FileDeclaration__Group_2__1__Impl"
    // InternalInfoProject.g:3077:1: rule__FileDeclaration__Group_2__1__Impl : ( '/' ) ;
    public final void rule__FileDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3081:1: ( ( '/' ) )
            // InternalInfoProject.g:3082:1: ( '/' )
            {
            // InternalInfoProject.g:3082:1: ( '/' )
            // InternalInfoProject.g:3083:2: '/'
            {
             before(grammarAccess.getFileDeclarationAccess().getSolidusKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFileDeclarationAccess().getSolidusKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_3__0"
    // InternalInfoProject.g:3093:1: rule__FileDeclaration__Group_3__0 : rule__FileDeclaration__Group_3__0__Impl rule__FileDeclaration__Group_3__1 ;
    public final void rule__FileDeclaration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3097:1: ( rule__FileDeclaration__Group_3__0__Impl rule__FileDeclaration__Group_3__1 )
            // InternalInfoProject.g:3098:2: rule__FileDeclaration__Group_3__0__Impl rule__FileDeclaration__Group_3__1
            {
            pushFollow(FOLLOW_37);
            rule__FileDeclaration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__0"


    // $ANTLR start "rule__FileDeclaration__Group_3__0__Impl"
    // InternalInfoProject.g:3105:1: rule__FileDeclaration__Group_3__0__Impl : ( ( rule__FileDeclaration__Alternatives_3_0 )* ) ;
    public final void rule__FileDeclaration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3109:1: ( ( ( rule__FileDeclaration__Alternatives_3_0 )* ) )
            // InternalInfoProject.g:3110:1: ( ( rule__FileDeclaration__Alternatives_3_0 )* )
            {
            // InternalInfoProject.g:3110:1: ( ( rule__FileDeclaration__Alternatives_3_0 )* )
            // InternalInfoProject.g:3111:2: ( rule__FileDeclaration__Alternatives_3_0 )*
            {
             before(grammarAccess.getFileDeclarationAccess().getAlternatives_3_0()); 
            // InternalInfoProject.g:3112:2: ( rule__FileDeclaration__Alternatives_3_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=17 && LA26_0<=19)) ) {
                    alt26=1;
                }
                else if ( (LA26_0==16) ) {
                    int LA26_3 = input.LA(2);

                    if ( (LA26_3==EOF||LA26_3==RULE_ID||(LA26_3>=16 && LA26_3<=19)||LA26_3==22) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // InternalInfoProject.g:3112:3: rule__FileDeclaration__Alternatives_3_0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__FileDeclaration__Alternatives_3_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFileDeclarationAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__0__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_3__1"
    // InternalInfoProject.g:3120:1: rule__FileDeclaration__Group_3__1 : rule__FileDeclaration__Group_3__1__Impl rule__FileDeclaration__Group_3__2 ;
    public final void rule__FileDeclaration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3124:1: ( rule__FileDeclaration__Group_3__1__Impl rule__FileDeclaration__Group_3__2 )
            // InternalInfoProject.g:3125:2: rule__FileDeclaration__Group_3__1__Impl rule__FileDeclaration__Group_3__2
            {
            pushFollow(FOLLOW_37);
            rule__FileDeclaration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__1"


    // $ANTLR start "rule__FileDeclaration__Group_3__1__Impl"
    // InternalInfoProject.g:3132:1: rule__FileDeclaration__Group_3__1__Impl : ( ( '.' )? ) ;
    public final void rule__FileDeclaration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3136:1: ( ( ( '.' )? ) )
            // InternalInfoProject.g:3137:1: ( ( '.' )? )
            {
            // InternalInfoProject.g:3137:1: ( ( '.' )? )
            // InternalInfoProject.g:3138:2: ( '.' )?
            {
             before(grammarAccess.getFileDeclarationAccess().getFullStopKeyword_3_1()); 
            // InternalInfoProject.g:3139:2: ( '.' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalInfoProject.g:3139:3: '.'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFileDeclarationAccess().getFullStopKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__1__Impl"


    // $ANTLR start "rule__FileDeclaration__Group_3__2"
    // InternalInfoProject.g:3147:1: rule__FileDeclaration__Group_3__2 : rule__FileDeclaration__Group_3__2__Impl ;
    public final void rule__FileDeclaration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3151:1: ( rule__FileDeclaration__Group_3__2__Impl )
            // InternalInfoProject.g:3152:2: rule__FileDeclaration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDeclaration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__2"


    // $ANTLR start "rule__FileDeclaration__Group_3__2__Impl"
    // InternalInfoProject.g:3158:1: rule__FileDeclaration__Group_3__2__Impl : ( ( RULE_ID )? ) ;
    public final void rule__FileDeclaration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3162:1: ( ( ( RULE_ID )? ) )
            // InternalInfoProject.g:3163:1: ( ( RULE_ID )? )
            {
            // InternalInfoProject.g:3163:1: ( ( RULE_ID )? )
            // InternalInfoProject.g:3164:2: ( RULE_ID )?
            {
             before(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_2()); 
            // InternalInfoProject.g:3165:2: ( RULE_ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalInfoProject.g:3165:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFileDeclarationAccess().getIDTerminalRuleCall_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDeclaration__Group_3__2__Impl"


    // $ANTLR start "rule__IngestNode__Group__0"
    // InternalInfoProject.g:3174:1: rule__IngestNode__Group__0 : rule__IngestNode__Group__0__Impl rule__IngestNode__Group__1 ;
    public final void rule__IngestNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3178:1: ( rule__IngestNode__Group__0__Impl rule__IngestNode__Group__1 )
            // InternalInfoProject.g:3179:2: rule__IngestNode__Group__0__Impl rule__IngestNode__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__IngestNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__0"


    // $ANTLR start "rule__IngestNode__Group__0__Impl"
    // InternalInfoProject.g:3186:1: rule__IngestNode__Group__0__Impl : ( 'ingestNode:' ) ;
    public final void rule__IngestNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3190:1: ( ( 'ingestNode:' ) )
            // InternalInfoProject.g:3191:1: ( 'ingestNode:' )
            {
            // InternalInfoProject.g:3191:1: ( 'ingestNode:' )
            // InternalInfoProject.g:3192:2: 'ingestNode:'
            {
             before(grammarAccess.getIngestNodeAccess().getIngestNodeKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getIngestNodeAccess().getIngestNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__0__Impl"


    // $ANTLR start "rule__IngestNode__Group__1"
    // InternalInfoProject.g:3201:1: rule__IngestNode__Group__1 : rule__IngestNode__Group__1__Impl rule__IngestNode__Group__2 ;
    public final void rule__IngestNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3205:1: ( rule__IngestNode__Group__1__Impl rule__IngestNode__Group__2 )
            // InternalInfoProject.g:3206:2: rule__IngestNode__Group__1__Impl rule__IngestNode__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__IngestNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__1"


    // $ANTLR start "rule__IngestNode__Group__1__Impl"
    // InternalInfoProject.g:3213:1: rule__IngestNode__Group__1__Impl : ( RULE_WS ) ;
    public final void rule__IngestNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3217:1: ( ( RULE_WS ) )
            // InternalInfoProject.g:3218:1: ( RULE_WS )
            {
            // InternalInfoProject.g:3218:1: ( RULE_WS )
            // InternalInfoProject.g:3219:2: RULE_WS
            {
             before(grammarAccess.getIngestNodeAccess().getWSTerminalRuleCall_1()); 
            match(input,RULE_WS,FOLLOW_2); 
             after(grammarAccess.getIngestNodeAccess().getWSTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__1__Impl"


    // $ANTLR start "rule__IngestNode__Group__2"
    // InternalInfoProject.g:3228:1: rule__IngestNode__Group__2 : rule__IngestNode__Group__2__Impl rule__IngestNode__Group__3 ;
    public final void rule__IngestNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3232:1: ( rule__IngestNode__Group__2__Impl rule__IngestNode__Group__3 )
            // InternalInfoProject.g:3233:2: rule__IngestNode__Group__2__Impl rule__IngestNode__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__IngestNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__2"


    // $ANTLR start "rule__IngestNode__Group__2__Impl"
    // InternalInfoProject.g:3240:1: rule__IngestNode__Group__2__Impl : ( ( rule__IngestNode__FeaturesAssignment_2 ) ) ;
    public final void rule__IngestNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3244:1: ( ( ( rule__IngestNode__FeaturesAssignment_2 ) ) )
            // InternalInfoProject.g:3245:1: ( ( rule__IngestNode__FeaturesAssignment_2 ) )
            {
            // InternalInfoProject.g:3245:1: ( ( rule__IngestNode__FeaturesAssignment_2 ) )
            // InternalInfoProject.g:3246:2: ( rule__IngestNode__FeaturesAssignment_2 )
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:3247:2: ( rule__IngestNode__FeaturesAssignment_2 )
            // InternalInfoProject.g:3247:3: rule__IngestNode__FeaturesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__FeaturesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__2__Impl"


    // $ANTLR start "rule__IngestNode__Group__3"
    // InternalInfoProject.g:3255:1: rule__IngestNode__Group__3 : rule__IngestNode__Group__3__Impl rule__IngestNode__Group__4 ;
    public final void rule__IngestNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3259:1: ( rule__IngestNode__Group__3__Impl rule__IngestNode__Group__4 )
            // InternalInfoProject.g:3260:2: rule__IngestNode__Group__3__Impl rule__IngestNode__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__IngestNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__3"


    // $ANTLR start "rule__IngestNode__Group__3__Impl"
    // InternalInfoProject.g:3267:1: rule__IngestNode__Group__3__Impl : ( ( rule__IngestNode__FeaturesAssignment_3 ) ) ;
    public final void rule__IngestNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3271:1: ( ( ( rule__IngestNode__FeaturesAssignment_3 ) ) )
            // InternalInfoProject.g:3272:1: ( ( rule__IngestNode__FeaturesAssignment_3 ) )
            {
            // InternalInfoProject.g:3272:1: ( ( rule__IngestNode__FeaturesAssignment_3 ) )
            // InternalInfoProject.g:3273:2: ( rule__IngestNode__FeaturesAssignment_3 )
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_3()); 
            // InternalInfoProject.g:3274:2: ( rule__IngestNode__FeaturesAssignment_3 )
            // InternalInfoProject.g:3274:3: rule__IngestNode__FeaturesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__FeaturesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__3__Impl"


    // $ANTLR start "rule__IngestNode__Group__4"
    // InternalInfoProject.g:3282:1: rule__IngestNode__Group__4 : rule__IngestNode__Group__4__Impl rule__IngestNode__Group__5 ;
    public final void rule__IngestNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3286:1: ( rule__IngestNode__Group__4__Impl rule__IngestNode__Group__5 )
            // InternalInfoProject.g:3287:2: rule__IngestNode__Group__4__Impl rule__IngestNode__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__IngestNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__4"


    // $ANTLR start "rule__IngestNode__Group__4__Impl"
    // InternalInfoProject.g:3294:1: rule__IngestNode__Group__4__Impl : ( ( rule__IngestNode__FeaturesAssignment_4 ) ) ;
    public final void rule__IngestNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3298:1: ( ( ( rule__IngestNode__FeaturesAssignment_4 ) ) )
            // InternalInfoProject.g:3299:1: ( ( rule__IngestNode__FeaturesAssignment_4 ) )
            {
            // InternalInfoProject.g:3299:1: ( ( rule__IngestNode__FeaturesAssignment_4 ) )
            // InternalInfoProject.g:3300:2: ( rule__IngestNode__FeaturesAssignment_4 )
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_4()); 
            // InternalInfoProject.g:3301:2: ( rule__IngestNode__FeaturesAssignment_4 )
            // InternalInfoProject.g:3301:3: rule__IngestNode__FeaturesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__FeaturesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__4__Impl"


    // $ANTLR start "rule__IngestNode__Group__5"
    // InternalInfoProject.g:3309:1: rule__IngestNode__Group__5 : rule__IngestNode__Group__5__Impl ;
    public final void rule__IngestNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3313:1: ( rule__IngestNode__Group__5__Impl )
            // InternalInfoProject.g:3314:2: rule__IngestNode__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__5"


    // $ANTLR start "rule__IngestNode__Group__5__Impl"
    // InternalInfoProject.g:3320:1: rule__IngestNode__Group__5__Impl : ( ( rule__IngestNode__FeaturesAssignment_5 ) ) ;
    public final void rule__IngestNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3324:1: ( ( ( rule__IngestNode__FeaturesAssignment_5 ) ) )
            // InternalInfoProject.g:3325:1: ( ( rule__IngestNode__FeaturesAssignment_5 ) )
            {
            // InternalInfoProject.g:3325:1: ( ( rule__IngestNode__FeaturesAssignment_5 ) )
            // InternalInfoProject.g:3326:2: ( rule__IngestNode__FeaturesAssignment_5 )
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_5()); 
            // InternalInfoProject.g:3327:2: ( rule__IngestNode__FeaturesAssignment_5 )
            // InternalInfoProject.g:3327:3: rule__IngestNode__FeaturesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IngestNode__FeaturesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIngestNodeAccess().getFeaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__Group__5__Impl"


    // $ANTLR start "rule__EnumCOD__Group__0"
    // InternalInfoProject.g:3336:1: rule__EnumCOD__Group__0 : rule__EnumCOD__Group__0__Impl rule__EnumCOD__Group__1 ;
    public final void rule__EnumCOD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3340:1: ( rule__EnumCOD__Group__0__Impl rule__EnumCOD__Group__1 )
            // InternalInfoProject.g:3341:2: rule__EnumCOD__Group__0__Impl rule__EnumCOD__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumCOD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCOD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__0"


    // $ANTLR start "rule__EnumCOD__Group__0__Impl"
    // InternalInfoProject.g:3348:1: rule__EnumCOD__Group__0__Impl : ( 'enumerationCutoffDays:' ) ;
    public final void rule__EnumCOD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3352:1: ( ( 'enumerationCutoffDays:' ) )
            // InternalInfoProject.g:3353:1: ( 'enumerationCutoffDays:' )
            {
            // InternalInfoProject.g:3353:1: ( 'enumerationCutoffDays:' )
            // InternalInfoProject.g:3354:2: 'enumerationCutoffDays:'
            {
             before(grammarAccess.getEnumCODAccess().getEnumerationCutoffDaysKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnumCODAccess().getEnumerationCutoffDaysKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__0__Impl"


    // $ANTLR start "rule__EnumCOD__Group__1"
    // InternalInfoProject.g:3363:1: rule__EnumCOD__Group__1 : rule__EnumCOD__Group__1__Impl rule__EnumCOD__Group__2 ;
    public final void rule__EnumCOD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3367:1: ( rule__EnumCOD__Group__1__Impl rule__EnumCOD__Group__2 )
            // InternalInfoProject.g:3368:2: rule__EnumCOD__Group__1__Impl rule__EnumCOD__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EnumCOD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCOD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__1"


    // $ANTLR start "rule__EnumCOD__Group__1__Impl"
    // InternalInfoProject.g:3375:1: rule__EnumCOD__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__EnumCOD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3379:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:3380:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:3380:1: ( RULE_SPACE )
            // InternalInfoProject.g:3381:2: RULE_SPACE
            {
             before(grammarAccess.getEnumCODAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getEnumCODAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__1__Impl"


    // $ANTLR start "rule__EnumCOD__Group__2"
    // InternalInfoProject.g:3390:1: rule__EnumCOD__Group__2 : rule__EnumCOD__Group__2__Impl ;
    public final void rule__EnumCOD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3394:1: ( rule__EnumCOD__Group__2__Impl )
            // InternalInfoProject.g:3395:2: rule__EnumCOD__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCOD__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__2"


    // $ANTLR start "rule__EnumCOD__Group__2__Impl"
    // InternalInfoProject.g:3401:1: rule__EnumCOD__Group__2__Impl : ( ( rule__EnumCOD__NameAssignment_2 ) ) ;
    public final void rule__EnumCOD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3405:1: ( ( ( rule__EnumCOD__NameAssignment_2 ) ) )
            // InternalInfoProject.g:3406:1: ( ( rule__EnumCOD__NameAssignment_2 ) )
            {
            // InternalInfoProject.g:3406:1: ( ( rule__EnumCOD__NameAssignment_2 ) )
            // InternalInfoProject.g:3407:2: ( rule__EnumCOD__NameAssignment_2 )
            {
             before(grammarAccess.getEnumCODAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:3408:2: ( rule__EnumCOD__NameAssignment_2 )
            // InternalInfoProject.g:3408:3: rule__EnumCOD__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumCOD__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumCODAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__Group__2__Impl"


    // $ANTLR start "rule__EnumMR__Group__0"
    // InternalInfoProject.g:3417:1: rule__EnumMR__Group__0 : rule__EnumMR__Group__0__Impl rule__EnumMR__Group__1 ;
    public final void rule__EnumMR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3421:1: ( rule__EnumMR__Group__0__Impl rule__EnumMR__Group__1 )
            // InternalInfoProject.g:3422:2: rule__EnumMR__Group__0__Impl rule__EnumMR__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EnumMR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumMR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__0"


    // $ANTLR start "rule__EnumMR__Group__0__Impl"
    // InternalInfoProject.g:3429:1: rule__EnumMR__Group__0__Impl : ( 'enumerationMinusRunning:' ) ;
    public final void rule__EnumMR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3433:1: ( ( 'enumerationMinusRunning:' ) )
            // InternalInfoProject.g:3434:1: ( 'enumerationMinusRunning:' )
            {
            // InternalInfoProject.g:3434:1: ( 'enumerationMinusRunning:' )
            // InternalInfoProject.g:3435:2: 'enumerationMinusRunning:'
            {
             before(grammarAccess.getEnumMRAccess().getEnumerationMinusRunningKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumMRAccess().getEnumerationMinusRunningKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__0__Impl"


    // $ANTLR start "rule__EnumMR__Group__1"
    // InternalInfoProject.g:3444:1: rule__EnumMR__Group__1 : rule__EnumMR__Group__1__Impl rule__EnumMR__Group__2 ;
    public final void rule__EnumMR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3448:1: ( rule__EnumMR__Group__1__Impl rule__EnumMR__Group__2 )
            // InternalInfoProject.g:3449:2: rule__EnumMR__Group__1__Impl rule__EnumMR__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__EnumMR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumMR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__1"


    // $ANTLR start "rule__EnumMR__Group__1__Impl"
    // InternalInfoProject.g:3456:1: rule__EnumMR__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__EnumMR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3460:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:3461:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:3461:1: ( RULE_SPACE )
            // InternalInfoProject.g:3462:2: RULE_SPACE
            {
             before(grammarAccess.getEnumMRAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getEnumMRAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__1__Impl"


    // $ANTLR start "rule__EnumMR__Group__2"
    // InternalInfoProject.g:3471:1: rule__EnumMR__Group__2 : rule__EnumMR__Group__2__Impl ;
    public final void rule__EnumMR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3475:1: ( rule__EnumMR__Group__2__Impl )
            // InternalInfoProject.g:3476:2: rule__EnumMR__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumMR__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__2"


    // $ANTLR start "rule__EnumMR__Group__2__Impl"
    // InternalInfoProject.g:3482:1: rule__EnumMR__Group__2__Impl : ( ( rule__EnumMR__NameAssignment_2 ) ) ;
    public final void rule__EnumMR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3486:1: ( ( ( rule__EnumMR__NameAssignment_2 ) ) )
            // InternalInfoProject.g:3487:1: ( ( rule__EnumMR__NameAssignment_2 ) )
            {
            // InternalInfoProject.g:3487:1: ( ( rule__EnumMR__NameAssignment_2 ) )
            // InternalInfoProject.g:3488:2: ( rule__EnumMR__NameAssignment_2 )
            {
             before(grammarAccess.getEnumMRAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:3489:2: ( rule__EnumMR__NameAssignment_2 )
            // InternalInfoProject.g:3489:3: rule__EnumMR__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EnumMR__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumMRAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__Group__2__Impl"


    // $ANTLR start "rule__LogLevel__Group__0"
    // InternalInfoProject.g:3498:1: rule__LogLevel__Group__0 : rule__LogLevel__Group__0__Impl rule__LogLevel__Group__1 ;
    public final void rule__LogLevel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3502:1: ( rule__LogLevel__Group__0__Impl rule__LogLevel__Group__1 )
            // InternalInfoProject.g:3503:2: rule__LogLevel__Group__0__Impl rule__LogLevel__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__LogLevel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogLevel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__0"


    // $ANTLR start "rule__LogLevel__Group__0__Impl"
    // InternalInfoProject.g:3510:1: rule__LogLevel__Group__0__Impl : ( 'logLevel:' ) ;
    public final void rule__LogLevel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3514:1: ( ( 'logLevel:' ) )
            // InternalInfoProject.g:3515:1: ( 'logLevel:' )
            {
            // InternalInfoProject.g:3515:1: ( 'logLevel:' )
            // InternalInfoProject.g:3516:2: 'logLevel:'
            {
             before(grammarAccess.getLogLevelAccess().getLogLevelKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLogLevelAccess().getLogLevelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__0__Impl"


    // $ANTLR start "rule__LogLevel__Group__1"
    // InternalInfoProject.g:3525:1: rule__LogLevel__Group__1 : rule__LogLevel__Group__1__Impl rule__LogLevel__Group__2 ;
    public final void rule__LogLevel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3529:1: ( rule__LogLevel__Group__1__Impl rule__LogLevel__Group__2 )
            // InternalInfoProject.g:3530:2: rule__LogLevel__Group__1__Impl rule__LogLevel__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__LogLevel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogLevel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__1"


    // $ANTLR start "rule__LogLevel__Group__1__Impl"
    // InternalInfoProject.g:3537:1: rule__LogLevel__Group__1__Impl : ( RULE_SPACE ) ;
    public final void rule__LogLevel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3541:1: ( ( RULE_SPACE ) )
            // InternalInfoProject.g:3542:1: ( RULE_SPACE )
            {
            // InternalInfoProject.g:3542:1: ( RULE_SPACE )
            // InternalInfoProject.g:3543:2: RULE_SPACE
            {
             before(grammarAccess.getLogLevelAccess().getSPACETerminalRuleCall_1()); 
            match(input,RULE_SPACE,FOLLOW_2); 
             after(grammarAccess.getLogLevelAccess().getSPACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__1__Impl"


    // $ANTLR start "rule__LogLevel__Group__2"
    // InternalInfoProject.g:3552:1: rule__LogLevel__Group__2 : rule__LogLevel__Group__2__Impl ;
    public final void rule__LogLevel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3556:1: ( rule__LogLevel__Group__2__Impl )
            // InternalInfoProject.g:3557:2: rule__LogLevel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__2"


    // $ANTLR start "rule__LogLevel__Group__2__Impl"
    // InternalInfoProject.g:3563:1: rule__LogLevel__Group__2__Impl : ( ( rule__LogLevel__NameAssignment_2 ) ) ;
    public final void rule__LogLevel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3567:1: ( ( ( rule__LogLevel__NameAssignment_2 ) ) )
            // InternalInfoProject.g:3568:1: ( ( rule__LogLevel__NameAssignment_2 ) )
            {
            // InternalInfoProject.g:3568:1: ( ( rule__LogLevel__NameAssignment_2 ) )
            // InternalInfoProject.g:3569:2: ( rule__LogLevel__NameAssignment_2 )
            {
             before(grammarAccess.getLogLevelAccess().getNameAssignment_2()); 
            // InternalInfoProject.g:3570:2: ( rule__LogLevel__NameAssignment_2 )
            // InternalInfoProject.g:3570:3: rule__LogLevel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLogLevelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementAssignment_0"
    // InternalInfoProject.g:3579:1: rule__Model__ElementAssignment_0 : ( ruleVersion ) ;
    public final void rule__Model__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3583:1: ( ( ruleVersion ) )
            // InternalInfoProject.g:3584:2: ( ruleVersion )
            {
            // InternalInfoProject.g:3584:2: ( ruleVersion )
            // InternalInfoProject.g:3585:3: ruleVersion
            {
             before(grammarAccess.getModelAccess().getElementVersionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementVersionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_0"


    // $ANTLR start "rule__Model__ElementAssignment_1"
    // InternalInfoProject.g:3594:1: rule__Model__ElementAssignment_1 : ( ruleNamespace ) ;
    public final void rule__Model__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3598:1: ( ( ruleNamespace ) )
            // InternalInfoProject.g:3599:2: ( ruleNamespace )
            {
            // InternalInfoProject.g:3599:2: ( ruleNamespace )
            // InternalInfoProject.g:3600:3: ruleNamespace
            {
             before(grammarAccess.getModelAccess().getElementNamespaceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementNamespaceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_1"


    // $ANTLR start "rule__Model__ElementAssignment_2"
    // InternalInfoProject.g:3609:1: rule__Model__ElementAssignment_2 : ( ruleTenant ) ;
    public final void rule__Model__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3613:1: ( ( ruleTenant ) )
            // InternalInfoProject.g:3614:2: ( ruleTenant )
            {
            // InternalInfoProject.g:3614:2: ( ruleTenant )
            // InternalInfoProject.g:3615:3: ruleTenant
            {
             before(grammarAccess.getModelAccess().getElementTenantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTenant();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementTenantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_2"


    // $ANTLR start "rule__Model__ElementAssignment_3"
    // InternalInfoProject.g:3624:1: rule__Model__ElementAssignment_3 : ( ruleApplication ) ;
    public final void rule__Model__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3628:1: ( ( ruleApplication ) )
            // InternalInfoProject.g:3629:2: ( ruleApplication )
            {
            // InternalInfoProject.g:3629:2: ( ruleApplication )
            // InternalInfoProject.g:3630:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_3"


    // $ANTLR start "rule__Model__ElementAssignment_4"
    // InternalInfoProject.g:3639:1: rule__Model__ElementAssignment_4 : ( ruleHold ) ;
    public final void rule__Model__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3643:1: ( ( ruleHold ) )
            // InternalInfoProject.g:3644:2: ( ruleHold )
            {
            // InternalInfoProject.g:3644:2: ( ruleHold )
            // InternalInfoProject.g:3645:3: ruleHold
            {
             before(grammarAccess.getModelAccess().getElementHoldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHold();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementHoldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_4"


    // $ANTLR start "rule__Model__ElementAssignment_5"
    // InternalInfoProject.g:3654:1: rule__Model__ElementAssignment_5 : ( ruleIngestNode ) ;
    public final void rule__Model__ElementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3658:1: ( ( ruleIngestNode ) )
            // InternalInfoProject.g:3659:2: ( ruleIngestNode )
            {
            // InternalInfoProject.g:3659:2: ( ruleIngestNode )
            // InternalInfoProject.g:3660:3: ruleIngestNode
            {
             before(grammarAccess.getModelAccess().getElementIngestNodeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIngestNode();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementIngestNodeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_5"


    // $ANTLR start "rule__Model__ElementAssignment_6"
    // InternalInfoProject.g:3669:1: rule__Model__ElementAssignment_6 : ( ruleInclude ) ;
    public final void rule__Model__ElementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3673:1: ( ( ruleInclude ) )
            // InternalInfoProject.g:3674:2: ( ruleInclude )
            {
            // InternalInfoProject.g:3674:2: ( ruleInclude )
            // InternalInfoProject.g:3675:3: ruleInclude
            {
             before(grammarAccess.getModelAccess().getElementIncludeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementIncludeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment_6"


    // $ANTLR start "rule__Version__NameAssignment_2"
    // InternalInfoProject.g:3684:1: rule__Version__NameAssignment_2 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__Version__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3688:1: ( ( RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:3689:2: ( RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:3689:2: ( RULE_VERSION_NUMBER )
            // InternalInfoProject.g:3690:3: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__NameAssignment_2"


    // $ANTLR start "rule__Namespace__FeatureAssignment_1"
    // InternalInfoProject.g:3699:1: rule__Namespace__FeatureAssignment_1 : ( rulePrefix ) ;
    public final void rule__Namespace__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3703:1: ( ( rulePrefix ) )
            // InternalInfoProject.g:3704:2: ( rulePrefix )
            {
            // InternalInfoProject.g:3704:2: ( rulePrefix )
            // InternalInfoProject.g:3705:3: rulePrefix
            {
             before(grammarAccess.getNamespaceAccess().getFeaturePrefixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getFeaturePrefixParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__FeatureAssignment_1"


    // $ANTLR start "rule__Namespace__FeatureAssignment_2"
    // InternalInfoProject.g:3714:1: rule__Namespace__FeatureAssignment_2 : ( ruleUri ) ;
    public final void rule__Namespace__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3718:1: ( ( ruleUri ) )
            // InternalInfoProject.g:3719:2: ( ruleUri )
            {
            // InternalInfoProject.g:3719:2: ( ruleUri )
            // InternalInfoProject.g:3720:3: ruleUri
            {
             before(grammarAccess.getNamespaceAccess().getFeatureUriParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getFeatureUriParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__FeatureAssignment_2"


    // $ANTLR start "rule__Prefix__NameAssignment_1"
    // InternalInfoProject.g:3729:1: rule__Prefix__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prefix__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3733:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:3734:2: ( RULE_ID )
            {
            // InternalInfoProject.g:3734:2: ( RULE_ID )
            // InternalInfoProject.g:3735:3: RULE_ID
            {
             before(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrefixAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__NameAssignment_1"


    // $ANTLR start "rule__Uri__NameAssignment_3"
    // InternalInfoProject.g:3744:1: rule__Uri__NameAssignment_3 : ( ( rule__Uri__NameAlternatives_3_0 ) ) ;
    public final void rule__Uri__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3748:1: ( ( ( rule__Uri__NameAlternatives_3_0 ) ) )
            // InternalInfoProject.g:3749:2: ( ( rule__Uri__NameAlternatives_3_0 ) )
            {
            // InternalInfoProject.g:3749:2: ( ( rule__Uri__NameAlternatives_3_0 ) )
            // InternalInfoProject.g:3750:3: ( rule__Uri__NameAlternatives_3_0 )
            {
             before(grammarAccess.getUriAccess().getNameAlternatives_3_0()); 
            // InternalInfoProject.g:3751:3: ( rule__Uri__NameAlternatives_3_0 )
            // InternalInfoProject.g:3751:4: rule__Uri__NameAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Uri__NameAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getUriAccess().getNameAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uri__NameAssignment_3"


    // $ANTLR start "rule__FeatureName__NameAssignment_2"
    // InternalInfoProject.g:3759:1: rule__FeatureName__NameAssignment_2 : ( ( rule__FeatureName__NameAlternatives_2_0 ) ) ;
    public final void rule__FeatureName__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3763:1: ( ( ( rule__FeatureName__NameAlternatives_2_0 ) ) )
            // InternalInfoProject.g:3764:2: ( ( rule__FeatureName__NameAlternatives_2_0 ) )
            {
            // InternalInfoProject.g:3764:2: ( ( rule__FeatureName__NameAlternatives_2_0 ) )
            // InternalInfoProject.g:3765:3: ( rule__FeatureName__NameAlternatives_2_0 )
            {
             before(grammarAccess.getFeatureNameAccess().getNameAlternatives_2_0()); 
            // InternalInfoProject.g:3766:3: ( rule__FeatureName__NameAlternatives_2_0 )
            // InternalInfoProject.g:3766:4: rule__FeatureName__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureName__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameAccess().getNameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureName__NameAssignment_2"


    // $ANTLR start "rule__Application__Features1Assignment_1"
    // InternalInfoProject.g:3774:1: rule__Application__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Application__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3778:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:3779:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:3779:2: ( ruleFeatureName )
            // InternalInfoProject.g:3780:3: ruleFeatureName
            {
             before(grammarAccess.getApplicationAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Features1Assignment_1"


    // $ANTLR start "rule__Application__FeaturesAssignment_2"
    // InternalInfoProject.g:3789:1: rule__Application__FeaturesAssignment_2 : ( ruleArchiveType ) ;
    public final void rule__Application__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3793:1: ( ( ruleArchiveType ) )
            // InternalInfoProject.g:3794:2: ( ruleArchiveType )
            {
            // InternalInfoProject.g:3794:2: ( ruleArchiveType )
            // InternalInfoProject.g:3795:3: ruleArchiveType
            {
             before(grammarAccess.getApplicationAccess().getFeaturesArchiveTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArchiveType();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeaturesArchiveTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FeaturesAssignment_2"


    // $ANTLR start "rule__Application__FeatureAssignment_3"
    // InternalInfoProject.g:3804:1: rule__Application__FeatureAssignment_3 : ( ruleCategory ) ;
    public final void rule__Application__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3808:1: ( ( ruleCategory ) )
            // InternalInfoProject.g:3809:2: ( ruleCategory )
            {
            // InternalInfoProject.g:3809:2: ( ruleCategory )
            // InternalInfoProject.g:3810:3: ruleCategory
            {
             before(grammarAccess.getApplicationAccess().getFeatureCategoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeatureCategoryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FeatureAssignment_3"


    // $ANTLR start "rule__Application__FeatureAssignment_4"
    // InternalInfoProject.g:3819:1: rule__Application__FeatureAssignment_4 : ( ruleDescription ) ;
    public final void rule__Application__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3823:1: ( ( ruleDescription ) )
            // InternalInfoProject.g:3824:2: ( ruleDescription )
            {
            // InternalInfoProject.g:3824:2: ( ruleDescription )
            // InternalInfoProject.g:3825:3: ruleDescription
            {
             before(grammarAccess.getApplicationAccess().getFeatureDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeatureDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FeatureAssignment_4"


    // $ANTLR start "rule__Application__FeatureAssignment_5"
    // InternalInfoProject.g:3834:1: rule__Application__FeatureAssignment_5 : ( ruleMCS ) ;
    public final void rule__Application__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3838:1: ( ( ruleMCS ) )
            // InternalInfoProject.g:3839:2: ( ruleMCS )
            {
            // InternalInfoProject.g:3839:2: ( ruleMCS )
            // InternalInfoProject.g:3840:3: ruleMCS
            {
             before(grammarAccess.getApplicationAccess().getFeatureMCSParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMCS();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeatureMCSParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FeatureAssignment_5"


    // $ANTLR start "rule__Application__FeatureAssignment_6"
    // InternalInfoProject.g:3849:1: rule__Application__FeatureAssignment_6 : ( ruleType ) ;
    public final void rule__Application__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3853:1: ( ( ruleType ) )
            // InternalInfoProject.g:3854:2: ( ruleType )
            {
            // InternalInfoProject.g:3854:2: ( ruleType )
            // InternalInfoProject.g:3855:3: ruleType
            {
             before(grammarAccess.getApplicationAccess().getFeatureTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeatureTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__FeatureAssignment_6"


    // $ANTLR start "rule__Tenant__Features1Assignment_1"
    // InternalInfoProject.g:3864:1: rule__Tenant__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Tenant__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3868:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:3869:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:3869:2: ( ruleFeatureName )
            // InternalInfoProject.g:3870:3: ruleFeatureName
            {
             before(grammarAccess.getTenantAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getTenantAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tenant__Features1Assignment_1"


    // $ANTLR start "rule__Hold__Features1Assignment_1"
    // InternalInfoProject.g:3879:1: rule__Hold__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Hold__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3883:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:3884:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:3884:2: ( ruleFeatureName )
            // InternalInfoProject.g:3885:3: ruleFeatureName
            {
             before(grammarAccess.getHoldAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getHoldAccess().getFeatures1FeatureNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__Features1Assignment_1"


    // $ANTLR start "rule__Hold__FeaturesAssignment_2"
    // InternalInfoProject.g:3894:1: rule__Hold__FeaturesAssignment_2 : ( ruleHoldType ) ;
    public final void rule__Hold__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3898:1: ( ( ruleHoldType ) )
            // InternalInfoProject.g:3899:2: ( ruleHoldType )
            {
            // InternalInfoProject.g:3899:2: ( ruleHoldType )
            // InternalInfoProject.g:3900:3: ruleHoldType
            {
             before(grammarAccess.getHoldAccess().getFeaturesHoldTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHoldType();

            state._fsp--;

             after(grammarAccess.getHoldAccess().getFeaturesHoldTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hold__FeaturesAssignment_2"


    // $ANTLR start "rule__ArchiveType__ValueAssignment_1"
    // InternalInfoProject.g:3909:1: rule__ArchiveType__ValueAssignment_1 : ( ruleenumOfArchiveType ) ;
    public final void rule__ArchiveType__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3913:1: ( ( ruleenumOfArchiveType ) )
            // InternalInfoProject.g:3914:2: ( ruleenumOfArchiveType )
            {
            // InternalInfoProject.g:3914:2: ( ruleenumOfArchiveType )
            // InternalInfoProject.g:3915:3: ruleenumOfArchiveType
            {
             before(grammarAccess.getArchiveTypeAccess().getValueEnumOfArchiveTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleenumOfArchiveType();

            state._fsp--;

             after(grammarAccess.getArchiveTypeAccess().getValueEnumOfArchiveTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArchiveType__ValueAssignment_1"


    // $ANTLR start "rule__Category__NameAssignment_0_3"
    // InternalInfoProject.g:3924:1: rule__Category__NameAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3928:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:3929:2: ( RULE_ID )
            {
            // InternalInfoProject.g:3929:2: ( RULE_ID )
            // InternalInfoProject.g:3930:3: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__NameAssignment_0_3"


    // $ANTLR start "rule__Description__NameAssignment_3"
    // InternalInfoProject.g:3939:1: rule__Description__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Description__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3943:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:3944:2: ( RULE_ID )
            {
            // InternalInfoProject.g:3944:2: ( RULE_ID )
            // InternalInfoProject.g:3945:3: RULE_ID
            {
             before(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_3"


    // $ANTLR start "rule__MCS__NameAssignment_2"
    // InternalInfoProject.g:3954:1: rule__MCS__NameAssignment_2 : ( ( rule__MCS__NameAlternatives_2_0 ) ) ;
    public final void rule__MCS__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3958:1: ( ( ( rule__MCS__NameAlternatives_2_0 ) ) )
            // InternalInfoProject.g:3959:2: ( ( rule__MCS__NameAlternatives_2_0 ) )
            {
            // InternalInfoProject.g:3959:2: ( ( rule__MCS__NameAlternatives_2_0 ) )
            // InternalInfoProject.g:3960:3: ( rule__MCS__NameAlternatives_2_0 )
            {
             before(grammarAccess.getMCSAccess().getNameAlternatives_2_0()); 
            // InternalInfoProject.g:3961:3: ( rule__MCS__NameAlternatives_2_0 )
            // InternalInfoProject.g:3961:4: rule__MCS__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MCS__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMCSAccess().getNameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MCS__NameAssignment_2"


    // $ANTLR start "rule__Type__ValueAssignment_3"
    // InternalInfoProject.g:3969:1: rule__Type__ValueAssignment_3 : ( ruleenumOfTypes ) ;
    public final void rule__Type__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3973:1: ( ( ruleenumOfTypes ) )
            // InternalInfoProject.g:3974:2: ( ruleenumOfTypes )
            {
            // InternalInfoProject.g:3974:2: ( ruleenumOfTypes )
            // InternalInfoProject.g:3975:3: ruleenumOfTypes
            {
             before(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleenumOfTypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__ValueAssignment_3"


    // $ANTLR start "rule__HoldType__FeaturesAssignment_2"
    // InternalInfoProject.g:3984:1: rule__HoldType__FeaturesAssignment_2 : ( ruleFeatureName ) ;
    public final void rule__HoldType__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:3988:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:3989:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:3989:2: ( ruleFeatureName )
            // InternalInfoProject.g:3990:3: ruleFeatureName
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesFeatureNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getHoldTypeAccess().getFeaturesFeatureNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__FeaturesAssignment_2"


    // $ANTLR start "rule__HoldType__FeaturesAssignment_3"
    // InternalInfoProject.g:3999:1: rule__HoldType__FeaturesAssignment_3 : ( ruleTypeAttribute ) ;
    public final void rule__HoldType__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4003:1: ( ( ruleTypeAttribute ) )
            // InternalInfoProject.g:4004:2: ( ruleTypeAttribute )
            {
            // InternalInfoProject.g:4004:2: ( ruleTypeAttribute )
            // InternalInfoProject.g:4005:3: ruleTypeAttribute
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesTypeAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeAttribute();

            state._fsp--;

             after(grammarAccess.getHoldTypeAccess().getFeaturesTypeAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HoldType__FeaturesAssignment_3"


    // $ANTLR start "rule__TypeAttribute__NameAssignment_1"
    // InternalInfoProject.g:4014:1: rule__TypeAttribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeAttribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4018:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:4019:2: ( RULE_ID )
            {
            // InternalInfoProject.g:4019:2: ( RULE_ID )
            // InternalInfoProject.g:4020:3: RULE_ID
            {
             before(grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeAttribute__NameAssignment_1"


    // $ANTLR start "rule__Include__FilesAssignment_3"
    // InternalInfoProject.g:4029:1: rule__Include__FilesAssignment_3 : ( ruleFileDeclaration ) ;
    public final void rule__Include__FilesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4033:1: ( ( ruleFileDeclaration ) )
            // InternalInfoProject.g:4034:2: ( ruleFileDeclaration )
            {
            // InternalInfoProject.g:4034:2: ( ruleFileDeclaration )
            // InternalInfoProject.g:4035:3: ruleFileDeclaration
            {
             before(grammarAccess.getIncludeAccess().getFilesFileDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFileDeclaration();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getFilesFileDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__FilesAssignment_3"


    // $ANTLR start "rule__IngestNode__FeaturesAssignment_2"
    // InternalInfoProject.g:4044:1: rule__IngestNode__FeaturesAssignment_2 : ( ruleFeatureName ) ;
    public final void rule__IngestNode__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4048:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:4049:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:4049:2: ( ruleFeatureName )
            // InternalInfoProject.g:4050:3: ruleFeatureName
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesFeatureNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureName();

            state._fsp--;

             after(grammarAccess.getIngestNodeAccess().getFeaturesFeatureNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__FeaturesAssignment_2"


    // $ANTLR start "rule__IngestNode__FeaturesAssignment_3"
    // InternalInfoProject.g:4059:1: rule__IngestNode__FeaturesAssignment_3 : ( ruleEnumCOD ) ;
    public final void rule__IngestNode__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4063:1: ( ( ruleEnumCOD ) )
            // InternalInfoProject.g:4064:2: ( ruleEnumCOD )
            {
            // InternalInfoProject.g:4064:2: ( ruleEnumCOD )
            // InternalInfoProject.g:4065:3: ruleEnumCOD
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesEnumCODParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumCOD();

            state._fsp--;

             after(grammarAccess.getIngestNodeAccess().getFeaturesEnumCODParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__FeaturesAssignment_3"


    // $ANTLR start "rule__IngestNode__FeaturesAssignment_4"
    // InternalInfoProject.g:4074:1: rule__IngestNode__FeaturesAssignment_4 : ( ruleEnumMR ) ;
    public final void rule__IngestNode__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4078:1: ( ( ruleEnumMR ) )
            // InternalInfoProject.g:4079:2: ( ruleEnumMR )
            {
            // InternalInfoProject.g:4079:2: ( ruleEnumMR )
            // InternalInfoProject.g:4080:3: ruleEnumMR
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesEnumMRParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumMR();

            state._fsp--;

             after(grammarAccess.getIngestNodeAccess().getFeaturesEnumMRParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__FeaturesAssignment_4"


    // $ANTLR start "rule__IngestNode__FeaturesAssignment_5"
    // InternalInfoProject.g:4089:1: rule__IngestNode__FeaturesAssignment_5 : ( ruleLogLevel ) ;
    public final void rule__IngestNode__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4093:1: ( ( ruleLogLevel ) )
            // InternalInfoProject.g:4094:2: ( ruleLogLevel )
            {
            // InternalInfoProject.g:4094:2: ( ruleLogLevel )
            // InternalInfoProject.g:4095:3: ruleLogLevel
            {
             before(grammarAccess.getIngestNodeAccess().getFeaturesLogLevelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLogLevel();

            state._fsp--;

             after(grammarAccess.getIngestNodeAccess().getFeaturesLogLevelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IngestNode__FeaturesAssignment_5"


    // $ANTLR start "rule__EnumCOD__NameAssignment_2"
    // InternalInfoProject.g:4104:1: rule__EnumCOD__NameAssignment_2 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__EnumCOD__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4108:1: ( ( RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:4109:2: ( RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:4109:2: ( RULE_VERSION_NUMBER )
            // InternalInfoProject.g:4110:3: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getEnumCODAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
             after(grammarAccess.getEnumCODAccess().getNameVERSION_NUMBERTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCOD__NameAssignment_2"


    // $ANTLR start "rule__EnumMR__NameAssignment_2"
    // InternalInfoProject.g:4119:1: rule__EnumMR__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__EnumMR__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4123:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:4124:2: ( RULE_ID )
            {
            // InternalInfoProject.g:4124:2: ( RULE_ID )
            // InternalInfoProject.g:4125:3: RULE_ID
            {
             before(grammarAccess.getEnumMRAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumMRAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumMR__NameAssignment_2"


    // $ANTLR start "rule__LogLevel__NameAssignment_2"
    // InternalInfoProject.g:4134:1: rule__LogLevel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LogLevel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:4138:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:4139:2: ( RULE_ID )
            {
            // InternalInfoProject.g:4139:2: ( RULE_ID )
            // InternalInfoProject.g:4140:3: RULE_ID
            {
             before(grammarAccess.getLogLevelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLogLevelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__NameAssignment_2"

    // Delegated rules


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\10\uffff";
    static final String dfa_2s = "\6\6\2\uffff";
    static final String dfa_3s = "\6\4\2\uffff";
    static final String dfa_4s = "\6\52\2\uffff";
    static final String dfa_5s = "\6\uffff\1\2\1\1";
    static final String dfa_6s = "\10\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
            "\1\1\3\uffff\1\6\7\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
            "\1\1\13\uffff\1\2\1\3\1\4\1\5\2\uffff\1\6\23\uffff\1\7",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 2896:2: ( rule__FileDeclaration__Group_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000B2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007F0030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000007F0032L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000007F0070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000007F0072L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000010000000B0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000C00004F0010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000400000F0012L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000400000F0010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000F0012L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});

}