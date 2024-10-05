package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ext implements aaha {
    public final zaw a;
    public final aaea b;
    private final ci c;
    private final ypa d;
    private final aayg e;
    private final aftn f;
    private final afsy g;
    private final aahd h;
    private final aahv i;
    private final Executor j;

    public ext(ci ciVar, ypa ypaVar, aayg aaygVar, zaw zawVar, aftn aftnVar, afsy afsyVar, aahd aahdVar, aaea aaeaVar, aahv aahvVar, Executor executor) {
        ciVar.getClass();
        this.c = ciVar;
        ypaVar.getClass();
        this.d = ypaVar;
        aaygVar.getClass();
        this.e = aaygVar;
        zawVar.getClass();
        this.a = zawVar;
        aftnVar.getClass();
        this.f = aftnVar;
        afsyVar.getClass();
        this.g = afsyVar;
        aahdVar.getClass();
        this.h = aahdVar;
        aaeaVar.getClass();
        this.b = aaeaVar;
        this.i = aahvVar;
        this.j = executor;
    }

    private final anhy f(apxf apxfVar) {
        aayd a = this.e.a();
        a.d(apxfVar);
        return this.e.f(a, this.j);
    }

    private final anhy g(apxf apxfVar) {
        aaye b = this.e.b();
        b.d(apxfVar);
        return this.e.h(b, this.j);
    }

    private final anhy h(apxf apxfVar) {
        aayf d = this.e.d();
        d.d(apxfVar);
        return this.e.j(d, this.j);
    }

    public final ynl b(LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, final apxf apxfVar, final Object obj, final boolean z) {
        asno asnoVar = asno.LIKE;
        asno b = asno.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = asno.LIKE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            final int i = 0;
            return new ynl(this) { // from class: exo
                public final /* synthetic */ ext a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj2) {
                    int i2 = i;
                    if (i2 == 0) {
                        ext extVar = this.a;
                        apxf apxfVar2 = apxfVar;
                        Object obj3 = obj;
                        boolean z2 = z;
                        artt arttVar = (artt) obj2;
                        apxf apxfVar3 = null;
                        aony aonyVar = arttVar.d.size() > 0 ? arttVar.d : null;
                        if ((arttVar.b & 2) != 0) {
                            apxf apxfVar4 = arttVar.e;
                            if (apxfVar4 == null) {
                                apxfVar4 = apxf.a;
                            }
                            apxfVar3 = apxfVar4;
                        }
                        extVar.e(apxfVar2, obj3, aonyVar, apxfVar3, asno.LIKE, z2);
                        return;
                    }
                    if (i2 == 1) {
                        ext extVar2 = this.a;
                        apxf apxfVar5 = apxfVar;
                        Object obj4 = obj;
                        boolean z3 = z;
                        artr artrVar = (artr) obj2;
                        aony aonyVar2 = artrVar.c;
                        apxf apxfVar6 = artrVar.d;
                        if (apxfVar6 == null) {
                            apxfVar6 = apxf.a;
                        }
                        extVar2.e(apxfVar5, obj4, aonyVar2, apxfVar6, asno.DISLIKE, z3);
                        return;
                    }
                    ext extVar3 = this.a;
                    apxf apxfVar7 = apxfVar;
                    Object obj5 = obj;
                    boolean z4 = z;
                    artv artvVar = (artv) obj2;
                    aony aonyVar3 = artvVar.c;
                    apxf apxfVar8 = artvVar.d;
                    if (apxfVar8 == null) {
                        apxfVar8 = apxf.a;
                    }
                    extVar3.e(apxfVar7, obj5, aonyVar3, apxfVar8, asno.INDIFFERENT, z4);
                }
            };
        }
        if (ordinal == 1) {
            final int i2 = 1;
            return new ynl(this) { // from class: exo
                public final /* synthetic */ ext a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj2) {
                    int i22 = i2;
                    if (i22 == 0) {
                        ext extVar = this.a;
                        apxf apxfVar2 = apxfVar;
                        Object obj3 = obj;
                        boolean z2 = z;
                        artt arttVar = (artt) obj2;
                        apxf apxfVar3 = null;
                        aony aonyVar = arttVar.d.size() > 0 ? arttVar.d : null;
                        if ((arttVar.b & 2) != 0) {
                            apxf apxfVar4 = arttVar.e;
                            if (apxfVar4 == null) {
                                apxfVar4 = apxf.a;
                            }
                            apxfVar3 = apxfVar4;
                        }
                        extVar.e(apxfVar2, obj3, aonyVar, apxfVar3, asno.LIKE, z2);
                        return;
                    }
                    if (i22 == 1) {
                        ext extVar2 = this.a;
                        apxf apxfVar5 = apxfVar;
                        Object obj4 = obj;
                        boolean z3 = z;
                        artr artrVar = (artr) obj2;
                        aony aonyVar2 = artrVar.c;
                        apxf apxfVar6 = artrVar.d;
                        if (apxfVar6 == null) {
                            apxfVar6 = apxf.a;
                        }
                        extVar2.e(apxfVar5, obj4, aonyVar2, apxfVar6, asno.DISLIKE, z3);
                        return;
                    }
                    ext extVar3 = this.a;
                    apxf apxfVar7 = apxfVar;
                    Object obj5 = obj;
                    boolean z4 = z;
                    artv artvVar = (artv) obj2;
                    aony aonyVar3 = artvVar.c;
                    apxf apxfVar8 = artvVar.d;
                    if (apxfVar8 == null) {
                        apxfVar8 = apxf.a;
                    }
                    extVar3.e(apxfVar7, obj5, aonyVar3, apxfVar8, asno.INDIFFERENT, z4);
                }
            };
        }
        final int i3 = 2;
        return new ynl(this) { // from class: exo
            public final /* synthetic */ ext a;

            {
                this.a = this;
            }

            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj2) {
                int i22 = i3;
                if (i22 == 0) {
                    ext extVar = this.a;
                    apxf apxfVar2 = apxfVar;
                    Object obj3 = obj;
                    boolean z2 = z;
                    artt arttVar = (artt) obj2;
                    apxf apxfVar3 = null;
                    aony aonyVar = arttVar.d.size() > 0 ? arttVar.d : null;
                    if ((arttVar.b & 2) != 0) {
                        apxf apxfVar4 = arttVar.e;
                        if (apxfVar4 == null) {
                            apxfVar4 = apxf.a;
                        }
                        apxfVar3 = apxfVar4;
                    }
                    extVar.e(apxfVar2, obj3, aonyVar, apxfVar3, asno.LIKE, z2);
                    return;
                }
                if (i22 == 1) {
                    ext extVar2 = this.a;
                    apxf apxfVar5 = apxfVar;
                    Object obj4 = obj;
                    boolean z3 = z;
                    artr artrVar = (artr) obj2;
                    aony aonyVar2 = artrVar.c;
                    apxf apxfVar6 = artrVar.d;
                    if (apxfVar6 == null) {
                        apxfVar6 = apxf.a;
                    }
                    extVar2.e(apxfVar5, obj4, aonyVar2, apxfVar6, asno.DISLIKE, z3);
                    return;
                }
                ext extVar3 = this.a;
                apxf apxfVar7 = apxfVar;
                Object obj5 = obj;
                boolean z4 = z;
                artv artvVar = (artv) obj2;
                aony aonyVar3 = artvVar.c;
                apxf apxfVar8 = artvVar.d;
                if (apxfVar8 == null) {
                    apxfVar8 = apxf.a;
                }
                extVar3.e(apxfVar7, obj5, aonyVar3, apxfVar8, asno.INDIFFERENT, z4);
            }
        };
    }

    public final ayps c(final apxf apxfVar, final Object obj, final boolean z, final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, final String str, final aakt aaktVar) {
        ayps o;
        final aahu a = this.i.a(this.g.c());
        aalc c = a.c();
        asnk d = asnl.d(str);
        asno b = asno.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = asno.LIKE;
        }
        d.b(b);
        c.k(d);
        ayph b2 = c.b();
        asno b3 = asno.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b3 == null) {
            b3 = asno.LIKE;
        }
        int ordinal = b3.ordinal();
        if (ordinal == 0) {
            final int i = 0;
            o = wbs.L(g(apxfVar)).o(new ayrs(this) { // from class: exp
                public final /* synthetic */ ext a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    int i2 = i;
                    if (i2 == 0) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artt) obj2);
                    } else if (i2 == 1) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artr) obj2);
                    } else {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artv) obj2);
                    }
                }
            });
        } else if (ordinal == 1) {
            final int i2 = 1;
            o = wbs.L(f(apxfVar)).o(new ayrs(this) { // from class: exp
                public final /* synthetic */ ext a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    int i22 = i2;
                    if (i22 == 0) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artt) obj2);
                    } else if (i22 == 1) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artr) obj2);
                    } else {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artv) obj2);
                    }
                }
            });
        } else {
            final int i3 = 2;
            o = wbs.L(h(apxfVar)).o(new ayrs(this) { // from class: exp
                public final /* synthetic */ ext a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj2) {
                    int i22 = i3;
                    if (i22 == 0) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artt) obj2);
                    } else if (i22 == 1) {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artr) obj2);
                    } else {
                        this.a.b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z).a((artv) obj2);
                    }
                }
            });
        }
        return b2.K(o.B(new ayrw() { // from class: exr
            @Override // defpackage.ayrw
            public final boolean a(Object obj2) {
                ext extVar = ext.this;
                aakt aaktVar2 = aaktVar;
                aakv aakvVar = a;
                String str2 = str;
                Throwable th = (Throwable) obj2;
                zga.d("Error rating", th);
                extVar.a.e(th);
                if (!evr.D(extVar.b)) {
                    return true;
                }
                if (aaktVar2 != null) {
                    aalc c2 = aakvVar.c();
                    c2.d(aaktVar2);
                    c2.b();
                    return true;
                }
                aalc c3 = aakvVar.c();
                c3.g(str2);
                c3.b();
                return true;
            }
        }));
    }

    public final void d(final apxf apxfVar, final Object obj, final boolean z) {
        final LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apxfVar.pX(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        if (likeEndpointOuterClass$LikeEndpoint.g.size() != 0) {
            this.h.e(likeEndpointOuterClass$LikeEndpoint.g, obj);
        }
        if (evr.D(this.b)) {
            asnp asnpVar = likeEndpointOuterClass$LikeEndpoint.f;
            if (asnpVar == null) {
                asnpVar = asnp.a;
            }
            if ((asnpVar.b & 1) != 0) {
                asnp asnpVar2 = likeEndpointOuterClass$LikeEndpoint.f;
                if (asnpVar2 == null) {
                    asnpVar2 = asnp.a;
                }
                final String f = aalt.f(62, asnpVar2.c);
                final int i = 1;
                final int i2 = 0;
                this.i.a(this.g.c()).f(f).z(ayqr.a()).t(new ayrv(this) { // from class: exq
                    public final /* synthetic */ ext a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        if (i == 0) {
                            ext extVar = this.a;
                            apxf apxfVar2 = apxfVar;
                            Object obj3 = obj;
                            boolean z2 = z;
                            LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = likeEndpointOuterClass$LikeEndpoint;
                            String str = f;
                            zga.d("Could not read Entity from the store: ", (Throwable) obj2);
                            return extVar.c(apxfVar2, obj3, z2, likeEndpointOuterClass$LikeEndpoint2, str, null);
                        }
                        return this.a.c(apxfVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f, (aakt) obj2);
                    }
                }, new ayrv(this) { // from class: exq
                    public final /* synthetic */ ext a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrv
                    public final Object a(Object obj2) {
                        if (i2 == 0) {
                            ext extVar = this.a;
                            apxf apxfVar2 = apxfVar;
                            Object obj3 = obj;
                            boolean z2 = z;
                            LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint2 = likeEndpointOuterClass$LikeEndpoint;
                            String str = f;
                            zga.d("Could not read Entity from the store: ", (Throwable) obj2);
                            return extVar.c(apxfVar2, obj3, z2, likeEndpointOuterClass$LikeEndpoint2, str, null);
                        }
                        return this.a.c(apxfVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f, (aakt) obj2);
                    }
                }, new Callable() { // from class: exn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ext.this.c(apxfVar, obj, z, likeEndpointOuterClass$LikeEndpoint, f, null);
                    }
                }).T();
                return;
            }
        }
        ynk ynkVar = new ynk() { // from class: exm
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                ext extVar = ext.this;
                zga.d("Error rating", th);
                extVar.a.e(th);
            }
        };
        Runnable runnable = anij.a;
        asno asnoVar = asno.LIKE;
        asno b = asno.b(likeEndpointOuterClass$LikeEndpoint.e);
        if (b == null) {
            b = asno.LIKE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 0) {
            ynm.l(g(apxfVar), angq.a, ynkVar, b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z), runnable);
        } else if (ordinal == 1) {
            ynm.l(f(apxfVar), angq.a, ynkVar, b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z), runnable);
        } else {
            if (ordinal != 2) {
                return;
            }
            ynm.l(h(apxfVar), angq.a, ynkVar, b(likeEndpointOuterClass$LikeEndpoint, apxfVar, obj, z), runnable);
        }
    }

    public final void e(apxf apxfVar, Object obj, List list, apxf apxfVar2, asno asnoVar, boolean z) {
        if (list != null) {
            this.h.e(list, obj);
        }
        if (apxfVar2 != null) {
            this.h.c(apxfVar2, null);
        }
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apxfVar.pX(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        asnp asnpVar = likeEndpointOuterClass$LikeEndpoint.f;
        if (asnpVar == null) {
            asnpVar = asnp.a;
        }
        if (asnpVar.c.isEmpty()) {
            asnp asnpVar2 = likeEndpointOuterClass$LikeEndpoint.f;
            if (asnpVar2 == null) {
                asnpVar2 = asnp.a;
            }
            if (asnpVar2.d.isEmpty()) {
                return;
            }
            ypa ypaVar = this.d;
            asnp asnpVar3 = likeEndpointOuterClass$LikeEndpoint.f;
            if (asnpVar3 == null) {
                asnpVar3 = asnp.a;
            }
            ypaVar.f(new ghf(asnpVar3.d, asnoVar));
            return;
        }
        ypa ypaVar2 = this.d;
        asnp asnpVar4 = likeEndpointOuterClass$LikeEndpoint.f;
        if (asnpVar4 == null) {
            asnpVar4 = asnp.a;
        }
        ypaVar2.f(new ghg(asnpVar4.c, asnoVar, z));
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (this.g.t()) {
            d(apxfVar, s, false);
        } else {
            this.f.c(this.c, null, new exs(this, apxfVar, s));
        }
    }
}
