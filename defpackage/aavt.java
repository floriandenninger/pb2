package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aavt {
    public final avmt a;
    public List b;

    public aavt(avmt avmtVar) {
        avmtVar.getClass();
        this.a = avmtVar;
    }

    public final avmg a() {
        avmh avmhVar = this.a.c;
        if (avmhVar == null) {
            avmhVar = avmh.a;
        }
        if ((avmhVar.b & 1) == 0) {
            return null;
        }
        avmh avmhVar2 = this.a.c;
        if (avmhVar2 == null) {
            avmhVar2 = avmh.a;
        }
        avmg avmgVar = avmhVar2.c;
        return avmgVar == null ? avmg.a : avmgVar;
    }

    public final void b() {
        avmt avmtVar = this.a;
        if ((avmtVar.b & 128) != 0) {
            avlw avlwVar = avmtVar.f;
            if (avlwVar == null) {
                avlwVar = avlw.a;
            }
            if (avlwVar.b == null) {
                aqdt aqdtVar = aqdt.a;
            }
        }
    }
}
