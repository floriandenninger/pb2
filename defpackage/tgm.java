package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tgm implements tgs {
    final /* synthetic */ boolean a;

    public tgm(boolean z) {
        this.a = z;
    }

    @Override // defpackage.tgs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(tgb tgbVar) {
        tgt tgtVar = tgbVar.a;
        tgtVar.l(this);
        boolean z = false;
        if (this.a && tgtVar.m()) {
            z = true;
        }
        if (z) {
            tgtVar.h();
        }
        tgbVar.e();
        if (z) {
            tgtVar.g();
        }
    }
}
