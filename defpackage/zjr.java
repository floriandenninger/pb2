package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjr implements zju, ypd {
    public static final String a = zga.a("DP.InfoProvider");
    public final ysy b;
    public zjp c;
    private final Executor d;
    private zjt e;
    private final azrw f;
    private final aaea g;
    private final TelephonyManager h;
    private final zjo i;

    public zjr(ysy ysyVar, Executor executor, azrw azrwVar, aaea aaeaVar, Context context, zjo zjoVar) {
        this.b = ysyVar;
        this.d = executor;
        this.f = azrwVar;
        this.g = aaeaVar;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        telephonyManager.getClass();
        this.h = telephonyManager;
        this.i = zjoVar;
    }

    @Override // defpackage.zju
    public final zjp a() {
        return this.c;
    }

    public final void b(String str) {
        atwh atwhVar;
        String simOperator = this.h.getSimState() == 5 ? this.h.getSimOperator() : null;
        if (simOperator != null) {
            if (this.g.a() != null) {
                atcl atclVar = this.g.a().i;
                if (atclVar == null) {
                    atclVar = atcl.a;
                }
                atwhVar = atclVar.l;
                if (atwhVar == null) {
                    atwhVar = atwh.a;
                }
            } else {
                atwhVar = atwh.a;
            }
            Iterator it = atwhVar.b.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((atwf) it.next()).b.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).equals(simOperator)) {
                        if (this.e == null) {
                            this.e = (zjt) this.f.get();
                        }
                        zjn zjnVar = new zjn(this.i, simOperator);
                        zjt zjtVar = this.e;
                        rlr rlrVar = new rlr();
                        MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest = rlrVar.a;
                        mdpCarrierPlanIdRequest.a = "AIzaSyDHQ9ipnphqTzDqZsbtd8_Ru4_kiKVQe2k";
                        if (str != null) {
                            if (mdpCarrierPlanIdRequest.b == null) {
                                mdpCarrierPlanIdRequest.b = new Bundle();
                            }
                            rlrVar.a.b.putString("cpid_to_be_invalidated", str);
                        }
                        anaf.Y(rwh.Y(zjtVar.b.a(rlrVar.a).b(zjtVar.a, qxc.c)), new zjq(this, zjnVar), this.d);
                        return;
                    }
                }
            }
        }
        this.c = null;
    }

    @Override // defpackage.zju
    public final void c(String str) {
        b(str);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{yro.class};
        }
        if (i == 0) {
            if (((yro) obj).a() && this.b.m()) {
                b(null);
                return null;
            }
            this.c = null;
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
