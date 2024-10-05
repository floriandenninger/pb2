package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import com.google.android.youtube.R;
import defpackage.aaea;
import defpackage.abbf;
import defpackage.abbi;
import defpackage.akbz;
import defpackage.any;
import defpackage.aok;
import defpackage.arzb;
import defpackage.evr;
import defpackage.gcm;
import defpackage.gcq;
import defpackage.iwm;
import defpackage.ypa;
import defpackage.ypd;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaylistEditToastController implements any, ypd {
    Context a;
    private final akbz c;
    private final aaea d;
    private final ypa e;
    private String g;
    public boolean b = false;
    private final Set f = new HashSet();

    public PlaylistEditToastController(Context context, akbz akbzVar, aaea aaeaVar, ypa ypaVar) {
        this.a = context;
        this.c = akbzVar;
        this.d = aaeaVar;
        this.e = ypaVar;
    }

    public final void g() {
        this.f.clear();
        this.b = false;
        this.g = null;
    }

    public final void h() {
        if (this.f.isEmpty() || !this.b) {
            return;
        }
        int size = this.f.size();
        g();
        gcm f = gcq.f(this.a.getResources().getQuantityString(R.plurals.playlist_picker_dialog_done, size));
        f.f(!evr.H(this.d));
        this.c.o(f.b());
    }

    public final void i(String str, String str2, arzb arzbVar) {
        if (arzbVar.f.size() > 0 || (arzbVar.b & 256) != 0) {
            return;
        }
        if (!str2.equals(this.g)) {
            this.f.clear();
            this.g = str2;
        }
        this.f.add(str);
        h();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{iwm.class, abbf.class, abbi.class};
        }
        if (i == 0) {
            if (((iwm) obj).a) {
                g();
                return null;
            }
            this.b = true;
            h();
            return null;
        }
        if (i == 1) {
            abbf abbfVar = (abbf) obj;
            i(abbfVar.a, abbfVar.b, abbfVar.c);
            return null;
        }
        if (i == 2) {
            abbi abbiVar = (abbi) obj;
            i(abbiVar.a, abbiVar.d, abbiVar.c);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.aoa
    public final void lc(aok aokVar) {
        this.e.m(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.e.g(this);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
