package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnh extends dop {
    private final dng e;
    private final dlf f = new dlf();

    public dnh(dlf dlfVar, dng dngVar) {
        b(dlfVar);
        this.e = dngVar;
    }

    private static Object i(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    @Override // defpackage.dop
    public final float a(long j) {
        if (d() <= 1) {
            Map map = this.a;
            boolean containsKey = map == null ? false : map.containsKey("default_input");
            Object i = i((WeakReference) this.f.d());
            if (i == null) {
                return containsKey ? e().c : this.c;
            }
            if (!containsKey) {
                return this.e.a(i);
            }
            float f = e().c;
            c(f);
            return f;
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }

    public final void b(dlf dlfVar) {
        dlf dlfVar2 = this.f;
        for (int i = 0; i < 5; i++) {
            dlfVar2.a[i] = null;
        }
        dlfVar2.b = (short) 0;
        if (dlfVar == null) {
            return;
        }
        short s = dlfVar.b;
        for (int i2 = 0; i2 < s; i2++) {
            this.f.e(dlfVar.a(i2), new WeakReference(dlfVar.c(i2)));
        }
    }

    public final void c(float f) {
        short s = this.f.b;
        for (int i = 0; i < s; i++) {
            Object i2 = i((WeakReference) this.f.c(i));
            if (i2 != null) {
                this.e.d(i2, f);
            }
        }
    }
}
