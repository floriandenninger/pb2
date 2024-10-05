package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njc extends njq {
    public final ViewGroup a;
    private final Context b;
    private final akbd c;
    private final bwd d;
    private mvw e;
    private mvw f;
    private mvw g;
    private mvw h;
    private final aadw i;
    private final nrp m;

    public njc(Context context, nrp nrpVar, akbd akbdVar, aadw aadwVar, byte[] bArr) {
        this.b = context;
        this.m = nrpVar;
        this.c = akbdVar;
        this.i = aadwVar;
        this.a = new FrameLayout(context);
        bvx bvxVar = new bvx();
        bvxVar.y(R.id.channel_subscribers);
        bvxVar.y(R.id.channel_subscribers_long);
        this.d = bvxVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.njq
    protected final void d() {
        int bl;
        auvs auvsVar = (auvs) this.k;
        ajok ajokVar = this.j;
        atco atcoVar = auvsVar.m;
        if (atcoVar == null) {
            atcoVar = atco.a;
        }
        if (atcoVar.b == 65153809) {
            mvw mvwVar = this.g;
            if (mvwVar == null) {
                if (evr.ar(this.i)) {
                    this.g = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_with_sponsorship_reduced_margins, this.a, false));
                } else {
                    this.g = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_with_sponsorship, this.a, false));
                }
                mvwVar = this.g;
            }
            this.e = mvwVar;
        } else {
            int i = auvsVar.b;
            if ((i & 4) != 0 || ((i & 32768) != 0 && (bl = aobq.bl(auvsVar.n)) != 0 && bl == 3)) {
                mvw mvwVar2 = this.h;
                if (mvwVar2 == null) {
                    if (evr.ar(this.i)) {
                        this.h = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_autotagging_reduced_margins, this.a, false));
                    } else {
                        this.h = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_autotagging, this.a, false));
                    }
                    mvwVar2 = this.h;
                }
                this.e = mvwVar2;
            } else {
                mvw mvwVar3 = this.f;
                if (mvwVar3 == null) {
                    if (evr.ar(this.i)) {
                        this.f = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_default_reduced_margins, this.a, false));
                    } else {
                        this.f = this.m.b(LayoutInflater.from(this.b).inflate(R.layout.slim_owner_default, this.a, false));
                    }
                    View findViewById = this.f.a.findViewById(R.id.channel_navigation_container);
                    if (findViewById != null) {
                        this.c.b(findViewById, this.c.a(findViewById, null));
                    }
                    mvwVar3 = this.f;
                }
                this.e = mvwVar3;
            }
        }
        this.k = this.e.d(auvsVar.toBuilder(), this.l.f, ajokVar.a, (ajwx) ajokVar.c("sectionListController"));
        this.a.removeAllViews();
        this.a.addView(this.e.a);
    }

    @Override // defpackage.njq
    protected final void e() {
        bwh.c(this.a);
        mvw mvwVar = this.e;
        if (mvwVar != null) {
            mvwVar.a();
        }
        mvw mvwVar2 = this.f;
        if (mvwVar2 != null) {
            mvwVar2.a();
        }
        mvw mvwVar3 = this.g;
        if (mvwVar3 != null) {
            mvwVar3.a();
        }
        mvw mvwVar4 = this.h;
        if (mvwVar4 != null) {
            mvwVar4.a();
        }
    }

    @Override // defpackage.njq, defpackage.ohu
    public final void oK() {
        bwh.b(this.a, this.d);
        ajok ajokVar = this.j;
        this.k = this.e.d(((auvs) this.k).toBuilder(), this.l.f, ajokVar.a, (ajwx) ajokVar.c("sectionListController"));
    }
}
