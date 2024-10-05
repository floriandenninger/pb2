package defpackage;

import android.graphics.PathEffect;
import com.facebook.yoga.YogaEdge;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgq {
    public dlj b;
    private final PathEffect[] c = new PathEffect[2];
    public final dgr a = new dgr();

    public dgq(dhe dheVar) {
        this.b = dheVar.g;
    }

    public final void a() {
        if (this.b == null) {
            throw new IllegalStateException("This builder has already been disposed / built!");
        }
    }

    public final void b(YogaEdge yogaEdge, int i) {
        a();
        dgr.b(this.a.c, yogaEdge, i);
    }

    public final void c(int i, float f) {
        a();
        int a = this.b.a(f);
        a();
        this.a.a[i] = a;
    }
}
