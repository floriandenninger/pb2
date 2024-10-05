package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uyg {
    private final Context a;
    private final Set b;

    public uyg(Context context, Map map) {
        this.a = context;
        this.b = ((amrz) map).keySet();
    }

    public final boolean a() {
        if (!uye.b()) {
            return false;
        }
        String a = uye.a(this.a);
        if (a == null) {
            return true;
        }
        int size = this.b.size();
        if (size == 0) {
            return a.equals(this.a.getPackageName());
        }
        if (size == 1) {
            return a.equals(((uyf) amkq.bk(this.b)).a());
        }
        throw new IllegalArgumentException("More than 1 custom main process specified");
    }
}
