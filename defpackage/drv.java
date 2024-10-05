package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class drv extends dlq {

    @dnt(a = 3)
    int a;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        if (dlpVar.a != 0) {
            return;
        }
        baql baqlVar = new baql();
        baqlVar.a = Integer.valueOf(this.a);
        dtd.k(((Integer) objArr[0]).intValue(), baqlVar);
        this.a = ((Integer) baqlVar.a).intValue();
    }
}
