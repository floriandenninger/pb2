package defpackage;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jk {
    private static Method a;
    private static boolean b;
    private static Field c;
    private static boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view) {
        view.requestApplyInsets();
    }

    public static void d(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            lp.a(popupWindow, z);
            return;
        }
        if (!d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public static void e(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            lp.b(popupWindow, i);
            return;
        }
        if (!b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }

    public static bou f(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        bot botVar = new bot(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        botVar.d(mediaRoute2Info.getConnectionState());
        botVar.l(mediaRoute2Info.getVolumeHandling());
        botVar.m(mediaRoute2Info.getVolumeMax());
        botVar.k(mediaRoute2Info.getVolume());
        botVar.h(mediaRoute2Info.getExtras());
        botVar.g(true);
        botVar.a.putBoolean("canDisconnect", false);
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            botVar.e(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            botVar.a.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        botVar.h(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        botVar.f(extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        botVar.i(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            botVar.c(parcelableArrayList);
        }
        return botVar.a();
    }

    public static List g(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }
}
