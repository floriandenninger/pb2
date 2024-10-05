package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xqw implements aaha {
    public static final /* synthetic */ int c = 0;
    public final xpu a;
    public final azrw b;
    private final aavy d;
    private final acqz e;
    private final aahv f;
    private final ci g;
    private final Executor h;
    private final /* synthetic */ int i;

    public xqw(aavy aavyVar, xpu xpuVar, acqz acqzVar, azrw azrwVar, aahv aahvVar, Executor executor, ci ciVar, int i) {
        this.i = i;
        aavyVar.getClass();
        this.d = aavyVar;
        this.a = xpuVar;
        this.e = acqzVar;
        this.b = azrwVar;
        this.f = aahvVar;
        this.h = executor;
        this.g = ciVar;
    }

    private final acra b() {
        return this.e.mM();
    }

    private final acra c() {
        return this.e.mM();
    }

    public xqw(aavy aavyVar, xpu xpuVar, acqz acqzVar, azrw azrwVar, aahv aahvVar, ci ciVar, Executor executor, int i) {
        this.i = i;
        aavyVar.getClass();
        this.d = aavyVar;
        this.a = xpuVar;
        this.e = acqzVar;
        this.b = azrwVar;
        this.f = aahvVar;
        this.g = ciVar;
        this.h = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        int i = 0;
        if (this.i == 0) {
            final xpr xprVar = (xpr) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", xpr.class);
            if (xprVar == null || !TextUtils.isEmpty(xprVar.c()) || !TextUtils.isEmpty(null)) {
                aavy aavyVar = this.d;
                aavz aavzVar = new aavz(aavyVar.f, aavyVar.a.c(), null, null, null);
                final CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint = (CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint) apxfVar.pX(CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.createCommentReplyEndpoint);
                aavzVar.a = aavz.i(createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.c);
                aavzVar.l(whl.G(apxfVar));
                if (apxfVar.pY(aupg.b)) {
                    aupf aupfVar = (aupf) apxfVar.pX(aupg.b);
                    if (!aupfVar.c.isEmpty()) {
                        aavzVar.n(aupfVar.c);
                    }
                }
                if (xprVar != null) {
                    aavzVar.d(xprVar.c());
                    aavzVar.b = aavz.i(null);
                } else if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.b & 8) != 0) {
                    aqyg aqygVar = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.d;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i < aqygVar.c.size()) {
                        sb.append(((aqyi) aqygVar.c.get(i)).c);
                        i++;
                    }
                    aavzVar.d(sb.toString());
                    if (createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.e && b() != null) {
                        b().q(new acqx(acsb.c(103918)), null);
                        b().I(3, new acqx(acsb.c(104380)), null);
                    }
                }
                final aahu c2 = this.f.c();
                ci ciVar = this.g;
                aavy aavyVar2 = this.d;
                ynm.n(ciVar, aavyVar2.g.b(aavzVar, this.h), new zfi() { // from class: xqu
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        xpr xprVar2 = xpr.this;
                        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2 = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
                        aakv aakvVar = c2;
                        Throwable th = (Throwable) obj;
                        int i2 = xqw.c;
                        if (xprVar2 != null) {
                            xprVar2.g((cnq) th);
                        }
                        if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 64) != 0) {
                            wcy.u(aakvVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.g, false);
                        }
                    }
                }, new zfi() { // from class: xqv
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        xqw xqwVar = xqw.this;
                        xpr xprVar2 = xprVar;
                        CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2 = createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
                        aakv aakvVar = c2;
                        arly arlyVar = (arly) obj;
                        ((aahd) xqwVar.b.get()).b(arlyVar.g);
                        if (xprVar2 != null) {
                            xprVar2.h(arlyVar);
                            return;
                        }
                        arlz arlzVar = arlyVar.d;
                        if (arlzVar == null) {
                            arlzVar = arlz.a;
                        }
                        if (arlzVar.b == 153515154) {
                            xqwVar.a.a(arlyVar);
                            if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 32) != 0) {
                                wcy.t(aakvVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.f);
                                apxf s = wcy.s(aakvVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.f);
                                if (s != null) {
                                    ((aahd) xqwVar.b.get()).a(s);
                                }
                            }
                            if ((createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.b & 64) != 0) {
                                wcy.u(aakvVar, createCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint2.g, true);
                            }
                        }
                    }
                });
                return;
            }
            xprVar.g(null);
            return;
        }
        final aawb aawbVar = (aawb) yjj.u(map, "com.google.android.libraries.youtube.innertube.endpoint.tag", aawb.class);
        if (aawbVar == null || !TextUtils.isEmpty(aawbVar.c()) || !TextUtils.isEmpty(aawbVar.a().g) || !TextUtils.isEmpty(aawbVar.a().f) || adyu.dD(aawbVar.a().j)) {
            aavy aavyVar3 = this.d;
            aawa aawaVar = new aawa(aavyVar3.f, aavyVar3.a.c(), null, null, null);
            final CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint = (CreateCommentEndpointOuterClass$CreateCommentEndpoint) apxfVar.pX(CreateCommentEndpointOuterClass$CreateCommentEndpoint.createCommentEndpoint);
            aawaVar.e(createCommentEndpointOuterClass$CreateCommentEndpoint.c);
            aawaVar.l(apxfVar.c);
            if (aawbVar != null) {
                aawaVar.d(aawbVar.c());
                aawaVar.z = aawbVar.b();
                aawe a = aawbVar.a();
                if (a != null) {
                    aawaVar.a = a.b;
                    aawaVar.b = a.g;
                    aawaVar.c = a.e;
                    aawaVar.d = a.f;
                    aawaVar.s = a.c;
                    aawaVar.t = a.h;
                    aawaVar.u = a.i;
                    aawaVar.x = a.d;
                    aawaVar.y = a.j;
                    aawaVar.A = a.k;
                }
            } else if ((createCommentEndpointOuterClass$CreateCommentEndpoint.b & 2) != 0) {
                aqyg aqygVar2 = createCommentEndpointOuterClass$CreateCommentEndpoint.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                StringBuilder sb2 = new StringBuilder();
                while (i < aqygVar2.c.size()) {
                    sb2.append(((aqyi) aqygVar2.c.get(i)).c);
                    i++;
                }
                aawaVar.d(sb2.toString());
                if (createCommentEndpointOuterClass$CreateCommentEndpoint.e && c() != null) {
                    c().q(new acqx(acsb.c(103918)), null);
                    c().I(3, new acqx(acsb.c(104380)), null);
                }
            }
            final aahu c3 = this.f.c();
            final byte[] bArr = null;
            ynm.n(this.g, this.d.d(aawaVar, this.h), new zfi() { // from class: xqs
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    aawb aawbVar2 = aawb.this;
                    CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint2 = createCommentEndpointOuterClass$CreateCommentEndpoint;
                    aakv aakvVar = c3;
                    Throwable th = (Throwable) obj;
                    int i2 = xqw.c;
                    if (aawbVar2 != null) {
                        aawbVar2.e((cnq) th);
                    }
                    if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 16) != 0) {
                        wcy.u(aakvVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.g, false);
                    }
                }
            }, new zfi(aawbVar, createCommentEndpointOuterClass$CreateCommentEndpoint, c3, bArr) { // from class: xqr
                public final /* synthetic */ aawb a;
                public final /* synthetic */ CreateCommentEndpointOuterClass$CreateCommentEndpoint b;
                public final /* synthetic */ aakv c;

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    xqw xqwVar = xqw.this;
                    aawb aawbVar2 = this.a;
                    CreateCommentEndpointOuterClass$CreateCommentEndpoint createCommentEndpointOuterClass$CreateCommentEndpoint2 = this.b;
                    aakv aakvVar = this.c;
                    armb armbVar = (armb) obj;
                    ((aahd) xqwVar.b.get()).b(armbVar.e);
                    if (aawbVar2 != null) {
                        aawbVar2.f(armbVar);
                        return;
                    }
                    armc armcVar = armbVar.d;
                    if (armcVar == null) {
                        armcVar = armc.a;
                    }
                    if (armcVar.b == 153515154) {
                        amxd listIterator = xqwVar.a.b.listIterator();
                        while (listIterator.hasNext()) {
                            ((xpt) listIterator.next()).t(armbVar);
                        }
                        if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 8) != 0) {
                            wcy.t(aakvVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.f);
                            apxf s = wcy.s(aakvVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.f);
                            if (s != null) {
                                ((aahd) xqwVar.b.get()).a(s);
                            }
                        }
                        if ((createCommentEndpointOuterClass$CreateCommentEndpoint2.b & 16) != 0) {
                            wcy.u(aakvVar, createCommentEndpointOuterClass$CreateCommentEndpoint2.g, true);
                        }
                    }
                }
            });
            return;
        }
        aawbVar.e(null);
    }
}
