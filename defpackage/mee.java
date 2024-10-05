package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mee implements wmy {
    private final Activity a;
    private View b;
    private ImageView c;
    private View d;
    private RatingBar e;
    private RatingBar f;
    private ImageView g;

    public mee(Activity activity, ajjz ajjzVar, xls xlsVar, wzq wzqVar) {
        this.a = activity;
        ajjzVar.getClass();
        xlsVar.getClass();
        wzqVar.getClass();
    }

    private final void i(View view) {
        if (view != null) {
            whu.z(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.b != null) {
            this.c.setImageDrawable(null);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
            this.g.setVisibility(4);
            this.g.setImageDrawable(null);
            this.b.setVisibility(8);
        }
    }

    @Override // defpackage.wmz
    public final void a() {
    }

    public final void b(Bitmap bitmap) {
        this.c.setImageBitmap(bitmap);
    }

    public final void c(Bitmap bitmap) {
        this.g.setImageBitmap(bitmap);
        this.g.setVisibility(bitmap != null ? 0 : 8);
    }

    @Override // defpackage.wmz
    public final void d(View view, ajok ajokVar) {
        View view2 = this.b;
        if (view2 == null || view2.getParent() != view) {
            i(view);
            this.b = whu.z(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card);
            yki.c(this.a, new med(this, 0));
            yki.c(this.a, new med(this, 1));
            this.c = (ImageView) this.b.findViewById(R.id.app_thumbnail);
            this.e = (RatingBar) this.b.findViewById(R.id.rating_gray);
            this.f = (RatingBar) this.b.findViewById(R.id.rating_white);
            this.g = (ImageView) this.b.findViewById(R.id.rating_image);
            this.d = this.b.findViewById(R.id.action_button);
            this.d.setOnClickListener(new ipu(9));
        }
        throw null;
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        i(view);
        this.b = null;
    }

    @Override // defpackage.wmz
    public final void f() {
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        aryr aryrVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (aryrVar != null) {
            atyh atyhVar = aryrVar.A;
            if (atyhVar == null) {
                atyhVar = atyh.a;
            }
            int i = atyhVar.b;
        }
        return false;
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
    }
}
