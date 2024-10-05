package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared;

import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ecq;
import defpackage.ecr;
import defpackage.xie;
import defpackage.xja;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b extends ecq implements c {
    public final xja a;
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.f b;
    private final Handler c;

    public b(xja xjaVar, Handler handler) {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
        xjaVar.getClass();
        this.a = xjaVar;
        handler.getClass();
        this.c = handler;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void a() {
        Handler handler = this.c;
        xja xjaVar = this.a;
        xjaVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.e(xjaVar, 1));
    }

    public final void b() {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.f fVar = this.b;
        if (fVar != null) {
            fVar.a = null;
            this.b = null;
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        f dVar;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayServiceListener");
                    if (queryLocalInterface instanceof f) {
                        dVar = (f) queryLocalInterface;
                    } else {
                        dVar = new d(readStrongBinder);
                    }
                }
                g(dVar);
                break;
            case 2:
                f();
                break;
            case 3:
                h(ecr.j(parcel));
                break;
            case 4:
                j(parcel.readString(), parcel.createStringArrayList(), ecr.j(parcel));
                break;
            case 5:
                i();
                break;
            case 6:
                k(parcel.readInt());
                break;
            case 7:
                a();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void f() {
        Handler handler = this.c;
        xja xjaVar = this.a;
        xjaVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.e(xjaVar, 0));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void g(final f fVar) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.b
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b.this;
                bVar.b = new f(fVar);
                ((xie) bVar.a).a = bVar.b;
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void h(final boolean z) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b.this;
                bVar.a.k(z);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void i() {
        Handler handler = this.c;
        xja xjaVar = this.a;
        xjaVar.getClass();
        handler.post(new com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.e(xjaVar, 2));
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void j(final String str, final List list, final boolean z) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b.this;
                bVar.a.p(str, list, z, 0);
            }
        });
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.c
    public final void k(final int i) {
        this.c.post(new Runnable() { // from class: com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.remoteloaded.a
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b bVar = com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.b.this;
                bVar.a.m(i);
            }
        });
    }

    public b() {
        super("com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.surveyoverlay.shared.ISurveyOverlayClient");
    }
}
