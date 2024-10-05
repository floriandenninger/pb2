package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adco implements ypd {
    final /* synthetic */ adcp a;

    public adco(adcp adcpVar) {
        this.a = adcpVar;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        boolean z = false;
        if (i == -1) {
            return new Class[]{adlu.class, admg.class};
        }
        if (i != 0) {
            if (i == 1) {
                this.a.d = ((admg) obj).a();
                adcp adcpVar = this.a;
                adcpVar.jN(adcpVar.e());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        adlm a = ((adlu) obj).a();
        adcp adcpVar2 = this.a;
        if (a != null && a.a() == 0) {
            z = true;
        }
        adcpVar2.c = z;
        this.a.l();
        adcp adcpVar3 = this.a;
        adcpVar3.jN(adcpVar3.e());
        return null;
    }
}
