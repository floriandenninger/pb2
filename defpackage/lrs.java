package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lrs implements akbl {
    final /* synthetic */ acra a;
    final /* synthetic */ byte[] b;
    private final /* synthetic */ int c;

    public lrs(acra acraVar, byte[] bArr, int i) {
        this.c = i;
        this.a = acraVar;
        this.b = bArr;
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void li(Object obj, int i) {
        if (this.c != 0) {
        }
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void lj(Object obj) {
        if (this.c == 0) {
            this.a.D(new acqx(this.b));
            this.a.u(new acqx(this.b), null);
        } else {
            this.a.D(new acqx(this.b));
            this.a.u(new acqx(this.b), null);
        }
    }
}
