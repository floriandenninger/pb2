package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvj extends aonm implements aooz {
    public static final aqvj a;
    private static volatile aopf c;
    public aoot b = aoot.a;

    static {
        aqvj aqvjVar = new aqvj();
        a = aqvjVar;
        aonm.registerDefaultInstance(aqvj.class, aqvjVar);
    }

    private aqvj() {
    }

    public final boolean a(long j) {
        return this.b.containsKey(Long.valueOf(j));
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aqvi.a});
            case NEW_MUTABLE_INSTANCE:
                return new aqvj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aqvj.class) {
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
