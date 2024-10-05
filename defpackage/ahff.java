package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahff implements ahep, aioa {
    public final azrw a;
    public final aioc b;
    public aigf c;
    public boolean d = false;
    public int e;
    public int f;
    public boolean g;
    private final ahfd h;
    private final zbw i;
    private final ysy j;

    public ahff(azrw azrwVar, aioc aiocVar, ahfd ahfdVar, zbw zbwVar, ysy ysyVar) {
        this.a = azrwVar;
        ahfdVar.getClass();
        this.h = ahfdVar;
        zbwVar.getClass();
        this.i = zbwVar;
        ysyVar.getClass();
        this.j = ysyVar;
        this.b = aiocVar;
    }

    public final boolean a() {
        if (!this.d || this.c != aigf.BACKGROUND || !((ainl) this.a.get()).j(aims.d) || !this.h.g() || this.g) {
            return false;
        }
        int i = this.j.m() ? this.f : this.e;
        return i == 0 || i == -1 || this.i.a() < TimeUnit.MINUTES.toMillis((long) i);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 2;
        final int i3 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 4L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahfe
            public final /* synthetic */ ahff a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                atzl atzlVar;
                int i4 = i2;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.c = ((ahcx) obj).d();
                        return;
                    }
                    ahff ahffVar = this.a;
                    aign aignVar = aign.NEW;
                    int ordinal = ((ahef) obj).c().ordinal();
                    if (ordinal == 0) {
                        ahffVar.g = false;
                        return;
                    } else {
                        if (ordinal == 9 && ahffVar.a()) {
                            ((ainl) ahffVar.a.get()).a(aims.d);
                            return;
                        }
                        return;
                    }
                }
                ahff ahffVar2 = this.a;
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.a() == null || (atzrVar = ahdvVar.a().i) == null) {
                    return;
                }
                atzn atznVar = atzrVar.h;
                if (atznVar == null) {
                    atznVar = atzn.a;
                }
                if ((1 & atznVar.b) != 0) {
                    atzn atznVar2 = atzrVar.h;
                    if (atznVar2 == null) {
                        atznVar2 = atzn.a;
                    }
                    atzm atzmVar = atznVar2.c;
                    if (atzmVar == null) {
                        atzmVar = atzm.a;
                    }
                    if ((atzmVar.b & 128) != 0) {
                        atzk atzkVar = atzmVar.h;
                        if (atzkVar == null) {
                            atzkVar = atzk.a;
                        }
                        atzlVar = atzkVar.c;
                        if (atzlVar == null) {
                            atzlVar = atzl.a;
                        }
                    } else {
                        atzlVar = null;
                    }
                    ahffVar2.e = atzlVar == null ? -1 : atzlVar.b;
                    ahffVar2.f = atzlVar != null ? atzlVar.c : -1;
                }
            }
        }, zxi.p), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 4L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahfe
            public final /* synthetic */ ahff a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                atzl atzlVar;
                int i4 = i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.c = ((ahcx) obj).d();
                        return;
                    }
                    ahff ahffVar = this.a;
                    aign aignVar = aign.NEW;
                    int ordinal = ((ahef) obj).c().ordinal();
                    if (ordinal == 0) {
                        ahffVar.g = false;
                        return;
                    } else {
                        if (ordinal == 9 && ahffVar.a()) {
                            ((ainl) ahffVar.a.get()).a(aims.d);
                            return;
                        }
                        return;
                    }
                }
                ahff ahffVar2 = this.a;
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.a() == null || (atzrVar = ahdvVar.a().i) == null) {
                    return;
                }
                atzn atznVar = atzrVar.h;
                if (atznVar == null) {
                    atznVar = atzn.a;
                }
                if ((1 & atznVar.b) != 0) {
                    atzn atznVar2 = atzrVar.h;
                    if (atznVar2 == null) {
                        atznVar2 = atzn.a;
                    }
                    atzm atzmVar = atznVar2.c;
                    if (atzmVar == null) {
                        atzmVar = atzm.a;
                    }
                    if ((atzmVar.b & 128) != 0) {
                        atzk atzkVar = atzmVar.h;
                        if (atzkVar == null) {
                            atzkVar = atzk.a;
                        }
                        atzlVar = atzkVar.c;
                        if (atzlVar == null) {
                            atzlVar = atzl.a;
                        }
                    } else {
                        atzlVar = null;
                    }
                    ahffVar2.e = atzlVar == null ? -1 : atzlVar.b;
                    ahffVar2.f = atzlVar != null ? atzlVar.c : -1;
                }
            }
        }, zxi.p), aiocVar.ao().h(ahbw.g(aiocVar.aC(), 4L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahfe
            public final /* synthetic */ ahff a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atzr atzrVar;
                atzl atzlVar;
                int i4 = i3;
                if (i4 != 0) {
                    if (i4 == 1) {
                        this.a.c = ((ahcx) obj).d();
                        return;
                    }
                    ahff ahffVar = this.a;
                    aign aignVar = aign.NEW;
                    int ordinal = ((ahef) obj).c().ordinal();
                    if (ordinal == 0) {
                        ahffVar.g = false;
                        return;
                    } else {
                        if (ordinal == 9 && ahffVar.a()) {
                            ((ainl) ahffVar.a.get()).a(aims.d);
                            return;
                        }
                        return;
                    }
                }
                ahff ahffVar2 = this.a;
                ahdv ahdvVar = (ahdv) obj;
                if (ahdvVar.a() == null || (atzrVar = ahdvVar.a().i) == null) {
                    return;
                }
                atzn atznVar = atzrVar.h;
                if (atznVar == null) {
                    atznVar = atzn.a;
                }
                if ((1 & atznVar.b) != 0) {
                    atzn atznVar2 = atzrVar.h;
                    if (atznVar2 == null) {
                        atznVar2 = atzn.a;
                    }
                    atzm atzmVar = atznVar2.c;
                    if (atzmVar == null) {
                        atzmVar = atzm.a;
                    }
                    if ((atzmVar.b & 128) != 0) {
                        atzk atzkVar = atzmVar.h;
                        if (atzkVar == null) {
                            atzkVar = atzk.a;
                        }
                        atzlVar = atzkVar.c;
                        if (atzlVar == null) {
                            atzlVar = atzl.a;
                        }
                    } else {
                        atzlVar = null;
                    }
                    ahffVar2.e = atzlVar == null ? -1 : atzlVar.b;
                    ahffVar2.f = atzlVar != null ? atzlVar.c : -1;
                }
            }
        }, zxi.p)};
    }

    @Override // defpackage.ahep
    public final void p() {
        this.g = true;
    }

    @Override // defpackage.ahep
    public final void q(boolean z) {
    }
}
