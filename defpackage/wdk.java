package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdk {
    public static final wdk a = new wdk();
    public final String b;
    public final aqyg c;
    public final Spanned d;
    public final aami e;
    public final aami f;

    private wdk() {
        this.b = "";
        this.c = null;
        this.d = new SpannableStringBuilder();
        this.e = null;
        this.f = null;
    }

    private static avgg a(aami aamiVar) {
        if (aamiVar != null) {
            return aamiVar.e();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wdk)) {
            return false;
        }
        wdk wdkVar = (wdk) obj;
        return amkq.b(this.b, wdkVar.b) && amkq.b(this.c, wdkVar.c) && amkq.b(this.d, wdkVar.d) && amkq.b(a(this.e), a(wdkVar.e)) && amkq.b(a(this.f), a(wdkVar.f));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, a(this.e), a(this.f)});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("accountEmail", this.b);
        Y.b("accountNameProto", this.c);
        Y.b("accountName", this.d);
        Y.b("accountPhotoThumbnails", a(this.e));
        Y.b("mobileBannerThumbnails", a(this.f));
        return Y.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wdk(java.lang.String r6, defpackage.aata r7) {
        /*
            r5 = this;
            aova r0 = r7.a
            aqyg r0 = r0.d
            if (r0 != 0) goto L8
            aqyg r0 = defpackage.aqyg.a
        L8:
            aami r1 = r7.c()
            aami r2 = r7.b
            if (r2 != 0) goto L26
            aova r2 = r7.a
            int r3 = r2.b
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L26
            aami r3 = new aami
            avgg r2 = r2.l
            if (r2 != 0) goto L21
            avgg r2 = defpackage.avgg.a
        L21:
            r3.<init>(r2)
            r7.b = r3
        L26:
            aami r7 = r7.b
            r5.<init>(r6, r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdk.<init>(java.lang.String, aata):void");
    }

    public wdk(String str, aqyg aqygVar, aami aamiVar, aami aamiVar2) {
        zhq.m(str);
        this.b = str;
        aqygVar.getClass();
        this.c = aqygVar;
        this.d = ajcq.b(aqygVar);
        this.e = aamiVar;
        this.f = aamiVar2;
    }

    public wdk(String str, String str2, Uri uri) {
        this.b = str2;
        this.c = null;
        this.d = !TextUtils.isEmpty(str) ? new SpannableStringBuilder(str) : null;
        this.e = uri != null ? new aami(uri) : null;
        this.f = null;
    }

    public wdk(String str, String str2, avgg avggVar) {
        this.b = str;
        this.d = new SpannableStringBuilder(str2);
        aong aongVar = (aong) aqyg.a.createBuilder();
        aongVar.copyOnWrite();
        aqyg aqygVar = (aqyg) aongVar.instance;
        str2.getClass();
        aqygVar.b |= 1;
        aqygVar.d = str2;
        this.c = (aqyg) aongVar.build();
        this.e = new aami(avggVar);
        this.f = null;
    }
}
