package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class orz {
    public static final amru a = amru.A(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
    public static final amru b = amru.A(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, new Integer[0]);

    public static String a(Resources resources, int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        return i2 == 0 ? resources.getQuantityString(R.plurals.frequency_minutes_only, i3, Integer.valueOf(i3)) : i3 == 0 ? resources.getQuantityString(R.plurals.frequency_hours_only, i2, Integer.valueOf(i2)) : resources.getString(R.string.frequency_compound_time_unit, resources.getQuantityString(R.plurals.frequency_hours_component, i2, Integer.valueOf(i2)), resources.getQuantityString(R.plurals.frequency_minutes_component, i3, Integer.valueOf(i3)));
    }
}
