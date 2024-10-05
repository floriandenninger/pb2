package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nnk extends ajxo {
    private final Drawable a;

    public nnk(Context context, String str) {
        super(context, str);
        this.a = whu.y(context, R.drawable.yt_outline_check_black_24, R.attr.ytTextPrimary);
    }

    @Override // defpackage.ajxo
    public final void a(boolean z) {
        super.a(z);
        this.e = z ? this.a : null;
    }
}
