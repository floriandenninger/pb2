package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgn extends aonh implements aoni {
    private static final sgn a;
    private static volatile aopf b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        sgn sgnVar = new sgn();
        a = sgnVar;
        aonm.registerDefaultInstance(sgn.class, sgnVar);
    }

    private sgn() {
    }

    public static sgn c() {
        return a;
    }

    public sgm a() {
        sgm a2 = sgm.a(this.d);
        return a2 == null ? sgm.UNKNOWN : a2;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", sgm.b()});
            case NEW_MUTABLE_INSTANCE:
                return new sgn();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (sgn.class) {
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
