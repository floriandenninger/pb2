package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fto {
    public int a;
    private final boolean b;
    private final TextView c;
    private final Resources d;
    private final Context e;

    public fto(TextView textView, boolean z) {
        this.c = textView;
        this.b = z;
        this.d = textView.getResources();
        this.e = textView.getContext();
    }

    private static boolean c(auzj auzjVar) {
        int ba = aobq.ba(auzjVar.v);
        return ba != 0 && ba == 2;
    }

    private static int d(auzj auzjVar) {
        int aZ;
        if (auzjVar.d != 19 || (aZ = aobq.aZ(((auzk) auzjVar.e).b)) == 0) {
            return 1;
        }
        return aZ;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.auzj r11) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fto.a(auzj):void");
    }

    private final int b() {
        int i = this.a;
        if (i == 1) {
            return wbs.Q(this.e, true != this.b ? R.attr.ytStaticBrandWhite : R.attr.ytOverlayTextSecondary);
        }
        if (i != 3) {
            return wbs.Q(this.e, true != this.b ? R.attr.ytBrandLinkText : R.attr.ytTextDisabled);
        }
        return wbs.Q(this.e, R.attr.ytOverlayTextPrimary);
    }
}
