package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aolj {
    public String a;
    public Map b;
    public Map c;

    public aolj() {
        a("", new EnumMap(aolf.class));
    }

    public final void a(String str, EnumMap enumMap) {
        this.a = str;
        this.b = enumMap;
        this.c = new EnumMap(aolf.class);
    }

    public aolj(aolk aolkVar) {
        this.a = aolkVar.a;
        this.b = new EnumMap(aolkVar.b);
        this.c = new EnumMap(aolkVar.c);
    }
}
