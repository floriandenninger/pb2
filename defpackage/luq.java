package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class luq implements ajwv {
    private static final ammy a = juz.o;

    @Override // defpackage.ajwv
    public final /* bridge */ /* synthetic */ void b(Object obj, ajwu ajwuVar) {
        avvr avvrVar = (avvr) obj;
        if ((avvrVar.b & 16777216) != 0) {
            aqwe aqweVar = avvrVar.C;
            if (aqweVar == null) {
                aqweVar = aqwe.a;
            }
            if ((aqweVar.b & 128) != 0) {
                aqwf aqwfVar = aqweVar.h;
                if (aqwfVar == null) {
                    aqwfVar = aqwf.a;
                }
                if ((aqwfVar.b & 8) != 0) {
                    ajwuVar.a(new jai(aqweVar));
                    return;
                }
                aqwf aqwfVar2 = aqweVar.h;
                if (aqwfVar2 == null) {
                    aqwfVar2 = aqwf.a;
                }
                if ((aqwfVar2.b & 64) != 0) {
                    ajwuVar.a(new jal(aqweVar));
                    return;
                }
                aqwf aqwfVar3 = aqweVar.h;
                if (aqwfVar3 == null) {
                    aqwfVar3 = aqwf.a;
                }
                if ((aqwfVar3.b & 16) != 0) {
                    ajwuVar.a(new jak(aqweVar));
                    return;
                }
                aqwf aqwfVar4 = aqweVar.h;
                if (aqwfVar4 == null) {
                    aqwfVar4 = aqwf.a;
                }
                if ((aqwfVar4.b & 65536) != 0) {
                    ajwuVar.a(new jah(aqweVar));
                }
            }
        }
    }

    @Override // defpackage.ajwv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ajwv
    public final ammy e() {
        return a;
    }
}
