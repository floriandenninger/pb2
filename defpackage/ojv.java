package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojv extends fks implements ypd {
    public final azrw a;
    private final ypa b;
    private final azrw c;
    private final azrw d;

    public ojv(fln flnVar, ypa ypaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3) {
        super(flnVar);
        this.b = ypaVar;
        this.a = azrwVar;
        this.c = azrwVar2;
        this.d = azrwVar3;
    }

    public final void a(String str) {
        aixh n;
        PlayerResponseModel c;
        VideoStreamingData videoStreamingData;
        fhf a = ((ojg) this.c.get()).a();
        ainy ainyVar = (ainy) this.a.get();
        if (a == null || !TextUtils.equals(a.c(), str) || ainyVar == null || (n = ainyVar.n()) == null || (c = n.c()) == null || (videoStreamingData = c.c) == null || !videoStreamingData.D()) {
            if (d()) {
                ainyVar.Z();
                return;
            }
            return;
        }
        ((nnb) this.d.get()).f();
    }

    public final boolean d() {
        fhf a = ((ojg) this.c.get()).a();
        if (a == null || !a.e()) {
            return false;
        }
        String b = a.b();
        return b == null || TextUtils.equals("", b) || TextUtils.equals("PPSV", a.b());
    }

    @Override // defpackage.flm
    public final void kG() {
        this.b.m(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.b.g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{jqc.class, agku.class, aglb.class};
        }
        if (i == 0) {
            a(((jqc) obj).a);
            return null;
        }
        if (i == 1) {
            if (!d()) {
                return null;
            }
            ((ainy) this.a.get()).Z();
            return null;
        }
        if (i == 2) {
            a(((aglb) obj).a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
