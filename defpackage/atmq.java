package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmq extends aonm implements aooz {
    public static final atmq a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private apkd n;
    private avrx o;
    private aota p;
    private byte q = 2;

    static {
        atmq atmqVar = new atmq();
        a = atmqVar;
        aonm.registerDefaultInstance(atmq.class, atmqVar);
    }

    private atmq() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0004\u0012\r\u0000\u0000\r\u0004ᐉ\u0004\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\n\tᐉ\u000b\nᐉ\u0001\u000bᐉ\u0003\fᐉ\u0005\u000eᐉ\r\u000fᐉ\u000e\u0011ᐉ\t\u0012ᐉ\f", new Object[]{"c", "f", "h", "i", "j", "l", "m", "d", "e", "g", "o", "p", "k", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new atmq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atmq.class) {
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
