package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class astl extends aonm implements aooz {
    public static final astl a;
    private static volatile aopf b;
    private int c;
    private auda d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private apxf i;
    private aota j;
    private byte k = 2;

    static {
        astl astlVar = new astl();
        a = astlVar;
        aonm.registerDefaultInstance(astl.class, astlVar);
    }

    private astl() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\tᐉ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "j", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new astl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (astl.class) {
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
