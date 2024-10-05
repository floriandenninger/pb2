package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer.MediaFormat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pag implements ozt, pai {
    public final pac a;
    public final int b;
    private final Handler c;
    private final pfq d;
    private final ozx e;
    private final pgs g;
    private final paj h;
    private final long k;
    private final boolean m;
    private pao n;
    private pao o;
    private pad p;
    private int q;
    private oyw r;
    private boolean s;
    private boolean t;
    private boolean u;
    private IOException v;
    private final ozw f = new ozw();
    private final long[] l = new long[2];
    private final SparseArray j = new SparseArray();
    private final ArrayList i = new ArrayList();

    public pag(pgs pgsVar, pao paoVar, paj pajVar, pfq pfqVar, ozx ozxVar, long j, boolean z, Handler handler, pac pacVar, int i) {
        this.g = pgsVar;
        this.n = paoVar;
        this.h = pajVar;
        this.d = pfqVar;
        this.e = ozxVar;
        this.k = j;
        this.t = z;
        this.c = handler;
        this.a = pacVar;
        this.b = i;
        this.m = paoVar.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(String str) {
        return "text/vtt".equals(str) || "application/ttml+xml".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final boolean p(String str) {
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
    }

    private static MediaFormat q(int i, ozv ozvVar, String str, long j) {
        if (i == 0) {
            return MediaFormat.j(ozvVar.a, str, ozvVar.c, j, ozvVar.d, ozvVar.e);
        }
        if (i == 1) {
            return MediaFormat.b(ozvVar.a, str, ozvVar.c, -1, j, ozvVar.g, ozvVar.h, null, ozvVar.j);
        }
        if (i != 2) {
            return null;
        }
        return MediaFormat.e(ozvVar.a, str, ozvVar.c, j, ozvVar.j);
    }

    private static String r(ozv ozvVar) {
        String str = ozvVar.b;
        int i = 0;
        if (muf.R(str)) {
            String str2 = ozvVar.i;
            if (str2 == null) {
                return "audio/x-unknown";
            }
            String[] split = str2.split(",");
            int length = split.length;
            while (i < length) {
                String trim = split[i].trim();
                if (trim.startsWith("mp4a")) {
                    return "audio/mp4a-latm";
                }
                if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
                    return "audio/ac3";
                }
                if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
                    return "audio/eac3";
                }
                if (trim.startsWith("dtsc")) {
                    return "audio/vnd.dts";
                }
                if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
                    return "audio/vnd.dts.hd";
                }
                if (trim.startsWith("dtse")) {
                    return "audio/vnd.dts.hd;profile=lbr";
                }
                if (trim.startsWith("opus")) {
                    return "audio/opus";
                }
                if (trim.startsWith("vorbis")) {
                    return "audio/vorbis";
                }
                i++;
            }
            return "audio/x-unknown";
        }
        if (muf.S(str)) {
            String str3 = ozvVar.i;
            if (str3 == null) {
                return "video/x-unknown";
            }
            String[] split2 = str3.split(",");
            int length2 = split2.length;
            while (i < length2) {
                String trim2 = split2[i].trim();
                if (trim2.startsWith("avc1") || trim2.startsWith("avc3")) {
                    return "video/avc";
                }
                if (trim2.startsWith("hev1") || trim2.startsWith("hvc1")) {
                    return "video/hevc";
                }
                if (trim2.startsWith("vp9")) {
                    return "video/x-vnd.on2.vp9";
                }
                if (trim2.startsWith("vp8")) {
                    return "video/x-vnd.on2.vp8";
                }
                i++;
            }
            return "video/x-unknown";
        }
        if (m(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        if ("stpp".equals(ozvVar.i)) {
            return "application/ttml+xml";
        }
        if ("wvtt".equals(ozvVar.i)) {
            return "application/x-mp4vtt";
        }
        return null;
    }

    private final void s(pao paoVar) {
        oyw oyvVar;
        par b = paoVar.b(0);
        while (this.j.size() > 0 && ((pae) this.j.valueAt(0)).b < b.a * 1000) {
            this.j.remove(((pae) this.j.valueAt(0)).a);
        }
        if (this.j.size() > paoVar.a()) {
            return;
        }
        try {
            int size = this.j.size();
            if (size > 0) {
                ((pae) this.j.valueAt(0)).b(paoVar, 0, this.p);
                if (size > 1) {
                    int i = size - 1;
                    ((pae) this.j.valueAt(i)).b(paoVar, i, this.p);
                }
            }
            for (int size2 = this.j.size(); size2 < paoVar.a(); size2++) {
                this.j.put(this.q, new pae(this, this.q, paoVar, size2, this.p));
                this.q++;
            }
            long currentTimeMillis = System.currentTimeMillis() * 1000;
            pae paeVar = (pae) this.j.valueAt(0);
            pae paeVar2 = (pae) this.j.valueAt(r4.size() - 1);
            if (!this.n.c || paeVar2.f) {
                oyvVar = new oyv(paeVar.g, paeVar2.a());
            } else {
                long j = paeVar.g;
                long a = paeVar2.e ? Long.MAX_VALUE : paeVar2.a();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                pao paoVar2 = this.n;
                long j2 = (elapsedRealtime * 1000) - (currentTimeMillis - (paoVar2.a * 1000));
                long j3 = paoVar2.e;
                oyvVar = new oyu(j, a, j2, j3 == -1 ? -1L : j3 * 1000);
            }
            oyw oywVar = this.r;
            if (oywVar == null || !oywVar.equals(oyvVar)) {
                this.r = oyvVar;
                Handler handler = this.c;
                if (handler != null && this.a != null) {
                    handler.post(new pab(this, oyvVar));
                }
            }
            this.n = paoVar;
        } catch (oxb e) {
            this.v = e;
        }
    }

    @Override // defpackage.ozt
    public final int a() {
        return this.i.size();
    }

    @Override // defpackage.ozt
    public final MediaFormat b(int i) {
        return ((pad) this.i.get(i)).a;
    }

    @Override // defpackage.ozt
    public final void c(long j) {
        pgs pgsVar = this.g;
        if (pgsVar != null && this.n.c && this.v == null) {
            Object obj = pgsVar.l;
            if (obj != null && obj != this.o) {
                pao paoVar = (pao) obj;
                s(paoVar);
                this.o = paoVar;
            }
            long j2 = this.n.d;
            if (j2 == 0) {
                j2 = 5000;
            }
            if (SystemClock.elapsedRealtime() > this.g.m + j2) {
                pgs pgsVar2 = this.g;
                if (pgsVar2.k == null || SystemClock.elapsedRealtime() >= pgsVar2.j + Math.min((pgsVar2.i - 1) * 1000, 5000L)) {
                    if (pgsVar2.f == null) {
                        pgsVar2.f = new pge("manifestLoader");
                    }
                    if (pgsVar2.f.b) {
                        return;
                    }
                    pgsVar2.g = new pgh(pgsVar2.d, pgsVar2.b, pgsVar2.a);
                    pgsVar2.h = SystemClock.elapsedRealtime();
                    pgsVar2.f.d(pgsVar2.g, pgsVar2);
                }
            }
        }
    }

    @Override // defpackage.ozt
    public final void d(List list) {
        pge pgeVar;
        this.p.a();
        pgs pgsVar = this.g;
        if (pgsVar != null) {
            int i = pgsVar.e - 1;
            pgsVar.e = i;
            if (i == 0 && (pgeVar = pgsVar.f) != null) {
                pgeVar.b();
                pgsVar.f = null;
            }
        }
        this.j.clear();
        this.f.c = null;
        this.r = null;
        this.v = null;
        this.p = null;
    }

    @Override // defpackage.ozt
    public final void e(int i) {
        pad padVar = (pad) this.i.get(i);
        this.p = padVar;
        padVar.a();
        pgs pgsVar = this.g;
        if (pgsVar != null) {
            int i2 = pgsVar.e;
            pgsVar.e = i2 + 1;
            if (i2 == 0) {
                pgsVar.i = 0;
                pgsVar.k = null;
            }
            s((pao) pgsVar.l);
            return;
        }
        s(this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c2  */
    @Override // defpackage.ozt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r24, long r25, defpackage.ozn r27) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.f(java.util.List, long, ozn):void");
    }

    @Override // defpackage.ozt
    public final void g() {
        pgq pgqVar;
        IOException iOException = this.v;
        if (iOException != null) {
            throw iOException;
        }
        pgs pgsVar = this.g;
        if (pgsVar != null && (pgqVar = pgsVar.k) != null && pgsVar.i > pgsVar.c) {
            throw pgqVar;
        }
    }

    @Override // defpackage.ozt
    public void h(ozk ozkVar) {
        pbg pbgVar;
        pcm pcmVar;
        if (ozkVar instanceof ozy) {
            ozy ozyVar = (ozy) ozkVar;
            String str = ozyVar.c.a;
            pae paeVar = (pae) this.j.get(ozyVar.e);
            if (paeVar == null) {
                return;
            }
            paf pafVar = (paf) paeVar.c.get(str);
            MediaFormat mediaFormat = ozyVar.g;
            if (mediaFormat != null) {
                pafVar.e = mediaFormat;
            }
            if (pafVar.d == null && (pcmVar = ozyVar.i) != null) {
                ozyVar.d.a.toString();
                pafVar.d = new pak((pbv) pcmVar);
            }
            if (paeVar.d != null || (pbgVar = ozyVar.h) == null) {
                return;
            }
            paeVar.d = pbgVar;
        }
    }

    @Override // defpackage.ozt
    public final void i(ozk ozkVar, Exception exc) {
    }

    @Override // defpackage.ozt
    public final boolean j() {
        if (!this.s) {
            this.s = true;
            try {
                this.h.a(this.n, this);
            } catch (IOException e) {
                this.v = e;
            }
        }
        return this.v == null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ozk k(pae paeVar, paf pafVar, pfq pfqVar, MediaFormat mediaFormat, pad padVar, int i, int i2, boolean z) {
        pav pavVar = pafVar.c;
        ozv ozvVar = pavVar.e;
        long c = pafVar.c(i);
        long b = pafVar.b(i);
        pas d = pafVar.d(i);
        pfs pfsVar = new pfs(d.a(pavVar.g), d.a, d.b, pavVar.h);
        long j = paeVar.b - pavVar.f;
        if (m(ozvVar.b)) {
            return new paa(pfqVar, pfsVar, ozvVar, c, b, i, padVar.a, paeVar.a);
        }
        return new ozu(pfqVar, pfsVar, i2, ozvVar, c, b, i, j, pafVar.b, mediaFormat, padVar.b, padVar.c, paeVar.d, z, paeVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pbz l(String str) {
        return p(str) ? new pfj(1) : new pdk();
    }

    @Override // defpackage.pai
    public final void n(pao paoVar, int i, int[] iArr) {
        if (this.e == null) {
            Log.w("DashChunkSource", "Skipping adaptive track (missing format evaluator)");
            return;
        }
        pal palVar = (pal) paoVar.b(0).b.get(i);
        int length = iArr.length;
        ozv[] ozvVarArr = new ozv[length];
        ozv ozvVar = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            ozv ozvVar2 = ((pav) palVar.b.get(iArr[i4])).e;
            if (ozvVar == null || ozvVar2.e > i3) {
                ozvVar = ozvVar2;
            }
            i2 = Math.max(i2, ozvVar2.d);
            i3 = Math.max(i3, ozvVar2.e);
            ozvVarArr[i4] = ozvVar2;
        }
        Arrays.sort(ozvVarArr, new uo(11));
        long j = this.m ? -1L : paoVar.b * 1000;
        String r = r(ozvVar);
        if (r == null) {
            Log.w("DashChunkSource", "Skipped adaptive track (unknown media mime type)");
            return;
        }
        MediaFormat q = q(palVar.a, ozvVar, r, j);
        if (q == null) {
            Log.w("DashChunkSource", "Skipped adaptive track (unknown media format)");
        } else {
            this.i.add(new pad(new MediaFormat(null, q.b, -1, -1, q.e, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, true, q.j, q.k, -1, -1, -1, null, q.n, q.p), i, ozvVarArr, i2, i3));
        }
    }

    @Override // defpackage.pai
    public final void o(pao paoVar, int i, int i2) {
        pal palVar = (pal) paoVar.b(0).b.get(i);
        ozv ozvVar = ((pav) palVar.b.get(i2)).e;
        String r = r(ozvVar);
        if (r == null) {
            String str = ozvVar.a;
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append("Skipped track ");
            sb.append(str);
            sb.append(" (unknown media mime type)");
            Log.w("DashChunkSource", sb.toString());
            return;
        }
        MediaFormat q = q(palVar.a, ozvVar, r, paoVar.c ? -1L : paoVar.b * 1000);
        if (q == null) {
            String str2 = ozvVar.a;
            StringBuilder sb2 = new StringBuilder(str2.length() + 37);
            sb2.append("Skipped track ");
            sb2.append(str2);
            sb2.append(" (unknown media format)");
            Log.w("DashChunkSource", sb2.toString());
            return;
        }
        this.i.add(new pad(q, i, ozvVar));
    }
}
