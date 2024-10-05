package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqy extends aonm implements aooz {
    public static final avqy a;
    private static volatile aopf b;
    private int c;
    private avqz d;
    private avqz e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private aulq l;
    private aota m;
    private avqz n;
    private avqz o;
    private byte p = 2;

    static {
        avqy avqyVar = new avqy();
        a = avqyVar;
        aonm.registerDefaultInstance(avqy.class, avqyVar);
    }

    private avqy() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0000\f\u0001ᐉ\u000f\u0002ᐉ\u0010\u0003ᐉ\u0003\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\u000b\bᐉ\u000e\tᐉ\u0000\nᐉ\u0001\rᐉ\u0005\u000eᐉ\u0006\u0010ᐉ\f", new Object[]{"c", "n", "o", "f", "i", "j", "k", "m", "d", "e", "g", "h", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avqy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avqy.class) {
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
