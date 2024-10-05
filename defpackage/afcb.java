package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afcb {
    public final afca a;
    public final afca b;
    public final aeru c;
    public final aeru d;

    public afcb(aeru aeruVar, aeru aeruVar2, afeb afebVar, boolean z, String str, String str2) {
        this.c = aeruVar;
        this.d = aeruVar2;
        long j = afebVar.a;
        j = j == -1 ? afebVar.b.b.d : j;
        aerv aervVar = afebVar.b;
        this.a = new afca((float) j, z, 0, aervVar.d, aervVar.b.c);
        this.b = new afca((float) afebVar.b.c.a, z, 1, str, str2);
    }

    public static void a(boolean z, afca afcaVar, aeru aeruVar) {
        afcaVar.a = z;
        aeruVar.i("xvt", afcaVar);
    }
}
