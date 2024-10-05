package defpackage;

import com.facebook.yoga.YogaEdge;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ssy implements szp {
    public final /* synthetic */ dgy a;
    private final /* synthetic */ int b;

    public /* synthetic */ ssy(dgy dgyVar, int i) {
        this.b = i;
        this.a = dgyVar;
    }

    @Override // defpackage.szp
    public final void a(YogaEdge yogaEdge, aoak aoakVar) {
        int i = this.b;
        if (i == 0) {
            dgy dgyVar = this.a;
            int i2 = ssz.a;
            if (aoakVar.c() == 2) {
                float b = aoakVar.b() * 100.0f;
                dgv dgvVar = (dgv) dgyVar.c.C().C();
                dgvVar.a |= 4194304;
                if (dgvVar.A == null) {
                    dgvVar.A = new diu();
                }
                dgvVar.A.d(yogaEdge, b);
                return;
            }
            dgyVar.N(yogaEdge, dgyVar.b.a(aoakVar.b()));
            return;
        }
        if (i != 1) {
            dgy dgyVar2 = this.a;
            int i3 = ssz.a;
            if (aoakVar.c() == 2) {
                float b2 = aoakVar.b() * 100.0f;
                dgv dgvVar2 = (dgv) dgyVar2.c.C().C();
                dgvVar2.a |= 16777216;
                if (dgvVar2.z == null) {
                    dgvVar2.z = new diu();
                }
                dgvVar2.z.d(yogaEdge, b2);
                return;
            }
            dgyVar2.z(yogaEdge, aoakVar.b());
            return;
        }
        dgy dgyVar3 = this.a;
        int i4 = ssz.a;
        if (aoakVar.c() == 2) {
            float b3 = aoakVar.b() * 100.0f;
            dgv dgvVar3 = (dgv) dgyVar3.c.C().C();
            dgvVar3.a |= 67108864;
            if (dgvVar3.x == null) {
                dgvVar3.x = new diu();
            }
            dgvVar3.x.d(yogaEdge, b3);
            return;
        }
        dgyVar3.n(yogaEdge, aoakVar.b());
    }
}
