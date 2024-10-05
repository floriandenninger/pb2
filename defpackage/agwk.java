package defpackage;

import java.security.Key;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agwk {
    public final phg a;
    public afhf b;
    private final amnv c;
    private Key d;
    private Key e;
    private final shf f;
    private final Object g;
    private final adyc h;
    private final ptk i;
    private final ammv j;
    private final adyl k;
    private final aeeg l;
    private final afhs m;

    public agwk(agwk agwkVar) {
        this.c = agwkVar.c;
        this.a = agwkVar.a;
        this.d = agwkVar.d;
        this.e = agwkVar.e;
        this.b = agwkVar.b;
        this.l = agwkVar.l;
        this.f = agwkVar.f;
        this.g = agwkVar.g;
        this.h = agwkVar.h;
        this.i = agwkVar.i;
        this.j = agwkVar.j;
        this.k = agwkVar.k;
        this.m = agwkVar.m;
    }

    public agwk(amnv amnvVar, phg phgVar, shf shfVar, Object obj, adyc adycVar, ptk ptkVar, ammv ammvVar, adyl adylVar, afhs afhsVar) {
        this.c = amnvVar;
        this.a = phgVar;
        this.f = shfVar;
        this.g = obj;
        this.h = adycVar;
        this.i = ptkVar;
        this.l = new aeeg(phgVar);
        this.j = ammvVar;
        this.k = adylVar;
        this.m = afhsVar;
    }

    public final aeek a() {
        return new aeek(this.c, this.a, this.d, this.e, this.b, this.l, this.f, this.g, this.h, this.i, this.j, this.k, this.m);
    }

    public final void b(Key key) {
        this.d = key;
        this.e = key;
    }
}
