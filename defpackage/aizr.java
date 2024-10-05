package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aizr implements ajaf {
    final /* synthetic */ aizs a;

    public aizr(aizs aizsVar) {
        this.a = aizsVar;
    }

    @Override // defpackage.ajaf
    public final void a(aaxm aaxmVar, aone aoneVar) {
        synchronized (this.a) {
            aizs aizsVar = this.a;
            int i = aizsVar.b;
            if ((i == 3 || i == 4) && aizsVar.a.h()) {
                apgf apgfVar = (apgf) this.a.a.c();
                aoneVar.copyOnWrite();
                arxm arxmVar = (arxm) aoneVar.instance;
                arxm arxmVar2 = arxm.a;
                arxmVar.j = apgfVar;
                arxmVar.b |= 256;
                this.a.b = 4;
            }
        }
    }
}
