package defpackage;

import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aatj {
    public String a;
    public String b;
    public String c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public String i;
    private SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint j;
    private apud k;
    private String l;
    private aovp m;

    public aatj() {
    }

    public aatj(apud apudVar) {
        this.k = apudVar;
    }

    public aatj(SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint) {
        this.j = selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
    }

    public final String a() {
        if (this.l == null) {
            b();
        }
        return this.l;
    }

    public final void b() {
        SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint = this.j;
        if (selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint == null) {
            apud apudVar = this.k;
            if (apudVar != null) {
                this.l = apudVar.h;
                if (new aonw(apudVar.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_MADISON_ACCOUNT)) {
                    this.b = this.k.d;
                }
                if (new aonw(this.k.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_YOUTUBE_PERSONA)) {
                    this.e = true;
                    apud apudVar2 = this.k;
                    String str = apudVar2.d;
                    this.i = str;
                    this.l = str;
                    String str2 = apudVar2.e;
                }
                if (new aonw(this.k.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                    this.f = true;
                    int aL = aobq.aL(this.k.f);
                    if (aL != 0 && aL == 3) {
                        this.l = this.k.d;
                        this.h = true;
                    }
                }
                if (new aonw(this.k.g, apud.a).contains(aovo.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                    this.g = true;
                    int aL2 = aobq.aL(this.k.f);
                    if (aL2 != 0 && aL2 == 3) {
                        this.l = this.k.d;
                        this.h = true;
                    }
                }
                apud apudVar3 = this.k;
                this.a = apudVar3.i;
                aqih aqihVar = apudVar3.j;
                if (aqihVar == null) {
                    aqihVar = aqih.a;
                }
                this.c = aqihVar.b;
                return;
            }
            return;
        }
        if (selectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.b.size() == 0) {
            return;
        }
        for (aovq aovqVar : this.j.b) {
            if ((aovqVar.b & 4) != 0) {
                aovs aovsVar = aovqVar.d;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                this.l = aovsVar.c;
            }
            if ((aovqVar.b & 8) != 0) {
                aovt aovtVar = aovqVar.e;
                if (aovtVar == null) {
                    aovtVar = aovt.a;
                }
                if (!aovtVar.b.isEmpty()) {
                    aovt aovtVar2 = aovqVar.e;
                    if (aovtVar2 == null) {
                        aovtVar2 = aovt.a;
                    }
                    this.b = aovtVar2.b;
                }
            }
            if ((aovqVar.b & 1) != 0) {
                aovr aovrVar = aovqVar.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                if (!aovrVar.c.isEmpty()) {
                    aovr aovrVar2 = aovqVar.c;
                    if (aovrVar2 == null) {
                        aovrVar2 = aovr.a;
                    }
                    this.a = aovrVar2.c;
                }
            }
            if ((aovqVar.b & 1024) != 0) {
                aovv aovvVar = aovqVar.h;
                if (aovvVar == null) {
                    aovvVar = aovv.a;
                }
                this.d = Boolean.valueOf(aovvVar.b);
            }
            if ((aovqVar.b & 2048) != 0) {
                aqih aqihVar2 = aovqVar.i;
                if (aqihVar2 == null) {
                    aqihVar2 = aqih.a;
                }
                this.c = aqihVar2.b;
            }
            if ((aovqVar.b & 128) != 0 && this.m == null) {
                aovp aovpVar = aovqVar.g;
                if (aovpVar == null) {
                    aovpVar = aovp.b;
                }
                this.m = aovpVar;
                if (new aonw(aovpVar.d, aovp.a).contains(aovo.REGISTERED_GAIA_SERVICES_IS_UNICORN_CHILD_ACCOUNT)) {
                    this.f = true;
                }
                if (new aonw(this.m.d, aovp.a).contains(aovo.REGISTERED_GAIA_SERVICES_HAS_GRIFFIN_POLICY)) {
                    this.g = true;
                }
            }
            if ((aovqVar.b & 16) != 0) {
                this.e = true;
                aovu aovuVar = aovqVar.f;
                if (aovuVar == null) {
                    aovuVar = aovu.a;
                }
                this.i = aovuVar.b;
                aovu aovuVar2 = aovqVar.f;
                if (aovuVar2 == null) {
                    aovuVar2 = aovu.a;
                }
                this.l = aovuVar2.b;
                aovu aovuVar3 = aovqVar.f;
                if (aovuVar3 == null) {
                    aovuVar3 = aovu.a;
                }
                String str3 = aovuVar3.c;
            }
        }
    }
}
