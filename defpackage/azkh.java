package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azkh implements Runnable {
    final /* synthetic */ azki a;
    private final azkg b;

    public azkh(azki azkiVar, azkg azkgVar) {
        this.a = azkiVar;
        this.b = azkgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.aE(this.b);
    }
}
