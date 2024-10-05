package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amjg implements Callable {
    final /* synthetic */ amir a;
    final /* synthetic */ Callable b;

    public amjg(amir amirVar, Callable callable) {
        this.a = amirVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        amir e = amjw.e(this.a);
        try {
            return this.b.call();
        } finally {
            amjw.e(e);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("propagating=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
