package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abl implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ abs c;

    public abl(abs absVar, int i, CharSequence charSequence) {
        this.c = absVar;
        this.a = i;
        this.b = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.o(this.a, this.b);
    }
}
