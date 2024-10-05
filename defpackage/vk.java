package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vk extends vh implements vi {
    public static Method a;
    public vi b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public vk(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.vh
    public final ug p(Context context, boolean z) {
        vj vjVar = new vj(context, z);
        vjVar.e = this;
        return vjVar;
    }
}
