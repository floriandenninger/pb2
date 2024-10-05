package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hbu implements aaha {
    private final ci a;
    private final SfvAudioItemPlaybackController b;
    private final aahd c;
    private final hav d;
    private final inp e;
    private final Map f;
    private final acqz g;
    private final aoae h;

    public hbu(ci ciVar, SfvAudioItemPlaybackController sfvAudioItemPlaybackController, aahd aahdVar, hav havVar, inp inpVar, aoae aoaeVar, Map map, acqz acqzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = ciVar;
        this.b = sfvAudioItemPlaybackController;
        this.c = aahdVar;
        this.d = havVar;
        this.e = inpVar;
        this.f = map;
        this.h = aoaeVar;
        this.g = acqzVar;
    }

    private static boolean b(aplt apltVar) {
        String str = apltVar.c;
        return str.equals("FEsfv_audio_pivot") || str.equals("FEsfv_hashtag_pivot") || str.equals("FEsfv_channel_pivot") || str.equals("FEsfv_analytics_screen") || str.equals("FEproduct_details") || str.equals("FEcommerce_cart");
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        amkq.E(apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint));
        aplt apltVar = (aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint);
        if (this.e.I()) {
            this.e.z();
        }
        if (b(apltVar) || apltVar.c.equals("FEsfv_audio_picker")) {
            if (b(apltVar)) {
                this.g.mM().t();
                this.d.e(apxfVar, new Bundle());
                return;
            }
            hbx aH = hbx.aH(apxfVar);
            dd supportFragmentManager = this.a.getSupportFragmentManager();
            aH.X.b(this.b);
            amxd listIterator = amsx.p(this.h.b).listIterator();
            while (listIterator.hasNext()) {
                aH.X.b((aoj) listIterator.next());
            }
            dn k = supportFragmentManager.k();
            if (this.f.containsKey(this.a.getClass())) {
                k.q(R.id.accessibility_layer_container, aH, "ReelBrowseFragmentTag");
            } else {
                k.u(android.R.id.content, aH, "ReelBrowseFragmentTag");
            }
            k.s(null);
            k.a();
            supportFragmentManager.aa();
            return;
        }
        this.c.a(apxfVar);
    }
}
