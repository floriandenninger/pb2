package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class msw extends msv {
    private final ImageView h;
    private final TextView i;
    private final View j;
    private final RelativeLayout k;
    private final TextView l;
    private final mti m;

    public msw(Context context, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar) {
        super(context, ajuwVar, ajjzVar, aahdVar, hbbVar, R.layout.reel_item_channel_grid_style, 0);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_video_avatar);
        this.h = imageView;
        imageView.setImageDrawable(new ColorDrawable(wbs.W(context, R.attr.ytIcon1).orElse(0)));
        this.j = this.f.findViewById(R.id.reel_item_contextual_menu_anchor);
        this.i = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.k = (RelativeLayout) this.f.findViewById(R.id.reel_item_container);
        this.l = (TextView) this.f.findViewById(R.id.reel_item_video_view_count);
        this.m = new mti(context, imageView, ajjzVar, null, 0.5625d);
    }

    @Override // defpackage.msv, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.setImageBitmap(null);
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
        aqyg aqygVar;
        super.d(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
        ajuw ajuwVar = this.b;
        View view = this.f;
        View view2 = this.j;
        atdf atdfVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        aqyg aqygVar2 = null;
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
        ajuwVar.e(view, view2, atdcVar, ajokVar.c("sectionListController"), ajokVar.a);
        mti mtiVar = this.m;
        avgg avggVar = reelItemRendererOuterClass$ReelItemRenderer.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        mtiVar.a(avggVar, true);
        this.k.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
        TextView textView = this.i;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aqygVar = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        TextView textView2 = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 64) != 0 && (aqygVar2 = reelItemRendererOuterClass$ReelItemRenderer.h) == null) {
            aqygVar2 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar2));
        whu.I(this.l, (reelItemRendererOuterClass$ReelItemRenderer.b & 64) != 0);
    }
}
