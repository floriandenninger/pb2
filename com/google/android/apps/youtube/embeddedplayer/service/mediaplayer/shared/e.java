package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.content.Context;
import android.graphics.Rect;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.q;
import defpackage.ecq;
import defpackage.ecr;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e extends ecq implements f {
    public final Context a;
    public q b;
    public SurfaceHolder c;
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i d;
    private final Handler e;

    public e(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i iVar, Context context, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
        iVar.getClass();
        this.d = iVar;
        context.getClass();
        this.a = context;
        handler.getClass();
        this.e = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final Rect a() {
        final AtomicReference atomicReference = new AtomicReference();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.o
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this;
                AtomicReference atomicReference2 = atomicReference;
                ConditionVariable conditionVariable2 = conditionVariable;
                SurfaceHolder surfaceHolder = eVar.c;
                if (surfaceHolder != null) {
                    atomicReference2.set(surfaceHolder.getSurfaceFrame());
                }
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        return (Rect) atomicReference.get();
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.i iVar = this.d;
        SurfaceView surfaceView = iVar.b;
        if (surfaceView != null) {
            iVar.removeView(surfaceView);
        }
        iVar.b = null;
        q qVar = this.b;
        if (qVar != null) {
            qVar.a = null;
            qVar.b = null;
            this.b = null;
        }
        this.c = null;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        i gVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderServiceListener");
                    if (queryLocalInterface instanceof i) {
                        gVar = (i) queryLocalInterface;
                    } else {
                        gVar = new g(readStrongBinder);
                    }
                }
                j(gVar);
                parcel2.writeNoException();
                return true;
            case 2:
                boolean l = l();
                parcel2.writeNoException();
                ecr.e(parcel2, l);
                return true;
            case 3:
                Rect a = a();
                parcel2.writeNoException();
                ecr.h(parcel2, a);
                return true;
            case 4:
                h(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 5:
                f(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                g(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                i();
                parcel2.writeNoException();
                return true;
            case 8:
                k(parcel.readInt());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void f(final int i, final int i2) {
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.l
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this;
                int i3 = i;
                int i4 = i2;
                SurfaceHolder surfaceHolder = eVar.c;
                if (surfaceHolder != null) {
                    surfaceHolder.setFixedSize(i3, i4);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void g(int i) {
        this.e.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.k(this, i, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void h(final boolean z) {
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.p
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this;
                boolean z2 = z;
                SurfaceHolder surfaceHolder = eVar.c;
                if (surfaceHolder != null) {
                    surfaceHolder.setKeepScreenOn(z2);
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void i() {
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.j
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceHolder surfaceHolder = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this.c;
                if (surfaceHolder != null) {
                    surfaceHolder.setSizeFromLayout();
                }
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void j(final i iVar) {
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.m
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this;
                eVar.b = new q(iVar, eVar.d);
                SurfaceView surfaceView = new SurfaceView(eVar.a);
                eVar.c = surfaceView.getHolder();
                q qVar = eVar.b;
                if (qVar != null) {
                    eVar.c.addCallback(qVar);
                }
                i iVar2 = eVar.d;
                iVar2.b = surfaceView;
                iVar2.addView(surfaceView, 0);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final void k(int i) {
        this.e.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.k(this, i, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.f
    public final boolean l() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        final ConditionVariable conditionVariable = new ConditionVariable();
        this.e.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.n
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e eVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.e.this;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ConditionVariable conditionVariable2 = conditionVariable;
                SurfaceHolder surfaceHolder = eVar.c;
                if (surfaceHolder != null) {
                    atomicBoolean2.set(surfaceHolder.isCreating());
                }
                conditionVariable2.open();
            }
        });
        conditionVariable.block();
        return atomicBoolean.get();
    }

    public e() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.ISurfaceHolderClient");
    }
}
