package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ghd {
    public final zaw a;
    private final Activity b;
    private final afsy c;
    private final aftn d;
    private final aayg e;
    private final ypa f;
    private final ysy g;
    private final zbi h;
    private final aahd i;
    private final Executor j;

    public ghd(Activity activity, afsy afsyVar, aftn aftnVar, aayg aaygVar, zaw zawVar, ypa ypaVar, ysy ysyVar, zbi zbiVar, aahd aahdVar, Executor executor) {
        this.b = activity;
        this.c = afsyVar;
        this.d = aftnVar;
        this.e = aaygVar;
        this.a = zawVar;
        this.f = ypaVar;
        this.g = ysyVar;
        this.h = zbiVar;
        this.i = aahdVar;
        this.j = executor;
    }

    public final void a(asno asnoVar, asni asniVar, ghc ghcVar, ghc ghcVar2, ghc ghcVar3) {
        asniVar.getClass();
        if (!this.g.o()) {
            this.h.b();
        } else if (this.c.t()) {
            b(asnoVar, asniVar, false, ghcVar, ghcVar2, ghcVar3);
        } else {
            this.d.c(this.b, null, new ghb(this, asnoVar, asniVar, ghcVar, ghcVar2, ghcVar3));
        }
    }

    public final void b(asno asnoVar, final asni asniVar, final boolean z, ghc ghcVar, final ghc ghcVar2, final ghc ghcVar3) {
        ammv ammvVar;
        Runnable runnable = anij.a;
        Iterator it = Collections.unmodifiableList(((asni) ((aong) asniVar.toBuilder()).instance).p).iterator();
        while (true) {
            if (it.hasNext()) {
                apxf apxfVar = (apxf) it.next();
                if (apxfVar.pY(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)) {
                    asno b = asno.b(((LikeEndpointOuterClass$LikeEndpoint) apxfVar.pX(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint)).e);
                    if (b == null) {
                        b = asno.LIKE;
                    }
                    if (b.equals(asnoVar)) {
                        ammvVar = ammv.j(apxfVar);
                        break;
                    }
                }
            } else {
                ammvVar = amlr.a;
                break;
            }
        }
        final asno dt = adyu.dt((aong) asniVar.toBuilder());
        asno asnoVar2 = asno.LIKE;
        int ordinal = asnoVar.ordinal();
        if (ordinal == 0) {
            aaye b2 = this.e.b();
            if (!ammvVar.h()) {
                b2.m(asniVar.n.I());
                asnp asnpVar = asniVar.c;
                if (asnpVar == null) {
                    asnpVar = asnp.a;
                }
                b2.e(asnpVar);
            } else {
                b2.d((apxf) ammvVar.c());
            }
            ghcVar.a(asno.LIKE, asniVar);
            anhy g = this.e.g(b2);
            Executor executor = this.j;
            final int i = 1;
            ynk ynkVar = new ynk(this) { // from class: ggz
                public final /* synthetic */ ghd a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final /* synthetic */ void a(Object obj) {
                    int i2 = i;
                    if (i2 == 0) {
                        a((Throwable) obj);
                    } else if (i2 != 1) {
                        a((Throwable) obj);
                    } else {
                        a((Throwable) obj);
                    }
                }

                @Override // defpackage.ynk
                /* renamed from: b */
                public final void a(Throwable th) {
                    int i2 = i;
                    if (i2 == 0) {
                        ghd ghdVar = this.a;
                        ghc ghcVar4 = ghcVar3;
                        asno asnoVar3 = dt;
                        asni asniVar2 = asniVar;
                        zga.d("Error rating", th);
                        ghdVar.a.e(th);
                        ghcVar4.a(asnoVar3, asniVar2);
                        return;
                    }
                    if (i2 == 1) {
                        ghd ghdVar2 = this.a;
                        ghc ghcVar5 = ghcVar3;
                        asno asnoVar4 = dt;
                        asni asniVar3 = asniVar;
                        zga.d("Error rating", th);
                        ghdVar2.a.e(th);
                        ghcVar5.a(asnoVar4, asniVar3);
                        return;
                    }
                    ghd ghdVar3 = this.a;
                    ghc ghcVar6 = ghcVar3;
                    asno asnoVar5 = dt;
                    asni asniVar4 = asniVar;
                    zga.d("Error rating", th);
                    ghdVar3.a.e(th);
                    ghcVar6.a(asnoVar5, asniVar4);
                }
            };
            final int i2 = 0;
            ynm.l(g, executor, ynkVar, new ynl(this) { // from class: gha
                public final /* synthetic */ ghd a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    int i3 = i2;
                    if (i3 == 0) {
                        this.a.c(asniVar, asno.LIKE, z, ((artt) obj).d, ghcVar2);
                        return;
                    }
                    if (i3 == 1) {
                        this.a.c(asniVar, asno.DISLIKE, z, ((artr) obj).c, ghcVar2);
                        return;
                    }
                    this.a.c(asniVar, asno.INDIFFERENT, z, ((artv) obj).c, ghcVar2);
                }
            }, runnable);
            return;
        }
        if (ordinal == 1) {
            aayd a = this.e.a();
            if (!ammvVar.h()) {
                a.m(asniVar.n.I());
                asnp asnpVar2 = asniVar.c;
                if (asnpVar2 == null) {
                    asnpVar2 = asnp.a;
                }
                a.e(asnpVar2);
            } else {
                a.d((apxf) ammvVar.c());
            }
            ghcVar.a(asno.DISLIKE, asniVar);
            anhy e = this.e.e(a);
            Executor executor2 = this.j;
            final int i3 = 0;
            ynk ynkVar2 = new ynk(this) { // from class: ggz
                public final /* synthetic */ ghd a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final /* synthetic */ void a(Object obj) {
                    int i22 = i3;
                    if (i22 == 0) {
                        a((Throwable) obj);
                    } else if (i22 != 1) {
                        a((Throwable) obj);
                    } else {
                        a((Throwable) obj);
                    }
                }

                @Override // defpackage.ynk
                /* renamed from: b */
                public final void a(Throwable th) {
                    int i22 = i3;
                    if (i22 == 0) {
                        ghd ghdVar = this.a;
                        ghc ghcVar4 = ghcVar3;
                        asno asnoVar3 = dt;
                        asni asniVar2 = asniVar;
                        zga.d("Error rating", th);
                        ghdVar.a.e(th);
                        ghcVar4.a(asnoVar3, asniVar2);
                        return;
                    }
                    if (i22 == 1) {
                        ghd ghdVar2 = this.a;
                        ghc ghcVar5 = ghcVar3;
                        asno asnoVar4 = dt;
                        asni asniVar3 = asniVar;
                        zga.d("Error rating", th);
                        ghdVar2.a.e(th);
                        ghcVar5.a(asnoVar4, asniVar3);
                        return;
                    }
                    ghd ghdVar3 = this.a;
                    ghc ghcVar6 = ghcVar3;
                    asno asnoVar5 = dt;
                    asni asniVar4 = asniVar;
                    zga.d("Error rating", th);
                    ghdVar3.a.e(th);
                    ghcVar6.a(asnoVar5, asniVar4);
                }
            };
            final int i4 = 1;
            ynm.l(e, executor2, ynkVar2, new ynl(this) { // from class: gha
                public final /* synthetic */ ghd a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    int i32 = i4;
                    if (i32 == 0) {
                        this.a.c(asniVar, asno.LIKE, z, ((artt) obj).d, ghcVar2);
                        return;
                    }
                    if (i32 == 1) {
                        this.a.c(asniVar, asno.DISLIKE, z, ((artr) obj).c, ghcVar2);
                        return;
                    }
                    this.a.c(asniVar, asno.INDIFFERENT, z, ((artv) obj).c, ghcVar2);
                }
            }, runnable);
            return;
        }
        aayf d = this.e.d();
        if (!ammvVar.h()) {
            d.m(asniVar.n.I());
            asnp asnpVar3 = asniVar.c;
            if (asnpVar3 == null) {
                asnpVar3 = asnp.a;
            }
            d.e(asnpVar3);
        } else {
            d.d((apxf) ammvVar.c());
        }
        ghcVar.a(asno.INDIFFERENT, asniVar);
        final int i5 = 2;
        ynm.l(this.e.i(d), this.j, new ynk(this) { // from class: ggz
            public final /* synthetic */ ghd a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final /* synthetic */ void a(Object obj) {
                int i22 = i5;
                if (i22 == 0) {
                    a((Throwable) obj);
                } else if (i22 != 1) {
                    a((Throwable) obj);
                } else {
                    a((Throwable) obj);
                }
            }

            @Override // defpackage.ynk
            /* renamed from: b */
            public final void a(Throwable th) {
                int i22 = i5;
                if (i22 == 0) {
                    ghd ghdVar = this.a;
                    ghc ghcVar4 = ghcVar3;
                    asno asnoVar3 = dt;
                    asni asniVar2 = asniVar;
                    zga.d("Error rating", th);
                    ghdVar.a.e(th);
                    ghcVar4.a(asnoVar3, asniVar2);
                    return;
                }
                if (i22 == 1) {
                    ghd ghdVar2 = this.a;
                    ghc ghcVar5 = ghcVar3;
                    asno asnoVar4 = dt;
                    asni asniVar3 = asniVar;
                    zga.d("Error rating", th);
                    ghdVar2.a.e(th);
                    ghcVar5.a(asnoVar4, asniVar3);
                    return;
                }
                ghd ghdVar3 = this.a;
                ghc ghcVar6 = ghcVar3;
                asno asnoVar5 = dt;
                asni asniVar4 = asniVar;
                zga.d("Error rating", th);
                ghdVar3.a.e(th);
                ghcVar6.a(asnoVar5, asniVar4);
            }
        }, new ynl(this) { // from class: gha
            public final /* synthetic */ ghd a;

            {
                this.a = this;
            }

            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                int i32 = i5;
                if (i32 == 0) {
                    this.a.c(asniVar, asno.LIKE, z, ((artt) obj).d, ghcVar2);
                    return;
                }
                if (i32 == 1) {
                    this.a.c(asniVar, asno.DISLIKE, z, ((artr) obj).c, ghcVar2);
                    return;
                }
                this.a.c(asniVar, asno.INDIFFERENT, z, ((artv) obj).c, ghcVar2);
            }
        }, runnable);
    }

    public final void c(asni asniVar, asno asnoVar, boolean z, List list, ghc ghcVar) {
        if (list != null && !list.isEmpty()) {
            this.i.b(list);
        }
        if ((asniVar.b & 1) != 0) {
            asnp asnpVar = asniVar.c;
            if (asnpVar == null) {
                asnpVar = asnp.a;
            }
            if (!asnpVar.d.isEmpty()) {
                ypa ypaVar = this.f;
                asnp asnpVar2 = asniVar.c;
                if (asnpVar2 == null) {
                    asnpVar2 = asnp.a;
                }
                ypaVar.f(new ghf(asnpVar2.d, asnoVar));
                return;
            }
        }
        ypa ypaVar2 = this.f;
        asnp asnpVar3 = asniVar.c;
        if (asnpVar3 == null) {
            asnpVar3 = asnp.a;
        }
        ypaVar2.d(new ghg(asnpVar3.c, asnoVar, z));
        ghcVar.a(asnoVar, asniVar);
    }
}
