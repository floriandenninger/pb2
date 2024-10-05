package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lya implements ajta {
    private final Resources a;
    private final int b;
    private final /* synthetic */ int c;

    public lya(Context context, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = context.getResources();
        this.b = i;
    }

    public lya(Context context, int i, int i2) {
        this.c = i2;
        this.a = context.getResources();
        this.b = i;
    }

    @Override // defpackage.ajta
    public final ajni a(int i, List list, int i2, int i3) {
        if (this.c != 0) {
            if (this.b == 3) {
                ajnh a = ajni.a();
                a.a = i;
                a.b = list;
                int dimensionPixelSize = this.a.getDimensionPixelSize(R.dimen.grid_row_extra_horizontal_padding);
                int dimensionPixelSize2 = this.a.getDimensionPixelSize(R.dimen.grid_row_extra_vertical_padding);
                a.e = dimensionPixelSize;
                a.f = dimensionPixelSize;
                if (i2 == 0) {
                    a.c = dimensionPixelSize2;
                } else if (i2 == i3 - 1) {
                    a.d = dimensionPixelSize2;
                }
                return a.a();
            }
            ajnh a2 = ajni.a();
            a2.a = i;
            a2.b = list;
            return a2.a();
        }
        amkq.E(i > 0);
        list.getClass();
        int i4 = this.b;
        if (i4 == 2) {
            int dimensionPixelSize3 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_start_end_padding);
            int dimensionPixelSize4 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_interrow_padding);
            int dimensionPixelSize5 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_row_child_padding);
            ajnh a3 = ajni.a();
            a3.a = i;
            a3.b = list;
            a3.e = dimensionPixelSize3;
            a3.f = dimensionPixelSize3;
            a3.c = dimensionPixelSize4;
            a3.d = dimensionPixelSize4;
            a3.g = dimensionPixelSize5;
            return a3.a();
        }
        if (i4 == 3) {
            int dimensionPixelSize6 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_reel_stackable_inter_row_padding);
            int dimensionPixelSize7 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_reel_stackable_inter_item_padding);
            ajnh a4 = ajni.a();
            a4.a = i;
            a4.b = list;
            a4.c = dimensionPixelSize6;
            a4.d = dimensionPixelSize6;
            a4.g = dimensionPixelSize7;
            return a4.a();
        }
        if (i4 == 4) {
            int dimensionPixelSize8 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_uniform_padding);
            int dimensionPixelSize9 = this.a.getDimensionPixelSize(R.dimen.shelf_renderer_uniform_bottom_padding);
            ajnh a5 = ajni.a();
            a5.a = i;
            a5.b = list;
            a5.e = dimensionPixelSize8;
            a5.f = dimensionPixelSize8;
            a5.c = dimensionPixelSize8;
            a5.d = dimensionPixelSize9;
            a5.g = dimensionPixelSize8;
            return a5.a();
        }
        ajnh a6 = ajni.a();
        a6.a = i;
        a6.b = list;
        return a6.a();
    }
}
