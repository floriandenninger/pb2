package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.mdx.notification.LivingRoomNotificationRevokeManager;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adgu implements agal {
    private final Context a;
    private final shf b;
    private final adlt c;
    private final adeg d;
    private final LivingRoomNotificationRevokeManager e;
    private final anzg f;

    public adgu(Context context, anzg anzgVar, shf shfVar, adlt adltVar, adeg adegVar, LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager, byte[] bArr) {
        this.a = context;
        this.f = anzgVar;
        this.b = shfVar;
        this.c = adltVar;
        this.d = adegVar;
        this.e = livingRoomNotificationRevokeManager;
    }

    @Override // defpackage.agal
    public final boolean a(apeo apeoVar) {
        apxf apxfVar = apeoVar.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (!apxfVar.pY(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)) {
            return false;
        }
        if (this.c.g() == null) {
            apxf apxfVar2 = apeoVar.f;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            if ((((MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint) apxfVar2.pX(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint)).b & 2) != 0 && !this.d.j().isEmpty()) {
                anzg anzgVar = this.f;
                apek apekVar = apeoVar.e;
                if (apekVar == null) {
                    apekVar = apek.a;
                }
                anzgVar.a.edit().putInt("mdx.last_lr_notification_shown_id", apekVar.d).apply();
                anzg anzgVar2 = this.f;
                anzgVar2.a.edit().putLong("mdx.lr_notification_last_notif_shown_time_ms", this.b.c()).apply();
                anzg anzgVar3 = this.f;
                apek apekVar2 = apeoVar.e;
                if (apekVar2 == null) {
                    apekVar2 = apek.a;
                }
                anzgVar3.a.edit().putString("mdx.last_lr_notification_shown_tag", apekVar2.c).apply();
                LivingRoomNotificationRevokeManager livingRoomNotificationRevokeManager = this.e;
                livingRoomNotificationRevokeManager.b.g(livingRoomNotificationRevokeManager);
                return false;
            }
        }
        return true;
    }
}
