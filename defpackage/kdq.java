package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kdq extends fxk implements kdh, flm {
    public final acra d;
    public final aahd e;
    private final fln f;
    private final ayqw g;
    private final aioc h;
    private final ajjz i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private DurationBadgeView n;

    public kdq(fln flnVar, aioc aiocVar, acra acraVar, aahd aahdVar, ajjz ajjzVar) {
        flnVar.getClass();
        this.f = flnVar;
        aiocVar.getClass();
        this.h = aiocVar;
        this.d = acraVar;
        this.e = aahdVar;
        ajjzVar.getClass();
        this.i = ajjzVar;
        this.g = new ayqw();
    }

    @Override // defpackage.kdh
    public final ViewGroup.LayoutParams a() {
        ViewStub viewStub = this.c;
        if (viewStub != null) {
            return viewStub.getLayoutParams();
        }
        if (g() == null) {
            return null;
        }
        return g().getLayoutParams();
    }

    @Override // defpackage.kdh
    public final void d(ViewGroup.LayoutParams layoutParams) {
        ViewStub viewStub = this.c;
        if (viewStub != null) {
            viewStub.setLayoutParams(layoutParams);
        } else if (g() != null) {
            g().setLayoutParams(layoutParams);
        }
    }

    @Override // defpackage.fxk
    protected final void i() {
        View g = g();
        this.j = (ImageView) g.findViewById(R.id.thumbnail);
        this.k = (TextView) g.findViewById(R.id.title);
        this.l = (TextView) g.findViewById(R.id.video_title);
        this.m = (TextView) g.findViewById(R.id.byline);
        this.n = (DurationBadgeView) g.findViewById(R.id.duration);
    }

    @Override // defpackage.flm
    public final void kG() {
        this.g.c();
    }

    @Override // defpackage.flm
    public final void kH() {
        this.g.c();
        this.g.d(this.h.ao().G().E(ayqr.a()).Y(new ayrs() { // from class: kdp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                kdq kdqVar = kdq.this;
                WatchNextResponseModel a = ((ahdv) obj).a();
                atzm atzmVar = null;
                atzr atzrVar = a != null ? a.i : null;
                if (atzrVar != null && (atzrVar.b & 1024) != 0) {
                    atzn atznVar = atzrVar.h;
                    if (atznVar == null) {
                        atznVar = atzn.a;
                    }
                    atzmVar = atznVar.c;
                    if (atzmVar == null) {
                        atzmVar = atzm.a;
                    }
                }
                kdqVar.k(atzmVar);
            }
        }, izw.s));
    }

    @Override // defpackage.fxk
    protected final void n() {
        avgg avggVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        atzm atzmVar = (atzm) this.b;
        if (atzmVar == null) {
            return;
        }
        ajjz ajjzVar = this.i;
        ImageView imageView = this.j;
        if ((atzmVar.b & 1024) != 0) {
            avggVar = atzmVar.j;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.k;
        if ((atzmVar.b & 1) != 0) {
            aqygVar = atzmVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.k;
        textView2.setContentDescription(textView2.getText());
        TextView textView3 = this.l;
        if ((atzmVar.b & 2) != 0) {
            aqygVar2 = atzmVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView3.setText(ajcq.b(aqygVar2));
        TextView textView4 = this.l;
        textView4.setContentDescription(textView4.getText());
        TextView textView5 = this.m;
        if ((atzmVar.b & 4) != 0) {
            aqygVar3 = atzmVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        textView5.setText(ajcq.b(aqygVar3));
        TextView textView6 = this.m;
        textView6.setContentDescription(textView6.getText());
        final apmg b = ahbj.b(atzmVar);
        if (b == null || (b.b & 16384) == 0) {
            g().setOnClickListener(null);
            g().setClickable(false);
        } else {
            g().setOnClickListener(new View.OnClickListener() { // from class: kdo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kdq kdqVar = kdq.this;
                    apmg apmgVar = b;
                    if ((apmgVar.b & 1048576) != 0) {
                        kdqVar.d.I(3, new acqx(apmgVar.t), null);
                    }
                    aahd aahdVar = kdqVar.e;
                    apxf apxfVar = apmgVar.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.c(apxfVar, null);
                }
            });
        }
        fkc.m(this.n, null, null, atzmVar.k, null);
    }

    @Override // defpackage.fxk
    protected final void p() {
        if (this.f.b) {
            kH();
        }
        this.f.a(this);
    }
}
