package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jh {
    private static Field a;
    private static boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Display d(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, int i) {
        view.setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(View view) {
        return view.isPaddingRelative();
    }

    public static void h(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            compoundButton.getButtonDrawable();
            return;
        }
        if (!b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
            } catch (IllegalAccessException unused2) {
                a = null;
            }
        }
    }

    public static int i(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i < i2 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        if (typedValue.type == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (typedValue.type != 6) {
                return -2;
            }
            fraction = typedValue.getFraction(displayMetrics.widthPixels, displayMetrics.widthPixels);
        }
        return (int) fraction;
    }

    public static bng j(bii biiVar) {
        byte[] bArr;
        pth pthVar = new pth(16);
        if (aeqp.e(biiVar, pthVar).b != 1380533830) {
            return null;
        }
        biiVar.j(pthVar.a, 0, 4);
        pthVar.G(0);
        int d = pthVar.d();
        if (d != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(d);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        aeqp e = aeqp.e(biiVar, pthVar);
        while (e.b != 1718449184) {
            biiVar.f((int) e.a);
            e = aeqp.e(biiVar, pthVar);
        }
        pse.g(e.a >= 16);
        biiVar.j(pthVar.a, 0, 16);
        pthVar.G(0);
        int g = pthVar.g();
        int g2 = pthVar.g();
        int f = pthVar.f();
        pthVar.f();
        int g3 = pthVar.g();
        int g4 = pthVar.g();
        int i = ((int) e.a) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            biiVar.j(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = pts.f;
        }
        return new bng(g, g2, f, g3, g4, bArr);
    }
}
