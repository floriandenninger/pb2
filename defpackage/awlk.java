package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awlk extends aonm implements aooz {
    public static final awlk a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        awlk awlkVar = new awlk();
        a = awlkVar;
        aonm.registerDefaultInstance(awlk.class, awlkVar);
    }

    private awlk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0004\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0004ြ\u0000", new Object[]{"c", "b", awkj.class, awkw.class});
            case NEW_MUTABLE_INSTANCE:
                return new awlk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awlk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
