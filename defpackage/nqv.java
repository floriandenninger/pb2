package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nqv extends yzr {
    final /* synthetic */ nqw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqv(nqw nqwVar) {
        super(nqwVar.h);
        this.a = nqwVar;
    }

    @Override // defpackage.yzr
    public final void a(boolean z, boolean z2) {
        aswb aswbVar = this.a.f.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.f & 2048) != 0) {
            long j = aswbVar.av;
            this.e = j;
            this.d = j;
        } else {
            this.e = yzr.g(this.b.getResources());
            this.d = yzr.g(this.b.getResources());
        }
        super.a(z, z2);
    }
}
