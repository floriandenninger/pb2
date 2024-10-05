package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jeb extends jdt {
    public azrw ag;
    public azrw ah;
    public azrw ai;
    public azrw aj;
    public acqz ak;
    public ypa al;
    public azrw am;
    public azrw an;

    public static int aI(Context context) {
        TypedValue typedValue = new TypedValue();
        return (!context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) ? 2132083833 : 2132083840;
    }

    @Override // defpackage.bog
    public final bof aF(Context context) {
        return new jea(context, aI(context), this.ag, this.ah, this.ai, this.aj, this.ak.mM(), this.al, this.am, this.an);
    }
}
