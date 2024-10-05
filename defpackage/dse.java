package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dse implements dhs {
    final /* synthetic */ dqx a;
    final /* synthetic */ dsx b;

    public dse(dsx dsxVar, dqx dqxVar) {
        this.b = dsxVar;
        this.a = dqxVar;
    }

    @Override // defpackage.dhs
    public final void a(int i, int i2) {
        int i3;
        if (this.a.a() == i2) {
            return;
        }
        this.a.m(i2);
        dsx dsxVar = this.b;
        if (dsxVar.x == null) {
            i3 = -1;
        } else if (dsxVar.H.h() == 0) {
            i3 = dsxVar.x.b;
        } else {
            i3 = dsxVar.x.a;
        }
        if (i3 == -1 || this.a.a() > i3) {
            synchronized (this.b) {
                dsx dsxVar2 = this.b;
                if (dsxVar2.x != null && !dsxVar2.k) {
                    int size = dsxVar2.b.size();
                    int i4 = 0;
                    for (int i5 = 0; i5 < size; i5++) {
                        int a = ((dqx) dsxVar2.b.get(i5)).a();
                        if (a > i4) {
                            i4 = a;
                        }
                    }
                    if (i4 != dsxVar2.x.b) {
                        int max = Math.max(dsxVar2.H.a(View.MeasureSpec.getSize(dsxVar2.r), View.MeasureSpec.getSize(dsxVar2.s), i, i4), 1);
                        dsxVar2.x.b = i4;
                        dsxVar2.w = max;
                    }
                }
                this.b.J();
            }
        }
    }
}
