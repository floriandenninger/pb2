package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class abfi implements afxj {
    private final SharedPreferences a;
    private final azrw b;

    /* JADX INFO: Access modifiers changed from: protected */
    public abfi(SharedPreferences sharedPreferences, azrw azrwVar) {
        this.b = azrwVar;
        this.a = sharedPreferences;
    }

    @Override // defpackage.afxj
    public final void a(String str) {
        if (this.a.getString("visitor_id", null) == null && !str.contains("visitor_id")) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(asem asemVar) {
        arnd arndVar = asemVar.b;
        if (arndVar == null) {
            arndVar = arnd.a;
        }
        String str = arndVar.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.edit().putString("visitor_id", str).apply();
    }

    protected abstract void c();

    public final void d(int i) {
        acpk acpkVar = (acpk) this.b.get();
        aone createBuilder = aplh.a.createBuilder();
        createBuilder.copyOnWrite();
        aplh aplhVar = (aplh) createBuilder.instance;
        aplhVar.c = i - 1;
        aplhVar.b |= 1;
        aplh aplhVar2 = (aplh) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cg(aplhVar2);
        acpkVar.a((arpp) a.build());
    }
}
