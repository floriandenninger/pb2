package defpackage;

import com.google.android.apps.youtube.app.common.subscriptions.controller.SubscriptionNotificationOptionsDialogFragmentControllerImpl;
import com.google.protos.youtube.api.innertube.ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezg implements aaha {
    private final SubscriptionNotificationOptionsDialogFragmentControllerImpl a;
    private final /* synthetic */ int b;

    public ezg(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl, int i, byte[] bArr) {
        this.b = i;
        subscriptionNotificationOptionsDialogFragmentControllerImpl.getClass();
        this.a = subscriptionNotificationOptionsDialogFragmentControllerImpl;
    }

    public ezg(SubscriptionNotificationOptionsDialogFragmentControllerImpl subscriptionNotificationOptionsDialogFragmentControllerImpl, int i) {
        this.b = i;
        subscriptionNotificationOptionsDialogFragmentControllerImpl.getClass();
        this.a = subscriptionNotificationOptionsDialogFragmentControllerImpl;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        avae avaeVar = null;
        if (this.b == 0) {
            auui auuiVar = (auui) apxfVar.pX(auui.b);
            auuj auujVar = auuiVar.c;
            if (auujVar == null) {
                auujVar = auuj.a;
            }
            if (auujVar.b == 119226798) {
                auuj auujVar2 = auuiVar.c;
                if (auujVar2 == null) {
                    auujVar2 = auuj.a;
                }
                if (auujVar2.b == 119226798) {
                    avaeVar = (avae) auujVar2.c;
                } else {
                    avaeVar = avae.a;
                }
            }
            if (avaeVar != null) {
                this.a.g(avaeVar);
                return;
            }
            return;
        }
        ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint = (ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint) apxfVar.pX(ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.showModifyChannelNotificationOptionsEndpoint);
        auud auudVar = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
        if (auudVar == null) {
            auudVar = auud.a;
        }
        if (auudVar.b == 119226798) {
            auud auudVar2 = showModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.b;
            if (auudVar2 == null) {
                auudVar2 = auud.a;
            }
            if (auudVar2.b == 119226798) {
                avaeVar = (avae) auudVar2.c;
            } else {
                avaeVar = avae.a;
            }
        }
        if (avaeVar != null) {
            this.a.g(avaeVar);
        }
    }
}
