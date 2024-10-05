package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anis extends anhx {
    final /* synthetic */ aniu a;
    private final anfy b;

    public anis(aniu aniuVar, anfy anfyVar) {
        this.a = aniuVar;
        anfyVar.getClass();
        this.b = anfyVar;
    }

    @Override // defpackage.anhx
    public final /* bridge */ /* synthetic */ Object a() {
        anhy a = this.b.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.anhx
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.anhx
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.anhx
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.qK((anhy) obj);
    }

    @Override // defpackage.anhx
    public final boolean g() {
        return this.a.isDone();
    }
}
