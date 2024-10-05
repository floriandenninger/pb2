package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubx implements ubq {
    private final ubr a;
    private final ammv b;
    private final tzh c;

    public ubx(ubr ubrVar, ammv ammvVar, tzh tzhVar) {
        this.a = ubrVar;
        this.b = ammvVar;
        this.c = tzhVar;
    }

    @Override // defpackage.ubq
    public final void a(tyr tyrVar) {
        ucx ucxVar;
        if (tyrVar.j().isEmpty()) {
            tzk.b("ReplyActionEventHandler", "No threads associated with this event.", new Object[0]);
            return;
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(tyrVar.b());
        if (resultsFromIntent == null) {
            tzk.b("ReplyActionEventHandler", "Reply action text could not be retrieved from intent.", new Object[0]);
            return;
        }
        CharSequence charSequence = resultsFromIntent.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
        if (charSequence != null) {
            tzf a = this.c.a(aoic.ACTION_CLICK);
            tzj tzjVar = (tzj) a;
            tzjVar.w = 2;
            tzjVar.v = 2;
            a.d(tyrVar.c());
            a.b((txb) tyrVar.j().get(0));
            a.i();
            charSequence.toString();
            ubr ubrVar = this.a;
            twu c = tyrVar.c();
            txb txbVar = (txb) tyrVar.j().get(0);
            twd b = twd.b();
            String charSequence2 = charSequence.toString();
            ucx e = tyrVar.e();
            if (e.b.size() == 0) {
                aone createBuilder = ucx.a.createBuilder();
                createBuilder.C(charSequence2);
                ucxVar = (ucx) createBuilder.build();
            } else {
                aony aonyVar = e.b;
                aone builder = e.toBuilder();
                builder.copyOnWrite();
                ((ucx) builder.instance).b = aonm.emptyProtobufList();
                builder.C(charSequence2);
                builder.copyOnWrite();
                ucx ucxVar2 = (ucx) builder.instance;
                ucxVar2.a();
                aolo.addAll((Iterable) aonyVar, (List) ucxVar2.b);
                ucxVar = (ucx) builder.build();
            }
            ubrVar.c(c, txbVar, true, true, b, ucxVar, null);
        }
    }
}
