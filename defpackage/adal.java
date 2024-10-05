package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adal implements aaha {
    private static final String a = zga.a("MDX.MdxPlaybackCommand");
    private final addy b;
    private final adlt c;
    private final acva d;

    public adal(addy addyVar, adlt adltVar, acva acvaVar) {
        this.b = addyVar;
        this.c = adltVar;
        this.d = acvaVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        atbe atbeVar;
        atbe atbeVar2;
        atbe atbeVar3;
        bpv bpvVar;
        if (!apxfVar.pY(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint)) {
            zga.m(a, "Mdx playback endpoint not filled");
            return;
        }
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint) apxfVar.pX(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint);
        if ((mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.b & 1) == 0) {
            zga.m(a, "Mdx playback endpoint not filled");
            return;
        }
        atcd atcdVar = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atcdVar == null) {
            atcdVar = atcd.a;
        }
        atbd atbdVar = atcdVar.c;
        if (atbdVar == null) {
            atbdVar = atbd.a;
        }
        if (atbdVar.b != 1) {
            zga.m(a, "Endpoint did not contain a MdxDevice or MdxScreen to connect to.");
            return;
        }
        atcd atcdVar2 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atcdVar2 == null) {
            atcdVar2 = atcd.a;
        }
        atbd atbdVar2 = atcdVar2.c;
        if (atbdVar2 == null) {
            atbdVar2 = atbd.a;
        }
        if (atbdVar2.b == 1) {
            atbeVar = (atbe) atbdVar2.c;
        } else {
            atbeVar = atbe.a;
        }
        if (atbeVar.e.isEmpty()) {
            if (atbeVar.d.isEmpty()) {
                return;
            }
            atcd atcdVar3 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atcdVar3 == null) {
                atcdVar3 = atcd.a;
            }
            adld j = adle.d(atcdVar3).j();
            j.d = (apxfVar.b & 1) != 0 ? apxfVar.c.I() : null;
            adle a2 = j.a();
            acvc a3 = acvd.a();
            a3.c(atbeVar.d);
            a3.b(atbeVar.c);
            a3.a = a2;
            zga.h(a, "starting background playback");
            this.d.e(a3.a());
            return;
        }
        addy addyVar = this.b;
        atcd atcdVar4 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atcdVar4 == null) {
            atcdVar4 = atcd.a;
        }
        atbd atbdVar3 = atcdVar4.c;
        if (atbdVar3 == null) {
            atbdVar3 = atbd.a;
        }
        if (atbdVar3.b == 1) {
            atbeVar2 = (atbe) atbdVar3.c;
        } else {
            atbeVar2 = atbe.a;
        }
        bpv A = addyVar.A(new ScreenId(atbeVar2.e));
        if (A == null || (bpvVar = addyVar.c) == null || !adeg.c(A.c, bpvVar.c) || this.c.g() == null) {
            addy addyVar2 = this.b;
            atcd atcdVar5 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atcdVar5 == null) {
                atcdVar5 = atcd.a;
            }
            atbd atbdVar4 = atcdVar5.c;
            if (atbdVar4 == null) {
                atbdVar4 = atbd.a;
            }
            if (atbdVar4.b == 1) {
                atbeVar3 = (atbe) atbdVar4.c;
            } else {
                atbeVar3 = atbe.a;
            }
            ScreenId screenId = new ScreenId(atbeVar3.e);
            atcd atcdVar6 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
            if (atcdVar6 == null) {
                atcdVar6 = atcd.a;
            }
            adle d = adle.d(atcdVar6);
            bpv A2 = addyVar2.A(screenId);
            if (A2 != null) {
                addyVar2.N(A2, d);
                return;
            }
            return;
        }
        adlm g = this.c.g();
        atcd atcdVar7 = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.c;
        if (atcdVar7 == null) {
            atcdVar7 = atcd.a;
        }
        g.M(adle.d(atcdVar7));
    }
}
