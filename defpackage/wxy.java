package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxy implements wyi, wof {
    final ajun a = new ajun((short[]) null);
    private final azrw b;
    private String c;

    public wxy(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        if (!aignVar.a(aign.INTERSTITIAL_PLAYING, aign.VIDEO_PLAYING)) {
            this.c = "";
            return;
        }
        if (aignVar != aign.VIDEO_PLAYING) {
            str = str2;
        }
        this.c = str;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wyi
    public final void qA(xgx xgxVar) {
        this.a.v(xgxVar.c());
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final void qq(String str) {
        if (TextUtils.equals(str, this.c)) {
            ArrayList arrayList = new ArrayList();
            for (xgv xgvVar : this.a.w()) {
                if (TextUtils.equals(((xfh) xgvVar.b).a, str)) {
                    arrayList.add(xgvVar);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ((wyh) this.b.get()).r(arrayList);
        }
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qs(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }

    @Override // defpackage.wyi
    public final void qz(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        if (this.a.y(xgxVar.c())) {
            String valueOf = String.valueOf(xgxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wxf(sb.toString());
        }
        if (!(xgxVar instanceof xfh)) {
            String name = xgxVar.b().name();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 87);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(name);
            sb2.append(" in NonTerminalAbandonedTriggerAdapter");
            throw new wxf(sb2.toString());
        }
        this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
    }
}
