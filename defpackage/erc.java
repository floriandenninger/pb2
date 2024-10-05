package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class erc implements zfi {
    public final /* synthetic */ eru a;
    private final /* synthetic */ int b;

    public /* synthetic */ erc(eru eruVar, int i) {
        this.b = i;
        this.a = eruVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            eru eruVar = this.a;
            eruVar.al.b(eruVar.d.b((Throwable) obj), true);
            return;
        }
        if (i == 1) {
            eru eruVar2 = this.a;
            eruVar2.a = (ammv) obj;
            eruVar2.s();
            eruVar2.al.a();
            return;
        }
        this.a.d.e((Throwable) obj);
    }
}
