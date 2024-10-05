package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevg implements aekh {
    private final aekh a;
    private final aezf b;
    private final aeut c;

    public aevg(aekh aekhVar, aezf aezfVar, aeut aeutVar) {
        this.a = aekhVar;
        this.b = aezfVar;
        this.c = aeutVar;
    }

    @Override // defpackage.aekh
    public final void a(aelu aeluVar, int i) {
        this.a.a(aeluVar, i);
        if (i - 1 != 1) {
            this.b.p(Integer.valueOf(aeluVar.d));
            this.c.aa();
        } else {
            this.b.q(Integer.valueOf(aeluVar.d));
            this.c.aa();
        }
    }
}
