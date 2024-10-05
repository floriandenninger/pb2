package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awux extends aonm implements aooz {
    public static final awux a;
    private static volatile aopf f;
    public int b;
    public awuy d;
    public aoot e = aoot.a;
    public String c = "";

    static {
        awux awuxVar = new awux();
        a = awuxVar;
        aonm.registerDefaultInstance(awux.class, awuxVar);
    }

    private awux() {
    }

    public final aoot a() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u00032", new Object[]{"b", "c", "d", "e", awuw.a});
            case NEW_MUTABLE_INSTANCE:
                return new awux();
            case NEW_BUILDER:
                return new aone((char[][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awux.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
