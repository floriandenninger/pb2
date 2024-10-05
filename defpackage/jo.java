package defpackage;

import android.content.res.Resources;
import android.media.MediaRouter;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.PointerIcon;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jo {
    private static Field a;
    private static boolean b;
    private static Class c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    public jo() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    public static void d(Resources resources) {
        Map map;
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void e(Resources resources) {
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            b = true;
        }
        Field field = a;
        Object obj = null;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj == null) {
            return;
        }
        h(obj);
    }

    public static void f(Resources resources) {
        Object obj;
        if (!h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj == null) {
                return;
            }
            if (!b) {
                try {
                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                    a = declaredField2;
                    declaredField2.setAccessible(true);
                } catch (NoSuchFieldException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                }
                b = true;
            }
            Field field2 = a;
            if (field2 != null) {
                try {
                    obj2 = field2.get(obj);
                } catch (IllegalAccessException e5) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                }
            }
            if (obj2 != null) {
                h(obj2);
            }
        }
    }

    public static Display g(Object obj) {
        try {
            return ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError e2) {
            Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e2);
            return null;
        }
    }

    private static void h(Object obj) {
        LongSparseArray longSparseArray;
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class cls = c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                longSparseArray = (LongSparseArray) field.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                longSparseArray = null;
            }
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
    }
}
