package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yw {
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager.LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;

    public yw(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132082711;
        layoutParams.flags = 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (b()) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return this.b.getParent() != null;
    }
}
