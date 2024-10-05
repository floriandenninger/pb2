package com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.f;
import defpackage.aivi;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.oph;
import defpackage.zfi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public zfi a;
    public aivi b;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.c c;
    private final Handler d;

    public b(zfi zfiVar, aivi aiviVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
        zfiVar.getClass();
        this.a = zfiVar;
        aiviVar.getClass();
        this.b = aiviVar;
        handler.getClass();
        this.d = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void a(final boolean z) {
        this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b.this.a.a(Boolean.valueOf(z));
            }
        });
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.c cVar = this.c;
        if (cVar != null) {
            cVar.a = null;
            this.c = null;
        }
        this.b = null;
        this.a = oph.g;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        f dVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiServiceListener");
                if (queryLocalInterface instanceof f) {
                    dVar = (f) queryLocalInterface;
                } else {
                    dVar = new d(readStrongBinder);
                }
            }
            f(dVar);
        } else {
            if (i != 2) {
                return false;
            }
            a(ecr.j(parcel));
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.c
    public final void f(final f fVar) {
        this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.player.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.b.this;
                f fVar2 = fVar;
                if (bVar.b != null) {
                    bVar.c = new c(fVar2);
                    bVar.b.o = bVar.c;
                }
            }
        });
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.player.shared.IPlayerUiClient");
    }
}
