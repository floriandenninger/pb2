package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajme extends ajlv {
    private final ajmd b;

    public ajme(ajjz ajjzVar, ajzi ajziVar, int i, int i2, int i3, boolean z, boolean z2, aksl akslVar, acsy acsyVar) {
        super(ajjzVar, ajziVar, i, i2, i3, z, z2, akslVar);
        asmn asmnVar;
        if (i == 2) {
            asmnVar = asmn.LATENCY_ACTION_SEARCH_THUMBNAILS;
        } else {
            asmnVar = asmn.LATENCY_ACTION_FIRST_THUMBNAIL_LOAD;
        }
        this.b = new ajmd(ajjzVar, ajziVar, akslVar, i, i2, i3, z, z2, acsyVar.d(asmnVar));
    }

    @Override // defpackage.ajlv
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.ajlv
    public final void b(ajmo ajmoVar) {
        this.b.b(ajmoVar);
    }

    @Override // defpackage.ajlv
    public final void c(ajmp ajmpVar) {
        this.b.c(ajmpVar);
    }

    @Override // defpackage.ajlv
    public final void h(ajmq ajmqVar) {
        this.b.h(ajmqVar);
    }

    @Override // defpackage.ajlv
    public final void i(ajmr ajmrVar) {
        this.b.i(ajmrVar);
    }

    @Override // defpackage.ajlv
    public final void j() {
        this.b.j();
    }
}
