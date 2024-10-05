package defpackage;

import android.accounts.Account;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vll implements vlj {
    public static final String a = Locale.US.getLanguage();
    public final aybv b;
    public final vlh c;
    public final Account d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public ammv f = amlr.a;
    private final anib g;

    public vll(aybv aybvVar, anib anibVar, vlh vlhVar, Account account) {
        this.b = aybvVar;
        this.g = anibVar;
        this.c = vlhVar;
        this.d = account;
    }

    @Override // defpackage.vlj
    public final synchronized anhy a() {
        return this.g.submit(new Callable() { // from class: vlk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                vll vllVar = vll.this;
                aycd aycdVar = new aycd();
                ayca c = ayca.c("Accept-Language", aycd.a);
                Locale locale = Locale.getDefault();
                String language = TextUtils.isEmpty(locale.getLanguage()) ? vll.a : locale.getLanguage();
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    String valueOf = String.valueOf(language);
                    String country = locale.getCountry();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(country).length());
                    sb.append(valueOf);
                    sb.append('-');
                    sb.append(country);
                    language = sb.toString();
                }
                aycdVar.f(c, language);
                aocy aocyVar = (aocy) ((aocy) aocy.c(new amko(3), vllVar.b)).d(axxp.a.get().f(), TimeUnit.SECONDS);
                if (vllVar.e.compareAndSet(true, false) && vllVar.f.h()) {
                    qde.g(vllVar.c.a, (String) vllVar.f.c());
                    vllVar.f = amlr.a;
                }
                if (!vllVar.f.h()) {
                    vlh vlhVar = vllVar.c;
                    vllVar.f = ammv.j(qde.e(vlhVar.a, vllVar.d, vlhVar.b));
                }
                aydm aydmVar = new aydm(amle.c(new amla((String) vllVar.f.c())));
                axzp axzpVar = aocyVar.a;
                axzo axzoVar = new axzo(aocyVar.b);
                axzoVar.h = aydmVar;
                return (aocy) aocyVar.a(axzpVar, axzoVar).e(aynu.b(aycdVar));
            }
        });
    }

    @Override // defpackage.vlj
    public final synchronized void b() {
        this.e.set(true);
    }
}
