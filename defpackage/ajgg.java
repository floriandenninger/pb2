package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajgg extends sxj {
    public final acra a;
    public final asht b;

    public ajgg(sxs sxsVar, acra acraVar, asht ashtVar) {
        super(sxsVar);
        this.a = acraVar;
        this.b = ashtVar;
    }

    public static sxk w(final acra acraVar) {
        return new sxk() { // from class: ajge
            @Override // defpackage.sxk
            public final sxj a(sxs sxsVar) {
                return new ajgg(sxsVar, acra.this, null);
            }
        };
    }

    public static acra x(sxs sxsVar) {
        if (sxsVar instanceof ajgg) {
            return ((ajgg) sxsVar).a;
        }
        return null;
    }
}
