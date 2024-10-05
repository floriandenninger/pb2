package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andh extends aonm implements aooz {
    public static final andh a;
    private static volatile aopf e;
    public int b;
    public andi c;
    public aonu d;

    static {
        andh andhVar = new andh();
        a = andhVar;
        aonm.registerDefaultInstance(andh.class, andhVar);
    }

    private andh() {
        emptyProtobufList();
        this.d = emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0004\u001e", new Object[]{"b", "c", "d", andg.b()});
            case NEW_MUTABLE_INSTANCE:
                return new andh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (andh.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
