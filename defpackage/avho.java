package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avho extends aonm implements aooz {
    public static final avho a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aulq g;
    private apxf h;
    private apxf i;
    private byte j = 2;

    static {
        avho avhoVar = new avho();
        a = avhoVar;
        aonm.registerDefaultInstance(avho.class, avhoVar);
    }

    private avho() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0004\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\u0003", new Object[]{"c", "d", "e", "g", "h", "i", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avho();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avho.class) {
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
