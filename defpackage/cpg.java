package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpg implements cpc {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final czj j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public cpe f = new cpe();

    public cpg(czj czjVar, cpe cpeVar, ByteBuffer byteBuffer, int i) {
        this.j = czjVar;
        c(cpeVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    private final Bitmap e() {
        Bitmap.Config config;
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.i;
        }
        czj czjVar = this.j;
        Bitmap b = czjVar.a.b(this.t, this.s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        if (r10.j == r5.h) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0475 A[Catch: all -> 0x04b3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00ff, B:75:0x010e, B:77:0x0112, B:79:0x011d, B:81:0x0125, B:82:0x0129, B:84:0x012f, B:85:0x0133, B:87:0x0139, B:88:0x013f, B:90:0x0153, B:92:0x015c, B:96:0x017a, B:143:0x019f, B:101:0x01ab, B:103:0x01cd, B:109:0x01f8, B:114:0x0209, B:117:0x0213, B:119:0x021c, B:120:0x0224, B:122:0x022a, B:126:0x0237, B:129:0x0244, B:297:0x0187, B:144:0x0260, B:146:0x026c, B:149:0x0273, B:151:0x0289, B:154:0x0296, B:156:0x029c, B:158:0x02a6, B:160:0x02aa, B:162:0x02ae, B:167:0x02b7, B:170:0x02bd, B:172:0x02c1, B:176:0x02d5, B:177:0x0471, B:179:0x0475, B:183:0x047c, B:185:0x0480, B:186:0x0486, B:187:0x0499, B:190:0x02ca, B:197:0x02dd, B:199:0x0302, B:202:0x030a, B:209:0x032e, B:210:0x0335, B:212:0x0338, B:215:0x0345, B:218:0x0352, B:220:0x035d, B:222:0x036b, B:225:0x0364, B:232:0x044b, B:233:0x0380, B:235:0x0389, B:236:0x039a, B:238:0x039f, B:241:0x03a8, B:243:0x03b5, B:245:0x03ca, B:248:0x03d3, B:249:0x03d7, B:251:0x03dc, B:254:0x03e3, B:256:0x03ee, B:258:0x0403, B:265:0x0420, B:267:0x042e, B:270:0x0427, B:274:0x040c, B:291:0x045d, B:295:0x046b, B:296:0x0467, B:300:0x0115, B:301:0x0108, B:305:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0480 A[Catch: all -> 0x04b3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00ff, B:75:0x010e, B:77:0x0112, B:79:0x011d, B:81:0x0125, B:82:0x0129, B:84:0x012f, B:85:0x0133, B:87:0x0139, B:88:0x013f, B:90:0x0153, B:92:0x015c, B:96:0x017a, B:143:0x019f, B:101:0x01ab, B:103:0x01cd, B:109:0x01f8, B:114:0x0209, B:117:0x0213, B:119:0x021c, B:120:0x0224, B:122:0x022a, B:126:0x0237, B:129:0x0244, B:297:0x0187, B:144:0x0260, B:146:0x026c, B:149:0x0273, B:151:0x0289, B:154:0x0296, B:156:0x029c, B:158:0x02a6, B:160:0x02aa, B:162:0x02ae, B:167:0x02b7, B:170:0x02bd, B:172:0x02c1, B:176:0x02d5, B:177:0x0471, B:179:0x0475, B:183:0x047c, B:185:0x0480, B:186:0x0486, B:187:0x0499, B:190:0x02ca, B:197:0x02dd, B:199:0x0302, B:202:0x030a, B:209:0x032e, B:210:0x0335, B:212:0x0338, B:215:0x0345, B:218:0x0352, B:220:0x035d, B:222:0x036b, B:225:0x0364, B:232:0x044b, B:233:0x0380, B:235:0x0389, B:236:0x039a, B:238:0x039f, B:241:0x03a8, B:243:0x03b5, B:245:0x03ca, B:248:0x03d3, B:249:0x03d7, B:251:0x03dc, B:254:0x03e3, B:256:0x03ee, B:258:0x0403, B:265:0x0420, B:267:0x042e, B:270:0x0427, B:274:0x040c, B:291:0x045d, B:295:0x046b, B:296:0x0467, B:300:0x0115, B:301:0x0108, B:305:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[Catch: all -> 0x04b3, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:60:0x00cd, B:62:0x00d2, B:64:0x00d7, B:68:0x00dd, B:70:0x00e1, B:72:0x00f3, B:74:0x00ff, B:75:0x010e, B:77:0x0112, B:79:0x011d, B:81:0x0125, B:82:0x0129, B:84:0x012f, B:85:0x0133, B:87:0x0139, B:88:0x013f, B:90:0x0153, B:92:0x015c, B:96:0x017a, B:143:0x019f, B:101:0x01ab, B:103:0x01cd, B:109:0x01f8, B:114:0x0209, B:117:0x0213, B:119:0x021c, B:120:0x0224, B:122:0x022a, B:126:0x0237, B:129:0x0244, B:297:0x0187, B:144:0x0260, B:146:0x026c, B:149:0x0273, B:151:0x0289, B:154:0x0296, B:156:0x029c, B:158:0x02a6, B:160:0x02aa, B:162:0x02ae, B:167:0x02b7, B:170:0x02bd, B:172:0x02c1, B:176:0x02d5, B:177:0x0471, B:179:0x0475, B:183:0x047c, B:185:0x0480, B:186:0x0486, B:187:0x0499, B:190:0x02ca, B:197:0x02dd, B:199:0x0302, B:202:0x030a, B:209:0x032e, B:210:0x0335, B:212:0x0338, B:215:0x0345, B:218:0x0352, B:220:0x035d, B:222:0x036b, B:225:0x0364, B:232:0x044b, B:233:0x0380, B:235:0x0389, B:236:0x039a, B:238:0x039f, B:241:0x03a8, B:243:0x03b5, B:245:0x03ca, B:248:0x03d3, B:249:0x03d7, B:251:0x03dc, B:254:0x03e3, B:256:0x03ee, B:258:0x0403, B:265:0x0420, B:267:0x042e, B:270:0x0427, B:274:0x040c, B:291:0x045d, B:295:0x046b, B:296:0x0467, B:300:0x0115, B:301:0x0108, B:305:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v46, types: [short] */
    /* JADX WARN: Type inference failed for: r0v48 */
    @Override // defpackage.cpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpg.a():android.graphics.Bitmap");
    }

    @Override // defpackage.cpc
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(cpe cpeVar, ByteBuffer byteBuffer, int i) {
        int[] iArr;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int highestOneBit = Integer.highestOneBit(i);
        this.q = 0;
        this.f = cpeVar;
        this.e = -1;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.a = asReadOnlyBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
        this.p = false;
        Iterator it = cpeVar.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((cpd) it.next()).g == 3) {
                this.p = true;
                break;
            }
        }
        this.r = highestOneBit;
        int i2 = cpeVar.f;
        this.t = i2 / highestOneBit;
        int i3 = cpeVar.g;
        this.s = i3 / highestOneBit;
        this.c = this.j.c(i2 * i3);
        czj czjVar = this.j;
        int i4 = this.t * this.s;
        ctk ctkVar = czjVar.b;
        if (ctkVar == null) {
            iArr = new int[i4];
        } else {
            iArr = (int[]) ctkVar.a(i4, int[].class);
        }
        this.d = iArr;
    }
}
