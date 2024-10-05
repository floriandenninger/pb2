package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnt implements Runnable {
    final /* synthetic */ bof a;

    public bnt(bof bofVar) {
        this.a = bofVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bof bofVar = this.a;
        bofVar.nb(true);
        bofVar.o.requestLayout();
        bofVar.o.getViewTreeObserver().addOnGlobalLayoutListener(new bns(bofVar));
    }
}
