package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class py {
    kb b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final kc f = new px(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ka) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void b() {
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ka kaVar = (ka) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                kaVar.d(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null) {
                kaVar.e(interpolator);
            }
            if (this.b != null) {
                kaVar.f(this.f);
            }
            kaVar.b();
        }
        this.c = true;
    }

    public final void c(ka kaVar) {
        if (this.c) {
            return;
        }
        this.a.add(kaVar);
    }

    public final void d() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void e(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void f(kb kbVar) {
        if (this.c) {
            return;
        }
        this.b = kbVar;
    }
}
