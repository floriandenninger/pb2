package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njt extends njq implements nkw {
    private final Handler a;
    private final ainy b;
    private final ViewGroup c;
    private final mvc d;
    private final Runnable e;

    public njt(Context context, Handler handler, final nkx nkxVar, ainy ainyVar, nmc nmcVar, aadw aadwVar, byte[] bArr) {
        this.a = handler;
        this.b = ainyVar;
        if (evr.ar(aadwVar)) {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_scrollable_action_bar_reduced_margins, (ViewGroup) null);
        } else {
            this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_scrollable_action_bar, (ViewGroup) null);
        }
        this.d = nmcVar.b((ViewGroup) this.c.findViewById(R.id.button_container), new azrw() { // from class: njs
            @Override // defpackage.azrw
            public final Object get() {
                return njt.this.j.a;
            }
        });
        this.e = new Runnable() { // from class: njr
            @Override // java.lang.Runnable
            public final void run() {
                njt njtVar = njt.this;
                nkxVar.b(njtVar, njtVar.j.a);
            }
        };
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.njq
    protected final void d() {
        this.d.e(((auwe) this.k).c, this.l.c(), this.j);
        this.d.g();
        this.a.post(this.e);
    }

    @Override // defpackage.njq
    protected final void e() {
        this.a.removeCallbacks(this.e);
        this.d.f();
    }

    @Override // defpackage.nkw
    public final View g() {
        return this.d.a();
    }

    @Override // defpackage.nkw
    public final View h() {
        return this.d.b();
    }

    @Override // defpackage.nkw
    public final arej i() {
        muu c = this.d.c();
        if (c != null) {
            return c.j();
        }
        return null;
    }

    @Override // defpackage.nkw
    public final arej j() {
        auwe auweVar = (auwe) this.k;
        if ((auweVar.b & 2) == 0) {
            return null;
        }
        auvq auvqVar = auweVar.e;
        if (auvqVar == null) {
            auvqVar = auvq.a;
        }
        if (auvqVar.b == 102716411) {
            return (arej) auvqVar.c;
        }
        return arej.a;
    }

    @Override // defpackage.nkw
    public final arej k() {
        auwe auweVar = (auwe) this.k;
        if ((auweVar.b & 1) == 0) {
            return null;
        }
        auvq auvqVar = auweVar.d;
        if (auvqVar == null) {
            auvqVar = auvq.a;
        }
        if (auvqVar.b == 102716411) {
            return (arej) auvqVar.c;
        }
        return arej.a;
    }

    @Override // defpackage.nkw
    public final String l() {
        return this.l.c();
    }

    @Override // defpackage.nkw
    public final boolean m() {
        atsb b = fkc.b(this.b);
        return b != null && b.c;
    }

    @Override // defpackage.nkw
    public final boolean n() {
        return this.d.d(this.l.c()) != null;
    }

    @Override // defpackage.nkw
    public final boolean o() {
        return this.c.isShown();
    }
}
