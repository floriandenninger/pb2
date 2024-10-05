package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static final int c(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public static final boolean d(Context context) {
        return context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }
}
