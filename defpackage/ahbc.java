package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbc {
    public final Executor a;
    protected final azrw b;
    final aypn c;
    final aypn d;
    protected final axpg e;
    final ayqw f = new ayqw();
    public boolean g;
    protected final aimx h;
    private final aiov i;

    public ahbc(aimx aimxVar, aiov aiovVar, axpg axpgVar, Executor executor, azrw azrwVar, aypn aypnVar, aypn aypnVar2) {
        this.h = aimxVar;
        this.i = aiovVar;
        this.e = axpgVar;
        this.a = executor;
        this.b = azrwVar;
        this.c = aypnVar;
        this.d = aypnVar2;
    }

    public final void a() {
        if (this.f.a() == 0) {
            final int i = 1;
            this.f.d(this.i.a.Y(new ayrs(this) { // from class: ahba
                public final /* synthetic */ ahbc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i == 0) {
                        this.a.g = ((ahel) obj).a().a() == 3;
                        return;
                    }
                    final ahbc ahbcVar = this.a;
                    if (((ahef) obj).c() != aign.ENDED || ahbcVar.g || ((ahbd) ahbcVar.e.get()).b()) {
                        return;
                    }
                    if (ahbw.i(((ahbd) ahbcVar.e.get()).c(aims.c))) {
                        acsx acsxVar = (acsx) ahbcVar.b.get();
                        aimr aimrVar = aimr.AUTOPLAY;
                        aigc a = aigd.a();
                        a.a = acsxVar;
                        final aims aimsVar = new aims(aimrVar, null, a.a());
                        ahbcVar.a.execute(new Runnable() { // from class: ahbb
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahbc ahbcVar2 = ahbc.this;
                                ((ahbd) ahbcVar2.e.get()).a(aimsVar);
                            }
                        });
                        return;
                    }
                    ahbcVar.h.a.c(new ahdt(true));
                }
            }, zxi.m));
            final int i2 = 0;
            this.f.d(this.d.Y(new ayrs(this) { // from class: ahba
                public final /* synthetic */ ahbc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        this.a.g = ((ahel) obj).a().a() == 3;
                        return;
                    }
                    final ahbc ahbcVar = this.a;
                    if (((ahef) obj).c() != aign.ENDED || ahbcVar.g || ((ahbd) ahbcVar.e.get()).b()) {
                        return;
                    }
                    if (ahbw.i(((ahbd) ahbcVar.e.get()).c(aims.c))) {
                        acsx acsxVar = (acsx) ahbcVar.b.get();
                        aimr aimrVar = aimr.AUTOPLAY;
                        aigc a = aigd.a();
                        a.a = acsxVar;
                        final aims aimsVar = new aims(aimrVar, null, a.a());
                        ahbcVar.a.execute(new Runnable() { // from class: ahbb
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahbc ahbcVar2 = ahbc.this;
                                ((ahbd) ahbcVar2.e.get()).a(aimsVar);
                            }
                        });
                        return;
                    }
                    ahbcVar.h.a.c(new ahdt(true));
                }
            }, zxi.m));
            this.f.d(this.c.Y(new ayrs(this) { // from class: ahba
                public final /* synthetic */ ahbc a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    if (i2 == 0) {
                        this.a.g = ((ahel) obj).a().a() == 3;
                        return;
                    }
                    final ahbc ahbcVar = this.a;
                    if (((ahef) obj).c() != aign.ENDED || ahbcVar.g || ((ahbd) ahbcVar.e.get()).b()) {
                        return;
                    }
                    if (ahbw.i(((ahbd) ahbcVar.e.get()).c(aims.c))) {
                        acsx acsxVar = (acsx) ahbcVar.b.get();
                        aimr aimrVar = aimr.AUTOPLAY;
                        aigc a = aigd.a();
                        a.a = acsxVar;
                        final aims aimsVar = new aims(aimrVar, null, a.a());
                        ahbcVar.a.execute(new Runnable() { // from class: ahbb
                            @Override // java.lang.Runnable
                            public final void run() {
                                ahbc ahbcVar2 = ahbc.this;
                                ((ahbd) ahbcVar2.e.get()).a(aimsVar);
                            }
                        });
                        return;
                    }
                    ahbcVar.h.a.c(new ahdt(true));
                }
            }, zxi.m));
        }
    }
}
