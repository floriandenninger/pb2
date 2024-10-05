package defpackage;

import com.youtube.android.libraries.elements.StatusOr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajiw extends sni {
    private final aaea a;

    public ajiw(aaea aaeaVar) {
        this.a = aaeaVar;
    }

    @Override // defpackage.sni
    public final aomu a() {
        return arbh.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFunctionBinding
    public final StatusOr execute(byte[] bArr) {
        aone createBuilder = arbi.a.createBuilder();
        aunb aunbVar = this.a.a().B;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        createBuilder.copyOnWrite();
        arbi arbiVar = (arbi) createBuilder.instance;
        aunbVar.getClass();
        arbiVar.c = aunbVar;
        arbiVar.b |= 1;
        return StatusOr.fromValue(((arbi) createBuilder.build()).toByteArray());
    }
}
