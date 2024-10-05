package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sqk extends dlq {

    @dnt(a = 13)
    Boolean a;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        if (dlpVar.a != 0) {
            return;
        }
        baql baqlVar = new baql();
        baqlVar.a = this.a;
        Boolean bool = (Boolean) baqlVar.a;
        boolean z = false;
        if (bool != null && !bool.booleanValue()) {
            z = true;
        }
        baqlVar.a = Boolean.valueOf(z);
        this.a = (Boolean) baqlVar.a;
    }
}
