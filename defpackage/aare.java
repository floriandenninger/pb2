package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aare implements Runnable {
    final /* synthetic */ azrw a;
    final /* synthetic */ azrw b;
    final /* synthetic */ aarh c;

    public aare(aarh aarhVar, azrw azrwVar, azrw azrwVar2) {
        this.c = aarhVar;
        this.a = azrwVar;
        this.b = azrwVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aarh aarhVar;
        azrw azrwVar;
        aadr aadrVar = (aadr) this.a.get();
        aarh aarhVar2 = this.c;
        String string = aarhVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_config_group", null);
        aarhVar2.f = aarhVar2.d.getLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", -1L);
        apwy apwyVar = TextUtils.isEmpty(string) ? null : (apwy) adyu.du(string, apwy.a.getParserForType());
        if (apwyVar == null) {
            apwyVar = apwy.a;
            aarhVar2.f = -1L;
        }
        aarg aargVar = aarhVar2.i;
        long j = aarhVar2.f;
        aargVar.c = j;
        aargVar.b = j;
        aargVar.a = aarhVar2.d.getString("com.google.android.libraries.youtube.innertube.cold_hash_data", "");
        try {
        } catch (InterruptedException | ExecutionException e) {
            aarh.e("SP !failsafe", e);
        }
        if (((Boolean) aadrVar.b().get()).booleanValue()) {
            aarh aarhVar3 = this.c;
            aarh.j("SP resetConfigs");
            SharedPreferences.Editor putString = aarhVar3.d.edit().putString("com.google.android.libraries.youtube.innertube.cold_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_config_group", null).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", null).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", null);
            aarhVar3.j = 0;
            yxx yxxVar = aarhVar3.e;
            if (yxxVar != null) {
                yxxVar.h(putString);
            }
            putString.apply();
            this.c.c.sc(apck.a);
            this.c.b.sc(apwy.a);
            this.c.a.c(arfd.a);
            aarh aarhVar4 = this.c;
            aarhVar4.i.d = (aonm) aarhVar4.b.ac();
            aarh aarhVar5 = this.c;
            aarhVar5.h.d = (aonm) aarhVar5.a.aO();
            aarhVar = this.c;
            if ((aarhVar.j & 4) != 0 || (azrwVar = this.b) == null) {
            }
            aarhVar.g((ypa) azrwVar.get());
            return;
        }
        this.c.c.sc(aarh.b(apwyVar));
        this.c.b.sc(apwyVar);
        aarh aarhVar6 = this.c;
        azrh azrhVar = aarhVar6.a;
        String string2 = aarhVar6.d.getString("com.google.android.libraries.youtube.innertube.hot_config_group", null);
        aarhVar6.g = aarhVar6.d.getLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", -1L);
        arfd arfdVar = TextUtils.isEmpty(string2) ? null : (arfd) adyu.du(string2, arfd.a.getParserForType());
        if (arfdVar == null) {
            arfdVar = arfd.a;
            aarhVar6.g = -1L;
        }
        aarg aargVar2 = aarhVar6.h;
        aargVar2.b = aarhVar6.g;
        aargVar2.a = aarhVar6.d.getString("com.google.android.libraries.youtube.innertube.hot_hash_data", "");
        azrhVar.c(arfdVar);
        aarh aarhVar42 = this.c;
        aarhVar42.i.d = (aonm) aarhVar42.b.ac();
        aarh aarhVar52 = this.c;
        aarhVar52.h.d = (aonm) aarhVar52.a.aO();
        aarhVar = this.c;
        if ((aarhVar.j & 4) != 0) {
        }
    }
}
