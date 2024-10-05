package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akgp implements akgr {
    public final Context a;
    public final aahd b;
    public final DialogInterface c;
    public final ajol d = new ajol() { // from class: akgn
        @Override // defpackage.ajol
        public final void a(ajok ajokVar, ajng ajngVar, int i) {
            ajokVar.f(akgr.o, akgp.this);
        }
    };
    public final ajoy e;
    public akgq f;
    public View g;
    public ajox h;
    public ajpd i;
    public ajpd j;
    public View k;
    public RecyclerView l;
    public final ldu m;
    public final kxh n;

    public akgp(Context context, aahd aahdVar, ldu lduVar, kxh kxhVar, ajoy ajoyVar, DialogInterface dialogInterface, akgq akgqVar, byte[] bArr) {
        this.a = context;
        this.b = aahdVar;
        this.c = dialogInterface;
        this.f = akgqVar;
        this.m = lduVar;
        this.n = kxhVar;
        this.e = ajoyVar;
    }

    @Override // defpackage.akgr
    public final void a(String str, boolean z) {
        if (z) {
            this.f.e.add(str);
        } else {
            this.f.e.remove(str);
        }
    }

    public final void b() {
        View view = this.g;
        view.setMinimumWidth(view.getResources().getDimensionPixelSize(R.dimen.subscription_notification_dialog_min_width));
    }

    @Override // defpackage.akgr
    public final boolean d() {
        avai avaiVar = this.f.d;
        if (avaiVar == null) {
            return false;
        }
        return avaiVar.g;
    }

    @Override // defpackage.akgr
    public final boolean e(String str) {
        return this.f.e.contains(str);
    }

    @Override // defpackage.akgr
    public final boolean f(avai avaiVar) {
        avai avaiVar2 = this.f.d;
        if (avaiVar2 == null) {
            return false;
        }
        return avaiVar2.equals(avaiVar);
    }

    @Override // defpackage.akgr
    public final void c(avai avaiVar, boolean z) {
        if (z) {
            akgq akgqVar = this.f;
            akgqVar.d = avaiVar;
            ajox ajoxVar = this.h;
            avae avaeVar = akgqVar.a;
            ajoxVar.og(0, avaeVar == null ? 0 : avaeVar.c.size());
            this.j.l();
        }
    }
}
