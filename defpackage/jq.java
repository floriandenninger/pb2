package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof zc) {
                editorInfo.hintText = ((zc) parent).a();
                return;
            }
        }
    }

    public static btk f(Context context, Class cls, String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new btk(context, cls, str);
    }

    public static Object g(Class cls) {
        String str;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str2 = canonicalName.replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str2;
            } else {
                str = name + "." + str2;
            }
            return Class.forName(str, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public void e(buo buoVar) {
    }
}
