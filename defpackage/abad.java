package defpackage;

import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abad implements aaha {
    public static final /* synthetic */ int b = 0;
    public final azrw a;
    private final abab c;
    private final Executor d;

    public abad(abab ababVar, azrw azrwVar, Executor executor) {
        this.c = ababVar;
        this.a = azrwVar;
        this.d = executor;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        final Object s = yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (s == null) {
            zga.l("recordNotificationServiceEndpointCommand did not have proper tag.");
        }
        abab ababVar = this.c;
        abae abaeVar = new abae(ababVar.f, ababVar.a.c(), null, null, null);
        abaeVar.a = ((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) apxfVar.pX(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)).b.I();
        abaeVar.l(apxfVar.c);
        ynm.k(ababVar.c.b(abaeVar, this.d), this.d, abbr.b, new ynl() { // from class: abac
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                azrw azrwVar;
                abad abadVar = abad.this;
                Object obj2 = s;
                arwr arwrVar = (arwr) obj;
                if (arwrVar.c && arwrVar.d.size() > 0 && (azrwVar = abadVar.a) != null) {
                    ((aahd) azrwVar.get()).e(arwrVar.d, obj2);
                }
            }
        });
        azrw azrwVar = this.a;
        if (azrwVar != null) {
            ((aahd) azrwVar.get()).e(((RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint) apxfVar.pX(RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint)).c, s);
        }
    }
}
