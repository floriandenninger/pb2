package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acir extends achi {
    public acra a;
    public sqq b;
    private aqrf c;
    private View d;
    private ScrollView e;

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.a;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        if (bundle2.containsKey("ARG_ENDSCREEN_RENDERER")) {
            this.c = (aqrf) amkq.ck(bundle2, "ARG_ENDSCREEN_RENDERER", aqrf.a, aomw.b());
        }
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(C());
        frameLayout.addView(q(viewGroup));
        return frameLayout;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.O;
        if (view instanceof ViewGroup) {
            new Bundle();
            ViewGroup viewGroup = (ViewGroup) view;
            View q = q(viewGroup);
            viewGroup.removeAllViews();
            viewGroup.addView(q);
        }
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(26108);
    }

    public final View q(ViewGroup viewGroup) {
        View inflate = C().getLayoutInflater().inflate(R.layout.lc_post_costream_fragment, viewGroup, false);
        this.d = inflate.findViewById(R.id.post_stream_spinner);
        this.e = (ScrollView) inflate.findViewById(R.id.content);
        if (C() != null) {
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            if (this.c != null) {
                sya a = syb.a(this.b.a);
                a.b = "CostreamEndscreenElements";
                a.b(false);
                slj sljVar = new slj(qR(), a.a());
                sljVar.a(this.c.toByteArray());
                this.e.addView(sljVar);
            }
        }
        return inflate;
    }
}
