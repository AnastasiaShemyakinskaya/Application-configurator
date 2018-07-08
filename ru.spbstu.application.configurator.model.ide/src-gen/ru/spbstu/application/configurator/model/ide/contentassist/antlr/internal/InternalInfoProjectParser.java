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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION_NUMBER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sip'", "'table'", "'active archiving'", "'app decomm'", "'version:'", "'name: '", "'application:'", "'tenant:'", "'hold:'", "'archiveType:'", "'category:'", "'description:'", "'metadataCacheSize:'", "'type:'", "'holdType:'"
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
        try {
            // InternalInfoProject.g:54:1: ( ruleModel EOF )
            // InternalInfoProject.g:55:1: ruleModel EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalInfoProject.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalInfoProject.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalInfoProject.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalInfoProject.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalInfoProject.g:69:3: ( rule__Model__Group__0 )
            // InternalInfoProject.g:69:4: rule__Model__Group__0
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

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVersion"
    // InternalInfoProject.g:78:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalInfoProject.g:79:1: ( ruleVersion EOF )
            // InternalInfoProject.g:80:1: ruleVersion EOF
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
    // InternalInfoProject.g:87:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:91:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalInfoProject.g:92:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalInfoProject.g:92:2: ( ( rule__Version__Group__0 ) )
            // InternalInfoProject.g:93:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalInfoProject.g:94:3: ( rule__Version__Group__0 )
            // InternalInfoProject.g:94:4: rule__Version__Group__0
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


    // $ANTLR start "entryRuleFeatureName"
    // InternalInfoProject.g:103:1: entryRuleFeatureName : ruleFeatureName EOF ;
    public final void entryRuleFeatureName() throws RecognitionException {
        try {
            // InternalInfoProject.g:104:1: ( ruleFeatureName EOF )
            // InternalInfoProject.g:105:1: ruleFeatureName EOF
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
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureName"


    // $ANTLR start "ruleFeatureName"
    // InternalInfoProject.g:112:1: ruleFeatureName : ( ( rule__FeatureName__Group__0 ) ) ;
    public final void ruleFeatureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:116:2: ( ( ( rule__FeatureName__Group__0 ) ) )
            // InternalInfoProject.g:117:2: ( ( rule__FeatureName__Group__0 ) )
            {
            // InternalInfoProject.g:117:2: ( ( rule__FeatureName__Group__0 ) )
            // InternalInfoProject.g:118:3: ( rule__FeatureName__Group__0 )
            {
             before(grammarAccess.getFeatureNameAccess().getGroup()); 
            // InternalInfoProject.g:119:3: ( rule__FeatureName__Group__0 )
            // InternalInfoProject.g:119:4: rule__FeatureName__Group__0
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

        }
        return ;
    }
    // $ANTLR end "ruleFeatureName"


    // $ANTLR start "entryRuleApplication"
    // InternalInfoProject.g:128:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalInfoProject.g:129:1: ( ruleApplication EOF )
            // InternalInfoProject.g:130:1: ruleApplication EOF
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
    // InternalInfoProject.g:137:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:141:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalInfoProject.g:142:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalInfoProject.g:142:2: ( ( rule__Application__Group__0 ) )
            // InternalInfoProject.g:143:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalInfoProject.g:144:3: ( rule__Application__Group__0 )
            // InternalInfoProject.g:144:4: rule__Application__Group__0
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
    // InternalInfoProject.g:153:1: entryRuleTenant : ruleTenant EOF ;
    public final void entryRuleTenant() throws RecognitionException {
        try {
            // InternalInfoProject.g:154:1: ( ruleTenant EOF )
            // InternalInfoProject.g:155:1: ruleTenant EOF
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
    // InternalInfoProject.g:162:1: ruleTenant : ( ( rule__Tenant__Group__0 ) ) ;
    public final void ruleTenant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:166:2: ( ( ( rule__Tenant__Group__0 ) ) )
            // InternalInfoProject.g:167:2: ( ( rule__Tenant__Group__0 ) )
            {
            // InternalInfoProject.g:167:2: ( ( rule__Tenant__Group__0 ) )
            // InternalInfoProject.g:168:3: ( rule__Tenant__Group__0 )
            {
             before(grammarAccess.getTenantAccess().getGroup()); 
            // InternalInfoProject.g:169:3: ( rule__Tenant__Group__0 )
            // InternalInfoProject.g:169:4: rule__Tenant__Group__0
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
    // InternalInfoProject.g:178:1: entryRuleHold : ruleHold EOF ;
    public final void entryRuleHold() throws RecognitionException {
        try {
            // InternalInfoProject.g:179:1: ( ruleHold EOF )
            // InternalInfoProject.g:180:1: ruleHold EOF
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
    // InternalInfoProject.g:187:1: ruleHold : ( ( rule__Hold__Group__0 ) ) ;
    public final void ruleHold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:191:2: ( ( ( rule__Hold__Group__0 ) ) )
            // InternalInfoProject.g:192:2: ( ( rule__Hold__Group__0 ) )
            {
            // InternalInfoProject.g:192:2: ( ( rule__Hold__Group__0 ) )
            // InternalInfoProject.g:193:3: ( rule__Hold__Group__0 )
            {
             before(grammarAccess.getHoldAccess().getGroup()); 
            // InternalInfoProject.g:194:3: ( rule__Hold__Group__0 )
            // InternalInfoProject.g:194:4: rule__Hold__Group__0
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
    // InternalInfoProject.g:203:1: entryRuleArchiveType : ruleArchiveType EOF ;
    public final void entryRuleArchiveType() throws RecognitionException {
        try {
            // InternalInfoProject.g:204:1: ( ruleArchiveType EOF )
            // InternalInfoProject.g:205:1: ruleArchiveType EOF
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
    // InternalInfoProject.g:212:1: ruleArchiveType : ( ( rule__ArchiveType__Group__0 ) ) ;
    public final void ruleArchiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:216:2: ( ( ( rule__ArchiveType__Group__0 ) ) )
            // InternalInfoProject.g:217:2: ( ( rule__ArchiveType__Group__0 ) )
            {
            // InternalInfoProject.g:217:2: ( ( rule__ArchiveType__Group__0 ) )
            // InternalInfoProject.g:218:3: ( rule__ArchiveType__Group__0 )
            {
             before(grammarAccess.getArchiveTypeAccess().getGroup()); 
            // InternalInfoProject.g:219:3: ( rule__ArchiveType__Group__0 )
            // InternalInfoProject.g:219:4: rule__ArchiveType__Group__0
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
    // InternalInfoProject.g:228:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalInfoProject.g:229:1: ( ruleCategory EOF )
            // InternalInfoProject.g:230:1: ruleCategory EOF
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
    // InternalInfoProject.g:237:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:241:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalInfoProject.g:242:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalInfoProject.g:242:2: ( ( rule__Category__Group__0 ) )
            // InternalInfoProject.g:243:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalInfoProject.g:244:3: ( rule__Category__Group__0 )
            // InternalInfoProject.g:244:4: rule__Category__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getGroup()); 

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
    // InternalInfoProject.g:253:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalInfoProject.g:254:1: ( ruleDescription EOF )
            // InternalInfoProject.g:255:1: ruleDescription EOF
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
    // InternalInfoProject.g:262:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:266:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalInfoProject.g:267:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalInfoProject.g:267:2: ( ( rule__Description__Group__0 ) )
            // InternalInfoProject.g:268:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalInfoProject.g:269:3: ( rule__Description__Group__0 )
            // InternalInfoProject.g:269:4: rule__Description__Group__0
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
    // InternalInfoProject.g:278:1: entryRuleMCS : ruleMCS EOF ;
    public final void entryRuleMCS() throws RecognitionException {
        try {
            // InternalInfoProject.g:279:1: ( ruleMCS EOF )
            // InternalInfoProject.g:280:1: ruleMCS EOF
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
    // InternalInfoProject.g:287:1: ruleMCS : ( ( rule__MCS__Group__0 ) ) ;
    public final void ruleMCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:291:2: ( ( ( rule__MCS__Group__0 ) ) )
            // InternalInfoProject.g:292:2: ( ( rule__MCS__Group__0 ) )
            {
            // InternalInfoProject.g:292:2: ( ( rule__MCS__Group__0 ) )
            // InternalInfoProject.g:293:3: ( rule__MCS__Group__0 )
            {
             before(grammarAccess.getMCSAccess().getGroup()); 
            // InternalInfoProject.g:294:3: ( rule__MCS__Group__0 )
            // InternalInfoProject.g:294:4: rule__MCS__Group__0
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
    // InternalInfoProject.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalInfoProject.g:304:1: ( ruleType EOF )
            // InternalInfoProject.g:305:1: ruleType EOF
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
    // InternalInfoProject.g:312:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:316:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalInfoProject.g:317:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalInfoProject.g:317:2: ( ( rule__Type__Group__0 ) )
            // InternalInfoProject.g:318:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalInfoProject.g:319:3: ( rule__Type__Group__0 )
            // InternalInfoProject.g:319:4: rule__Type__Group__0
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
    // InternalInfoProject.g:328:1: entryRuleHoldType : ruleHoldType EOF ;
    public final void entryRuleHoldType() throws RecognitionException {
        try {
            // InternalInfoProject.g:329:1: ( ruleHoldType EOF )
            // InternalInfoProject.g:330:1: ruleHoldType EOF
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
    // InternalInfoProject.g:337:1: ruleHoldType : ( ( rule__HoldType__Group__0 ) ) ;
    public final void ruleHoldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:341:2: ( ( ( rule__HoldType__Group__0 ) ) )
            // InternalInfoProject.g:342:2: ( ( rule__HoldType__Group__0 ) )
            {
            // InternalInfoProject.g:342:2: ( ( rule__HoldType__Group__0 ) )
            // InternalInfoProject.g:343:3: ( rule__HoldType__Group__0 )
            {
             before(grammarAccess.getHoldTypeAccess().getGroup()); 
            // InternalInfoProject.g:344:3: ( rule__HoldType__Group__0 )
            // InternalInfoProject.g:344:4: rule__HoldType__Group__0
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


    // $ANTLR start "ruleenumOfArchiveType"
    // InternalInfoProject.g:353:1: ruleenumOfArchiveType : ( ( rule__EnumOfArchiveType__Alternatives ) ) ;
    public final void ruleenumOfArchiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:357:1: ( ( ( rule__EnumOfArchiveType__Alternatives ) ) )
            // InternalInfoProject.g:358:2: ( ( rule__EnumOfArchiveType__Alternatives ) )
            {
            // InternalInfoProject.g:358:2: ( ( rule__EnumOfArchiveType__Alternatives ) )
            // InternalInfoProject.g:359:3: ( rule__EnumOfArchiveType__Alternatives )
            {
             before(grammarAccess.getEnumOfArchiveTypeAccess().getAlternatives()); 
            // InternalInfoProject.g:360:3: ( rule__EnumOfArchiveType__Alternatives )
            // InternalInfoProject.g:360:4: rule__EnumOfArchiveType__Alternatives
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
    // InternalInfoProject.g:369:1: ruleenumOfTypes : ( ( rule__EnumOfTypes__Alternatives ) ) ;
    public final void ruleenumOfTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:373:1: ( ( ( rule__EnumOfTypes__Alternatives ) ) )
            // InternalInfoProject.g:374:2: ( ( rule__EnumOfTypes__Alternatives ) )
            {
            // InternalInfoProject.g:374:2: ( ( rule__EnumOfTypes__Alternatives ) )
            // InternalInfoProject.g:375:3: ( rule__EnumOfTypes__Alternatives )
            {
             before(grammarAccess.getEnumOfTypesAccess().getAlternatives()); 
            // InternalInfoProject.g:376:3: ( rule__EnumOfTypes__Alternatives )
            // InternalInfoProject.g:376:4: rule__EnumOfTypes__Alternatives
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


    // $ANTLR start "rule__EnumOfArchiveType__Alternatives"
    // InternalInfoProject.g:384:1: rule__EnumOfArchiveType__Alternatives : ( ( ( 'sip' ) ) | ( ( 'table' ) ) );
    public final void rule__EnumOfArchiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:388:1: ( ( ( 'sip' ) ) | ( ( 'table' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalInfoProject.g:389:2: ( ( 'sip' ) )
                    {
                    // InternalInfoProject.g:389:2: ( ( 'sip' ) )
                    // InternalInfoProject.g:390:3: ( 'sip' )
                    {
                     before(grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0()); 
                    // InternalInfoProject.g:391:3: ( 'sip' )
                    // InternalInfoProject.g:391:4: 'sip'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfArchiveTypeAccess().getSIPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:395:2: ( ( 'table' ) )
                    {
                    // InternalInfoProject.g:395:2: ( ( 'table' ) )
                    // InternalInfoProject.g:396:3: ( 'table' )
                    {
                     before(grammarAccess.getEnumOfArchiveTypeAccess().getTABLEEnumLiteralDeclaration_1()); 
                    // InternalInfoProject.g:397:3: ( 'table' )
                    // InternalInfoProject.g:397:4: 'table'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalInfoProject.g:405:1: rule__EnumOfTypes__Alternatives : ( ( ( 'active archiving' ) ) | ( ( 'app decomm' ) ) );
    public final void rule__EnumOfTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:409:1: ( ( ( 'active archiving' ) ) | ( ( 'app decomm' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalInfoProject.g:410:2: ( ( 'active archiving' ) )
                    {
                    // InternalInfoProject.g:410:2: ( ( 'active archiving' ) )
                    // InternalInfoProject.g:411:3: ( 'active archiving' )
                    {
                     before(grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0()); 
                    // InternalInfoProject.g:412:3: ( 'active archiving' )
                    // InternalInfoProject.g:412:4: 'active archiving'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEnumOfTypesAccess().getACTIVE_ARCHIVINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInfoProject.g:416:2: ( ( 'app decomm' ) )
                    {
                    // InternalInfoProject.g:416:2: ( ( 'app decomm' ) )
                    // InternalInfoProject.g:417:3: ( 'app decomm' )
                    {
                     before(grammarAccess.getEnumOfTypesAccess().getAPP_DECOMMEnumLiteralDeclaration_1()); 
                    // InternalInfoProject.g:418:3: ( 'app decomm' )
                    // InternalInfoProject.g:418:4: 'app decomm'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalInfoProject.g:426:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:430:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalInfoProject.g:431:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalInfoProject.g:438:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:442:1: ( ( ( rule__Model__ElementAssignment_0 ) ) )
            // InternalInfoProject.g:443:1: ( ( rule__Model__ElementAssignment_0 ) )
            {
            // InternalInfoProject.g:443:1: ( ( rule__Model__ElementAssignment_0 ) )
            // InternalInfoProject.g:444:2: ( rule__Model__ElementAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_0()); 
            // InternalInfoProject.g:445:2: ( rule__Model__ElementAssignment_0 )
            // InternalInfoProject.g:445:3: rule__Model__ElementAssignment_0
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
    // InternalInfoProject.g:453:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:457:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalInfoProject.g:458:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalInfoProject.g:465:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:469:1: ( ( ( rule__Model__ElementAssignment_1 ) ) )
            // InternalInfoProject.g:470:1: ( ( rule__Model__ElementAssignment_1 ) )
            {
            // InternalInfoProject.g:470:1: ( ( rule__Model__ElementAssignment_1 ) )
            // InternalInfoProject.g:471:2: ( rule__Model__ElementAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_1()); 
            // InternalInfoProject.g:472:2: ( rule__Model__ElementAssignment_1 )
            // InternalInfoProject.g:472:3: rule__Model__ElementAssignment_1
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
    // InternalInfoProject.g:480:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:484:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalInfoProject.g:485:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalInfoProject.g:492:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:496:1: ( ( ( rule__Model__ElementAssignment_2 ) ) )
            // InternalInfoProject.g:497:1: ( ( rule__Model__ElementAssignment_2 ) )
            {
            // InternalInfoProject.g:497:1: ( ( rule__Model__ElementAssignment_2 ) )
            // InternalInfoProject.g:498:2: ( rule__Model__ElementAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_2()); 
            // InternalInfoProject.g:499:2: ( rule__Model__ElementAssignment_2 )
            // InternalInfoProject.g:499:3: rule__Model__ElementAssignment_2
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
    // InternalInfoProject.g:507:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:511:1: ( rule__Model__Group__3__Impl )
            // InternalInfoProject.g:512:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // InternalInfoProject.g:518:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:522:1: ( ( ( rule__Model__ElementAssignment_3 ) ) )
            // InternalInfoProject.g:523:1: ( ( rule__Model__ElementAssignment_3 ) )
            {
            // InternalInfoProject.g:523:1: ( ( rule__Model__ElementAssignment_3 ) )
            // InternalInfoProject.g:524:2: ( rule__Model__ElementAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_3()); 
            // InternalInfoProject.g:525:2: ( rule__Model__ElementAssignment_3 )
            // InternalInfoProject.g:525:3: rule__Model__ElementAssignment_3
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


    // $ANTLR start "rule__Version__Group__0"
    // InternalInfoProject.g:534:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:538:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalInfoProject.g:539:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalInfoProject.g:546:1: rule__Version__Group__0__Impl : ( 'version:' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:550:1: ( ( 'version:' ) )
            // InternalInfoProject.g:551:1: ( 'version:' )
            {
            // InternalInfoProject.g:551:1: ( 'version:' )
            // InternalInfoProject.g:552:2: 'version:'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalInfoProject.g:561:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:565:1: ( rule__Version__Group__1__Impl )
            // InternalInfoProject.g:566:2: rule__Version__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__1__Impl();

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
    // InternalInfoProject.g:572:1: rule__Version__Group__1__Impl : ( ( rule__Version__NameAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:576:1: ( ( ( rule__Version__NameAssignment_1 ) ) )
            // InternalInfoProject.g:577:1: ( ( rule__Version__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:577:1: ( ( rule__Version__NameAssignment_1 ) )
            // InternalInfoProject.g:578:2: ( rule__Version__NameAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:579:2: ( rule__Version__NameAssignment_1 )
            // InternalInfoProject.g:579:3: rule__Version__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Version__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__FeatureName__Group__0"
    // InternalInfoProject.g:588:1: rule__FeatureName__Group__0 : rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 ;
    public final void rule__FeatureName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:592:1: ( rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 )
            // InternalInfoProject.g:593:2: rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalInfoProject.g:600:1: rule__FeatureName__Group__0__Impl : ( 'name: ' ) ;
    public final void rule__FeatureName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:604:1: ( ( 'name: ' ) )
            // InternalInfoProject.g:605:1: ( 'name: ' )
            {
            // InternalInfoProject.g:605:1: ( 'name: ' )
            // InternalInfoProject.g:606:2: 'name: '
            {
             before(grammarAccess.getFeatureNameAccess().getNameKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeatureNameAccess().getNameKeyword_0()); 

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
    // $ANTLR end "rule__FeatureName__Group__0__Impl"


    // $ANTLR start "rule__FeatureName__Group__1"
    // InternalInfoProject.g:615:1: rule__FeatureName__Group__1 : rule__FeatureName__Group__1__Impl ;
    public final void rule__FeatureName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:619:1: ( rule__FeatureName__Group__1__Impl )
            // InternalInfoProject.g:620:2: rule__FeatureName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureName__Group__1__Impl();

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
    // InternalInfoProject.g:626:1: rule__FeatureName__Group__1__Impl : ( ( rule__FeatureName__NameAssignment_1 ) ) ;
    public final void rule__FeatureName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:630:1: ( ( ( rule__FeatureName__NameAssignment_1 ) ) )
            // InternalInfoProject.g:631:1: ( ( rule__FeatureName__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:631:1: ( ( rule__FeatureName__NameAssignment_1 ) )
            // InternalInfoProject.g:632:2: ( rule__FeatureName__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureNameAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:633:2: ( rule__FeatureName__NameAssignment_1 )
            // InternalInfoProject.g:633:3: rule__FeatureName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureNameAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Application__Group__0"
    // InternalInfoProject.g:642:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:646:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalInfoProject.g:647:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalInfoProject.g:654:1: rule__Application__Group__0__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:658:1: ( ( 'application:' ) )
            // InternalInfoProject.g:659:1: ( 'application:' )
            {
            // InternalInfoProject.g:659:1: ( 'application:' )
            // InternalInfoProject.g:660:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalInfoProject.g:669:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:673:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalInfoProject.g:674:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalInfoProject.g:681:1: rule__Application__Group__1__Impl : ( ( rule__Application__Features1Assignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:685:1: ( ( ( rule__Application__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:686:1: ( ( rule__Application__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:686:1: ( ( rule__Application__Features1Assignment_1 ) )
            // InternalInfoProject.g:687:2: ( rule__Application__Features1Assignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:688:2: ( rule__Application__Features1Assignment_1 )
            // InternalInfoProject.g:688:3: rule__Application__Features1Assignment_1
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
    // InternalInfoProject.g:696:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:700:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalInfoProject.g:701:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalInfoProject.g:708:1: rule__Application__Group__2__Impl : ( ( rule__Application__FeaturesAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:712:1: ( ( ( rule__Application__FeaturesAssignment_2 ) ) )
            // InternalInfoProject.g:713:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            {
            // InternalInfoProject.g:713:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            // InternalInfoProject.g:714:2: ( rule__Application__FeaturesAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:715:2: ( rule__Application__FeaturesAssignment_2 )
            // InternalInfoProject.g:715:3: rule__Application__FeaturesAssignment_2
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
    // InternalInfoProject.g:723:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:727:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalInfoProject.g:728:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalInfoProject.g:735:1: rule__Application__Group__3__Impl : ( ( rule__Application__FeatureAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:739:1: ( ( ( rule__Application__FeatureAssignment_3 ) ) )
            // InternalInfoProject.g:740:1: ( ( rule__Application__FeatureAssignment_3 ) )
            {
            // InternalInfoProject.g:740:1: ( ( rule__Application__FeatureAssignment_3 ) )
            // InternalInfoProject.g:741:2: ( rule__Application__FeatureAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_3()); 
            // InternalInfoProject.g:742:2: ( rule__Application__FeatureAssignment_3 )
            // InternalInfoProject.g:742:3: rule__Application__FeatureAssignment_3
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
    // InternalInfoProject.g:750:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:754:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalInfoProject.g:755:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalInfoProject.g:762:1: rule__Application__Group__4__Impl : ( ( rule__Application__FeatureAssignment_4 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:766:1: ( ( ( rule__Application__FeatureAssignment_4 )? ) )
            // InternalInfoProject.g:767:1: ( ( rule__Application__FeatureAssignment_4 )? )
            {
            // InternalInfoProject.g:767:1: ( ( rule__Application__FeatureAssignment_4 )? )
            // InternalInfoProject.g:768:2: ( rule__Application__FeatureAssignment_4 )?
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_4()); 
            // InternalInfoProject.g:769:2: ( rule__Application__FeatureAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalInfoProject.g:769:3: rule__Application__FeatureAssignment_4
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
    // InternalInfoProject.g:777:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:781:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalInfoProject.g:782:2: rule__Application__Group__5__Impl rule__Application__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalInfoProject.g:789:1: rule__Application__Group__5__Impl : ( ( rule__Application__FeatureAssignment_5 ) ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:793:1: ( ( ( rule__Application__FeatureAssignment_5 ) ) )
            // InternalInfoProject.g:794:1: ( ( rule__Application__FeatureAssignment_5 ) )
            {
            // InternalInfoProject.g:794:1: ( ( rule__Application__FeatureAssignment_5 ) )
            // InternalInfoProject.g:795:2: ( rule__Application__FeatureAssignment_5 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_5()); 
            // InternalInfoProject.g:796:2: ( rule__Application__FeatureAssignment_5 )
            // InternalInfoProject.g:796:3: rule__Application__FeatureAssignment_5
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
    // InternalInfoProject.g:804:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:808:1: ( rule__Application__Group__6__Impl )
            // InternalInfoProject.g:809:2: rule__Application__Group__6__Impl
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
    // InternalInfoProject.g:815:1: rule__Application__Group__6__Impl : ( ( rule__Application__FeatureAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:819:1: ( ( ( rule__Application__FeatureAssignment_6 ) ) )
            // InternalInfoProject.g:820:1: ( ( rule__Application__FeatureAssignment_6 ) )
            {
            // InternalInfoProject.g:820:1: ( ( rule__Application__FeatureAssignment_6 ) )
            // InternalInfoProject.g:821:2: ( rule__Application__FeatureAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_6()); 
            // InternalInfoProject.g:822:2: ( rule__Application__FeatureAssignment_6 )
            // InternalInfoProject.g:822:3: rule__Application__FeatureAssignment_6
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
    // InternalInfoProject.g:831:1: rule__Tenant__Group__0 : rule__Tenant__Group__0__Impl rule__Tenant__Group__1 ;
    public final void rule__Tenant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:835:1: ( rule__Tenant__Group__0__Impl rule__Tenant__Group__1 )
            // InternalInfoProject.g:836:2: rule__Tenant__Group__0__Impl rule__Tenant__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalInfoProject.g:843:1: rule__Tenant__Group__0__Impl : ( 'tenant:' ) ;
    public final void rule__Tenant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:847:1: ( ( 'tenant:' ) )
            // InternalInfoProject.g:848:1: ( 'tenant:' )
            {
            // InternalInfoProject.g:848:1: ( 'tenant:' )
            // InternalInfoProject.g:849:2: 'tenant:'
            {
             before(grammarAccess.getTenantAccess().getTenantKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalInfoProject.g:858:1: rule__Tenant__Group__1 : rule__Tenant__Group__1__Impl ;
    public final void rule__Tenant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:862:1: ( rule__Tenant__Group__1__Impl )
            // InternalInfoProject.g:863:2: rule__Tenant__Group__1__Impl
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
    // InternalInfoProject.g:869:1: rule__Tenant__Group__1__Impl : ( ( rule__Tenant__Features1Assignment_1 ) ) ;
    public final void rule__Tenant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:873:1: ( ( ( rule__Tenant__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:874:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:874:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            // InternalInfoProject.g:875:2: ( rule__Tenant__Features1Assignment_1 )
            {
             before(grammarAccess.getTenantAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:876:2: ( rule__Tenant__Features1Assignment_1 )
            // InternalInfoProject.g:876:3: rule__Tenant__Features1Assignment_1
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
    // InternalInfoProject.g:885:1: rule__Hold__Group__0 : rule__Hold__Group__0__Impl rule__Hold__Group__1 ;
    public final void rule__Hold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:889:1: ( rule__Hold__Group__0__Impl rule__Hold__Group__1 )
            // InternalInfoProject.g:890:2: rule__Hold__Group__0__Impl rule__Hold__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalInfoProject.g:897:1: rule__Hold__Group__0__Impl : ( 'hold:' ) ;
    public final void rule__Hold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:901:1: ( ( 'hold:' ) )
            // InternalInfoProject.g:902:1: ( 'hold:' )
            {
            // InternalInfoProject.g:902:1: ( 'hold:' )
            // InternalInfoProject.g:903:2: 'hold:'
            {
             before(grammarAccess.getHoldAccess().getHoldKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalInfoProject.g:912:1: rule__Hold__Group__1 : rule__Hold__Group__1__Impl rule__Hold__Group__2 ;
    public final void rule__Hold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:916:1: ( rule__Hold__Group__1__Impl rule__Hold__Group__2 )
            // InternalInfoProject.g:917:2: rule__Hold__Group__1__Impl rule__Hold__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalInfoProject.g:924:1: rule__Hold__Group__1__Impl : ( ( rule__Hold__Features1Assignment_1 ) ) ;
    public final void rule__Hold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:928:1: ( ( ( rule__Hold__Features1Assignment_1 ) ) )
            // InternalInfoProject.g:929:1: ( ( rule__Hold__Features1Assignment_1 ) )
            {
            // InternalInfoProject.g:929:1: ( ( rule__Hold__Features1Assignment_1 ) )
            // InternalInfoProject.g:930:2: ( rule__Hold__Features1Assignment_1 )
            {
             before(grammarAccess.getHoldAccess().getFeatures1Assignment_1()); 
            // InternalInfoProject.g:931:2: ( rule__Hold__Features1Assignment_1 )
            // InternalInfoProject.g:931:3: rule__Hold__Features1Assignment_1
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
    // InternalInfoProject.g:939:1: rule__Hold__Group__2 : rule__Hold__Group__2__Impl ;
    public final void rule__Hold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:943:1: ( rule__Hold__Group__2__Impl )
            // InternalInfoProject.g:944:2: rule__Hold__Group__2__Impl
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
    // InternalInfoProject.g:950:1: rule__Hold__Group__2__Impl : ( ( rule__Hold__FeaturesAssignment_2 ) ) ;
    public final void rule__Hold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:954:1: ( ( ( rule__Hold__FeaturesAssignment_2 ) ) )
            // InternalInfoProject.g:955:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            {
            // InternalInfoProject.g:955:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            // InternalInfoProject.g:956:2: ( rule__Hold__FeaturesAssignment_2 )
            {
             before(grammarAccess.getHoldAccess().getFeaturesAssignment_2()); 
            // InternalInfoProject.g:957:2: ( rule__Hold__FeaturesAssignment_2 )
            // InternalInfoProject.g:957:3: rule__Hold__FeaturesAssignment_2
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
    // InternalInfoProject.g:966:1: rule__ArchiveType__Group__0 : rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1 ;
    public final void rule__ArchiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:970:1: ( rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1 )
            // InternalInfoProject.g:971:2: rule__ArchiveType__Group__0__Impl rule__ArchiveType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalInfoProject.g:978:1: rule__ArchiveType__Group__0__Impl : ( 'archiveType:' ) ;
    public final void rule__ArchiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:982:1: ( ( 'archiveType:' ) )
            // InternalInfoProject.g:983:1: ( 'archiveType:' )
            {
            // InternalInfoProject.g:983:1: ( 'archiveType:' )
            // InternalInfoProject.g:984:2: 'archiveType:'
            {
             before(grammarAccess.getArchiveTypeAccess().getArchiveTypeKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalInfoProject.g:993:1: rule__ArchiveType__Group__1 : rule__ArchiveType__Group__1__Impl ;
    public final void rule__ArchiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:997:1: ( rule__ArchiveType__Group__1__Impl )
            // InternalInfoProject.g:998:2: rule__ArchiveType__Group__1__Impl
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
    // InternalInfoProject.g:1004:1: rule__ArchiveType__Group__1__Impl : ( ( rule__ArchiveType__ValueAssignment_1 ) ) ;
    public final void rule__ArchiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1008:1: ( ( ( rule__ArchiveType__ValueAssignment_1 ) ) )
            // InternalInfoProject.g:1009:1: ( ( rule__ArchiveType__ValueAssignment_1 ) )
            {
            // InternalInfoProject.g:1009:1: ( ( rule__ArchiveType__ValueAssignment_1 ) )
            // InternalInfoProject.g:1010:2: ( rule__ArchiveType__ValueAssignment_1 )
            {
             before(grammarAccess.getArchiveTypeAccess().getValueAssignment_1()); 
            // InternalInfoProject.g:1011:2: ( rule__ArchiveType__ValueAssignment_1 )
            // InternalInfoProject.g:1011:3: rule__ArchiveType__ValueAssignment_1
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


    // $ANTLR start "rule__Category__Group__0"
    // InternalInfoProject.g:1020:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1024:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalInfoProject.g:1025:2: rule__Category__Group__0__Impl rule__Category__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Category__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Category__Group__1();

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
    // $ANTLR end "rule__Category__Group__0"


    // $ANTLR start "rule__Category__Group__0__Impl"
    // InternalInfoProject.g:1032:1: rule__Category__Group__0__Impl : ( 'category:' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1036:1: ( ( 'category:' ) )
            // InternalInfoProject.g:1037:1: ( 'category:' )
            {
            // InternalInfoProject.g:1037:1: ( 'category:' )
            // InternalInfoProject.g:1038:2: 'category:'
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 

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
    // $ANTLR end "rule__Category__Group__0__Impl"


    // $ANTLR start "rule__Category__Group__1"
    // InternalInfoProject.g:1047:1: rule__Category__Group__1 : rule__Category__Group__1__Impl ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1051:1: ( rule__Category__Group__1__Impl )
            // InternalInfoProject.g:1052:2: rule__Category__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Category__Group__1__Impl();

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
    // $ANTLR end "rule__Category__Group__1"


    // $ANTLR start "rule__Category__Group__1__Impl"
    // InternalInfoProject.g:1058:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1062:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalInfoProject.g:1063:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:1063:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalInfoProject.g:1064:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:1065:2: ( rule__Category__NameAssignment_1 )
            // InternalInfoProject.g:1065:3: rule__Category__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Category__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Category__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalInfoProject.g:1074:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1078:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalInfoProject.g:1079:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalInfoProject.g:1086:1: rule__Description__Group__0__Impl : ( 'description:' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1090:1: ( ( 'description:' ) )
            // InternalInfoProject.g:1091:1: ( 'description:' )
            {
            // InternalInfoProject.g:1091:1: ( 'description:' )
            // InternalInfoProject.g:1092:2: 'description:'
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalInfoProject.g:1101:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1105:1: ( rule__Description__Group__1__Impl )
            // InternalInfoProject.g:1106:2: rule__Description__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__1__Impl();

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
    // InternalInfoProject.g:1112:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1116:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalInfoProject.g:1117:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:1117:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalInfoProject.g:1118:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:1119:2: ( rule__Description__NameAssignment_1 )
            // InternalInfoProject.g:1119:3: rule__Description__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__MCS__Group__0"
    // InternalInfoProject.g:1128:1: rule__MCS__Group__0 : rule__MCS__Group__0__Impl rule__MCS__Group__1 ;
    public final void rule__MCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1132:1: ( rule__MCS__Group__0__Impl rule__MCS__Group__1 )
            // InternalInfoProject.g:1133:2: rule__MCS__Group__0__Impl rule__MCS__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalInfoProject.g:1140:1: rule__MCS__Group__0__Impl : ( 'metadataCacheSize:' ) ;
    public final void rule__MCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1144:1: ( ( 'metadataCacheSize:' ) )
            // InternalInfoProject.g:1145:1: ( 'metadataCacheSize:' )
            {
            // InternalInfoProject.g:1145:1: ( 'metadataCacheSize:' )
            // InternalInfoProject.g:1146:2: 'metadataCacheSize:'
            {
             before(grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_0()); 

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
    // $ANTLR end "rule__MCS__Group__0__Impl"


    // $ANTLR start "rule__MCS__Group__1"
    // InternalInfoProject.g:1155:1: rule__MCS__Group__1 : rule__MCS__Group__1__Impl ;
    public final void rule__MCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1159:1: ( rule__MCS__Group__1__Impl )
            // InternalInfoProject.g:1160:2: rule__MCS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MCS__Group__1__Impl();

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
    // InternalInfoProject.g:1166:1: rule__MCS__Group__1__Impl : ( ( rule__MCS__NameAssignment_1 ) ) ;
    public final void rule__MCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1170:1: ( ( ( rule__MCS__NameAssignment_1 ) ) )
            // InternalInfoProject.g:1171:1: ( ( rule__MCS__NameAssignment_1 ) )
            {
            // InternalInfoProject.g:1171:1: ( ( rule__MCS__NameAssignment_1 ) )
            // InternalInfoProject.g:1172:2: ( rule__MCS__NameAssignment_1 )
            {
             before(grammarAccess.getMCSAccess().getNameAssignment_1()); 
            // InternalInfoProject.g:1173:2: ( rule__MCS__NameAssignment_1 )
            // InternalInfoProject.g:1173:3: rule__MCS__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MCS__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMCSAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Type__Group__0"
    // InternalInfoProject.g:1182:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1186:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalInfoProject.g:1187:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalInfoProject.g:1194:1: rule__Type__Group__0__Impl : ( 'type:' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1198:1: ( ( 'type:' ) )
            // InternalInfoProject.g:1199:1: ( 'type:' )
            {
            // InternalInfoProject.g:1199:1: ( 'type:' )
            // InternalInfoProject.g:1200:2: 'type:'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalInfoProject.g:1209:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1213:1: ( rule__Type__Group__1__Impl )
            // InternalInfoProject.g:1214:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

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
    // InternalInfoProject.g:1220:1: rule__Type__Group__1__Impl : ( ( rule__Type__ValueAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1224:1: ( ( ( rule__Type__ValueAssignment_1 ) ) )
            // InternalInfoProject.g:1225:1: ( ( rule__Type__ValueAssignment_1 ) )
            {
            // InternalInfoProject.g:1225:1: ( ( rule__Type__ValueAssignment_1 ) )
            // InternalInfoProject.g:1226:2: ( rule__Type__ValueAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getValueAssignment_1()); 
            // InternalInfoProject.g:1227:2: ( rule__Type__ValueAssignment_1 )
            // InternalInfoProject.g:1227:3: rule__Type__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__HoldType__Group__0"
    // InternalInfoProject.g:1236:1: rule__HoldType__Group__0 : rule__HoldType__Group__0__Impl rule__HoldType__Group__1 ;
    public final void rule__HoldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1240:1: ( rule__HoldType__Group__0__Impl rule__HoldType__Group__1 )
            // InternalInfoProject.g:1241:2: rule__HoldType__Group__0__Impl rule__HoldType__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalInfoProject.g:1248:1: rule__HoldType__Group__0__Impl : ( 'holdType:' ) ;
    public final void rule__HoldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1252:1: ( ( 'holdType:' ) )
            // InternalInfoProject.g:1253:1: ( 'holdType:' )
            {
            // InternalInfoProject.g:1253:1: ( 'holdType:' )
            // InternalInfoProject.g:1254:2: 'holdType:'
            {
             before(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 

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
    // InternalInfoProject.g:1263:1: rule__HoldType__Group__1 : rule__HoldType__Group__1__Impl ;
    public final void rule__HoldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1267:1: ( rule__HoldType__Group__1__Impl )
            // InternalInfoProject.g:1268:2: rule__HoldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HoldType__Group__1__Impl();

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
    // InternalInfoProject.g:1274:1: rule__HoldType__Group__1__Impl : ( ( rule__HoldType__FeaturesAssignment_1 ) ) ;
    public final void rule__HoldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1278:1: ( ( ( rule__HoldType__FeaturesAssignment_1 ) ) )
            // InternalInfoProject.g:1279:1: ( ( rule__HoldType__FeaturesAssignment_1 ) )
            {
            // InternalInfoProject.g:1279:1: ( ( rule__HoldType__FeaturesAssignment_1 ) )
            // InternalInfoProject.g:1280:2: ( rule__HoldType__FeaturesAssignment_1 )
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_1()); 
            // InternalInfoProject.g:1281:2: ( rule__HoldType__FeaturesAssignment_1 )
            // InternalInfoProject.g:1281:3: rule__HoldType__FeaturesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HoldType__FeaturesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_1()); 

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


    // $ANTLR start "rule__Model__ElementAssignment_0"
    // InternalInfoProject.g:1290:1: rule__Model__ElementAssignment_0 : ( ruleVersion ) ;
    public final void rule__Model__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1294:1: ( ( ruleVersion ) )
            // InternalInfoProject.g:1295:2: ( ruleVersion )
            {
            // InternalInfoProject.g:1295:2: ( ruleVersion )
            // InternalInfoProject.g:1296:3: ruleVersion
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
    // InternalInfoProject.g:1305:1: rule__Model__ElementAssignment_1 : ( ruleApplication ) ;
    public final void rule__Model__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1309:1: ( ( ruleApplication ) )
            // InternalInfoProject.g:1310:2: ( ruleApplication )
            {
            // InternalInfoProject.g:1310:2: ( ruleApplication )
            // InternalInfoProject.g:1311:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementApplicationParserRuleCall_1_0()); 

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
    // InternalInfoProject.g:1320:1: rule__Model__ElementAssignment_2 : ( ruleTenant ) ;
    public final void rule__Model__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1324:1: ( ( ruleTenant ) )
            // InternalInfoProject.g:1325:2: ( ruleTenant )
            {
            // InternalInfoProject.g:1325:2: ( ruleTenant )
            // InternalInfoProject.g:1326:3: ruleTenant
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
    // InternalInfoProject.g:1335:1: rule__Model__ElementAssignment_3 : ( ruleHold ) ;
    public final void rule__Model__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1339:1: ( ( ruleHold ) )
            // InternalInfoProject.g:1340:2: ( ruleHold )
            {
            // InternalInfoProject.g:1340:2: ( ruleHold )
            // InternalInfoProject.g:1341:3: ruleHold
            {
             before(grammarAccess.getModelAccess().getElementHoldParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleHold();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementHoldParserRuleCall_3_0()); 

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


    // $ANTLR start "rule__Version__NameAssignment_1"
    // InternalInfoProject.g:1350:1: rule__Version__NameAssignment_1 : ( RULE_VERSION_NUMBER ) ;
    public final void rule__Version__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1354:1: ( ( RULE_VERSION_NUMBER ) )
            // InternalInfoProject.g:1355:2: ( RULE_VERSION_NUMBER )
            {
            // InternalInfoProject.g:1355:2: ( RULE_VERSION_NUMBER )
            // InternalInfoProject.g:1356:3: RULE_VERSION_NUMBER
            {
             before(grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_VERSION_NUMBER,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getNameVERSION_NUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Version__NameAssignment_1"


    // $ANTLR start "rule__FeatureName__NameAssignment_1"
    // InternalInfoProject.g:1365:1: rule__FeatureName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FeatureName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1369:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:1370:2: ( RULE_ID )
            {
            // InternalInfoProject.g:1370:2: ( RULE_ID )
            // InternalInfoProject.g:1371:3: RULE_ID
            {
             before(grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureNameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FeatureName__NameAssignment_1"


    // $ANTLR start "rule__Application__Features1Assignment_1"
    // InternalInfoProject.g:1380:1: rule__Application__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Application__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1384:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:1385:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:1385:2: ( ruleFeatureName )
            // InternalInfoProject.g:1386:3: ruleFeatureName
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
    // InternalInfoProject.g:1395:1: rule__Application__FeaturesAssignment_2 : ( ruleArchiveType ) ;
    public final void rule__Application__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1399:1: ( ( ruleArchiveType ) )
            // InternalInfoProject.g:1400:2: ( ruleArchiveType )
            {
            // InternalInfoProject.g:1400:2: ( ruleArchiveType )
            // InternalInfoProject.g:1401:3: ruleArchiveType
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
    // InternalInfoProject.g:1410:1: rule__Application__FeatureAssignment_3 : ( ruleCategory ) ;
    public final void rule__Application__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1414:1: ( ( ruleCategory ) )
            // InternalInfoProject.g:1415:2: ( ruleCategory )
            {
            // InternalInfoProject.g:1415:2: ( ruleCategory )
            // InternalInfoProject.g:1416:3: ruleCategory
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
    // InternalInfoProject.g:1425:1: rule__Application__FeatureAssignment_4 : ( ruleDescription ) ;
    public final void rule__Application__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1429:1: ( ( ruleDescription ) )
            // InternalInfoProject.g:1430:2: ( ruleDescription )
            {
            // InternalInfoProject.g:1430:2: ( ruleDescription )
            // InternalInfoProject.g:1431:3: ruleDescription
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
    // InternalInfoProject.g:1440:1: rule__Application__FeatureAssignment_5 : ( ruleMCS ) ;
    public final void rule__Application__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1444:1: ( ( ruleMCS ) )
            // InternalInfoProject.g:1445:2: ( ruleMCS )
            {
            // InternalInfoProject.g:1445:2: ( ruleMCS )
            // InternalInfoProject.g:1446:3: ruleMCS
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
    // InternalInfoProject.g:1455:1: rule__Application__FeatureAssignment_6 : ( ruleType ) ;
    public final void rule__Application__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1459:1: ( ( ruleType ) )
            // InternalInfoProject.g:1460:2: ( ruleType )
            {
            // InternalInfoProject.g:1460:2: ( ruleType )
            // InternalInfoProject.g:1461:3: ruleType
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
    // InternalInfoProject.g:1470:1: rule__Tenant__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Tenant__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1474:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:1475:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:1475:2: ( ruleFeatureName )
            // InternalInfoProject.g:1476:3: ruleFeatureName
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
    // InternalInfoProject.g:1485:1: rule__Hold__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Hold__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1489:1: ( ( ruleFeatureName ) )
            // InternalInfoProject.g:1490:2: ( ruleFeatureName )
            {
            // InternalInfoProject.g:1490:2: ( ruleFeatureName )
            // InternalInfoProject.g:1491:3: ruleFeatureName
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
    // InternalInfoProject.g:1500:1: rule__Hold__FeaturesAssignment_2 : ( ruleHoldType ) ;
    public final void rule__Hold__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1504:1: ( ( ruleHoldType ) )
            // InternalInfoProject.g:1505:2: ( ruleHoldType )
            {
            // InternalInfoProject.g:1505:2: ( ruleHoldType )
            // InternalInfoProject.g:1506:3: ruleHoldType
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
    // InternalInfoProject.g:1515:1: rule__ArchiveType__ValueAssignment_1 : ( ruleenumOfArchiveType ) ;
    public final void rule__ArchiveType__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1519:1: ( ( ruleenumOfArchiveType ) )
            // InternalInfoProject.g:1520:2: ( ruleenumOfArchiveType )
            {
            // InternalInfoProject.g:1520:2: ( ruleenumOfArchiveType )
            // InternalInfoProject.g:1521:3: ruleenumOfArchiveType
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


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalInfoProject.g:1530:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1534:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:1535:2: ( RULE_ID )
            {
            // InternalInfoProject.g:1535:2: ( RULE_ID )
            // InternalInfoProject.g:1536:3: RULE_ID
            {
             before(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Category__NameAssignment_1"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalInfoProject.g:1545:1: rule__Description__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1549:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:1550:2: ( RULE_ID )
            {
            // InternalInfoProject.g:1550:2: ( RULE_ID )
            // InternalInfoProject.g:1551:3: RULE_ID
            {
             before(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Description__NameAssignment_1"


    // $ANTLR start "rule__MCS__NameAssignment_1"
    // InternalInfoProject.g:1560:1: rule__MCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1564:1: ( ( RULE_ID ) )
            // InternalInfoProject.g:1565:2: ( RULE_ID )
            {
            // InternalInfoProject.g:1565:2: ( RULE_ID )
            // InternalInfoProject.g:1566:3: RULE_ID
            {
             before(grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMCSAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MCS__NameAssignment_1"


    // $ANTLR start "rule__Type__ValueAssignment_1"
    // InternalInfoProject.g:1575:1: rule__Type__ValueAssignment_1 : ( ruleenumOfTypes ) ;
    public final void rule__Type__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1579:1: ( ( ruleenumOfTypes ) )
            // InternalInfoProject.g:1580:2: ( ruleenumOfTypes )
            {
            // InternalInfoProject.g:1580:2: ( ruleenumOfTypes )
            // InternalInfoProject.g:1581:3: ruleenumOfTypes
            {
             before(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleenumOfTypes();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getValueEnumOfTypesEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__ValueAssignment_1"


    // $ANTLR start "rule__HoldType__FeaturesAssignment_1"
    // InternalInfoProject.g:1590:1: rule__HoldType__FeaturesAssignment_1 : ( ruleType ) ;
    public final void rule__HoldType__FeaturesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInfoProject.g:1594:1: ( ( ruleType ) )
            // InternalInfoProject.g:1595:2: ( ruleType )
            {
            // InternalInfoProject.g:1595:2: ( ruleType )
            // InternalInfoProject.g:1596:3: ruleType
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getHoldTypeAccess().getFeaturesTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__HoldType__FeaturesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});

}