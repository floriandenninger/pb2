package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.axfx;
import defpackage.axfy;
import defpackage.axfz;
import defpackage.axgb;
import defpackage.axgc;
import defpackage.axgd;
import defpackage.axge;
import defpackage.axgf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ExternalSurfaceManager {
    private static final String b = "ExternalSurfaceManager";
    public final axfy a;
    private final Object c;
    private volatile axge d;
    private int e;
    private boolean f;

    public ExternalSurfaceManager(long j) {
        axfy axfyVar = new axfy(j);
        this.c = new Object();
        this.d = new axge();
        this.e = 1;
        this.a = axfyVar;
    }

    private final int a(int i, int i2, axgc axgcVar, boolean z) {
        int i3;
        synchronized (this.c) {
            axge axgeVar = new axge(this.d);
            i3 = this.e;
            this.e = i3 + 1;
            axgeVar.a.put(Integer.valueOf(i3), new axgb(i3, i, i2, axgcVar, z));
            this.d = axgeVar;
        }
        return i3;
    }

    private final void b(axgd axgdVar) {
        axge axgeVar = this.d;
        if (this.f && !axgeVar.a.isEmpty()) {
            for (axgb axgbVar : axgeVar.a.values()) {
                axgbVar.a();
                axgdVar.a(axgbVar);
            }
        }
        if (axgeVar.b.isEmpty()) {
            return;
        }
        Iterator it = axgeVar.b.values().iterator();
        while (it.hasNext()) {
            ((axgb) it.next()).c(this.a);
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext() {
        this.f = true;
        axge axgeVar = this.d;
        if (axgeVar.a.isEmpty()) {
            return;
        }
        Iterator it = axgeVar.a.values().iterator();
        while (it.hasNext()) {
            ((axgb) it.next()).a();
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.f = false;
        axge axgeVar = this.d;
        if (axgeVar.a.isEmpty()) {
            return;
        }
        for (axgb axgbVar : axgeVar.a.values()) {
            if (axgbVar.i) {
                axgc axgcVar = axgbVar.b;
                if (axgcVar != null) {
                    axgcVar.a();
                }
                axgbVar.g.detachFromGLContext();
                axgbVar.i = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        b(new axfx(this, 1));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        b(new axfx(this, 0));
    }

    public int createExternalSurface() {
        return a(-1, -1, null, false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return a(i, i2, new axgf(j, j2), z);
    }

    public Surface getSurface(int i) {
        axge axgeVar = this.d;
        HashMap hashMap = axgeVar.a;
        Integer valueOf = Integer.valueOf(i);
        if (hashMap.containsKey(valueOf)) {
            axgb axgbVar = (axgb) axgeVar.a.get(valueOf);
            if (axgbVar.i) {
                return axgbVar.h;
            }
            return null;
        }
        String str = b;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Surface with ID ");
        sb.append(i);
        sb.append(" does not exist, returning null");
        Log.e(str, sb.toString());
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.c) {
            axge axgeVar = new axge(this.d);
            HashMap hashMap = axgeVar.a;
            Integer valueOf = Integer.valueOf(i);
            axgb axgbVar = (axgb) hashMap.remove(valueOf);
            if (axgbVar != null) {
                axgeVar.b.put(valueOf, axgbVar);
                this.d = axgeVar;
            } else {
                String str = b;
                StringBuilder sb = new StringBuilder(48);
                sb.append("Not releasing nonexistent surface ID ");
                sb.append(i);
                Log.e(str, sb.toString());
            }
        }
    }

    public void shutdown() {
        synchronized (this.c) {
            axge axgeVar = this.d;
            this.d = new axge();
            if (!axgeVar.a.isEmpty()) {
                Iterator it = axgeVar.a.entrySet().iterator();
                while (it.hasNext()) {
                    ((axgb) ((Map.Entry) it.next()).getValue()).c(this.a);
                }
            }
            if (!axgeVar.b.isEmpty()) {
                Iterator it2 = axgeVar.b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((axgb) ((Map.Entry) it2.next()).getValue()).c(this.a);
                }
            }
        }
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return a(i, i2, new axfz(runnable, runnable2, handler), false);
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.f = true;
        axge axgeVar = this.d;
        if (!this.d.a.isEmpty()) {
            for (Integer num : this.d.a.keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (axgeVar.a.containsKey(entry.getKey())) {
                ((axgb) axgeVar.a.get(entry.getKey())).b(((Integer) entry.getValue()).intValue());
            } else {
                Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }
}
