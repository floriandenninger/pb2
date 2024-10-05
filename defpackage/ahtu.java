package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtu implements ahtr {
    public final ahtp a;
    public final Map b;
    private final aahv c;
    private final afsy d;

    public ahtu(ahtp ahtpVar, aahv aahvVar, afsy afsyVar, Map map) {
        this.a = ahtpVar;
        this.c = aahvVar;
        this.d = afsyVar;
        this.b = map;
    }

    @Override // defpackage.ahtr
    public final void a(boolean z, final String str) {
        if (!z) {
            this.a.g(str, false);
        } else if (str != null) {
            final Runnable runnable = new Runnable() { // from class: ahtt
                @Override // java.lang.Runnable
                public final void run() {
                    ahtu ahtuVar = ahtu.this;
                    ahtuVar.a.g(str, true);
                }
            };
            this.c.a(this.d.c()).f(str).r(new aflz(4)).g(asvm.class).U(new ayrs() { // from class: ahts
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    ahyo ahyoVar;
                    ahtu ahtuVar = ahtu.this;
                    Runnable runnable2 = runnable;
                    asvm asvmVar = (asvm) obj;
                    int cZ = amkq.cZ(asvmVar.getMarkersListModel().b.c);
                    if (cZ == 0) {
                        cZ = 1;
                    }
                    int i = cZ - 1;
                    if (i == 1) {
                        ahyoVar = ahyo.TIMESTAMP_MARKER;
                    } else if (i == 2) {
                        ahyoVar = ahyo.CHAPTER;
                    } else if (i == 3) {
                        ahyoVar = ahyo.HEATMAP_MARKER;
                    } else {
                        ahyoVar = ahyo.UNKNOWN;
                    }
                    ahtv ahtvVar = (ahtv) ahtuVar.b.get(ahyoVar);
                    if (ahtvVar != null) {
                        ahtvVar.a(asvmVar);
                        runnable2.run();
                    }
                }
            });
        }
    }
}
