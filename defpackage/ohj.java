package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohj implements akjf {
    public final aahd a;
    public Map b;
    public String c;
    private final cnd d;
    private String e;

    public ohj(aahd aahdVar, cnd cndVar) {
        this.a = aahdVar;
        this.d = cndVar;
    }

    public final void a() {
        if (TextUtils.isEmpty(this.e)) {
            return;
        }
        this.d.e(this.e);
        this.e = null;
    }

    @Override // defpackage.akjf
    public final void b(String str) {
        if (TextUtils.equals(this.c, str)) {
            this.c = null;
        }
    }

    @Override // defpackage.akjf
    public final void c(String str, String str2) {
        if (TextUtils.equals(this.c, str)) {
            a();
            this.e = str2;
        }
    }
}
