package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fwh implements fwn, akbl {
    private static final long b = TimeUnit.DAYS.toMillis(1);
    public View a;
    private final fwo c;
    private final SharedPreferences d;
    private final int e;
    private final String f;
    private final int g;
    private final akch h;
    private akcj i;

    public fwh(fwo fwoVar, SharedPreferences sharedPreferences, int i, String str, int i2, akch akchVar) {
        fwoVar.getClass();
        this.c = fwoVar;
        sharedPreferences.getClass();
        this.d = sharedPreferences;
        this.e = i;
        this.f = str;
        this.g = i2;
        akchVar.getClass();
        this.h = akchVar;
    }

    @Override // defpackage.fwk
    public final int c() {
        return this.e;
    }

    @Override // defpackage.fwk
    public final void d() {
        akcj akcjVar = this.i;
        if (akcjVar != null) {
            this.h.b(akcjVar);
        }
    }

    @Override // defpackage.fwk
    public final void e() {
        View view = this.a;
        if (view == null) {
            return;
        }
        akch akchVar = this.h;
        akci a = akchVar.a();
        a.a = view;
        a.c = view.getContext().getText(this.g);
        a.c(2);
        a.i(2);
        a.f = this;
        a.l();
        akchVar.c(a.a());
    }

    @Override // defpackage.fwn
    public final boolean f() {
        View view = this.a;
        return view != null && view.isShown() && this.d.getBoolean(this.f, true) && g(fav.TIME_LAST_BROWSE_CLING_SHOWN) && this.d.getLong(fav.TIME_FUSION_ENABLED, 0L) != 0 && g(fav.TIME_FUSION_ENABLED);
    }

    final boolean g(String str) {
        return gov.d(this.d, str, b, System.currentTimeMillis());
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.i = null;
        this.d.edit().putBoolean(this.f, false).putLong(fav.TIME_LAST_BROWSE_CLING_SHOWN, System.currentTimeMillis()).apply();
        this.c.f(this);
    }

    @Override // defpackage.akbl
    public final /* synthetic */ void lj(Object obj) {
        this.i = (akcj) obj;
    }
}
