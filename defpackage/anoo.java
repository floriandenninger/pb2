package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anoo extends aonm implements aooz {
    public static final anoo a;
    private static volatile aopf e;
    public anop b;
    public int c;
    public aomf d = aomf.b;

    static {
        anoo anooVar = new anoo();
        a = anooVar;
        aonm.registerDefaultInstance(anoo.class, anooVar);
    }

    private anoo() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\n", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new anoo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (anoo.class) {
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
