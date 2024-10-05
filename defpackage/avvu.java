package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvu extends aonh implements aoni {
    public static final avvu a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private byte f = 2;

    static {
        avvu avvuVar = new avvu();
        a = avvuVar;
        aonm.registerDefaultInstance(avvu.class, avvuVar);
    }

    private avvu() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001GH\u0002\u0000\u0000\u0002Gᐉ\u0005Hᐉ\u0007", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avvu();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avvu.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
