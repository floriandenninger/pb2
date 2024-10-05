package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywv implements vez {
    public final azrw a;
    public amrz b = amvo.b;
    private final ammy c;
    private final amml d;
    private final amml e;
    private final ykr f;
    private final anib g;

    public ywv(azrw azrwVar, ammy ammyVar, amml ammlVar, amml ammlVar2, ykr ykrVar, anib anibVar) {
        this.a = azrwVar;
        this.c = ammyVar;
        this.d = ammlVar;
        this.e = ammlVar2;
        this.f = ykrVar;
        this.g = anibVar;
    }

    public static ywu d(azrw azrwVar, anib anibVar) {
        return new ywu(azrwVar, anibVar);
    }

    @Override // defpackage.vez
    public final anhy a() {
        if (this.b.isEmpty()) {
            return anaf.O(null);
        }
        return this.g.submit(new Callable() { // from class: yws
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ywv ywvVar = ywv.this;
                SharedPreferences.Editor edit = ((SharedPreferences) ywvVar.a.get()).edit();
                amxd listIterator = ywvVar.b.keySet().listIterator();
                while (listIterator.hasNext()) {
                    edit.remove((String) listIterator.next());
                }
                if (edit.commit()) {
                    ywvVar.b = amvo.b;
                    return null;
                }
                throw new IOException("Failed to clear the keys from SharedPreferences.");
            }
        });
    }

    @Override // defpackage.vez
    public final /* bridge */ /* synthetic */ anhy b(aooy aooyVar) {
        aonm aonmVar = (aonm) aooyVar;
        Boolean bool = (Boolean) this.d.apply(aonmVar);
        if (bool == null) {
            return anaf.N(new IllegalArgumentException("isMigrated cannot return a null value"));
        }
        if (bool.booleanValue()) {
            return anaf.O(aonmVar);
        }
        aone builder = aonmVar.toBuilder();
        amrw h = amrz.h();
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.a.get()).getAll().entrySet()) {
            if (this.c.a(entry.getKey())) {
                if (entry instanceof Set) {
                    h.g(entry.getKey(), amsx.p((Set) entry));
                } else {
                    h.e(entry);
                }
            }
        }
        this.b = h.c();
        this.f.a(new ywt(this.b), builder);
        this.e.apply(builder);
        return anaf.O(builder.build());
    }

    @Override // defpackage.vez
    public final anhy c() {
        return anaf.O(true);
    }
}
