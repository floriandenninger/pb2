package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mtd extends mtb {
    public mtd(Context context, ci ciVar, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar, ajut ajutVar, aaea aaeaVar) {
        super(context, ciVar, ajuwVar, ajjzVar, aahdVar, hbbVar, ajutVar, R.layout.reel_item_shorts_style_video, 0.6d, aaeaVar);
    }

    @Override // defpackage.mtb, defpackage.msv, defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mtb, defpackage.msv
    /* renamed from: f */
    public final void d(ajok ajokVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        super.d(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 64) != 0) {
            TextView textView = this.h;
            aqyg aqygVar = reelItemRendererOuterClass$ReelItemRenderer.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
    }

    @Override // defpackage.mtb
    protected final void h(int i) {
        this.f.setPaddingRelative(0, 0, 0, 0);
    }
}
