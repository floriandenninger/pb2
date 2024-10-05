package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aruc extends aonm implements aooz {
    public static final aruc a;
    private static volatile aopf d;
    public arnd b;
    private int e;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        aruc arucVar = new aruc();
        a = arucVar;
        aonm.registerDefaultInstance(aruc.class, arucVar);
    }

    private aruc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0003Л", new Object[]{"e", "b", "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aruc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aruc.class) {
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
