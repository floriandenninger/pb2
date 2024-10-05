package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyc implements wyi, wof {
    final ajun a = new ajun((short[]) null);
    private final azrw b;
    private final zez c;
    private String d;
    private boolean e;

    public wyc(azrw azrwVar, zez zezVar) {
        this.b = azrwVar;
        this.c = zezVar;
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final void h(int i, String str) {
        if (!TextUtils.equals(this.d, str)) {
            this.d = str;
            this.e = false;
        }
        if (i == 3 || i == 2 || i == 4) {
            ArrayList arrayList = new ArrayList();
            for (xgv xgvVar : this.a.w()) {
                xgx xgxVar = xgvVar.b;
                if (xgxVar instanceof xfi) {
                    xfi xfiVar = (xfi) xgxVar;
                    if (i == 3 && TextUtils.equals(xfiVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                } else if (xgxVar instanceof xfk) {
                    xfk xfkVar = (xfk) xgxVar;
                    if (i == 2 && this.e && TextUtils.equals(xfkVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                } else if (xgxVar instanceof xfj) {
                    xfj xfjVar = (xfj) xgxVar;
                    if (i == 2 && !this.e && TextUtils.equals(xfjVar.b, str)) {
                        if (xfjVar.a) {
                            if (this.c.a() > 0) {
                                arrayList.add(xgvVar);
                            }
                        } else {
                            arrayList.add(xgvVar);
                        }
                    }
                } else if (xgxVar instanceof xem) {
                    xem xemVar = (xem) xgxVar;
                    if (i == 4 && TextUtils.equals(xemVar.a, str)) {
                        arrayList.add(xgvVar);
                    }
                }
            }
            this.e = this.e || i == 2;
            if (arrayList.isEmpty()) {
                return;
            }
            ((wyh) this.b.get()).r(arrayList);
        }
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
        if (this.a.y(xgxVar.c())) {
            String str = xghVar.a;
            throw new wxf(str.length() != 0 ? "Tried to register duplicate trigger for slot: ".concat(str) : new String("Tried to register duplicate trigger for slot: "));
        }
        if ((xgxVar instanceof xfi) || (xgxVar instanceof xfk) || (xgxVar instanceof xfj) || (xgxVar instanceof xem)) {
            this.a.x(xgxVar.c(), new xgv(i, xgxVar, xghVar, xevVar));
            return;
        }
        String str2 = xghVar.a;
        String name = xgxVar.b().name();
        StringBuilder sb = new StringBuilder(str2.length() + 102 + String.valueOf(name).length());
        sb.append("Incorrect TriggerType: Tried to register trigger for slot: ");
        sb.append(str2);
        sb.append(" of type ");
        sb.append(name);
        sb.append(" in PlayerStateEventTriggerAdapter");
        throw new wxf(sb.toString());
    }
}
