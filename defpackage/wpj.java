package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpj implements wog {
    public final wof a;
    public final wof b;
    public final wof c;
    public final wof d;
    public final wof e;
    public final wof f;
    public final wof g;
    public final wof h;
    public final wof i;
    public final wof j;
    public final wof k;
    public final wof l;
    public final wof m;
    public final wof n;
    public final wof o;
    public final wof p;
    public final wof q;
    public final wof r;
    public final wof s;
    final CopyOnWriteArrayList t = new CopyOnWriteArrayList();
    public String u = null;
    public aeqn v;
    private final aypn w;
    private final aypn x;
    private final aioc y;

    public wpj(woy woyVar, wvl wvlVar, wuk wukVar, wox woxVar, wvs wvsVar, wxv wxvVar, wpp wppVar, wxx wxxVar, wxy wxyVar, wya wyaVar, wvb wvbVar, wvf wvfVar, wvd wvdVar, wyb wybVar, wyc wycVar, wyj wyjVar, wwk wwkVar, wwg wwgVar, wvl wvlVar2, aypn aypnVar, aypn aypnVar2, aioc aiocVar, byte[] bArr) {
        this.a = woyVar;
        this.b = wvlVar;
        this.c = wukVar;
        this.d = woxVar;
        this.e = wvsVar;
        this.f = wxvVar;
        this.g = wppVar;
        this.h = wxxVar;
        this.i = wxyVar;
        this.j = wyaVar;
        this.k = wvbVar;
        this.l = wvfVar;
        this.m = wvdVar;
        this.n = wybVar;
        this.o = wycVar;
        this.p = wyjVar;
        this.q = wwkVar;
        this.r = wwgVar;
        this.s = wvlVar2;
        this.w = aypnVar;
        this.x = aypnVar2;
        this.y = aiocVar;
    }

    @Override // defpackage.wog
    public final void a(wof wofVar) {
        this.t.add(wofVar);
    }

    @Override // defpackage.wog
    public final void b() {
        final int i = 5;
        this.y.G().d.Y(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i2 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i2, e2, a3, f2, j);
                        wpjVar6.s.qs(i2, e2, a3, f2, j);
                        wpjVar6.a.qs(i2, e2, a3, f2, j);
                        wpjVar6.f.qs(i2, e2, a3, f2, j);
                        wpjVar6.r.qs(i2, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i2, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        }, oqu.q);
        final int i2 = 3;
        this.y.t().b.X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
        final int i3 = 6;
        this.y.G().i.Y(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        }, oqu.q);
        final int i4 = 8;
        this.x.n().X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
        final int i5 = 1;
        this.x.n().M(suj.e).Y(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        }, oqu.q);
        final int i6 = 2;
        this.x.n().M(suj.f).X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
        final int i7 = 4;
        this.w.n().M(suj.g).X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
        final int i8 = 0;
        this.w.n().M(suj.h).s(new ayrw() { // from class: wph
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                wpj wpjVar = wpj.this;
                ahcm ahcmVar = (ahcm) obj;
                aeqn aeqnVar = wpjVar.v;
                aeqn a = ahcmVar.a();
                if (a == null || a.b == -1 || a.a() == -1) {
                    return false;
                }
                if (aeqnVar != null && a.c(aeqnVar)) {
                    if (!a.b(aeqnVar)) {
                        return false;
                    }
                    if ((a.b != 0 || Math.abs(a.a() - aeqnVar.a()) <= 50) && Math.abs(a.d - aeqnVar.d) <= 50) {
                        return false;
                    }
                }
                wpjVar.v = ahcmVar.a();
                return true;
            }
        }).X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i8) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
        final int i9 = 7;
        this.w.n().X(new ayrs(this) { // from class: wpi
            public final /* synthetic */ wpj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                switch (i9) {
                    case 0:
                        wpj wpjVar = this.a;
                        ahcm ahcmVar = (ahcm) obj;
                        wpjVar.e.qy(ahcmVar);
                        wpjVar.h.qy(ahcmVar);
                        Iterator it = wpjVar.t.iterator();
                        while (it.hasNext()) {
                            ((wof) it.next()).qy(ahcmVar);
                        }
                        return;
                    case 1:
                        wpj wpjVar2 = this.a;
                        afih afihVar = (afih) obj;
                        wpjVar2.j.qp(afihVar);
                        Iterator it2 = wpjVar2.t.iterator();
                        while (it2.hasNext()) {
                            ((wof) it2.next()).qp(afihVar);
                        }
                        return;
                    case 2:
                        wpj wpjVar3 = this.a;
                        String a = ((ahcv) obj).a();
                        wpjVar3.a.qq(a);
                        wpjVar3.i.qq(a);
                        Iterator it3 = wpjVar3.t.iterator();
                        while (it3.hasNext()) {
                            ((wof) it3.next()).qq(a);
                        }
                        return;
                    case 3:
                        wpj wpjVar4 = this.a;
                        ahcx ahcxVar = (ahcx) obj;
                        aigf c = ahcxVar.c();
                        aigf d = ahcxVar.d();
                        int b = ahcxVar.b();
                        int a2 = ahcxVar.a();
                        boolean f = ahcxVar.f();
                        boolean e = ahcxVar.e();
                        wpjVar4.a.qr(c, d, b, a2, f, e);
                        wpjVar4.k.qr(c, d, b, a2, f, e);
                        wpjVar4.l.qr(c, d, b, a2, f, e);
                        wpjVar4.m.qr(c, d, b, a2, f, e);
                        wpjVar4.n.qr(c, d, b, a2, f, e);
                        wpjVar4.q.qr(c, d, b, a2, f, e);
                        Iterator it4 = wpjVar4.t.iterator();
                        while (it4.hasNext()) {
                            ((wof) it4.next()).qr(c, d, b, a2, f, e);
                        }
                        return;
                    case 4:
                        wpj wpjVar5 = this.a;
                        ahef ahefVar = (ahef) obj;
                        wpjVar5.p.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.i.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.r.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.q.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.e.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.g.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.h.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        wpjVar5.d.f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        Iterator it5 = wpjVar5.t.iterator();
                        while (it5.hasNext()) {
                            ((wof) it5.next()).f(ahefVar.c(), ahefVar.b(), ahefVar.d(), ahefVar.e(), ahefVar.k());
                        }
                        return;
                    case 5:
                        wpj wpjVar6 = this.a;
                        aheg ahegVar = (aheg) obj;
                        String i22 = ahegVar.i();
                        long e2 = ahegVar.e();
                        long a3 = ahegVar.a();
                        long f2 = ahegVar.f();
                        boolean j = ahegVar.j();
                        wpjVar6.b.qs(i22, e2, a3, f2, j);
                        wpjVar6.s.qs(i22, e2, a3, f2, j);
                        wpjVar6.a.qs(i22, e2, a3, f2, j);
                        wpjVar6.f.qs(i22, e2, a3, f2, j);
                        wpjVar6.r.qs(i22, e2, a3, f2, j);
                        Iterator it6 = wpjVar6.t.iterator();
                        while (it6.hasNext()) {
                            ((wof) it6.next()).qs(i22, e2, a3, f2, j);
                        }
                        return;
                    case 6:
                        wpj wpjVar7 = this.a;
                        ahej ahejVar = (ahej) obj;
                        if (ahejVar.a() == 2) {
                            wpjVar7.u = ahejVar.b();
                        }
                        wpjVar7.a.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.c.h(ahejVar.a(), ahejVar.b());
                        wpjVar7.o.h(ahejVar.a(), ahejVar.b());
                        Iterator it7 = wpjVar7.t.iterator();
                        while (it7.hasNext()) {
                            ((wof) it7.next()).h(ahejVar.a(), ahejVar.b());
                        }
                        return;
                    case 7:
                        wpj wpjVar8 = this.a;
                        wpjVar8.v = null;
                        ((wpp) wpjVar8.g).b = ((ahel) obj).a().b();
                        return;
                    default:
                        wpj wpjVar9 = this.a;
                        ahel ahelVar = (ahel) obj;
                        String Z = ahelVar.a().Z();
                        int a4 = ahelVar.a().a();
                        wpjVar9.c.qw(Z, a4);
                        wpjVar9.h.qw(Z, a4);
                        ((wya) wpjVar9.j).a = Z;
                        ((wyb) wpjVar9.n).a = Z;
                        Iterator it8 = wpjVar9.t.iterator();
                        while (it8.hasNext()) {
                            ((wof) it8.next()).qw(Z, a4);
                        }
                        return;
                }
            }
        });
    }

    @Override // defpackage.wog
    public final void c(wof wofVar) {
        this.t.remove(wofVar);
    }

    @Override // defpackage.wog
    public final boolean d(String str) {
        return TextUtils.equals(str, this.u);
    }
}
