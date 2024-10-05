package defpackage;

import android.widget.ImageView;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkc implements ajjy {
    private Set a;

    public final synchronized void a(ajjy ajjyVar) {
        if (this.a == null) {
            this.a = new CopyOnWriteArraySet();
        }
        this.a.add(ajjyVar);
    }

    public final synchronized void b(ajjy ajjyVar) {
        Set set = this.a;
        if (set != null) {
            set.remove(ajjyVar);
        }
    }

    public final synchronized boolean c() {
        boolean z;
        Set set = this.a;
        if (set != null) {
            z = set.isEmpty();
        }
        return z;
    }

    @Override // defpackage.ajjy
    public final synchronized void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        if (c()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajjy) it.next()).d(imageView, ajjvVar, avggVar);
        }
    }

    @Override // defpackage.ajjy
    public final synchronized void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        if (c()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajjy) it.next()).e(imageView, ajjvVar, avggVar);
        }
    }

    @Override // defpackage.ajjy
    public final synchronized void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        if (c()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajjy) it.next()).f(imageView, ajjvVar, avggVar);
        }
    }

    @Override // defpackage.ajjy
    public final synchronized void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        if (c()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajjy) it.next()).g(imageView, ajjvVar, avggVar);
        }
    }
}
