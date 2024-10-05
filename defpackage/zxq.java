package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import com.google.android.libraries.youtube.livecreation.controller.StreamConfig;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zxq implements zfi {
    private final /* synthetic */ int v;
    public static final /* synthetic */ zxq u = new zxq(20);
    public static final /* synthetic */ zxq t = new zxq(19);
    public static final /* synthetic */ zxq s = new zxq(18);
    public static final /* synthetic */ zxq r = new zxq(17);
    public static final /* synthetic */ zxq q = new zxq(16);
    public static final /* synthetic */ zxq p = new zxq(15);
    public static final /* synthetic */ zxq o = new zxq(14);
    public static final /* synthetic */ zxq n = new zxq(13);
    public static final /* synthetic */ zxq m = new zxq(12);
    public static final /* synthetic */ zxq l = new zxq(11);
    public static final /* synthetic */ zxq k = new zxq(10);
    public static final /* synthetic */ zxq j = new zxq(9);
    public static final /* synthetic */ zxq i = new zxq(8);
    public static final /* synthetic */ zxq h = new zxq(7);
    public static final /* synthetic */ zxq g = new zxq(6);
    public static final /* synthetic */ zxq f = new zxq(5);
    public static final /* synthetic */ zxq e = new zxq(4);
    public static final /* synthetic */ zxq d = new zxq(3);
    public static final /* synthetic */ zxq c = new zxq(2);
    public static final /* synthetic */ zxq b = new zxq(1);
    public static final /* synthetic */ zxq a = new zxq(0);

    private /* synthetic */ zxq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zga.b("Updating choose filter unvisited effect state failed.");
                return;
            case 1:
                zfi zfiVar = GalleryActivity.a;
                zga.d("Failed to clear cache.", (Throwable) obj);
                return;
            case 2:
                int i2 = aaue.b;
                ((Uri.Builder) obj).appendQueryParameter("retry", "1");
                return;
            case 3:
                ((Uri.Builder) obj).appendQueryParameter("retry", "1");
                return;
            case 4:
                int i3 = ScreencastHostService.s;
                ((StreamConfig) obj).q = true;
                return;
            case 5:
                PermissionDescriptor[] permissionDescriptorArr = LiveCreationActivity.c;
                zga.b("Failed to save the portrait stream count.");
                return;
            case 6:
                PermissionDescriptor[] permissionDescriptorArr2 = LiveCreationActivity.c;
                zga.b("Failed to save the live stream state in PDS.");
                return;
            case 7:
                PermissionDescriptor[] permissionDescriptorArr3 = LiveCreationActivity.c;
                zga.b("Failed to save the current timestamp in PDS.");
                return;
            case 8:
                PermissionDescriptor[] permissionDescriptorArr4 = LiveCreationActivity.c;
                zga.b("Can't write to ProtoDataStore");
                return;
            case 9:
                PermissionDescriptor[] permissionDescriptorArr5 = LiveCreationActivity.c;
                return;
            case 10:
                PermissionDescriptor[] permissionDescriptorArr6 = LiveCreationActivity.c;
                return;
            case 11:
                PermissionDescriptor[] permissionDescriptorArr7 = LiveCreationActivity.c;
                return;
            case 12:
                PermissionDescriptor[] permissionDescriptorArr8 = LiveCreationActivity.c;
                return;
            case 13:
                zga.d("Failed update hasSeenScreencastTooltip.", (Throwable) obj);
                return;
            case 14:
                return;
            case 15:
                long j2 = acjl.a;
                return;
            case 16:
                long j3 = acjl.a;
                return;
            case 17:
                long j4 = acjl.a;
                zga.d("Error getting game title", (Throwable) obj);
                return;
            case 18:
                long j5 = acjl.a;
                zga.d("Failed update hasSeenScreencastTooltip.", (Throwable) obj);
                return;
            case 19:
                long j6 = acjl.a;
                zga.d("Failed update isFirstStream.", (Throwable) obj);
                return;
            default:
                int i4 = adqc.E;
                return;
        }
    }
}
