package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwj extends aonm implements aooz {
    public static final aqwj a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private apmh h;
    private aota i;
    private byte j = 2;

    static {
        aqwj aqwjVar = new aqwj();
        a = aqwjVar;
        aonm.registerDefaultInstance(aqwj.class, aqwjVar);
    }

    private aqwj() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0004ᐉ\u0000\u0005ᐉ\b\u0007ᐉ\u0007\bᐉ\u0002\nᐉ\u0005", new Object[]{"c", "e", "d", "i", "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqwj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqwj.class) {
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
