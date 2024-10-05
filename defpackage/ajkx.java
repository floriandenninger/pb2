package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkx {
    final /* synthetic */ ajla a;

    public ajkx(ajla ajlaVar) {
        this.a = ajlaVar;
    }

    public final cor a(Context context) {
        try {
            return cnv.c(context);
        } catch (IllegalArgumentException e) {
            if (!((apdb) this.a.c.get()).e) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Failed to get RequestManager: ");
            if (context instanceof ci) {
                sb.append("FA");
            } else if (context instanceof Activity) {
                sb.append("A");
            } else if (context instanceof ContextWrapper) {
                sb.append("CW");
            }
            sb.append(" : ");
            sb.append(context.getClass().getName());
            afsi.c(2, 16, sb.toString(), e);
            zga.d(sb.toString(), e);
            return null;
        }
    }
}
