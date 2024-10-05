package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpb extends afpc {
    public aszh a;
    public boolean ae = false;
    private RecyclerView af;
    private ImageView ag;
    private int ah;
    private int ai;
    private int aj;
    public aqqm b;
    public ajjz c;
    public lu d;
    public aahd e;

    @Override // defpackage.ce
    public final void Z() {
        avgg avggVar;
        super.Z();
        int dimensionPixelSize = C().getResources().getDimensionPixelSize(R.dimen.custom_thumbnail_picker_padding);
        this.O.getClass();
        Rect rect = new Rect();
        this.O.getWindowVisibleDisplayFrame(rect);
        int width = rect.width();
        int i = this.aj;
        int i2 = (width - ((i + 1) * dimensionPixelSize)) / i;
        this.ah = i2;
        this.ai = (int) (i2 * 0.5625f);
        ViewGroup.LayoutParams layoutParams = this.af.getLayoutParams();
        int i3 = this.aj != 2 ? 1 : 2;
        layoutParams.height = (this.ai * i3) + (dimensionPixelSize * (i3 + 1));
        this.af.setLayoutParams(layoutParams);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.aj, null);
        gridLayoutManager.q = true;
        this.af.af(gridLayoutManager);
        afph afphVar = new afph(C(), this.ag, this.c);
        aszh aszhVar = this.a;
        if ((aszhVar.b & 512) != 0) {
            avggVar = aszhVar.f;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = avgg.a;
        }
        afphVar.a(avggVar);
        this.af.ac(new afpa(this, this.a));
    }

    public final void a(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = this.ah;
        layoutParams.height = this.ai;
        imageView.setLayoutParams(layoutParams);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.edit_thumbnails_fragment, viewGroup, false);
        this.ag = (ImageView) inflate.findViewById(R.id.thumbnail_viewer);
        this.af = (RecyclerView) inflate.findViewById(R.id.thumbnail_picker);
        Rect rect = new Rect();
        inflate.getWindowVisibleDisplayFrame(rect);
        this.aj = rect.width() > C().getResources().getDimensionPixelSize(R.dimen.custom_thumbnail_picker_max_phone_width) ? 4 : 2;
        aulq aulqVar = this.b.d;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        this.a = (aszh) aulqVar.pX(aszi.a);
        return inflate;
    }
}
