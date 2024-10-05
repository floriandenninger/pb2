package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsp {
    private final Context a;
    private final afri b;

    public xsp(Context context, afri afriVar) {
        this.a = context;
        this.b = afriVar;
    }

    public final void a(Uri uri, xso xsoVar) {
        yjk.e();
        try {
            Drawable drawable = (Drawable) this.b.b(anbt.c(uzm.b(this.a, uri)));
            if (xsoVar != null) {
                xsoVar.a(drawable);
            }
        } catch (IOException | zjg e) {
            zga.d("Failed to load image", e);
        }
    }
}
