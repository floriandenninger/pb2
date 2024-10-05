package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmp extends aonm implements aooz {
    public static final atmp a;
    private static volatile aopf b;
    private int c;
    private auda d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private apxf j;
    private apxf k;
    private aqyg l;
    private aqyg m;
    private aota n;
    private byte o = 2;

    static {
        atmp atmpVar = new atmp();
        a = atmpVar;
        aonm.registerDefaultInstance(atmp.class, atmpVar);
    }

    private atmp() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0003\u000f\u000b\u0000\u0000\u000b\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\t\tᐉ\n\u000bᐉ\r\rᐉ\u000b\u000eᐉ\u0001\u000fᐉ\u0004", new Object[]{"c", "e", "g", "h", "i", "j", "k", "l", "n", "m", "d", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atmp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atmp.class) {
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
