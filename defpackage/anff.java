package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anff implements Runnable {
    final anfm a;
    final anhy b;

    public anff(anfm anfmVar, anhy anhyVar) {
        this.a = anfmVar;
        this.b = anhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anfm anfmVar = this.a;
        boolean z = anfm.g;
        if (anfmVar.value != this) {
            return;
        }
        if (anfm.h.d(this.a, this, anfm.j(this.b))) {
            anfm.l(this.a);
        }
    }
}
