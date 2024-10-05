package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afvm implements afvb {
    private final Context a;
    private final aftj b;

    public afvm(Context context, afqk afqkVar, aftj aftjVar) {
        context.getClass();
        this.a = context;
        afqkVar.getClass();
        aftjVar.getClass();
        this.b = aftjVar;
    }

    @Override // defpackage.afvb
    public final asuq a() {
        return asuq.USER_AUTH;
    }

    @Override // defpackage.afvb
    public final void b(Map map, afvp afvpVar) {
        amkq.N(wbs.am(afvpVar.g()));
        if (afvpVar.e().z()) {
            return;
        }
        afsx e = afvpVar.e();
        aftg a = this.b.a(e).a(e);
        if (a.g()) {
            Pair b = a.b();
            map.put((String) b.first, (String) b.second);
        } else {
            if (a.f()) {
                throw new cnb(a.a());
            }
            Exception d = a.d();
            if (!(d instanceof IOException)) {
                throw new cnb(d.getMessage());
            }
            throw new cnb(this.a.getString(R.string.common_error_connection), d);
        }
    }

    @Override // defpackage.afvb
    public final boolean e() {
        return false;
    }
}
