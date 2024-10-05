package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class xiw {
    private final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private final Object b;
    private xiv c;

    public xiw(MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint, Object obj) {
        muteAdEndpointOuterClass$MuteAdEndpoint.getClass();
        this.a = muteAdEndpointOuterClass$MuteAdEndpoint;
        this.b = obj;
    }

    public xiv a() {
        if (this.c == null) {
            int cf = anaf.cf(this.a.b);
            if (cf == 0) {
                cf = 1;
            }
            int i = cf - 1;
            if (i == 1) {
                this.c = xiv.HIDE;
            } else if (i != 2) {
                this.c = xiv.UNKNOWN_MUTE_TYPE;
            } else {
                this.c = xiv.SKIP;
            }
        }
        return this.c;
    }
}
