package defpackage;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cia {
    public final AssetManager d;
    public final cij a = new cij();
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final String e = ".ttf";

    public cia(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            cll.a("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }
}
