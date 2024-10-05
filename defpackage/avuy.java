package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avuy extends aonm implements aooz {
    public static final avuy a;
    private static volatile aopf h;
    public int b;
    public avgg e;
    public aqyg f;
    private aota i;
    private byte j = 2;
    public String c = "";
    public String d = "";
    public aomf g = aomf.b;

    static {
        avuy avuyVar = new avuy();
        a = avuyVar;
        aonm.registerDefaultInstance(avuy.class, avuyVar);
    }

    private avuy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ည\u0006", new Object[]{"b", "c", "d", "e", "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new avuy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (avuy.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
