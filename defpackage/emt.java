package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class emt implements ajjy {
    volatile int a = 0;
    private final aadw b;

    public emt(aadw aadwVar) {
        this.b = aadwVar;
    }

    static final avgf h(avgg avggVar) {
        if (avggVar.c.size() > 0) {
            return (avgf) avggVar.c.get(0);
        }
        return null;
    }

    public abstract void a();

    public abstract boolean b();

    final void c(ImageView imageView) {
        if (this.a == System.identityHashCode(imageView)) {
            a();
        }
    }

    @Override // defpackage.ajjy
    public final void d(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        c(imageView);
    }

    @Override // defpackage.ajjy
    public final void e(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        c(imageView);
    }

    @Override // defpackage.ajjy
    public final void f(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        avgf h;
        if (this.a != 0 || h(avggVar) == null || (h = h(avggVar)) == null) {
            return;
        }
        int ak = evr.ak(this.b);
        if ((h.d >= ak || imageView.getWidth() >= ak) && b()) {
            this.a = System.identityHashCode(imageView);
        }
    }

    @Override // defpackage.ajjy
    public final void g(ImageView imageView, ajjv ajjvVar, avgg avggVar) {
        c(imageView);
    }
}
