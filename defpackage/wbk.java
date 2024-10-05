package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbk {
    public final aahd a;
    public final zaw b;
    public final abdl c;
    private final ypa d;
    private final acpl e;

    public wbk(aahd aahdVar, abdl abdlVar, zaw zawVar, ypa ypaVar, acpl acplVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        aahdVar.getClass();
        this.a = aahdVar;
        abdlVar.getClass();
        this.c = abdlVar;
        zawVar.getClass();
        this.b = zawVar;
        ypaVar.getClass();
        this.d = ypaVar;
        acplVar.getClass();
        this.e = acplVar;
    }

    public final void a(arku arkuVar, int i, Runnable runnable, Runnable runnable2) {
        if ((arkuVar.b & 8) != 0) {
            arkt arktVar = arkuVar.f;
            if (arktVar == null) {
                arktVar = arkt.a;
            }
            aqyg aqygVar = arktVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            this.b.d(ajcq.b(aqygVar).toString());
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        if (arkuVar.g.size() > 0) {
            this.a.b(arkuVar.g);
        }
        aone createBuilder = awjv.a.createBuilder();
        createBuilder.copyOnWrite();
        awjv awjvVar = (awjv) createBuilder.instance;
        awjvVar.c = i - 1;
        awjvVar.b |= 1;
        awjv awjvVar2 = (awjv) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).eI(awjvVar2);
        this.e.c((arpp) a.build());
        runnable.run();
        this.d.d(new wap(true));
    }
}
