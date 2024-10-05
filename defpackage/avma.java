package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avma extends aonm implements aooz {
    public static final avma a;
    private static volatile aopf c;
    public apmh b;
    private int d;
    private aqyg e;
    private aota f;
    private byte g = 2;

    static {
        avma avmaVar = new avma();
        a = avmaVar;
        aonm.registerDefaultInstance(avma.class, avmaVar);
    }

    private avma() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002ᐉ\u0001\u0004ᐉ\u0004\u0005ᐉ\u0005", new Object[]{"d", "e", "b", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avma();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (avma.class) {
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
