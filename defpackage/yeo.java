package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yeo {
    public aomf a;

    public final awfz a() {
        aone createBuilder = awfz.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            awfz awfzVar = (awfz) createBuilder.instance;
            awfzVar.b |= 1;
            awfzVar.c = aomfVar;
        }
        return (awfz) createBuilder.build();
    }

    public final awfy b() {
        aone createBuilder = awfy.a.createBuilder();
        aomf aomfVar = this.a;
        if (aomfVar != null) {
            createBuilder.copyOnWrite();
            awfy awfyVar = (awfy) createBuilder.instance;
            awfyVar.b |= 1;
            awfyVar.c = aomfVar;
        }
        return (awfy) createBuilder.build();
    }
}
