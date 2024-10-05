package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqf extends adps {
    public adqc a;

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        adqc adqcVar = this.a;
        adqcVar.m = null;
        adqcVar.b.k(adqcVar);
        if (adqcVar.k) {
            adqcVar.j.g();
            adlm adlmVar = adqcVar.c;
            if (adlmVar != null) {
                adlmVar.R(3, null, null);
            }
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        MdxSmartRemoteActivity mdxSmartRemoteActivity = (MdxSmartRemoteActivity) C();
        adqc adqcVar = this.a;
        int i = mdxSmartRemoteActivity.f;
        int i2 = mdxSmartRemoteActivity.e;
        View findViewById = mdxSmartRemoteActivity.findViewById(R.id.content);
        adqcVar.D = i;
        adqcVar.A = i2;
        adqcVar.m = findViewById;
        adqcVar.b.i(adqcVar);
        adlm adlmVar = adqcVar.c;
        if (adlmVar != null) {
            adqcVar.e(adlmVar.a(), adqcVar.c.k().c());
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        adqc adqcVar = this.a;
        adqcVar.n = layoutInflater.inflate(com.google.android.youtube.R.layout.mdx_smart_remote_fragment, viewGroup, false);
        adqcVar.l = adqcVar.n.getContext();
        adqcVar.j = new adqk(adqcVar.l, adqcVar.d, adqcVar);
        adqcVar.p = (TextView) adqcVar.n.findViewById(com.google.android.youtube.R.id.loading_text);
        adqcVar.q = (TextView) adqcVar.n.findViewById(com.google.android.youtube.R.id.title);
        adqcVar.r = (MediaRouteButton) adqcVar.n.findViewById(com.google.android.youtube.R.id.cast_icon);
        adqcVar.o = (ProgressBar) adqcVar.n.findViewById(com.google.android.youtube.R.id.loading_spinner);
        adqcVar.s = (DpadView) adqcVar.n.findViewById(com.google.android.youtube.R.id.dpad);
        adqcVar.t = (TextView) adqcVar.n.findViewById(com.google.android.youtube.R.id.voice_query);
        adqcVar.u = (TextView) adqcVar.n.findViewById(com.google.android.youtube.R.id.voice_tips);
        adqcVar.v = (MicrophoneView) adqcVar.n.findViewById(com.google.android.youtube.R.id.mic);
        adqcVar.w = adqcVar.n.findViewById(com.google.android.youtube.R.id.back);
        adqcVar.x = adqcVar.n.findViewById(com.google.android.youtube.R.id.tap_mic);
        Resources resources = adqcVar.l.getResources();
        adqcVar.z = new String[]{resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_1), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_2), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_3), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_4), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_5), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_6), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_7), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_8), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_9), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_10), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_11), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_12), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_13), resources.getString(com.google.android.youtube.R.string.mdx_smart_remote_voice_tips_14)};
        adqcVar.h.d(acsb.b(61411), null, null);
        adqcVar.o.getIndeterminateDrawable().setColorFilter(wbs.Q(adqcVar.l, com.google.android.youtube.R.attr.ytStaticBrandRed), PorterDuff.Mode.SRC_IN);
        adqcVar.h.n(new acqx(acsb.c(61403)));
        adqcVar.n.findViewById(com.google.android.youtube.R.id.collapse).setOnClickListener(new adpw(adqcVar, 1));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61410)));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61404)));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61406)));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61409)));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61405)));
        adqcVar.s.e = new adpu(adqcVar);
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61401)));
        adqcVar.w.setOnClickListener(new adpw(adqcVar, 0));
        ((acqq) adqcVar.h).D(new acqx(acsb.c(61407)));
        adqcVar.v.setOnClickListener(new adpw(adqcVar, 2));
        if (!adqcVar.y) {
            adqcVar.h.n(new acqx(acsb.c(61402)));
            adqcVar.r.e(adqcVar.l.getResources().getDrawable(com.google.android.youtube.R.drawable.ic_media_route_transparent_waves_on_red));
            adqcVar.r.g(adqcVar.f);
            adqcVar.r.d(adqcVar.e);
            adqcVar.r.setOnClickListener(new adpw(adqcVar, 3));
        }
        adqcVar.n.findViewById(com.google.android.youtube.R.id.privacy).setOnClickListener(new adpw(adqcVar, 4));
        return adqcVar.n;
    }
}
