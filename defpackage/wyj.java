package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyj implements wyi, wof {
    final ajun a = new ajun((short[]) null);
    private final azrw b;
    private final azrw c;
    private PlayerResponseModel d;
    private aign e;
    private String f;

    public wyj(azrw azrwVar, azrw azrwVar2) {
        this.b = azrwVar;
        this.c = azrwVar2;
    }

    private final boolean i(xgh xghVar, boolean z) {
        if (this.e != aign.NEW) {
            return false;
        }
        return (z && ((wxc) this.c.get()).h().contains(xghVar.a)) ? false : true;
    }

    @Override // defpackage.wof
    public final void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
        this.f = str;
        this.e = aignVar;
        this.d = playerResponseModel;
        ArrayList arrayList = new ArrayList();
        for (xgv xgvVar : this.a.w()) {
            xgx xgxVar = xgvVar.b;
            if (xgxVar instanceof xfs) {
                xfs xfsVar = (xfs) xgxVar;
                String str3 = xfsVar.a;
                if (i(xgvVar.c, xfsVar.b)) {
                    arrayList.add(xgvVar);
                }
            } else if (xgxVar instanceof xfq) {
                xfq xfqVar = (xfq) xgxVar;
                if (this.e == aign.PLAYBACK_LOADED && this.d != null && !TextUtils.equals(xfqVar.a(), this.d.y())) {
                    arrayList.add(xgvVar);
                }
            } else if ((xgxVar instanceof xco) && this.e == aign.PLAYBACK_LOADED && TextUtils.equals(this.f, ((xco) xgvVar.b).a)) {
                arrayList.add(xgvVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((wyh) this.b.get()).r(arrayList);
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
    public final /* synthetic */ void qq(String str) {
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
        boolean z;
        if (this.a.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        boolean z2 = xgxVar instanceof xfs;
        if (z2 || (xgxVar instanceof xfq) || (xgxVar instanceof xco)) {
            this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            if (this.e == null) {
                return;
            }
            if (z2) {
                xfs xfsVar = (xfs) xgxVar;
                String str2 = xfsVar.a;
                z = i(xghVar, xfsVar.b);
            } else {
                z = false;
            }
            if (((xgxVar instanceof xco) && TextUtils.equals(this.f, ((xco) xgxVar).a) && this.e != aign.NEW) || z) {
                ((wyh) this.b.get()).r(Arrays.asList(this.a.u(xgxVar.c())));
                return;
            }
            return;
        }
        String str3 = xghVar.a;
        String valueOf = String.valueOf(xgxVar.b());
        StringBuilder sb = new StringBuilder(str3.length() + 107 + String.valueOf(valueOf).length());
        sb.append("Incorrect TriggerType: Tried to register entry trigger for slot: ");
        sb.append(str3);
        sb.append(" of type ");
        sb.append(valueOf);
        sb.append(" in VideoStageEventTriggerAdapter");
        throw new wxf(sb.toString());
    }
}
