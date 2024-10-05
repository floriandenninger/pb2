package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class evj implements evh {
    public final ywr a;
    public final azrw b;
    public final evk c;
    private final fus d;

    public evj(ywr ywrVar, evk evkVar, fus fusVar, azrw azrwVar) {
        this.c = evkVar;
        this.a = ywrVar;
        this.d = fusVar;
        this.b = azrwVar;
    }

    public static boolean d(evp evpVar, evk evkVar, evp evpVar2) {
        amkq.E(evpVar2 != evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED);
        if (evpVar == evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED) {
            evpVar = evpVar2;
        }
        if (evpVar != evp.BACKGROUND_AUDIO_POLICY_ON) {
            if (evpVar != evp.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES) {
                return false;
            }
            if (!evkVar.a.isWiredHeadsetOn() && !evkVar.a.isBluetoothA2dpOn() && !evkVar.a.isBluetoothScoOn()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.evh
    public final anhy a() {
        return anfq.i(this.a.a(), new anfz() { // from class: evi
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                evq evqVar = (evq) obj;
                return ((evqVar.b & 2) == 0 || !evqVar.d) ? evj.this.a.b(ens.n) : anhv.a;
            }
        }, angq.a);
    }

    @Override // defpackage.evh
    public final anhy b() {
        evp a = evp.a(((evq) this.a.c()).c);
        if (a == null) {
            a = evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
        }
        if (a == evp.BACKGROUND_AUDIO_POLICY_UNSPECIFIED) {
            return anhv.a;
        }
        if (!d(a, this.c, (evp) this.b.get())) {
            fus fusVar = this.d;
            fusVar.a.stopService((Intent) fusVar.b.get());
        }
        return a();
    }

    @Override // defpackage.evh
    public final boolean c() {
        return !((evq) this.a.c()).d;
    }
}
