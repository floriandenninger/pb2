package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uf implements Runnable {
    final /* synthetic */ ug a;

    public uf(ug ugVar) {
        this.a = ugVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ug ugVar = this.a;
        ugVar.b = null;
        ugVar.drawableStateChanged();
    }
}
