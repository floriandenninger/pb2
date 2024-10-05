package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahxz implements aioa, ypd {
    public final ahxw a;
    public Bitmap b;
    private final ajjz c;
    private final ykl d;
    private ykn e;
    private Uri f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;

    public ahxz(ahxw ahxwVar, ajjz ajjzVar) {
        this.a = ahxwVar;
        ajjzVar.getClass();
        this.c = ajjzVar;
        this.d = ykt.c(new Handler(), new ahxy(this));
    }

    private final void d() {
        this.f = null;
        this.b = null;
        ykn yknVar = this.e;
        if (yknVar != null) {
            yknVar.d();
            this.e = null;
        }
        this.a.nw();
    }

    private final void g() {
        if ((this.g && (this.i || this.j)) || !this.h) {
            if (this.b == null && this.f != null && this.e == null) {
                ykn c = ykn.c(this.d);
                this.e = c;
                this.c.l(this.f, c);
            }
            this.a.kX();
            return;
        }
        this.a.kV();
    }

    public final void a(ahcx ahcxVar) {
        this.j = ahcxVar.d() == aigf.REMOTE;
        g();
    }

    public final void b(ahed ahedVar) {
        this.i = ahedVar.b();
        g();
    }

    public final void c(ahef ahefVar) {
        if (ahefVar.c() == aign.NEW) {
            d();
        } else if (ahefVar.c().c(aign.PLAYBACK_LOADED)) {
            ahxw ahxwVar = this.a;
            View ld = ahxwVar instanceof aivf ? ((aivf) ahxwVar).ld() : null;
            int width = ld != null ? ld.getWidth() : 480;
            int height = ld != null ? ld.getHeight() : 320;
            if (ahefVar.b() != null) {
                aami b = ahefVar.b().b();
                Uri a = b.f() ? b.b(width, height).a() : null;
                if (a == null || !a.equals(this.f)) {
                    d();
                }
                this.f = a;
            }
        }
        this.g = ahefVar.c().c(aign.PLAYBACK_LOADED);
        this.h = !ahefVar.c().a(aign.PLAYBACK_LOADED, aign.PLAYBACK_INTERRUPTED, aign.READY, aign.ENDED);
        g();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 2;
        final int i3 = 0;
        return new ayqx[]{aiocVar.G().a.h(ahbw.g(aiocVar.aC(), 2097152L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxx
            public final /* synthetic */ ahxz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    this.a.b((ahed) obj);
                } else if (i4 != 1) {
                    this.a.c((ahef) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahwx.g), aiocVar.t().a.h(ahbw.g(aiocVar.aC(), 2097152L)).h(ahbw.e(1)).Y(new ayrs(this) { // from class: ahxx
            public final /* synthetic */ ahxz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    this.a.b((ahed) obj);
                } else if (i4 != 1) {
                    this.a.c((ahef) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahwx.g), aiocVar.t().b.h(ahbw.g(aiocVar.aC(), 2097152L)).h(ahbw.e(0)).Y(new ayrs(this) { // from class: ahxx
            public final /* synthetic */ ahxz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    this.a.b((ahed) obj);
                } else if (i4 != 1) {
                    this.a.c((ahef) obj);
                } else {
                    this.a.a((ahcx) obj);
                }
            }
        }, ahwx.g)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class, ahed.class, ahef.class};
        }
        if (i == 0) {
            a((ahcx) obj);
            return null;
        }
        if (i == 1) {
            b((ahed) obj);
            return null;
        }
        if (i == 2) {
            c((ahef) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
