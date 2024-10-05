package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abqi implements Runnable {
    final /* synthetic */ abqk a;

    public abqi(abqk abqkVar) {
        this.a = abqkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abqk abqkVar = this.a;
        acao acaoVar = abqkVar.a;
        if (acaoVar != null) {
            acaoVar.f(abqkVar);
        }
    }
}
