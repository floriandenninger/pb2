package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abri implements Runnable {
    final /* synthetic */ abrn a;

    public abri(abrn abrnVar) {
        this.a = abrnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abrm abrmVar = this.a.b;
        synchronized (abrmVar) {
            for (abrp abrpVar : abrmVar.f) {
                try {
                    abrpVar.c(abrmVar.b);
                } catch (Exception e) {
                    String valueOf = String.valueOf(abrpVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("error on RenderScheduler thread while releasing ");
                    sb.append(valueOf);
                    zga.d(sb.toString(), e);
                }
            }
            abqu abquVar = abrmVar.b;
            if (abquVar != null) {
                abquVar.e();
                abrmVar.b = null;
            }
        }
    }
}
