package defpackage;

import android.graphics.Typeface;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgn {
    static final aef a = new aef(100);
    public int b = 2;
    public int c = Integer.MAX_VALUE;
    public int d = 2;
    public final dgm e = new dgm();
    public Layout f = null;
    public boolean g = true;

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01fc, code lost:
    
        r2 = android.text.StaticLayout.class.getDeclaredField("mLines");
        r2.setAccessible(true);
        r8 = android.text.StaticLayout.class.getDeclaredField("mColumns");
        r8.setAccessible(true);
        r2 = (int[]) r2.get(r0);
        r4 = r8.getInt(r0);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021e, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0220, code lost:
    
        r9 = (r4 * r5) + r8;
        r10 = r9 + r4;
        r11 = r2[r9];
        r2[r9] = r2[r10];
        r2[r10] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022d, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[EXC_TOP_SPLITTER, LOOP:0: B:45:0x00dc->B:76:0x0246, LOOP_LABEL: LOOP:0: B:45:0x00dc->B:76:0x0246, LOOP_START, PHI: r3 r8
  0x00dc: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:37:0x00da, B:76:0x0246] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r8v1 int) = (r8v0 int), (r8v2 int) binds: [B:37:0x00da, B:76:0x0246] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0246 A[LOOP:0: B:45:0x00dc->B:76:0x0246, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v37, types: [android.text.StaticLayout] */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.text.StaticLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.text.Layout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.text.BoringLayout] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r2v20, types: [aef] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.reflect.Field] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout a() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgn.a():android.text.Layout");
    }

    public final void b(Layout.Alignment alignment) {
        dgm dgmVar = this.e;
        if (dgmVar.o != alignment) {
            dgmVar.o = alignment;
            this.f = null;
        }
    }

    public final void c(ajn ajnVar) {
        dgm dgmVar = this.e;
        if (dgmVar.p != ajnVar) {
            dgmVar.p = ajnVar;
            this.f = null;
        }
    }

    public final void d(int i) {
        float f = i;
        if (this.e.a.getTextSize() != f) {
            this.e.a();
            this.e.a.setTextSize(f);
            this.f = null;
        }
    }

    public final void e(Typeface typeface) {
        if (this.e.a.getTypeface() != typeface) {
            this.e.a();
            this.e.a.setTypeface(typeface);
            this.f = null;
        }
    }
}
