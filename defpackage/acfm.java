package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acfm {
    private final axze a;

    public acfm(axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = axzeVar;
    }

    public static void a(Activity activity) {
        activity.getWindow().setLayout(-1, -1);
    }

    public static boolean b(ce ceVar) {
        if (ceVar == null) {
            return false;
        }
        return !ceVar.s && !ceVar.H && ceVar.ar() && (ceVar.at() || ceVar.av());
    }

    public static boolean c(Activity activity) {
        return Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode();
    }

    public static final boolean e(Context context) {
        return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r15 = this;
            axze r0 = r15.a
            astj r0 = r0.i()
            boolean r0 = r0.h
            r1 = 0
            if (r0 == 0) goto Lbe
            axze r0 = r15.a
            java.util.List r0 = r0.j()
            java.util.List r0 = defpackage.adyu.cl(r0)
            android.media.MediaCodecList r2 = new android.media.MediaCodecList
            r2.<init>(r1)
            android.media.MediaCodecInfo[] r2 = r2.getCodecInfos()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r4 = r2.length
            r5 = 0
        L25:
            if (r5 >= r4) goto L38
            r6 = r2[r5]
            java.lang.String r6 = r6.getName()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r3.put(r6, r7)
            int r5 = r5 + 1
            goto L25
        L38:
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r0.next()
            acls r4 = (defpackage.acls) r4
            axio r5 = r4.c
            int r5 = r5.ordinal()
            r6 = 1
            if (r5 == r6) goto L6b
            r7 = 2
            if (r5 == r7) goto L68
            r7 = 3
            if (r5 == r7) goto L65
            r7 = 4
            if (r5 == r7) goto L62
            r7 = 5
            if (r5 == r7) goto L5f
            r5 = 0
            goto L6d
        L5f:
            java.lang.String r5 = "video/av01"
            goto L6d
        L62:
            java.lang.String r5 = "video/hevc"
            goto L6d
        L65:
            java.lang.String r5 = "video/avc"
            goto L6d
        L68:
            java.lang.String r5 = "video/x-vnd.on2.vp9"
            goto L6d
        L6b:
            java.lang.String r5 = "video/x-vnd.on2.vp8"
        L6d:
            if (r5 == 0) goto L3c
            r7 = 0
        L70:
            int r8 = r2.length
            if (r7 >= r8) goto L3c
            r8 = r2[r7]
            if (r8 != 0) goto L78
            goto Lbb
        L78:
            java.lang.String r9 = r8.getName()
            if (r9 == 0) goto Lbb
            java.lang.String r10 = r4.a
            boolean r10 = r9.startsWith(r10)
            if (r10 == 0) goto Lbb
            java.lang.Object r10 = r3.get(r9)
            java.util.Set r10 = (java.util.Set) r10
            boolean r10 = r10.contains(r5)
            if (r10 != 0) goto Lbb
            boolean r10 = r8.isEncoder()
            if (r10 == 0) goto Lbb
            java.lang.String[] r8 = r8.getSupportedTypes()
            int r10 = r8.length
            r11 = 0
        L9e:
            if (r11 >= r10) goto Lbb
            r12 = r8[r11]
            int r13 = r4.b
            r14 = -1
            if (r13 != r14) goto Lb1
            java.lang.Object r8 = r3.get(r9)
            java.util.Set r8 = (java.util.Set) r8
            r8.add(r5)
            goto Lbb
        Lb1:
            boolean r12 = android.text.TextUtils.equals(r12, r5)
            if (r12 == 0) goto Lb8
            return r6
        Lb8:
            int r11 = r11 + 1
            goto L9e
        Lbb:
            int r7 = r7 + 1
            goto L70
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acfm.d():boolean");
    }
}
