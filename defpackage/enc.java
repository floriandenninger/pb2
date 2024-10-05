package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class enc implements emu {
    public final azrw a;
    public final Executor b;
    public final Executor c;
    public final eni d;
    public final azrj e = azrj.W();
    public final azrw f;
    public final azrw g;
    public final azrw h;
    public final azrw i;
    public final azrw j;
    public final azrw k;
    public final azrw l;
    public final azrw m;
    public final azrw n;
    public final azrw o;
    public final azrw p;
    public final azrw q;
    public final azrw r;
    public azrj s;
    public boolean t;
    private final yxx u;

    public enc(azrw azrwVar, Executor executor, Executor executor2, yxx yxxVar, eni eniVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9, azrw azrwVar10, azrw azrwVar11, azrw azrwVar12, azrw azrwVar13, azrw azrwVar14) {
        this.a = azrwVar;
        this.b = executor;
        this.c = executor2;
        this.d = eniVar;
        this.u = yxxVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.h = azrwVar4;
        this.i = azrwVar5;
        this.j = azrwVar6;
        this.k = azrwVar7;
        this.l = azrwVar8;
        this.m = azrwVar9;
        this.n = azrwVar10;
        this.o = azrwVar11;
        this.p = azrwVar12;
        this.q = azrwVar13;
        this.r = azrwVar14;
    }

    @Override // defpackage.emu
    public final void a() {
        long f = this.u.f(yxx.E);
        yyr yyrVar = this.d.g;
        ayqi b = azre.b(this.c);
        yyrVar.getClass();
        final int i = 1;
        yyq b2 = yyr.b(6);
        final int i2 = 2;
        b2.a("etc", new Runnable(this) { // from class: enb
            public final /* synthetic */ enc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        enc encVar = this.a;
                        afsx c = ((afsy) encVar.m.get()).c();
                        if (c instanceof AccountIdentity) {
                            ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                            return;
                        }
                        return;
                    case 1:
                        aadr aadrVar = (aadr) this.a.p.get();
                        aadrVar.c();
                        aadrVar.d(null);
                        return;
                    case 2:
                        ((akpt) this.a.f.get()).e();
                        return;
                    case 3:
                        enc encVar2 = this.a;
                        aarh aarhVar = (aarh) encVar2.q.get();
                        aarhVar.b.e().U(encVar2.e);
                        aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                        return;
                    case 4:
                        ((zfu) this.a.i.get()).a();
                        return;
                    case 5:
                        enc encVar3 = this.a;
                        afsx c2 = ((afsy) encVar3.m.get()).c();
                        if (c2 instanceof AccountIdentity) {
                            ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                            return;
                        }
                        return;
                    case 6:
                        final enc encVar4 = this.a;
                        aadr aadrVar2 = (aadr) encVar4.p.get();
                        aadrVar2.d(encVar4.c);
                        ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                        if (!encVar4.t) {
                            encVar4.b();
                        } else {
                            azrj azrjVar = encVar4.s;
                            if (azrjVar != null) {
                                azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        enc.this.b();
                                    }
                                });
                            }
                        }
                        ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                        encVar4.d.c(2);
                        return;
                    case 7:
                        enc encVar5 = this.a;
                        long d = ((shf) encVar5.j.get()).d();
                        ((wza) encVar5.k.get()).f();
                        encVar5.d.d();
                        ypa ypaVar = (ypa) encVar5.l.get();
                        ypaVar.d(new xas(d));
                        ypaVar.d(new xar());
                        return;
                    case 8:
                        enc encVar6 = this.a;
                        ((kcd) encVar6.r.get()).b();
                        azrj azrjVar2 = encVar6.s;
                        if (azrjVar2 != null) {
                            azrjVar2.sh();
                            return;
                        }
                        return;
                    default:
                        enc encVar7 = this.a;
                        atej atejVar = ((aadw) encVar7.g.get()).b().k;
                        if (atejVar == null) {
                            atejVar = atej.a;
                        }
                        apdm apdmVar = atejVar.p;
                        if (apdmVar == null) {
                            apdmVar = apdm.a;
                        }
                        if (!apdmVar.d || apdmVar.e.size() == 0) {
                            return;
                        }
                        ajoy ajoyVar = (ajoy) encVar7.o.get();
                        Iterator it = apdmVar.e.iterator();
                        while (it.hasNext()) {
                            ajoyVar.u((String) it.next());
                        }
                        return;
                }
            }
        });
        final int i3 = 0;
        yyrVar.n(b, b2);
        final int i4 = 7;
        final int i5 = 5;
        final int i6 = 3;
        if ((f & 128) != 0) {
            yyq b3 = yyr.b(1);
            b3.a("cfg", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i6) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            b3.a("ida", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i5) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            b3.a("ads", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            b3.a("sww", new bqc(12, (float[][]) null));
            yyq b4 = yyr.b(0);
            b4.a("asc", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            yyrVar.n(b, b3, b4);
        } else {
            this.t = (this.u.f(yxx.C) & 32) != 0;
            this.s = azrj.W();
            final int i7 = 6;
            yyq b5 = yyr.b(6);
            final int i8 = 8;
            b5.c("phn", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i8) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            }, !this.t);
            yyq b6 = yyr.b(5);
            b6.a("cfg", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i7) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            b6.c("phn", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i8) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            }, this.t);
            yyq b7 = yyr.b(4);
            b7.c("ida", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            }, this.t);
            final int i9 = 7;
            b7.a("ads", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            b7.c("ida", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            }, true ^ this.t);
            yyq b8 = yyr.b(2);
            final int i10 = 4;
            b8.a("gpp", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            final int i11 = 9;
            b8.a("dns", new Runnable(this) { // from class: enb
                public final /* synthetic */ enc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            enc encVar = this.a;
                            afsx c = ((afsy) encVar.m.get()).c();
                            if (c instanceof AccountIdentity) {
                                ((wco) encVar.n.get()).j((Executor) encVar.a.get(), (AccountIdentity) c);
                                return;
                            }
                            return;
                        case 1:
                            aadr aadrVar = (aadr) this.a.p.get();
                            aadrVar.c();
                            aadrVar.d(null);
                            return;
                        case 2:
                            ((akpt) this.a.f.get()).e();
                            return;
                        case 3:
                            enc encVar2 = this.a;
                            aarh aarhVar = (aarh) encVar2.q.get();
                            aarhVar.b.e().U(encVar2.e);
                            aarhVar.h(encVar2.b, encVar2.p, encVar2.l);
                            return;
                        case 4:
                            ((zfu) this.a.i.get()).a();
                            return;
                        case 5:
                            enc encVar3 = this.a;
                            afsx c2 = ((afsy) encVar3.m.get()).c();
                            if (c2 instanceof AccountIdentity) {
                                ((wco) encVar3.n.get()).d((AccountIdentity) c2);
                                return;
                            }
                            return;
                        case 6:
                            final enc encVar4 = this.a;
                            aadr aadrVar2 = (aadr) encVar4.p.get();
                            aadrVar2.d(encVar4.c);
                            ((aarh) encVar4.q.get()).h(encVar4.b, encVar4.p, encVar4.l);
                            if (!encVar4.t) {
                                encVar4.b();
                            } else {
                                azrj azrjVar = encVar4.s;
                                if (azrjVar != null) {
                                    azrjVar.B(azre.b(encVar4.b)).R(new ayrm() { // from class: ena
                                        @Override // defpackage.ayrm
                                        public final void a() {
                                            enc.this.b();
                                        }
                                    });
                                }
                            }
                            ((zfy) encVar4.h.get()).c(encVar4.c, aadrVar2.a());
                            encVar4.d.c(2);
                            return;
                        case 7:
                            enc encVar5 = this.a;
                            long d = ((shf) encVar5.j.get()).d();
                            ((wza) encVar5.k.get()).f();
                            encVar5.d.d();
                            ypa ypaVar = (ypa) encVar5.l.get();
                            ypaVar.d(new xas(d));
                            ypaVar.d(new xar());
                            return;
                        case 8:
                            enc encVar6 = this.a;
                            ((kcd) encVar6.r.get()).b();
                            azrj azrjVar2 = encVar6.s;
                            if (azrjVar2 != null) {
                                azrjVar2.sh();
                                return;
                            }
                            return;
                        default:
                            enc encVar7 = this.a;
                            atej atejVar = ((aadw) encVar7.g.get()).b().k;
                            if (atejVar == null) {
                                atejVar = atej.a;
                            }
                            apdm apdmVar = atejVar.p;
                            if (apdmVar == null) {
                                apdmVar = apdm.a;
                            }
                            if (!apdmVar.d || apdmVar.e.size() == 0) {
                                return;
                            }
                            ajoy ajoyVar = (ajoy) encVar7.o.get();
                            Iterator it = apdmVar.e.iterator();
                            while (it.hasNext()) {
                                ajoyVar.u((String) it.next());
                            }
                            return;
                    }
                }
            });
            yyrVar.n(b, b5, b6, b7, b8);
        }
        this.d.c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        kcd kcdVar = (kcd) this.r.get();
        kcdVar.g(this.b);
        kcdVar.f(this.b);
    }
}
