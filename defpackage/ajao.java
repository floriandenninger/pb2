package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajao implements ajaf {
    final /* synthetic */ ajap a;

    public ajao(ajap ajapVar) {
        this.a = ajapVar;
    }

    @Override // defpackage.ajaf
    public final void a(aaxm aaxmVar, aone aoneVar) {
        int i;
        if (this.a.a != 0) {
            aone createBuilder = arxl.a.createBuilder();
            switch (this.a.a) {
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                case 10:
                    i = 6;
                    break;
                default:
                    i = 1;
                    break;
            }
            createBuilder.copyOnWrite();
            arxl arxlVar = (arxl) createBuilder.instance;
            arxlVar.c = i - 1;
            arxlVar.b |= 1;
            arxl arxlVar2 = (arxl) createBuilder.build();
            aoneVar.copyOnWrite();
            arxm arxmVar = (arxm) aoneVar.instance;
            arxm arxmVar2 = arxm.a;
            arxlVar2.getClass();
            arxmVar.i = arxlVar2;
            arxmVar.b |= 128;
        }
    }
}
