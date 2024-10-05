package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atkx extends aonm implements aooz {
    public static final atkx a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aulq i;
    private aulq j;
    private apxf k;
    private apxf l;
    private aota m;
    private aulq n;
    private byte o = 2;

    static {
        atkx atkxVar = new atkx();
        a = atkxVar;
        aonm.registerDefaultInstance(atkx.class, atkxVar);
    }

    private atkx() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\u0010\u000b\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\t\u0007ᐉ\u000b\u000bᐉ\u000e\fᐉ\n\u000fᐉ\u0004\u0010ᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "i", "k", "m", "n", "l", "h", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atkx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atkx.class) {
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
