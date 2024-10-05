package com.google.android.libraries.youtube.mdx.mediaroute.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.google.android.youtube.R;
import defpackage.acxi;
import defpackage.addy;
import defpackage.adei;
import defpackage.adff;
import defpackage.adfg;
import defpackage.adfh;
import defpackage.adfi;
import defpackage.adfk;
import defpackage.adls;
import defpackage.adlt;
import defpackage.aikd;
import defpackage.aiki;
import defpackage.aikk;
import defpackage.aioc;
import defpackage.ajbh;
import defpackage.ajm;
import defpackage.ayqw;
import defpackage.azrw;
import defpackage.xag;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemotePlaybackControlsService extends adff implements ypd {
    public ypa a;
    public aioc c;
    public aiki d;
    public aiki e;
    public aikk f;
    public adfg g;
    public aikd h;
    public azrw i;
    public azrw j;
    public acxi k;
    public boolean l;
    public adfg m;
    public ajbh n;
    final adfk b = new adfk(this);
    private final ayqw o = new ayqw();
    private final adls p = new adfh(this);
    private final adfi r = new adfi(this);
    private final adfi q = new adfi(this);

    static {
        zga.a("MDX.RemoteService");
    }

    public final void b() {
        this.n.J();
        if (!this.l || !this.k.f) {
            this.e.b(false);
            this.d.h();
        } else {
            this.d.b(false);
            this.e.h();
        }
    }

    public final void c() {
        boolean o = ((adlt) this.j.get()).o();
        adei adeiVar = ((addy) this.i.get()).e;
        if (o) {
            this.l = false;
            b();
        } else if (adeiVar != null) {
            this.d.a = getString(R.string.now_playing_on_screen, new Object[]{ajm.a().b(adeiVar.a)});
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xag.class};
        }
        if (i == 0) {
            xag xagVar = (xag) obj;
            if (((adlt) this.j.get()).g() == null) {
                this.l = false;
                return null;
            }
            this.l = xagVar.a().a() && Build.VERSION.SDK_INT > 23;
            b();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        c();
        return new Binder();
    }

    @Override // defpackage.adff, android.app.Service
    public final void onCreate() {
        super.onCreate();
        aiki aikiVar = this.d;
        aikiVar.c = this.q;
        aikiVar.g(this.f, this.g);
        this.d.d = this.r;
        this.e.g(this.f, this.m);
        this.h.f(this);
        this.o.g(this.b.kI(this.c));
        this.a.g(this);
        ((adlt) this.j.get()).j(this.p);
        ((addy) this.i.get()).F();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.l = false;
        this.d.d = null;
        ((addy) this.i.get()).G();
        this.d.b(true);
        this.e.b(true);
        this.h.f(null);
        this.o.c();
        this.a.m(this);
        ((adlt) this.j.get()).l(this.p);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
    }
}
