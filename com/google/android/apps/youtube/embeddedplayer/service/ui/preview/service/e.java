package com.google.android.apps.youtube.embeddedplayer.service.ui.preview.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.aaxn;
import defpackage.ajjz;
import defpackage.alvn;
import defpackage.asci;
import defpackage.asck;
import defpackage.ascm;
import defpackage.avgg;
import defpackage.ecr;
import defpackage.ysy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    public final Handler a;
    public final ajjz b;
    public a c;
    public final g d;
    public final aaxn e;
    private final ysy f;

    public e(g gVar, aaxn aaxnVar, ajjz ajjzVar, ysy ysyVar, byte[] bArr, byte[] bArr2) {
        gVar.getClass();
        this.d = gVar;
        this.a = new Handler(Looper.getMainLooper());
        this.e = aaxnVar;
        this.b = ajjzVar;
        this.f = ysyVar;
    }

    public static avgg a(asck asckVar) {
        ascm ascmVar;
        asci asciVar = asckVar.c;
        if (asciVar == null) {
            asciVar = asci.a;
        }
        if (asciVar.b != 87079103) {
            return avgg.a;
        }
        asci asciVar2 = asckVar.c;
        if (asciVar2 == null) {
            asciVar2 = asci.a;
        }
        if (asciVar2.b == 87079103) {
            ascmVar = (ascm) asciVar2.c;
        } else {
            ascmVar = ascm.a;
        }
        avgg avggVar = ascmVar.b;
        return avggVar == null ? avgg.a : avggVar;
    }

    public final void b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.d();
        }
        this.c = null;
    }

    public final void c() {
        f(true != this.f.o() ? 2 : 1);
    }

    public final boolean d() {
        a aVar = this.c;
        return aVar != null && aVar.j();
    }

    public final boolean e() {
        a aVar = this.c;
        return aVar != null && aVar.k();
    }

    public final void f(int i) {
        b();
        g gVar = this.d;
        String str = i != 1 ? i != 2 ? "UNKNOWN" : "INTERNAL_ERROR" : "NETWORK_ERROR";
        boolean e = e();
        boolean d = d();
        alvn alvnVar = gVar.a;
        if (alvnVar != null) {
            try {
                Parcel pn = alvnVar.pn();
                pn.writeString(str);
                ecr.e(pn, e);
                ecr.e(pn, d);
                alvnVar.pp(2, pn);
            } catch (RemoteException unused) {
            }
        }
    }
}
