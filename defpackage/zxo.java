package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxo {
    public acra a;
    public acsc b;
    public Runnable c;
    public zfi d;
    private final ce e;
    private final Activity f;
    private final amru g;
    private amru h;
    private boolean i;

    public zxo(Activity activity, List list) {
        this.f = activity;
        list.getClass();
        this.g = amru.o(list);
        this.h = amru.q();
        this.e = null;
    }

    public static zxo a(ce ceVar, List list) {
        return new zxo(ceVar, list);
    }

    public static boolean d(Context context, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!e(context, ((PermissionDescriptor) it.next()).a)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Context context, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (context != null) {
            return akai.h(context, i);
        }
        zga.l("Cannot check permissions for null Context");
        return false;
    }

    private final Context g() {
        ce ceVar = this.e;
        return ceVar != null ? ceVar.qR() : this.f;
    }

    private final void h(PermissionDescriptor permissionDescriptor) {
        acsc acscVar;
        acra acraVar = this.a;
        if (acraVar == null || permissionDescriptor == null || (acscVar = permissionDescriptor.c) == null) {
            return;
        }
        acraVar.I(3, new acqx(acscVar), null);
    }

    private static boolean i() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public final void b(int i, String[] strArr, int[] iArr) {
        PermissionDescriptor permissionDescriptor;
        acsc acscVar;
        boolean shouldShowRequestPermissionRationale;
        amru amruVar = this.g;
        int size = amruVar.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                permissionDescriptor = (PermissionDescriptor) amruVar.get(i2);
                i2++;
                if (i == permissionDescriptor.a) {
                    break;
                }
            } else {
                amru amruVar2 = this.h;
                int size2 = amruVar2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        permissionDescriptor = null;
                        break;
                    }
                    permissionDescriptor = (PermissionDescriptor) amruVar2.get(i3);
                    i3++;
                    if (i == permissionDescriptor.a) {
                        break;
                    }
                }
            }
        }
        boolean z = iArr.length == 0;
        boolean z2 = false;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr[i4] != 0) {
                String str = strArr[i4];
                if (i()) {
                    ce ceVar = this.e;
                    if (ceVar != null) {
                        shouldShowRequestPermissionRationale = ceVar.aw(str);
                    } else {
                        Activity activity = this.f;
                        if (activity != null) {
                            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
                        }
                    }
                    if (shouldShowRequestPermissionRationale) {
                        z = true;
                    }
                }
                z = true;
                z2 = true;
            }
        }
        if (!z) {
            acra acraVar = this.a;
            if (acraVar != null && permissionDescriptor != null && (acscVar = permissionDescriptor.b) != null) {
                acraVar.I(3, new acqx(acscVar), null);
            }
            c();
            return;
        }
        if (!d(g(), this.g)) {
            if (this.d != null) {
                h(permissionDescriptor);
                this.d.a(Boolean.valueOf(z2));
                return;
            }
            return;
        }
        h(permissionDescriptor);
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c() {
        PermissionDescriptor permissionDescriptor;
        acsc acscVar;
        this.g.getClass();
        if (i()) {
            amru amruVar = this.g;
            int size = amruVar.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    permissionDescriptor = null;
                    break;
                }
                permissionDescriptor = (PermissionDescriptor) amruVar.get(i2);
                i2++;
                if (!akai.h(g(), permissionDescriptor.a)) {
                    break;
                }
            }
            if (permissionDescriptor == null) {
                amru amruVar2 = this.h;
                int size2 = amruVar2.size();
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    PermissionDescriptor permissionDescriptor2 = (PermissionDescriptor) amruVar2.get(i);
                    i++;
                    if (!akai.h(g(), permissionDescriptor2.a)) {
                        permissionDescriptor = permissionDescriptor2;
                        break;
                    }
                }
            }
        } else {
            permissionDescriptor = null;
        }
        if (permissionDescriptor == null) {
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        acra acraVar = this.a;
        if (acraVar != null) {
            if (!this.i && (acscVar = this.b) != null) {
                acraVar.I(3, new acqx(acscVar), null);
                this.i = true;
            }
            acsc acscVar2 = permissionDescriptor.b;
            if (acscVar2 != null) {
                this.a.n(new acqx(acscVar2));
            }
            acsc acscVar3 = permissionDescriptor.c;
            if (acscVar3 != null) {
                this.a.n(new acqx(acscVar3));
            }
        }
        String[] l = akai.l(permissionDescriptor.a);
        int i3 = permissionDescriptor.a;
        if (i()) {
            ce ceVar = this.e;
            if (ceVar != null) {
                ceVar.ac(l, i3);
                return;
            }
            Activity activity = this.f;
            if (activity != null) {
                activity.requestPermissions(l, i3);
            }
        }
    }

    public final void f(List list) {
        this.h = amru.o(list);
    }

    private zxo(ce ceVar, List list) {
        this.e = ceVar;
        list.getClass();
        this.g = amru.o(list);
        this.h = amru.q();
        this.f = null;
    }
}
