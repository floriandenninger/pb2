package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class szs implements szl {
    private final syd a;

    public szs(syd sydVar) {
        this.a = sydVar;
    }

    @Override // defpackage.szl
    public final Typeface a(Context context, String str) {
        return b(context, str, 0);
    }

    @Override // defpackage.szl
    public final Typeface b(Context context, String str, int i) {
        if (!str.startsWith("fonts/")) {
            return null;
        }
        try {
            return Typeface.createFromAsset(context.getAssets(), str);
        } catch (RuntimeException e) {
            syd sydVar = this.a;
            String valueOf = String.valueOf(str);
            sydVar.d(22, valueOf.length() != 0 ? "Failed to load font ".concat(valueOf) : new String("Failed to load font "), e);
            return null;
        }
    }
}
