package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avjn extends aonm implements aooz {
    public static final avjn a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public boolean d;

    static {
        avjn avjnVar = new avjn();
        a = avjnVar;
        aonm.registerDefaultInstance(avjn.class, avjnVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, avjnVar, avjnVar, null, 330586086, aoqn.MESSAGE, avjn.class);
    }

    private avjn() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0002", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avjn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avjn.class) {
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
