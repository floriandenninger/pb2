package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awcv extends aonm implements aooz {
    public static final awcv a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public apxf d;
    public awcj f;
    public awct g;
    public awcq h;
    public boolean i;
    public aqyg j;
    private atdf m;
    private aota n;
    private byte o = 2;
    public aony e = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        awcv awcvVar = new awcv();
        a = awcvVar;
        aonm.registerDefaultInstance(awcv.class, awcvVar);
    }

    private awcv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003Л\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဇ\u0006\bᐉ\u0007\tᐉ\t\nည\n\u000bᐉ\b", new Object[]{"b", "c", "d", "e", aqyg.class, "f", "g", "h", "i", "j", "n", "k", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new awcv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (awcv.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
