package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adth implements akbl {
    final /* synthetic */ acrb a;
    final /* synthetic */ adti b;

    public adth(adti adtiVar, acrb acrbVar) {
        this.b = adtiVar;
        this.a = acrbVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.b.d = null;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        akcb akcbVar = (akcb) obj;
        if (this.a != null) {
            this.b.c.mM().n(new acqx(this.a));
        }
        this.b.d = akcbVar;
    }
}
