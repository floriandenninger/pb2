package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vfn implements vez {
    public final Context a;
    public final String b;
    public final Set c;
    public final boolean d;
    public SharedPreferences e;
    private final anib f;
    private final amnv g;
    private final vfj h;

    public vfn(vfk vfkVar) {
        this.a = vfkVar.a;
        this.f = vfkVar.b;
        this.b = vfkVar.c;
        this.c = vfkVar.d;
        this.h = vfkVar.g;
        this.d = vfkVar.e;
        this.g = vfkVar.f;
    }

    public static vfk d(Context context, anib anibVar) {
        return new vfk(context.getApplicationContext(), anibVar);
    }

    @Override // defpackage.vez
    public final anhy a() {
        if (((Boolean) this.g.get()).booleanValue()) {
            return anhv.a;
        }
        return this.f.submit(new vfi(this, 1));
    }

    @Override // defpackage.vez
    public final anhy b(aooy aooyVar) {
        vfj vfjVar = this.h;
        return anaf.O(vfjVar.a.a(new vfm(this.e, this.c), aooyVar));
    }

    @Override // defpackage.vez
    public final anhy c() {
        return this.f.submit(new vfi(this, 0));
    }
}
