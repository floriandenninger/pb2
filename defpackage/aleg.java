package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aleg implements ayrs {
    public final /* synthetic */ aleh a;
    private final /* synthetic */ int b;

    public /* synthetic */ aleg(aleh alehVar, int i) {
        this.b = i;
        this.a = alehVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aleh alehVar = this.a;
            if (alehVar.c.a((akzs) obj)) {
                alehVar.b.set(true);
                alehVar.c();
                return;
            }
            return;
        }
        if (i == 1) {
            aleh alehVar2 = this.a;
            if (alehVar2.c.a((akzs) obj)) {
                alehVar2.b.set(true);
                return;
            }
            return;
        }
        if (i == 2) {
            aleh alehVar3 = this.a;
            Throwable th = (Throwable) obj;
            int i2 = alehVar3.a;
            StringBuilder sb = new StringBuilder(80);
            sb.append("AbstractUploadEntityRequirement Error while checking the requirement ");
            sb.append(i2);
            String sb2 = sb.toString();
            zga.f("AbstractUploadEntityRequirement", sb2, th);
            alehVar3.d.e(sb2, th);
            return;
        }
        aleh alehVar4 = this.a;
        Throwable th2 = (Throwable) obj;
        int i3 = alehVar4.a;
        StringBuilder sb3 = new StringBuilder(81);
        sb3.append("AbstractUploadEntityRequirement Error while observing the requirement ");
        sb3.append(i3);
        String sb4 = sb3.toString();
        zga.f("AbstractUploadEntityRequirement", sb4, th2);
        alehVar4.d.e(sb4, th2);
    }
}
