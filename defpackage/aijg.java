package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijg {
    public final ypa a;
    private final abds b;
    private final abdt c;

    public aijg(ypa ypaVar, abds abdsVar, abdt abdtVar) {
        this.a = ypaVar;
        this.b = abdsVar;
        this.c = abdtVar;
    }

    private final anhy d(PlaybackStartDescriptor playbackStartDescriptor, acsx acsxVar, int i) {
        afww f;
        if (i > 0) {
            f = new aigx(i);
        } else {
            f = afww.f();
        }
        String l = playbackStartDescriptor.l();
        if (TextUtils.isEmpty(l)) {
            if (playbackStartDescriptor.a.d.size() > 0) {
                l = (String) playbackStartDescriptor.a.d.get(playbackStartDescriptor.b());
            } else {
                l = "";
            }
        }
        c(l, playbackStartDescriptor.k(), playbackStartDescriptor.a(), playbackStartDescriptor.i(), playbackStartDescriptor.y(), f, acsxVar);
        return f;
    }

    public final anhy a(PlaybackStartDescriptor playbackStartDescriptor) {
        return d(playbackStartDescriptor, null, -1);
    }

    public final anhy b(PlaybackStartDescriptor playbackStartDescriptor, aigd aigdVar) {
        return d(playbackStartDescriptor, aigdVar != null ? aigdVar.b : null, aigdVar != null ? aigdVar.e : -1);
    }

    public final void c(String str, String str2, int i, String str3, byte[] bArr, afwx afwxVar, acsx acsxVar) {
        this.a.d(new ahdn());
        if (acsxVar != null) {
            acsxVar.c("wn_s");
        }
        abdu a = this.c.a(str, str2, i, str3, bArr, new aijj(this.a, acsxVar));
        abds abdsVar = this.b;
        abdsVar.b.k(a, aasw.d, new aijf(this, afwxVar, acsxVar), abds.e(abdsVar.a, abdsVar.c));
    }
}
