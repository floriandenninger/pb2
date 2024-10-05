package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.youtube.app.player.infocards.YouTubeInfoCardOverlayPresenter;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aabq implements ypd {
    public vak A;
    public vak B;
    private boolean C;
    private final acra D;
    public final acud a;
    public final shf b;
    public final azrh c;
    public InfoCardCollection d;
    public InfoCardCollection e;
    public InfoCardCollection f;
    public int g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public aabl r;
    public ahvm s;
    public aabr t;
    public long u;
    public boolean v;
    public final aahd w;
    public final aahd x;
    public long y = 0;
    public vak z;

    public aabq(ml mlVar, afuh afuhVar, afxf afxfVar, acra acraVar, shf shfVar, aahd aahdVar, aahd aahdVar2, afsy afsyVar, aftn aftnVar, zaw zawVar) {
        this.g = -1;
        mlVar.getClass();
        shfVar.getClass();
        this.b = shfVar;
        this.a = new acud(afuhVar, afxfVar, "iv");
        azrh e = azrh.e();
        this.c = e;
        l(null);
        mlVar.getSavedStateRegistry().b("info-cards", new bub() { // from class: aabp
            @Override // defpackage.bub
            public final Bundle a() {
                aabq aabqVar = aabq.this;
                Bundle bundle = new Bundle(5);
                bundle.putParcelable("info-card-collection", aabqVar.d);
                bundle.putParcelable("shopping-info-card-collection", aabqVar.e);
                bundle.putString("last-pinged-video-id", aabqVar.h);
                bundle.putBoolean("info-cards-are-shown", aabqVar.o);
                bundle.putInt("active-card-index", aabqVar.g);
                return bundle;
            }
        });
        Bundle a = mlVar.getSavedStateRegistry().a("info-cards");
        if (a != null) {
            this.d = (InfoCardCollection) a.getParcelable("info-card-collection");
            InfoCardCollection infoCardCollection = this.d;
            this.z = new vak(infoCardCollection != null ? infoCardCollection.a : null);
            e.c(Boolean.valueOf(this.d != null));
            this.e = (InfoCardCollection) a.getParcelable("shopping-info-card-collection");
            InfoCardCollection infoCardCollection2 = this.e;
            this.A = new vak(infoCardCollection2 != null ? infoCardCollection2.a : null);
            InfoCardCollection infoCardCollection3 = this.f;
            this.B = new vak(infoCardCollection3 != null ? infoCardCollection3.a : null);
            this.h = a.getString("last-pinged-video-id");
            this.C = a.getBoolean("info-cards-are-shown");
            this.g = a.getInt("active-card-index");
        }
        this.w = aahdVar;
        this.x = aahdVar2;
        this.D = acraVar;
        afsyVar.getClass();
        aftnVar.getClass();
        zawVar.getClass();
    }

    public final aaaa a() {
        InfoCardCollection infoCardCollection;
        int i = this.g;
        if (i < 0 || (infoCardCollection = this.d) == null || i >= infoCardCollection.b().size()) {
            return null;
        }
        return (aaaa) this.d.b().get(this.g);
    }

    public final void b() {
        if (this.e == null || !this.p) {
            return;
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.D.I(3, new acqx(bArr), null);
    }

    public final void d() {
        InfoCardCollection infoCardCollection = this.d;
        if (infoCardCollection != null) {
            c(infoCardCollection.c());
            this.a.b((asus[]) this.d.a.e.toArray(new asus[0]));
        }
    }

    public final void e(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        this.D.u(new acqx(bArr), null);
    }

    public final void g() {
        apxf apxfVar;
        InfoCardCollection infoCardCollection = this.d;
        if (infoCardCollection == null) {
            zga.l("Failed to show info card drawer - missing infoCardCollection");
            return;
        }
        argu arguVar = infoCardCollection.a;
        if ((arguVar.b & 512) != 0) {
            apxfVar = arguVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        if (apxfVar != null) {
            this.w.c(apxfVar, null);
        } else if (!this.o || q()) {
            m(this.g, true);
        } else {
            r();
            return;
        }
        aaaa a = a();
        if (a == null) {
            this.a.b((asus[]) this.d.a.d.toArray(new asus[0]));
            c(this.d.d());
        } else {
            this.a.a(a.e().f);
            c(a.h());
        }
    }

    public final void h() {
        this.y = this.b.d();
    }

    public final void i(InfoCardCollection infoCardCollection, String str, String str2) {
        if (this.r == null) {
            zga.b("Missing InfoCardOverlayPresenter for InfoCards to work.");
            return;
        }
        if (this.s == null) {
            zga.b("Missing ControlsOverlayPresenter for InfoCards to work.");
            return;
        }
        if (str == null || !str.equals(this.l)) {
            this.l = str;
            this.r.k();
            this.a.c("CPN", str2);
            this.d = infoCardCollection;
            this.c.c(Boolean.valueOf(infoCardCollection != null));
            this.u = -1L;
            this.v = false;
            if (infoCardCollection != null) {
                aabl aablVar = this.r;
                aablVar.f = infoCardCollection;
                aablVar.b.i(infoCardCollection, aablVar.d, aablVar.c);
                e(infoCardCollection.d());
                if (!this.C) {
                    this.g = -1;
                    return;
                }
                this.C = false;
                int i = this.g;
                if (i > 0 && i >= infoCardCollection.b().size()) {
                    this.g = -1;
                }
                m(this.g, false);
            }
        }
    }

    public final void j(int i, boolean z) {
        if (this.o) {
            r();
        } else if (this.d != null) {
            if (i == -1) {
                i = this.g;
            }
            m(i, true);
            this.p = z;
        }
    }

    public final void k(int i) {
        if (this.e != null) {
            if (!this.p) {
                String str = this.n;
                if (str != null) {
                    this.a.c("CPN", str);
                }
                s(this.e);
                h();
                String str2 = this.m;
                if (str2 != null) {
                    this.a.c("CPN", str2);
                }
                this.o = true;
                this.p = true;
                aabr aabrVar = this.t;
                if (aabrVar != null) {
                    aabrVar.c(this.e, i, true);
                    return;
                }
                return;
            }
            r();
        }
    }

    public final void l(aabr aabrVar) {
        r();
        aabr aabrVar2 = this.t;
        if (aabrVar2 != null) {
            ((aabg) aabrVar2).f = null;
        }
        this.t = aabrVar;
        if (aabrVar != null) {
            ((aabg) aabrVar).f = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r0 = r6.d
            r6.s(r0)
            r6.h()
            r0 = 0
            r1 = -1
            if (r7 != r1) goto Le
            r1 = 0
            goto Lf
        Le:
            r1 = r7
        Lf:
            aabl r2 = r6.r
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r2.f
            r4 = 1
            if (r3 == 0) goto L42
            java.util.List r3 = r3.b()
            int r3 = r3.size()
            if (r3 != 0) goto L21
            goto L42
        L21:
            if (r1 < 0) goto L3c
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r2.f
            java.util.List r3 = r3.b()
            int r3 = r3.size()
            if (r1 < r3) goto L30
            goto L3c
        L30:
            aabi r3 = r2.b
            r3.h(r1)
            r2.i = r4
            boolean r2 = r2.m()
            goto L48
        L3c:
            java.lang.String r2 = "Info card index outside of infoCardCollection"
            defpackage.zga.l(r2)
            goto L47
        L42:
            java.lang.String r2 = "Failed to show info card gallery - missing infoCardCollection"
            defpackage.zga.l(r2)
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4f
            ahvm r3 = r6.s
            r3.a()
        L4f:
            aabr r3 = r6.t
            if (r3 == 0) goto L99
            if (r2 == 0) goto L60
            r3.a(r0)
            aabr r8 = r6.t
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r2 = r6.d
            r8.c(r2, r1, r0)
            goto L99
        L60:
            boolean r2 = r6.q()
            if (r2 == 0) goto L92
            aabr r8 = r6.t
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r2 = r6.d
            aabg r8 = (defpackage.aabg) r8
            boolean r3 = r8.g
            if (r3 == 0) goto L99
            r8.g = r0
            android.view.View r3 = r8.e
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            boolean r3 = r3.isShown()
            if (r3 == 0) goto L99
            android.view.animation.Animation r3 = r8.d
            aabc r5 = new aabc
            r5.<init>(r8, r2, r1)
            r3.setAnimationListener(r5)
            android.view.View r1 = r8.e
            android.view.animation.Animation r8 = r8.d
            r1.startAnimation(r8)
            goto L99
        L92:
            aabr r2 = r6.t
            com.google.android.libraries.youtube.infocards.factories.InfoCardCollection r3 = r6.d
            r2.c(r3, r1, r8)
        L99:
            r6.g = r7
            r6.o = r4
            boolean r7 = r6.q()
            if (r7 == 0) goto La5
            r6.p = r0
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabq.m(int, boolean):void");
    }

    public final void n(int i) {
        RecyclerView recyclerView;
        if (!this.q) {
            this.r.j(i);
            return;
        }
        aabr aabrVar = this.t;
        if (aabrVar == null || (recyclerView = ((aabg) aabrVar).h) == null) {
            return;
        }
        recyclerView.aa(i);
    }

    public final void o() {
        if (this.o) {
            r();
            return;
        }
        if (this.d != null) {
            for (int i = 0; i < this.d.b().size(); i++) {
                if (((aaaa) this.d.b().get(i)).b == zzz.SHOPPING_CARD) {
                    m(i, true);
                    return;
                }
            }
            m(this.g, true);
        }
    }

    public final boolean p(aaaa aaaaVar) {
        InfoCardCollection infoCardCollection = this.d;
        return infoCardCollection != null && infoCardCollection.b().contains(aaaaVar);
    }

    public final boolean q() {
        InfoCardCollection infoCardCollection;
        return (!this.p || (infoCardCollection = this.e) == null || infoCardCollection == this.d) ? false : true;
    }

    public final void r() {
        aabl aablVar = this.r;
        if (aablVar != null) {
            aablVar.l();
        }
        aabr aabrVar = this.t;
        if (aabrVar != null) {
            aabrVar.a(true);
        }
        this.o = false;
        this.p = false;
    }

    private final void s(InfoCardCollection infoCardCollection) {
        vak vakVar = infoCardCollection == this.e ? this.A : this.z;
        if (vakVar != null) {
            for (int i = 0; i < infoCardCollection.b().size(); i++) {
                if (!vakVar.d(i) || !((Boolean) vakVar.a.get(i)).booleanValue()) {
                    acud acudVar = this.a;
                    aaaa aaaaVar = (aaaa) infoCardCollection.b().get(i);
                    zzz zzzVar = zzz.COLLABORATOR_CARD;
                    int ordinal = aaaaVar.b.ordinal();
                    acudVar.a(ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : aaaaVar.c().j : aaaaVar.f().l : aaaaVar.d().i : aaaaVar.b().j : aaaaVar.a().h);
                    if (vakVar.d(i)) {
                        vakVar.a.set(i, true);
                    }
                }
            }
        }
        e(infoCardCollection.c());
        for (aaaa aaaaVar2 : infoCardCollection.b()) {
            zzz zzzVar2 = zzz.COLLABORATOR_CARD;
            int ordinal2 = aaaaVar2.b.ordinal();
            e(ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? ordinal2 != 4 ? null : aaaaVar2.c().k.I() : aaaaVar2.f().k.I() : aaaaVar2.d().j.I() : aaaaVar2.b().i.I() : aaaaVar2.a().i.I());
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        InfoCardCollection infoCardCollection;
        argu arguVar;
        argu arguVar2;
        InfoCardCollection infoCardCollection2;
        argu arguVar3;
        argu arguVar4;
        aaaa aaaaVar;
        switch (i) {
            case -1:
                return new Class[]{xag.class, ahcx.class, ahdv.class, ahee.class, ahef.class, aheg.class};
            case 0:
                xag xagVar = (xag) obj;
                xaf xafVar = xaf.AD_INTERRUPT_ACQUIRED;
                aign aignVar = aign.NEW;
                int ordinal = xagVar.a().ordinal();
                if (ordinal == 1) {
                    if (xagVar.c() != null) {
                        PlayerAd c = xagVar.c();
                        this.e = c.j() == null ? null : new InfoCardCollection(c.j());
                        this.n = xagVar.d();
                        this.A = new vak(c.j());
                        i(this.e, c.n(), this.n);
                    }
                    if (!this.o) {
                        return null;
                    }
                    r();
                    return null;
                }
                if (ordinal != 3 || !this.o) {
                    return null;
                }
                if (!this.p) {
                    r();
                    return null;
                }
                this.r.l();
                return null;
            case 1:
                boolean z = ((ahcx) obj).c() == aigf.FULLSCREEN;
                if (this.o && !q() && !this.q && z) {
                    this.s.a();
                }
                this.q = z;
                return null;
            case 2:
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.c() == aigk.NEW) {
                    this.l = null;
                    aabl aablVar = this.r;
                    if (aablVar != null) {
                        aablVar.k();
                    }
                    this.f = null;
                    this.j = false;
                    return null;
                }
                if (ahdvVar.c() == aigk.VIDEO_WATCH_LOADED) {
                    WatchNextResponseModel a = ahdvVar.a();
                    asfc asfcVar = a.a;
                    if ((asfcVar.b & 1073741824) != 0) {
                        arhb arhbVar = asfcVar.y;
                        if (arhbVar == null) {
                            arhbVar = arhb.a;
                        }
                        if (arhbVar.b == 61737181) {
                            arguVar2 = (argu) arhbVar.c;
                        } else {
                            arguVar2 = argu.a;
                        }
                        infoCardCollection = new InfoCardCollection(arguVar2);
                    } else {
                        infoCardCollection = null;
                    }
                    this.f = infoCardCollection;
                    asfc asfcVar2 = a.a;
                    if ((1073741824 & asfcVar2.b) != 0) {
                        arhb arhbVar2 = asfcVar2.y;
                        if (arhbVar2 == null) {
                            arhbVar2 = arhb.a;
                        }
                        if (arhbVar2.b == 61737181) {
                            arguVar = (argu) arhbVar2.c;
                        } else {
                            arguVar = argu.a;
                        }
                    } else {
                        arguVar = null;
                    }
                    vak vakVar = new vak(arguVar);
                    this.B = vakVar;
                    this.j = true;
                    InfoCardCollection infoCardCollection3 = this.f;
                    if (infoCardCollection3 != null && this.i) {
                        this.z = vakVar;
                        i(infoCardCollection3, a.b, this.m);
                        return null;
                    }
                    if (!this.k) {
                        return null;
                    }
                    i(null, a.b, this.m);
                    return null;
                }
                this.f = null;
                this.j = false;
                return null;
            case 3:
                if (((ahee) obj).a && this.q) {
                    r();
                }
                h();
                return null;
            case 4:
                ahef ahefVar = (ahef) obj;
                this.i = ahefVar.c().a(aign.VIDEO_PLAYING);
                xaf xafVar2 = xaf.AD_INTERRUPT_ACQUIRED;
                int ordinal2 = ahefVar.c().ordinal();
                if (ordinal2 == 0) {
                    this.k = false;
                    return null;
                }
                if (ordinal2 != 2 && ordinal2 != 7 && ordinal2 != 8) {
                    return null;
                }
                this.m = ahefVar.e();
                PlayerResponseModel b = ahefVar.b();
                InfoCardCollection infoCardCollection4 = this.f;
                if (infoCardCollection4 != null) {
                    this.z = this.B;
                    i(infoCardCollection4, b.y(), this.m);
                    return null;
                }
                aryr aryrVar = b.a;
                if ((aryrVar.b & 8192) != 0) {
                    arhb arhbVar3 = aryrVar.r;
                    if (arhbVar3 == null) {
                        arhbVar3 = arhb.a;
                    }
                    if (arhbVar3.b == 61737181) {
                        arguVar4 = (argu) arhbVar3.c;
                    } else {
                        arguVar4 = argu.a;
                    }
                    infoCardCollection2 = new InfoCardCollection(arguVar4);
                } else {
                    infoCardCollection2 = null;
                }
                if (b.e == null) {
                    aryr aryrVar2 = b.a;
                    if ((aryrVar2.b & 8192) != 0) {
                        arhb arhbVar4 = aryrVar2.r;
                        if (arhbVar4 == null) {
                            arhbVar4 = arhb.a;
                        }
                        if (arhbVar4.b == 61737181) {
                            arguVar3 = (argu) arhbVar4.c;
                        } else {
                            arguVar3 = argu.a;
                        }
                    } else {
                        arguVar3 = null;
                    }
                    b.e = new vak(arguVar3);
                }
                this.z = b.e;
                if (infoCardCollection2 != null) {
                    i(infoCardCollection2, b.y(), this.m);
                    return null;
                }
                if (this.j) {
                    i(null, b.y(), this.m);
                    return null;
                }
                aabl aablVar2 = this.r;
                if (aablVar2 != null) {
                    aablVar2.k();
                }
                if (!this.i) {
                    return null;
                }
                this.k = true;
                return null;
            case 5:
                aheg ahegVar = (aheg) obj;
                InfoCardCollection infoCardCollection5 = this.d;
                if (infoCardCollection5 == null || infoCardCollection5.b().isEmpty()) {
                    return null;
                }
                boolean j = ahegVar.j();
                if (j != this.v) {
                    h();
                    this.v = j;
                }
                if (j) {
                    long j2 = this.u;
                    long e = ahegVar.e();
                    if (Math.abs(e - j2) <= 5000) {
                        long j3 = this.d.a.j;
                        if (j3 > 0 && j3 >= j2 && j3 < e && this.q && !this.o) {
                            j(-1, false);
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 < this.d.b().size()) {
                                aaaaVar = (aaaa) this.d.b().get(i2);
                                if (!aaaaVar.g().isEmpty()) {
                                    long j4 = ((argw) aaaaVar.g().get(0)).b;
                                    if (j2 <= j4 && j4 < e) {
                                    }
                                }
                                i2++;
                            } else {
                                aaaaVar = null;
                                i2 = -1;
                            }
                        }
                        if (i2 >= 0) {
                            this.g = i2;
                            if (!this.o || q()) {
                                argw argwVar = (argw) aaaaVar.g().get(0);
                                if (aaaaVar.a.f && this.q) {
                                    j(-1, false);
                                } else {
                                    long j5 = argwVar.c;
                                    if (j5 > 0) {
                                        aabl aablVar3 = this.r;
                                        long j6 = argwVar.d;
                                        if (!((YouTubeInfoCardOverlayPresenter) aablVar3).a && !aablVar3.h && !aablVar3.g) {
                                            aablVar3.i();
                                            aablVar3.h = aablVar3.b.a(aaaaVar.e(), j5, j6).booleanValue();
                                            aabq aabqVar = aablVar3.c;
                                            if (!aabqVar.p(aaaaVar)) {
                                                zga.l("Teaser expanded for a card that is not in the current InfoCardCollection.");
                                            } else {
                                                arhj e2 = aaaaVar.e();
                                                aabqVar.g = aabqVar.d.b().indexOf(aaaaVar);
                                                aabqVar.a.a(e2.d);
                                                aabqVar.e(e2.h.I());
                                                aabqVar.e(aaaaVar.h());
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.b.d() - this.y > 5500) {
                                this.r.j(i2);
                                aabr aabrVar = this.t;
                                if (aabrVar != null) {
                                    aabg aabgVar = (aabg) aabrVar;
                                    if (aabgVar.h != null && !zev.e(aabgVar.b)) {
                                        if (aabgVar.g) {
                                            aabgVar.h.ak(i2);
                                            aabg.b(aabgVar.i.S(i2));
                                        } else {
                                            aabgVar.i.aa(i2, 0);
                                            aabgVar.h.aa(i2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.u = ahegVar.e();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
