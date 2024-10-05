package defpackage;

import android.text.Spanned;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aata {
    public final aova a;
    public aami b;
    public aatj c;
    public auuo d;
    public InlineAuthCommandOuterClass$InlineAuthCommand e;
    public StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand f;
    private aami g;

    public aata(aova aovaVar) {
        this.a = aovaVar;
        if (aovaVar == null || (aovaVar.b & 256) == 0) {
            return;
        }
        apxf apxfVar = aovaVar.j;
        if (!(apxfVar == null ? apxf.a : apxfVar).pY(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
            apxf apxfVar2 = aovaVar.j;
            if (!(apxfVar2 == null ? apxf.a : apxfVar2).pY(aupc.b)) {
                apxf apxfVar3 = aovaVar.j;
                if (!(apxfVar3 == null ? apxf.a : apxfVar3).pY(SignInEndpointOuterClass.signInEndpoint)) {
                    apxf apxfVar4 = aovaVar.j;
                    if (!(apxfVar4 == null ? apxf.a : apxfVar4).pY(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand)) {
                        apxf apxfVar5 = aovaVar.j;
                        if ((apxfVar5 == null ? apxf.a : apxfVar5).pY(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand)) {
                            apxf apxfVar6 = aovaVar.j;
                            StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand) (apxfVar6 == null ? apxf.a : apxfVar6).pX(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand);
                            this.f = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
                            apxf apxfVar7 = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand.e;
                            if ((apxfVar7 == null ? apxf.a : apxfVar7).pY(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint)) {
                                apxf apxfVar8 = this.f.e;
                                this.c = new aatj((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) (apxfVar8 == null ? apxf.a : apxfVar8).pX(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint));
                            }
                            apxf apxfVar9 = this.f.e;
                            if ((apxfVar9 == null ? apxf.a : apxfVar9).pY(SignInEndpointOuterClass.signInEndpoint)) {
                                apxf apxfVar10 = this.f.e;
                                apud apudVar = ((auuo) (apxfVar10 == null ? apxf.a : apxfVar10).pX(SignInEndpointOuterClass.signInEndpoint)).e;
                                this.c = new aatj(apudVar == null ? apud.b : apudVar);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    apxf apxfVar11 = aovaVar.j;
                    InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = (InlineAuthCommandOuterClass$InlineAuthCommand) (apxfVar11 == null ? apxf.a : apxfVar11).pX(InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand);
                    this.e = inlineAuthCommandOuterClass$InlineAuthCommand;
                    apxf apxfVar12 = inlineAuthCommandOuterClass$InlineAuthCommand.c;
                    if ((apxfVar12 == null ? apxf.a : apxfVar12).pY(SignInEndpointOuterClass.signInEndpoint)) {
                        apxf apxfVar13 = this.e.c;
                        apud apudVar2 = ((auuo) (apxfVar13 == null ? apxf.a : apxfVar13).pX(SignInEndpointOuterClass.signInEndpoint)).e;
                        this.c = new aatj(apudVar2 == null ? apud.b : apudVar2);
                        return;
                    }
                    return;
                }
                apxf apxfVar14 = aovaVar.j;
                this.d = (auuo) (apxfVar14 == null ? apxf.a : apxfVar14).pX(SignInEndpointOuterClass.signInEndpoint);
                apud apudVar3 = this.d.e;
                this.c = new aatj(apudVar3 == null ? apud.b : apudVar3);
                return;
            }
            apxf apxfVar15 = aovaVar.j;
            this.c = new aatj();
            return;
        }
        apxf apxfVar16 = aovaVar.j;
        this.c = new aatj((SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) (apxfVar16 == null ? apxf.a : apxfVar16).pX(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint));
    }

    public final Spanned a() {
        aqyg aqygVar;
        aova aovaVar = this.a;
        if ((aovaVar.b & 4) != 0) {
            aqygVar = aovaVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public final Spanned b() {
        aqyg aqygVar;
        aova aovaVar = this.a;
        if ((aovaVar.b & 8) != 0) {
            aqygVar = aovaVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public final aami c() {
        if (this.g == null) {
            avgg avggVar = this.a.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            this.g = new aami(avggVar);
        }
        return this.g;
    }

    public final apxf d() {
        apxf apxfVar = this.a.j;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    public final arfr e() {
        aova aovaVar = this.a;
        if ((aovaVar.b & 1024) == 0) {
            return null;
        }
        arfr b = arfr.b(aovaVar.k);
        return b == null ? arfr.UNKNOWN : b;
    }

    public final aulq f() {
        aova aovaVar = this.a;
        if ((aovaVar.b & 32) == 0) {
            return null;
        }
        aulq aulqVar = aovaVar.g;
        return aulqVar == null ? aulq.a : aulqVar;
    }

    public final String g() {
        aatj aatjVar = this.c;
        if (aatjVar.a == null) {
            aatjVar.b();
        }
        return aatjVar.a;
    }

    public final String h() {
        aatj aatjVar = this.c;
        if (aatjVar.c == null) {
            aatjVar.b();
        }
        return aatjVar.c;
    }

    public final String i() {
        return this.c.a();
    }

    public final String j() {
        aatj aatjVar = this.c;
        if (aatjVar.b == null) {
            aatjVar.b();
        }
        return aatjVar.b;
    }

    public final String k() {
        aatj aatjVar = this.c;
        if (aatjVar.i == null) {
            aatjVar.b();
        }
        return aatjVar.i;
    }

    public final boolean l() {
        return this.c != null;
    }

    public final boolean m() {
        aatj aatjVar = this.c;
        if (aatjVar.g == null) {
            aatjVar.b();
        }
        Boolean bool = aatjVar.g;
        return bool != null && bool.booleanValue();
    }

    public final boolean n() {
        aatj aatjVar = this.c;
        if (aatjVar.e == null) {
            aatjVar.b();
        }
        Boolean bool = aatjVar.e;
        return bool != null && bool.booleanValue();
    }

    public final boolean o() {
        return this.a.h;
    }

    public final boolean p() {
        aatj aatjVar = this.c;
        if (aatjVar.f == null) {
            aatjVar.b();
        }
        Boolean bool = aatjVar.f;
        return bool != null && bool.booleanValue();
    }

    public final byte[] q() {
        return this.a.c.I();
    }
}
