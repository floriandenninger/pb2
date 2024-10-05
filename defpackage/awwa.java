package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awwa extends aonm implements aooz {
    public static final awwa a;
    private static volatile aopf k;
    public int b;
    public aoot c = aoot.a;
    public aoot d = aoot.a;
    public aoot e = aoot.a;
    public aoot f = aoot.a;
    public aoot g = aoot.a;
    public aoot h = aoot.a;
    public aoot i = aoot.a;
    public int j;

    static {
        awwa awwaVar = new awwa();
        a = awwaVar;
        aonm.registerDefaultInstance(awwa.class, awwaVar);
    }

    private awwa() {
        emptyProtobufList();
    }

    public final aoot a() {
        aoot aootVar = this.g;
        if (!aootVar.b) {
            this.g = aootVar.a();
        }
        return this.g;
    }

    public final aoot b() {
        aoot aootVar = this.i;
        if (!aootVar.b) {
            this.i = aootVar.a();
        }
        return this.i;
    }

    public final aoot c() {
        aoot aootVar = this.c;
        if (!aootVar.b) {
            this.c = aootVar.a();
        }
        return this.c;
    }

    public final aoot d() {
        aoot aootVar = this.e;
        if (!aootVar.b) {
            this.e = aootVar.a();
        }
        return this.e;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0006\r\b\u0007\u0000\u0000\u00062\u00072\b2\t2\n2\u000b2\f2\rင\u0000", new Object[]{"b", "c", awvv.a, "d", awvy.a, "e", awvw.a, "f", awvz.a, "g", awvt.a, "h", awvx.a, "i", awvu.a, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new awwa();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (awwa.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final aoot e() {
        aoot aootVar = this.h;
        if (!aootVar.b) {
            this.h = aootVar.a();
        }
        return this.h;
    }

    public final aoot f() {
        aoot aootVar = this.d;
        if (!aootVar.b) {
            this.d = aootVar.a();
        }
        return this.d;
    }

    public final aoot g() {
        aoot aootVar = this.f;
        if (!aootVar.b) {
            this.f = aootVar.a();
        }
        return this.f;
    }
}
