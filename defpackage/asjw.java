package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asjw extends aonm implements aooz {
    public static final asjw a;
    private static volatile aopf e;
    public int b;
    public aqyg d;
    private aqyg f;
    private aota g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        asjw asjwVar = new asjw();
        a = asjwVar;
        aonm.registerDefaultInstance(asjw.class, asjwVar);
    }

    private asjw() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0004ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"b", "c", asjv.class, "f", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new asjw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asjw.class) {
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
