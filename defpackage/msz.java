package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msz extends msv {
    public final ci h;
    public final ajut i;
    private final LinearLayout j;
    private final ImageView k;
    private final TextView l;
    private final mti m;

    public msz(Context context, ci ciVar, ajuw ajuwVar, ajjz ajjzVar, aahd aahdVar, hbb hbbVar, ajut ajutVar) {
        super(context, ajuwVar, ajjzVar, aahdVar, hbbVar, R.layout.reel_item_avatar_circle_many_style, R.id.reel_item_channel_avatar);
        this.h = ciVar;
        this.i = ajutVar;
        this.j = (LinearLayout) this.f.findViewById(R.id.reel_item_container);
        ImageView imageView = (ImageView) this.f.findViewById(R.id.reel_item_channel_avatar);
        this.k = imageView;
        this.l = (TextView) this.f.findViewById(R.id.reel_item_title);
        this.m = new mti(context, imageView, ajjzVar, this.g, 0.5625d);
    }

    @Override // defpackage.msv, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.c.e(this.k);
        this.f.setOnLongClickListener(null);
    }

    @Override // defpackage.msv, defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelItemRendererOuterClass$ReelItemRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.msv
    /* renamed from: f */
    public final void d(ajok ajokVar, final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        avgg avggVar;
        super.d(ajokVar, reelItemRendererOuterClass$ReelItemRenderer);
        int intValue = ((Integer) ajokVar.d("width", -1)).intValue();
        if (intValue != -1) {
            this.j.getLayoutParams().width = intValue;
        }
        mti mtiVar = this.m;
        aqyg aqygVar = null;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avggVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        mtiVar.a(avggVar, false);
        TextView textView = this.l;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0 && (aqygVar = reelItemRendererOuterClass$ReelItemRenderer.d) == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        this.l.setContentDescription(mtj.f(reelItemRendererOuterClass$ReelItemRenderer));
        atdf atdfVar = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            this.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: msy
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    msz mszVar = msz.this;
                    ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", reelItemRendererOuterClass$ReelItemRenderer2);
                    ci ciVar = mszVar.h;
                    atdf atdfVar2 = reelItemRendererOuterClass$ReelItemRenderer2.n;
                    if (atdfVar2 == null) {
                        atdfVar2 = atdf.a;
                    }
                    atdc atdcVar = atdfVar2.c;
                    if (atdcVar == null) {
                        atdcVar = atdc.a;
                    }
                    ajxw.c(ciVar, atdcVar, mszVar.d, mszVar.i, hashMap);
                    return true;
                }
            });
        }
    }
}
