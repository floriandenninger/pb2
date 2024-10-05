package defpackage;

import android.media.UnsupportedSchemeException;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics;
import defpackage.aeph;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aepx implements aepq, aepw {
    public final WidevineHelper$Listener a;
    public final int b;
    public final PlayerConfigModel c;
    public final String d;
    public final azrw e;
    public final aeqg f;
    public boolean g;
    public boolean h;
    public aepe i;
    public boolean j;

    public aepx(WidevineHelper$Listener widevineHelper$Listener, int i, PlayerConfigModel playerConfigModel, String str, azrw azrwVar, aeqg aeqgVar) {
        afki.a(widevineHelper$Listener);
        this.a = widevineHelper$Listener;
        this.b = i;
        afki.a(playerConfigModel);
        this.c = playerConfigModel;
        afki.a(str);
        this.d = str;
        afki.a(azrwVar);
        this.e = azrwVar;
        afki.a(aeqgVar);
        this.f = aeqgVar;
    }

    public static aepe b(Uri uri, aeqg aeqgVar, Looper looper, Handler handler, aepx aepxVar, final String str, String str2, String str3, String str4, String str5, boolean z, final aeph aephVar, afjf afjfVar, PlayerConfigModel playerConfigModel) {
        aepe aepvVar;
        aeqj aeqjVar = new aeqj(playerConfigModel.aX() ? null : uri.toString(), aeqgVar, str, str2, str4, str5, handler, aepxVar);
        HashMap hashMap = new HashMap(1);
        hashMap.put("aid", str3);
        amnv amnvVar = new amnv() { // from class: com.google.android.libraries.youtube.media.player.drm.WidevineHelper$$ExternalSyntheticLambda0
            @Override // defpackage.amnv
            public final Object get() {
                return aeph.this.a(str);
            }
        };
        try {
            pbn pbnVar = new pbn(aeow.a);
            if (playerConfigModel.ak()) {
                try {
                    pbnVar.b("securityLevel", "L3");
                } catch (IllegalStateException e) {
                    String valueOf = String.valueOf(e.getLocalizedMessage());
                    afsi.b(1, 6, valueOf.length() != 0 ? "Cannot set mediaDrm property securityLevel to L3 : ".concat(valueOf) : new String("Cannot set mediaDrm property securityLevel to L3 : "));
                    String g = aear.g(pbnVar);
                    String valueOf2 = String.valueOf(g);
                    zga.l(valueOf2.length() != 0 ? "MediaDrm metrics while trying to set securityLevel to L3: ".concat(valueOf2) : new String("MediaDrm metrics while trying to set securityLevel to L3: "));
                    throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(g, new pbp(2, e));
                }
            }
            try {
                if (z) {
                    aepvVar = new aepd(looper, aeqjVar, hashMap, handler, aepxVar, pbnVar, afjfVar, playerConfigModel);
                } else {
                    aepvVar = new aepv(looper, aeqjVar, hashMap, handler, aepxVar, amnvVar, pbnVar, afjfVar);
                }
                return aepvVar;
            } catch (pbp e2) {
                throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(aear.g(pbnVar), e2);
            }
        } catch (UnsupportedSchemeException e3) {
            throw new WidevineHelper$UnsupportedDrmExceptionWithQoeMetrics(null, new pbp(1, e3));
        }
    }

    @Override // defpackage.aepw
    public final void rm() {
        VideoStreamingData videoStreamingData;
        boolean z = true;
        this.h = true;
        if (!this.j) {
            this.a.onHdDrmUnavailable(this.b, "SecureSurfaceUnavailable");
            return;
        }
        if (a() != 1) {
            this.a.onHdDrmUnavailable(this.b, "WidevineL1");
            return;
        }
        if (!this.c.Z()) {
            this.a.onHdDrmUnavailable(this.b, "DeviceBlacklisted");
            return;
        }
        this.g = true;
        WidevineHelper$Listener widevineHelper$Listener = this.a;
        int i = this.b;
        yjk.f();
        afbs afbsVar = (afbs) widevineHelper$Listener;
        if (i == afbsVar.u() && ((videoStreamingData = afbsVar.t) == null || !videoStreamingData.v)) {
            z = false;
        }
        afki.d(z);
        if (i != afbsVar.u()) {
            return;
        }
        afbsVar.z();
        afbsVar.M = 0;
        afbsVar.i.g();
    }

    public final int a() {
        if (!this.j) {
            return 3;
        }
        aepe aepeVar = this.i;
        return aepeVar != null ? aepeVar.h() : aepv.i();
    }
}
