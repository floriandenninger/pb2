package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yka extends ykv {
    private final azrw a;
    private final azrw c;
    private final azrw d;
    private final azrw e;
    private final azrw f;
    private final azrw g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final Executor k;

    public yka(Executor executor, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6, azrw azrwVar7, azrw azrwVar8, azrw azrwVar9) {
        this.k = executor;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
        this.e = azrwVar4;
        this.f = azrwVar5;
        this.g = azrwVar6;
        this.h = azrwVar7;
        this.i = azrwVar8;
        this.j = azrwVar9;
    }

    @Override // defpackage.ykv
    protected final void a() {
        boolean z = ((ansv) this.j.get()).a;
        this.c.get();
        yzi yziVar = (yzi) this.d.get();
        yziVar.c.schedule(new yzh(yziVar, 1), 10000L, TimeUnit.MILLISECONDS);
        ((ypa) this.h.get()).g((yzc) this.e.get());
        ynx ynxVar = (ynx) this.g.get();
        apdn apdnVar = ynxVar.a().d;
        if (apdnVar == null) {
            apdnVar = apdn.a;
        }
        if (apdnVar != null) {
            apdp apdpVar = apdnVar.c;
            if (apdpVar == null) {
                apdpVar = apdp.a;
            }
            if ((apdpVar.b & 1) != 0) {
                apdn apdnVar2 = ynxVar.a().d;
                if (apdnVar2 == null) {
                    apdnVar2 = apdn.a;
                }
                apdp apdpVar2 = apdnVar2.c;
                if (apdpVar2 == null) {
                    apdpVar2 = apdp.a;
                }
                apdx apdxVar = apdpVar2.c;
                if (apdxVar == null) {
                    apdxVar = apdx.a;
                }
                if (apdxVar.e) {
                    HttpsURLConnection.setDefaultSSLSocketFactory(new yte(HttpsURLConnection.getDefaultSSLSocketFactory()));
                }
            }
        }
        if (((Boolean) this.a.get()).booleanValue()) {
            ysc yscVar = (ysc) this.f.get();
            if (ynxVar.d().h) {
                yscVar.b((Executor) this.i.get());
            } else {
                yscVar.b(this.k);
            }
        }
    }
}
