package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxh {
    private static final Set c;
    public final Context a;
    public final Uri b;
    private final File d;
    private final Uri e;
    private final float f;
    private final long g;
    private final long h;
    private final vtz i;
    private final boolean j;
    private final boolean k;
    private final zsd l;

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("vide");
        hashSet.add("soun");
    }

    static long a(long[] jArr, long j, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = Math.max(0, (binarySearch ^ (-1)) - 1);
        }
        if (!z) {
            binarySearch++;
        }
        return binarySearch < jArr.length ? jArr[binarySearch] : j;
    }

    public static ddz b(Context context, Uri uri) {
        axkv g = vtw.g(context, uri);
        try {
            return new ddz(g, vug.b);
        } catch (IOException e) {
            g.close();
            throw new vrz(e, vry.ISO_FILE);
        }
    }

    static final axla e(int i, dfm dfmVar) {
        try {
            StringBuilder sb = new StringBuilder(17);
            sb.append("track-");
            sb.append(i);
            return new axla(sb.toString(), dfmVar, new ddz[0]);
        } catch (Throwable th) {
            throw new vrz(th, vry.CREATE_MP4_TRACK);
        }
    }

    public static vxh f(Context context, Uri uri, long j, long j2) {
        return g(context, uri, j, j2, new nbm());
    }

    public static vxh g(Context context, Uri uri, long j, long j2, nbm nbmVar) {
        return new vxh(context, null, uri, j, j2, null, 0.0f, 0L, null, nbmVar, false, 0L, null);
    }

    private final Uri h(String str) {
        return Uri.fromFile(this.d).buildUpon().appendPath(str).build();
    }

    private static boolean i(dfm dfmVar) {
        des n;
        dea deaVar;
        deq l = dfmVar.l();
        if (l == null || (n = l.n()) == null) {
            return false;
        }
        Iterator it = n.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                deaVar = null;
                break;
            }
            deb debVar = (deb) it.next();
            if (debVar instanceof dea) {
                deaVar = (dea) debVar;
                break;
            }
        }
        return deaVar instanceof dfd;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(6:(16:(7:311|312|(1:314)(1:355)|315|(1:317)(1:354)|318|(25:320|321|322|4|5|7|8|(3:10|11|12)(1:305)|14|15|16|17|(3:24|(4:27|(3:29|30|31)(1:33)|32|25)|34)|36|(3:38|39|(6:41|42|(6:46|47|(2:52|53)(3:55|56|(16:58|59|60|61|(3:165|166|(10:168|64|(3:65|(2:67|(2:68|(2:70|(4:74|(5:(1:77)(1:107)|78|(8:81|(3:84|(2:86|(1:88)(3:89|90|91))(3:93|94|95)|82)|96|97|(1:99)(1:102)|100|101|79)|103|104)(1:108)|105|106)(1:161))(1:162)))(2:163|164)|113)|116|(1:160)(1:120)|121|(3:124|(2:125|(5:127|(5:(3:131|(2:133|(1:135)(3:136|137|138))(3:139|140|141)|129)|142|143|(1:145)(1:153)|146)(1:154)|147|(2:149|150)(1:152)|151))|122)|157|158|159))|63|64|(3:65|(0)(0)|113)|116|(1:118)|160|121|(1:122)|157|158|159)(3:176|177|178))|54|43|44)|183|184|(4:278|279|280|281)(12:189|190|(15:193|194|195|196|197|(1:249)(1:201)|202|(4:205|(2:206|(5:(6:209|(3:212|(2:214|(1:216)(3:217|218|219))(3:220|221|222)|210)|223|224|(1:226)(1:238)|227)(1:239)|228|(1:232)|233|(1:235))(3:240|241|242))|237|203)|243|244|245|246|247|248|191)|253|254|255|(2:258|256)|259|260|(1:262)|263|264)))|288|(2:291|289)|292|255|(1:256)|259|260|(0)|263|264))|16|17|(5:19|22|24|(1:25)|34)|36|(0)|288|(1:289)|292|255|(1:256)|259|260|(0)|263|264)|7|8|(0)(0)|14|15)|3|4|5|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0386, code lost:
    
        r40 = r8;
        r50 = r9;
        r54 = r10;
        r53 = r11;
        r36 = r36 + (r6 * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0394, code lost:
    
        if (r15 != r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0396, code lost:
    
        r11 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x045a, code lost:
    
        r3 = r25;
        r7 = r26;
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0705, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0706, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ce A[Catch: IOException -> 0x06fe, TRY_LEAVE, TryCatch #13 {IOException -> 0x06fe, blocks: (B:8:0x01c9, B:10:0x01ce), top: B:7:0x01c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03ea A[Catch: all -> 0x066c, TryCatch #6 {all -> 0x066c, blocks: (B:61:0x0274, B:64:0x0292, B:65:0x02a4, B:67:0x02aa, B:68:0x02c4, B:70:0x02c7, B:74:0x02d3, B:77:0x02d9, B:78:0x02e4, B:84:0x0300, B:86:0x0306, B:88:0x0319, B:90:0x0326, B:91:0x032b, B:94:0x032c, B:95:0x0331, B:100:0x033c, B:106:0x0374, B:111:0x0386, B:116:0x03bf, B:118:0x03c9, B:120:0x03cf, B:121:0x03d5, B:122:0x03e4, B:124:0x03ea, B:127:0x0402, B:131:0x040a, B:133:0x0410, B:135:0x041f, B:137:0x042c, B:138:0x0431, B:140:0x0432, B:141:0x0437, B:146:0x0440, B:151:0x0455, B:158:0x0461, B:177:0x04a2, B:178:0x04ad, B:184:0x04bd, B:186:0x04d4), top: B:60:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06aa A[Catch: IOException -> 0x06f1, LOOP:13: B:256:0x06a4->B:258:0x06aa, LOOP_END, TryCatch #4 {IOException -> 0x06f1, blocks: (B:172:0x0676, B:173:0x067d, B:195:0x04ec, B:248:0x0644, B:251:0x064e, B:252:0x0655, B:255:0x06a0, B:256:0x06a4, B:258:0x06aa, B:260:0x06b4, B:262:0x06c2, B:263:0x06d1, B:288:0x067e, B:289:0x0690, B:291:0x0696, B:295:0x06df, B:297:0x06e8, B:298:0x06e9, B:299:0x06f0, B:197:0x04ee, B:199:0x04f6, B:201:0x04fc, B:202:0x0502, B:203:0x051b, B:205:0x0521, B:212:0x0547, B:214:0x054d, B:216:0x0562, B:218:0x0574, B:219:0x0579, B:221:0x057a, B:222:0x057f, B:227:0x058e, B:228:0x05a7, B:233:0x05bf, B:235:0x05c5, B:244:0x05ff, B:246:0x063c, B:17:0x01ef, B:19:0x01f6, B:22:0x01fb, B:24:0x0201, B:25:0x020b, B:27:0x0211, B:30:0x021d), top: B:16:0x01ef, inners: #7, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06c2 A[Catch: IOException -> 0x06f1, TryCatch #4 {IOException -> 0x06f1, blocks: (B:172:0x0676, B:173:0x067d, B:195:0x04ec, B:248:0x0644, B:251:0x064e, B:252:0x0655, B:255:0x06a0, B:256:0x06a4, B:258:0x06aa, B:260:0x06b4, B:262:0x06c2, B:263:0x06d1, B:288:0x067e, B:289:0x0690, B:291:0x0696, B:295:0x06df, B:297:0x06e8, B:298:0x06e9, B:299:0x06f0, B:197:0x04ee, B:199:0x04f6, B:201:0x04fc, B:202:0x0502, B:203:0x051b, B:205:0x0521, B:212:0x0547, B:214:0x054d, B:216:0x0562, B:218:0x0574, B:219:0x0579, B:221:0x057a, B:222:0x057f, B:227:0x058e, B:228:0x05a7, B:233:0x05bf, B:235:0x05c5, B:244:0x05ff, B:246:0x063c, B:17:0x01ef, B:19:0x01f6, B:22:0x01fb, B:24:0x0201, B:25:0x020b, B:27:0x0211, B:30:0x021d), top: B:16:0x01ef, inners: #7, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0211 A[Catch: all -> 0x06de, TryCatch #15 {all -> 0x06de, blocks: (B:17:0x01ef, B:19:0x01f6, B:22:0x01fb, B:24:0x0201, B:25:0x020b, B:27:0x0211, B:30:0x021d), top: B:16:0x01ef, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0696 A[Catch: IOException -> 0x06f1, LOOP:14: B:289:0x0690->B:291:0x0696, LOOP_END, TryCatch #4 {IOException -> 0x06f1, blocks: (B:172:0x0676, B:173:0x067d, B:195:0x04ec, B:248:0x0644, B:251:0x064e, B:252:0x0655, B:255:0x06a0, B:256:0x06a4, B:258:0x06aa, B:260:0x06b4, B:262:0x06c2, B:263:0x06d1, B:288:0x067e, B:289:0x0690, B:291:0x0696, B:295:0x06df, B:297:0x06e8, B:298:0x06e9, B:299:0x06f0, B:197:0x04ee, B:199:0x04f6, B:201:0x04fc, B:202:0x0502, B:203:0x051b, B:205:0x0521, B:212:0x0547, B:214:0x054d, B:216:0x0562, B:218:0x0574, B:219:0x0579, B:221:0x057a, B:222:0x057f, B:227:0x058e, B:228:0x05a7, B:233:0x05bf, B:235:0x05c5, B:244:0x05ff, B:246:0x063c, B:17:0x01ef, B:19:0x01f6, B:22:0x01fb, B:24:0x0201, B:25:0x020b, B:27:0x0211, B:30:0x021d), top: B:16:0x01ef, inners: #7, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0234 A[Catch: IOException -> 0x06f3, TRY_LEAVE, TryCatch #3 {IOException -> 0x06f3, blocks: (B:15:0x01e0, B:36:0x0225, B:38:0x0234), top: B:14:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02aa A[Catch: all -> 0x066c, TryCatch #6 {all -> 0x066c, blocks: (B:61:0x0274, B:64:0x0292, B:65:0x02a4, B:67:0x02aa, B:68:0x02c4, B:70:0x02c7, B:74:0x02d3, B:77:0x02d9, B:78:0x02e4, B:84:0x0300, B:86:0x0306, B:88:0x0319, B:90:0x0326, B:91:0x032b, B:94:0x032c, B:95:0x0331, B:100:0x033c, B:106:0x0374, B:111:0x0386, B:116:0x03bf, B:118:0x03c9, B:120:0x03cf, B:121:0x03d5, B:122:0x03e4, B:124:0x03ea, B:127:0x0402, B:131:0x040a, B:133:0x0410, B:135:0x041f, B:137:0x042c, B:138:0x0431, B:140:0x0432, B:141:0x0437, B:146:0x0440, B:151:0x0455, B:158:0x0461, B:177:0x04a2, B:178:0x04ad, B:184:0x04bd, B:186:0x04d4), top: B:60:0x0274 }] */
    /* JADX WARN: Type inference failed for: r20v0, types: [long] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vxl c() {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxh.c():vxl");
    }

    public final List d(ddz ddzVar, det detVar) {
        deo l;
        try {
            ArrayList arrayList = new ArrayList();
            for (dfm dfmVar : detVar.j(dfm.class)) {
                deq l2 = dfmVar.l();
                if (l2 != null && (l = l2.l()) != null && c.contains(l.a) && ((!this.k && ddzVar == null) || !i(dfmVar))) {
                    arrayList.add(e(arrayList.size(), dfmVar));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (!(th instanceof vrz)) {
                throw new vrz(th, vry.GENERATE_OUTPUT_TRACKS);
            }
            throw th;
        }
    }

    public vxh(Context context, File file, Uri uri, long j, long j2, Uri uri2, float f, long j3, vtz vtzVar, nbm nbmVar, boolean z, long j4, byte[] bArr) {
        this.a = context;
        this.d = file != null ? file : context.getCacheDir();
        this.b = uri;
        this.e = uri2;
        this.f = f;
        this.g = j3;
        this.i = vtzVar;
        this.j = nbmVar.a;
        this.l = new zsd(j, j2);
        this.k = z;
        this.h = j4;
    }
}
