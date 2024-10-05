package defpackage;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkp {
    private static final byte[] a = pts.Z("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        if (r11 != 1684108385) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        if (r11 == 1684108385) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f4, code lost:
    
        r1.H(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f3, code lost:
    
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fc, code lost:
    
        if (r10 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01fe, code lost:
    
        if (r13 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
    
        if (r14 != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0203, code lost:
    
        r1.G(r14);
        r1.H(16);
        r2 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r10, r13, r1.u(r15 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0218, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02da, code lost:
    
        r2 = java.lang.String.valueOf(defpackage.bkk.g(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e8, code lost:
    
        if (r2.length() == 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ea, code lost:
    
        "Skipped unknown metadata entry: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ed, code lost:
    
        r1.G(r8);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0074, code lost:
    
        r9 = defpackage.bku.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0078, code lost:
    
        if (r9 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x007c, code lost:
    
        if (r9 > 192) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x007e, code lost:
    
        r9 = defpackage.bku.a[r9 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0086, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0088, code lost:
    
        r10 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", r2, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x008e, code lost:
    
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0085, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x030e, code lost:
    
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0311, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x021f, code lost:
    
        r2 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0226, code lost:
    
        if (r2 != 6516084) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0228, code lost:
    
        r0 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0230, code lost:
    
        if (r1.d() != 1684108385) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0232, code lost:
    
        r1.H(8);
        r0 = r1.u(r0 - 16);
        r10 = new com.google.android.exoplayer2.metadata.id3.CommentFrame("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r1.G(r7);
        r7 = r7 + r8;
        r1.H(r0);
        r3 = new java.util.ArrayList();
        r2 = r2;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ff, code lost:
    
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0247, code lost:
    
        r2 = java.lang.String.valueOf(defpackage.bkk.g(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0257, code lost:
    
        if (r2.length() == 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0259, code lost:
    
        r0 = "Failed to parse comment attribute: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0264, code lost:
    
        android.util.Log.w("MetadataUtil", r0);
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x025e, code lost:
    
        r0 = new java.lang.String("Failed to parse comment attribute: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0272, code lost:
    
        if (r2 == 7233901) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0277, code lost:
    
        if (r2 != 7631467) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r8 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x027e, code lost:
    
        if (r2 == 6516589) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0283, code lost:
    
        if (r2 != 7828084) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x028a, code lost:
    
        if (r2 != 6578553) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x028c, code lost:
    
        r10 = defpackage.bku.d(r13, "TDRC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r8 >= r7) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0297, code lost:
    
        if (r2 != 4280916) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0299, code lost:
    
        r10 = defpackage.bku.d(r13, "TPE1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02a3, code lost:
    
        if (r2 != 7630703) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02a5, code lost:
    
        r10 = defpackage.bku.d(r13, "TSSE", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02af, code lost:
    
        if (r2 != 6384738) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02b1, code lost:
    
        r10 = defpackage.bku.d(r13, "TALB", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02bb, code lost:
    
        if (r2 != 7108978) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r13 = defpackage.bku.b;
        r8 = r8 + r1.d();
        r13 = r1.d();
        r14 = (r13 >> 24) & org.chromium.net.PrivateKeyType.INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02bd, code lost:
    
        r10 = defpackage.bku.d(r13, "USLT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02c7, code lost:
    
        if (r2 != 6776174) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x02c9, code lost:
    
        r10 = defpackage.bku.d(r13, "TCON", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02d1, code lost:
    
        if (r2 != 6779504) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x02d3, code lost:
    
        r10 = defpackage.bku.d(r13, "TIT1", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02f2, code lost:
    
        r10 = defpackage.bku.d(r13, "TCOM", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02f9, code lost:
    
        r10 = defpackage.bku.d(r13, "TIT2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (r14 == 169) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0318, code lost:
    
        if (r3.isEmpty() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x031b, code lost:
    
        r3 = new com.google.android.exoplayer2.metadata.Metadata(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r14 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0369, code lost:
    
        if (r0 != 13) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r13 != 1735291493) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r13 != 1684632427) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r10 = defpackage.bku.c(1684632427, "TPOS", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r1.G(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0302, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0304, code lost:
    
        r3.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0307, code lost:
    
        r2 = null;
        r11 = 0;
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13 != 1953655662) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r10 = defpackage.bku.c(1953655662, "TRCK", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r10 = defpackage.bku.b(1953329263, "TBPM", r1, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r10 = defpackage.bku.b(1668311404, "TCMP", r1, r12, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r0 = r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
    
        if (r1.d() != 1684108385) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
    
        r9 = defpackage.bkk.e(r1.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        if (r9 != 13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        r13 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r13 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f5, code lost:
    
        r0 = new java.lang.StringBuilder(41);
        r0.append("Unrecognized cover art flags: ");
        r0.append(r9);
        android.util.Log.w("MetadataUtil", r0.toString());
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        r1.H(4);
        r0 = r0 - 16;
        r9 = new byte[r0];
        r1.B(r9, r11, r0);
        r10 = new com.google.android.exoplayer2.metadata.id3.ApicFrame(r13, r2, 3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r9 != 14) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r13 = "image/png";
        r9 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        android.util.Log.w("MetadataUtil", "Failed to parse cover art attribute");
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0129, code lost:
    
        if (r13 != 1631670868) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        r10 = defpackage.bku.d(1631670868, "TPE2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r13 != 1936682605) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r10 = defpackage.bku.d(1936682605, "TSOT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        if (r13 != 1936679276) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0145, code lost:
    
        r10 = defpackage.bku.d(1936679276, "TSO2", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0150, code lost:
    
        if (r13 != 1936679282) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
    
        r10 = defpackage.bku.d(1936679282, "TSOA", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015d, code lost:
    
        if (r13 != 1936679265) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        r10 = defpackage.bku.d(1936679265, "TSOP", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
    
        if (r13 != 1936679791) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
    
        r10 = defpackage.bku.d(1936679791, "TSOC", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (r13 != 1920233063) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        r10 = defpackage.bku.b(1920233063, "ITUNESADVISORY", r1, r11, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018d, code lost:
    
        if (r13 != 1885823344) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018f, code lost:
    
        r10 = defpackage.bku.b(1885823344, "ITUNESGAPLESS", r1, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019d, code lost:
    
        if (r13 != 1936683886) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x019f, code lost:
    
        r10 = defpackage.bku.d(1936683886, "TVSHOWSORT", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ad, code lost:
    
        if (r13 != 1953919848) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01af, code lost:
    
        r10 = defpackage.bku.d(1953919848, "TVSHOW", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bd, code lost:
    
        if (r13 != 757935405) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        r10 = r2;
        r13 = r10;
        r14 = -1;
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        r2 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
    
        if (r2 >= r8) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r16 = r1.d();
        r11 = r1.d();
        r1.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d7, code lost:
    
        if (r11 != 1835360622) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        r10 = r1.u(r16 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e3, code lost:
    
        if (r11 != 1851878757) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e5, code lost:
    
        r13 = r1.u(r16 - 12);
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(defpackage.bkj r17) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkp.a(bkj):android.util.Pair");
    }

    public static Metadata b(bki bkiVar) {
        MdtaMetadataEntry mdtaMetadataEntry;
        bkj b = bkiVar.b(1751411826);
        bkj b2 = bkiVar.b(1801812339);
        bkj b3 = bkiVar.b(1768715124);
        if (b == null || b2 == null || b3 == null || f(b.a) != 1835299937) {
            return null;
        }
        pth pthVar = b2.a;
        pthVar.G(12);
        int d = pthVar.d();
        String[] strArr = new String[d];
        for (int i = 0; i < d; i++) {
            int d2 = pthVar.d();
            pthVar.H(4);
            strArr[i] = pthVar.v(d2 - 8);
        }
        pth pthVar2 = b3.a;
        pthVar2.G(8);
        ArrayList arrayList = new ArrayList();
        while (pthVar2.a() > 8) {
            int i2 = pthVar2.b;
            int d3 = pthVar2.d();
            int d4 = pthVar2.d() - 1;
            if (d4 < 0 || d4 >= d) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(d4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[d4];
                int i3 = i2 + d3;
                int i4 = bku.b;
                while (true) {
                    int i5 = pthVar2.b;
                    if (i5 >= i3) {
                        mdtaMetadataEntry = null;
                        break;
                    }
                    int d5 = pthVar2.d();
                    if (pthVar2.d() != 1684108385) {
                        pthVar2.G(i5 + d5);
                    } else {
                        int d6 = pthVar2.d();
                        int d7 = pthVar2.d();
                        int i6 = d5 - 16;
                        byte[] bArr = new byte[i6];
                        pthVar2.B(bArr, 0, i6);
                        mdtaMetadataEntry = new MdtaMetadataEntry(str, bArr, d7, d6);
                        break;
                    }
                }
                if (mdtaMetadataEntry != null) {
                    arrayList.add(mdtaMetadataEntry);
                }
            }
            pthVar2.G(i2 + d3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static void c(pth pthVar) {
        int i = pthVar.b;
        pthVar.H(4);
        if (pthVar.d() != 1751411826) {
            i += 4;
        }
        pthVar.G(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x00e1, code lost:
    
        if (r7 == 0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0c72  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0ce4 A[EDGE_INSN: B:133:0x0ce4->B:134:0x0ce4 BREAK  A[LOOP:6: B:112:0x0c86->B:128:0x0cda], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0cff  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0d17  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0d08  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0cf3  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0ceb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c74  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a65 A[ADDED_TO_REGION, LOOP:13: B:230:0x0a65->B:233:0x0a6f, LOOP_START, PHI: r16
  0x0a65: PHI (r16v18 int) = (r16v8 int), (r16v19 int) binds: [B:229:0x0a63, B:233:0x0a6f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0a57 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0dec  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0c1d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(defpackage.bki r44, defpackage.bir r45, long r46, androidx.media3.common.DrmInitData r48, boolean r49, defpackage.amml r50) {
        /*
            Method dump skipped, instructions count: 3581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkp.d(bki, bir, long, androidx.media3.common.DrmInitData, boolean, amml):java.util.List");
    }

    private static int e(pth pthVar) {
        int i = pthVar.i();
        int i2 = i & 127;
        while ((i & 128) == 128) {
            i = pthVar.i();
            i2 = (i2 << 7) | (i & 127);
        }
        return i2;
    }

    private static int f(pth pthVar) {
        pthVar.G(16);
        return pthVar.d();
    }

    private static Pair g(pth pthVar, int i) {
        pthVar.G(i + 12);
        pthVar.H(1);
        e(pthVar);
        pthVar.H(2);
        int i2 = pthVar.i();
        if ((i2 & 128) != 0) {
            pthVar.H(2);
        }
        if ((i2 & 64) != 0) {
            pthVar.H(pthVar.m());
        }
        if ((i2 & 32) != 0) {
            pthVar.H(2);
        }
        pthVar.H(1);
        e(pthVar);
        String f = psz.f(pthVar.i());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return Pair.create(f, null);
        }
        pthVar.H(12);
        pthVar.H(1);
        int e = e(pthVar);
        byte[] bArr = new byte[e];
        pthVar.B(bArr, 0, e);
        return Pair.create(f, bArr);
    }

    private static Pair h(pth pthVar, int i, int i2) {
        Integer num;
        pjr pjrVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = pthVar.b;
        while (i5 - i < i2) {
            pthVar.G(i5);
            int d = pthVar.d();
            bfa.c(d > 0, "childAtomSize must be positive");
            if (pthVar.d() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < d) {
                    pthVar.G(i6);
                    int d2 = pthVar.d();
                    int d3 = pthVar.d();
                    if (d3 == 1718775137) {
                        num2 = Integer.valueOf(pthVar.d());
                    } else if (d3 == 1935894637) {
                        pthVar.H(4);
                        str = pthVar.v(4);
                    } else if (d3 == 1935894633) {
                        i7 = i6;
                        i8 = d2;
                    }
                    i6 += d2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    bfa.c(num2 != null, "frma atom is mandatory");
                    bfa.c(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            pjrVar = null;
                            break;
                        }
                        pthVar.G(i9);
                        int d4 = pthVar.d();
                        if (pthVar.d() == 1952804451) {
                            int d5 = pthVar.d();
                            pthVar.H(1);
                            if (bkk.f(d5) == 0) {
                                pthVar.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int i10 = pthVar.i();
                                int i11 = (i10 & 240) >> 4;
                                i3 = i10 & 15;
                                i4 = i11;
                            }
                            boolean z = pthVar.i() == 1;
                            int i12 = pthVar.i();
                            byte[] bArr2 = new byte[16];
                            pthVar.B(bArr2, 0, 16);
                            if (z && i12 == 0) {
                                int i13 = pthVar.i();
                                byte[] bArr3 = new byte[i13];
                                pthVar.B(bArr3, 0, i13);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            pjrVar = new pjr(z, str, i12, bArr2, i4, i3, bArr, null);
                        } else {
                            i9 += d4;
                        }
                    }
                    bfa.c(pjrVar != null, "tenc atom is mandatory");
                    int i14 = pts.a;
                    create = Pair.create(num, pjrVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(defpackage.pth r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, androidx.media3.common.DrmInitData r28, defpackage.pji r29, int r30) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkp.i(pth, int, int, int, int, java.lang.String, boolean, androidx.media3.common.DrmInitData, pji, int):void");
    }
}
