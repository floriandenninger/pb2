package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.apps.tiktok.account.AccountId;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfn implements aaha {
    public static final /* synthetic */ int a = 0;
    private final ci b;
    private final ainy c;
    private final afsy d;
    private final wjt e;
    private final hrv f;

    public hfn(ci ciVar, ainy ainyVar, afsy afsyVar, wjt wjtVar, hrv hrvVar) {
        this.b = ciVar;
        this.c = ainyVar;
        this.d = afsyVar;
        this.e = wjtVar;
        this.f = hrvVar;
    }

    public final void b(Intent intent, apxf apxfVar) {
        this.c.a();
        this.b.startActivity(intent);
        if (apxfVar.pY(ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint)) {
            return;
        }
        afsi.b(1, 6, "[ShortsCreation][Android]No ShortsCreationEndpoint extension when resolving command");
    }

    @Override // defpackage.aaha
    public final void kE(final apxf apxfVar, Map map) {
        final Intent putExtra = new Intent(this.b, (Class<?>) ShortsCreationActivity.class).putExtra("navigation_endpoint", apxfVar.toByteArray());
        if (this.f.n()) {
            ynm.n(this.b, this.e.a(this.d.c()), ept.m, new zfi() { // from class: hfm
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    hfn hfnVar = hfn.this;
                    Intent intent = putExtra;
                    apxf apxfVar2 = apxfVar;
                    AccountId accountId = (AccountId) obj;
                    if (accountId == null) {
                        afsi.b(2, 25, "[Clockwork][ShortsCreationCommandResolver] accountId was null.");
                    } else {
                        alxb.a(intent, accountId);
                        hfnVar.b(intent, apxfVar2);
                    }
                }
            });
        } else {
            b(putExtra, apxfVar);
        }
    }
}
