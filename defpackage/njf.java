package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.SlimMetadataButtonContainerLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njf extends njq implements nkw {
    private final Handler a;
    private final ainy b;
    private final ViewGroup c;
    private final SlimMetadataButtonContainerLayout d;
    private final mvc e;
    private final bwd f;
    private final Runnable g;

    public njf(Context context, Handler handler, final nkx nkxVar, ainy ainyVar, nmc nmcVar, byte[] bArr) {
        this.a = handler;
        this.b = ainyVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_action_bar, (ViewGroup) null);
        this.c = viewGroup;
        SlimMetadataButtonContainerLayout slimMetadataButtonContainerLayout = (SlimMetadataButtonContainerLayout) viewGroup.findViewById(R.id.button_container);
        this.d = slimMetadataButtonContainerLayout;
        this.e = nmcVar.b(slimMetadataButtonContainerLayout, new azrw() { // from class: nje
            @Override // defpackage.azrw
            public final Object get() {
                return njf.this.j.a;
            }
        });
        bwk bwkVar = new bwk();
        fxy fxyVar = new fxy();
        fxyVar.y(R.id.container);
        bwkVar.f(fxyVar);
        bvu bvuVar = new bvu();
        bvuVar.A();
        bwkVar.f(bvuVar);
        bvx bvxVar = new bvx();
        bvxVar.A();
        bwkVar.f(bvxVar);
        this.f = bwkVar;
        this.g = new Runnable() { // from class: njd
            @Override // java.lang.Runnable
            public final void run() {
                njf njfVar = njf.this;
                nkxVar.b(njfVar, njfVar.j.a);
            }
        };
        boolean aa = yjk.aa(context);
        slimMetadataButtonContainerLayout.b = aa;
        slimMetadataButtonContainerLayout.requestLayout();
        slimMetadataButtonContainerLayout.a = true != aa ? 5 : 6;
        slimMetadataButtonContainerLayout.requestLayout();
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.njq
    protected final void d() {
        this.d.a(!this.l.f);
        this.e.e(((auvz) this.k).c, this.l.c(), this.j);
        this.e.g();
        this.a.post(this.g);
    }

    @Override // defpackage.njq
    protected final void e() {
        bwh.c(this.c);
        this.a.removeCallbacks(this.g);
        this.e.f();
    }

    @Override // defpackage.nkw
    public final View g() {
        return this.e.a();
    }

    @Override // defpackage.nkw
    public final View h() {
        return this.e.b();
    }

    @Override // defpackage.nkw
    public final arej i() {
        muu c = this.e.c();
        if (c != null) {
            return c.j();
        }
        return null;
    }

    @Override // defpackage.nkw
    public final arej j() {
        auvz auvzVar = (auvz) this.k;
        if ((auvzVar.b & 2) == 0) {
            return null;
        }
        auvq auvqVar = auvzVar.e;
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
        auvz auvzVar = (auvz) this.k;
        if ((auvzVar.b & 1) == 0) {
            return null;
        }
        auvq auvqVar = auvzVar.d;
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
        return this.e.d(this.l.c()) != null;
    }

    @Override // defpackage.nkw
    public final boolean o() {
        return this.c.isShown();
    }

    @Override // defpackage.njq, defpackage.ohu
    public final void oK() {
        bwh.b(this.c, this.f);
        this.d.a(!this.l.f);
    }
}
