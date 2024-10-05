package defpackage;

import android.util.SparseArray;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiba implements aibi {
    private final SparseArray a;
    private final Set c;
    private final Set d;
    private final aibd e;
    private int f;

    public aiba() {
        aibd aibdVar = new aibd();
        this.a = new SparseArray(2);
        this.c = new CopyOnWriteArraySet();
        this.d = new CopyOnWriteArraySet();
        this.e = aibdVar;
        for (int i = 0; i < 2; i++) {
            this.a.put(b[i], new ArrayList());
        }
        this.f = -1;
    }

    private final synchronized void d() {
        amkq.N(this.e.a(this.f != -1 ? (fnt) ((List) this.a.get(0)).get(this.f) : null));
    }

    private final synchronized void e(int i) {
        if (i != this.f) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((aibh) it.next()).d();
            }
        }
    }

    private final synchronized void f(int i, int i2) {
        int i3 = this.f;
        if (i3 != -1 && i <= i3) {
            this.f = i3 + i2;
            d();
        }
    }

    private final synchronized void g() {
        fnt a = aibe.a(this);
        aibd aibdVar = this.e;
        if (!aibdVar.a(a)) {
            aibdVar.b = a;
            Iterator it = aibdVar.a.iterator();
            while (it.hasNext()) {
                ((aibg) it.next()).a(a);
            }
        }
    }

    private final synchronized void h(int i) {
        int i2 = this.f;
        if (i2 != -1 && i2 >= 0) {
            if (i <= i2) {
                this.f = i2 - i;
                d();
            } else {
                this.f = Math.min(0, ((List) this.a.get(0)).size() - 1);
                g();
            }
        }
    }

    public final synchronized void a(int i) {
        if (!((List) this.a.get(0)).isEmpty()) {
            yjj.B(i, r0.size() - 1);
        } else if (i != -1) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.f;
        this.f = i;
        e(i2);
        g();
    }

    public final void b(int i, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        synchronized (this) {
            ((List) this.a.get(0)).addAll(i, collection);
            int i2 = this.f;
            f(i, size);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((aibf) it.next()).a(0, i, size);
            }
            e(i2);
        }
    }

    public final void c(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            ((List) this.a.get(i)).subList(0, i2).clear();
            int i3 = this.f;
            if (i == 0) {
                h(i2);
                i = 0;
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((aibf) it.next()).c(i, i2);
            }
            e(i3);
        }
    }

    @Override // defpackage.aibi
    public final synchronized int i(int i) {
        return ((List) this.a.get(i)).size();
    }

    @Override // defpackage.aibi
    public final synchronized int j() {
        return this.f;
    }

    @Override // defpackage.aibi
    public final void k(aibf aibfVar) {
        this.c.add(aibfVar);
    }

    @Override // defpackage.aibi
    public final void l(aibg aibgVar) {
        this.e.a.add(aibgVar);
    }

    @Override // defpackage.aibi
    public final void m(aibh aibhVar) {
        this.d.add(aibhVar);
    }

    @Override // defpackage.aibi
    public final synchronized void n() {
        for (int i = 0; i < 2; i++) {
            c(b[i], ((List) this.a.get(b[i])).size());
        }
    }

    @Override // defpackage.aibi
    public final void q(aibf aibfVar) {
        this.c.remove(aibfVar);
    }

    @Override // defpackage.aibi
    public final void r(aibg aibgVar) {
        this.e.a.remove(aibgVar);
    }

    @Override // defpackage.aibi
    public final void s(aibh aibhVar) {
        this.d.remove(aibhVar);
    }

    @Override // defpackage.aibi
    public final synchronized boolean t(PlaybackStartDescriptor playbackStartDescriptor) {
        fnt a = aibe.a(this);
        if (a == null) {
            return false;
        }
        return aigb.c(a.a(), playbackStartDescriptor);
    }

    @Override // defpackage.aibi
    public final synchronized int w(int i, fnt fntVar) {
        return ((List) this.a.get(i)).indexOf(fntVar);
    }

    @Override // defpackage.aibi
    public final synchronized int x(fnt fntVar) {
        int i;
        List list = (List) this.a.get(0);
        int indexOf = list.indexOf(fntVar);
        if (indexOf < 0) {
            int indexOf2 = ((List) this.a.get(1)).indexOf(fntVar);
            if (indexOf2 < 0) {
                indexOf = Math.max(0, this.f + 1);
                b(indexOf, Collections.singleton(fntVar));
            } else {
                int i2 = indexOf2 + 1;
                i = 0;
                while (i < i2) {
                    int size = list.size();
                    if (size == 0) {
                        size = 0;
                    }
                    synchronized (this) {
                        ((List) this.a.get(0)).add(size, (fnt) ((List) this.a.get(1)).remove(0));
                        int i3 = this.f;
                        f(size, 1);
                        Iterator it = this.c.iterator();
                        while (it.hasNext()) {
                            ((aibf) it.next()).b(size);
                        }
                        e(i3);
                    }
                }
                indexOf = list.size() - 1;
            }
        }
        a(indexOf);
        return j();
        i++;
    }

    @Override // defpackage.aibi
    public final synchronized fnt y(int i, int i2) {
        return (fnt) ((List) this.a.get(i)).get(i2);
    }
}
