package com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared;

import android.os.Handler;
import android.os.Parcel;
import defpackage.ecq;
import defpackage.ecr;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public final com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c a;
    public final AtomicInteger b;
    public final AtomicInteger c;
    private final Handler d;
    private final Runnable e;
    private final Runnable f;

    public b(com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c cVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
        cVar.getClass();
        this.a = cVar;
        handler.getClass();
        this.d = handler;
        this.b = new AtomicInteger();
        this.c = new AtomicInteger();
        this.e = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d(cVar, 1);
        this.f = new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d(cVar, 2, null);
        cVar.b(this);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int a() {
        return this.c.get();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int f = f();
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
            case 2:
                int a = a();
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            case 3:
                k(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                l(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                g(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                i(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                h();
                parcel2.writeNoException();
                return true;
            case 9:
                ecr.j(parcel);
                this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b.this.a.c();
                    }
                });
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final int f() {
        return this.b.get();
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void g(int i) {
        this.d.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(this, i, 1));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void h() {
        this.d.post(this.f);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void i(int i) {
        this.d.postDelayed(this.e, i);
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void j() {
        Handler handler = this.d;
        com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.c cVar = this.a;
        cVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.d(cVar, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void k(final int i, final int i2) {
        this.d.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.f
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.b.this;
                bVar.a.a(i, i2);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.c
    public final void l(int i) {
        this.d.post(new com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.remoteloaded.e(this, i, 0));
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.mediaplayer.shared.IApiMediaViewClient");
    }
}
