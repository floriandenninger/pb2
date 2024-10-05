package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywt {
    public final amrz a;

    public ywt(amrz amrzVar) {
        this.a = amrzVar;
    }

    public ywt(Context context) {
        int i;
        ugv[] values = ugv.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = values[i2].h;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(ugv.class);
        for (int i3 = 0; i3 < values.length; i3++) {
            try {
                ugv ugvVar = values[i3];
                enumMap.put((EnumMap) ugvVar, (ugv) Integer.valueOf(obtainStyledAttributes.getColor(i3, context.getResources().getColor(ugvVar.i))));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        this.a = amkq.aG(enumMap);
        boolean b = b(context);
        amrw h = amrz.h();
        for (ugu uguVar : ugu.values()) {
            if (!b) {
                i = uguVar.f;
            } else {
                i = uguVar.e;
            }
            h.g(uguVar, Integer.valueOf(aih.d(context, i)));
        }
        h.c();
    }

    public static boolean b(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public final int a(ugv ugvVar) {
        Integer num = (Integer) this.a.get(ugvVar);
        num.getClass();
        return num.intValue();
    }
}
