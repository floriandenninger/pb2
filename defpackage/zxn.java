package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxn {
    public asht a;
    private final acra b;

    public zxn(acra acraVar) {
        this.b = acraVar;
    }

    public final void a(String str) {
        if ("trim_handle_interaction".equals(str)) {
            this.b.I(3, new acqx(acsb.c(9917)), this.a);
            return;
        }
        zop a = zop.a(this.b, str);
        aone builder = a.b.toBuilder();
        asht ashtVar = this.a;
        if (ashtVar != null) {
            builder.mergeFrom((aonm) ashtVar);
        }
        awav awavVar = a.a;
        if (awavVar != null) {
            this.b.I(3, adyu.ce(awavVar), (asht) builder.build());
        }
    }
}
