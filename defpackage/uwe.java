package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uwe extends aonm implements aooz {
    public static final uwe a;
    private static volatile aopf c;
    public aoot b = aoot.a;

    static {
        uwe uweVar = new uwe();
        a = uweVar;
        aonm.registerDefaultInstance(uwe.class, uweVar);
    }

    private uwe() {
    }

    public final aoot a() {
        aoot aootVar = this.b;
        if (!aootVar.b) {
            this.b = aootVar.a();
        }
        return this.b;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", uwd.a});
            case NEW_MUTABLE_INSTANCE:
                return new uwe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (uwe.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
