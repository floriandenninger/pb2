package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akap {
    public acsc a;
    public acsc b;
    public acsc c;
    public acsc d;
    private PermissionDescriptor[] f = new PermissionDescriptor[0];
    private PermissionDescriptor[] g = new PermissionDescriptor[0];
    private int h = 0;
    private int i = 0;
    public int e = 0;

    public final akao a() {
        amkq.E(this.f.length > 0 || this.g.length > 0);
        this.a.getClass();
        this.b.getClass();
        this.c.getClass();
        this.d.getClass();
        amkq.E(this.h != 0);
        amkq.E(this.i != 0);
        akao akaoVar = new akao();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("REQUIRED_PERMISSIONS", this.f);
        bundle.putParcelableArray("OPTIONAL_PERMISSIONS", this.g);
        bundle.putInt("PAGE_VE_TYPE", this.a.a);
        bundle.putInt("ALLOW_ACCESS_BUTTON_VE_TYPE", this.b.a);
        bundle.putInt("CANCEL_BUTTON_VE_TYPE", this.c.a);
        bundle.putInt("OPEN_APP_SETTING_BUTTON_VE_TYPE", this.d.a);
        bundle.putInt("ALLOW_ACCESS_DESCRIPTION_RES_ID", this.h);
        bundle.putInt("OPEN_SETTING_DESCRIPTION_RES_ID", this.i);
        bundle.putInt("TITLE_RES_ID_KEY", this.e);
        bundle.putInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY", 0);
        bundle.putInt("OPEN_SETTING_BUTTON_RES_ID_KEY", 0);
        akaoVar.af(bundle);
        return akaoVar;
    }

    public final void b(int i) {
        amkq.E(i != 0);
        this.h = i;
    }

    public final void c(int i) {
        amkq.E(i != 0);
        this.i = i;
    }

    public final void d(PermissionDescriptor[] permissionDescriptorArr) {
        permissionDescriptorArr.getClass();
        this.g = (PermissionDescriptor[]) permissionDescriptorArr.clone();
    }

    public final void e(PermissionDescriptor[] permissionDescriptorArr) {
        permissionDescriptorArr.getClass();
        this.f = (PermissionDescriptor[]) permissionDescriptorArr.clone();
    }
}
