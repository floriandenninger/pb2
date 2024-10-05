package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awyp extends aonm implements aooz {
    public static final awyp a;
    private static volatile aopf f;
    public int b;
    public Object d;
    public int c = 0;
    private byte g = 2;
    public String e = "";

    static {
        awyp awypVar = new awyp();
        a = awypVar;
        aonm.registerDefaultInstance(awyp.class, awypVar);
    }

    private awyp() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002့\u0000\u0003ဴ\u0000\u0004်\u0000\u0005ျ\u0000\u0006ᐼ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"d", "c", "b", "e", anrt.class, awyf.class, awyo.class});
            case NEW_MUTABLE_INSTANCE:
                return new awyp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awyp.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
