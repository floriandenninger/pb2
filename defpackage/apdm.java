package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdm extends aonm implements aooz {
    public static final apdm a;
    private static volatile aopf g;
    public boolean b;
    public boolean c;
    public boolean d;
    public aony e = aonm.emptyProtobufList();
    public boolean f;
    private int h;

    static {
        apdm apdmVar = new apdm();
        a = apdmVar;
        aonm.registerDefaultInstance(apdm.class, apdmVar);
    }

    private apdm() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u0010\u0005\u0000\u0001\u0000\u0003ဇ\u0002\u000bဇ\t\rဇ\u000b\u000e\u001a\u0010ဇ\r", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apdm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apdm.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
