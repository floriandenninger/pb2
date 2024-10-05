package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awtn extends aonm implements aooz {
    public static final awtn a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        awtn awtnVar = new awtn();
        a = awtnVar;
        aonm.registerDefaultInstance(awtn.class, awtnVar);
    }

    private awtn() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဈ\u0002", new Object[]{"d", "c", "b", awth.class, awta.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awtn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awtn.class) {
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
