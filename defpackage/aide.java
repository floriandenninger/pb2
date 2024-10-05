package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aide implements aioa, ypd {
    private final aicz a;
    private final axpg b;
    private boolean c;
    private aign d;

    public aide(aicz aiczVar, axpg axpgVar) {
        aiczVar.getClass();
        this.a = aiczVar;
        this.b = axpgVar;
    }

    private final void a(atzx atzxVar) {
        aicw aicwVar = (aicw) this.b.get();
        ((ajoc) aicwVar.a).t();
        if (atzxVar != null) {
            RecyclerView recyclerView = aicwVar.g;
            if (recyclerView != null) {
                recyclerView.aa(0);
            }
            aicwVar.b(atzxVar);
        }
        this.a.j(0, false, 0);
        this.a.g = atzxVar != null ? atzxVar.g.I() : null;
    }

    protected int b(aign aignVar) {
        if (aignVar == aign.VIDEO_PLAYING) {
            return 1;
        }
        return aignVar == aign.ENDED ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean c() {
        return !((aicw) this.b.get()).a.isEmpty() && this.c;
    }

    public final void d(ahcx ahcxVar) {
        boolean z = this.c;
        boolean z2 = ahcxVar.d() == aigf.FULLSCREEN;
        this.c = z2;
        if (z != z2) {
            l();
        }
    }

    public final void i(ahdv ahdvVar) {
        atzr atzrVar;
        if (ahdvVar.a() != null && (atzrVar = ahdvVar.a().i) != null) {
            atzo atzoVar = atzrVar.g;
            if (atzoVar == null) {
                atzoVar = atzo.a;
            }
            if ((atzoVar.b & 1) == 0) {
                k();
            } else {
                atzo atzoVar2 = atzrVar.g;
                if (atzoVar2 == null) {
                    atzoVar2 = atzo.a;
                }
                atzx atzxVar = atzoVar2.c;
                if (atzxVar == null) {
                    atzxVar = atzx.a;
                }
                a(atzxVar);
            }
        }
        l();
    }

    public final void j(ahef ahefVar) {
        if (this.d != ahefVar.c()) {
            this.d = ahefVar.c();
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k() {
        a(null);
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 2;
        final int i3 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 134217728L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aidd
            public final /* synthetic */ aide a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    this.a.i((ahdv) obj);
                } else if (i4 != 1) {
                    this.a.j((ahef) obj);
                } else {
                    this.a.d((ahcx) obj);
                }
            }
        }, ahwx.o), aiocVar.ao().h(ahbw.g(aiocVar.aC(), 134217728L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: aidd
            public final /* synthetic */ aide a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    this.a.i((ahdv) obj);
                } else if (i4 != 1) {
                    this.a.j((ahef) obj);
                } else {
                    this.a.d((ahcx) obj);
                }
            }
        }, ahwx.o), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 134217728L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: aidd
            public final /* synthetic */ aide a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    this.a.i((ahdv) obj);
                } else if (i4 != 1) {
                    this.a.j((ahef) obj);
                } else {
                    this.a.d((ahcx) obj);
                }
            }
        }, ahwx.o)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahdv.class, ahef.class};
        }
        if (i == 0) {
            d((ahcx) obj);
            return null;
        }
        if (i == 1) {
            i((ahdv) obj);
            return null;
        }
        if (i == 2) {
            j((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l() {
        this.a.i(c() ? b(this.d) : 0, 0);
    }
}
