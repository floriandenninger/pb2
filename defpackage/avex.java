package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avex extends aonm implements aooz {
    public static final avex a;
    public static final aonk b;
    private static volatile aopf g;
    public boolean c;
    public aony d = aonm.emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony f = aonm.emptyProtobufList();
    private int h;

    static {
        avex avexVar = new avex();
        a = avexVar;
        aonm.registerDefaultInstance(avex.class, avexVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, avexVar, avexVar, null, 368511790, aoqn.MESSAGE, avex.class);
    }

    private avex() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001a\u0004\u001a\u0005\u001b", new Object[]{"h", "c", "d", "f", "e", aoms.class});
            case NEW_MUTABLE_INSTANCE:
                return new avex();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avex.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
