package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bie implements bil {
    private static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final Constructor b;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(bih.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        b = constructor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x02d0, code lost:
    
        if (r15 == r3) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02d2, code lost:
    
        b(r15, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02da A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d A[Catch: all -> 0x02f4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0016, B:8:0x001d, B:13:0x0181, B:14:0x0184, B:19:0x02d2, B:20:0x02d5, B:22:0x02da, B:25:0x02e0, B:27:0x02e3, B:31:0x02e6, B:36:0x018d, B:38:0x0195, B:41:0x019f, B:44:0x01aa, B:46:0x01b2, B:49:0x01bc, B:52:0x01c7, B:55:0x01d2, B:58:0x01dd, B:60:0x01eb, B:63:0x01f5, B:66:0x0200, B:68:0x0208, B:70:0x0216, B:72:0x0224, B:75:0x0234, B:77:0x0242, B:80:0x024c, B:82:0x0254, B:84:0x025c, B:86:0x0264, B:89:0x026e, B:91:0x0276, B:94:0x0285, B:96:0x028d, B:99:0x0296, B:101:0x029e, B:104:0x02a7, B:106:0x02af, B:117:0x003b, B:118:0x0043, B:121:0x0158, B:137:0x0048, B:140:0x0054, B:143:0x0060, B:146:0x006c, B:149:0x0077, B:152:0x0082, B:155:0x008d, B:158:0x0099, B:161:0x00a5, B:164:0x00b1, B:167:0x00bd, B:170:0x00c8, B:173:0x00d3, B:176:0x00de, B:179:0x00ea, B:182:0x00f6, B:185:0x0101, B:188:0x010c, B:191:0x0117, B:194:0x0122, B:197:0x012c, B:200:0x0137, B:203:0x0142, B:206:0x014d), top: B:2:0x0001 }] */
    @Override // defpackage.bil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.bih[] a(android.net.Uri r19, java.util.Map r20) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bie.a(android.net.Uri, java.util.Map):bih[]");
    }

    private static final void b(int i, List list) {
        switch (i) {
            case 0:
                list.add(new blq());
                return;
            case 1:
                list.add(new bls());
                return;
            case 2:
                list.add(new blu(null));
                return;
            case 3:
                list.add(new bjg(null));
                return;
            case 4:
                Constructor constructor = b;
                if (constructor != null) {
                    try {
                        list.add((bih) constructor.newInstance(0));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new bjj(null));
                return;
            case 5:
                list.add(new bjl());
                return;
            case 6:
                list.add(new bjz(0));
                return;
            case 7:
                list.add(new bke(null));
                return;
            case 8:
                list.add(new bkt(null));
                list.add(new bkw(null));
                return;
            case 9:
                list.add(new blf());
                return;
            case 10:
                list.add(new bmq());
                return;
            case 11:
                list.add(new bmy(null));
                return;
            case 12:
                list.add(new bnf());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new bjq());
                return;
        }
    }
}
