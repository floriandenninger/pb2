package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abi implements Runnable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ abs b;

    public abi(abs absVar, CharSequence charSequence) {
        this.b = absVar;
        this.a = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.r().c(this.a);
    }
}
