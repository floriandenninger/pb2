package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywx implements ywr {
    public final SharedPreferences a;
    public final azqw b;
    private final ynx c;
    private final Executor d;
    private final amml e;
    private final ykr f;
    private final aooy g;

    public ywx(ynx ynxVar, Executor executor, SharedPreferences sharedPreferences, amml ammlVar, ykr ykrVar, aooy aooyVar) {
        this.c = ynxVar;
        this.d = anaf.E(executor);
        this.a = sharedPreferences;
        this.e = ammlVar;
        this.f = ykrVar;
        this.g = aooyVar;
        azqw av = azqv.ap().av();
        this.b = av;
        av.c((aooy) ammlVar.apply(sharedPreferences));
    }

    @Override // defpackage.ywr
    public final anhy a() {
        return anaf.O(c());
    }

    @Override // defpackage.ywr
    public final anhy b(final amml ammlVar) {
        auie auieVar = this.c.d().g;
        if (auieVar == null) {
            auieVar = auie.a;
        }
        if (auieVar.e) {
            return anaf.T(new anfy() { // from class: yww
                @Override // defpackage.anfy
                public final anhy a() {
                    ywx ywxVar = ywx.this;
                    amml ammlVar2 = ammlVar;
                    SharedPreferences.Editor edit = ywxVar.a.edit();
                    aooy e = ywxVar.e(edit, ammlVar2);
                    if (edit.commit()) {
                        ywxVar.b.c(e);
                        return anaf.O(null);
                    }
                    return anaf.N(new IllegalStateException("Failed to store data to SharedPreferences"));
                }
            }, this.d);
        }
        try {
            SharedPreferences.Editor edit = this.a.edit();
            aooy e = e(edit, ammlVar);
            edit.apply();
            this.b.c(e);
            return anaf.O(null);
        } catch (Exception e2) {
            return anaf.N(e2);
        }
    }

    @Override // defpackage.ywr
    public final aooy c() {
        try {
            return (aooy) this.e.apply(this.a);
        } catch (Exception e) {
            zga.d("Could not write SharedPreferences values to proto schema.", e);
            return this.g;
        }
    }

    @Override // defpackage.ywr
    public final aypn d() {
        return this.b.y();
    }

    public final aooy e(SharedPreferences.Editor editor, amml ammlVar) {
        aooy aooyVar = (aooy) ammlVar.apply((aooy) this.e.apply(this.a));
        this.f.a(editor, aooyVar);
        return aooyVar;
    }
}
