package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angc implements Callable {
    final /* synthetic */ angk a;
    final /* synthetic */ vht b;

    public angc(angk angkVar, vht vhtVar) {
        this.a = angkVar;
        this.b = vhtVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        vht vhtVar = this.b;
        angi angiVar = this.a.b.a;
        Closeable[] closeableArr = vhtVar.a;
        for (int i = 0; i <= 0; i++) {
            angiVar.a(closeableArr[i], angq.a);
        }
        return null;
    }

    public final String toString() {
        return this.b.toString();
    }
}
