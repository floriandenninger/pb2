package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcn extends aonm implements aooz {
    public static final arcn a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private apxf i;
    private aqyg j;
    private atdf k;
    private aota l;
    private aqyg m;
    private byte n = 2;

    static {
        arcn arcnVar = new arcn();
        a = arcnVar;
        aonm.registerDefaultInstance(arcn.class, arcnVar);
    }

    private arcn() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0003\u0010\n\u0000\u0000\n\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\fᐉ\u000b\u000eᐉ\r\u000fᐉ\u0004\u0010ᐉ\t", new Object[]{"c", "d", "e", "g", "h", "i", "j", "l", "m", "f", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new arcn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arcn.class) {
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
