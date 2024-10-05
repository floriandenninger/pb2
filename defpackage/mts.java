package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mts extends mtl {
    public final View g;
    public final ImageView h;
    public final int i;
    public View.OnLayoutChangeListener j;
    private final View k;

    public mts(Context context, ajjz ajjzVar, ajut ajutVar) {
        super(context, ajjzVar, ajutVar, R.layout.reel_shelf_thumbnail_creation_item);
        this.k = this.d.findViewById(R.id.reel_item_portrait_container);
        this.g = this.d.findViewById(R.id.avatar_gradient);
        this.h = (ImageView) this.d.findViewById(R.id.creator_avatar);
        this.i = wbs.Q(context, R.attr.ytBrandBackgroundSolid);
    }

    @Override // defpackage.mtl, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        View.OnLayoutChangeListener onLayoutChangeListener = this.j;
        if (onLayoutChangeListener != null) {
            this.h.removeOnLayoutChangeListener(onLayoutChangeListener);
            this.j = null;
        }
        this.b.e(this.h);
    }

    @Override // defpackage.mtl, defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        d(ajokVar, (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mtl
    /* renamed from: f */
    public final void d(ajok ajokVar, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) {
        super.d(ajokVar, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        int intValue = ((Integer) ajokVar.d("width", -1)).intValue();
        if (intValue != -1) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            double d = intValue;
            Double.isNaN(d);
            layoutParams.height = (int) (d / 0.5625d);
            this.k.getLayoutParams().width = intValue;
            this.h.getLayoutParams().width = intValue;
            this.h.getLayoutParams().height = intValue;
        }
        avgg avggVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        if (this.h.getWidth() != 0) {
            g(avggVar);
        } else if (this.j == null) {
            mtr mtrVar = new mtr(this, avggVar);
            this.j = mtrVar;
            this.h.addOnLayoutChangeListener(mtrVar);
        }
    }

    public final void g(avgg avggVar) {
        if (this.h.getWidth() == 0) {
            return;
        }
        this.b.e(this.h);
        Uri C = ahbw.C(avggVar, this.h.getWidth(), this.h.getHeight());
        mtq mtqVar = new mtq(this);
        if (C != null) {
            this.b.l(C, mtqVar);
        } else {
            mtqVar.a(null, null);
        }
    }
}
