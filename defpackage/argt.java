package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argt extends aonm implements aooz {
    public static final argt a;
    private static volatile aopf c;
    public int b;
    private ausd d;

    static {
        argt argtVar = new argt();
        a = argtVar;
        aonm.registerDefaultInstance(argt.class, argtVar);
    }

    private argt() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue8fb⼎\ue8fb⼎\u0001\u0000\u0000\u0000\ue8fb⼎ဉ\u0000", new Object[]{"b", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new argt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (argt.class) {
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
