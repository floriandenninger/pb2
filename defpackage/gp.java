package defpackage;

import android.media.Rating;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gp {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static float b(Rating rating) {
        return rating.getStarRating();
    }

    public static int c(Rating rating) {
        return rating.getRatingStyle();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static ik g(InterfaceC0002if interfaceC0002if) {
        return interfaceC0002if.a();
    }

    public static void j(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public void h() {
    }

    public void i() {
    }
}
