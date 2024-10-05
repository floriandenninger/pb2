package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jdm implements aaha {
    public final zaw a;
    protected final Context b;
    public final aild c;
    public Optional d;
    private final adlt e;
    private final aihs f;
    private final jdk g = new jdk(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public jdm(adlt adltVar, aihs aihsVar, zaw zawVar, Context context, aild aildVar) {
        adltVar.getClass();
        this.e = adltVar;
        this.f = aihsVar;
        zawVar.getClass();
        this.a = zawVar;
        this.b = context;
        this.c = aildVar;
        this.d = Optional.empty();
    }

    protected abstract String b(apxf apxfVar);

    protected abstract String c(apxf apxfVar);

    protected abstract void d(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final adlm f() {
        adlt adltVar = this.e;
        if (adltVar != null) {
            return adltVar.g();
        }
        return null;
    }

    public final void g(String str) {
        this.f.h(str, aihs.a, "", 0, this.g);
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        String b = b(apxfVar);
        if (!TextUtils.isEmpty(b)) {
            d(b);
        } else {
            g(c(apxfVar));
        }
    }
}
