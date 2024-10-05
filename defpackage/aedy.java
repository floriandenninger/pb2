package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aedy extends Thread {
    final /* synthetic */ aedz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aedy(aedz aedzVar) {
        super("mediaDash");
        this.a = aedzVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Looper.prepare();
        this.a.c();
        Looper.loop();
    }
}
