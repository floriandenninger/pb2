package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lha extends akeg {
    public final aaea a;
    private final SharedPreferences k;
    private final Context l;
    private final mcy m;

    public lha(SharedPreferences sharedPreferences, Context context, aaea aaeaVar) {
        sharedPreferences.getClass();
        this.k = sharedPreferences;
        this.l = context;
        this.a = aaeaVar;
        this.m = new mcy();
    }

    @Override // defpackage.akeg
    public final String a() {
        int O = yjk.O(this.l);
        return (O == 3 || O == 4) ? "youtube-android-pb-tablet" : this.d;
    }

    @Override // defpackage.akeg
    public final String b() {
        aunv aunvVar = this.a.a().n;
        if (aunvVar == null) {
            aunvVar = aunv.a;
        }
        return aunvVar.b;
    }

    @Override // defpackage.akeg
    public final boolean c() {
        return !this.e && this.k.getBoolean("dogfood_suggest_send_visitor_id_signed_out", false);
    }

    @Override // defpackage.akeg
    public final boolean d() {
        if (c()) {
            return true;
        }
        return this.g;
    }

    @Override // defpackage.akeg
    public final mcy e() {
        if (c()) {
            return this.m;
        }
        return null;
    }
}
