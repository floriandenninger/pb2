package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bh implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ en b;

    public bh(List list, en enVar) {
        this.a = list;
        this.b = enVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.contains(this.b)) {
            this.a.remove(this.b);
            eo.f(this.b);
        }
    }
}
