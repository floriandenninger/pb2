package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ipp implements ayrv {
    public final /* synthetic */ Activity a;
    private final /* synthetic */ int b;

    public /* synthetic */ ipp(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.b == 0) {
            Activity activity = this.a;
            if (!((Boolean) obj).booleanValue()) {
                TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(R.style.CompatElevationZ4, new int[]{android.R.attr.elevation});
                r1 = obtainStyledAttributes != null ? obtainStyledAttributes.getDimension(0, 4.0f) : 0.0f;
                obtainStyledAttributes.recycle();
                r1 = yjk.I(activity.getResources().getDisplayMetrics(), r1);
            }
            return Float.valueOf(r1);
        }
        return this.a.createConfigurationContext((Configuration) obj);
    }
}
