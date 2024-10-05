package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsh implements duh {
    final /* synthetic */ dsx a;

    public dsh(dsx dsxVar) {
        this.a = dsxVar;
    }

    @Override // defpackage.duh
    public final void a(int i, int i2, int i3, int i4, int i5) {
        dsx dsxVar = this.a;
        dsxVar.u = i;
        dsxVar.v = i2;
        dsxVar.D.b = false;
        dsxVar.z();
        dsx dsxVar2 = this.a;
        int i6 = dsxVar2.w;
        if (i6 != -1) {
            int max = Math.max(i6, i2 - i);
            int i7 = (int) (max * dsxVar2.h);
            int min = Math.min(max + i + i7, dsxVar2.b.size() - 1);
            for (int max2 = Math.max(0, i - i7); max2 <= min; max2++) {
                ((dqx) dsxVar2.b.get(max2)).t(max2, i, i2);
            }
        }
    }
}
