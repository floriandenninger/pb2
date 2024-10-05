package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactSuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideosHeaderRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgb implements wnb {
    public final mfx a;
    private final ajos b;
    private avbe c;
    private boolean d;
    private View e;
    private ViewGroup f;
    private ViewGroup g;

    public mgb(mfx mfxVar, mfz mfzVar, mfz mfzVar2, mfz mfzVar3, byte[] bArr) {
        this.a = mfxVar;
        ajnq ajnqVar = new ajnq();
        this.b = ajnqVar;
        ajnqVar.f(avbf.class, mfzVar);
        ajnqVar.f(avbd.class, mfzVar2);
        ajnqVar.f(aqcw.class, mfzVar3);
    }

    private final View b(Object obj, ajok ajokVar, ViewGroup viewGroup) {
        ajom r = ahbw.r(this.b, obj, viewGroup);
        if (r == null) {
            return null;
        }
        View a = r.a();
        ahbw.x(a, r, this.b.c(obj));
        r.oB(ajokVar, obj);
        return a;
    }

    private final void c(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeView(childAt);
            this.b.b(childAt);
        }
    }

    private final void g(View view) {
        if (view != null) {
            whu.z(view, R.id.suggested_videos_companion_card_stub, R.id.suggested_videos_companion_card).setVisibility(8);
        }
        j();
        c(this.f);
        c(this.g);
    }

    private final void j() {
        View view = this.e;
        if (view != null) {
            whu.I(view, this.d);
        }
    }

    @Override // defpackage.wmz
    public final void a() {
        j();
    }

    @Override // defpackage.wmz
    public final void d(View view, ajok ajokVar) {
        apxf apxfVar;
        apxf apxfVar2;
        apxf apxfVar3;
        View z = whu.z(view, R.id.suggested_videos_companion_card_stub, R.id.suggested_videos_companion_card);
        this.e = z;
        this.f = (ViewGroup) z.findViewById(R.id.header);
        this.g = (ViewGroup) this.e.findViewById(R.id.videos);
        g(view);
        aulq aulqVar = this.c.c;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        avbf avbfVar = (avbf) ahbj.n(aulqVar, SuggestedVideosHeaderRendererOuterClass.suggestedVideosHeaderRenderer);
        apxf apxfVar4 = null;
        if (avbfVar != null) {
            View b = b(avbfVar, ajokVar, this.f);
            this.f.addView(b);
            mfx mfxVar = this.a;
            byte[] I = avbfVar.i.I();
            if ((avbfVar.b & 16) != 0) {
                apxfVar3 = avbfVar.g;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
            } else {
                apxfVar3 = null;
            }
            mfxVar.j(avbfVar, b, I, apxfVar3);
        }
        ajok ajokVar2 = new ajok();
        int i = 0;
        while (i < this.c.d.size()) {
            ajokVar2.i(ajokVar);
            ajokVar2.f("isLastVideo", Boolean.valueOf(i == this.c.d.size() + (-1)));
            avbd avbdVar = (avbd) ahbj.n((aulq) this.c.d.get(i), SuggestedVideoRendererOuterClass.suggestedVideoRenderer);
            if (avbdVar != null) {
                View b2 = b(avbdVar, ajokVar2, this.g);
                this.g.addView(b2);
                mfx mfxVar2 = this.a;
                byte[] I2 = avbdVar.k.I();
                if ((avbdVar.b & 64) != 0) {
                    apxfVar2 = avbdVar.i;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                } else {
                    apxfVar2 = null;
                }
                mfxVar2.j(avbdVar, b2, I2, apxfVar2);
            }
            aqcw aqcwVar = (aqcw) ahbj.n((aulq) this.c.d.get(i), CompactSuggestedVideoRendererOuterClass.compactSuggestedVideoRenderer);
            if (aqcwVar != null) {
                View b3 = b(aqcwVar, ajokVar2, this.g);
                this.g.addView(b3);
                mfx mfxVar3 = this.a;
                byte[] I3 = aqcwVar.j.I();
                if ((aqcwVar.b & 32) != 0) {
                    apxfVar = aqcwVar.h;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = null;
                }
                mfxVar3.j(aqcwVar, b3, I3, apxfVar);
            }
            i++;
        }
        mfx mfxVar4 = this.a;
        avbe avbeVar = this.c;
        View view2 = this.e;
        byte[] I4 = avbeVar.f.I();
        avbe avbeVar2 = this.c;
        if ((avbeVar2.b & 2) != 0 && (apxfVar4 = avbeVar2.e) == null) {
            apxfVar4 = apxf.a;
        }
        mfxVar4.j(avbeVar, view2, I4, apxfVar4);
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        mfx mfxVar = this.a;
        mfxVar.a.clear();
        mfxVar.b.clear();
        this.c = null;
        this.d = false;
        g(view);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.d = true;
        j();
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        avbe avbeVar;
        if ((aqdeVar.b & 128) != 0) {
            avbeVar = aqdeVar.j;
            if (avbeVar == null) {
                avbeVar = avbe.a;
            }
        } else {
            avbeVar = null;
        }
        this.c = avbeVar;
        return avbeVar != null;
    }
}
