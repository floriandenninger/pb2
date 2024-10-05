package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akai {
    static final SparseArray a = new akah();
    private final ywr b;

    public akai(ywr ywrVar) {
        this.b = ywrVar;
    }

    public static List a(Activity activity, String[] strArr, int[] iArr) {
        int length = strArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            if (iArr[i] != 0 && !aih.j(activity, strArr[i])) {
                arrayList.add(strArr[i]);
            }
        }
        return arrayList;
    }

    public static void c(Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public static boolean e(int[] iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(Context context, PermissionDescriptor[] permissionDescriptorArr) {
        for (PermissionDescriptor permissionDescriptor : permissionDescriptorArr) {
            for (String str : l(permissionDescriptor.a)) {
                if (context.checkSelfPermission(str) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean g(Context context) {
        SparseArray sparseArray = a;
        yjj.B(3, sparseArray.size());
        for (String str : (String[]) sparseArray.get(3)) {
            if (aih.c(context, str) == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context, int i) {
        SparseArray sparseArray = a;
        yjj.B(i, sparseArray.size());
        for (String str : (String[]) sparseArray.get(i)) {
            if (aih.c(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] l(int i) {
        SparseArray sparseArray = a;
        yjj.B(i, sparseArray.size());
        return (String[]) sparseArray.get(i);
    }

    @Deprecated
    public final void d(final String[] strArr) {
        ynm.m(this.b.b(new amml() { // from class: akag
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String[] strArr2 = strArr;
                aosh aoshVar = (aosh) obj;
                HashSet hashSet = new HashSet(aoshVar.b);
                Collections.addAll(hashSet, strArr2);
                aone builder = aoshVar.toBuilder();
                builder.copyOnWrite();
                ((aosh) builder.instance).b = aonm.emptyProtobufList();
                builder.Y(hashSet);
                return (aosh) builder.build();
            }
        }), ailg.h);
    }

    @Deprecated
    public final boolean i(Activity activity, int i) {
        return k(activity, l(i));
    }

    @Deprecated
    public final boolean j(Activity activity, PermissionDescriptor[] permissionDescriptorArr) {
        ArrayList arrayList = new ArrayList();
        for (PermissionDescriptor permissionDescriptor : permissionDescriptorArr) {
            Collections.addAll(arrayList, l(permissionDescriptor.a));
        }
        return k(activity, (String[]) arrayList.toArray(new String[0]));
    }

    @Deprecated
    public final boolean k(Activity activity, String[] strArr) {
        aony aonyVar = ((aosh) this.b.c()).b;
        if (aonyVar.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0 && aonyVar.contains(str) && !activity.shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }
}
