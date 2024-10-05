package defpackage;

import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeiv implements Runnable, ozl {
    final /* synthetic */ aeiw a;
    private MediaFormat b;
    private pcm c;
    private final int d;
    private final String e;
    private final byte[] f;
    private final boolean g;

    public aeiv(aeiw aeiwVar, int i, String str, byte[] bArr, boolean z) {
        this.a = aeiwVar;
        this.d = i;
        this.e = str;
        this.f = bArr;
        this.g = z;
    }

    @Override // defpackage.ozl
    public final void b(pbg pbgVar) {
    }

    @Override // defpackage.ozl
    public final void c(pcm pcmVar) {
        this.c = pcmVar;
    }

    @Override // defpackage.pcn
    public final void d(MediaFormat mediaFormat) {
        this.b = mediaFormat;
    }

    @Override // defpackage.pcn
    public final void f(pgx pgxVar, int i) {
    }

    @Override // defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
    }

    @Override // defpackage.pcn
    public final int j(pbw pbwVar, int i, boolean z) {
        return 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pbz pdkVar;
        pfs pfsVar = new pfs(aeiw.a);
        pfn pfnVar = new pfn(this.f);
        if (!((Set) aaoq.bp.get()).contains(Integer.valueOf(this.d))) {
            pdkVar = new pdk();
        } else if (this.g) {
            pdkVar = new pfj(2);
        } else {
            pdkVar = new pfj(new pfd(), 0);
        }
        ozm ozmVar = new ozm(pdkVar);
        try {
            pbw pbwVar = new pbw(pfnVar, pfsVar.c, pfnVar.b(pfsVar));
            ozmVar.e(this);
            do {
            } while (ozmVar.i(pbwVar) == 0);
        } catch (IOException | InterruptedException unused) {
        }
        if (this.b == null) {
            afsi.b(2, 8, "Failed to extract a media format from init segment.");
            return;
        }
        String b = ozv.b(this.d, this.e);
        String str = this.a.b;
        MediaFormat mediaFormat = this.b;
        this.a.l(new aeiu(pfnVar, pfsVar, new ozv(b, str, mediaFormat.h, mediaFormat.i, -1.0f, mediaFormat.q, mediaFormat.r, -1, null, null), this.b, this.c, this.f.length));
    }
}
