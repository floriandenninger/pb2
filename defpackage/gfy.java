package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfy {
    public final ypa a;
    public final ysy b;
    public final AtomicInteger c;
    public volatile boolean d;
    public volatile boolean e;
    private final aaea f;
    private final ywr g;
    private final Executor h;
    private volatile int i = 1;

    public gfy(ypa ypaVar, ysy ysyVar, aaea aaeaVar, ywr ywrVar, aypn aypnVar, Executor executor, ayqi ayqiVar, ayqi ayqiVar2) {
        final int i = 1;
        ypaVar.getClass();
        this.a = ypaVar;
        ysyVar.getClass();
        this.b = ysyVar;
        aaeaVar.getClass();
        this.f = aaeaVar;
        ywrVar.getClass();
        this.g = ywrVar;
        this.c = new AtomicInteger(-1);
        this.d = ysyVar.r();
        this.e = ysyVar.o();
        this.h = executor;
        ywrVar.d().G().E(ayqiVar).X(new ayrs(this) { // from class: gfu
            public final /* synthetic */ gfy a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    gfy gfyVar = this.a;
                    ((Integer) obj).intValue();
                    int b = gfyVar.b();
                    boolean r = gfyVar.b.r();
                    boolean o = gfyVar.b.o();
                    boolean z = gfyVar.d;
                    boolean z2 = gfyVar.e;
                    gfyVar.d = r;
                    gfyVar.e = o;
                    int i2 = 1;
                    if (b == 1) {
                        if (z == gfyVar.d) {
                            b = 1;
                        }
                        gfyVar.c(gfyVar.g(i2));
                        gfyVar.e(i2);
                        return;
                    }
                    if (b != 2 || z2 == gfyVar.e) {
                        return;
                    }
                    i2 = b;
                    gfyVar.c(gfyVar.g(i2));
                    gfyVar.e(i2);
                    return;
                }
                gfy gfyVar2 = this.a;
                fof fofVar = (fof) obj;
                if ((fofVar.b & 4) == 0 || fofVar.e == gfyVar2.c.get()) {
                    return;
                }
                boolean g = gfyVar2.g(gfyVar2.c.getAndSet(fofVar.e));
                boolean g2 = gfyVar2.g(fofVar.e);
                if (g != g2) {
                    gfyVar2.c(g2);
                }
                gfyVar2.e(fofVar.e);
            }
        });
        final int i2 = 0;
        aypnVar.E(ayqiVar2).X(new ayrs(this) { // from class: gfu
            public final /* synthetic */ gfy a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    gfy gfyVar = this.a;
                    ((Integer) obj).intValue();
                    int b = gfyVar.b();
                    boolean r = gfyVar.b.r();
                    boolean o = gfyVar.b.o();
                    boolean z = gfyVar.d;
                    boolean z2 = gfyVar.e;
                    gfyVar.d = r;
                    gfyVar.e = o;
                    int i22 = 1;
                    if (b == 1) {
                        if (z == gfyVar.d) {
                            b = 1;
                        }
                        gfyVar.c(gfyVar.g(i22));
                        gfyVar.e(i22);
                        return;
                    }
                    if (b != 2 || z2 == gfyVar.e) {
                        return;
                    }
                    i22 = b;
                    gfyVar.c(gfyVar.g(i22));
                    gfyVar.e(i22);
                    return;
                }
                gfy gfyVar2 = this.a;
                fof fofVar = (fof) obj;
                if ((fofVar.b & 4) == 0 || fofVar.e == gfyVar2.c.get()) {
                    return;
                }
                boolean g = gfyVar2.g(gfyVar2.c.getAndSet(fofVar.e));
                boolean g2 = gfyVar2.g(fofVar.e);
                if (g != g2) {
                    gfyVar2.c(g2);
                }
                gfyVar2.e(fofVar.e);
            }
        });
    }

    public static int a(aaea aaeaVar) {
        aswb aswbVar = aaeaVar.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        int aJ = aocz.aJ(aswbVar.u);
        if (aJ == 0) {
            aJ = 1;
        }
        int i = aJ - 1;
        if (i != 2) {
            return i != 3 ? 2 : 0;
        }
        return 1;
    }

    private final void i() {
        ammv ammvVar;
        if (this.c.get() == -1) {
            if ((((fof) this.g.c()).b & 4) != 0) {
                ammvVar = ammv.j(Integer.valueOf(((fof) this.g.c()).e));
            } else {
                ammvVar = amlr.a;
            }
            int a = a(this.f);
            this.c.set(ammvVar.h() ? ((Integer) ammvVar.c()).intValue() : a);
            int i = this.c.get();
            String valueOf = String.valueOf(ammvVar.h() ? (Serializable) ammvVar.c() : "UNSET");
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("initialized to ");
            sb.append(i);
            sb.append(" settingStore: ");
            sb.append(valueOf);
            sb.append(" hotConfig: ");
            sb.append(a);
            zga.h("InlineMuted", sb.toString());
        }
    }

    public final int b() {
        i();
        return this.c.get();
    }

    public final void c(final boolean z) {
        this.h.execute(new Runnable() { // from class: gfv
            @Override // java.lang.Runnable
            public final void run() {
                gfy.this.a.d(new gfx(z, null));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(final int i) {
        i();
        final int i2 = this.c.get();
        if (i2 == i) {
            return;
        }
        ynm.i(this.g.b(new fnz(i, 2)), new ynl() { // from class: gft
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                gfy gfyVar = gfy.this;
                int i3 = i;
                int i4 = i2;
                gfyVar.c.set(i3);
                boolean g = gfyVar.g(i4);
                boolean g2 = gfyVar.g(i3);
                if (g != g2) {
                    gfyVar.c(g2);
                }
            }
        });
    }

    public final synchronized void e(int i) {
        int i2 = ((fof) this.g.c()).b & 4;
        if (i == 0) {
            this.i = i2 != 0 ? 3 : 11;
            return;
        }
        if (i != 1) {
            if (i != 2) {
                this.i = 1;
                return;
            } else {
                this.i = i2 != 0 ? 5 : 6;
                return;
            }
        }
        if (this.d) {
            this.i = i2 != 0 ? 7 : 8;
        } else {
            this.i = i2 != 0 ? 9 : 10;
        }
    }

    public final boolean f() {
        return g(b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i) {
        if (i == 2) {
            return this.b.o();
        }
        if (i == 1) {
            return this.b.r();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h() {
        if (this.i == 1) {
            e(b());
        }
        return this.i;
    }
}
