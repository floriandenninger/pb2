package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lsl implements fxi {
    final /* synthetic */ boolean a;
    final /* synthetic */ lsn b;
    private final /* synthetic */ int c;

    public lsl(lsn lsnVar, boolean z, int i) {
        this.c = i;
        this.b = lsnVar;
        this.a = z;
    }

    @Override // defpackage.fxi
    public final void a() {
        if (this.c == 0) {
            this.b.b.c();
        } else {
            lsn lsnVar = this.b;
            lsnVar.d.removeCaptioningChangeListener(lsnVar.c);
        }
    }

    @Override // defpackage.fxi
    public final void b() {
        if (this.c == 0) {
            this.b.c();
            if (this.a) {
                return;
            }
            this.b.d();
            return;
        }
        lsn lsnVar = this.b;
        lsnVar.d.addCaptioningChangeListener(lsnVar.c);
        if (this.a) {
            return;
        }
        this.b.d();
    }
}
