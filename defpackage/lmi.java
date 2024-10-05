package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lmi extends lmj implements alxs {
    public final SettingsActivity a;
    public final gni b;
    public final fxj c;
    public final axpg d;
    public final Executor e;
    public final aawl f;
    public final Handler g;
    public final yxe h;
    public final axpg i;
    public final axpg j;
    public final axpg k;
    public final wju l;
    public final aaea m;
    public final gbh n;
    public final gng p;
    public boolean r;
    public aae s;
    private final wjz u;
    private final low v;
    public final zw o = new lmh(this);
    public String q = "";

    public lmi(SettingsActivity settingsActivity, gni gniVar, fxj fxjVar, axpg axpgVar, Executor executor, aawl aawlVar, Handler handler, yxe yxeVar, axpg axpgVar2, axpg axpgVar3, gbh gbhVar, low lowVar, axpg axpgVar4, aaea aaeaVar, wju wjuVar, wjz wjzVar) {
        this.a = settingsActivity;
        this.b = gniVar;
        this.c = fxjVar;
        this.d = axpgVar;
        this.e = executor;
        this.f = aawlVar;
        this.g = handler;
        this.h = yxeVar;
        this.i = axpgVar2;
        this.j = axpgVar3;
        this.n = gbhVar;
        this.v = lowVar;
        this.k = axpgVar4;
        this.l = wjuVar;
        this.u = wjzVar;
        this.m = aaeaVar;
        gng a = gniVar.a();
        this.p = a;
        boolean ag = evr.ag(aaeaVar.a());
        if (a == gng.DARK) {
            if (ag) {
                settingsActivity.setTheme(R.style.Theme_YouTube_Settings_Dark_RemoveStatusBarBackground);
                return;
            } else {
                settingsActivity.setTheme(R.style.Theme_YouTube_Settings_Dark);
                return;
            }
        }
        if (ag) {
            settingsActivity.setTheme(R.style.Theme_YouTube_Settings_RemoveStatusBarBackground);
        } else {
            settingsActivity.setTheme(R.style.Theme_YouTube_Settings);
        }
        etx.h(settingsActivity);
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        if (this.l.a()) {
            this.u.b(11, 2, 2);
            ((gjk) this.i.get()).b(PanelsConfiguration.c(new AutoValue_PanelFragmentDescriptor(lmn.class, alxqVar.a()), PanelFragmentDescriptor.e(GeneralPrefsFragment.class)));
            this.a.getOnBackPressedDispatcher().b(this.a, this.o);
            g(this.a.getIntent());
        }
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        String.valueOf(String.valueOf(th)).length();
        if (this.l.a()) {
            afsi.c(2, 25, "[Clockwork][SettingsActivityPeer] onAccountError()", th);
            this.u.c(11, th);
            this.a.finish();
        }
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }

    public final lms e() {
        lms lmsVar = (lms) this.a.getSupportFragmentManager().f(f());
        lmsVar.getClass();
        return lmsVar;
    }

    public final String f() {
        if (this.l.a()) {
            return lmn.class.getName();
        }
        return lmm.class.getName();
    }

    public final void g(Intent intent) {
        Optional map = Optional.of(intent).map(jyr.k).map(jyr.l).map(jyr.m);
        final lms e = e();
        map.ifPresent(new Consumer() { // from class: lmf
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                lms.this.ag.a((apxf) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.lmj
    public final void h(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || i()) {
            super.h(this.a.getString(R.string.settings));
        } else {
            super.h(charSequence);
        }
    }

    public final boolean i() {
        return ((gjk) this.i.get()).d();
    }

    public final boolean j(String str) {
        if (str == null) {
            return false;
        }
        try {
            this.v.g = !str.equals("com.google.android.apps.youtube.app.settings.datasaving.DataSavingPrefsFragment");
            ((gjk) this.i.get()).c(PanelFragmentDescriptor.e(Class.forName(str)), true);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
