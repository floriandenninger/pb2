package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arap extends aonm implements aooz {
    public static final arap a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private avrx l;
    private atdf m;
    private arar n;
    private arao o;
    private aota p;
    private byte q = 2;

    static {
        arap arapVar = new arap();
        a = arapVar;
        aonm.registerDefaultInstance(arap.class, arapVar);
    }

    private arap() {
        emptyProtobufList();
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
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0003\u0015\r\u0000\u0000\r\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0014ᐉ\u0011\u0015ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new arap();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arap.class) {
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
