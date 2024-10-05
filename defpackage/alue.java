package defpackage;

import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alue implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ImageView a;

    public alue(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (!alta.f() || this.a.getDrawable() == null || (this.a.getDrawable() instanceof VectorDrawable) || (this.a.getDrawable() instanceof bxu)) {
            return true;
        }
        if (!Build.TYPE.equals("userdebug") && !Build.TYPE.equals("eng")) {
            return true;
        }
        String valueOf = String.valueOf(this.a.getContext().getPackageName());
        Log.w("HeaderAreaStyler", valueOf.length() != 0 ? "To achieve scaling icon in SetupDesign lib, should use vector drawable icon from ".concat(valueOf) : new String("To achieve scaling icon in SetupDesign lib, should use vector drawable icon from "));
        return true;
    }
}
