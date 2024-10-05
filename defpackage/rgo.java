package defpackage;

import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgo implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ rgr a;
    private final String b;

    public rgo(rgr rgrVar, String str) {
        this.a = rgrVar;
        this.b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.a.aF().c.b(this.b, th);
    }
}
