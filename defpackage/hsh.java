package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hsh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final int e;

    public hsh(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_border_width);
        this.e = dimensionPixelSize;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_corner_radius);
        this.a = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_width) - dimensionPixelSize;
        this.b = context.getResources().getDimensionPixelSize(R.dimen.reel_edit_carousel_thumbnail_cell_height) - dimensionPixelSize;
        this.d = wbs.Q(context, R.attr.ytIconActiveOther);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int a(Object obj) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract hsn b(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public ammv c(Object obj) {
        throw null;
    }
}
