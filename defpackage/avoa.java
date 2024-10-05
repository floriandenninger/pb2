package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avoa extends aonm implements aooz {
    public static final avoa a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private atdf m;
    private apxf n;
    private apjt o;
    private apjt p;
    private apjt q;
    private aota r;
    private byte s = 2;

    static {
        avoa avoaVar = new avoa();
        a = avoaVar;
        aonm.registerDefaultInstance(avoa.class, avoaVar);
    }

    private avoa() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003\u0019\u000f\u0000\u0000\u000f\u0003ᐉ\b\u0004ᐉ\t\u0005ᐉ\n\u0006ᐉ\u000b\u0007ᐉ\f\bᐉ\r\tᐉ\u000e\u000bᐉ\u0016\rᐉ\u0010\u000eᐉ\u0004\u000fᐉ\u0005\u0012ᐉ\u0006\u0017ᐉ\u0011\u0018ᐉ\u0013\u0019ᐉ\u0007", new Object[]{"c", "h", "i", "j", "k", "l", "m", "n", "r", "o", "d", "e", "f", "p", "q", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avoa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avoa.class) {
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
