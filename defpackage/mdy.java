package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mdy implements mcn {
    public final /* synthetic */ mec a;
    private final /* synthetic */ int b;

    public /* synthetic */ mdy(mec mecVar, int i) {
        this.b = i;
        this.a = mecVar;
    }

    @Override // defpackage.mcn
    public final void a() {
        if (this.b != 0) {
            this.a.g = fzt.a;
            return;
        }
        mec mecVar = this.a;
        if (mecVar.h == null) {
            return;
        }
        mecVar.h = null;
        mecVar.g = fzt.c;
        mecVar.l();
    }
}
