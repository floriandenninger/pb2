package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbl implements aekh {
    public final aeiw a;
    public final aeiw b;

    public afbl(aeiw aeiwVar, aeiw aeiwVar2) {
        afki.a(aeiwVar);
        this.a = aeiwVar;
        afki.a(aeiwVar2);
        this.b = aeiwVar2;
    }

    @Override // defpackage.aekh
    public final void a(aelu aeluVar, int i) {
        if (i - 1 != 0) {
            this.a.m(aeluVar.d, aeluVar.e, aeluVar.j, aeluVar.b);
        } else {
            this.b.m(aeluVar.d, aeluVar.e, aeluVar.j, aeluVar.b);
        }
    }
}
