package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ndm extends nbz {
    private final ImageView A;
    private final TextView B;
    private final TextView C;
    private final RatingBar D;
    private final ImageView E;
    private final TextView F;

    public ndm(Context context, ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, boolean z2, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, ajutVar, ajuwVar, view, view2, z, z2, ajywVar, akbdVar, null, null, null, null, null);
        this.A = (ImageView) view2.findViewById(R.id.second_thumbnail);
        this.B = (TextView) view2.findViewById(R.id.app_store_text);
        this.C = (TextView) view2.findViewById(R.id.rating_text);
        this.D = (RatingBar) view2.findViewById(R.id.rating);
        this.E = (ImageView) view2.findViewById(R.id.rating_star);
        this.F = (TextView) view2.findViewById(R.id.price);
    }

    private final void w(int i, int i2) {
        u(this.d, i);
        u(this.e, i2);
        u(this.B, i2);
        u(this.C, i2);
        u(this.D, i2);
        u(this.F, i2);
    }

    @Override // defpackage.nbz, defpackage.nby
    public final void l(acra acraVar, Object obj, augz augzVar, atlt atltVar, Integer num) {
        avgg avggVar;
        avgg avggVar2;
        aqyg aqygVar;
        super.l(acraVar, obj, augzVar, atltVar, num);
        aqyg aqygVar2 = null;
        if ((augzVar.b & 1) != 0) {
            avggVar = augzVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        if ((augzVar.b & 2) != 0) {
            avggVar2 = augzVar.d;
            if (avggVar2 == null) {
                avggVar2 = avgg.a;
            }
        } else {
            avggVar2 = null;
        }
        if ((augzVar.b & 32) != 0) {
            aqygVar = augzVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        float f = augzVar.i;
        if ((augzVar.b & 256) != 0 && (aqygVar2 = augzVar.j) == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar2);
        boolean z = augzVar.z;
        if (avggVar == null && avggVar2 == null) {
            ImageView imageView = this.y;
            imageView.setImageDrawable(aii.a(imageView.getContext(), z ? R.drawable.native_ad_fallback_square_thumbnail : R.drawable.native_ad_fallback_thumbnail));
            this.y.setVisibility(0);
        } else if (avggVar == null) {
            this.y.setVisibility(8);
        }
        if (avggVar2 != null) {
            this.m.h(this.A, avggVar2);
            this.A.setVisibility(0);
        } else {
            this.A.setVisibility(8);
        }
        if (z) {
            q();
            w(2, 1);
            t(16);
        } else {
            s();
            w(1, 2);
            r();
        }
        TextView textView = this.B;
        if (textView != null) {
            whu.G(textView, b);
        }
        if (f > 0.0f) {
            if (f > 5.0f) {
                f = 5.0f;
            }
            this.C.setText(String.format("%1.1f", Float.valueOf(f)));
            this.C.setVisibility(0);
            RatingBar ratingBar = this.D;
            if (ratingBar != null) {
                ratingBar.setRating(f);
                this.D.setVisibility(0);
            }
            ImageView imageView2 = this.E;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            this.C.setVisibility(8);
            RatingBar ratingBar2 = this.D;
            if (ratingBar2 != null) {
                ratingBar2.setVisibility(8);
            }
            ImageView imageView3 = this.E;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        whu.G(this.F, b2);
    }

    public final void v(acra acraVar, Object obj, augz augzVar, atlt atltVar) {
        l(acraVar, obj, augzVar, atltVar, null);
    }

    public ndm(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, boolean z, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(null, ajjzVar, ajutVar, ajuwVar, view, view2, z, false, ajywVar, akbdVar, null, null, null, null, null);
    }
}
