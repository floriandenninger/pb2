package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nov implements nqb {
    private final Context a;
    private final ajjz b;
    private final apbr c;
    private View d;

    public nov(Context context, ajjz ajjzVar, apbr apbrVar) {
        this.a = context;
        this.b = ajjzVar;
        this.c = apbrVar;
    }

    @Override // defpackage.nqb
    public final View a() {
        return null;
    }

    @Override // defpackage.nqb
    public final View b() {
        avgg avggVar;
        aqyg aqygVar;
        if (this.d == null) {
            aqyg aqygVar2 = null;
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_title_header, (ViewGroup) null, false);
            this.d = inflate;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.thumbnail);
            ajjz ajjzVar = this.b;
            apbr apbrVar = this.c;
            if ((apbrVar.b & 2) != 0) {
                avggVar = apbrVar.d;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
            } else {
                avggVar = null;
            }
            ajjzVar.h(imageView, avggVar);
            TextView textView = (TextView) this.d.findViewById(R.id.title);
            apbr apbrVar2 = this.c;
            if ((apbrVar2.b & 1) != 0) {
                aqygVar = apbrVar2.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = (TextView) this.d.findViewById(R.id.subtitle);
            apbr apbrVar3 = this.c;
            if ((apbrVar3.b & 4) != 0 && (aqygVar2 = apbrVar3.e) == null) {
                aqygVar2 = aqyg.a;
            }
            textView2.setText(ajcq.b(aqygVar2));
        }
        return this.d;
    }

    @Override // defpackage.nqb
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nqb
    public final void d() {
    }

    @Override // defpackage.nqb
    public final void e(boolean z) {
    }

    @Override // defpackage.nqb
    public final void f(boolean z) {
    }

    @Override // defpackage.nqb
    public final void g(auwh auwhVar) {
    }

    @Override // defpackage.nqb
    public final void h(nqe nqeVar) {
    }

    @Override // defpackage.nqb
    public final void i(nqc nqcVar) {
    }

    @Override // defpackage.nqb
    public final void j(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final void k(CharSequence charSequence) {
    }

    @Override // defpackage.nqb
    public final boolean l() {
        return true;
    }

    @Override // defpackage.nqb
    public final void m(nqr nqrVar) {
    }
}
