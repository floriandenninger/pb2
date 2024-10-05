package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vws extends oym {
    public boolean i;
    private final vwo j;

    public vws(vwu vwuVar, Context context, oyr oyrVar, Handler handler, vwr vwrVar) {
        super(context, oyrVar, oxv.a, 100L, null, false, handler, vwrVar, Integer.MAX_VALUE);
        this.i = false;
        vwo vwoVar = vwuVar.h;
        vwoVar.getClass();
        this.j = vwoVar;
        vcp.d(vwoVar.a.f == null);
        vwu vwuVar2 = vwoVar.a;
        vwuVar2.f = this;
        vwuVar2.d();
    }

    @Override // defpackage.oym, defpackage.oyb
    protected final boolean F() {
        return super.F() && this.j.b();
    }

    @Override // defpackage.oym, defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        super.k(i, obj);
        if (i == 1) {
            Surface surface = (Surface) obj;
            vwu vwuVar = this.j.a;
            if (vwuVar.e != surface) {
                vwuVar.e = surface;
                vwuVar.g = true;
                vwuVar.d();
            }
        }
    }

    @Override // defpackage.oym, defpackage.oyb
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        vcp.d(this.j.b());
        super.n(mediaCodec, z, mediaFormat, mediaCrypto);
    }

    @Override // defpackage.oym, defpackage.oys, defpackage.oyx
    protected final void pG(int i, long j, boolean z) {
        vcp.b(i == 0);
        super.pG(i, j, z);
        this.i = true;
        this.j.a.d();
    }

    @Override // defpackage.oym, defpackage.oyb, defpackage.oys, defpackage.oyx
    public final void q() {
        super.q();
        vwo vwoVar = this.j;
        vwu vwuVar = vwoVar.a;
        vwuVar.b.a(vwuVar);
        vwoVar.a.d();
    }
}
