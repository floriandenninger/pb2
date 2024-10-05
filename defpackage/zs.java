package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zs implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ aaj b;
    final /* synthetic */ clu c;

    public zs(aaj aajVar, int i, clu cluVar, byte[] bArr) {
        this.b = aajVar;
        this.a = i;
        this.c = cluVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aac aacVar;
        aaj aajVar = this.b;
        int i = this.a;
        Object obj = this.c.b;
        String str = (String) aajVar.b.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        aajVar.d.remove(str);
        aah aahVar = (aah) aajVar.e.get(str);
        if (aahVar == null || (aacVar = aahVar.a) == null) {
            aajVar.g.remove(str);
            aajVar.f.put(str, obj);
        } else {
            aacVar.a(obj);
        }
    }
}
