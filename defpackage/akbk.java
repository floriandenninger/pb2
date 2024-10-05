package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akbk implements szl {
    private static Typeface c(Context context, ammv ammvVar) {
        if ((ammvVar.h() ? (akbj) ammvVar.c() : akbj.MEDIUM).ordinal() == 4) {
            return ajct.YOUTUBE_SANS_BOLD.b(context, 1);
        }
        return ajct.YTSANS_MEDIUM.a(context);
    }

    private static boolean d(String str) {
        return str.startsWith("YouTubeSans");
    }

    private static boolean e(String str) {
        return str.startsWith("YTSans");
    }

    private static final Typeface f(Context context, ammv ammvVar) {
        switch ((akbj) ammvVar.e(akbj.BOLD)) {
            case LIGHT:
                return ajct.YOUTUBE_SANS_LIGHT.a(context);
            case REGULAR:
                return ajct.YOUTUBE_SANS_REGULAR.a(context);
            case MEDIUM:
                return ajct.YOUTUBE_SANS_MEDIUM.a(context);
            case SEMIBOLD:
                return ajct.YOUTUBE_SANS_SEMIBOLD.a(context);
            case BOLD:
                return ajct.YOUTUBE_SANS_BOLD.a(context);
            case EXTRABOLD:
                return ajct.YOUTUBE_SANS_EXTRABOLD.a(context);
            case BLACK:
                return ajct.YOUTUBE_SANS_BLACK.a(context);
            default:
                return null;
        }
    }

    @Override // defpackage.szl
    public final Typeface a(Context context, String str) {
        if (d(str)) {
            return f(context, akbj.a(str, "YouTubeSans"));
        }
        if (e(str)) {
            return c(context, akbj.a(str, "YTSans"));
        }
        return null;
    }

    @Override // defpackage.szl
    public final Typeface b(Context context, String str, int i) {
        ammv ammvVar;
        akbj[] values = akbj.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                akbj akbjVar = values[i2];
                if (i == akbjVar.i) {
                    ammvVar = ammv.j(akbjVar);
                    break;
                }
                i2++;
            } else {
                ammvVar = amlr.a;
                break;
            }
        }
        if (d(str)) {
            return f(context, ammvVar);
        }
        if (e(str)) {
            return c(context, ammvVar);
        }
        return null;
    }
}
