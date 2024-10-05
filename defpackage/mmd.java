package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mmd extends ajpc {
    private final ajop a;
    private final FrameLayout b;
    private final ChipCloudView c;
    private final HorizontalScrollView d;
    private final mmc e;

    /* JADX WARN: Type inference failed for: r7v1, types: [ajos, java.lang.Object] */
    public mmd(Context context, gma gmaVar, ajvb ajvbVar) {
        this.a = gmaVar;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cloud_chip_side_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.cloud_chip_bottom_padding);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.cloud_chip_margin);
        ChipCloudView chipCloudView = new ChipCloudView(context);
        this.c = chipCloudView;
        chipCloudView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2);
        chipCloudView.a(dimensionPixelSize3, dimensionPixelSize3);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.d = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        this.e = new mmc(context, ajvbVar.get());
        gmaVar.c(frameLayout);
        gmaVar.b(false);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.a).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.e(this.c);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aptg aptgVar;
        aptj aptjVar = (aptj) obj;
        this.b.removeAllViews();
        this.d.removeAllViews();
        this.c.removeAllViews();
        if (aptjVar.e) {
            this.c.b(1);
            this.d.addView(this.c);
            this.b.addView(this.d);
        } else {
            this.b.addView(this.c);
            this.c.b(aptjVar.c);
        }
        for (aptk aptkVar : aptjVar.b) {
            if (aptkVar.b == 91394224) {
                mmc mmcVar = this.e;
                ajok d = mmcVar.d(ajokVar);
                if (aptkVar.b == 91394224) {
                    aptgVar = (aptg) aptkVar.c;
                } else {
                    aptgVar = aptg.a;
                }
                this.c.addView(mmcVar.c(d, aptgVar));
            }
        }
        if (aptjVar.f) {
            etx.n(ajokVar, 2);
        }
        this.a.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aptj) obj).d.I();
    }
}
