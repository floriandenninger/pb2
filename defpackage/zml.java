package defpackage;

import android.os.AsyncTask;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zml extends AsyncTask {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ zmn e;

    public zml(zmn zmnVar, int i, int i2, int i3, int i4) {
        this.e = zmnVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0135, code lost:
    
        r11 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x013b, code lost:
    
        r2.setPreviewFpsRange(r6[0], r6[1]);
        r14.e.b.setParameters(r2);
        r14.e.g();
        r14.e.b.startPreview();
        r14.e.h(2);
        r1 = r14.e;
        r2 = r1.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x015e, code lost:
    
        if (r2 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0160, code lost:
    
        r2.c(r1.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00c0, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x006e, code lost:
    
        r3 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0070, code lost:
    
        if (r3 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0072, code lost:
    
        r2.setPreviewDisplay(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        defpackage.zga.g("Camera already released while trying to start camera.");
        r14.e.h(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        r3 = r14.e;
        r6 = r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0068, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006a, code lost:
    
        r2.setPreviewTexture(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        r3 = r14.e;
        r3.b = r2;
        r2 = r3.b.getParameters();
        r2.setRecordingHint(true);
        r5 = r2.getSupportedFocusModes();
        r4 = java.util.Arrays.asList("continuous-video", "continuous-picture", "edof");
        r5 = r5.iterator();
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a3, code lost:
    
        if (r5.hasNext() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r8 = r4.indexOf(r5.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        if (r8 < 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
    
        if (r6 < 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b3, code lost:
    
        if (r8 >= r6) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b5, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        if (r6 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b9, code lost:
    
        r4 = (java.lang.String) r4.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c1, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c3, code lost:
    
        r2.setFocusMode(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c6, code lost:
    
        r4 = r14.b;
        r5 = r14.c;
        r6 = r2.getSupportedPreviewSizes().iterator();
        r8 = Integer.MAX_VALUE;
        r9 = null;
        r10 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        if (r6.hasNext() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00df, code lost:
    
        r11 = r6.next();
        r12 = r11.width - r4;
        r13 = r11.height - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00eb, code lost:
    
        if (r12 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ed, code lost:
    
        r12 = r12 * (-4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ef, code lost:
    
        if (r13 >= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
    
        r13 = r13 * (-4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f3, code lost:
    
        r12 = r12 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f4, code lost:
    
        if (r12 >= r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f6, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f9, code lost:
    
        if (r12 >= r10) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fb, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00fc, code lost:
    
        r10 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00fe, code lost:
    
        r2.setPreviewSize(r9.width, r9.height);
        r4 = r14.d * 1000;
        r6 = new int[]{r4, r4};
        r5 = r2.getSupportedPreviewFpsRange().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011b, code lost:
    
        if (r5.hasNext() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x011d, code lost:
    
        r9 = r5.next();
        r10 = java.lang.Math.abs(r9[0]) + java.lang.Math.abs(r9[1] - r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0131, code lost:
    
        if (r10 >= r8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0133, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0136, code lost:
    
        if (r10 >= r8) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0138, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0139, code lost:
    
        r8 = r11;
     */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zml.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
