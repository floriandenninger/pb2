package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service;

import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.h;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.j;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
import defpackage.amru;
import defpackage.amxe;
import defpackage.rql;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c {
    private final SparseArray a = new SparseArray();
    private f b;
    private h c;
    private final rql d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List list, Handler handler, rql rqlVar, f fVar, byte[] bArr) {
        this.d = rqlVar;
        this.b = fVar;
        this.c = new h(handler, rqlVar, null);
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            final int intValue = ((Integer) it.next()).intValue();
            k kVar = new k() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.service.a
                @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k
                public final void a(boolean z) {
                    c.this.a(intValue, z);
                }
            };
            this.a.put(intValue, kVar);
            rqlVar.b(intValue, kVar);
        }
        try {
            h hVar = this.c;
            if (hVar != null) {
                fVar.a(hVar);
            }
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void a(int i, boolean z) {
        f fVar = this.b;
        if (fVar != null) {
            try {
                fVar.f(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void b() {
        this.c = null;
        this.b = null;
        for (int i = 0; i < this.a.size(); i++) {
            rql rqlVar = this.d;
            int keyAt = this.a.keyAt(i);
            k kVar = (k) this.a.valueAt(i);
            j jVar = (j) rqlVar.a.get(keyAt);
            if (jVar != null) {
                jVar.b.remove(kVar);
            }
        }
        this.a.clear();
    }
}
