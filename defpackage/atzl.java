package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzl extends aonm implements aooz {
    public static final atzl a;
    private static volatile aopf d;
    public int b;
    public int c;
    private int e;
    private aqyg f;
    private aota g;
    private byte h = 2;

    static {
        atzl atzlVar = new atzl();
        a = atzlVar;
        aonm.registerDefaultInstance(atzl.class, atzlVar);
    }

    private atzl() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ᐉ\u0003\u0005င\u0002", new Object[]{"e", "f", "b", "g", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atzl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atzl.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
