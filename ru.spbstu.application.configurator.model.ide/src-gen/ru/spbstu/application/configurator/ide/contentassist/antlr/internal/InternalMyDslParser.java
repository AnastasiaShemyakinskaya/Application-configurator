package ru.spbstu.application.configurator.ide.contentassist.antlr.internal;

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
import ru.spbstu.application.configurator.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
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
    // InternalMyDsl.g:78:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleVersion EOF )
            // InternalMyDsl.g:80:1: ruleVersion EOF
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
    // InternalMyDsl.g:87:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Version__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Version__Group__0 )
            // InternalMyDsl.g:94:4: rule__Version__Group__0
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
    // InternalMyDsl.g:103:1: entryRuleFeatureName : ruleFeatureName EOF ;
    public final void entryRuleFeatureName() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFeatureName EOF )
            // InternalMyDsl.g:105:1: ruleFeatureName EOF
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
    // InternalMyDsl.g:112:1: ruleFeatureName : ( ( rule__FeatureName__Group__0 ) ) ;
    public final void ruleFeatureName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__FeatureName__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__FeatureName__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__FeatureName__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__FeatureName__Group__0 )
            {
             before(grammarAccess.getFeatureNameAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__FeatureName__Group__0 )
            // InternalMyDsl.g:119:4: rule__FeatureName__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleApplication EOF )
            // InternalMyDsl.g:130:1: ruleApplication EOF
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
    // InternalMyDsl.g:137:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Application__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Application__Group__0 )
            // InternalMyDsl.g:144:4: rule__Application__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleTenant : ruleTenant EOF ;
    public final void entryRuleTenant() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTenant EOF )
            // InternalMyDsl.g:155:1: ruleTenant EOF
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
    // InternalMyDsl.g:162:1: ruleTenant : ( ( rule__Tenant__Group__0 ) ) ;
    public final void ruleTenant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Tenant__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Tenant__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Tenant__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Tenant__Group__0 )
            {
             before(grammarAccess.getTenantAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Tenant__Group__0 )
            // InternalMyDsl.g:169:4: rule__Tenant__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleHold : ruleHold EOF ;
    public final void entryRuleHold() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleHold EOF )
            // InternalMyDsl.g:180:1: ruleHold EOF
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
    // InternalMyDsl.g:187:1: ruleHold : ( ( rule__Hold__Group__0 ) ) ;
    public final void ruleHold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Hold__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Hold__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Hold__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Hold__Group__0 )
            {
             before(grammarAccess.getHoldAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Hold__Group__0 )
            // InternalMyDsl.g:194:4: rule__Hold__Group__0
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


    // $ANTLR start "entryRuleArchiveTipe"
    // InternalMyDsl.g:203:1: entryRuleArchiveTipe : ruleArchiveTipe EOF ;
    public final void entryRuleArchiveTipe() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleArchiveTipe EOF )
            // InternalMyDsl.g:205:1: ruleArchiveTipe EOF
            {
             before(grammarAccess.getArchiveTipeRule()); 
            pushFollow(FOLLOW_1);
            ruleArchiveTipe();

            state._fsp--;

             after(grammarAccess.getArchiveTipeRule()); 
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
    // $ANTLR end "entryRuleArchiveTipe"


    // $ANTLR start "ruleArchiveTipe"
    // InternalMyDsl.g:212:1: ruleArchiveTipe : ( ( rule__ArchiveTipe__Group__0 ) ) ;
    public final void ruleArchiveTipe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ArchiveTipe__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ArchiveTipe__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ArchiveTipe__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__ArchiveTipe__Group__0 )
            {
             before(grammarAccess.getArchiveTipeAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__ArchiveTipe__Group__0 )
            // InternalMyDsl.g:219:4: rule__ArchiveTipe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveTipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArchiveTipeAccess().getGroup()); 

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
    // $ANTLR end "ruleArchiveTipe"


    // $ANTLR start "entryRuleCategory"
    // InternalMyDsl.g:228:1: entryRuleCategory : ruleCategory EOF ;
    public final void entryRuleCategory() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCategory EOF )
            // InternalMyDsl.g:230:1: ruleCategory EOF
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
    // InternalMyDsl.g:237:1: ruleCategory : ( ( rule__Category__Group__0 ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Category__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Category__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Category__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Category__Group__0 )
            {
             before(grammarAccess.getCategoryAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Category__Group__0 )
            // InternalMyDsl.g:244:4: rule__Category__Group__0
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
    // InternalMyDsl.g:253:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleDescription EOF )
            // InternalMyDsl.g:255:1: ruleDescription EOF
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
    // InternalMyDsl.g:262:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Description__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Description__Group__0 )
            // InternalMyDsl.g:269:4: rule__Description__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleMCS : ruleMCS EOF ;
    public final void entryRuleMCS() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMCS EOF )
            // InternalMyDsl.g:280:1: ruleMCS EOF
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
    // InternalMyDsl.g:287:1: ruleMCS : ( ( rule__MCS__Group__0 ) ) ;
    public final void ruleMCS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MCS__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MCS__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MCS__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__MCS__Group__0 )
            {
             before(grammarAccess.getMCSAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__MCS__Group__0 )
            // InternalMyDsl.g:294:4: rule__MCS__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleType EOF )
            // InternalMyDsl.g:305:1: ruleType EOF
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
    // InternalMyDsl.g:312:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Type__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Type__Group__0 )
            // InternalMyDsl.g:319:4: rule__Type__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleHoldType : ruleHoldType EOF ;
    public final void entryRuleHoldType() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleHoldType EOF )
            // InternalMyDsl.g:330:1: ruleHoldType EOF
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
    // InternalMyDsl.g:337:1: ruleHoldType : ( ( rule__HoldType__Group__0 ) ) ;
    public final void ruleHoldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__HoldType__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__HoldType__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__HoldType__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__HoldType__Group__0 )
            {
             before(grammarAccess.getHoldTypeAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__HoldType__Group__0 )
            // InternalMyDsl.g:344:4: rule__HoldType__Group__0
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:352:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:357:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalMyDsl.g:364:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( ( ( rule__Model__ElementAssignment_0 ) ) )
            // InternalMyDsl.g:369:1: ( ( rule__Model__ElementAssignment_0 ) )
            {
            // InternalMyDsl.g:369:1: ( ( rule__Model__ElementAssignment_0 ) )
            // InternalMyDsl.g:370:2: ( rule__Model__ElementAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_0()); 
            // InternalMyDsl.g:371:2: ( rule__Model__ElementAssignment_0 )
            // InternalMyDsl.g:371:3: rule__Model__ElementAssignment_0
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
    // InternalMyDsl.g:379:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:383:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:384:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalMyDsl.g:391:1: rule__Model__Group__1__Impl : ( ( rule__Model__ElementAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( ( ( rule__Model__ElementAssignment_1 ) ) )
            // InternalMyDsl.g:396:1: ( ( rule__Model__ElementAssignment_1 ) )
            {
            // InternalMyDsl.g:396:1: ( ( rule__Model__ElementAssignment_1 ) )
            // InternalMyDsl.g:397:2: ( rule__Model__ElementAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_1()); 
            // InternalMyDsl.g:398:2: ( rule__Model__ElementAssignment_1 )
            // InternalMyDsl.g:398:3: rule__Model__ElementAssignment_1
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
    // InternalMyDsl.g:406:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:410:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:411:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalMyDsl.g:418:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( ( ( rule__Model__ElementAssignment_2 ) ) )
            // InternalMyDsl.g:423:1: ( ( rule__Model__ElementAssignment_2 ) )
            {
            // InternalMyDsl.g:423:1: ( ( rule__Model__ElementAssignment_2 ) )
            // InternalMyDsl.g:424:2: ( rule__Model__ElementAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_2()); 
            // InternalMyDsl.g:425:2: ( rule__Model__ElementAssignment_2 )
            // InternalMyDsl.g:425:3: rule__Model__ElementAssignment_2
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
    // InternalMyDsl.g:433:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:437:1: ( rule__Model__Group__3__Impl )
            // InternalMyDsl.g:438:2: rule__Model__Group__3__Impl
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
    // InternalMyDsl.g:444:1: rule__Model__Group__3__Impl : ( ( rule__Model__ElementAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( ( rule__Model__ElementAssignment_3 ) ) )
            // InternalMyDsl.g:449:1: ( ( rule__Model__ElementAssignment_3 ) )
            {
            // InternalMyDsl.g:449:1: ( ( rule__Model__ElementAssignment_3 ) )
            // InternalMyDsl.g:450:2: ( rule__Model__ElementAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getElementAssignment_3()); 
            // InternalMyDsl.g:451:2: ( rule__Model__ElementAssignment_3 )
            // InternalMyDsl.g:451:3: rule__Model__ElementAssignment_3
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
    // InternalMyDsl.g:460:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalMyDsl.g:465:2: rule__Version__Group__0__Impl rule__Version__Group__1
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
    // InternalMyDsl.g:472:1: rule__Version__Group__0__Impl : ( 'version ' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( 'version ' ) )
            // InternalMyDsl.g:477:1: ( 'version ' )
            {
            // InternalMyDsl.g:477:1: ( 'version ' )
            // InternalMyDsl.g:478:2: 'version '
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:487:1: rule__Version__Group__1 : rule__Version__Group__1__Impl ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( rule__Version__Group__1__Impl )
            // InternalMyDsl.g:492:2: rule__Version__Group__1__Impl
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
    // InternalMyDsl.g:498:1: rule__Version__Group__1__Impl : ( ( rule__Version__NameAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( ( rule__Version__NameAssignment_1 ) ) )
            // InternalMyDsl.g:503:1: ( ( rule__Version__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:503:1: ( ( rule__Version__NameAssignment_1 ) )
            // InternalMyDsl.g:504:2: ( rule__Version__NameAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:505:2: ( rule__Version__NameAssignment_1 )
            // InternalMyDsl.g:505:3: rule__Version__NameAssignment_1
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
    // InternalMyDsl.g:514:1: rule__FeatureName__Group__0 : rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 ;
    public final void rule__FeatureName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:518:1: ( rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1 )
            // InternalMyDsl.g:519:2: rule__FeatureName__Group__0__Impl rule__FeatureName__Group__1
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
    // InternalMyDsl.g:526:1: rule__FeatureName__Group__0__Impl : ( 'name: ' ) ;
    public final void rule__FeatureName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( ( 'name: ' ) )
            // InternalMyDsl.g:531:1: ( 'name: ' )
            {
            // InternalMyDsl.g:531:1: ( 'name: ' )
            // InternalMyDsl.g:532:2: 'name: '
            {
             before(grammarAccess.getFeatureNameAccess().getNameKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:541:1: rule__FeatureName__Group__1 : rule__FeatureName__Group__1__Impl ;
    public final void rule__FeatureName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( rule__FeatureName__Group__1__Impl )
            // InternalMyDsl.g:546:2: rule__FeatureName__Group__1__Impl
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
    // InternalMyDsl.g:552:1: rule__FeatureName__Group__1__Impl : ( ( rule__FeatureName__NameAssignment_1 ) ) ;
    public final void rule__FeatureName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ( rule__FeatureName__NameAssignment_1 ) ) )
            // InternalMyDsl.g:557:1: ( ( rule__FeatureName__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:557:1: ( ( rule__FeatureName__NameAssignment_1 ) )
            // InternalMyDsl.g:558:2: ( rule__FeatureName__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureNameAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:559:2: ( rule__FeatureName__NameAssignment_1 )
            // InternalMyDsl.g:559:3: rule__FeatureName__NameAssignment_1
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
    // InternalMyDsl.g:568:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:572:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMyDsl.g:573:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalMyDsl.g:580:1: rule__Application__Group__0__Impl : ( 'application:' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( 'application:' ) )
            // InternalMyDsl.g:585:1: ( 'application:' )
            {
            // InternalMyDsl.g:585:1: ( 'application:' )
            // InternalMyDsl.g:586:2: 'application:'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:595:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:599:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMyDsl.g:600:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalMyDsl.g:607:1: rule__Application__Group__1__Impl : ( ( rule__Application__Features1Assignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( ( ( rule__Application__Features1Assignment_1 ) ) )
            // InternalMyDsl.g:612:1: ( ( rule__Application__Features1Assignment_1 ) )
            {
            // InternalMyDsl.g:612:1: ( ( rule__Application__Features1Assignment_1 ) )
            // InternalMyDsl.g:613:2: ( rule__Application__Features1Assignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getFeatures1Assignment_1()); 
            // InternalMyDsl.g:614:2: ( rule__Application__Features1Assignment_1 )
            // InternalMyDsl.g:614:3: rule__Application__Features1Assignment_1
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
    // InternalMyDsl.g:622:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:626:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMyDsl.g:627:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalMyDsl.g:634:1: rule__Application__Group__2__Impl : ( ( rule__Application__FeaturesAssignment_2 ) ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( ( ( rule__Application__FeaturesAssignment_2 ) ) )
            // InternalMyDsl.g:639:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            {
            // InternalMyDsl.g:639:1: ( ( rule__Application__FeaturesAssignment_2 ) )
            // InternalMyDsl.g:640:2: ( rule__Application__FeaturesAssignment_2 )
            {
             before(grammarAccess.getApplicationAccess().getFeaturesAssignment_2()); 
            // InternalMyDsl.g:641:2: ( rule__Application__FeaturesAssignment_2 )
            // InternalMyDsl.g:641:3: rule__Application__FeaturesAssignment_2
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
    // InternalMyDsl.g:649:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMyDsl.g:654:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalMyDsl.g:661:1: rule__Application__Group__3__Impl : ( ( rule__Application__FeatureAssignment_3 ) ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( ( ( rule__Application__FeatureAssignment_3 ) ) )
            // InternalMyDsl.g:666:1: ( ( rule__Application__FeatureAssignment_3 ) )
            {
            // InternalMyDsl.g:666:1: ( ( rule__Application__FeatureAssignment_3 ) )
            // InternalMyDsl.g:667:2: ( rule__Application__FeatureAssignment_3 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_3()); 
            // InternalMyDsl.g:668:2: ( rule__Application__FeatureAssignment_3 )
            // InternalMyDsl.g:668:3: rule__Application__FeatureAssignment_3
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
    // InternalMyDsl.g:676:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:680:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalMyDsl.g:681:2: rule__Application__Group__4__Impl rule__Application__Group__5
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
    // InternalMyDsl.g:688:1: rule__Application__Group__4__Impl : ( ( rule__Application__FeatureAssignment_4 )? ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ( rule__Application__FeatureAssignment_4 )? ) )
            // InternalMyDsl.g:693:1: ( ( rule__Application__FeatureAssignment_4 )? )
            {
            // InternalMyDsl.g:693:1: ( ( rule__Application__FeatureAssignment_4 )? )
            // InternalMyDsl.g:694:2: ( rule__Application__FeatureAssignment_4 )?
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_4()); 
            // InternalMyDsl.g:695:2: ( rule__Application__FeatureAssignment_4 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:695:3: rule__Application__FeatureAssignment_4
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
    // InternalMyDsl.g:703:1: rule__Application__Group__5 : rule__Application__Group__5__Impl rule__Application__Group__6 ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( rule__Application__Group__5__Impl rule__Application__Group__6 )
            // InternalMyDsl.g:708:2: rule__Application__Group__5__Impl rule__Application__Group__6
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
    // InternalMyDsl.g:715:1: rule__Application__Group__5__Impl : ( ( rule__Application__FeatureAssignment_5 ) ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( ( ( rule__Application__FeatureAssignment_5 ) ) )
            // InternalMyDsl.g:720:1: ( ( rule__Application__FeatureAssignment_5 ) )
            {
            // InternalMyDsl.g:720:1: ( ( rule__Application__FeatureAssignment_5 ) )
            // InternalMyDsl.g:721:2: ( rule__Application__FeatureAssignment_5 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_5()); 
            // InternalMyDsl.g:722:2: ( rule__Application__FeatureAssignment_5 )
            // InternalMyDsl.g:722:3: rule__Application__FeatureAssignment_5
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
    // InternalMyDsl.g:730:1: rule__Application__Group__6 : rule__Application__Group__6__Impl ;
    public final void rule__Application__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:734:1: ( rule__Application__Group__6__Impl )
            // InternalMyDsl.g:735:2: rule__Application__Group__6__Impl
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
    // InternalMyDsl.g:741:1: rule__Application__Group__6__Impl : ( ( rule__Application__FeatureAssignment_6 ) ) ;
    public final void rule__Application__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( ( rule__Application__FeatureAssignment_6 ) ) )
            // InternalMyDsl.g:746:1: ( ( rule__Application__FeatureAssignment_6 ) )
            {
            // InternalMyDsl.g:746:1: ( ( rule__Application__FeatureAssignment_6 ) )
            // InternalMyDsl.g:747:2: ( rule__Application__FeatureAssignment_6 )
            {
             before(grammarAccess.getApplicationAccess().getFeatureAssignment_6()); 
            // InternalMyDsl.g:748:2: ( rule__Application__FeatureAssignment_6 )
            // InternalMyDsl.g:748:3: rule__Application__FeatureAssignment_6
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
    // InternalMyDsl.g:757:1: rule__Tenant__Group__0 : rule__Tenant__Group__0__Impl rule__Tenant__Group__1 ;
    public final void rule__Tenant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:761:1: ( rule__Tenant__Group__0__Impl rule__Tenant__Group__1 )
            // InternalMyDsl.g:762:2: rule__Tenant__Group__0__Impl rule__Tenant__Group__1
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
    // InternalMyDsl.g:769:1: rule__Tenant__Group__0__Impl : ( 'tenant:' ) ;
    public final void rule__Tenant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( ( 'tenant:' ) )
            // InternalMyDsl.g:774:1: ( 'tenant:' )
            {
            // InternalMyDsl.g:774:1: ( 'tenant:' )
            // InternalMyDsl.g:775:2: 'tenant:'
            {
             before(grammarAccess.getTenantAccess().getTenantKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:784:1: rule__Tenant__Group__1 : rule__Tenant__Group__1__Impl ;
    public final void rule__Tenant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:788:1: ( rule__Tenant__Group__1__Impl )
            // InternalMyDsl.g:789:2: rule__Tenant__Group__1__Impl
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
    // InternalMyDsl.g:795:1: rule__Tenant__Group__1__Impl : ( ( rule__Tenant__Features1Assignment_1 ) ) ;
    public final void rule__Tenant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( rule__Tenant__Features1Assignment_1 ) ) )
            // InternalMyDsl.g:800:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            {
            // InternalMyDsl.g:800:1: ( ( rule__Tenant__Features1Assignment_1 ) )
            // InternalMyDsl.g:801:2: ( rule__Tenant__Features1Assignment_1 )
            {
             before(grammarAccess.getTenantAccess().getFeatures1Assignment_1()); 
            // InternalMyDsl.g:802:2: ( rule__Tenant__Features1Assignment_1 )
            // InternalMyDsl.g:802:3: rule__Tenant__Features1Assignment_1
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
    // InternalMyDsl.g:811:1: rule__Hold__Group__0 : rule__Hold__Group__0__Impl rule__Hold__Group__1 ;
    public final void rule__Hold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:815:1: ( rule__Hold__Group__0__Impl rule__Hold__Group__1 )
            // InternalMyDsl.g:816:2: rule__Hold__Group__0__Impl rule__Hold__Group__1
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
    // InternalMyDsl.g:823:1: rule__Hold__Group__0__Impl : ( 'hold:' ) ;
    public final void rule__Hold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( 'hold:' ) )
            // InternalMyDsl.g:828:1: ( 'hold:' )
            {
            // InternalMyDsl.g:828:1: ( 'hold:' )
            // InternalMyDsl.g:829:2: 'hold:'
            {
             before(grammarAccess.getHoldAccess().getHoldKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:838:1: rule__Hold__Group__1 : rule__Hold__Group__1__Impl rule__Hold__Group__2 ;
    public final void rule__Hold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( rule__Hold__Group__1__Impl rule__Hold__Group__2 )
            // InternalMyDsl.g:843:2: rule__Hold__Group__1__Impl rule__Hold__Group__2
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
    // InternalMyDsl.g:850:1: rule__Hold__Group__1__Impl : ( ( rule__Hold__Features1Assignment_1 ) ) ;
    public final void rule__Hold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( ( ( rule__Hold__Features1Assignment_1 ) ) )
            // InternalMyDsl.g:855:1: ( ( rule__Hold__Features1Assignment_1 ) )
            {
            // InternalMyDsl.g:855:1: ( ( rule__Hold__Features1Assignment_1 ) )
            // InternalMyDsl.g:856:2: ( rule__Hold__Features1Assignment_1 )
            {
             before(grammarAccess.getHoldAccess().getFeatures1Assignment_1()); 
            // InternalMyDsl.g:857:2: ( rule__Hold__Features1Assignment_1 )
            // InternalMyDsl.g:857:3: rule__Hold__Features1Assignment_1
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
    // InternalMyDsl.g:865:1: rule__Hold__Group__2 : rule__Hold__Group__2__Impl ;
    public final void rule__Hold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:869:1: ( rule__Hold__Group__2__Impl )
            // InternalMyDsl.g:870:2: rule__Hold__Group__2__Impl
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
    // InternalMyDsl.g:876:1: rule__Hold__Group__2__Impl : ( ( rule__Hold__FeaturesAssignment_2 ) ) ;
    public final void rule__Hold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( ( ( rule__Hold__FeaturesAssignment_2 ) ) )
            // InternalMyDsl.g:881:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            {
            // InternalMyDsl.g:881:1: ( ( rule__Hold__FeaturesAssignment_2 ) )
            // InternalMyDsl.g:882:2: ( rule__Hold__FeaturesAssignment_2 )
            {
             before(grammarAccess.getHoldAccess().getFeaturesAssignment_2()); 
            // InternalMyDsl.g:883:2: ( rule__Hold__FeaturesAssignment_2 )
            // InternalMyDsl.g:883:3: rule__Hold__FeaturesAssignment_2
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


    // $ANTLR start "rule__ArchiveTipe__Group__0"
    // InternalMyDsl.g:892:1: rule__ArchiveTipe__Group__0 : rule__ArchiveTipe__Group__0__Impl rule__ArchiveTipe__Group__1 ;
    public final void rule__ArchiveTipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:896:1: ( rule__ArchiveTipe__Group__0__Impl rule__ArchiveTipe__Group__1 )
            // InternalMyDsl.g:897:2: rule__ArchiveTipe__Group__0__Impl rule__ArchiveTipe__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ArchiveTipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArchiveTipe__Group__1();

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
    // $ANTLR end "rule__ArchiveTipe__Group__0"


    // $ANTLR start "rule__ArchiveTipe__Group__0__Impl"
    // InternalMyDsl.g:904:1: rule__ArchiveTipe__Group__0__Impl : ( 'archiveType: ' ) ;
    public final void rule__ArchiveTipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( 'archiveType: ' ) )
            // InternalMyDsl.g:909:1: ( 'archiveType: ' )
            {
            // InternalMyDsl.g:909:1: ( 'archiveType: ' )
            // InternalMyDsl.g:910:2: 'archiveType: '
            {
             before(grammarAccess.getArchiveTipeAccess().getArchiveTypeKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArchiveTipeAccess().getArchiveTypeKeyword_0()); 

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
    // $ANTLR end "rule__ArchiveTipe__Group__0__Impl"


    // $ANTLR start "rule__ArchiveTipe__Group__1"
    // InternalMyDsl.g:919:1: rule__ArchiveTipe__Group__1 : rule__ArchiveTipe__Group__1__Impl ;
    public final void rule__ArchiveTipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( rule__ArchiveTipe__Group__1__Impl )
            // InternalMyDsl.g:924:2: rule__ArchiveTipe__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveTipe__Group__1__Impl();

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
    // $ANTLR end "rule__ArchiveTipe__Group__1"


    // $ANTLR start "rule__ArchiveTipe__Group__1__Impl"
    // InternalMyDsl.g:930:1: rule__ArchiveTipe__Group__1__Impl : ( ( rule__ArchiveTipe__NameAssignment_1 ) ) ;
    public final void rule__ArchiveTipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( ( rule__ArchiveTipe__NameAssignment_1 ) ) )
            // InternalMyDsl.g:935:1: ( ( rule__ArchiveTipe__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:935:1: ( ( rule__ArchiveTipe__NameAssignment_1 ) )
            // InternalMyDsl.g:936:2: ( rule__ArchiveTipe__NameAssignment_1 )
            {
             before(grammarAccess.getArchiveTipeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:937:2: ( rule__ArchiveTipe__NameAssignment_1 )
            // InternalMyDsl.g:937:3: rule__ArchiveTipe__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArchiveTipe__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArchiveTipeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ArchiveTipe__Group__1__Impl"


    // $ANTLR start "rule__Category__Group__0"
    // InternalMyDsl.g:946:1: rule__Category__Group__0 : rule__Category__Group__0__Impl rule__Category__Group__1 ;
    public final void rule__Category__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:950:1: ( rule__Category__Group__0__Impl rule__Category__Group__1 )
            // InternalMyDsl.g:951:2: rule__Category__Group__0__Impl rule__Category__Group__1
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
    // InternalMyDsl.g:958:1: rule__Category__Group__0__Impl : ( 'category: ' ) ;
    public final void rule__Category__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( ( 'category: ' ) )
            // InternalMyDsl.g:963:1: ( 'category: ' )
            {
            // InternalMyDsl.g:963:1: ( 'category: ' )
            // InternalMyDsl.g:964:2: 'category: '
            {
             before(grammarAccess.getCategoryAccess().getCategoryKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:973:1: rule__Category__Group__1 : rule__Category__Group__1__Impl ;
    public final void rule__Category__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:977:1: ( rule__Category__Group__1__Impl )
            // InternalMyDsl.g:978:2: rule__Category__Group__1__Impl
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
    // InternalMyDsl.g:984:1: rule__Category__Group__1__Impl : ( ( rule__Category__NameAssignment_1 ) ) ;
    public final void rule__Category__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( ( rule__Category__NameAssignment_1 ) ) )
            // InternalMyDsl.g:989:1: ( ( rule__Category__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:989:1: ( ( rule__Category__NameAssignment_1 ) )
            // InternalMyDsl.g:990:2: ( rule__Category__NameAssignment_1 )
            {
             before(grammarAccess.getCategoryAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:991:2: ( rule__Category__NameAssignment_1 )
            // InternalMyDsl.g:991:3: rule__Category__NameAssignment_1
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
    // InternalMyDsl.g:1000:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalMyDsl.g:1005:2: rule__Description__Group__0__Impl rule__Description__Group__1
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
    // InternalMyDsl.g:1012:1: rule__Description__Group__0__Impl : ( 'description: ' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( 'description: ' ) )
            // InternalMyDsl.g:1017:1: ( 'description: ' )
            {
            // InternalMyDsl.g:1017:1: ( 'description: ' )
            // InternalMyDsl.g:1018:2: 'description: '
            {
             before(grammarAccess.getDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1027:1: rule__Description__Group__1 : rule__Description__Group__1__Impl ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( rule__Description__Group__1__Impl )
            // InternalMyDsl.g:1032:2: rule__Description__Group__1__Impl
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
    // InternalMyDsl.g:1038:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1043:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1043:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalMyDsl.g:1044:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1045:2: ( rule__Description__NameAssignment_1 )
            // InternalMyDsl.g:1045:3: rule__Description__NameAssignment_1
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
    // InternalMyDsl.g:1054:1: rule__MCS__Group__0 : rule__MCS__Group__0__Impl rule__MCS__Group__1 ;
    public final void rule__MCS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1058:1: ( rule__MCS__Group__0__Impl rule__MCS__Group__1 )
            // InternalMyDsl.g:1059:2: rule__MCS__Group__0__Impl rule__MCS__Group__1
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
    // InternalMyDsl.g:1066:1: rule__MCS__Group__0__Impl : ( 'metadataCacheSize: ' ) ;
    public final void rule__MCS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( 'metadataCacheSize: ' ) )
            // InternalMyDsl.g:1071:1: ( 'metadataCacheSize: ' )
            {
            // InternalMyDsl.g:1071:1: ( 'metadataCacheSize: ' )
            // InternalMyDsl.g:1072:2: 'metadataCacheSize: '
            {
             before(grammarAccess.getMCSAccess().getMetadataCacheSizeKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1081:1: rule__MCS__Group__1 : rule__MCS__Group__1__Impl ;
    public final void rule__MCS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1085:1: ( rule__MCS__Group__1__Impl )
            // InternalMyDsl.g:1086:2: rule__MCS__Group__1__Impl
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
    // InternalMyDsl.g:1092:1: rule__MCS__Group__1__Impl : ( ( rule__MCS__NameAssignment_1 ) ) ;
    public final void rule__MCS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( ( ( rule__MCS__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1097:1: ( ( rule__MCS__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1097:1: ( ( rule__MCS__NameAssignment_1 ) )
            // InternalMyDsl.g:1098:2: ( rule__MCS__NameAssignment_1 )
            {
             before(grammarAccess.getMCSAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1099:2: ( rule__MCS__NameAssignment_1 )
            // InternalMyDsl.g:1099:3: rule__MCS__NameAssignment_1
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
    // InternalMyDsl.g:1108:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1112:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalMyDsl.g:1113:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:1120:1: rule__Type__Group__0__Impl : ( 'type: ' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( 'type: ' ) )
            // InternalMyDsl.g:1125:1: ( 'type: ' )
            {
            // InternalMyDsl.g:1125:1: ( 'type: ' )
            // InternalMyDsl.g:1126:2: 'type: '
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:1135:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( rule__Type__Group__1__Impl )
            // InternalMyDsl.g:1140:2: rule__Type__Group__1__Impl
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
    // InternalMyDsl.g:1146:1: rule__Type__Group__1__Impl : ( ( rule__Type__NameAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Type__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1151:1: ( ( rule__Type__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1151:1: ( ( rule__Type__NameAssignment_1 ) )
            // InternalMyDsl.g:1152:2: ( rule__Type__NameAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1153:2: ( rule__Type__NameAssignment_1 )
            // InternalMyDsl.g:1153:3: rule__Type__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_1()); 

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
    // InternalMyDsl.g:1162:1: rule__HoldType__Group__0 : rule__HoldType__Group__0__Impl rule__HoldType__Group__1 ;
    public final void rule__HoldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( rule__HoldType__Group__0__Impl rule__HoldType__Group__1 )
            // InternalMyDsl.g:1167:2: rule__HoldType__Group__0__Impl rule__HoldType__Group__1
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
    // InternalMyDsl.g:1174:1: rule__HoldType__Group__0__Impl : ( 'holdType:' ) ;
    public final void rule__HoldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( ( 'holdType:' ) )
            // InternalMyDsl.g:1179:1: ( 'holdType:' )
            {
            // InternalMyDsl.g:1179:1: ( 'holdType:' )
            // InternalMyDsl.g:1180:2: 'holdType:'
            {
             before(grammarAccess.getHoldTypeAccess().getHoldTypeKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:1189:1: rule__HoldType__Group__1 : rule__HoldType__Group__1__Impl ;
    public final void rule__HoldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1193:1: ( rule__HoldType__Group__1__Impl )
            // InternalMyDsl.g:1194:2: rule__HoldType__Group__1__Impl
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
    // InternalMyDsl.g:1200:1: rule__HoldType__Group__1__Impl : ( ( rule__HoldType__FeaturesAssignment_1 ) ) ;
    public final void rule__HoldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ( rule__HoldType__FeaturesAssignment_1 ) ) )
            // InternalMyDsl.g:1205:1: ( ( rule__HoldType__FeaturesAssignment_1 ) )
            {
            // InternalMyDsl.g:1205:1: ( ( rule__HoldType__FeaturesAssignment_1 ) )
            // InternalMyDsl.g:1206:2: ( rule__HoldType__FeaturesAssignment_1 )
            {
             before(grammarAccess.getHoldTypeAccess().getFeaturesAssignment_1()); 
            // InternalMyDsl.g:1207:2: ( rule__HoldType__FeaturesAssignment_1 )
            // InternalMyDsl.g:1207:3: rule__HoldType__FeaturesAssignment_1
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
    // InternalMyDsl.g:1216:1: rule__Model__ElementAssignment_0 : ( ruleVersion ) ;
    public final void rule__Model__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1220:1: ( ( ruleVersion ) )
            // InternalMyDsl.g:1221:2: ( ruleVersion )
            {
            // InternalMyDsl.g:1221:2: ( ruleVersion )
            // InternalMyDsl.g:1222:3: ruleVersion
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
    // InternalMyDsl.g:1231:1: rule__Model__ElementAssignment_1 : ( ruleApplication ) ;
    public final void rule__Model__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( ( ruleApplication ) )
            // InternalMyDsl.g:1236:2: ( ruleApplication )
            {
            // InternalMyDsl.g:1236:2: ( ruleApplication )
            // InternalMyDsl.g:1237:3: ruleApplication
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
    // InternalMyDsl.g:1246:1: rule__Model__ElementAssignment_2 : ( ruleTenant ) ;
    public final void rule__Model__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( ruleTenant ) )
            // InternalMyDsl.g:1251:2: ( ruleTenant )
            {
            // InternalMyDsl.g:1251:2: ( ruleTenant )
            // InternalMyDsl.g:1252:3: ruleTenant
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
    // InternalMyDsl.g:1261:1: rule__Model__ElementAssignment_3 : ( ruleHold ) ;
    public final void rule__Model__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( ruleHold ) )
            // InternalMyDsl.g:1266:2: ( ruleHold )
            {
            // InternalMyDsl.g:1266:2: ( ruleHold )
            // InternalMyDsl.g:1267:3: ruleHold
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
    // InternalMyDsl.g:1276:1: rule__Version__NameAssignment_1 : ( RULE_ID1 ) ;
    public final void rule__Version__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( ( RULE_ID1 ) )
            // InternalMyDsl.g:1281:2: ( RULE_ID1 )
            {
            // InternalMyDsl.g:1281:2: ( RULE_ID1 )
            // InternalMyDsl.g:1282:3: RULE_ID1
            {
             before(grammarAccess.getVersionAccess().getNameID1TerminalRuleCall_1_0()); 
            match(input,RULE_ID1,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getNameID1TerminalRuleCall_1_0()); 

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
    // InternalMyDsl.g:1291:1: rule__FeatureName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FeatureName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1295:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1296:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1296:2: ( RULE_ID )
            // InternalMyDsl.g:1297:3: RULE_ID
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
    // InternalMyDsl.g:1306:1: rule__Application__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Application__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1310:1: ( ( ruleFeatureName ) )
            // InternalMyDsl.g:1311:2: ( ruleFeatureName )
            {
            // InternalMyDsl.g:1311:2: ( ruleFeatureName )
            // InternalMyDsl.g:1312:3: ruleFeatureName
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
    // InternalMyDsl.g:1321:1: rule__Application__FeaturesAssignment_2 : ( ruleArchiveTipe ) ;
    public final void rule__Application__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( ruleArchiveTipe ) )
            // InternalMyDsl.g:1326:2: ( ruleArchiveTipe )
            {
            // InternalMyDsl.g:1326:2: ( ruleArchiveTipe )
            // InternalMyDsl.g:1327:3: ruleArchiveTipe
            {
             before(grammarAccess.getApplicationAccess().getFeaturesArchiveTipeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArchiveTipe();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getFeaturesArchiveTipeParserRuleCall_2_0()); 

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
    // InternalMyDsl.g:1336:1: rule__Application__FeatureAssignment_3 : ( ruleCategory ) ;
    public final void rule__Application__FeatureAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( ( ruleCategory ) )
            // InternalMyDsl.g:1341:2: ( ruleCategory )
            {
            // InternalMyDsl.g:1341:2: ( ruleCategory )
            // InternalMyDsl.g:1342:3: ruleCategory
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
    // InternalMyDsl.g:1351:1: rule__Application__FeatureAssignment_4 : ( ruleDescription ) ;
    public final void rule__Application__FeatureAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1355:1: ( ( ruleDescription ) )
            // InternalMyDsl.g:1356:2: ( ruleDescription )
            {
            // InternalMyDsl.g:1356:2: ( ruleDescription )
            // InternalMyDsl.g:1357:3: ruleDescription
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
    // InternalMyDsl.g:1366:1: rule__Application__FeatureAssignment_5 : ( ruleMCS ) ;
    public final void rule__Application__FeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( ( ruleMCS ) )
            // InternalMyDsl.g:1371:2: ( ruleMCS )
            {
            // InternalMyDsl.g:1371:2: ( ruleMCS )
            // InternalMyDsl.g:1372:3: ruleMCS
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
    // InternalMyDsl.g:1381:1: rule__Application__FeatureAssignment_6 : ( ruleType ) ;
    public final void rule__Application__FeatureAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( ruleType ) )
            // InternalMyDsl.g:1386:2: ( ruleType )
            {
            // InternalMyDsl.g:1386:2: ( ruleType )
            // InternalMyDsl.g:1387:3: ruleType
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
    // InternalMyDsl.g:1396:1: rule__Tenant__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Tenant__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( ruleFeatureName ) )
            // InternalMyDsl.g:1401:2: ( ruleFeatureName )
            {
            // InternalMyDsl.g:1401:2: ( ruleFeatureName )
            // InternalMyDsl.g:1402:3: ruleFeatureName
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
    // InternalMyDsl.g:1411:1: rule__Hold__Features1Assignment_1 : ( ruleFeatureName ) ;
    public final void rule__Hold__Features1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( ( ruleFeatureName ) )
            // InternalMyDsl.g:1416:2: ( ruleFeatureName )
            {
            // InternalMyDsl.g:1416:2: ( ruleFeatureName )
            // InternalMyDsl.g:1417:3: ruleFeatureName
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
    // InternalMyDsl.g:1426:1: rule__Hold__FeaturesAssignment_2 : ( ruleHoldType ) ;
    public final void rule__Hold__FeaturesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1430:1: ( ( ruleHoldType ) )
            // InternalMyDsl.g:1431:2: ( ruleHoldType )
            {
            // InternalMyDsl.g:1431:2: ( ruleHoldType )
            // InternalMyDsl.g:1432:3: ruleHoldType
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


    // $ANTLR start "rule__ArchiveTipe__NameAssignment_1"
    // InternalMyDsl.g:1441:1: rule__ArchiveTipe__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArchiveTipe__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1446:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1446:2: ( RULE_ID )
            // InternalMyDsl.g:1447:3: RULE_ID
            {
             before(grammarAccess.getArchiveTipeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArchiveTipeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ArchiveTipe__NameAssignment_1"


    // $ANTLR start "rule__Category__NameAssignment_1"
    // InternalMyDsl.g:1456:1: rule__Category__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Category__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1461:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1461:2: ( RULE_ID )
            // InternalMyDsl.g:1462:3: RULE_ID
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
    // InternalMyDsl.g:1471:1: rule__Description__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1476:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1476:2: ( RULE_ID )
            // InternalMyDsl.g:1477:3: RULE_ID
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
    // InternalMyDsl.g:1486:1: rule__MCS__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MCS__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1490:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1491:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1491:2: ( RULE_ID )
            // InternalMyDsl.g:1492:3: RULE_ID
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


    // $ANTLR start "rule__Type__NameAssignment_1"
    // InternalMyDsl.g:1501:1: rule__Type__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1506:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1506:2: ( RULE_ID )
            // InternalMyDsl.g:1507:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Type__NameAssignment_1"


    // $ANTLR start "rule__HoldType__FeaturesAssignment_1"
    // InternalMyDsl.g:1516:1: rule__HoldType__FeaturesAssignment_1 : ( ruleType ) ;
    public final void rule__HoldType__FeaturesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( ( ruleType ) )
            // InternalMyDsl.g:1521:2: ( ruleType )
            {
            // InternalMyDsl.g:1521:2: ( ruleType )
            // InternalMyDsl.g:1522:3: ruleType
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