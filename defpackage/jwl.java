package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwl extends agxz {
    public final jwt a;
    private final ysy i;
    private final jup j;
    private final agzk k;
    private final jws l;
    private final Integer m;
    private final fjs n;
    private final agzl o;
    private final agzr p;
    private final axzf q;

    public jwl(Activity activity, afsy afsyVar, agof agofVar, agro agroVar, aftn aftnVar, zaw zawVar, ysy ysyVar, jup jupVar, agzk agzkVar, agyq agyqVar, zbi zbiVar, jws jwsVar, jwt jwtVar, agzl agzlVar, Integer num, agel agelVar, fjs fjsVar, agzr agzrVar, agkd agkdVar, Executor executor, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(activity, afsyVar, agofVar, agroVar, aftnVar, zawVar, ysyVar, jupVar, agzkVar, agyqVar, zbiVar, agzlVar, agelVar, agzrVar, agkdVar, executor);
        this.i = ysyVar;
        this.j = jupVar;
        this.k = agzkVar;
        this.l = jwsVar;
        this.a = jwtVar;
        this.o = agzlVar;
        this.m = num;
        this.n = fjsVar;
        this.p = agzrVar;
        this.q = axzfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agxz
    public final int a() {
        return this.m.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agxz
    public final void b(final String str, final atsb atsbVar, final agzi agziVar, final acra acraVar, atom atomVar, final int i) {
        atrx u;
        atol atolVar;
        atrx atrxVar;
        final byte[] I = (atsbVar.b & 128) != 0 ? atsbVar.i.I() : aaef.b;
        this.j.k(atomVar);
        if (this.j.m(atsbVar, atomVar)) {
            this.k.h(str, atsbVar, acraVar, new agzo() { // from class: jwj
                @Override // defpackage.agzo
                public final void a(atrx atrxVar2, atol atolVar2) {
                    jwl jwlVar = jwl.this;
                    atsb atsbVar2 = atsbVar;
                    acra acraVar2 = acraVar;
                    String str2 = str;
                    byte[] bArr = I;
                    agzi agziVar2 = agziVar;
                    int i2 = i;
                    ahbj.k(atsbVar2, acraVar2, str2, null, atrxVar2, false, agno.OFFLINE_IMMEDIATELY, atolVar2);
                    jwlVar.i(str2, atrxVar2, null, agno.OFFLINE_IMMEDIATELY, bArr, agziVar2, i2);
                }
            });
            return;
        }
        if (this.q.h().booleanValue()) {
            atrx atrxVar2 = (atrx) Optional.ofNullable(atomVar).filter(ghv.u).map(iur.u).orElse(this.j.v(atrx.UNKNOWN_FORMAT_TYPE));
            fav.I(Optional.ofNullable(atomVar), atrxVar2, atsbVar, acraVar, Optional.of(str), Optional.empty());
            atrxVar = atrxVar2;
        } else {
            if (atomVar == null || (atomVar.b & 1) == 0) {
                u = this.j.u();
            } else {
                u = atrx.b(atomVar.c);
                if (u == null) {
                    u = atrx.UNKNOWN_FORMAT_TYPE;
                }
            }
            atrx atrxVar3 = u;
            agno agnoVar = agno.OFFLINE_IMMEDIATELY;
            if (atomVar == null || (atomVar.b & 2) == 0) {
                atolVar = null;
            } else {
                atol b = atol.b(atomVar.d);
                if (b == null) {
                    b = atol.DOWNLOAD_QUALITY_SETTINGS_ACTION_UNKNOWN;
                }
                atolVar = b;
            }
            ahbj.k(atsbVar, acraVar, str, null, atrxVar3, true, agnoVar, atolVar);
            atrxVar = atrxVar3;
        }
        i(str, atrxVar, atomVar != null ? atomVar.e : null, agno.OFFLINE_IMMEDIATELY, I, agziVar, i);
    }

    @Override // defpackage.agxz, defpackage.agzj
    public final void c(String str, boolean z) {
        if (!z) {
            this.l.c(str);
        } else {
            super.c(str, true);
        }
    }

    @Override // defpackage.agxz, defpackage.agzj
    public final void d(String str, boolean z) {
        if (!z) {
            this.l.c(aalt.g(str));
        } else {
            super.d(str, true);
        }
    }

    @Override // defpackage.agxz, defpackage.agzj
    public final void e(agnu agnuVar, boolean z) {
        if (z) {
            this.a.a(ammv.i(agnuVar.d()), Long.valueOf(agnuVar.a()), new jwk(this, 1));
        } else {
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r4.i.q() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r4.i.r() == false) goto L17;
     */
    @Override // defpackage.agxz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void f(int r5) {
        /*
            r4 = this;
            agzr r0 = r4.p
            boolean r0 = r0.c()
            if (r0 == 0) goto L27
            jup r0 = r4.j
            awwg r0 = r0.w()
            ysy r1 = r4.i
            boolean r1 = r1.r()
            if (r1 != 0) goto L5d
            awwg r1 = defpackage.awwg.UNMETERED_WIFI
            if (r0 == r1) goto L37
            awwg r1 = defpackage.awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE
            if (r0 != r1) goto L5d
            ysy r0 = r4.i
            boolean r0 = r0.q()
            if (r0 != 0) goto L5d
            goto L37
        L27:
            jup r0 = r4.j
            boolean r0 = r0.l()
            if (r0 == 0) goto L5d
            ysy r0 = r4.i
            boolean r0 = r0.r()
            if (r0 != 0) goto L5d
        L37:
            jws r0 = r4.l
            akbz r1 = r0.b
            android.view.View$OnClickListener r2 = r0.f
            akca r5 = r0.a(r5)
            ci r0 = r0.a
            android.content.Context r0 = r0.getApplicationContext()
            r3 = 2132017633(0x7f1401e1, float:1.967355E38)
            java.lang.String r0 = r0.getString(r3)
            r5.m(r0, r2)
            r0 = 0
            r5.j(r0)
            akcb r5 = r5.b()
            r1.o(r5)
            return
        L5d:
            jws r0 = r4.l
            r0.e(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwl.f(int):void");
    }

    @Override // defpackage.agxz
    public final void g(String str, Object obj, acra acraVar) {
        if (!(obj instanceof aqkv)) {
            q(str, obj, acraVar);
            return;
        }
        jws jwsVar = this.l;
        jwsVar.b.o(jwsVar.b(((aqkv) obj).e).b());
    }

    @Override // defpackage.agxz
    protected final boolean h(String str, agnv agnvVar) {
        return (agnvVar != null && agnvVar.s()) || this.n.g(fhe.v(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agxz
    public final void i(String str, atrx atrxVar, String str2, agno agnoVar, byte[] bArr, agzi agziVar, int i) {
        int b = this.o.b(str, atrxVar, str2, agnoVar, bArr, i);
        if (agziVar != null) {
            agziVar.a(str, b);
        }
        w(b);
    }
}
