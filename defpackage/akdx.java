package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akdx implements aker {
    private final akep a;

    public akdx(akep akepVar) {
        akepVar.getClass();
        this.a = akepVar;
    }

    @Override // defpackage.aker
    public final akdy a(akel akelVar) {
        try {
            return this.a.b(akelVar);
        } catch (IOException e) {
            akmq.e("OnlineSuggestSource exception", e);
            return akdy.a;
        }
    }
}
