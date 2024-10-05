package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wya implements wyi, wof {
    public String a;
    final ajun b = new ajun((short[]) null);
    private final azrw c;

    public wya(azrw azrwVar) {
        this.c = azrwVar;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.b.v(xgxVar.c());
    }

    @Override // defpackage.wof
    public final void qp(afih afihVar) {
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.b.w()) {
            xfr xfrVar = (xfr) xgvVar.b;
            xfrVar.f();
            if (afihVar.n() && TextUtils.equals(xfrVar.a(), this.a)) {
                arrayList.add(new xgv(xgvVar, xcp.b(new xct(xbm.d(afihVar)))));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.c.get()).r(arrayList);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final void qw(String str, int i) {
        this.a = str;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.b.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xfr)) {
            String name = xgxVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 80);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in PlaybackErrorTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.b.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
