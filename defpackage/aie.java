package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aie {
    final ComponentName c;
    boolean d;
    int e;

    public aie(ComponentName componentName) {
        this.c = componentName;
    }

    public abstract void a(Intent intent);

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        if (!this.d) {
            this.d = true;
            this.e = i;
        } else {
            if (this.e == i) {
                return;
            }
            throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.e);
        }
    }
}
