package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswg extends aonm implements aooz {
    public static final aswg a;
    private static volatile aopf g;
    public aqyg b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public boolean f;
    private int h;
    private aqyg i;
    private byte j = 2;

    static {
        aswg aswgVar = new aswg();
        a = aswgVar;
        aonm.registerDefaultInstance(aswg.class, aswgVar);
    }

    private aswg() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0005\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဇ\u0007", new Object[]{"h", "b", "c", "d", "i", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aswg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aswg.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
