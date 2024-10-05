package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vbm implements vbn {
    private final /* synthetic */ int a;

    public vbm(int i) {
        this.a = i;
    }

    @Override // defpackage.vbn
    public final void a(vca vcaVar) {
        int i = this.a;
        if (i == 0) {
            if (vcaVar instanceof vau) {
                ((vau) vcaVar).a();
            }
        } else if (i == 1) {
            if (vcaVar instanceof vbd) {
                ((vbd) vcaVar).a();
            }
        } else if (i != 2) {
            if (vcaVar instanceof vyi) {
                ((vyi) vcaVar).d();
            }
        } else if (vcaVar instanceof vby) {
            ((vby) vcaVar).a();
        }
    }
}
