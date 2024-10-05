package defpackage;

import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxd {
    public static final /* synthetic */ int b = 0;
    public final sft a;
    private final afsy c;
    private boolean d = false;
    private ammv e = amlr.a;

    static {
        zga.a("Assistant");
    }

    public gxd(sft sftVar, afsy afsyVar) {
        this.a = sftVar;
        this.c = afsyVar;
    }

    public final synchronized void a(boolean z, ammv ammvVar) {
        this.d = z;
        this.e = ammvVar;
    }

    public final void b(String str) {
        if (str == null) {
            sft sftVar = this.a;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            sftVar.c(sftVar.c.b);
            if (sftVar.c.a() != 3) {
                throw new IllegalStateException("Check connected state before use.");
            }
            sftVar.d();
            aone createBuilder = sgu.a.createBuilder();
            aone createBuilder2 = sgp.a.createBuilder();
            createBuilder2.copyOnWrite();
            sgp sgpVar = (sgp) createBuilder2.instance;
            sgpVar.b = 2 | sgpVar.b;
            sgpVar.d = elapsedRealtimeNanos;
            sgp sgpVar2 = (sgp) createBuilder2.build();
            createBuilder.copyOnWrite();
            sgu sguVar = (sgu) createBuilder.instance;
            sgpVar2.getClass();
            sguVar.c = sgpVar2;
            sguVar.b |= 1;
            try {
                sftVar.g(createBuilder);
            } catch (RemoteException e) {
                Log.w("AssistantIntegClient", "Sending command to service is failed", e);
            }
            anaf.O(sga.a);
            return;
        }
        sfx sfxVar = new sfx((byte[]) null);
        sfxVar.b(1);
        sfxVar.a = ammv.j(str);
        sfxVar.b(2);
        sfxVar.b = ammv.j(false);
        sfxVar.c = ammv.j(true);
        sfy a = sfxVar.a();
        sft sftVar2 = this.a;
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        sftVar2.c(sftVar2.c.b);
        sfx sfxVar2 = new sfx(a);
        sfxVar2.d = ammv.j(Long.valueOf(elapsedRealtimeNanos2));
        sfy a2 = sfxVar2.a();
        if (sftVar2.c.a() != 3) {
            throw new IllegalStateException("Check connected state before use.");
        }
        sftVar2.d();
        aone createBuilder3 = sgu.a.createBuilder();
        aone createBuilder4 = sgp.a.createBuilder();
        if (a2.a.h()) {
            String str2 = (String) a2.a.c();
            createBuilder4.copyOnWrite();
            sgp sgpVar3 = (sgp) createBuilder4.instance;
            sgpVar3.b |= 1;
            sgpVar3.c = str2;
        }
        if (a2.b.h()) {
            boolean booleanValue = ((Boolean) a2.b.c()).booleanValue();
            createBuilder4.copyOnWrite();
            sgp sgpVar4 = (sgp) createBuilder4.instance;
            sgpVar4.b |= 32;
            sgpVar4.f = booleanValue;
        }
        if (a2.c.h()) {
            boolean booleanValue2 = ((Boolean) a2.c.c()).booleanValue();
            createBuilder4.copyOnWrite();
            sgp sgpVar5 = (sgp) createBuilder4.instance;
            sgpVar5.b |= 128;
            sgpVar5.g = booleanValue2;
        }
        if (a2.h.h()) {
            long longValue = ((Long) a2.h.c()).longValue();
            createBuilder4.copyOnWrite();
            sgp sgpVar6 = (sgp) createBuilder4.instance;
            sgpVar6.b = 2 | sgpVar6.b;
            sgpVar6.d = longValue;
        }
        int a3 = sgf.a(a2.f);
        createBuilder4.copyOnWrite();
        sgp sgpVar7 = (sgp) createBuilder4.instance;
        int i = a3 - 1;
        if (a3 == 0) {
            throw null;
        }
        sgpVar7.e = i;
        sgpVar7.b |= 8;
        sgp sgpVar8 = (sgp) createBuilder4.build();
        createBuilder3.copyOnWrite();
        sgu sguVar2 = (sgu) createBuilder3.instance;
        sgpVar8.getClass();
        sguVar2.c = sgpVar8;
        sguVar2.b |= 1;
        try {
            sftVar2.g(createBuilder3);
        } catch (RemoteException e2) {
            Log.w("AssistantIntegClient", "Sending command to service is failed", e2);
        }
        anaf.O(sga.a);
    }

    public final synchronized boolean c() {
        if (!this.d) {
            return false;
        }
        afsy afsyVar = this.c;
        if (afsyVar != null && afsyVar.c() != null) {
            afsx c = this.c.c();
            if (c.g()) {
                return false;
            }
            if (c.y()) {
                return false;
            }
            if (!(c instanceof AccountIdentity)) {
                return false;
            }
            AccountIdentity accountIdentity = (AccountIdentity) c;
            if (!accountIdentity.j() && !accountIdentity.f()) {
                if (accountIdentity.x()) {
                    return false;
                }
                if (this.e.h()) {
                    if (!((String) this.e.c()).equals(accountIdentity.a())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
