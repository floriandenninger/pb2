package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hry implements aaha {
    private final hvd a;

    public hry(hvd hvdVar) {
        this.a = hvdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        RecordingInfo recordingInfo = (RecordingInfo) yjj.u(map, "recording_info", RecordingInfo.class);
        apxf apxfVar2 = (apxf) yjj.u(map, "destination_endpoint", apxf.class);
        String str = (String) yjj.u(map, "fragment_tag", String.class);
        zto ztoVar = (zto) yjj.u(map, "kazoo_effects_loader", zto.class);
        axdk axdkVar = (axdk) yjj.u(map, "comment_sticker", axdk.class);
        hvd hvdVar = this.a;
        aulq aulqVar = ((ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint) apxfVar.pX(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint)).b;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aujp aujpVar = (aujp) aulqVar.pX(ReelEditVideoRendererOuterClass.reelEditVideoRenderer);
        if (hvdVar.a != null) {
            hvc hvcVar = new hvc();
            ztoVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("RECORDING_INFO", recordingInfo);
            if (apxfVar2 != null) {
                bundle.putByteArray("NAVIGATION_ENDPOINT", apxfVar2.toByteArray());
            }
            if (apxfVar != null) {
                bundle.putByteArray("REEL_EDIT_VIDEO_ENDPOINT_KEY", apxfVar.toByteArray());
            }
            if (aujpVar != null) {
                bundle.putByteArray("VIDEO_EDIT_RENDERER", aujpVar.toByteArray());
            }
            if (axdkVar != null) {
                bundle.putByteArray("comment_sticker", axdkVar.toByteArray());
            }
            if (ztoVar.i() == null) {
                ztoVar.e(null);
            }
            hvcVar.be(ztoVar.a(avwy.EFFECTS_FEATURE_KAZOO_TEXT_REELS_EDIT), ztoVar.a(avwy.EFFECTS_FEATURE_ADVANCED_TEXT_REELS_EDIT), ztoVar.a(avwy.EFFECTS_FEATURE_TEXT_BG_ROUNDED_CORNERS));
            hvcVar.a = ztoVar.a(avwy.EFFECTS_FEATURE_KAZOO_OUTPUT_EVENTS);
            hvcVar.bC(ztoVar);
            hvcVar.bB(ztoVar);
            hvcVar.bJ(ztoVar.i(), ztoVar.b);
            hvcVar.aP = true;
            hvcVar.aQ = 2;
            hvcVar.aO = 1;
            if (apxfVar2 != null && apxfVar2.pY(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)) {
                hvcVar.bD(((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apxfVar2.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).c * 1000000);
            }
            hvcVar.af(bundle);
            dn k = hvdVar.a.k();
            k.u(R.id.reel_container, hvcVar, str);
            k.a();
            return;
        }
        zga.b("fragmentManager is null");
    }
}
