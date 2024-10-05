package defpackage;

import android.os.Build;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akam {
    private final akal a;
    private final acra b;
    private final ArrayList c;
    private final int d;
    private final int e;
    private final Runnable f;
    private final Runnable g;
    private final akai h;

    public akam(akal akalVar, acra acraVar, List list, int i, int i2, Runnable runnable, Runnable runnable2, akai akaiVar) {
        this.a = akalVar;
        acraVar.getClass();
        this.b = acraVar;
        this.c = new ArrayList(list);
        this.d = i;
        this.e = i2;
        this.f = runnable;
        this.g = runnable2;
        this.h = akaiVar;
    }

    private final void c() {
        while (!this.c.isEmpty() && akai.h(this.a.a(), ((PermissionDescriptor) this.c.get(0)).a)) {
            this.c.remove(0);
        }
        if (this.c.isEmpty()) {
            this.f.run();
            return;
        }
        PermissionDescriptor permissionDescriptor = (PermissionDescriptor) this.c.get(0);
        acsc acscVar = permissionDescriptor.b;
        if (acscVar != null) {
            this.b.D(new acqx(acscVar));
        }
        acsc acscVar2 = permissionDescriptor.c;
        if (acscVar2 != null) {
            this.b.D(new acqx(acscVar2));
        }
        String[] l = akai.l(permissionDescriptor.a);
        this.h.d(l);
        this.a.c(l, permissionDescriptor.a);
    }

    public final void a() {
        int i = 0;
        if (Build.VERSION.SDK_INT < 23) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            while (i < size) {
                PermissionDescriptor permissionDescriptor = (PermissionDescriptor) arrayList.get(i);
                i++;
                if (!akai.h(this.a.a(), permissionDescriptor.a)) {
                    this.g.run();
                    return;
                }
            }
            this.f.run();
            return;
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        while (i < size2) {
            PermissionDescriptor permissionDescriptor2 = (PermissionDescriptor) arrayList2.get(i);
            i++;
            if (this.h.i(this.a.a(), permissionDescriptor2.a)) {
                akad.aF(this.d).qh(this.a.b(), "openSettingsDialog");
                this.g.run();
                return;
            }
        }
        c();
    }

    public final boolean b(int i, String[] strArr, int[] iArr) {
        if (this.c.isEmpty()) {
            return false;
        }
        if (strArr.length == 0) {
            this.g.run();
            return true;
        }
        PermissionDescriptor permissionDescriptor = (PermissionDescriptor) this.c.remove(0);
        int i2 = permissionDescriptor.a;
        amkq.R(i2 == i, "Expected %s, got %s", i2, i);
        if (!akai.e(iArr)) {
            acsc acscVar = permissionDescriptor.c;
            if (acscVar != null) {
                this.b.I(3, new acqx(acscVar), null);
            }
            if (this.e != 0) {
                whu.K(this.a.a(), this.e, 1);
            }
            this.g.run();
            return true;
        }
        acsc acscVar2 = permissionDescriptor.b;
        if (acscVar2 != null) {
            this.b.I(3, new acqx(acscVar2), null);
        }
        c();
        return true;
    }
}
