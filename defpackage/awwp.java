package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awwp extends aonm implements aooz {
    public static final awwp a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aoot d = aoot.a;
    public aoot e = aoot.a;

    static {
        awwp awwpVar = new awwp();
        a = awwpVar;
        aonm.registerDefaultInstance(awwp.class, awwpVar);
    }

    private awwp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001င\u0000\u00022\u00032", new Object[]{"b", "c", "d", awwn.a, "e", awwo.a});
            case NEW_MUTABLE_INSTANCE:
                return new awwp();
            case NEW_BUILDER:
                return new aone((short[][]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awwp.class) {
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
