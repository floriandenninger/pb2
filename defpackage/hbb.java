package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbb {
    public ReelToReelList c;
    public final Map a = new HashMap();
    public final WeakHashMap b = new WeakHashMap();
    public amru d = amru.q();
    public final Set e = new HashSet();
    public final Set f = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.apxf a(defpackage.apxf r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbb.a(apxf):apxf");
    }

    public final void b(Object obj, Runnable runnable) {
        this.b.put(obj, runnable);
    }

    public final void c(int i, apxf apxfVar, boolean z) {
        apxfVar.getClass();
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
                synchronized (this.a) {
                    hba hbaVar = (hba) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                    if (hbaVar == null) {
                        hbaVar = new hba();
                        this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, hbaVar);
                    }
                    int hashCode = reelWatchEndpointOuterClass$ReelWatchEndpoint.hashCode();
                    int i2 = hbaVar.a.get(i);
                    boolean z2 = false;
                    if (i2 != 0 && i2 != hashCode) {
                        z2 = true;
                    }
                    if (z2) {
                        hbaVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                    }
                    if (i2 == 0 || z2) {
                        hbaVar.a.put(i, hashCode);
                        hbaVar.c = z;
                    }
                }
            }
        }
    }

    public final void d(Object obj) {
        this.b.remove(obj);
    }

    public final void e(apxf apxfVar) {
        apxfVar.getClass();
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
                synchronized (this.a) {
                    hba hbaVar = (hba) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                    if (hbaVar == null) {
                        hbaVar = new hba();
                        this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, hbaVar);
                    }
                    hbaVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                }
            }
        }
    }

    public final boolean f(apxf apxfVar) {
        apxfVar.getClass();
        boolean z = false;
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
                synchronized (this.a) {
                    hba hbaVar = (hba) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                    if (hbaVar != null && hbaVar.c) {
                        z = true;
                    }
                }
                return z;
            }
        }
        return false;
    }

    public final void g(apxf apxfVar) {
        apxfVar.getClass();
        if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apxfVar.pX(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            if ((reelWatchEndpointOuterClass$ReelWatchEndpoint.b & 8) != 0) {
                synchronized (this.a) {
                    hba hbaVar = (hba) this.a.get(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                    if (hbaVar == null) {
                        hbaVar = new hba();
                        this.a.put(reelWatchEndpointOuterClass$ReelWatchEndpoint.e, hbaVar);
                    }
                    hbaVar.b = reelWatchEndpointOuterClass$ReelWatchEndpoint;
                    hbaVar.c = true;
                }
                synchronized (this.f) {
                    this.f.add(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
                }
            }
        }
    }
}
