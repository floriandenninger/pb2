package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adez extends adem {
    public azrw ag;

    @Override // defpackage.bog
    public final bof aF(Context context) {
        TypedValue typedValue = new TypedValue();
        int i = 2132083833;
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            i = 2132083840;
        }
        return new adey(context, i, this.ag);
    }
}
