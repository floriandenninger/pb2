package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class khv implements kjt, aida, kig {
    public View a;
    public View b;
    public final Context c;
    public final koe d;
    public final SuggestedActionsMainController e;
    public final azrh f = azrh.e();
    public final azrh g = azrh.e();
    public final azrh h = azrh.e();
    public final Set i = new HashSet();
    public int j;
    public boolean k;
    public final aadw l;
    public yzr m;
    public yzr n;
    private final kjw o;
    private final aicz p;
    private final boolean q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public khv(Context context, koe koeVar, kjw kjwVar, SuggestedActionsMainController suggestedActionsMainController, aicz aiczVar, kng kngVar, aadw aadwVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        Boolean bool;
        this.c = context;
        this.o = kjwVar;
        this.e = suggestedActionsMainController;
        this.p = aiczVar;
        this.d = koeVar;
        this.l = aadwVar;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45352333L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352333L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352333L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        this.r = !bool.booleanValue();
        this.j = context.getResources().getInteger(R.integer.fade_duration_fast);
        asvu asvuVar = aadwVar.b().e;
        this.q = (asvuVar == null ? asvu.a : asvuVar).bC;
        kngVar.h.n().J().X(new khs(this, 1));
        kjwVar.g = this;
        aiczVar.c.a(this);
        koeVar.a(new kod() { // from class: khq
            @Override // defpackage.kod
            public final void a(View view) {
                khv khvVar = khv.this;
                if (khvVar.m == null || khvVar.a == null) {
                    khvVar.a = view.findViewById(R.id.youtube_controls_bottom_ui_container);
                    khvVar.m = new yzr((ViewGroup) view.findViewById(R.id.bottom_end_container), khvVar.j, 8);
                    khvVar.n = new yzr((ViewGroup) khvVar.a.findViewById(R.id.suggested_actions_container), khvVar.j, 8);
                    asvu asvuVar2 = khvVar.l.b().e;
                    if (asvuVar2 == null) {
                        asvuVar2 = asvu.a;
                    }
                    if (asvuVar2.aZ) {
                        yny.z(khvVar.a, yny.t(3), RelativeLayout.LayoutParams.class);
                        ah ahVar = new ah();
                        ahVar.d((ConstraintLayout) khvVar.a);
                        ahVar.a.remove(Integer.valueOf(R.id.suggested_actions_container));
                        ahVar.f(R.id.suggested_actions_container, 4, 0, 4, khvVar.c.getResources().getDimensionPixelSize(R.dimen.suggested_actions_container_bottom_margin));
                        ahVar.e(R.id.suggested_actions_container, 6, 0, 6);
                        ahVar.e(R.id.suggested_actions_container, 7, 0, 7);
                        ahVar.a(R.id.suggested_actions_container).c = -2;
                        ahVar.a(R.id.suggested_actions_container).b = 0;
                        ahVar.b((ConstraintLayout) khvVar.a);
                    }
                    asvu asvuVar3 = khvVar.l.b().e;
                    if (asvuVar3 == null) {
                        asvuVar3 = asvu.a;
                    }
                    if (asvuVar3.bd) {
                        ah ahVar2 = new ah();
                        ahVar2.d((ConstraintLayout) khvVar.a);
                        int[] iArr = {R.id.timestamps_container, R.id.time_bar_chapter_title_container, R.id.bottom_end_container, R.id.fullscreen_button, R.id.chapter_title_anchor};
                        for (int i = 0; i < 5; i++) {
                            ahVar2.e(iArr[i], 4, R.id.time_bar_reference_view, 4);
                        }
                        ahVar2.f(R.id.suggested_actions_container, 4, 0, 4, 0);
                        ahVar2.b((ConstraintLayout) khvVar.a);
                    }
                    khvVar.b = khvVar.a.findViewById(R.id.time_bar_reference_view);
                    khvVar.f.ax(new khs(khvVar, 2));
                    khvVar.g.ax(new khs(khvVar, 3));
                    azrh azrhVar = khvVar.h;
                    View view2 = khvVar.a;
                    view2.getClass();
                    azrhVar.ax(new mbg(view2, 1));
                    Iterator it = khvVar.i.iterator();
                    while (it.hasNext()) {
                        khvVar.a((View) it.next());
                    }
                    khvVar.i.clear();
                }
            }
        });
        azrw azrwVar = new azrw() { // from class: khu
            @Override // defpackage.azrw
            public final Object get() {
                khv khvVar = khv.this;
                khvVar.d.b();
                return khvVar.n;
            }
        };
        int i = this.j;
        aypn k = aypn.k(new aypp() { // from class: khr
            @Override // defpackage.aypp
            public final void a(final aypo aypoVar) {
                aypoVar.si(khv.this.f.ax(new ayrs() { // from class: kht
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        aypo.this.d((Integer) obj);
                    }
                }));
            }
        }, aypg.BUFFER);
        suggestedActionsMainController.l = azrwVar;
        suggestedActionsMainController.n = k;
        suggestedActionsMainController.k = i;
        suggestedActionsMainController.o = null;
        suggestedActionsMainController.h = null;
        suggestedActionsMainController.i().ax(new khs(this, 0));
    }

    private final void t(boolean z) {
        boolean z2 = false;
        if (this.s && this.o.d() && !this.x && !this.y) {
            z2 = true;
        }
        if (z2) {
            this.d.b();
        }
        yzr yzrVar = this.m;
        if (yzrVar == null) {
            return;
        }
        yzrVar.a(z2, z);
    }

    private final void u() {
        int i = 0;
        if (!this.o.d() && !this.y && (!this.r || !this.x)) {
            i = this.c.getResources().getDimensionPixelOffset(R.dimen.controls_overlay_bottom_ui_text_side_margin);
        }
        this.g.c(Integer.valueOf(i));
    }

    public final void a(View view) {
        yzr yzrVar = this.m;
        if (yzrVar == null) {
            this.i.add(view);
        } else {
            ((ViewGroup) yzrVar.b).addView(view, Math.max(0, r0.getChildCount() - 1));
        }
    }

    public final void b() {
        int i;
        int i2 = 0;
        if (!this.t) {
            i = this.c.getResources().getDimensionPixelSize(R.dimen.timestamp_fullscreen_bottom_padding);
        } else {
            i = this.p.c.g() ? this.p.e : 0;
        }
        if (this.t || this.v) {
            i2 = (!this.u || this.k) ? i : this.c.getResources().getDimensionPixelSize(R.dimen.grouped_timestamps_fullscreen_bottom_padding) + i;
        }
        this.f.c(Integer.valueOf(i2));
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        if (i != i2) {
            t(false);
            b();
        }
    }

    @Override // defpackage.kjt
    public final void f(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        u();
        t(false);
    }

    @Override // defpackage.kig
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        SuggestedActionsMainController suggestedActionsMainController = this.e;
        boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        suggestedActionsMainController.g = a;
        suggestedActionsMainController.o(!a, false);
        boolean z = this.u;
        boolean z2 = controlsOverlayStyle.s;
        if (z != z2) {
            this.u = z2;
            b();
        }
    }

    @Override // defpackage.kig
    public final void m(fhg fhgVar) {
        if (this.t != fhgVar.b()) {
            this.t = fhgVar.b();
            b();
        }
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final void nB(zcp zcpVar) {
        boolean z = this.v;
        boolean z2 = zcpVar instanceof zcs;
        this.v = z2;
        if (z == z2) {
            return;
        }
        b();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
        this.h.c(Float.valueOf(1.0f - aii.d(f)));
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final void nY(boolean z) {
        View view;
        if (!this.q || this.z == z || (view = this.a) == null) {
            return;
        }
        this.z = z;
        view.setVisibility(true != z ? 0 : 8);
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (this.s) {
            this.s = false;
            t(z);
        }
    }

    @Override // defpackage.kig
    public final void p(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        u();
        t(true);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final void r(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        t(true);
        if (this.r) {
            u();
        }
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        t(z);
    }
}
