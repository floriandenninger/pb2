package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jwt {
    private final Context a;
    private final aahd b;
    private final acra c;
    private final agzk d;
    private final ysy e;
    private final ajdh f;

    public jwt(Context context, aahd aahdVar, acra acraVar, agzk agzkVar, ysy ysyVar, ajdh ajdhVar) {
        this.a = context;
        this.b = aahdVar;
        this.c = acraVar;
        this.d = agzkVar;
        this.e = ysyVar;
        this.f = ajdhVar;
    }

    public final void a(ammv ammvVar, Long l, agzm agzmVar) {
        if (!ammvVar.h() || !(ammvVar.c() instanceof aqdt)) {
            if (this.e.o()) {
                this.d.g(agzmVar);
                return;
            }
            long longValue = l.longValue();
            aone createBuilder = aqdt.a.createBuilder();
            aqyg g = ajcq.g(this.a.getString(R.string.offline_go_online_to_renew_dialog_title));
            createBuilder.copyOnWrite();
            aqdt aqdtVar = (aqdt) createBuilder.instance;
            g.getClass();
            aqdtVar.c = g;
            aqdtVar.b |= 1;
            long max = Math.max(1L, TimeUnit.SECONDS.toDays(longValue));
            createBuilder.ad(ajcq.g(this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, (int) max, Long.valueOf(max))));
            aqyg g2 = ajcq.g(this.a.getString(R.string.ok));
            createBuilder.copyOnWrite();
            aqdt aqdtVar2 = (aqdt) createBuilder.instance;
            g2.getClass();
            aqdtVar2.p = g2;
            aqdtVar2.b |= 2097152;
            ajdf.p(this.a, (aqdt) createBuilder.build(), this.b, this.c, this.f, null, null);
            return;
        }
        ajdf.m(this.a, (aqdt) ammvVar.c(), this.b, this.c, this.f);
    }
}
