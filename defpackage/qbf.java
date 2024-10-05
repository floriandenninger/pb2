package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qbf extends Thread {
    final /* synthetic */ String a;

    public qbf(String str) {
        this.a = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        qar.f(this.a);
    }
}
