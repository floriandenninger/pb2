package defpackage;

import android.util.Log;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxe implements aaha {
    private final gxd a;

    public gxe(gxd gxdVar) {
        this.a = gxdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (!apxfVar.pY(aqur.b)) {
            throw new aahm();
        }
        aqur aqurVar = (aqur) apxfVar.pX(aqur.b);
        final gxd gxdVar = this.a;
        final String str = aqurVar.c;
        if (gxdVar.a.a() != 3) {
            Runnable runnable = new Runnable() { // from class: gxb
                @Override // java.lang.Runnable
                public final void run() {
                    gxd.this.b(str);
                }
            };
            if (gxdVar.a.a() == 3) {
                return;
            }
            sft sftVar = gxdVar.a;
            aclt acltVar = new aclt(runnable, null);
            sft.b("connect");
            sft.b("maybeCancelDisconnectServiceTask");
            ammv ammvVar = sftVar.b;
            sftVar.d.e = acltVar;
            int a = sftVar.c.a();
            if (a == 2 || a == 3) {
                Log.w("AssistantIntegClient", "#connect(): calling connect when service is connected(ing).");
                return;
            }
            sftVar.f = null;
            ammv ammvVar2 = sftVar.d.d.a;
            sgu sguVar = (sgu) sftVar.e(sftVar.f()).build();
            sfp sfpVar = sftVar.c;
            ((amxh) ((amxh) sfp.a.e()).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "connect", 88, "AssistantConnector.java")).s("#connect with connector: %s", sfpVar.c);
            sfpVar.d = anfq.h(sfpVar.c, new sfm(sguVar, 1), angq.a);
            sfp.b("connect", sfpVar.d);
            return;
        }
        gxdVar.b(str);
    }
}
