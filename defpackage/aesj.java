package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aesj implements aesk {
    public VideoStreamingData b;
    public aeqr c;
    public String d;
    public PlayerConfigModel e;
    public afkl f;
    public aesn g;
    public aesm h;
    public float i;
    public float j;
    public int k;
    public afjf l;
    public afft m;
    byte[] n;

    public aesj() {
    }

    public aesj(final aesk aeskVar) {
        this.b = aeskVar.i();
        this.c = aeskVar.j();
        this.d = aeskVar.n();
        this.e = aeskVar.h();
        this.f = aeskVar.b();
        this.g = aeskVar.k();
        aeskVar.getClass();
        this.h = new aesm() { // from class: aesi
            @Override // defpackage.aesm
            public final Uri a(FormatStreamModel formatStreamModel, long j, long j2) {
                return aesk.this.g(formatStreamModel, j, j2);
            }
        };
        this.i = aeskVar.e();
        this.j = aeskVar.d();
        this.k = aeskVar.f();
        this.l = aeskVar.m();
        this.m = aeskVar.l();
        this.n = aeskVar.p();
    }

    @Override // defpackage.aesk
    public afkl b() {
        return this.f;
    }

    @Override // defpackage.aesk
    public final float d() {
        return this.j;
    }

    @Override // defpackage.aesk
    public final float e() {
        return this.i;
    }

    @Override // defpackage.aesk
    public final int f() {
        return this.k;
    }

    @Override // defpackage.aesk
    public final Uri g(FormatStreamModel formatStreamModel, long j, long j2) {
        return this.h.a(formatStreamModel, j, j2);
    }

    @Override // defpackage.aesk
    public final PlayerConfigModel h() {
        return this.e;
    }

    @Override // defpackage.aesk
    public final VideoStreamingData i() {
        return this.b;
    }

    @Override // defpackage.aesk
    public final aeqr j() {
        return this.c;
    }

    @Override // defpackage.aesk
    public final aesn k() {
        return this.g;
    }

    @Override // defpackage.aesk
    public final afft l() {
        return this.m;
    }

    @Override // defpackage.aesk
    public final afjf m() {
        return this.l;
    }

    @Override // defpackage.aesk
    public final String n() {
        return this.d;
    }

    @Override // defpackage.aesk
    public final /* synthetic */ boolean o(int i) {
        return aedn.h(this, i);
    }

    @Override // defpackage.aesk
    public final byte[] p() {
        return this.n;
    }

    public final void q(VideoStreamingData videoStreamingData, aeqr aeqrVar, String str, PlayerConfigModel playerConfigModel, afkl afklVar, aesn aesnVar, aesm aesmVar, float f, float f2, int i, afjf afjfVar, afft afftVar, byte[] bArr) {
        this.b = videoStreamingData;
        this.c = aeqrVar;
        this.d = str;
        this.e = playerConfigModel;
        this.f = afklVar;
        this.g = aesnVar;
        this.h = aesmVar;
        this.i = f;
        this.j = f2;
        this.k = i;
        this.l = afjfVar;
        this.m = afftVar;
        this.n = bArr;
    }

    public final void r(Integer num) {
        this.k = num.intValue() | this.k;
    }

    public final void s(Integer num) {
        this.k = num.intValue();
    }

    public final void t(Float f) {
        this.j = f.floatValue();
    }

    public final void u(Float f) {
        this.i = f.floatValue();
    }
}
