package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vhn implements Callable {
    volatile boolean a;
    final /* synthetic */ vip b;
    final /* synthetic */ viq c;
    final /* synthetic */ vhp d;

    public vhn(vhp vhpVar, vip vipVar, viq viqVar) {
        this.d = vhpVar;
        this.b = vipVar;
        this.c = viqVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        amkq.O(!this.d.a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.d.a.beginTransactionWithListener(new vhm(this));
        try {
            this.a = true;
            Object a = this.b.a(this.c);
            viq.c();
            this.d.a.setTransactionSuccessful();
            this.a = false;
            return a;
        } finally {
            this.d.a.endTransaction();
        }
    }
}
