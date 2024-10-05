package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucx extends aonm implements aooz {
    public static final ucx a;
    private static volatile aopf c;
    public aony b = aonm.emptyProtobufList();

    static {
        ucx ucxVar = new ucx();
        a = ucxVar;
        aonm.registerDefaultInstance(ucx.class, ucxVar);
    }

    private ucx() {
    }

    public final void a() {
        aony aonyVar = this.b;
        if (aonyVar.c()) {
            return;
        }
        this.b = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new ucx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ucx.class) {
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
