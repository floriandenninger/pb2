package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbq extends afbf {
    final /* synthetic */ afbs b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afbq(afbs afbsVar) {
        super(afbsVar);
        this.b = afbsVar;
    }

    @Override // defpackage.afbf, defpackage.ozj
    public final void b(int i, IOException iOException) {
        super.b(i, iOException);
        aquz aquzVar = this.b.x.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (aquzVar.ad && (iOException instanceof atp) && ((atp) iOException).d == 500) {
            int i2 = this.c + 1;
            this.c = i2;
            aquz aquzVar2 = this.b.x.c.e;
            if (aquzVar2 == null) {
                aquzVar2 = aquz.b;
            }
            if (i2 > aquzVar2.af) {
                afbs afbsVar = this.b;
                afbsVar.r.k(afbsVar.s, 2, null);
            }
        }
    }

    @Override // defpackage.afbf, defpackage.ozj
    public final void e() {
        this.c = 0;
    }
}
