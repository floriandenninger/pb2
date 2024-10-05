package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qqg implements Runnable {
    final /* synthetic */ LifecycleCallback a;
    final /* synthetic */ String b;
    final /* synthetic */ qqh c;

    public qqg(qqh qqhVar, LifecycleCallback lifecycleCallback, String str) {
        this.c = qqhVar;
        this.a = lifecycleCallback;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qqh qqhVar = this.c;
        if (qqhVar.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = qqhVar.c;
            lifecycleCallback.e(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.i();
        }
        if (this.c.b >= 3) {
            this.a.k();
        }
        if (this.c.b >= 4) {
            this.a.j();
        }
        if (this.c.b >= 5) {
            this.a.n();
        }
    }
}
