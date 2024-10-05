package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class allq {
    final WeakReference a;
    int b;
    boolean c;

    public allq(int i, allg allgVar, byte[] bArr, byte[] bArr2) {
        this.a = new WeakReference(allgVar);
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(allg allgVar) {
        return allgVar != null && this.a.get() == allgVar;
    }
}
