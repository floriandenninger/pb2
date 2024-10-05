package defpackage;

import android.net.Uri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bci implements bfv, bbg {
    public final bgh b;
    public long c;
    public bjc f;
    public boolean g;
    final /* synthetic */ bcn h;
    private final Uri i;
    private final bcf j;
    private final bik k;
    private volatile boolean l;
    private final eun n;
    private final tfq o = new tfq(null, null, null);
    private boolean m = true;
    public long e = -1;
    public final long a = bbi.a();
    public ath d = d(0);

    public bci(bcn bcnVar, Uri uri, ate ateVar, bcf bcfVar, bik bikVar, eun eunVar, byte[] bArr) {
        this.h = bcnVar;
        this.i = uri;
        this.b = new bgh(ateVar);
        this.j = bcfVar;
        this.k = bikVar;
        this.n = eunVar;
    }

    private final ath d(long j) {
        atg atgVar = new atg();
        atgVar.a = this.i;
        atgVar.f = j;
        atgVar.h = null;
        atgVar.i = 6;
        atgVar.e = bcn.a;
        return atgVar.a();
    }

    @Override // defpackage.bfv
    public final void a() {
        this.l = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183 A[Catch: all -> 0x0215, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195 A[Catch: all -> 0x0215, TRY_LEAVE, TryCatch #1 {all -> 0x0215, blocks: (B:6:0x000c, B:8:0x0022, B:9:0x0025, B:12:0x003a, B:14:0x0040, B:19:0x008a, B:21:0x0095, B:22:0x00a1, B:24:0x00ab, B:25:0x00b7, B:27:0x00c1, B:28:0x00cd, B:30:0x00d7, B:31:0x00e9, B:33:0x00f3, B:35:0x00f9, B:40:0x0139, B:41:0x013f, B:43:0x0149, B:45:0x014d, B:46:0x0166, B:48:0x0183, B:50:0x018d, B:51:0x0191, B:53:0x0195, B:96:0x0101, B:98:0x010b, B:99:0x0115, B:101:0x0110, B:104:0x011d, B:106:0x0127, B:107:0x0131, B:108:0x012c, B:117:0x004a, B:119:0x0056, B:120:0x0061, B:122:0x005b, B:125:0x006a, B:127:0x0076, B:128:0x0080, B:129:0x007b), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:0: B:2:0x0004->B:84:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3 A[EDGE_INSN: B:93:0x01f3->B:74:0x01f3 BREAK  A[LOOP:1: B:55:0x01a7->B:66:0x01a7], SYNTHETIC] */
    @Override // defpackage.bfv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bci.b():void");
    }

    public final void c(long j, long j2) {
        this.o.a = j;
        this.c = j2;
        this.m = true;
        this.g = false;
    }
}
