package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.media3.exoplayer.video.DummySurface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afdf {
    public volatile boolean a;
    public volatile boolean b;
    public afkx c;
    private final shf d;
    private final Deque e = new ArrayDeque();
    private final Handler f = new Handler(Looper.getMainLooper());

    public afdf(shf shfVar, afhs afhsVar) {
        this.a = afhsVar.O();
        this.d = shfVar;
    }

    public final void a(aeru aeruVar) {
        if (this.a) {
            ArrayList arrayList = new ArrayList();
            while (!this.e.isEmpty()) {
                arrayList.add((afdd) this.e.remove());
                if (arrayList.size() == 6 || this.e.isEmpty()) {
                    aeruVar.i("dedi", new afdc(arrayList));
                    if (!this.e.isEmpty()) {
                        arrayList = new ArrayList();
                    }
                }
            }
            this.b = false;
        }
    }

    public final void b(afqu afquVar) {
        o(afde.ATTACH_MEDIA_VIEW, afquVar);
    }

    public final void c(afqu afquVar) {
        o(afde.BLOCKING_STOP_VIDEO, afquVar);
    }

    public final void d(afqu afquVar) {
        o(afde.DETACH_MEDIA_VIEW, afquVar);
    }

    public final void e(afqu afquVar) {
        o(afde.LOAD_VIDEO, afquVar);
    }

    public final void f(afkx afkxVar, afqu afquVar) {
        if (this.a) {
            this.c = afkxVar;
            if (afkxVar == null) {
                o(afde.SET_NULL_LISTENER, afquVar);
            } else {
                o(afde.SET_LISTENER, afquVar);
            }
        }
    }

    public final void g(aflb aflbVar, afqu afquVar) {
        p(afde.SET_MEDIA_VIEW_TYPE, afquVar, 0, aflbVar, afjz.a(Thread.currentThread().getStackTrace()), null);
    }

    public final void h(final afqu afquVar, final Surface surface, Exception exc) {
        final StringBuilder sb = new StringBuilder();
        if (surface instanceof DummySurface) {
            sb.append("-dummy");
        }
        if (exc != null) {
            sb.append("-failed");
        }
        this.f.post(new Runnable() { // from class: afda
            @Override // java.lang.Runnable
            public final void run() {
                afdf afdfVar = afdf.this;
                afdfVar.p(afde.SET_OUTPUT_SURFACE, afquVar, System.identityHashCode(surface), aflb.NONE, sb.toString(), null);
                afdfVar.b = true;
            }
        });
    }

    public final void i(Surface surface, afqu afquVar) {
        if (this.a) {
            if (surface == null) {
                p(afde.SET_NULL_SURFACE, afquVar, 0, aflb.NONE, afjz.a(Thread.currentThread().getStackTrace()), null);
            } else {
                p(afde.SET_SURFACE, afquVar, System.identityHashCode(surface), aflb.NONE, null, null);
            }
        }
    }

    public final void j(afqu afquVar) {
        o(afde.STOP_VIDEO, afquVar);
    }

    public final void k(afqu afquVar) {
        o(afde.SURFACE_CREATED, afquVar);
    }

    public final void l(afqu afquVar) {
        o(afde.SURFACE_DESTROYED, afquVar);
    }

    public final void m(afqu afquVar) {
        o(afde.SURFACE_ERROR, afquVar);
    }

    public final void n(final Surface surface, final afqu afquVar, final boolean z, final aeru aeruVar) {
        if (this.a) {
            final long d = this.d.d();
            this.f.post(new Runnable() { // from class: afcz
                @Override // java.lang.Runnable
                public final void run() {
                    afdf afdfVar = afdf.this;
                    Surface surface2 = surface;
                    afqu afquVar2 = afquVar;
                    boolean z2 = z;
                    aeru aeruVar2 = aeruVar;
                    long j = d;
                    if (afdfVar.a) {
                        afdfVar.p(z2 ? afde.SURFACE_BECOMES_VALID : afde.UNEXPECTED_INVALID_SURFACE, afquVar2, System.identityHashCode(surface2), aflb.NONE, null, Long.valueOf(j));
                        afdfVar.a(aeruVar2);
                    }
                }
            });
        }
    }

    public final void o(afde afdeVar, afqu afquVar) {
        p(afdeVar, afquVar, 0, aflb.NONE, null, null);
    }

    public final void p(final afde afdeVar, final afqu afquVar, final int i, final aflb aflbVar, final Object obj, final Long l) {
        if (this.a) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.e.add(afdd.g(afdeVar, l != null ? l.longValue() : this.d.d(), afquVar, i, aflbVar, obj));
                if (this.e.size() > 512) {
                    this.e.remove();
                    return;
                }
                return;
            }
            this.f.post(new Runnable() { // from class: afdb
                @Override // java.lang.Runnable
                public final void run() {
                    afdf afdfVar = afdf.this;
                    afqu afquVar2 = afquVar;
                    afde afdeVar2 = afdeVar;
                    int i2 = i;
                    aflb aflbVar2 = aflbVar;
                    Object obj2 = obj;
                    Long l2 = l;
                    afdfVar.o(afde.NOT_ON_MAIN_THREAD, afquVar2);
                    afdfVar.p(afdeVar2, afquVar2, i2, aflbVar2, obj2, l2);
                }
            });
        }
    }
}
