package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fki implements zdj {
    final /* synthetic */ azrw a;
    final /* synthetic */ azrw b;

    public fki(azrw azrwVar, azrw azrwVar2) {
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        return ((fka) this.a.get()).b(((afsy) this.b.get()).c().b());
    }

    @Override // defpackage.zdj
    public final /* bridge */ /* synthetic */ anhy b(Object obj) {
        return ((fka) this.a.get()).e(((afsy) this.b.get()).c().b(), ((Boolean) obj).booleanValue());
    }
}
