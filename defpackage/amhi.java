package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class amhi implements amis {
    public final /* synthetic */ amhn a;
    private final /* synthetic */ int b;

    public /* synthetic */ amhi(amhn amhnVar, int i) {
        this.b = i;
        this.a = amhnVar;
    }

    @Override // defpackage.amis, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i == 0) {
            amhn amhnVar = this.a;
            amhnVar.o();
            amhnVar.m();
            amhnVar.a = null;
            return;
        }
        if (i == 1) {
            amhn amhnVar2 = this.a;
            amhnVar2.o();
            amhnVar2.m();
        } else {
            if (i != 2) {
                this.a.o();
                return;
            }
            amhn amhnVar3 = this.a;
            amhnVar3.a = null;
            amjw.e(amhnVar3.b);
            amhnVar3.b = null;
        }
    }
}
