package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalv implements aaha {
    private final Activity a;
    private final Map b;
    private final ffs c;

    public aalv(Activity activity, ffs ffsVar, Map map) {
        this.a = activity;
        this.c = ffsVar;
        this.b = map;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String b;
        if (apxfVar == null || !apxfVar.pY(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)) {
            if (!this.b.containsKey(this.a.getClass())) {
                zga.b("ApplicationHelpEndpoint resolved with no help context.");
                return;
            }
            b = ((onf) ((azrw) this.b.get(this.a.getClass())).get()).b();
        } else {
            b = ((apft) apxfVar.pX(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint)).c;
        }
        this.c.a(this.a, b);
    }
}
