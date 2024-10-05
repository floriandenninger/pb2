package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyx extends aonm implements aooz {
    public static final awyx a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();

    static {
        awyx awyxVar = new awyx();
        a = awyxVar;
        aonm.registerDefaultInstance(awyx.class, awyxVar);
    }

    private awyx() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"b", "c", "d", awyv.class});
            case NEW_MUTABLE_INSTANCE:
                return new awyx();
            case NEW_BUILDER:
                return new aone((short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awyx.class) {
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
