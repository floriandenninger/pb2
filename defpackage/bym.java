package defpackage;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bym {
    public final Executor a;
    public final Executor b;
    public final bzm c;
    public final bzf d;
    public final String e;
    public final int f;
    public final int g;
    public final abd h;

    public bym(byk bykVar) {
        Executor executor = bykVar.a;
        if (executor == null) {
            this.a = b(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = bykVar.c;
        if (executor2 == null) {
            this.b = b(true);
        } else {
            this.b = executor2;
        }
        bzm bzmVar = bykVar.b;
        if (bzmVar == null) {
            this.c = bzm.c();
        } else {
            this.c = bzmVar;
        }
        this.h = new abd();
        bzf bzfVar = bykVar.d;
        this.d = bzfVar == null ? new bzn() : bzfVar;
        this.f = bykVar.e;
        this.g = Integer.MAX_VALUE;
        this.e = null;
    }

    public static final int a() {
        return Build.VERSION.SDK_INT == 23 ? 10 : 20;
    }

    private static final Executor b(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new byj(z));
    }
}
