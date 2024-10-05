package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ej {
    public static Intent c(Context context, ComponentName componentName) {
        String e = e(context, componentName);
        if (e == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e);
        if (e(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String d(Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String e(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = Build.VERSION.SDK_INT >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Shader.TileMode i(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static List j(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(s(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(s(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int l(Context context, String str) {
        return m(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int m(Context context, String str, int i, int i2, String str2) {
        int d;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (permissionToOp == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !Objects.equals(packageName, str2)) {
            d = ahw.d(context, permissionToOp, str2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager b = ahw.b(context);
            d = ahw.a(b, permissionToOp, Binder.getCallingUid(), str2);
            if (d == 0) {
                d = ahw.a(b, permissionToOp, i2, ahw.c(context));
            }
        } else {
            d = ahw.d(context, permissionToOp, str2);
        }
        return d == 0 ? 0 : -2;
    }

    public static int n(Context context, String str) {
        return m(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String oM(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static Intent oN(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String d = d(activity);
        if (d == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d);
        try {
            if (e(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + d + "' in manifest");
            return null;
        }
    }

    public static int p(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown visibility " + i);
    }

    public static int q(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return p(view.getVisibility());
    }

    public static void r(int i, View view) {
        int i2 = i - 1;
        if (i2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (dd.W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: Removing view ");
                    sb.append(view);
                    sb.append(" from container ");
                    sb.append(viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i2 == 1) {
            if (dd.W(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SpecialEffectsController: Setting view ");
                sb2.append(view);
                sb2.append(" to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (i2 != 2) {
            if (dd.W(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("SpecialEffectsController: Setting view ");
                sb3.append(view);
                sb3.append(" to INVISIBLE");
            }
            view.setVisibility(4);
            return;
        }
        if (dd.W(2)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("SpecialEffectsController: Setting view ");
            sb4.append(view);
            sb4.append(" to GONE");
        }
        view.setVisibility(8);
    }

    private static List s(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public void f(ce ceVar) {
    }

    public void g(ce ceVar) {
    }

    public void h(ce ceVar, Bundle bundle) {
    }
}
