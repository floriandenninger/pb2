package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anjp {
    private final anju a;
    private final Class b;

    public anjp(anju anjuVar, Class cls) {
        if (!anjuVar.e().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", anjuVar.toString(), cls.getName()));
        }
        this.a = anjuVar;
        this.b = cls;
    }

    private final anjo g() {
        return new anjo(this.a.a());
    }

    private final Object h(aooy aooyVar) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.f(aooyVar);
        return this.a.c(aooyVar, this.b);
    }

    public final aooy a(aomf aomfVar) {
        try {
            return g().a(aomfVar);
        } catch (aoob e) {
            String valueOf = String.valueOf(this.a.a().a.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final Class b() {
        return this.b;
    }

    public final Object c(aomf aomfVar) {
        try {
            return h(this.a.b(aomfVar));
        } catch (aoob e) {
            String valueOf = String.valueOf(this.a.a.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    public final Object d(aooy aooyVar) {
        String valueOf = String.valueOf(this.a.a.getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.a.a.isInstance(aooyVar)) {
            return h(aooyVar);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String e() {
        return this.a.d();
    }

    public final void f(aomf aomfVar) {
        try {
            aooy a = g().a(aomfVar);
            aone createBuilder = anoc.a.createBuilder();
            String e = e();
            createBuilder.copyOnWrite();
            ((anoc) createBuilder.instance).b = e;
            aomf byteString = a.toByteString();
            createBuilder.copyOnWrite();
            anoc anocVar = (anoc) createBuilder.instance;
            byteString.getClass();
            anocVar.c = byteString;
            int h = this.a.h();
            createBuilder.copyOnWrite();
            ((anoc) createBuilder.instance).d = h - 2;
        } catch (aoob e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }
}
