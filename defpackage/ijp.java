package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ijp {
    private final imu a;
    private final acsh b;
    private boolean c;

    public ijp(acsh acshVar, imu imuVar) {
        this.b = acshVar;
        this.a = imuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InteractionLoggingScreen a(Optional optional, acra acraVar, apxf apxfVar, String str, String str2, boolean z, boolean z2) {
        Bundle bundle;
        atmc p;
        asht ashtVar;
        aone r = gfw.r(apxfVar);
        if (((atmc) r.instance).c.isEmpty() || ((atmc) r.instance).d == 22156) {
            acsh acshVar = this.b;
            String str3 = (acshVar == null || (bundle = acshVar.a) == null || (p = gfw.p(acsh.c(bundle))) == null) ? null : p.c;
            if (str3 != null) {
                r.copyOnWrite();
                atmc atmcVar = (atmc) r.instance;
                atmcVar.b |= 1;
                atmcVar.c = str3;
            }
        }
        aong aongVar = (aong) apxfVar.toBuilder();
        aongVar.e(atmb.b, (atmc) r.build());
        apxf apxfVar2 = (apxf) aongVar.build();
        if (TextUtils.isEmpty(str)) {
            ashtVar = null;
        } else {
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = ashz.a.createBuilder();
            createBuilder2.copyOnWrite();
            ashz ashzVar = (ashz) createBuilder2.instance;
            str.getClass();
            ashzVar.b |= 1;
            ashzVar.c = str;
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            ashz ashzVar2 = (ashz) createBuilder2.build();
            ashzVar2.getClass();
            ashtVar2.j = ashzVar2;
            ashtVar2.b |= 64;
            ashtVar = (asht) createBuilder.build();
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        InteractionLoggingScreen e = acraVar.e(acsb.b((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 67108864) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.y : 37414), acrs.DEFAULT, apxfVar2, null, ashtVar);
        this.c = true;
        if (z && !TextUtils.isEmpty(str2)) {
            acraVar.r(str2);
        }
        Bundle a = acsh.a(acraVar);
        if (a != null) {
            this.b.a = a;
        }
        acraVar.n(new acqx(acsb.c(22156)));
        acraVar.n(new acqx(acsb.c(37419)));
        acraVar.n(new acqx(acsb.c(37420)));
        acraVar.n(new acqx(acsb.c(56922)));
        acraVar.n(new acqx(acsb.c(56921)));
        acraVar.n(new acqx(acsb.c(58160)));
        imu imuVar = this.a;
        imuVar.c();
        ArrayList J2 = imuVar.n.J();
        int size = J2.size();
        for (int i = 0; i < size; i++) {
            ((imv) J2.get(i)).aS();
        }
        if (!optional.isPresent()) {
            zga.b("No reel navigator.");
        } else {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            long a2 = ((haj) optional.get()).a(reelWatchEndpointOuterClass$ReelWatchEndpoint2);
            if (a2 == Long.MIN_VALUE) {
                zga.b("No reel watch endpoint.");
            } else {
                ifn ifnVar = imuVar.b;
                if (apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    if (ifnVar.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint3)) {
                        Iterator it = ifnVar.a.iterator();
                        while (it.hasNext()) {
                            ((ekg) it.next()).w();
                        }
                    }
                }
                ifn ifnVar2 = imuVar.b;
                if (apxfVar2.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint4 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar2.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    if (ifnVar2.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint4)) {
                        xgb xgbVar = (xgb) ifnVar2.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint4);
                        Iterator it2 = ifnVar2.a.iterator();
                        while (it2.hasNext()) {
                            ((ekg) it2.next()).f(xgbVar, str2);
                        }
                    }
                }
                aoae aoaeVar = imuVar.n;
                amnv amnvVar = imuVar.g;
                shf shfVar = imuVar.c;
                haj hajVar = (haj) optional.get();
                ing ingVar = imuVar.a;
                gfw gfwVar = imuVar.m;
                imuVar.l = new imr(str2, a2, aoaeVar, amnvVar, shfVar, hajVar, ingVar, imuVar.d, imuVar.e, imuVar.h, imuVar.f, imuVar.i, imuVar.j, new HashMap(), null, null, null, null);
                imuVar.a.d(apxfVar2, str2, false, imu.e((aujz) imuVar.g.get(), reelWatchEndpointOuterClass$ReelWatchEndpoint2.d), z2, imuVar.l);
                ArrayList J3 = imuVar.n.J();
                int size2 = J3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((imv) J3.get(i2)).aX(apxfVar2);
                }
            }
        }
        return e;
    }

    public final void b(acra acraVar) {
        if (this.c) {
            acraVar.t();
            this.c = false;
        }
    }
}
