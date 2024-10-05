package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arom extends aonm implements aooz {
    public static final arom a;
    private static volatile aopf e;
    public arnd b;
    public int c;
    private int f;
    private byte g = 2;
    public aony d = emptyProtobufList();

    static {
        arom aromVar = new arom();
        a = aromVar;
        aonm.registerDefaultInstance(arom.class, aromVar);
    }

    private arom() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0003ဌ\u0001\u0005\u001b", new Object[]{"f", "b", "c", aujj.d, "d", aron.class});
            case NEW_MUTABLE_INSTANCE:
                return new arom();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arom.class) {
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
