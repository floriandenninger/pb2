package defpackage;

import com.google.protos.youtube.api.innertube.CameraFlashEndpointOuterClass$CameraFlashEndpoint;
import com.google.protos.youtube.api.innertube.ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
import com.google.protos.youtube.api.innertube.SwitchCameraEndpointOuterClass$SwitchCameraEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abvd implements aaha {
    private final abvb a;

    public abvd(abvb abvbVar) {
        abvbVar.getClass();
        this.a = abvbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.a.l() == null) {
            zga.b("StreamControlState null - livestream not in progress?");
            return;
        }
        abvc l = this.a.l();
        if (apxfVar.pY(SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.switchCameraEndpoint)) {
            acif acifVar = (acif) l;
            acifVar.e.Q(((ce) l).O);
            acifVar.aD = false;
            return;
        }
        if (apxfVar.pY(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint)) {
            l.c(((ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint) apxfVar.pX(ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint)).b);
            return;
        }
        if (apxfVar.pY(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint)) {
            boolean z = ((CameraFlashEndpointOuterClass$CameraFlashEndpoint) apxfVar.pX(CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint)).b;
            acif acifVar2 = (acif) l;
            if (acifVar2.e.aI(true != z ? "off" : "torch")) {
                acifVar2.aD = z;
                return;
            }
            return;
        }
        if (apxfVar.pY(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint)) {
            final acif acifVar3 = (acif) l;
            acifVar3.ax.n(((MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint) apxfVar.pX(MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint)).b, new abwv() { // from class: achz
                @Override // defpackage.abwv
                public final void a(final boolean z2) {
                    final acif acifVar4 = acif.this;
                    acifVar4.ay = z2;
                    acifVar4.e.M(z2);
                    acifVar4.d.post(new Runnable() { // from class: acib
                        @Override // java.lang.Runnable
                        public final void run() {
                            whu.I(acif.this.av, !z2);
                        }
                    });
                }
            });
            return;
        }
        if (!apxfVar.pY(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)) {
            String valueOf = String.valueOf(apxfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("Unhandled StreamControlState command: ");
            sb.append(valueOf);
            throw new aahm(sb.toString());
        }
        LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
        if ((liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) == 0) {
            l.b(apxfVar);
            return;
        }
        asrc asrcVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
        if (asrcVar == null) {
            asrcVar = asrc.a;
        }
        l.a(asrcVar);
    }
}
