package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmm extends wlk {
    public long a;
    public wml b;
    private atuq c;
    private CountDownTimer d;

    private final View o(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i;
        aqyg aqygVar;
        View inflate = layoutInflater.inflate(R.layout.verification_result_success_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        atuq atuqVar = this.c;
        if (atuqVar != null && (i = atuqVar.b & 1) != 0) {
            if (i != 0) {
                aqygVar = atuqVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        return inflate;
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.d.cancel();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        long j = this.a;
        if (j == 0) {
            j = 3000;
        }
        wmk wmkVar = new wmk(this, j);
        this.d = wmkVar;
        wmkVar.start();
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putLong("SAVED_TIME_REMAINING_MILLIS", this.a);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.c = (atuq) aonm.parseFrom(atuq.a, byteArray, aomw.b());
            } catch (aoob e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        if (bundle != null) {
            this.a = bundle.getLong("SAVED_TIME_REMAINING_MILLIS");
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        Context f = wcy.f(C());
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(f);
        FrameLayout frameLayout = new FrameLayout(f);
        frameLayout.addView(o(frameLayout, cloneInContext));
        return frameLayout;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci C = C();
        View view = this.O;
        if (C == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        Bundle bundle = new Bundle();
        LayoutInflater cloneInContext = ((LayoutInflater) C.getSystemService("layout_inflater")).cloneInContext(wcy.f(C));
        mQ(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View o = o(viewGroup, cloneInContext);
        viewGroup.removeAllViews();
        viewGroup.addView(o);
    }
}
