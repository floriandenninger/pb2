package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cot implements Callable {
    final /* synthetic */ coy a;

    public cot(coy coyVar) {
        this.a = coyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        synchronized (this.a) {
            coy coyVar = this.a;
            if (coyVar.f == null) {
                return null;
            }
            coyVar.g();
            if (this.a.h()) {
                this.a.e();
                this.a.h = 0;
            }
            return null;
        }
    }
}
