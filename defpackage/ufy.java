package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ufy extends tyo {
    final /* synthetic */ ugb b;

    public ufy(ugb ugbVar) {
        this.b = ugbVar;
    }

    @Override // defpackage.tyo
    public final void ad(final amru amruVar) {
        tyo.M(new Runnable() { // from class: ufw
            @Override // java.lang.Runnable
            public final void run() {
                ufy ufyVar = ufy.this;
                amru amruVar2 = amruVar;
                ugb ugbVar = ufyVar.b;
                ugbVar.e = amruVar2;
                ugbVar.w();
            }
        });
    }

    @Override // defpackage.tyo
    public final void af(final Object obj) {
        tyo.M(new Runnable() { // from class: ufx
            @Override // java.lang.Runnable
            public final void run() {
                ufy ufyVar = ufy.this;
                Object obj2 = obj;
                ugb ugbVar = ufyVar.b;
                ugbVar.d = obj2;
                ugbVar.w();
            }
        });
    }
}
