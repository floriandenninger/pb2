package com.google.android.apps.youtube.app.common.player.overlay;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.youtube.R;
import defpackage.ahut;
import defpackage.ahuu;
import defpackage.aivf;
import defpackage.aivi;
import defpackage.amkq;
import defpackage.ayrs;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fhg;
import defpackage.fno;
import defpackage.fnp;
import defpackage.fnr;
import defpackage.jw;
import defpackage.zcb;
import defpackage.zdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubePlayerOverlaysLayout extends aivi implements ahut, zcb, fgp {
    public ViewGroup a;
    public fno b;
    public zdf c;
    private final List d;
    private final Map e;
    private fhg f;

    public YouTubePlayerOverlaysLayout(Context context) {
        super(context);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = fhg.NONE;
        this.c = null;
        this.b = null;
        this.a = null;
    }

    private final void f(fhg fhgVar) {
        zdf zdfVar;
        if (fhgVar.l() || fhgVar.g() || fhgVar.d() || (zdfVar = this.c) == null) {
            zdf zdfVar2 = this.c;
            if (zdfVar2 != null) {
                zdfVar2.c(null);
                return;
            }
            return;
        }
        zdfVar.c(this);
    }

    private final void j() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            fnp fnpVar = (fnp) this.d.get(i);
            if (this.f == fhg.NONE || l(fnpVar) || q(fnpVar) == null) {
                fnpVar.nH(this.f);
            }
        }
    }

    private final void k() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            fnp fnpVar = (fnp) this.d.get(i2);
            View q = q(fnpVar);
            if (q != null) {
                View view = null;
                while (i < getChildCount()) {
                    view = getChildAt(i);
                    if (this.e.get(view) != null) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (l(fnpVar)) {
                    if (q != view) {
                        addView(q, i, fnpVar.c());
                    }
                    i++;
                } else {
                    removeView(q);
                }
            }
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            bringChildToFront(viewGroup);
        }
    }

    private final boolean l(fnp fnpVar) {
        return !this.f.g() && fnpVar.mY(this.f);
    }

    private static final aivf m(aivf aivfVar) {
        return aivfVar instanceof fnr ? ((fnr) aivfVar).a : aivfVar;
    }

    private static final ahuu p(aivf aivfVar) {
        aivf m = m(aivfVar);
        if (m instanceof ahuu) {
            return (ahuu) m;
        }
        return null;
    }

    private static final View q(aivf aivfVar) {
        ahuu p = p(aivfVar);
        if (p == null || p.np()) {
            return aivfVar.ld();
        }
        return null;
    }

    @Override // defpackage.ahut
    public final void d(ahuu ahuuVar, View view) {
        int size = this.d.size();
        int i = 0;
        while (true) {
            if (i < size) {
                aivf aivfVar = (aivf) this.d.get(i);
                if (aivfVar == ahuuVar || aivfVar == m(aivfVar)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        amkq.N(i >= 0);
        this.e.put(view, (fnp) this.d.get(i));
        k();
    }

    @Override // defpackage.zcb
    public final void e(View view) {
        f(this.f);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        fhgVar.getClass();
        if (fhgVar == this.f) {
            return;
        }
        this.f = fhgVar;
        f(fhgVar);
        k();
        j();
        if (fhgVar.k()) {
            jw.V(this, 1);
        } else {
            jw.V(this, 2);
            clearFocus();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewGroup) findViewById(R.id.player_overlays_custom_views_container);
    }

    @Override // defpackage.aivi, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
    }

    @Override // defpackage.aivi, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // defpackage.aivi
    protected final List pC() {
        ArrayList arrayList = new ArrayList();
        fno fnoVar = this.b;
        if (fnoVar != null) {
            arrayList.add(fnoVar.a.X(new ayrs() { // from class: fns
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = YouTubePlayerOverlaysLayout.this;
                    Rect rect = (Rect) obj;
                    if (youTubePlayerOverlaysLayout.m.equals(rect)) {
                        return;
                    }
                    youTubePlayerOverlaysLayout.m.set(rect);
                    youTubePlayerOverlaysLayout.requestLayout();
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aivi
    public final void pD(aivf aivfVar, View view) {
        fnp fnrVar;
        if (aivfVar instanceof fnp) {
            fnrVar = (fnp) aivfVar;
        } else {
            fnrVar = new fnr(aivfVar);
        }
        this.d.add(fnrVar);
        if (view != null) {
            this.e.put(view, fnrVar);
        }
    }

    @Override // defpackage.aivi
    public final void pE(aivf... aivfVarArr) {
        for (aivf aivfVar : aivfVarArr) {
            View q = q(aivfVar);
            ahuu p = p(aivfVar);
            if (q != null || p != null) {
                if (p != null) {
                    p.mZ(this);
                }
                pD(aivfVar, q);
            } else {
                String valueOf = String.valueOf(aivfVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Overlay ");
                sb.append(valueOf);
                sb.append(" does not provide a View");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        k();
        j();
    }

    public YouTubePlayerOverlaysLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = fhg.NONE;
        this.c = null;
        this.b = null;
        this.a = null;
    }
}
