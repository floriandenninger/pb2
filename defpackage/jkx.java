package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkx implements jkz {
    public final Context a;
    public final azrw b;
    public final jla c;
    public final agzj d;
    public final azrw e;
    public final aahd f;
    public final jwb g;
    public final ainy h;
    public final fka i;
    private final azrw j;

    public jkx(Context context, jla jlaVar, agzj agzjVar, azrw azrwVar, ainy ainyVar, azrw azrwVar2, fka fkaVar, aahd aahdVar, jwb jwbVar, azrw azrwVar3) {
        this.a = context;
        this.d = agzjVar;
        this.b = azrwVar;
        this.f = aahdVar;
        this.e = azrwVar2;
        this.c = jlaVar;
        this.g = jwbVar;
        this.j = azrwVar3;
        this.h = ainyVar;
        this.i = fkaVar;
    }

    public final boolean a(agnv agnvVar) {
        try {
            return ((Boolean) ((agpr) this.j.get()).c(agnvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("Unable to retrieve if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
