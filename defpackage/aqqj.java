package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqqj extends aonm implements aooz {
    public static final aqqj a;
    private static volatile aopf c;
    public aony b = emptyProtobufList();

    static {
        aqqj aqqjVar = new aqqj();
        a = aqqjVar;
        aonm.registerDefaultInstance(aqqj.class, aqqjVar);
    }

    private aqqj() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aqqg.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqqj();
            case NEW_BUILDER:
                return new aone((float[][][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aqqj.class) {
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
