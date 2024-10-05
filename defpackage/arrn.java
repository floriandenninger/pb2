package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arrn extends aonm implements aooz {
    public static final arrn a;
    private static volatile aopf f;
    public arnd b;
    public arrl c;
    public avxs d;
    private int g;
    private aota h;
    private aulq i;
    private byte j = 2;
    public aomf e = aomf.b;

    static {
        arrn arrnVar = new arrn();
        a = arrnVar;
        aonm.registerDefaultInstance(arrn.class, arrnVar);
    }

    private arrn() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0006", new Object[]{"g", "b", "c", "d", "h", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arrn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arrn.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
