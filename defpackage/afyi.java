package defpackage;

import android.content.Intent;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afyi implements Function {
    public final /* synthetic */ Intent a;
    private final /* synthetic */ int b;

    public /* synthetic */ afyi(Intent intent, int i) {
        this.b = i;
        this.a = intent;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? Function.CC.$default$andThen(this, function) : Function.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? Function.CC.$default$compose(this, function) : Function.CC.$default$compose(this, function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        if (this.b != 0) {
            Intent intent = this.a;
            apeg apegVar = (apeg) obj;
            if ((apegVar.b & 1) != 0) {
                apxf apxfVar = apegVar.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aghv.k(intent, apxfVar, null, false);
                apxf apxfVar2 = apegVar.d;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aear.O(intent, apxfVar2);
                return Optional.of(intent);
            }
            zga.b("Payload does not have the required navigation endpoint.");
            return Optional.empty();
        }
        Intent intent2 = this.a;
        apei apeiVar = (apei) obj;
        if ((apeiVar.b & 1) != 0) {
            apxf apxfVar3 = apeiVar.c;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aghv.k(intent2, apxfVar3, null, false);
            apxf apxfVar4 = apeiVar.d;
            if (apxfVar4 == null) {
                apxfVar4 = apxf.a;
            }
            aear.O(intent2, apxfVar4);
            return Optional.of(intent2);
        }
        zga.b("Payload does not have the required navigation endpoint.");
        return Optional.empty();
    }
}
