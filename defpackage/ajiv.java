package defpackage;

import com.youtube.android.libraries.elements.StatusOr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajiv extends sni {
    private final aadw a;

    public ajiv(aadw aadwVar) {
        this.a = aadwVar;
    }

    @Override // defpackage.sni
    public final aomu a() {
        return arbf.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aone createBuilder = arbg.a.createBuilder();
        auna aunaVar = this.a.b().D;
        if (aunaVar == null) {
            aunaVar = auna.a;
        }
        createBuilder.copyOnWrite();
        arbg arbgVar = (arbg) createBuilder.instance;
        aunaVar.getClass();
        arbgVar.c = aunaVar;
        arbgVar.b |= 1;
        return StatusOr.fromValue(((arbg) createBuilder.build()).toByteArray());
    }
}
