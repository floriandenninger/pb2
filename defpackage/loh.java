package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class loh implements zdj {
    final /* synthetic */ ywr a;
    final /* synthetic */ azrw b;
    final /* synthetic */ SharedPreferences c;

    public loh(ywr ywrVar, azrw azrwVar, SharedPreferences sharedPreferences) {
        this.a = ywrVar;
        this.b = azrwVar;
        this.c = sharedPreferences;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        boolean equals = ((agsg) this.b.get()).u().equals(atrx.LD);
        return anfq.h(this.a.b(new eou(equals, 12)), new eou(equals, 13), angq.a);
    }

    @Override // defpackage.zdj
    public final /* bridge */ /* synthetic */ anhy b(Object obj) {
        Boolean bool = (Boolean) obj;
        anhy b = this.a.b(new lod(bool, 2));
        if (bool.booleanValue()) {
            ((agsg) this.b.get()).E(atrx.LD);
            return b;
        }
        final ywr ywrVar = this.a;
        final SharedPreferences sharedPreferences = this.c;
        return anfq.i(b, new anfz() { // from class: log
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                return anfq.h(ywr.this.a(), new tps(sharedPreferences, 1), angq.a);
            }
        }, angq.a);
    }
}
