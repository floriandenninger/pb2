package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hly implements zfi {
    public final /* synthetic */ zfi a;
    private final /* synthetic */ int b;

    public /* synthetic */ hly(zfi zfiVar, int i) {
        this.b = i;
        this.a = zfiVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            zfi zfiVar = this.a;
            hqe hqeVar = (hqe) obj;
            amru amruVar = hmc.a;
            zfiVar.a(Boolean.valueOf(hqeVar != null && hqeVar.b));
            return;
        }
        if (i == 1) {
            zfi zfiVar2 = this.a;
            amru amruVar2 = hmc.a;
            zga.d("Failed to load PDS", (Throwable) obj);
            zfiVar2.a(false);
            return;
        }
        if (i == 2) {
            zfi zfiVar3 = this.a;
            aosc aoscVar = (aosc) obj;
            PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
            zfiVar3.a(Boolean.valueOf(aoscVar != null && aoscVar.i));
            return;
        }
        zfi zfiVar4 = this.a;
        PermissionDescriptor[] permissionDescriptorArr2 = LiveCreationActivity.c;
        zga.d("Failed to load PDS", (Throwable) obj);
        zfiVar4.a(false);
    }
}
