package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adlv implements Runnable {
    final /* synthetic */ adlw a;
    private final adlm b;

    public adlv(adlw adlwVar, adlm adlmVar) {
        this.a = adlwVar;
        this.b = adlmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long a = this.a.a.a();
        if (a == -1 || a > 300000) {
            return;
        }
        this.b.I();
    }
}
