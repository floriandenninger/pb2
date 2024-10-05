package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class low {
    public final ywr a;
    public final ml b;
    public final wjt c;
    public final afsy d;
    public final wju e;
    public String f;
    public boolean g = true;
    private final ywr h;
    private final ywr i;
    private final SharedPreferences j;
    private final gcl k;
    private final ayqi l;
    private SharedPreferences.OnSharedPreferenceChangeListener m;

    public low(ml mlVar, aadw aadwVar, ywr ywrVar, ywr ywrVar2, ywr ywrVar3, SharedPreferences sharedPreferences, gcl gclVar, ayqi ayqiVar, wjt wjtVar, afsy afsyVar, wju wjuVar) {
        this.b = mlVar;
        this.h = ywrVar;
        this.a = ywrVar2;
        this.i = ywrVar3;
        this.j = sharedPreferences;
        this.k = gclVar;
        this.l = ayqiVar;
        final int i = 1;
        this.c = wjtVar;
        this.d = afsyVar;
        this.e = wjuVar;
        if (evr.aD(aadwVar)) {
            ywrVar.d().A(khe.q).n().E(ayqiVar).H(new ayro(this) { // from class: lov
                public final /* synthetic */ low a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayro
                public final Object a(Object obj, Object obj2) {
                    if (i == 0) {
                        low lowVar = this.a;
                        final Integer num = (Integer) obj;
                        Integer num2 = (Integer) obj2;
                        lowVar.a();
                        lowVar.a.b(new amml() { // from class: lou
                            @Override // defpackage.amml
                            public final Object apply(Object obj3) {
                                Integer num3 = num;
                                aone builder = ((lox) obj3).toBuilder();
                                int intValue = num3.intValue();
                                builder.copyOnWrite();
                                lox loxVar = (lox) builder.instance;
                                loxVar.b |= 4;
                                loxVar.e = intValue;
                                return (lox) builder.build();
                            }
                        });
                        return num2;
                    }
                    low lowVar2 = this.a;
                    avzr avzrVar = (avzr) obj2;
                    lowVar2.a();
                    lowVar2.a.b(new lrf((avzr) obj, 1));
                    return avzrVar;
                }
            }).W();
            final int i2 = 0;
            ywrVar3.d().A(khe.r).n().E(ayqiVar).H(new ayro(this) { // from class: lov
                public final /* synthetic */ low a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayro
                public final Object a(Object obj, Object obj2) {
                    if (i2 == 0) {
                        low lowVar = this.a;
                        final Integer num = (Integer) obj;
                        Integer num2 = (Integer) obj2;
                        lowVar.a();
                        lowVar.a.b(new amml() { // from class: lou
                            @Override // defpackage.amml
                            public final Object apply(Object obj3) {
                                Integer num3 = num;
                                aone builder = ((lox) obj3).toBuilder();
                                int intValue = num3.intValue();
                                builder.copyOnWrite();
                                lox loxVar = (lox) builder.instance;
                                loxVar.b |= 4;
                                loxVar.e = intValue;
                                return (lox) builder.build();
                            }
                        });
                        return num2;
                    }
                    low lowVar2 = this.a;
                    avzr avzrVar = (avzr) obj2;
                    lowVar2.a();
                    lowVar2.a.b(new lrf((avzr) obj, 1));
                    return avzrVar;
                }
            }).W();
            this.f = sharedPreferences.getString(aghv.QUALITY, null);
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lor
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                    String str2;
                    low lowVar = low.this;
                    if (str.equals(aghv.QUALITY) || str.equals(aghv.WIFI_POLICY) || str.equals(yny.UPLOAD_NETWORK_POLICY)) {
                        lowVar.a();
                    }
                    if (!str.equals(aghv.QUALITY) || (str2 = lowVar.f) == null) {
                        return;
                    }
                    lowVar.a.b(new fjz(str2, 10));
                    lowVar.f = sharedPreferences2.getString(aghv.QUALITY, null);
                }
            };
            this.m = onSharedPreferenceChangeListener;
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        }
    }

    public final void a() {
        if (this.g) {
            gcm d = gcq.d();
            d.k(this.b.getString(R.string.data_saving_snack_bar_text));
            d.d(-1);
            d.m(this.b.getString(R.string.data_saving_snack_bar_action_button), new View.OnClickListener() { // from class: los
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final low lowVar = low.this;
                    final Intent flags = new Intent().setClassName(lowVar.b, fav.f("settings.SettingsActivity")).putExtra(":android:show_fragment", fav.f("settings.datasaving.DataSavingPrefsFragment")).setFlags(335544320);
                    if (lowVar.e.a()) {
                        ynm.n(lowVar.b, lowVar.c.a(lowVar.d.c()), llq.f, new zfi() { // from class: lot
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                low lowVar2 = low.this;
                                Intent intent = flags;
                                AccountId accountId = (AccountId) obj;
                                accountId.getClass();
                                alxb.a(intent, accountId);
                                lowVar2.b.startActivity(intent);
                            }
                        });
                    } else {
                        lowVar.b.startActivity(flags);
                    }
                }
            });
            this.k.j(d.b());
        }
    }
}
