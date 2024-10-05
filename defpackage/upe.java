package defpackage;

import android.os.health.TimerStat;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upe extends upc {
    public static final upe a = new upe();

    private upe() {
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy a(String str, Object obj) {
        return uou.k(str, (TimerStat) obj);
    }

    @Override // defpackage.upc
    public final /* synthetic */ aooy b(aooy aooyVar, aooy aooyVar2) {
        return uou.j((babe) aooyVar, (babe) aooyVar2);
    }

    @Override // defpackage.upc
    public final /* bridge */ /* synthetic */ String c(aooy aooyVar) {
        babe babeVar = (babe) aooyVar;
        baaz baazVar = babeVar.e;
        if (baazVar == null) {
            baazVar = baaz.a;
        }
        int i = baazVar.b & 2;
        baaz baazVar2 = babeVar.e;
        if (i != 0) {
            if (baazVar2 == null) {
                baazVar2 = baaz.a;
            }
            return baazVar2.d;
        }
        if (baazVar2 == null) {
            baazVar2 = baaz.a;
        }
        return Long.toHexString(baazVar2.c);
    }
}
