package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.proto.Display$DisplayParams;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfq {
    public static Thread a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final axfp b(Display display) {
        if (!a()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.view.DisplayInfo");
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Display.class.getDeclaredMethod("getDisplayInfo", cls).invoke(display, newInstance);
            Field declaredField = cls.getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            return axfp.e(declaredField.get(newInstance));
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("Failed to fetch DisplayCutout from Display: ");
            sb.append(valueOf);
            Log.e("AndroidPCompat", sb.toString());
            return null;
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d() {
        c(true);
        c(true);
    }

    public static float e(Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null || !display$DisplayParams.hasBottomBezelHeight()) {
            return 0.003f;
        }
        return display$DisplayParams.getBottomBezelHeight();
    }

    public static float f(float f) {
        return 0.0254f / f;
    }

    public static DisplayMetrics g(Display display) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            int i = displayMetrics.widthPixels;
            displayMetrics.widthPixels = displayMetrics.heightPixels;
            displayMetrics.heightPixels = i;
        }
        float f = displayMetrics.xdpi;
        displayMetrics.xdpi = displayMetrics.ydpi;
        displayMetrics.ydpi = f;
        return displayMetrics;
    }

    public static DisplayMetrics h(Display display, Display$DisplayParams display$DisplayParams) {
        DisplayMetrics g = g(display);
        if (display$DisplayParams != null) {
            if (display$DisplayParams.hasXPpi()) {
                g.xdpi = display$DisplayParams.getXPpi();
            }
            if (display$DisplayParams.hasYPpi()) {
                g.ydpi = display$DisplayParams.getYPpi();
            }
        }
        return g;
    }

    public static Display i(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static String j(Context context) {
        Resources resources = context.getResources();
        try {
            return resources.getString(resources.getIdentifier("display_manager_hdmi_display_name", "string", "android"));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static Activity k(Context context) {
        Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return k(baseContext);
    }

    public static ComponentName l(Context context) {
        if (context instanceof axhd) {
            return ((axhd) context).a();
        }
        Activity k = k(context);
        if (k != null) {
            return k.getComponentName();
        }
        return null;
    }

    public static Application m(Context context) {
        if (!(context instanceof Application)) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application) context2;
                }
            }
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Could not find an Application in the given context: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return (Application) context;
    }

    public static Object n(Object obj, Class cls) {
        boolean z;
        if (obj instanceof axqj) {
            if (obj instanceof axqm) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        z = true;
                        break;
                    }
                    i++;
                }
                ayaw.q(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        }
        if (!(obj instanceof axqk)) {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), axqj.class, axqk.class));
        }
        return n(((axqk) obj).lM(), cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(ce ceVar) {
        axpj axpjVar;
        ce ceVar2 = ceVar;
        while (true) {
            ceVar2 = ceVar2.C;
            if (ceVar2 == 0) {
                ci C = ceVar.C();
                if (C instanceof axpj) {
                    axpjVar = (axpj) C;
                } else {
                    if (!(C.getApplication() instanceof axpj)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", ceVar.getClass().getCanonicalName()));
                    }
                    axpjVar = (axpj) C.getApplication();
                }
            } else if (ceVar2 instanceof axpj) {
                axpjVar = (axpj) ceVar2;
                break;
            }
        }
        amsj g = axpjVar.g();
        axpjVar.getClass();
        g.getClass();
        g.g(ceVar);
    }
}
