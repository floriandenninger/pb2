package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aurx extends aonm implements aooz {
    public static final aurx a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private ausc j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private byte n = 2;

    static {
        aurx aurxVar = new aurx();
        a = aurxVar;
        aonm.registerDefaultInstance(aurx.class, aurxVar);
    }

    private aurx() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001ᐉ\u0000\u0003ᐉ\u0005\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bᐉ\n\tᐉ\u000b\nᐉ\f\u000bᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aurx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aurx.class) {
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
