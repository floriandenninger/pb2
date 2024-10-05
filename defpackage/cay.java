package defpackage;

import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cay implements Runnable {
    private final cbb a;
    private final Intent b;
    private final int c;

    public cay(cbb cbbVar, Intent intent, int i) {
        this.a = cbbVar;
        this.b = intent;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c);
    }
}
