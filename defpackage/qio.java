package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qio {
    long b;
    public final qjk c;
    List d;
    final SparseIntArray e;
    final LruCache f;
    final List g;
    final Deque h;
    public qoi i;
    public qoi j;
    private final Handler l;
    private final TimerTask m;
    public final Set k = new HashSet();
    public final qkw a = new qkw("MediaQueue");

    public qio(qjk qjkVar) {
        this.c = qjkVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.e = new SparseIntArray();
        this.g = new ArrayList();
        this.h = new ArrayDeque(20);
        this.l = new amcc(Looper.getMainLooper(), (byte[]) null);
        this.m = new qil(this);
        qin qinVar = new qin(this);
        qip.as("Must be called from the main thread.");
        qjkVar.d.add(qinVar);
        this.f = new qim(this);
        this.b = a();
        g();
    }

    private final void j() {
        this.l.removeCallbacks(this.m);
    }

    private final void k() {
        qoi qoiVar = this.j;
        if (qoiVar != null) {
            qoiVar.f();
            this.j = null;
        }
    }

    private final void l() {
        qoi qoiVar = this.i;
        if (qoiVar != null) {
            qoiVar.f();
            this.i = null;
        }
    }

    public final long a() {
        MediaStatus e = this.c.e();
        if (e == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e.a;
        if (MediaStatus.d(e.e, e.f, e.l, mediaInfo == null ? -1 : mediaInfo.b)) {
            return 0L;
        }
        return e.b;
    }

    public final void b() {
        e();
        this.d.clear();
        this.e.clear();
        this.f.evictAll();
        this.g.clear();
        j();
        this.h.clear();
        k();
        l();
        d();
        c();
    }

    public final void c() {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final void d() {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final void e() {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final void f() {
        this.e.clear();
        for (int i = 0; i < this.d.size(); i++) {
            this.e.put(((Integer) this.d.get(i)).intValue(), i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [qoi] */
    public final void g() {
        qiu qiuVar;
        qip.as("Must be called from the main thread.");
        if (this.b != 0 && this.j == null) {
            k();
            l();
            qjk qjkVar = this.c;
            qip.as("Must be called from the main thread.");
            if (!qjkVar.l()) {
                qiuVar = qjk.v();
            } else {
                qiu qiuVar2 = new qiu(qjkVar);
                qjk.u(qiuVar2);
                qiuVar = qiuVar2;
            }
            this.j = qiuVar;
            qiuVar.g(new qik(this, 1));
        }
    }

    public final void h() {
        j();
        this.l.postDelayed(this.m, 500L);
    }

    public final void i() {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }
}
