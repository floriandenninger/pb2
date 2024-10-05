package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajnu implements ajom {
    public static awav d(ajok ajokVar) {
        byte[] bArr = ajokVar.b;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        aone createBuilder = awav.a.createBuilder();
        aomf x = aomf.x(ajokVar.b);
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 1;
        awavVar.c = x;
        return (awav) createBuilder.build();
    }

    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        throw null;
    }
}
