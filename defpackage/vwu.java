package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vwu implements vuo {
    public final CopyOnWriteArraySet a;
    public final vuq b;
    public final Queue c;
    public boolean d;
    public Surface e;
    public vws f;
    public boolean g;
    public final vwo h;
    private final Handler i;
    private final vwt j;
    private vwm k;
    private List l;
    private final Runnable m;

    public vwu(vuq vuqVar) {
        vwo vwoVar = new vwo(this);
        this.h = vwoVar;
        this.a = new CopyOnWriteArraySet();
        this.i = new Handler(Looper.getMainLooper());
        this.j = new vwt(vwoVar);
        this.c = new LinkedList();
        this.d = false;
        this.g = true;
        this.m = new vwp(this);
        this.b = vuqVar;
    }

    @Override // defpackage.vuo
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vwq) it.next()).d();
        }
        synchronized (this.c) {
            this.c.add(0);
        }
        d();
    }

    @Override // defpackage.vuo
    public final void b() {
        synchronized (this.c) {
            this.c.add(1);
        }
        d();
    }

    public final void c() {
        this.b.d(this);
        this.k = null;
        this.f = null;
        this.l = null;
    }

    public final void d() {
        this.i.post(this.m);
    }

    public final synchronized void e(vwm vwmVar, List list) {
        vwmVar.getClass();
        this.k = vwmVar;
        this.l = Collections.unmodifiableList(list);
        vwmVar.e(this.j);
        vwmVar.d.add(this.j);
        d();
        f();
    }

    public final void f() {
        vwm vwmVar = this.k;
        if (vwmVar != null) {
            int i = Integer.MAX_VALUE;
            if (!vwmVar.o() && !this.g) {
                i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            this.b.c(this, i);
        }
    }

    public final boolean g() {
        return this.b.f(this);
    }

    public final boolean h(boolean z) {
        List list;
        vws vwsVar;
        if (this.k == null || this.e == null || (list = this.l) == null || (vwsVar = this.f) == null || !(z || vwsVar.i)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.k.m(((Integer) it.next()).intValue(), true != z ? -1 : 0);
        }
        return true;
    }

    public final String toString() {
        return "PLAYER";
    }
}
