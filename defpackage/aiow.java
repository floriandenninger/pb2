package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiow {
    private final banw a;
    private final aiih b;
    private final aipd c;
    private aigr d;
    private final ahbg e;

    public aiow(banw banwVar, ahbg ahbgVar, aiih aiihVar, aipd aipdVar, byte[] bArr) {
        this.a = banwVar;
        this.e = ahbgVar;
        this.b = aiihVar;
        this.c = aipdVar;
    }

    public final void a() {
        aigr aigrVar = this.d;
        if (aigrVar == null) {
            return;
        }
        b(aigrVar);
        aiwk aiwkVar = this.c.a;
        if (aiwkVar != null && aigrVar.i == 4) {
            aiwkVar.D(aigrVar);
        }
    }

    public final void b(aigr aigrVar) {
        this.a.c(aigrVar);
    }

    public final void c() {
        this.d = null;
    }

    public final void d(aigr aigrVar) {
        if (this.e.b() == 2) {
            return;
        }
        this.d = aigrVar;
        this.b.l(aigk.VIDEO_PLAYBACK_ERROR);
        a();
    }
}
