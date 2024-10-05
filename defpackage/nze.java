package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nze {
    public final float a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;

    /* JADX WARN: Multi-variable type inference failed */
    public nze(Context context, aadw aadwVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        asvu asvuVar;
        Double valueOf;
        Double valueOf2;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.flexy_default_min_metadata_view_height);
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.flexy_default_max_screen_ratio, typedValue, true);
        float f = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_min_height_aspect_ratio, typedValue, true);
        float f2 = typedValue.getFloat();
        resources.getValue(R.dimen.flexy_default_engagement_panel_max_height_aspect_ratio, typedValue, true);
        if ((aadwVar.b().b & 16) != 0) {
            asvuVar = aadwVar.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
        } else {
            asvuVar = null;
        }
        if (asvuVar == null) {
            this.a = f2;
            this.b = f;
            this.c = dimensionPixelSize;
            this.d = 0.0f;
            this.e = 0.0f;
            return;
        }
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f3 = asvuVar.o;
        this.a = f3 > 0.0f ? f3 : f2;
        float f4 = asvuVar.p;
        this.b = f4 > 0.0f ? f4 : f;
        float f5 = asvuVar.q;
        this.c = f5 > 0.0f ? yjk.K(displayMetrics, (int) f5) : dimensionPixelSize;
        aqvj aqvjVar = axzgVar.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45353195L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353195L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353195L);
            valueOf = Double.valueOf(aqvkVar.b == 4 ? ((Double) aqvkVar.c).doubleValue() : 0.0d);
        } else {
            valueOf = Double.valueOf(0.0d);
        }
        this.d = yjk.y(valueOf.floatValue(), 0.0f, 1.0f);
        aqvj aqvjVar2 = axzgVar.b.b().C;
        aqvjVar2 = aqvjVar2 == null ? aqvj.a : aqvjVar2;
        if (aqvjVar2.a(45353196L)) {
            aoot aootVar2 = aqvjVar2.b;
            if (!aootVar2.containsKey(45353196L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar2 = (aqvk) aootVar2.get(45353196L);
            valueOf2 = Double.valueOf(aqvkVar2.b == 4 ? ((Double) aqvkVar2.c).doubleValue() : 0.0d);
        } else {
            valueOf2 = Double.valueOf(0.0d);
        }
        this.e = yjk.y(valueOf2.floatValue(), 0.0f, 1.0f);
    }
}
