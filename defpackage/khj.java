package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khj {
    public final acpl a;
    public final ysy b;
    public final AudioManager c;
    public final PowerManager d;
    public final aifs e;
    public final evh f;
    public final aypn g;

    public khj(Context context, acpl acplVar, ysy ysyVar, aifs aifsVar, evh evhVar, aioc aiocVar, Set set) {
        this.a = acplVar;
        this.b = ysyVar;
        this.e = aifsVar;
        this.f = evhVar;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = (PowerManager) context.getSystemService("power");
        amrp f = amru.f();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.h(((khn) it.next()).a());
        }
        aypn B = aypn.B(f.g());
        aiov G = aiocVar.G();
        this.g = B.S(aypn.e(G.a.s(khf.a).A(new ayrv() { // from class: khd
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                khj khjVar = khj.this;
                ahef ahefVar = (ahef) obj;
                int i = 4;
                if (khjVar.c.isWiredHeadsetOn()) {
                    i = 3;
                } else if (!khjVar.c.isBluetoothA2dpOn() && !khjVar.c.isBluetoothScoOn()) {
                    i = 2;
                }
                boolean z = false;
                if (ahefVar.c().equals(aign.NEW) || ahefVar.c().equals(aign.ENDED)) {
                    return new khi(i, "", false, false);
                }
                PlayerResponseModel b = ahefVar.b();
                boolean z2 = b != null && b.B();
                if (b != null && ahbx.j(b.q())) {
                    z = true;
                }
                return new khi(i, ahefVar.e(), z2, z);
            }
        }), G.i.A(khe.a), epc.p), epc.q);
    }
}
