package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wjq implements wjf {
    public final wje a;
    public final Activity b;
    public final wkk c;
    public final wjh d;
    public boolean e;
    public cnl f;
    private final wiz g;
    private final wcm h;
    private final wjd i;
    private final apxf j;
    private final afsy k;
    private final aahd l;

    public wjq(wcd wcdVar, Activity activity, wkk wkkVar, aatg aatgVar, wcm wcmVar, wiz wizVar, afsy afsyVar, wjd wjdVar, wbz wbzVar, apxf apxfVar, aahd aahdVar, boolean z) {
        this(wcdVar, activity, wkkVar, aatgVar, wcmVar, afsyVar, wizVar, wjdVar, apxfVar, aahdVar, z);
        List a = wbzVar.a();
        if (!a.isEmpty() || wbzVar.b()) {
            wcdVar.h(true);
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            wcdVar.b.addView((View) it.next());
        }
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            this.i.aH(new wjc(wjb.CANCELLED, false));
        }
    }

    public final void c() {
        this.a.m();
        AccountIdentity accountIdentity = this.k.t() ? (AccountIdentity) this.k.c() : null;
        wjo wjoVar = new wjo(this);
        this.f = wjoVar;
        this.h.b(accountIdentity, wjoVar);
    }

    public final void d() {
        if (!this.e) {
            this.e = true;
            this.i.aH(new wjc(wjb.STARTED, false));
        }
        c();
    }

    @Override // defpackage.wib
    public final void i(aatb aatbVar) {
        throw null;
    }

    @Override // defpackage.wic
    public final void j() {
        throw null;
    }

    @Override // defpackage.wid
    public final void k() {
        throw null;
    }

    public wjq(wje wjeVar, Activity activity, wkk wkkVar, aatg aatgVar, wcm wcmVar, afsy afsyVar, wiz wizVar, wjd wjdVar, apxf apxfVar, aahd aahdVar, boolean z) {
        this.a = wjeVar;
        this.b = activity;
        this.c = wkkVar;
        this.h = wcmVar;
        this.k = afsyVar;
        this.g = wizVar;
        this.d = new wjh(wizVar, aatgVar, afsyVar, apxfVar);
        this.i = wjdVar;
        this.j = apxfVar;
        this.l = aahdVar;
        this.e = z;
    }

    @Override // defpackage.wia
    public final void a(aata aataVar) {
        auuo auuoVar = aataVar.d;
        if (auuoVar != null) {
            if (this.j != null) {
                aone createBuilder = auuo.a.createBuilder(auuoVar);
                apxf apxfVar = this.j;
                createBuilder.copyOnWrite();
                auuo auuoVar2 = (auuo) createBuilder.instance;
                apxfVar.getClass();
                auuoVar2.c = apxfVar;
                auuoVar2.b |= 2;
                auuoVar = (auuo) createBuilder.build();
            }
            aahd aahdVar = this.l;
            aong aongVar = (aong) apxf.a.createBuilder();
            aongVar.e(SignInEndpointOuterClass.signInEndpoint, auuoVar);
            aahdVar.c((apxf) aongVar.build(), null);
            return;
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = aataVar.e;
        if (inlineAuthCommandOuterClass$InlineAuthCommand == null) {
            aova aovaVar = aataVar.a;
            if (aovaVar != null) {
                apxf apxfVar2 = aovaVar.j;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                if (apxfVar2.pY(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                    aahd aahdVar2 = this.l;
                    apxf apxfVar3 = aataVar.a.j;
                    if (apxfVar3 == null) {
                        apxfVar3 = apxf.a;
                    }
                    aahdVar2.a(apxfVar3);
                    return;
                }
            }
            this.g.i(aataVar, this.j, new wjp(this));
            return;
        }
        aahd aahdVar3 = this.l;
        aong aongVar2 = (aong) apxf.a.createBuilder();
        aongVar2.e(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand);
        aahdVar3.c((apxf) aongVar2.build(), null);
    }
}
