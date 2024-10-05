package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jlq implements ykl {
    final /* synthetic */ jlr a;

    public jlq(jlr jlrVar) {
        this.a = jlrVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf((String) obj);
        zga.d(valueOf.length() != 0 ? "Failed to sync playlist for playlistId = ".concat(valueOf) : new String("Failed to sync playlist for playlistId = "), exc);
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj2;
        if (this.a.x.m().booleanValue()) {
            jlz jlzVar = this.a.t;
            if (jlzVar != null) {
                jlzVar.a(Boolean.valueOf(bool != null && bool.booleanValue()));
                agnh d = ((agof) jlzVar.c.get()).a().i().d(jlzVar.f);
                if (d != null) {
                    if (!jlzVar.p) {
                        jlzVar.b(d.a);
                    }
                    jlzVar.e();
                    return;
                }
                return;
            }
            return;
        }
        jlv jlvVar = this.a.s;
        if (jlvVar != null) {
            jlvVar.b(Boolean.valueOf(bool != null && bool.booleanValue()));
            agnh d2 = ((agof) jlvVar.c.get()).a().i().d(jlvVar.f);
            if (d2 != null) {
                if (!jlvVar.p) {
                    jlvVar.c(d2.a);
                }
                jlvVar.h();
            }
        }
    }
}
