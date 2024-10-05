package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class coo implements Runnable {
    final /* synthetic */ cor a;

    public coo(cor corVar) {
        this.a = corVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cor corVar = this.a;
        corVar.c.a(corVar);
    }
}
