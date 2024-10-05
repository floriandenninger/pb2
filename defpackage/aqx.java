package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aqx extends aqu {
    final /* synthetic */ arm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqx(arm armVar) {
        super(armVar);
        this.e = armVar;
    }

    @Override // defpackage.aqu, defpackage.aqq
    public void b() {
        this.b = new aqw(this, this.e);
        this.b.onCreate();
    }
}
