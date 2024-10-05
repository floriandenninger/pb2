package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozp extends aonm implements aooz {
    public static final aozp a;
    private static volatile aopf c;
    private int d;
    private aulq e;
    private aota f;
    private byte g = 2;
    public aony b = emptyProtobufList();

    static {
        aozp aozpVar = new aozp();
        a = aozpVar;
        aonm.registerDefaultInstance(aozp.class, aozpVar);
    }

    private aozp() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0001\u0003\u0003Л\u0005ᐉ\u0002\u0006ᐉ\u0000", new Object[]{"d", "b", aozq.class, "f", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aozp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aozp.class) {
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
