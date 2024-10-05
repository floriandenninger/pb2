package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adba implements ykl {
    final /* synthetic */ adbb a;

    public adba(adbb adbbVar) {
        this.a = adbbVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String valueOf = String.valueOf(exc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Error attempting pairing: ");
        sb.append(valueOf);
        zga.b(sb.toString());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.a.J((adga) obj2, new jvq(2));
    }
}
