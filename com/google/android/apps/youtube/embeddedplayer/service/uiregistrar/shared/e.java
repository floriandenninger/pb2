package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseArray;
import defpackage.amru;
import defpackage.amxe;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.rql;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    public final rql a;
    private final Handler b;
    private final SparseArray c;
    private i d;

    private e(Handler handler, rql rqlVar, byte[] bArr) {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
        this.b = handler;
        this.a = rqlVar;
        this.c = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e d(List list, Handler handler, rql rqlVar) {
        final e eVar = new e(handler, rqlVar, null);
        amxe it = ((amru) list).iterator();
        while (it.hasNext()) {
            final int intValue = ((Integer) it.next()).intValue();
            Runnable runnable = new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.a
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.this.b(intValue);
                }
            };
            eVar.c.put(intValue, runnable);
            eVar.a.a(intValue, runnable);
        }
        return eVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final synchronized void a(i iVar) {
        this.d = iVar;
    }

    public final synchronized void b(int i) {
        i iVar = this.d;
        if (iVar != null) {
            try {
                iVar.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void c() {
        this.d = null;
        for (int i = 0; i < this.c.size(); i++) {
            rql rqlVar = this.a;
            int keyAt = this.c.keyAt(i);
            Runnable runnable = (Runnable) this.c.valueAt(i);
            j jVar = (j) rqlVar.a.get(keyAt);
            if (jVar != null) {
                jVar.a.remove(runnable);
            }
        }
        this.c.clear();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i gVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarService");
                if (queryLocalInterface instanceof i) {
                    gVar = (i) queryLocalInterface;
                } else {
                    gVar = new g(readStrongBinder);
                }
            }
            a(gVar);
        } else {
            if (i != 2) {
                return false;
            }
            f(parcel.readInt(), ecr.j(parcel));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.f
    public final void f(final int i, final boolean z) {
        this.b.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.e.this;
                eVar.a.d(i, z);
            }
        });
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.IUiElementRegistrarClient");
    }
}
