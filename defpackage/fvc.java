package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fvc implements aaha {
    public final azrw a;
    public final zaw b;
    public final ajmu c;
    private final Context d;
    private final abab e;
    private final afyt f;
    private final Executor g;

    public fvc(Context context, abab ababVar, azrw azrwVar, zaw zawVar, ajmu ajmuVar, afyt afytVar, Executor executor) {
        this.d = context;
        ababVar.getClass();
        this.e = ababVar;
        this.a = azrwVar;
        zawVar.getClass();
        this.b = zawVar;
        this.c = ajmuVar;
        this.f = afytVar;
        this.g = executor;
    }

    public final void b(apxf apxfVar, Map map, ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, boolean z) {
        fhe fheVar;
        fhe fuzVar;
        aazx a = this.e.a();
        a.c = z;
        a.d = aear.F(this.d, this.f);
        a.a = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.b;
        String[] strArr = (String[]) modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c.toArray(new String[0]);
        strArr.getClass();
        a.b = strArr;
        a.m(apxfVar.c.I());
        Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        agak agakVar = (agak) yjj.u(map, "notification_data", agak.class);
        abab ababVar = this.e;
        if (s instanceof ftw) {
            fuzVar = new fvb((ftw) s);
        } else if (s instanceof fuy) {
            fuzVar = new fuz((fuy) s);
        } else {
            fheVar = new fhe();
            ababVar.b(a, new fva(this, apxfVar, fheVar, map, agakVar, null));
        }
        fheVar = fuzVar;
        ababVar.b(a, new fva(this, apxfVar, fheVar, map, agakVar, null));
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, final Map map) {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) apxfVar.pX(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((aahd) this.a.get()).d(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.d, map);
        ynm.k(this.f.c(), this.g, new ynk() { // from class: fuw
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                fvc fvcVar = fvc.this;
                apxf apxfVar2 = apxfVar;
                Map map2 = map;
                ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint2 = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
                zga.d("Failed to read the notification enabled state.", th);
                fvcVar.b(apxfVar2, map2, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint2, true);
            }
        }, new ynl() { // from class: fux
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                fvc.this.b(apxfVar, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, ((Boolean) obj).booleanValue());
            }
        });
    }
}
