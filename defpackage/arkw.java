package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arkw extends aonm implements aooz {
    public static final arkw a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public appn d;
    public apxf e;
    public aomf f;
    private aota h;
    private aqzg i;
    private byte j = 2;

    static {
        arkw arkwVar = new arkw();
        a = arkwVar;
        aonm.registerDefaultInstance(arkw.class, arkwVar);
    }

    private arkw() {
        emptyProtobufList();
        this.f = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0006ᐉ\u0003\u0007ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arkw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arkw.class) {
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
