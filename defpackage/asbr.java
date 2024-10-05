package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbr extends aonm implements aooz {
    public static final asbr a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public long g;
    private aota i;
    private aqzg j;
    private byte k = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        asbr asbrVar = new asbr();
        a = asbrVar;
        aonm.registerDefaultInstance(asbr.class, asbrVar);
    }

    private asbr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0002\u0004\u0001ᐉ\u0000\u0003\u001b\u0005Л\u0006ᐉ\u0001\u0007ည\u0002\bဂ\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", asus.class, "e", apxf.class, "i", "f", "g", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asbr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asbr.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
