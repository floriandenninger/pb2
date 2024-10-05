package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hlx implements zfi {
    public final /* synthetic */ hmc a;
    public final /* synthetic */ acra b;
    private final /* synthetic */ int c;

    public /* synthetic */ hlx(hmc hmcVar, acra acraVar, int i) {
        this.c = i;
        this.a = hmcVar;
        this.b = acraVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            hmc hmcVar = this.a;
            acra acraVar = this.b;
            if (Boolean.TRUE.equals((Boolean) obj)) {
                hmcVar.aN(R.string.shorts_permission_storage_open_settings_title, R.string.shorts_permission_storage_open_settings_description, acraVar);
                return;
            }
            return;
        }
        if (i != 1) {
            hmc hmcVar2 = this.a;
            acra acraVar2 = this.b;
            zxo a = zxo.a(hmcVar2, hmc.a);
            amru amruVar = hmc.a;
            amru amruVar2 = hmc.b;
            ci C = hmcVar2.C();
            boolean equals = Boolean.TRUE.equals((Boolean) obj);
            if (zxo.d(C, amruVar)) {
                amruVar2 = amru.q();
            } else if (equals) {
                amruVar2 = amru.q();
            }
            a.f(amruVar2);
            a.a = acraVar2;
            a.b = acsb.c(99787);
            a.d = new hlx(hmcVar2, acraVar2, 0);
            a.c();
            hmcVar2.as = a;
            ynm.o(hmcVar2, hmcVar2.ay.b(gbr.s, angq.a), ept.r, ept.s);
            return;
        }
        hmc hmcVar3 = this.a;
        acra acraVar3 = this.b;
        if (Boolean.TRUE.equals((Boolean) obj)) {
            hmcVar3.aN(R.string.shorts_permission_camera_open_settings_title, R.string.shorts_permission_camera_open_settings_description, acraVar3);
        }
    }
}
