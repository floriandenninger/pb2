package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arco extends aonm implements aooz {
    public static final arco a;
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
    private apxf l;
    private apkd m;
    private apkd n;
    private apkd o;
    private aota p;
    private apmh q;
    private byte r = 2;

    static {
        arco arcoVar = new arco();
        a = arcoVar;
        aonm.registerDefaultInstance(arco.class, arcoVar);
    }

    private arco() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0018\u000e\u0000\u0000\u000e\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\u000b\u000eᐉ\u0010\u0012ᐉ\t\u0013ᐉ\r\u0014ᐉ\f\u0015ᐉ\u000e\u0016ᐉ\u0003\u0018ᐉ\u0012", new Object[]{"c", "d", "f", "g", "h", "i", "k", "l", "p", "j", "n", "m", "o", "e", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new arco();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arco.class) {
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
