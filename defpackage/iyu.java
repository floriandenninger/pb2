package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyu implements aaqq {
    private final Context a;
    private final SharedPreferences b;
    private final azrw c;
    private final axpg d;
    private final azrw e;
    private final azrw f;

    public iyu(Context context, SharedPreferences sharedPreferences, azrw azrwVar, axpg axpgVar, azrw azrwVar2, azrw azrwVar3) {
        this.a = context;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        azrwVar.getClass();
        this.c = azrwVar;
        axpgVar.getClass();
        this.d = axpgVar;
        this.e = azrwVar2;
        this.f = azrwVar3;
    }

    public final void a() {
        this.c.get();
    }

    @Override // defpackage.aaqq
    public final void b(aone aoneVar) {
        String string = this.b.getString(fav.COUNTRY, "");
        if (!TextUtils.isEmpty(string)) {
            aoneVar.copyOnWrite();
            armz armzVar = (armz) aoneVar.instance;
            armz armzVar2 = armz.a;
            string.getClass();
            armzVar.b |= 16;
            armzVar.i = string;
        }
        try {
            String str = (String) anaf.A(((abep) this.f.get()).d());
            if (!TextUtils.isEmpty(str)) {
                aoneVar.copyOnWrite();
                armz armzVar3 = (armz) aoneVar.instance;
                armz armzVar4 = armz.a;
                str.getClass();
                armzVar3.b |= 128;
                armzVar3.j = str;
            }
        } catch (ExecutionException e) {
            zga.d("Failed to read the internal geo.", e);
        }
        if (TextUtils.isEmpty(null)) {
            if (this.a.getResources().getString(R.string.application_name).startsWith("\u200e\u200f\u200e\u200e")) {
                aoneVar.copyOnWrite();
                armz armzVar5 = (armz) aoneVar.instance;
                armz armzVar6 = armz.a;
                armzVar5.b |= 4;
                armzVar5.g = true;
            }
            armw armwVar = (armw) this.c.get();
            aoneVar.copyOnWrite();
            armz armzVar7 = (armz) aoneVar.instance;
            armz armzVar8 = armz.a;
            armzVar7.L = armwVar.f;
            armzVar7.d |= 16;
            astw c = ((acop) this.d.get()).c();
            if (c != null) {
                aoneVar.copyOnWrite();
                armz armzVar9 = (armz) aoneVar.instance;
                armzVar9.k = c;
                armzVar9.b |= 1024;
            }
            anrw anrwVar = (anrw) ((kcd) this.e.get()).b.get("com.youtube.mainapp.android");
            if (anrwVar != null) {
                aoneVar.copyOnWrite();
                armz armzVar10 = (armz) aoneVar.instance;
                aony aonyVar = armzVar10.o;
                if (!aonyVar.c()) {
                    armzVar10.o = aonm.mutableCopy(aonyVar);
                }
                armzVar10.o.add(anrwVar);
                return;
            }
            return;
        }
        aoneVar.copyOnWrite();
        armz armzVar11 = armz.a;
        throw null;
    }
}
