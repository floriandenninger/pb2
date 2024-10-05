package defpackage;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.youtube.R;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hda implements hxa {
    public static final acsc a = acsb.c(128637);
    public final aok b;
    public final LinearLayout c;
    public final EditorButtonView d;
    public final EditorButtonView e;
    public final List f;
    public final List g;
    public final Map h;
    public final View[] i;
    public final View[] j;
    public final Handler k;
    public EditorButtonView l;
    final String m;
    public int n = 0;
    public boolean o;
    public boolean p;
    public final vgz q;
    public final jqr r;
    private final LinearLayout s;
    private final View t;
    private final View u;
    private final Map v;

    public hda(aok aokVar, final jqr jqrVar, vgz vgzVar, String str, View view, View[] viewArr, byte[] bArr) {
        final int i = 0;
        this.b = aokVar;
        jqrVar.getClass();
        this.r = jqrVar;
        vgzVar.getClass();
        this.q = vgzVar;
        this.m = str;
        this.i = viewArr;
        this.j = new View[9];
        this.k = new Handler();
        final int i2 = 1;
        this.o = true;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.v = new HashMap();
        this.h = new HashMap();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.shorts_camera_toolbar_buttons);
        this.c = linearLayout;
        this.s = (LinearLayout) linearLayout.findViewById(R.id.shorts_camera_toolbar_expanded_buttons);
        EditorButtonView editorButtonView = (EditorButtonView) linearLayout.findViewById(R.id.shorts_expandy_toolbar_more);
        this.d = editorButtonView;
        EditorButtonView editorButtonView2 = (EditorButtonView) view.findViewById(R.id.shorts_expandy_toolbar_collapse);
        this.e = editorButtonView2;
        this.t = view.findViewById(R.id.collapsed_toolbar_scrim);
        View findViewById = view.findViewById(R.id.expanded_toolbar_scrim);
        this.u = findViewById;
        final byte[] bArr2 = null;
        editorButtonView.setOnClickListener(new View.OnClickListener(this, jqrVar, i2, bArr2) { // from class: hcw
            public final /* synthetic */ hda a;
            public final /* synthetic */ jqr b;
            private final /* synthetic */ int c;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = this.c;
                if (i3 == 0) {
                    hda hdaVar = this.a;
                    this.b.a(hdaVar.e.d).b();
                    hdaVar.e();
                    return;
                }
                if (i3 == 1) {
                    hda hdaVar2 = this.a;
                    this.b.a(hdaVar2.d.d).b();
                    hdaVar2.r.a(hda.a).e();
                    hdaVar2.n = 1;
                    hdaVar2.d.getLocationOnScreen(new int[2]);
                    hdaVar2.g();
                    hdaVar2.f(r1[1]);
                    hdaVar2.k.removeCallbacksAndMessages(null);
                    hdaVar2.b(true, hdaVar2.o);
                    hdaVar2.c();
                    for (int i4 = 0; i4 < 9; i4++) {
                        if (hdaVar2.i[i4].getVisibility() == 0) {
                            hdaVar2.j[i4] = hdaVar2.i[i4];
                        } else {
                            hdaVar2.j[i4] = null;
                        }
                    }
                    fhe.J(hdaVar2.j);
                    boolean z = false;
                    for (EditorButtonView editorButtonView3 : hdaVar2.g) {
                        String str2 = editorButtonView3.e;
                        if (str2 != null && ((Integer) Map.EL.getOrDefault(hdaVar2.h, str2, 0)).intValue() == 0 && hda.k(editorButtonView3)) {
                            hdaVar2.h.put(editorButtonView3.e, 1);
                            z = true;
                        }
                    }
                    hdaVar2.i();
                    if (z) {
                        hda.j(hdaVar2.q, hdaVar2.h);
                        return;
                    }
                    return;
                }
                hda hdaVar3 = this.a;
                this.b.a(hda.a).b();
                hdaVar3.e();
            }
        });
        editorButtonView2.setOnClickListener(new View.OnClickListener(this, jqrVar, i, bArr2) { // from class: hcw
            public final /* synthetic */ hda a;
            public final /* synthetic */ jqr b;
            private final /* synthetic */ int c;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = this.c;
                if (i3 == 0) {
                    hda hdaVar = this.a;
                    this.b.a(hdaVar.e.d).b();
                    hdaVar.e();
                    return;
                }
                if (i3 == 1) {
                    hda hdaVar2 = this.a;
                    this.b.a(hdaVar2.d.d).b();
                    hdaVar2.r.a(hda.a).e();
                    hdaVar2.n = 1;
                    hdaVar2.d.getLocationOnScreen(new int[2]);
                    hdaVar2.g();
                    hdaVar2.f(r1[1]);
                    hdaVar2.k.removeCallbacksAndMessages(null);
                    hdaVar2.b(true, hdaVar2.o);
                    hdaVar2.c();
                    for (int i4 = 0; i4 < 9; i4++) {
                        if (hdaVar2.i[i4].getVisibility() == 0) {
                            hdaVar2.j[i4] = hdaVar2.i[i4];
                        } else {
                            hdaVar2.j[i4] = null;
                        }
                    }
                    fhe.J(hdaVar2.j);
                    boolean z = false;
                    for (EditorButtonView editorButtonView3 : hdaVar2.g) {
                        String str2 = editorButtonView3.e;
                        if (str2 != null && ((Integer) Map.EL.getOrDefault(hdaVar2.h, str2, 0)).intValue() == 0 && hda.k(editorButtonView3)) {
                            hdaVar2.h.put(editorButtonView3.e, 1);
                            z = true;
                        }
                    }
                    hdaVar2.i();
                    if (z) {
                        hda.j(hdaVar2.q, hdaVar2.h);
                        return;
                    }
                    return;
                }
                hda hdaVar3 = this.a;
                this.b.a(hda.a).b();
                hdaVar3.e();
            }
        });
        final int i3 = 2;
        findViewById.setOnClickListener(new View.OnClickListener(this, jqrVar, i3, bArr2) { // from class: hcw
            public final /* synthetic */ hda a;
            public final /* synthetic */ jqr b;
            private final /* synthetic */ int c;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i32 = this.c;
                if (i32 == 0) {
                    hda hdaVar = this.a;
                    this.b.a(hdaVar.e.d).b();
                    hdaVar.e();
                    return;
                }
                if (i32 == 1) {
                    hda hdaVar2 = this.a;
                    this.b.a(hdaVar2.d.d).b();
                    hdaVar2.r.a(hda.a).e();
                    hdaVar2.n = 1;
                    hdaVar2.d.getLocationOnScreen(new int[2]);
                    hdaVar2.g();
                    hdaVar2.f(r1[1]);
                    hdaVar2.k.removeCallbacksAndMessages(null);
                    hdaVar2.b(true, hdaVar2.o);
                    hdaVar2.c();
                    for (int i4 = 0; i4 < 9; i4++) {
                        if (hdaVar2.i[i4].getVisibility() == 0) {
                            hdaVar2.j[i4] = hdaVar2.i[i4];
                        } else {
                            hdaVar2.j[i4] = null;
                        }
                    }
                    fhe.J(hdaVar2.j);
                    boolean z = false;
                    for (EditorButtonView editorButtonView3 : hdaVar2.g) {
                        String str2 = editorButtonView3.e;
                        if (str2 != null && ((Integer) Map.EL.getOrDefault(hdaVar2.h, str2, 0)).intValue() == 0 && hda.k(editorButtonView3)) {
                            hdaVar2.h.put(editorButtonView3.e, 1);
                            z = true;
                        }
                    }
                    hdaVar2.i();
                    if (z) {
                        hda.j(hdaVar2.q, hdaVar2.h);
                        return;
                    }
                    return;
                }
                hda hdaVar3 = this.a;
                this.b.a(hda.a).b();
                hdaVar3.e();
            }
        });
        jqrVar.a(a).a();
        n(linearLayout);
        g();
        ynm.n(aokVar, vgzVar.a(), ept.l, new hcx(this, i2));
    }

    public static TimeInterpolator a() {
        return new anp();
    }

    public static void j(vgz vgzVar, java.util.Map map) {
        vgzVar.b(new vqy(map, 1), angq.a);
    }

    public static final boolean k(EditorButtonView editorButtonView) {
        return editorButtonView.getVisibility() == 0 && ((ViewGroup) editorButtonView.getParent()).getVisibility() == 0;
    }

    public static final void l(EditorButtonView editorButtonView) {
        fhe.H(editorButtonView.a, false);
    }

    public static final void m(EditorButtonView editorButtonView) {
        fhe.H(editorButtonView.a, true);
    }

    private final void n(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof EditorButtonView) {
                EditorButtonView editorButtonView = (EditorButtonView) viewGroup.getChildAt(i);
                editorButtonView.c = this;
                if (editorButtonView.d != null) {
                    boolean k = k(editorButtonView);
                    this.v.put(editorButtonView, Boolean.valueOf(k));
                    hfq a2 = this.r.a(editorButtonView.d);
                    a2.h(k);
                    a2.a();
                }
                if (viewGroup == this.c) {
                    this.f.add(editorButtonView);
                } else {
                    this.g.add(editorButtonView);
                }
            } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                n((ViewGroup) viewGroup.getChildAt(i));
            }
        }
    }

    public final void c() {
        View view;
        int i = this.n;
        View view2 = i == 0 ? this.u : this.t;
        if (i == 0) {
            view = this.t;
        } else {
            view = this.u;
        }
        view2.animate().cancel();
        view2.animate().alpha(0.0f).setDuration(200L).setListener(new hcy(view2)).start();
        view.animate().cancel();
        view.animate().alpha(1.0f).setDuration(200L).setListener(new hcz(view)).start();
    }

    public final void d(EditorButtonView editorButtonView) {
        boolean k = k(editorButtonView);
        if (editorButtonView.d == null || !this.v.containsKey(editorButtonView) || k == ((Boolean) this.v.get(editorButtonView)).booleanValue()) {
            return;
        }
        this.v.put(editorButtonView, Boolean.valueOf(k));
        hfq a2 = this.r.a(editorButtonView.d);
        a2.h(k);
        a2.g();
    }

    public final void e() {
        this.r.a(a).d();
        this.n = 0;
        this.e.getLocationOnScreen(new int[2]);
        h(0.0f);
        f(r1[1]);
        b(false, this.o);
        c();
        fhe.I(this.j);
    }

    public final void f(final float f) {
        int i = this.n;
        if (i != 0) {
            for (EditorButtonView editorButtonView : this.g) {
                if (editorButtonView.getVisibility() == 0 && editorButtonView != this.e) {
                    editorButtonView.setAlpha(0.0f);
                }
            }
        }
        final EditorButtonView editorButtonView2 = i != 0 ? this.e : this.d;
        editorButtonView2.setAlpha(0.0f);
        this.s.setVisibility(1 != i ? 8 : 0);
        this.c.post(new Runnable() { // from class: hct
            @Override // java.lang.Runnable
            public final void run() {
                hda hdaVar = hda.this;
                EditorButtonView editorButtonView3 = editorButtonView2;
                float f2 = f;
                EditorButtonView editorButtonView4 = hdaVar.l;
                if (editorButtonView4 != null) {
                    editorButtonView4.clearAnimation();
                    ImageView imageView = hdaVar.l.b;
                    if (imageView != null) {
                        imageView.clearAnimation();
                    }
                }
                editorButtonView3.getClass();
                hdaVar.l = editorButtonView3;
                hdaVar.l.getLocationOnScreen(new int[2]);
                hdaVar.l.setTranslationY(f2 - r1[1]);
                hdaVar.l.setAlpha(1.0f);
                hdaVar.l.animate().translationY(0.0f).setInterpolator(hda.a()).setDuration(200L).start();
                EditorButtonView editorButtonView5 = hdaVar.l;
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) editorButtonView5.getResources().getDrawable(editorButtonView5 == hdaVar.e ? R.drawable.ic_expandy_collapse_anim : R.drawable.ic_expandy_expand_anim);
                hdaVar.l.b.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
            }
        });
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            d((EditorButtonView) it.next());
        }
    }

    public final void g() {
        h(1.0f);
    }

    final void h(float f) {
        this.d.setAlpha(1.0f);
        if (this.n == 1) {
            this.d.setVisibility(8);
            return;
        }
        for (EditorButtonView editorButtonView : this.g) {
            if (editorButtonView != this.e && editorButtonView.getVisibility() == 0) {
                this.d.setAlpha(f);
                this.d.setVisibility(0);
                i();
                return;
            }
        }
        this.d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        Iterator it = this.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EditorButtonView editorButtonView = (EditorButtonView) it.next();
            String str = editorButtonView.e;
            if (str != null) {
                editorButtonView.d(((Integer) Map.EL.getOrDefault(this.h, str, 0)).intValue() != 2);
            }
        }
        boolean z = false;
        for (EditorButtonView editorButtonView2 : this.g) {
            String str2 = editorButtonView2.e;
            if (str2 != null) {
                int intValue = ((Integer) Map.EL.getOrDefault(this.h, str2, 0)).intValue();
                if (intValue == 2) {
                    editorButtonView2.d(false);
                } else {
                    editorButtonView2.d(true);
                    if (intValue == 0 && editorButtonView2.getVisibility() == 0) {
                        z = true;
                    }
                }
            }
        }
        this.d.d(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final boolean z, boolean z2) {
        this.p = z || !z2;
        ArrayList arrayList = new ArrayList();
        if (z || z2) {
            for (EditorButtonView editorButtonView : this.f) {
                if (editorButtonView.getVisibility() == 0) {
                    arrayList.add(new Pair(editorButtonView, false));
                }
            }
        } else if (!this.f.isEmpty()) {
            arrayList.add(new Pair((EditorButtonView) this.f.get(0), false));
        }
        for (EditorButtonView editorButtonView2 : this.g) {
            if (editorButtonView2.getVisibility() == 0) {
                arrayList.add(new Pair(editorButtonView2, Boolean.valueOf(editorButtonView2 != this.e && z)));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 8;
        if (!z) {
            Collections.reverse(arrayList);
            this.d.a.setVisibility(8);
        }
        TimeInterpolator a2 = a();
        float size = 1.0f / arrayList.size();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int round = Math.round(a2.getInterpolation(i2 * size) * 200.0f);
            boolean booleanValue = ((Boolean) ((Pair) arrayList.get(i2)).second).booleanValue();
            final View view = booleanValue ? (View) ((Pair) arrayList.get(i2)).first : ((EditorButtonView) ((Pair) arrayList.get(i2)).first).a;
            if ((!z || view.getAlpha() != 1.0f || view.getVisibility() != 0) && (z || view.getVisibility() != i)) {
                view.setAlpha(true != z ? 1.0f : 0.0f);
                view.setVisibility(0);
                if (booleanValue) {
                    ((EditorButtonView) view).a.setVisibility(0);
                }
                view.animate().alpha(true == z ? 1.0f : 0.0f).setDuration(150L).setStartDelay(round).withEndAction(new Runnable() { // from class: hcv
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z3 = z;
                        View view2 = view;
                        acsc acscVar = hda.a;
                        if (z3) {
                            return;
                        }
                        view2.setVisibility(8);
                        view2.setAlpha(1.0f);
                    }
                }).start();
            }
            i2++;
            i = 8;
        }
        if (z || z2) {
            return;
        }
        TextView textView = this.d.a;
        textView.setAlpha(1.0f);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).setDuration(150L).setStartDelay(200L).start();
    }
}
