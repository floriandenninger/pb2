package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvb extends aonm implements aooz {
    public static final avvb a;
    private static volatile aopf d;
    public aony b = aonm.emptyProtobufList();
    public int c;
    private int e;

    static {
        avvb avvbVar = new avvb();
        a = avvbVar;
        aonm.registerDefaultInstance(avvb.class, avvbVar);
    }

    private avvb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000", new Object[]{"e", "b", "c", avts.j});
            case NEW_MUTABLE_INSTANCE:
                return new avvb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avvb.class) {
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
