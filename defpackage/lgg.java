package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lgg extends lgf {
    public lgg(Context context, aahd aahdVar, ajjz ajjzVar, akbf akbfVar, ajyg ajygVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, ViewGroup viewGroup, byte[] bArr) {
        super(context, aahdVar, ajjzVar, akbfVar, ajygVar, ajutVar, ftnVar, fvfVar, akbdVar, R.layout.watch_card_rich_header_horizontal_layout, viewGroup, null);
    }

    @Override // defpackage.lgf
    public final void d(awcw awcwVar) {
        apkf apkfVar;
        avgg avggVar;
        int P;
        awci[] awciVarArr = (awci[]) awcwVar.h.toArray(new awci[0]);
        aqyg aqygVar = null;
        if (awciVarArr != null) {
            for (awci awciVar : awciVarArr) {
                if (awciVar == null) {
                    apkfVar = null;
                } else if (awciVar.b == 104364901) {
                    apkfVar = (apkf) awciVar.c;
                } else {
                    apkfVar = apkf.a;
                }
                if (apkfVar != null) {
                    break;
                }
            }
        }
        apkfVar = null;
        if (apkfVar == null || apkfVar.e.isEmpty()) {
            TextView textView = this.b;
            if ((awcwVar.b & 4) != 0 && (aqygVar = awcwVar.g) == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
        } else {
            whu.I(this.b, false);
        }
        View findViewById = this.a.findViewById(R.id.avatar_container);
        af afVar = (af) this.d.getLayoutParams();
        af afVar2 = (af) findViewById.getLayoutParams();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        if (awcwVar.c == 5) {
            avggVar = (avgg) awcwVar.d;
        } else {
            avggVar = avgg.a;
        }
        if (!ahbw.L(avggVar) || (P = awxr.P(awcwVar.m)) == 0 || P != 3) {
            layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
            layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_right_avatar_size);
            afVar2.n = -1;
            afVar2.p = 0;
            afVar.n = 0;
            afVar.m = -1;
            afVar.setMarginStart(0);
        } else {
            layoutParams.width = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
            layoutParams.height = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_size);
            afVar2.n = 0;
            afVar2.p = -1;
            afVar.n = -1;
            afVar.m = R.id.avatar_container;
            afVar.setMarginStart(this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_left_avatar_margin));
        }
        if (f(awcwVar)) {
            int N = yjk.N(this.e);
            int dimensionPixelOffset = this.e.getResources().getDimensionPixelOffset(R.dimen.watch_card_verified_badge_horizontal_margin);
            TextView textView2 = this.d;
            int marginStart = afVar.getMarginStart();
            textView2.setMaxWidth(((N - (marginStart + marginStart)) - layoutParams.width) - dimensionPixelOffset);
        } else {
            this.d.setMaxWidth(Integer.MAX_VALUE);
        }
        this.c.setLayoutParams(layoutParams);
        findViewById.setLayoutParams(afVar2);
        this.d.setLayoutParams(afVar);
    }
}
