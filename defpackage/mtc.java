package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mtc extends msv {
    private final RelativeLayout h;
    private final ImageView i;
    private final TextView j;
    private final TextView k;
    private final WrappingTextView l;
    private final View m;

    public mtc(Context context, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar) {
        super(context, ajuwVar, ajjzVar, aahdVar, hbbVar, R.layout.reel_item_avatar_circle_style, R.id.reel_item_channel_avatar);
        this.h = (RelativeLayout) this.f.findViewById(R.id.reel_item_container);
        this.i = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.j = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.k = (TextView) this.f.findViewById(R.id.reel_item_header);
        this.l = (WrappingTextView) this.f.findViewById(R.id.reel_item_sub_text);
        this.m = this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.f.setBackgroundDrawable(new fyl(wbs.W(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    @Override // defpackage.msv, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.e(this.i);
    }

    @Override // defpackage.msv, defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.msv
    /* renamed from: f */
    public final void d(ajok ajokVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        atdc atdcVar;
        avgg avggVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        super.d(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
        ajuw ajuwVar = this.b;
        View view = this.f;
        View view2 = this.m;
        atdf atdfVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        aqyg aqygVar4 = null;
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = reelItemRendererOuterClass$ReelItemRenderer.n;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        ajuwVar.e(view, view2, atdcVar, reelItemRendererOuterClass$ReelItemRenderer, ajokVar.a);
        ajjz ajjzVar = this.c;
        ImageView imageView = this.i;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avggVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.k(imageView, avggVar, this.g);
        this.h.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.j;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2) != 0) {
            aqygVar = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.k;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aqygVar2 = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        textView2.setText(ajcq.b(aqygVar2));
        amrp f = amru.f();
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 8) != 0) {
            aqygVar3 = reelItemRendererOuterClass$ReelItemRenderer.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b = ajcq.b(aqygVar3);
        if (b != null) {
            f.h(fav.y(b));
        }
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 256) != 0 && (aqygVar4 = reelItemRendererOuterClass$ReelItemRenderer.i) == null) {
            aqygVar4 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar4);
        if (b2 != null) {
            f.h(fav.y(b2));
        }
        this.l.a(f.g());
    }
}
