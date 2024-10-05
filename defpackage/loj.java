package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class loj implements zdj {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ Context b;
    final /* synthetic */ ywr c;

    public loj(SharedPreferences sharedPreferences, Context context, ywr ywrVar) {
        this.a = sharedPreferences;
        this.b = context;
        this.c = ywrVar;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        boolean equals = this.a.getString(yny.UPLOAD_NETWORK_POLICY, "").equals(this.b.getString(R.string.upload_network_policy_pref_value_wifi));
        return anfq.h(this.c.b(new eou(equals, 16)), new eou(equals, 17), angq.a);
    }

    @Override // defpackage.zdj
    public final /* bridge */ /* synthetic */ anhy b(Object obj) {
        String string;
        Boolean bool = (Boolean) obj;
        SharedPreferences.Editor edit = this.a.edit();
        if (bool.booleanValue()) {
            string = this.b.getString(R.string.upload_network_policy_pref_value_wifi);
        } else {
            string = this.b.getString(R.string.upload_network_policy_pref_value_any);
        }
        edit.putString(yny.UPLOAD_NETWORK_POLICY, string).apply();
        return this.c.b(new lod(bool, 4));
    }
}
