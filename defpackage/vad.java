package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vad {
    private static final char[] a = "http://".toCharArray();
    private static final char[] b = "https://".toCharArray();
    private static final char[] c = "lh".toCharArray();
    private static final char[] d = "ap".toCharArray();
    private static final char[] e = "sp".toCharArray();
    private static final char[] f = "bp".toCharArray();
    private static final char[] g = "ccp-lh".toCharArray();
    private static final char[] h = "play-lh".toCharArray();
    private static final char[] i = "play-ti-lh".toCharArray();
    private static final char[] j = "gz0".toCharArray();
    private static final char[] k = ".googleusercontent.com/".toCharArray();
    private static final char[] l = "www.google.com/visualsearch/lh/".toCharArray();
    private static final char[] m = ".google.com/".toCharArray();
    private static final char[] n = ".sandbox.google.com/".toCharArray();
    private static final char[] o = ".blogger.com/".toCharArray();
    private static final char[] p = ".bp.blogspot.com/".toCharArray();
    private static final char[] q = ".ggpht.com/".toCharArray();
    private static final char[] r = "image".toCharArray();
    private static final char[] s = "%3D".toCharArray();
    private static final char[] t = "%3d".toCharArray();
    private int v;
    private int w;
    private boolean x;
    private int y;
    private final char[] u = new char[2000];
    private final int[] z = new int[8];
    private final int[] A = new int[8];

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        r5 = r5 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int b(int r5, int r6, char[] r7) {
        /*
            r4 = this;
            int r0 = r7.length
        L1:
            int r1 = r5 + r0
            if (r1 >= r6) goto L19
            r1 = 0
        L6:
            if (r1 >= r0) goto L18
            char[] r2 = r4.u
            int r3 = r5 + r1
            char r2 = r2[r3]
            char r3 = r7[r1]
            if (r2 == r3) goto L15
            int r5 = r5 + 1
            goto L1
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            return r5
        L19:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vad.b(int, int, char[]):int");
    }

    private final boolean c(char[] cArr) {
        int i2 = this.w;
        int length = cArr.length;
        if (i2 + length > this.v) {
            return false;
        }
        int i3 = 0;
        while (i3 < length) {
            int i4 = i2 + 1;
            int i5 = i3 + 1;
            if (this.u[i2] != cArr[i3]) {
                return false;
            }
            i2 = i4;
            i3 = i5;
        }
        this.w = i2;
        return true;
    }

    private final boolean d(int i2, char[] cArr) {
        int length = cArr.length;
        if (i2 + length > this.v) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (this.u[i2 + i3] != cArr[i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0097, code lost:
    
        if (r4 == '-') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0208, code lost:
    
        if (r9 == r5) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020a, code lost:
    
        r4 = r9 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01e1 A[Catch: all -> 0x02c4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x02c0, B:11:0x000d, B:13:0x0020, B:16:0x01dd, B:18:0x01e1, B:19:0x01e6, B:21:0x01ea, B:82:0x01f7, B:29:0x0225, B:31:0x0229, B:33:0x0232, B:37:0x0241, B:41:0x0249, B:44:0x024f, B:47:0x0255, B:49:0x025a, B:51:0x025e, B:53:0x0267, B:56:0x0274, B:59:0x027a, B:60:0x029b, B:63:0x02a0, B:65:0x02ab, B:69:0x02ae, B:71:0x02b6, B:75:0x0286, B:78:0x0293, B:27:0x02bc, B:85:0x020a, B:86:0x020d, B:88:0x0213, B:90:0x002b, B:92:0x0035, B:96:0x0041, B:98:0x004a, B:100:0x0052, B:104:0x0063, B:109:0x0070, B:117:0x007f, B:119:0x0085, B:121:0x008b, B:124:0x0099, B:126:0x009f, B:128:0x00a7, B:130:0x00af, B:132:0x00b5, B:134:0x00bd, B:136:0x00c5, B:138:0x00cd, B:140:0x00d5, B:143:0x00e3, B:146:0x00ed, B:148:0x00f7, B:150:0x00ff, B:154:0x0109, B:156:0x0113, B:159:0x011d, B:161:0x0128, B:164:0x0132, B:166:0x013a, B:168:0x0144, B:170:0x014f, B:173:0x0159, B:175:0x0161, B:178:0x016e, B:180:0x0176, B:183:0x017f, B:185:0x0187, B:188:0x0191, B:190:0x0199, B:193:0x01a5, B:196:0x01b2, B:198:0x01ba, B:202:0x01c6, B:205:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02bc A[Catch: all -> 0x02c4, LOOP:0: B:19:0x01e6->B:27:0x02bc, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x02c0, B:11:0x000d, B:13:0x0020, B:16:0x01dd, B:18:0x01e1, B:19:0x01e6, B:21:0x01ea, B:82:0x01f7, B:29:0x0225, B:31:0x0229, B:33:0x0232, B:37:0x0241, B:41:0x0249, B:44:0x024f, B:47:0x0255, B:49:0x025a, B:51:0x025e, B:53:0x0267, B:56:0x0274, B:59:0x027a, B:60:0x029b, B:63:0x02a0, B:65:0x02ab, B:69:0x02ae, B:71:0x02b6, B:75:0x0286, B:78:0x0293, B:27:0x02bc, B:85:0x020a, B:86:0x020d, B:88:0x0213, B:90:0x002b, B:92:0x0035, B:96:0x0041, B:98:0x004a, B:100:0x0052, B:104:0x0063, B:109:0x0070, B:117:0x007f, B:119:0x0085, B:121:0x008b, B:124:0x0099, B:126:0x009f, B:128:0x00a7, B:130:0x00af, B:132:0x00b5, B:134:0x00bd, B:136:0x00c5, B:138:0x00cd, B:140:0x00d5, B:143:0x00e3, B:146:0x00ed, B:148:0x00f7, B:150:0x00ff, B:154:0x0109, B:156:0x0113, B:159:0x011d, B:161:0x0128, B:164:0x0132, B:166:0x013a, B:168:0x0144, B:170:0x014f, B:173:0x0159, B:175:0x0161, B:178:0x016e, B:180:0x0176, B:183:0x017f, B:185:0x0187, B:188:0x0191, B:190:0x0199, B:193:0x01a5, B:196:0x01b2, B:198:0x01ba, B:202:0x01c6, B:205:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0225 A[EDGE_INSN: B:28:0x0225->B:29:0x0225 BREAK  A[LOOP:0: B:19:0x01e6->B:27:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02a0 A[Catch: all -> 0x02c4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x02c0, B:11:0x000d, B:13:0x0020, B:16:0x01dd, B:18:0x01e1, B:19:0x01e6, B:21:0x01ea, B:82:0x01f7, B:29:0x0225, B:31:0x0229, B:33:0x0232, B:37:0x0241, B:41:0x0249, B:44:0x024f, B:47:0x0255, B:49:0x025a, B:51:0x025e, B:53:0x0267, B:56:0x0274, B:59:0x027a, B:60:0x029b, B:63:0x02a0, B:65:0x02ab, B:69:0x02ae, B:71:0x02b6, B:75:0x0286, B:78:0x0293, B:27:0x02bc, B:85:0x020a, B:86:0x020d, B:88:0x0213, B:90:0x002b, B:92:0x0035, B:96:0x0041, B:98:0x004a, B:100:0x0052, B:104:0x0063, B:109:0x0070, B:117:0x007f, B:119:0x0085, B:121:0x008b, B:124:0x0099, B:126:0x009f, B:128:0x00a7, B:130:0x00af, B:132:0x00b5, B:134:0x00bd, B:136:0x00c5, B:138:0x00cd, B:140:0x00d5, B:143:0x00e3, B:146:0x00ed, B:148:0x00f7, B:150:0x00ff, B:154:0x0109, B:156:0x0113, B:159:0x011d, B:161:0x0128, B:164:0x0132, B:166:0x013a, B:168:0x0144, B:170:0x014f, B:173:0x0159, B:175:0x0161, B:178:0x016e, B:180:0x0176, B:183:0x017f, B:185:0x0187, B:188:0x0191, B:190:0x0199, B:193:0x01a5, B:196:0x01b2, B:198:0x01ba, B:202:0x01c6, B:205:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b6 A[Catch: all -> 0x02c4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x02c0, B:11:0x000d, B:13:0x0020, B:16:0x01dd, B:18:0x01e1, B:19:0x01e6, B:21:0x01ea, B:82:0x01f7, B:29:0x0225, B:31:0x0229, B:33:0x0232, B:37:0x0241, B:41:0x0249, B:44:0x024f, B:47:0x0255, B:49:0x025a, B:51:0x025e, B:53:0x0267, B:56:0x0274, B:59:0x027a, B:60:0x029b, B:63:0x02a0, B:65:0x02ab, B:69:0x02ae, B:71:0x02b6, B:75:0x0286, B:78:0x0293, B:27:0x02bc, B:85:0x020a, B:86:0x020d, B:88:0x0213, B:90:0x002b, B:92:0x0035, B:96:0x0041, B:98:0x004a, B:100:0x0052, B:104:0x0063, B:109:0x0070, B:117:0x007f, B:119:0x0085, B:121:0x008b, B:124:0x0099, B:126:0x009f, B:128:0x00a7, B:130:0x00af, B:132:0x00b5, B:134:0x00bd, B:136:0x00c5, B:138:0x00cd, B:140:0x00d5, B:143:0x00e3, B:146:0x00ed, B:148:0x00f7, B:150:0x00ff, B:154:0x0109, B:156:0x0113, B:159:0x011d, B:161:0x0128, B:164:0x0132, B:166:0x013a, B:168:0x0144, B:170:0x014f, B:173:0x0159, B:175:0x0161, B:178:0x016e, B:180:0x0176, B:183:0x017f, B:185:0x0187, B:188:0x0191, B:190:0x0199, B:193:0x01a5, B:196:0x01b2, B:198:0x01ba, B:202:0x01c6, B:205:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ae A[EDGE_INSN: B:72:0x02ae->B:69:0x02ae BREAK  A[LOOP:1: B:61:0x029d->B:65:0x02ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286 A[Catch: all -> 0x02c4, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x02c0, B:11:0x000d, B:13:0x0020, B:16:0x01dd, B:18:0x01e1, B:19:0x01e6, B:21:0x01ea, B:82:0x01f7, B:29:0x0225, B:31:0x0229, B:33:0x0232, B:37:0x0241, B:41:0x0249, B:44:0x024f, B:47:0x0255, B:49:0x025a, B:51:0x025e, B:53:0x0267, B:56:0x0274, B:59:0x027a, B:60:0x029b, B:63:0x02a0, B:65:0x02ab, B:69:0x02ae, B:71:0x02b6, B:75:0x0286, B:78:0x0293, B:27:0x02bc, B:85:0x020a, B:86:0x020d, B:88:0x0213, B:90:0x002b, B:92:0x0035, B:96:0x0041, B:98:0x004a, B:100:0x0052, B:104:0x0063, B:109:0x0070, B:117:0x007f, B:119:0x0085, B:121:0x008b, B:124:0x0099, B:126:0x009f, B:128:0x00a7, B:130:0x00af, B:132:0x00b5, B:134:0x00bd, B:136:0x00c5, B:138:0x00cd, B:140:0x00d5, B:143:0x00e3, B:146:0x00ed, B:148:0x00f7, B:150:0x00ff, B:154:0x0109, B:156:0x0113, B:159:0x011d, B:161:0x0128, B:164:0x0132, B:166:0x013a, B:168:0x0144, B:170:0x014f, B:173:0x0159, B:175:0x0161, B:178:0x016e, B:180:0x0176, B:183:0x017f, B:185:0x0187, B:188:0x0191, B:190:0x0199, B:193:0x01a5, B:196:0x01b2, B:198:0x01ba, B:202:0x01c6, B:205:0x01d3), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vad.a(java.lang.String):boolean");
    }
}
