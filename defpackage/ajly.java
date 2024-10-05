package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajly extends ajlv {
    private final int b;
    private final ypa c;

    public ajly(ajjz ajjzVar, ajzi ajziVar, int i, int i2, int i3, boolean z, boolean z2, aksl akslVar, ypa ypaVar) {
        super(ajjzVar, ajziVar, i, i2, i3, z, z2, akslVar);
        this.b = i;
        this.c = ypaVar;
    }

    private final void m(ynz ynzVar) {
        this.c.d(ynzVar);
    }

    @Override // defpackage.ajlv
    public final void b(ajmo ajmoVar) {
        m(ajmoVar);
    }

    @Override // defpackage.ajlv
    public final void c(ajmp ajmpVar) {
        m(ajmpVar);
    }

    @Override // defpackage.ajlv
    public final void h(ajmq ajmqVar) {
        m(ajmqVar);
    }

    @Override // defpackage.ajlv
    public final void i(ajmr ajmrVar) {
        m(ajmrVar);
    }

    @Override // defpackage.ajlv
    public final void a() {
        m(this.b != 2 ? new ajmm() : new ajmk());
    }

    @Override // defpackage.ajlv
    public final void j() {
        m(this.b != 2 ? new ajmn() : new ajml());
    }
}
