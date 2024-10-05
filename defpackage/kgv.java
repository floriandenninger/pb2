package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgv extends ahus {
    public boolean a;
    public Bitmap b;
    public int c;
    public int d;
    private final int e;
    private boolean f;
    private ImageView g;

    public kgv(Context context) {
        super(context);
        this.e = context.getResources().getInteger(R.integer.fade_duration_fast);
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.youtube_invideo_programming_overlay, (ViewGroup) null);
        this.g = (ImageView) inflate.findViewById(R.id.branding_watermark);
        return inflate;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        if (ab(1)) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float applyDimension = TypedValue.applyDimension(1, this.c, displayMetrics);
            float applyDimension2 = TypedValue.applyDimension(1, this.d, displayMetrics);
            this.g.getLayoutParams().width = (int) applyDimension;
            this.g.getLayoutParams().height = (int) applyDimension2;
            this.g.setImageBitmap(this.b);
        }
        if (ab(2)) {
            whu.I(this.g, this.a);
        }
        this.b = null;
    }

    public final void g(boolean z) {
        if (z != this.f) {
            return;
        }
        boolean z2 = !z;
        this.f = z2;
        if (z2) {
            kV();
        } else {
            kX();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final ahux kU(Context context) {
        ahux kU = super.kU(context);
        int i = this.e;
        kU.b = i;
        kU.a = i;
        return kU;
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.a && !this.f;
    }
}
