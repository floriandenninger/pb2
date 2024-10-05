package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgs extends azz {
    public final int b;
    public final boolean c;

    public bgs(Throwable th, baa baaVar, Surface surface) {
        super(th, baaVar);
        this.b = System.identityHashCode(surface);
        boolean z = true;
        if (surface != null && !surface.isValid()) {
            z = false;
        }
        this.c = z;
    }
}
